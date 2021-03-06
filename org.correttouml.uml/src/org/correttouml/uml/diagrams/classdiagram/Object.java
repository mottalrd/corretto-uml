package org.correttouml.uml.diagrams.classdiagram;

import java.util.HashSet;
import java.util.Set;

import org.correttouml.uml.MadesModel;
import org.correttouml.uml.diagrams.activitydiagram.AD;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceSpecification;

public class Object {

	/** The UML2 object we are decorating */
	private InstanceSpecification uml_object;
	
	/** Takes a UML2 object instance */
	public Object(InstanceSpecification uml_obj){
		this.uml_object=uml_obj;
	}
	
	public Class getOwningClass(){
		for(Classifier c: uml_object.getClassifiers()){
			if(c instanceof org.eclipse.uml2.uml.Class) return new Class((org.eclipse.uml2.uml.Class) c);
		}
		return null;
	}

	public String getName() {
		return uml_object.getName();
	}
	
	public Slot getSlot(Attribute attr){
		
		for(org.eclipse.uml2.uml.Slot slot: uml_object.getSlots()){
			Attribute tmp=new Attribute((org.eclipse.uml2.uml.Property) slot.getDefiningFeature());
			if(tmp.equals(attr)) return new Slot(slot);
		}
		
		return null;
	}
	
	public MadesModel getMadesModel(){
		return new MadesModel(this.uml_object.getModel());
	}
	
	public Set<AssociationInstance> getAssociationInstances(){
		HashSet<AssociationInstance> associationInstances=new HashSet<AssociationInstance>();
		
		for(AssociationInstance a: this.getMadesModel().getClassdiagram().getAssociationInstances()){
			if(a.isMemberEnd(this)) 
				associationInstances.add(a);
		}
		
		return associationInstances;
	}
	
	public Set<Object> getAssociatedObjects() {
		//TODO[mottalrd] questo fa veramente schifo
		//TODO: Verificare se tra gli insiemi degli oggetti associati a un certo oggetto
		//esisten l'oggetto stesso o meno
		Set<Object> ass_objects=new HashSet<Object>();
		
		Set<InstanceSpecification> association_links=new HashSet<InstanceSpecification>();
		for(Element c: this.uml_object.getModel().allOwnedElements()){
			if(c instanceof org.eclipse.uml2.uml.InstanceSpecification){
				org.eclipse.uml2.uml.InstanceSpecification ass=(org.eclipse.uml2.uml.InstanceSpecification) c;
				//TODO verificare che l'instance specification ������ un instance specification link guardando il suo classifier
				for(EAnnotation e: ass.getEAnnotations()){
					for(EObject eobj: e.getReferences()){
						if(eobj instanceof org.eclipse.uml2.uml.InstanceSpecification){
							org.eclipse.uml2.uml.InstanceSpecification is=(org.eclipse.uml2.uml.InstanceSpecification) eobj;
							if(is.equals(this.uml_object)) association_links.add(ass);
						}
					}
				}
			}
		}
		
		//FIXME: This can be implemented much better
		//do the thing below in the loop above, all in one
		for(InstanceSpecification association_link:  association_links){
			for(EAnnotation e: association_link.getEAnnotations()){
				for(EObject eobj: e.getReferences()){
					if(eobj instanceof org.eclipse.uml2.uml.InstanceSpecification){
						org.eclipse.uml2.uml.InstanceSpecification is=(org.eclipse.uml2.uml.InstanceSpecification) eobj;
						if(!is.equals(this.uml_object)) ass_objects.add(new Object(is));
					}
				}
			}
		}

		return ass_objects;		
	}

//	public AD getAD(){
//		if (getOwningClass().getUMLAD() != null)
//			return new AD (getOwningClass().getUMLAD(), this);
//		return null;
//	}
	public Set<AD> getADs(){
		HashSet<AD> ads = new HashSet<AD>();
		
		for (org.eclipse.uml2.uml.Activity umlAD : getOwningClass().getUMLADs()){
			ads.add(new AD (umlAD, this));
		}
		
		return ads;
	}
	
	@Override
	public String toString(){
		return this.getName();
	}
	
	@Override
	public boolean equals(java.lang.Object o){
		Object other_object=(Object) o;
		return this.uml_object.equals(other_object.uml_object);
	}
	
	@Override
	public int hashCode(){
		return this.uml_object.hashCode();
	}
	
}
