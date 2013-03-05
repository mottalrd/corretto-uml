package org.correttouml.uml2zot.semantics.sequencediagram;


import java.util.HashSet;
import java.util.Set;

import org.correttouml.uml.diagrams.classdiagram.Object;
import org.correttouml.uml.diagrams.iod.IOD;
import org.correttouml.uml.diagrams.iod.InterruptibleRegion;
import org.correttouml.uml.diagrams.iod.Node;
import org.correttouml.uml.diagrams.iod.SequenceDiagramNode;
import org.correttouml.uml.diagrams.sequencediagram.ExecutionOccurrence;
import org.correttouml.uml.diagrams.sequencediagram.Lifeline;
import org.correttouml.uml.diagrams.sequencediagram.Message;
import org.correttouml.uml.diagrams.sequencediagram.SequenceDiagram;
import org.correttouml.uml.diagrams.sequencediagram.SequenceDiagramParameter;
import org.correttouml.uml.diagrams.statediagram.StateDiagram;
import org.correttouml.uml.diagrams.statediagram.Transition;
import org.correttouml.uml.diagrams.statediagram.actions.Action;
import org.correttouml.uml.diagrams.statediagram.actions.SequenceDiagramAction;
import org.correttouml.uml.diagrams.timeconstraints.TimeConstraint;
import org.correttouml.uml2zot.semantics.SMadesModel;
import org.correttouml.uml2zot.semantics.iod.SSequenceDiagramNode;
import org.correttouml.uml2zot.semantics.statediagram.STransition;
import org.correttouml.uml2zot.semantics.timeconstraints.STimeConstraint;
import org.correttouml.uml2zot.semantics.util.bool.And;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.bool.Iff;
import org.correttouml.uml2zot.semantics.util.bool.Implies;
import org.correttouml.uml2zot.semantics.util.bool.Not;
import org.correttouml.uml2zot.semantics.util.bool.Or;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;
import org.correttouml.uml2zot.semantics.util.trio.Since_ei;
import org.correttouml.uml2zot.semantics.util.trio.Until_ei;

public class SSequenceDiagram {

	private SequenceDiagram mades_sd;

	public SSequenceDiagram(SequenceDiagram mades_sd) {
		this.mades_sd = mades_sd;
	}
	
	public Predicate getPredicate(){
		return new Predicate("SD" + mades_sd.getName());
	}
	
	public Predicate getPredicateStart(){
		return new Predicate(this.mades_sd.getName()+"_START");
	}
	
	public Predicate getPredicateEnd(){
		return new Predicate(this.mades_sd.getName()+"_END");
	}
	
	public Predicate getPredicateStop(){
		return new Predicate(this.mades_sd.getName()+"_STOP");
	}

