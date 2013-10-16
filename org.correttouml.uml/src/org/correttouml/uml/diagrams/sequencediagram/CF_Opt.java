package org.correttouml.uml.diagrams.sequencediagram;


import org.correttouml.uml.diagrams.events.Event;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/
public class CF_Opt implements InteractionFragment, Event, CombinedFragmentItf {

	public org.eclipse.uml2.uml.CombinedFragment uml_cf_opt;
	
	public CF_Opt(CombinedFragment cf_opt) {
		this.uml_cf_opt = cf_opt;
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