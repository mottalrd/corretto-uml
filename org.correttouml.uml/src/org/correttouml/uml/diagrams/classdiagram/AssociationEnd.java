package org.correttouml.uml.diagrams.classdiagram;

import org.eclipse.uml2.uml.Property;

public class AssociationEnd {

	private Property uml_property;
	private org.correttouml.uml.diagrams.classdiagram.Class ownerClass;

	public AssociationEnd(Property uml_property){
		this.uml_property=uml_property;
		ownerClass = new Class((org.eclipse.uml2.uml.Class) uml_property.getOpposite().getOwner());
	}
	
	public String getName(){
		return uml_property.getName();
	}

	public Class getOwnerClass(){
		return ownerClass;
	}
	
}