	public String getSemantics() {
		String sem = "";

		Predicate sd_start=this.getPredicateStart();
		Predicate sd_end=this.getPredicateEnd();
		Predicate sd_stop=this.getPredicateStop();
		Predicate sd_inside=this.getPredicate();
		
		// Inside sequence diagram definition
		sem = sem + new Iff(sd_inside, new Or(sd_start, new Since_ei(new And(new Not(sd_stop), new Not(sd_end)), sd_start))) + "\n";

		// Close world assumption semantics
		sem = sem + SMadesModel.printSeparatorSmall("SD CONNECTIONS SEMANTICS");
		sem = sem + this.getConnectionsSemantics(sd_start, sd_end);


		// Multiple sequence diagram semantics
		sem = sem + SMadesModel.printSeparatorSmall("MULTI SEQUENCE DIAGRAM INSTANCE SEMANTICS");
		sem = sem + new Implies(sd_start, new Until_ei(new Not(sd_start), new Or(sd_stop, sd_end)))+"\n";

		// Get start semantics
		sem = sem + SMadesModel.printSeparatorSmall("START SEMANTICS");
		for (Lifeline l : this.mades_sd.getLifelines()) {
			if(l.getEvents().size()>0){
				Predicate firstEvent=SInteractionFragmentFactory.getInstance(l.getEvents().get(0)).getPredicate();
				sem = sem + buildOrderingSemanticsLTEAxiom(sd_start, firstEvent, sd_stop) + "\n";
				sem = sem + buildOrderingSemanticsBackwardAxiom(sd_start, firstEvent,sd_stop) + "\n";
			}
		}

		// Get end semantics
		sem = sem + SMadesModel.printSeparatorSmall("END SEMANTICS");
		HashSet<Predicate> lastevents = new HashSet<Predicate>();
		for (Lifeline l : this.mades_sd.getLifelines()) {
			if(l.getEvents().size()>0){
				Predicate lastEvent=SInteractionFragmentFactory.getInstance(l.getEvents().get(l.getEvents().size()-1)).getPredicate();
				lastevents.add(lastEvent);
				sem = sem + buildOrderingSemanticsLTEAxiom(lastEvent, sd_end, sd_stop) + "\n";
				sem = sem + buildOrderingSemanticsBackwardAxiom(lastEvent, sd_end, sd_stop) + "\n";
			}
		}
		sem = sem + buildOrderingSemanticsSDEndAxiom(sd_end, lastevents) + "\n";

		// Get lifelines semantics
		sem = sem + SMadesModel.printSeparatorSmall("LIFELINES SEMANTICS");
		for (Lifeline l : this.mades_sd.getLifelines()) {
			sem = sem + new SLifeline(l).getSemantics();
		}

		// get messages semantics
		sem = sem + SMadesModel.printSeparatorSmall("MESSAGES SEMANTICS");
		for (Message m : this.mades_sd.getMessages()) {
			sem = sem + new SMessage(m).getSemantics();
		}
		
		// Get execution occurrences semantics
		sem = sem + SMadesModel.printSeparatorSmall("EXOCCS SEMANTICS");
		for (ExecutionOccurrence exocc : this.mades_sd.getExecutionOccurrences()) {
			sem = sem + new SExecutionOccurrence(exocc).getSemantics();
		}
		
		// get time constraint semantics
		sem = sem + SMadesModel.printSeparatorSmall("TIME CONSTRAINTS SEMANTICS");
		for (TimeConstraint t : mades_sd.getTimeConstraints()) {
			sem = sem + new STimeConstraint(t).getSemantics();
		}
		
		// get parameter semantics
		sem = sem + SMadesModel.printSeparatorSmall("SEQUENCE DIAGRAM PARAMETER SEMANTICS");
		for (SequenceDiagramParameter sdp : this.mades_sd.getSequenceDiagramParameters()) {
			sem = sem + new SSequenceDiagramParameter(sdp).getSemantics();
		}
		
//		TODO: Assignment semantics
//		// get assignment semantics
//		sem = sem + MadesModel.printSeparatorSmall("ASSIGNMENT SEMANTICS");
//		for (sequencediagram.Assignment a : this.getAssignments()) {
//			sem = sem + a.getSemantics();
//		}

		return sem;
	}

