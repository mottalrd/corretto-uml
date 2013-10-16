package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.uml.diagrams.property.PTermElement;
import org.correttouml.uml.diagrams.sequencediagram.*;
import org.correttouml.uml2zot.semantics.sequencediagram.SSequenceDiagram.Config;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/
public class SCombinedFragment implements SInteractionFragment {
	protected CombinedFragment mades_combinedfragment;
	protected Config config;
	public SCombinedFragment(CombinedFragment cf, Config config) {
		this.mades_combinedfragment = cf;
		this.config = config;
	}
	
	public SCombinedFragment(CombinedFragment cf) {
		this.mades_combinedfragment = cf;
	}
	
//	public ArrayList<BooleanFormulae> getSemantics(){//####implement me
//		return null;
//		
//	}

	@Override
	public Predicate getPredicate() {
		return new Predicate(this.mades_combinedfragment.getPredicateName());
	}
	
	public String getName() {
		return this.mades_combinedfragment.getName();
	}
	
	public ArrayList<Lifeline> getLifelines(){
		return this.mades_combinedfragment.getLifelines();
	}
	
	public Predicate getLifelinePredicate(int index){
		return new Predicate(this.mades_combinedfragment.getPredicateName() + '_' + mades_combinedfragment.getLifelines().get(index).getName());
	}
	
	public ArrayList<Predicate> getCFLifelinesPrePredicates(){
		ArrayList<Predicate> CFLifelinesPrePredicates = new ArrayList<Predicate>();
		ArrayList<InteractionFragment> CFPreIFs = new ArrayList<InteractionFragment>();
		CFPreIFs.addAll(mades_combinedfragment.getCFPreIFs());
		for (int i = 0; i < CFPreIFs.size(); i++) {
			if (CFPreIFs.get(i) == null) {
				org.eclipse.uml2.uml.Interaction enclosinginteraction = mades_combinedfragment
						.getEnclosingFragment();
				if (enclosinginteraction.getEnclosingInteraction() == null) // if enclosingfragment is a SD
					CFLifelinesPrePredicates
							.add(new SSequenceDiagram(
									new org.correttouml.uml.diagrams.sequencediagram.SequenceDiagram(
											enclosinginteraction))
									.getPredicate().getPredicateStart());
				else
					// if enclosingfragment is a CF
					CFLifelinesPrePredicates
							.add(new SCombinedFragment(
									new CombinedFragment(
											(org.eclipse.uml2.uml.CombinedFragment) enclosinginteraction))
									.getPredicate().getPredicateStart());
			} else {
				if (CFPreIFs.get(i) instanceof org.eclipse.uml2.uml.MessageOccurrenceSpecification) {// message
					org.eclipse.uml2.uml.MessageOccurrenceSpecification mof = (org.eclipse.uml2.uml.MessageOccurrenceSpecification) CFPreIFs.get(i);
					if (mof.getMessage().getSendEvent().equals(mof))
						CFLifelinesPrePredicates.add(new SMessageStart(
								new MessageStart(mof)).getPredicate());
					else if (mof.getMessage().getReceiveEvent().equals(mof))
						CFLifelinesPrePredicates.add(new SMessageEnd(
								new MessageEnd(mof)).getPredicate());
				} else if (CFPreIFs.get(i) instanceof org.eclipse.uml2.uml.CombinedFragment) {// CF
					CFLifelinesPrePredicates.add(new SCombinedFragment(new CombinedFragment((org.eclipse.uml2.uml.CombinedFragment)CFPreIFs.get(i))).getPredicate().getPredicateEnd());
				}
			}
		}
		return CFLifelinesPrePredicates;
	}
	
	public Predicate getCFLifelinePrePredicate(int index){
		return getCFLifelinesPrePredicates().get(index);
	}
	
	public Predicate getCFLifelinePostPredicate(int index){
		return getCFLifelinesPostPredicates().get(index);
	}	
	
	public ArrayList<Predicate> getCFLifelinesPostPredicates(){
		ArrayList<Predicate> CFLifelinesPostPredicates = new ArrayList<Predicate>();
		ArrayList<InteractionFragment> CFPostIFs = new ArrayList<InteractionFragment>();
		CFPostIFs.addAll(mades_combinedfragment.getCFPostIFs());
		for (int i = 0; i < CFPostIFs.size(); i++) {
			if (CFPostIFs.get(i) == null) {
				org.eclipse.uml2.uml.Interaction enclosinginteraction = mades_combinedfragment
						.getEnclosingFragment();
				if (enclosinginteraction.getEnclosingInteraction() == null) // if enclosingfragment is a SD
					CFLifelinesPostPredicates
							.add(new SSequenceDiagram(
									new org.correttouml.uml.diagrams.sequencediagram.SequenceDiagram(
											enclosinginteraction))
									.getPredicate().getPredicateEnd());
				else
					// if enclosingfragment is a CF
					CFLifelinesPostPredicates
							.add(new SCombinedFragment(
									new CombinedFragment(
											(org.eclipse.uml2.uml.CombinedFragment) enclosinginteraction))
									.getPredicate().getPredicateEnd());
			} else {
				if (CFPostIFs.get(i) instanceof org.eclipse.uml2.uml.MessageOccurrenceSpecification) {// message
					org.eclipse.uml2.uml.MessageOccurrenceSpecification mof = (org.eclipse.uml2.uml.MessageOccurrenceSpecification) CFPostIFs.get(i);
					if (mof.getMessage().getSendEvent().equals(mof))
						CFLifelinesPostPredicates.add(new SMessageStart(
								new MessageStart(mof)).getPredicate());
					else if (mof.getMessage().getReceiveEvent().equals(mof))
						CFLifelinesPostPredicates.add(new SMessageEnd(
								new MessageEnd(mof)).getPredicate());
				} else if (CFPostIFs.get(i) instanceof org.eclipse.uml2.uml.CombinedFragment) {// CF
					CFLifelinesPostPredicates.add(new SCombinedFragment(new CombinedFragment((org.eclipse.uml2.uml.CombinedFragment)CFPostIFs.get(i))).getPredicate().getPredicateEnd());
				}
			}
		}
		return CFLifelinesPostPredicates;
	}
	
	public String getOperator() {
		return this.mades_combinedfragment.getOperatorName();
	}
	
}
