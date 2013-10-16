package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;
import org.correttouml.uml.diagrams.sequencediagram.*;
import org.correttouml.uml2zot.semantics.sequencediagram.SSequenceDiagram.Config;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/
public class SInteractionOperand implements SInteractionFragment {
	private InteractionOperand mades_interactionoperand;
	private Config config;
	public SInteractionOperand(InteractionOperand io, Config config) {
		this.mades_interactionoperand = io;
		this.config = config;
	}
	
	public SInteractionOperand(InteractionOperand io) {
		this.mades_interactionoperand = io;
	}
	
	@Override
	public Predicate getPredicate() {
		return new Predicate(this.mades_interactionoperand.getPredicateName());
	}
	
	public String getName() {
		return this.mades_interactionoperand.getName();
	}
	
	public ArrayList<Lifeline> getLifelines(){
		return this.mades_interactionoperand.getLifelines();
	}
	
	public Predicate getLifelinePredicate(int index){
		return new Predicate(this.mades_interactionoperand.getPredicateName() + '_' + mades_interactionoperand.getLifelines().get(index).getName());
	}
	
	public Predicate getSDPredicate(){
		return new Predicate(mades_interactionoperand.getSDName());
	}
	
	public ArrayList<Predicate> getLifelinesPredicateStarts(){
		ArrayList<Predicate> lifelinesPredicateStarts = new ArrayList<Predicate>();
		for(Predicate p : getLifelinesPredicates())
			lifelinesPredicateStarts.add(p.getPredicateStart());
		return lifelinesPredicateStarts;
	}
	
	public ArrayList<Predicate> getLifelinesPredicateEnds(){
		ArrayList<Predicate> lifelinesPredicateEnds = new ArrayList<Predicate>();
		for(Predicate p : getLifelinesPredicates())
			lifelinesPredicateEnds.add(p.getPredicateEnd());
		return lifelinesPredicateEnds;
	}
	
	public ArrayList<Predicate> getLifelinesPredicates() {
		ArrayList<Predicate> lifelinesPredicates = new ArrayList<Predicate>();
		for (Lifeline l : mades_interactionoperand.getLifelines()) {
			lifelinesPredicates.add((Predicate) (getLifelinePredicate(l
					.getName())));
			l.getEvents();
		}
		return lifelinesPredicates;
	}
	
	public Predicate getLifelinePredicate(String lifelineName) {
		return new Predicate(this.mades_interactionoperand.getPredicateName() + '_' + lifelineName);
	}
	
}
