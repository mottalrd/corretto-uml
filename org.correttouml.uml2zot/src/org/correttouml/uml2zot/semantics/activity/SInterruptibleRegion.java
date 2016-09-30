package org.correttouml.uml2zot.semantics.activity;

import org.correttouml.uml.diagrams.activity.InterruptibleRegion;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;


public class SInterruptibleRegion {

	private InterruptibleRegion mades_ir;

	public SInterruptibleRegion(InterruptibleRegion ir) {
		this.mades_ir=ir;
	}
	
	public Predicate getPredicate(){
		return new Predicate("IR_"+ this.mades_ir.getUMLId());
	}

}
