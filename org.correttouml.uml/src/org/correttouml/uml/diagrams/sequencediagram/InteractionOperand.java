package org.correttouml.uml.diagrams.sequencediagram;

import java.util.ArrayList;
import java.util.List;

import org.correttouml.uml.diagrams.property.PTermElement;

/**
 * @author Mohammad Mehdi Pourhashem Kallehbasti
 */
public class InteractionOperand implements InteractionFragment, PTermElement {
	private org.eclipse.uml2.uml.InteractionOperand uml_interactionoperand;

	public InteractionOperand(
			org.eclipse.uml2.uml.InteractionOperand interactionoperand) {
		this.uml_interactionoperand = interactionoperand;
	}

	public String getName() {
		return uml_interactionoperand.getName();
	}

	public String getPredicateName() {// ####test me
		return new CombinedFragment((org.eclipse.uml2.uml.CombinedFragment)uml_interactionoperand.getOwner()).getPredicateName() + "_" + uml_interactionoperand.getName();
	}
	
	public String getSDName(){
			return new CombinedFragment((org.eclipse.uml2.uml.CombinedFragment)uml_interactionoperand.getOwner()).getSDName();
	}

	public ArrayList<Lifeline> getLifelines() {// ####test me
		ArrayList<Lifeline> lifelines = new ArrayList<Lifeline>();
		for (int i = 0; i < uml_interactionoperand.getCovereds().size(); i++) {
			lifelines.add(new Lifeline(uml_interactionoperand.getCovereds().get(i)));
		}
		return lifelines;
	}
	
	public ArrayList<String> getLifelinesNames() {// ####test me
		ArrayList<String> lifelinesnames = new ArrayList<String>();
		for (int i = 0; i < uml_interactionoperand.getCovereds().size(); i++) 
			lifelinesnames.add(uml_interactionoperand.getCovereds().get(i).getName());
		return lifelinesnames;
	}
	
	public org.eclipse.uml2.uml.Interaction getEnclosingFragment(){ ////###test me
		return uml_interactionoperand.getEnclosingInteraction();
	}

	public ArrayList<InteractionFragment> getEvents() {// //####test
		ArrayList<InteractionFragment> events = new ArrayList<InteractionFragment>();
		List<org.eclipse.uml2.uml.InteractionFragment> sd_fragment = uml_interactionoperand.getFragments();
		for (org.eclipse.uml2.uml.InteractionFragment ifr : sd_fragment)
			events.add(InteractionFragmentFactory.getInstance(ifr));
		return events;
	}

	public ArrayList<InteractionFragment> getLifelineEvents(int lifelineIndex) {// //####test
		ArrayList<InteractionFragment> events = new ArrayList<InteractionFragment>();
		List<org.eclipse.uml2.uml.InteractionFragment> f = uml_interactionoperand.getFragments();
		for (org.eclipse.uml2.uml.InteractionFragment ifr : f) 
			for (org.eclipse.uml2.uml.Lifeline l : ifr.getCovereds())
				if (getLifelinesNames().get(lifelineIndex) == l.getName())
					events.add(InteractionFragmentFactory.getInstance(ifr));
		return events;
	}

	public String getGuard(){
		return (uml_interactionoperand.getGuard() == null) ? null: uml_interactionoperand.getGuard().getName();
	}
	
}
