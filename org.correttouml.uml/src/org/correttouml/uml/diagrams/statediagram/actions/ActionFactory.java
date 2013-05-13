package org.correttouml.uml.diagrams.statediagram.actions;

import java.util.ArrayList;
import java.util.List;

import org.correttouml.uml.diagrams.classdiagram.Class;
import org.correttouml.uml.diagrams.classdiagram.Operation;
import org.correttouml.uml.diagrams.classdiagram.Signal;
import org.correttouml.uml.diagrams.expressions.Assignment;
import org.correttouml.uml.diagrams.expressions.AssignmentContext;
import org.correttouml.uml.diagrams.sequencediagram.SequenceDiagram;
import org.correttouml.uml.diagrams.statediagram.Transition;
import org.correttouml.uml.helpers.StDActionsParser;

import org.correttouml.grammars.stateMachineActions.*;

public class ActionFactory {
	
	public static List<Action> getInstance(String action, org.eclipse.uml2.uml.Transition uml_transition){
		
		ArrayList<Action> actions=new ArrayList<Action>();
		
		Model m=StDActionsParser.parse(action);
		
		do{
			org.correttouml.grammars.stateMachineActions.Action curr=m.getAction();
			actions.add(getAction(curr, uml_transition));
		}while((m=m.getActions())!=null);
		
		return actions;
	}
	
	private static Action getAction(org.correttouml.grammars.stateMachineActions.Action curr, org.eclipse.uml2.uml.Transition uml_transition) {
		try {
			if(curr.getEventAction() != null){
				if(curr.getEventAction().getEventExtension().equals("call")){
					return getCallAction(curr, new Transition(uml_transition));
				}
				if(curr.getEventAction().getEventExtension().equals("sig")){
					return getSignalAction(curr, new Transition(uml_transition));	
				}
				if(curr.getEventAction().getEventExtension().equals("start")){
					return getSequenceDiagramAction(curr,new Transition(uml_transition));
				}
			}
			if(curr.getAssignment() != null){
				return getAssignmentAction(curr.getAssignment(), new Transition(uml_transition));	
			}
			throw new Exception("Action not supported");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static Action getAssignmentAction(org.correttouml.grammars.stateMachineActions.Assignment assignment, AssignmentContext context) {
		Assignment a= new Assignment(assignment, context);
		return new AssignmentAction(a);
	}
	
	private static CallAction getCallAction(org.correttouml.grammars.stateMachineActions.Action curr, Transition transition){
		try {
			String opname=curr.getEventAction().getEventName();
			Operation invoked_op=null;
			//Find the operation we are invoking 
			for(Class c: transition.getStateDiagram().getOwningClass().getAssociatedClasses()){
				for(Operation op: c.getOperations()){
					if(op.getName().equals(opname)) invoked_op=op;
				}
			}
			
			//Check if everything is ok, please
			CallAction action=null;
			if(invoked_op!=null) action=new CallAction(invoked_op);
			//ops, something went wrong
			else throw new Exception("Operation not found Exception for call action in transition " + transition.getUMLId());
			
			//Get the parameters of the invocation
			Parameters next=curr.getEventAction().getParameters();
			do{
				if(next==null) break; //no parameters
				String param_name=curr.getEventAction().getParameters().getParam();
				action.addCallActionParameter(new CallActionParameter(param_name, action, transition.getStateDiagram()));
				next=next.getParameters();
			}while(next!=null);
			
			return action;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static SignalAction getSignalAction(org.correttouml.grammars.stateMachineActions.Action action, Transition transition){
		try {
			String signame=action.getEventAction().getEventName();
			for(Signal s: transition.getStateDiagram().getMadesModel().getClassdiagram().getSignals()){
				if(s.getName().equals(signame)) return new SignalAction(s);
			}
			throw new Exception("Signal not found Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static SequenceDiagramAction getSequenceDiagramAction(org.correttouml.grammars.stateMachineActions.Action action, Transition transition){
		try{
			String sdname=action.getEventAction().getEventName();
			for(SequenceDiagram sd: transition.getStateDiagram().getMadesModel().getSequenceDiagrams()){
				if(sd.getName().equals(sdname)) return new SequenceDiagramAction(sd);
			}
			throw new Exception("Sequence diagram not found Exception");
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}


