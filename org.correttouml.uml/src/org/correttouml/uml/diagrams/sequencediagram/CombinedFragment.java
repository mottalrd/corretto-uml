package org.correttouml.uml.diagrams.sequencediagram;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import org.correttouml.uml.MadesModel;
import org.correttouml.uml.diagrams.classdiagram.Clock;
import org.correttouml.uml.diagrams.classdiagram.Operation;
import org.correttouml.uml.diagrams.property.PTermElement;
import org.correttouml.uml.helpers.UML2ModelHelper;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InteractionOperand;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/
public class CombinedFragment implements InteractionFragment, PTermElement{

	private org.eclipse.uml2.uml.CombinedFragment uml_combinedFragment;
	
	public CombinedFragment(org.eclipse.uml2.uml.CombinedFragment combinedFragment) {
		this.uml_combinedFragment = combinedFragment;
	}
	
	public String getName(){
		return uml_combinedFragment.getName();
	}
	
	public String getPredicateName(){
		//PrdName of an opt1, which enclosed by par1, which is enclosed by SD1 is "SD1_par1_opt1"
		String prefix = "";
		org.eclipse.uml2.uml.InteractionFragment tempif = (org.eclipse.uml2.uml.InteractionFragment)uml_combinedFragment;
		while (tempif.getEnclosingInteraction() != null){
			prefix = tempif.getEnclosingInteraction().getName() + '_' + prefix;
			tempif = tempif.getEnclosingInteraction();
		}
		return prefix + uml_combinedFragment.getName();
	}
	
	public String getSDName(){
		org.eclipse.uml2.uml.InteractionFragment tempif = (org.eclipse.uml2.uml.InteractionFragment)uml_combinedFragment;
		while (tempif.getEnclosingInteraction() != null)
			tempif = tempif.getEnclosingInteraction();
		return tempif.getName();
	}
	
	public String getOperatorName(){
		return uml_combinedFragment.getInteractionOperator().getName();
	}
	
	public ArrayList<InteractionOperand> getOperands(){
		ArrayList<InteractionOperand> ios = new ArrayList<InteractionOperand>();
		for (int i = 0; i < uml_combinedFragment.getOperands().toArray().length; i++) {
			ios.add((InteractionOperand)uml_combinedFragment.getOperands().toArray()[i]);
		}
		return ios;
	}
	
	public ArrayList<Lifeline> getLifelines(){
		ArrayList<Lifeline> lifelines = new ArrayList<Lifeline>();
		for (int i = 0; i < uml_combinedFragment.getCovereds().toArray().length; i++) {
			lifelines.add((Lifeline)uml_combinedFragment.getCovereds().toArray()[i]);
		}
		return lifelines;
	}
	
	public ArrayList<InteractionFragment> getCFPreIFs(){ ////###test when a lifeline is not included in CF
		ArrayList<InteractionFragment> CFPreIFs = new ArrayList<InteractionFragment>();
		org.eclipse.uml2.uml.Interaction enclosingfragment = uml_combinedFragment.getEnclosingInteraction();
		for (org.eclipse.uml2.uml.Lifeline l : uml_combinedFragment.getCovereds()) {
			//<get lifeline's events (InteractionFragment)>
			ArrayList<InteractionFragment> lifelineifs = new ArrayList<InteractionFragment>();
			for (org.eclipse.uml2.uml.InteractionFragment ifr : enclosingfragment.getFragments()) {
				if (l.getCoveredBys().contains(ifr)) 
					lifelineifs.add(InteractionFragmentFactory.getInstance(ifr));
			}
			//</get lifeline's events (InteractionFragment)>
			
			for(int i=0;i<lifelineifs.size();i++){
				if (lifelineifs.get(i) instanceof CombinedFragment){
					CombinedFragment cf = new CombinedFragment((org.eclipse.uml2.uml.CombinedFragment)lifelineifs.get(i));
					if (cf.getName() == this.getName())
						if (i == 0)
							CFPreIFs.add(null);
						else
							CFPreIFs.add(lifelineifs.get(i - 1));
				}
			}
		}
		return CFPreIFs;
	}
	
	public ArrayList<InteractionFragment> getCFPostIFs(){ ////###test when a lifeline is not included in CF
		ArrayList<InteractionFragment> CFPostIFs = new ArrayList<InteractionFragment>();
		org.eclipse.uml2.uml.Interaction enclosingfragment = uml_combinedFragment.getEnclosingInteraction();
		for (org.eclipse.uml2.uml.Lifeline l : uml_combinedFragment.getCovereds()) {
			//<get lifeline's events (InteractionFragment)>
			ArrayList<InteractionFragment> lifelineifs = new ArrayList<InteractionFragment>();
			for (org.eclipse.uml2.uml.InteractionFragment ifr : enclosingfragment.getFragments()) {
				if (l.getCoveredBys().contains(ifr)) 
					lifelineifs.add(InteractionFragmentFactory.getInstance(ifr));
			}
			//</get lifeline's events (InteractionFragment)>
			
			for(int i=0;i<lifelineifs.size();i++){
				if (lifelineifs.get(i) instanceof CombinedFragment){
					CombinedFragment cf = new CombinedFragment((org.eclipse.uml2.uml.CombinedFragment)lifelineifs.get(i));
					if (cf.getName() == this.getName())
						if (i < lifelineifs.size() - 1)
							CFPostIFs.add(lifelineifs.get(i + 1));
						else
							CFPostIFs.add(null);
				}
			}
		}
		return CFPostIFs;
	}
	
	public org.eclipse.uml2.uml.Interaction getEnclosingFragment(){ ////###test for enclosingF is CF and when it is CF_Op
		return uml_combinedFragment.getEnclosingInteraction();
	}
	
	
/*
	
	@Override
	public boolean equals(java.lang.Object object){
		if(object instanceof Message){
			Message other=(Message) object;
			return other.uml_message.equals(this.uml_message);
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return this.uml_message.hashCode();
	}

	public String getUMLId() {
		String id=((XMLResource) this.uml_message.eResource()).getID(uml_message);
		return id;
	}
*/
}
