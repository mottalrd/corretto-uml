package org.correttouml.uml.diagrams.classdiagram;

import org.correttouml.uml.diagrams.expressions.ValueSpecification;

public class Slot {

	private org.eclipse.uml2.uml.Slot uml_slot;
	
	public Slot(org.eclipse.uml2.uml.Slot uml_slot){
		this.uml_slot= uml_slot;
	}
	
	/**
	 * [corretto-man] Every object on Object Diagram needs a slot for each variable in its classifier in the Class Diagram.
	 * [corretto-man] A slot can have a default value. If it does not have an initial value and any assignment, it is left free to take any value at any time. That means there will not be a formula that limits it to keep its value (Var = Yesterday(Var)). 
	 * @return Default value of the slot.
	 */
	public ValueSpecification getValueSpecification() {
		org.eclipse.uml2.uml.ValueSpecification value = null;
		if (uml_slot.getValues().size() > 0)
			value = uml_slot.getValues().get(0);
		else
			return null;
		return new ValueSpecification(value);
	}
}
