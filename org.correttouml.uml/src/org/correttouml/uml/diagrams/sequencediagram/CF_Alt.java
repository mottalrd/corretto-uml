package org.correttouml.uml.diagrams.sequencediagram;


import org.correttouml.uml.diagrams.events.Event;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/
public class CF_Alt extends org.correttouml.uml.diagrams.sequencediagram.CombinedFragment implements InteractionFragment, Event, CombinedFragmentItf {

	public org.eclipse.uml2.uml.CombinedFragment uml_cf_alt;
	
	public CF_Alt(org.eclipse.uml2.uml.CombinedFragment uml_cf_alt) {
		super(uml_cf_alt);
		this.uml_cf_alt = uml_cf_alt;
	}

//	public Message getMessage() {
//		return new Message(uml_mof.getMessage());
//	}
//	
//	public Lifeline getLifeline(){
//		org.eclipse.uml2.uml.Lifeline l=uml_mof.getCovereds().get(0);;
//		return new Lifeline(l);
//	}

}