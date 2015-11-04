package org.correttouml.uml2zot.semantics.classdiagram;

import java.util.HashSet;

import org.correttouml.uml.diagrams.classdiagram.Attribute;
import org.correttouml.uml.diagrams.classdiagram.Object;
import org.correttouml.uml.diagrams.classdiagram.Operation;
import org.correttouml.uml.diagrams.sequencediagram.ExecutionOccurrence;
import org.correttouml.uml.diagrams.sequencediagram.Lifeline;
import org.correttouml.uml.diagrams.statediagram.StateDiagram;
import org.correttouml.uml2zot.semantics.SMadesModel;
import org.correttouml.uml2zot.semantics.sequencediagram.SExecutionOccurrence;
import org.correttouml.uml2zot.semantics.statediagram.SStateDiagram;
import org.correttouml.uml2zot.semantics.util.bool.Implies;
import org.correttouml.uml2zot.semantics.util.bool.Not;
import org.correttouml.uml2zot.semantics.util.trio.Constant;
import org.correttouml.uml2zot.semantics.util.trio.EQ;
import org.eclipse.emf.validation.internal.service.GetBatchConstraintsOperation;
import org.eclipse.uml2.uml.ExecutionSpecification;


public class SObject {

	private Object mades_obj;
	
	public SObject(Object mades_obj){
		this.mades_obj=mades_obj;
	}
	
	public String getSemantics(){
		String sem="";
		
		SMadesModel.printSeparatorSmall("Object operation definitions", false);
		for(Operation op: this.mades_obj.getOwningClass().getOperations()){
			sem=sem+new SOperation(op).getSemantics(mades_obj);
		}
		
		SMadesModel.printSeparatorSmall("Attribute semantics", false);
		for(Attribute attr: this.mades_obj.getOwningClass().getAttributes()){
			sem=sem+new SAttribute(attr).getSemantics(mades_obj);
		}
		
		sem += SMadesModel.printSeparatorSmall("BLOCKING SEMANTICS");
		sem += getBlockingSemantics();
		
		//If the object has a state diagram associated to it, return its semantics
		for(StateDiagram std: mades_obj.getOwningClass().getStateDiagrams()){
			sem=sem+SMadesModel.printSeparatorSmall(mades_obj.toString() + " STD " + std + " SEMANTICS");
			sem=sem+new SStateDiagram(std).getSemantics(this.mades_obj);
		}
		
		return sem;
	}

	public String getInitializationSemantics() {
		String sem="";
		
		for(Attribute att: this.mades_obj.getOwningClass().getAttributes()){
			sem=sem+new SAttribute(att).getInitializationSemantics(mades_obj);
		}
		
		return sem;
	}

	public String getBlockingSemantics() {
        String sem = "";
        HashSet<ExecutionOccurrence> eoSet = mades_obj.getEOs();
//        HashSet<ExecutionSpecification> esSet = mades_obj.getESs();
//        for (ExecutionSpecification es:esSet)
//        	eoSet.add(new ExecutionOccurrence(es));
        for (ExecutionOccurrence eo1 : eoSet)
        	for (ExecutionOccurrence eo2 : eoSet)
               if (!eo1.equals(eo2)) 
            	   sem = sem + new Implies(new SExecutionOccurrence(eo1).getPredicate(),
            			   new Not(new SExecutionOccurrence(eo2).getPredicate())) + "\n";
        return sem;
	}
}
