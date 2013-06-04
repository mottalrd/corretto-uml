package org.correttouml.uml.diagrams.classdiagram;

import org.eclipse.uml2.uml.Property;

public class AssociationEnd {

	private Property uml_property;

	public AssociationEnd(Property uml_property){
		this.uml_property=uml_property;
	}
	
	public String getName(){
		return uml_property.getName();
	}
	
}
