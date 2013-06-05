package org.correttouml.uml.diagrams.statediagram.actions;

import java.util.ArrayList;
import java.util.List;

import org.correttouml.grammars.stateMachineActions.Model;
import org.correttouml.grammars.stateMachineActions.Parameters;
import org.correttouml.uml.diagrams.classdiagram.AssociationInstance;
import org.correttouml.uml.diagrams.classdiagram.Object;
import org.correttouml.uml.diagrams.classdiagram.Operation;
import org.correttouml.uml.diagrams.classdiagram.Signal;
import org.correttouml.uml.diagrams.expressions.Assignment;
import org.correttouml.uml.diagrams.expressions.AssignmentContext;
import org.correttouml.uml.diagrams.sequencediagram.SequenceDiagram;
import org.correttouml.uml.diagrams.statediagram.Transition;
import org.correttouml.uml.helpers.StDActionsParser;

public class ActionFactory {
	
	public static List<Action> getInstance(String action, Transition transition, Object object){
		
		ArrayList<Action> actions=new ArrayList<Action>();
		
		Model m=StDActionsParser.parse(action);
		
		do{
			org.correttouml.grammars.stateMachineActions.Action curr=m.getAction();
			try {
				actions.add(getAction(curr, transition, object));
			} catch (Exception e) {
				System.err.println("Error for action: " + action);
				e.printStackTrace();
			}
		}while((m=m.getActions())!=null);
		
		return actions;
	}
	
	private static Action getAction(org.correttouml.grammars.stateMachineActions.Action curr, Transition transition, Object object) throws Exception {
		if (curr.getEventAction() != null) {
			if (curr.getEventAction().getEvent().getEventExtension()
					.equals("call")) {
				return getCallAction(curr, transition, object);
			}
			if (curr.getEventAction().getEvent().getEventExtension()
					.equals("sig")) {
				return getSignalAction(curr, transition);
			}
			if (curr.getEventAction().getEvent().getEventExtension()
					.equals("start")) {
				return getSequenceDiagramAction(curr, transition);
			}
		}
		if (curr.getAssignment() != null) {
			return getAssignmentAction(curr.getAssignment(), transition);
		}
		throw new Exception("Action type not supported");
	}

	private static Action getAssignmentAction(org.correttouml.grammars.stateMachineActions.Assignment assignment, AssignmentContext context) {
		Assignment a= new Assignment(assignment, context);
		return new AssignmentAction(a);
	}
	
	private static CallAction getCallAction(org.correttouml.grammars.stateMachineActions.Action curr, Transition transition, Object object) throws Exception{
		String opname = curr.getEventAction().getEvent().getEventName();

		// the association end where we are sending the invocation
		// TODO[improvement] association ends must have unique names
		String linkName = curr.getEventAction().getLink().getLinkName();
		String associationEnd = curr.getEventAction().getLink().getAssociationEnd();

		// let's the guy we are looking for
		Object objToInvoke = null;
		for (AssociationInstance ai : object.getAssociationInstances()) {
			if (ai.getAssociation().getName().equals(linkName) && ai.hasMemberEnd(associationEnd) && !ai.getMemberEnd(associationEnd).equals(object)) {
				objToInvoke = ai.getMemberEnd(associationEnd);
			}
		}
		if (objToInvoke == null) throw new Exception("Object to invoke not found");


		// let's find the operation we are willing to invoke
		Operation invoked_op = objToInvoke.getOwningClass().getOperation(opname);

		// Check if everything is ok, please
		CallAction action = null;
		if (invoked_op != null) action = new CallAction(objToInvoke, invoked_op);
		// ops, something went wrong
		else throw new Exception("Operation not found");

		// Get the parameters of the invocation
		Parameters next = curr.getEventAction().getEvent().getParameters();
		do {
			if (next == null) break; // no parameters
			String param_name = curr.getEventAction().getEvent().getParameters().getParam();
			action.addCallActionParameter(new CallActionParameter(param_name, action, transition.getStateDiagram()));
			next = next.getParameters();
		} while (next != null);

		return action;
	}
	
	private static SignalAction getSignalAction(org.correttouml.grammars.stateMachineActions.Action action, Transition transition){
		try {
			String signame=action.getEventAction().getEvent().getEventName();
			//TODO[mottalrd][improvement] wtf you are doing here? why we need the transition to get this info?
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
			String sdname=action.getEventAction().getEvent().getEventName();
			//TODO[mottalrd][improvement] wtf you are doing here? why we need the transition to get this info?
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