	//TODO: sdstop must be included in the connections semantics
	private String getConnectionsSemantics(Predicate sd_start, Predicate sd_end) {
		String sem="";
		
		/*
		 * Specify how the sd start/end predicates are connected
		 * with all the other diagrams that use them
		 * At the current time the sequence diagram start/end are connected
		 * to the IOD (through SD nodes) and to the StD (through actions in triggers)
		 */
		
		//Get all the actions
		Or condStart = new Or();
		Or condEnd = new Or();
        for (Object mades_object : this.mades_sd.getMadesModel().getClassdiagram().getObjects()) {
            for (StateDiagram std : mades_object.getOwningClass().getStateDiagrams()) {
                for(Transition t: std.getTransitions()){
                	if(t.hasAction()){
	                	Action act=t.getAction();
	                	if(act instanceof SequenceDiagramAction && ((SequenceDiagramAction) act).getSequenceDiagram().equals(this.mades_sd)){
	                		condStart.addFormulae(new STransition(t).getPredicate(mades_object));
	                	}
                	}
                }  
            }
        }
        
        //Get all the IOD nodes
        for(IOD iod: this.mades_sd.getMadesModel().getIODs()){
        	for(Node n: iod.getNodes()){
        		if(n instanceof SequenceDiagramNode){
        			SequenceDiagramNode sdnode=((SequenceDiagramNode) n);
        			if(sdnode.getSequenceDiagram().equals(this.mades_sd)){
            			condStart.addFormulae(new SSequenceDiagramNode((SequenceDiagramNode) n).getPredicateStart());
            			condEnd.addFormulae(new SSequenceDiagramNode((SequenceDiagramNode) n).getPredicateEnd());
        			}
        		}
        	}
        }
        
        Or condStop=new Or();
        //The stop is connected to the interruptible regions
        //TODO: connect to the transitions that use @sd.stop
        for(IOD iod:this.mades_sd.getMadesModel().getIODs()){
        	for(InterruptibleRegion ir: iod.getInterruptibleRegions()){
        		for(SequenceDiagramNode sd_node: ir.getSequenceDiagramNodes()){
        			if(sd_node.getSequenceDiagram().equals(this.mades_sd)){
        				condStop.addFormulae(new SSequenceDiagramNode(sd_node).getPredicateStop());
        			}
        		}
        	}
        }
        
        if (condStart.size() > 0) {
            sem = sem + new Iff(sd_start, condStart) + "\n";
        }
        if (condEnd.size() > 0) {
            sem = sem + new Iff(sd_end, condEnd) + "\n";
        }
        if(condStop.size() == 0){
    		sem = sem + SMadesModel.printSeparatorSmall("STOP SEMANTICS");
    		sem = sem + new Not(this.getPredicateStop()) + "\n";
        }
        if(condStop.size() > 0){
    		sem = sem + SMadesModel.printSeparatorSmall("STOP SEMANTICS");
    		sem = sem + new Iff(this.getPredicateStop(), condStop) + "\n";
        }
		
		return sem;
	}

	protected static BooleanFormulae buildOrderingSemanticsLTEAxiom(Predicate e_i,
			Predicate e_j, Predicate sd_stop) {
		And sem = new And();
		
		// Axiom Event1
		/*
		 * @AXIOM If the first event occurs now then either the sequence diagram
		 * stops before the second event, or the second events occurs
		 * \begin{align} \label{ax:LTEAxiom} prova \end{align}
		 */
		sem.addFormulae(new Implies(e_i, new Or(new And(new Until_ei(new And(
				new Not(e_i), new Not(e_j)), sd_stop), new Not(e_j)),
				new Until_ei(new Not(sd_stop), e_j))));

		return sem;
	}

	protected static BooleanFormulae buildOrderingSemanticsBackwardAxiom(Predicate e_i,
			Predicate e_j, Predicate sd_stop) {
		And sem = new And();
		
		// Axiom Event2
		/*
		 * @AXIOM Given two events in a lifeline this could be separated by an
		 * arbitrary amount of time\\ The events may happen at the same time
		 * instant \begin{align} \label{ax:BackwardAxiom} prova \end{align}
		 */
		sem.addFormulae(new Implies(e_j, new Since_ei(new And(new Not(sd_stop),
				new Not(e_j)), e_i)));

		return sem;
	}

	protected static BooleanFormulae buildOrderingSemanticsSDEndAxiom(Predicate e_z, Set<Predicate> lastevents) {
		And sem = new And();
		
		/*
		 * @AXIOM The end of the sequence diagram occurs iff the last event of
		 * the lifelines occurs now \begin{align} \label{ax:SDEndAxiom} prova
		 * \end{align}
		 */

		// Deve contenere:
		// for all e_h...e_k che precedono e_z
		// e_h AND for all j!=h Since(NOT E_z, E_j)
		// OR
		// ...
		// e_k AND for all j!=h Since(NOT E_z, E_j)
		Or temp2 = new Or();
		for (Predicate e_h : lastevents) {
			// Deve contenere:
			// e_h AND for all j!=h Since(NOT E_z, E_j)
			And temp = new And();
			// e_h
			temp.addFormulae(e_h);
			// for all j!=h
			for (Predicate e_j : lastevents) {
				if (!e_j.equals(e_h)) {
					// Since(NOT E_z, E_j)
					temp.addFormulae(new Since_ei(new Not(e_z), e_j));
				}

			}
			// e_h AND Since(NOT E_z, E_j1) AND ....
			temp2.addFormulae(temp);
		}
		sem.addFormulae(new Iff(e_z, temp2));
		return sem;
	}

}
