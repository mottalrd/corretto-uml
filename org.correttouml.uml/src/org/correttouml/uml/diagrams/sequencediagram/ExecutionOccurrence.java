package org.correttouml.uml.diagrams.sequencediagram;


import org.correttouml.uml.diagrams.classdiagram.Object;
import org.correttouml.uml2zot.UML2Zot;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;

public class ExecutionOccurrence implements InteractionFragment{

	private ExecutionSpecification uml_exocc;

	public ExecutionOccurrence(org.eclipse.uml2.uml.ExecutionSpecification uml_exocc){
		this.uml_exocc=uml_exocc;
	}

	public SequenceDiagram getSequenceDiagram() {
		return new SequenceDiagram(uml_exocc.getEnclosingInteraction());
	}

	public ExecutionOccurrenceStart getExecutionOccurrenceStart() {
		return new ExecutionOccurrenceStart((org.eclipse.uml2.uml.ExecutionOccurrenceSpecification) this.uml_exocc.getStart());
	}
	
	public ExecutionOccurrenceEnd getExecutionOccurrenceEnd() {
		return new ExecutionOccurrenceEnd((org.eclipse.uml2.uml.ExecutionOccurrenceSpecification) this.uml_exocc.getFinish());
	}

	public InteractionFragment getExecutionOccurrenceSyncStart(){
		if (uml_exocc.getStart() instanceof MessageOccurrenceSpecification)
			return InteractionFragmentFactory.getInstance(uml_exocc.getStart());
		return null;
	}
	
	public InteractionFragment getExecutionOccurrenceSyncFinish(){
		if (uml_exocc.getFinish() instanceof MessageOccurrenceSpecification)
			return InteractionFragmentFactory.getInstance(uml_exocc.getFinish());
		return null;
	}
	
	public String getUMLId() {
		String id=((XMLResource) this.uml_exocc.eResource()).getID(uml_exocc);
//		return id;
		return UML2Zot.Utility.umlIDtoPrdID(id);
	}
	
	public Object getObject() {
		return new Lifeline(this.uml_exocc.getCovereds().get(0)).getObject();
		
	}
}
