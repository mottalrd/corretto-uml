package org.correttouml.uml.diagrams.classdiagram;

import org.correttouml.uml.diagrams.expressions.ValueSpecification;

public class Slot {

	private org.eclipse.uml2.uml.Slot uml_slot;
	
	public Slot(org.eclipse.uml2.uml.Slot uml_slot){
		this.uml_slot= uml_slot;
	}
	
	public ValueSpecification getValueSpecification(){
		org.eclipse.uml2.uml.ValueSpecification value=uml_slot.getValues().get(0);
		return new ValueSpecification(value);
	}
}
