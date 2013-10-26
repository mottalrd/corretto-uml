package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.grammars.booleanExpressions.booleanExpression;
import org.correttouml.uml.diagrams.property.PTermElement;
import org.correttouml.uml.diagrams.sequencediagram.*;
import org.correttouml.uml2zot.semantics.util.bool.And;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/
public class SCombinedFragment implements SInteractionFragment {
	protected CombinedFragment mades_combinedfragment;
	protected Config config;
	public enum PredicateType{SDStart, SDEnd, CFStart, CFEnd, MStart, MEnd}
	public class MetaPredicate{
		private Predicate predicate;
		private PredicateType predicatetype;
		public MetaPredicate(Predicate predicate, PredicateType predicatetype){
			this.predicate = predicate;
			this.predicatetype = predicatetype;
		}
		
	}
	
	public SCombinedFragment(CombinedFragment cf, Config config) {
		this.mades_combinedfragment = cf;
		this.config = config;
	}
	
//	public SCombinedFragment(CombinedFragment cf) {
//		this.mades_combinedfragment = cf;
//	}
	
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
	
	public Predicate getSDPredicate(){
		return new Predicate(mades_combinedfragment.getSDName());
	}
	
	public ArrayList<Lifeline> getLifelines(){
		return this.mades_combinedfragment.getLifelines();
	}
	
	public ArrayList<Predicate> getLifelinesPredicates(){
		ArrayList<Predicate> lifelinespredicates = new ArrayList<Predicate>();
		for (int i = 0; i < getLifelines().size(); i++) {
			lifelinespredicates.add(getLifelinePredicate(i));
		}
		return lifelinespredicates;
	}
	
	public ArrayList<Predicate> getLifelinesStartPredicates(){
		ArrayList<Predicate> lifelinesstartpredicates = new ArrayList<Predicate>();
		for (int i = 0; i < getLifelines().size(); i++) {
			lifelinesstartpredicates.add(getLifelinePredicate(i).getPredicateStart());
		}
		return lifelinesstartpredicates;
	}
	
	public ArrayList<Predicate> getLifelinesEndPredicates(){
		ArrayList<Predicate> lifelinesendpredicates = new ArrayList<Predicate>();
		for (int i = 0; i < getLifelines().size(); i++) {
			lifelinesendpredicates.add(getLifelinePredicate(i).getPredicateEnd());
		}
		return lifelinesendpredicates;
	}
	
	public Predicate getLifelinePredicate(int index){
		return new Predicate(this.mades_combinedfragment.getPredicateName() + '_' + mades_combinedfragment.getLifelines().get(index).getName());
	}
	
	public Predicate getLifelinePredicate(String lifelinename){
		return new Predicate(this.mades_combinedfragment.getPredicateName() + '_' + lifelinename);
	}
	
	public ArrayList<MetaPredicate> getLifelinesPreMetaPredicates(){
		ArrayList<MetaPredicate> CFLifelinesPreMetaPredicates = new ArrayList<MetaPredicate>();
		ArrayList<InteractionFragment> CFPreIFs = new ArrayList<InteractionFragment>();
		CFPreIFs.addAll(mades_combinedfragment.getPreIFs());

		if (config.combine == ConfigCombine.WS) {
			for (int i = 0; i < CFPreIFs.size(); i++) {
				String currentLifelineName = mades_combinedfragment.getLifelines().get(i).getName();
				if (CFPreIFs.get(i) == null) {
					org.eclipse.uml2.uml.Interaction enclosinginteraction = mades_combinedfragment.getEnclosingFragment();
					if (enclosinginteraction != null) {
						CFLifelinesPreMetaPredicates.add(new MetaPredicate(new SSequenceDiagram(new org.correttouml.uml.diagrams.sequencediagram.SequenceDiagram(
								enclosinginteraction)).getLifelinePredicate(currentLifelineName).getPredicateStart(), PredicateType.SDStart)); //SD_Li_Start
					}else {// else if enclosing element is InteractionOperand
						org.eclipse.uml2.uml.InteractionOperand enclosingoperand = mades_combinedfragment.getEnclosingOperand();
						CFLifelinesPreMetaPredicates.add(new MetaPredicate(new SInteractionOperand(new InteractionOperand(
								(org.eclipse.uml2.uml.InteractionOperand) enclosingoperand), config).getLifelinePredicate(currentLifelineName).getPredicateStart(), PredicateType.CFStart)); //the actual predicate type is OP_Li_Start
					}
				} else {
					if (CFPreIFs.get(i) instanceof MessageStart)// message
						CFLifelinesPreMetaPredicates.add(new MetaPredicate(new SMessageStart((MessageStart)CFPreIFs.get(i)).getPredicate() , PredicateType.MStart));
					else if (CFPreIFs.get(i) instanceof MessageEnd)
						CFLifelinesPreMetaPredicates.add(new MetaPredicate(new SMessageEnd((MessageEnd)CFPreIFs.get(i)).getPredicate() , PredicateType.MEnd));
					else if (CFPreIFs.get(i) instanceof CombinedFragment) {// CF
						CFLifelinesPreMetaPredicates.add(new MetaPredicate(new SCombinedFragment((CombinedFragment)CFPreIFs.get(i), config).getLifelinePredicate(currentLifelineName).getPredicateEnd(), PredicateType.CFEnd)); //CF_Y_Li_End
					}
				}
			}
		}
		
		if (config.combine == ConfigCombine.SYNC) {
			for (int i = 0; i < CFPreIFs.size(); i++) {
				String currentLifelineName = mades_combinedfragment.getLifelines().get(i).getName();
				if (CFPreIFs.get(i) == null) {
					org.eclipse.uml2.uml.Interaction enclosinginteraction = mades_combinedfragment.getEnclosingFragment();
					if (enclosinginteraction != null) {
						CFLifelinesPreMetaPredicates.add(new MetaPredicate(new SSequenceDiagram(new org.correttouml.uml.diagrams.sequencediagram.SequenceDiagram(
								enclosinginteraction)).getPredicate().getPredicateStart(), PredicateType.SDStart)); // SD_Start
					}else {// else if enclosing element is InteractionOperand
						org.eclipse.uml2.uml.InteractionOperand enclosingoperand = mades_combinedfragment.getEnclosingOperand();
						CFLifelinesPreMetaPredicates.add(new MetaPredicate(new SInteractionOperand(new InteractionOperand(
								(org.eclipse.uml2.uml.InteractionOperand) enclosingoperand), config).getPredicate().getPredicateStart(), PredicateType.CFStart)); //the actual predicate type is CF_Y_OP_Start.
					}
				} else {
					if (CFPreIFs.get(i) instanceof MessageStart)// message
						CFLifelinesPreMetaPredicates.add(new MetaPredicate(new SMessageStart((MessageStart)CFPreIFs.get(i)).getPredicate() , PredicateType.MStart));
					else if (CFPreIFs.get(i) instanceof MessageEnd)
						CFLifelinesPreMetaPredicates.add(new MetaPredicate(new SMessageEnd((MessageEnd)CFPreIFs.get(i)).getPredicate() , PredicateType.MEnd));
					else if (CFPreIFs.get(i) instanceof CombinedFragment) {// CF
						CFLifelinesPreMetaPredicates.add(new MetaPredicate(new SCombinedFragment((CombinedFragment)CFPreIFs.get(i), config).getPredicate().getPredicateEnd(), PredicateType.CFEnd)); //CF_Y_End
					}
				}
			}
		}
		return CFLifelinesPreMetaPredicates;
	}

	public ArrayList<Predicate> getLifelinesPrePredicates(){
		ArrayList<Predicate> CFLifelinesPrePredicates = new ArrayList<Predicate>();
		for(MetaPredicate metap : getLifelinesPreMetaPredicates())
			CFLifelinesPrePredicates.add(metap.predicate);
		return CFLifelinesPrePredicates;
	}
	
	public ArrayList<PredicateType> getLifelinesPrePredicateTypes(){
		ArrayList<PredicateType> CFLifelinesPrePredicateTypes = new ArrayList<PredicateType>();
		for(MetaPredicate metap : getLifelinesPreMetaPredicates())
			CFLifelinesPrePredicateTypes.add(metap.predicatetype);
		return CFLifelinesPrePredicateTypes;
	}
	
//	public Predicate getLifelinePrePredicate(int index){
//		return getLifelinesPrePredicates().get(index);
//	}
	
	public ArrayList<MetaPredicate> getLifelinesPostMetaPredicates(){
		ArrayList<MetaPredicate> CFLifelinesPostMetaPredicates = new ArrayList<MetaPredicate>();
		ArrayList<InteractionFragment> CFPostIFs = new ArrayList<InteractionFragment>();
		CFPostIFs.addAll(mades_combinedfragment.getPostIFs());
		if (config.combine == ConfigCombine.WS) {
			for (int i = 0; i < CFPostIFs.size(); i++) {
				String currentLifelineName = mades_combinedfragment.getLifelines().get(i).getName();
				if (CFPostIFs.get(i) == null) { // if there is no interaction fragment after a CF it means it is the last UML element of its enclosingfragment(SD) or its enclosingoperand, whose post predicate is SD_End or IO_End.  
					org.eclipse.uml2.uml.Interaction enclosinginteraction = mades_combinedfragment.getEnclosingFragment();
					if (enclosinginteraction != null) { 
						CFLifelinesPostMetaPredicates.add(new MetaPredicate(new SSequenceDiagram(new org.correttouml.uml.diagrams.sequencediagram.SequenceDiagram(
								enclosinginteraction)).getLifelinePredicate(currentLifelineName).getPredicateEnd(), PredicateType.SDEnd));//SD_Li_End
					}else {// else if enclosing element is InteractionOperand
						org.eclipse.uml2.uml.InteractionOperand enclosingoperand = mades_combinedfragment.getEnclosingOperand();
						CFLifelinesPostMetaPredicates.add(new MetaPredicate(new SInteractionOperand(new InteractionOperand(
								(org.eclipse.uml2.uml.InteractionOperand) enclosingoperand), config).getLifelinePredicate(currentLifelineName).getPredicateEnd(), PredicateType.CFEnd)); //the actual predicate type is OP_Li_End
					}
				} else {
					if (CFPostIFs.get(i) instanceof MessageStart) // message
						CFLifelinesPostMetaPredicates.add(new MetaPredicate(new SMessageStart((MessageStart)CFPostIFs.get(i)).getPredicate(), PredicateType.MStart));
					else if (CFPostIFs.get(i) instanceof MessageEnd)
						CFLifelinesPostMetaPredicates.add(new MetaPredicate(new SMessageEnd((MessageEnd)CFPostIFs.get(i)).getPredicate(), PredicateType.MEnd));
					else if (CFPostIFs.get(i) instanceof CombinedFragment) {// CF
						CFLifelinesPostMetaPredicates.add(new MetaPredicate(new SCombinedFragment((CombinedFragment)CFPostIFs.get(i), config).getLifelinePredicate(currentLifelineName).getPredicateStart(), PredicateType.CFStart)); //CF_Z_Li_Start
					}
				}
			}
		}else if (config.combine == ConfigCombine.SYNC) {
			for (int i = 0; i < CFPostIFs.size(); i++) {
				if (CFPostIFs.get(i) == null) { // if there is no interaction fragment after a CF it means it is the last UML element of its enclosingfragment(SD) or its enclosingoperand, whose post predicate is SD_End or IO_End.  
					org.eclipse.uml2.uml.Interaction enclosinginteraction = mades_combinedfragment.getEnclosingFragment();
					if (enclosinginteraction != null) { 
						CFLifelinesPostMetaPredicates.add(new MetaPredicate(new SSequenceDiagram(new org.correttouml.uml.diagrams.sequencediagram.SequenceDiagram(
								enclosinginteraction)).getPredicate().getPredicateEnd(), PredicateType.SDEnd)); //SD_End
					}else {// else if enclosing element is InteractionOperand
						org.eclipse.uml2.uml.InteractionOperand enclosingoperand = mades_combinedfragment.getEnclosingOperand();
						CFLifelinesPostMetaPredicates.add(new MetaPredicate(new SInteractionOperand(new InteractionOperand(
								(org.eclipse.uml2.uml.InteractionOperand) enclosingoperand), config).getPredicate().getPredicateEnd(), PredicateType.CFEnd)); //the actual predicate type is CF_Z_OP_End.
					}
				} else {
					if (CFPostIFs.get(i) instanceof MessageStart) // message
						CFLifelinesPostMetaPredicates.add(new MetaPredicate(new SMessageStart((MessageStart)CFPostIFs.get(i)).getPredicate(), PredicateType.MStart));
					else if (CFPostIFs.get(i) instanceof MessageEnd)
						CFLifelinesPostMetaPredicates.add(new MetaPredicate(new SMessageEnd((MessageEnd)CFPostIFs.get(i)).getPredicate(), PredicateType.MEnd));
					else if (CFPostIFs.get(i) instanceof CombinedFragment) {// CF
						CFLifelinesPostMetaPredicates.add(new MetaPredicate(new SCombinedFragment((CombinedFragment)CFPostIFs.get(i), config).getPredicate().getPredicateStart(), PredicateType.CFStart)); //CF_Z_Start
					}
				}
			}
		}
		return CFLifelinesPostMetaPredicates;
	}
		
	public ArrayList<Predicate> getLifelinesPostPredicates(){
		ArrayList<Predicate> CFLifelinesPostPredicates = new ArrayList<Predicate>();
		for(MetaPredicate metap : getLifelinesPostMetaPredicates())
			CFLifelinesPostPredicates.add(metap.predicate);
		return CFLifelinesPostPredicates;
	}
	
	public ArrayList<PredicateType> getLifelinesPostPredicateTypes(){
		ArrayList<PredicateType> CFLifelinesPostPredicateTypes = new ArrayList<PredicateType>();
		for(MetaPredicate metap : getLifelinesPostMetaPredicates())
			CFLifelinesPostPredicateTypes.add(metap.predicatetype);
		return CFLifelinesPostPredicateTypes;
	}
	
	public ArrayList<Predicate> getOperandsPredicates(){
		ArrayList<Predicate> operandspredicates = new ArrayList<Predicate>();
		for (String on: mades_combinedfragment.getOperandsNames())
			operandspredicates.add(new Predicate(mades_combinedfragment.getPredicateName() + '_' + on));
		return operandspredicates;
	}
	
	public Predicate getOpiLjPredicate(int i, int j){ // returns predicate of Lifeline_j of Operand_i
		return new Predicate(getOperandsPredicates().get(i).getPredicateName() + '_' + mades_combinedfragment.getLifelines().get(j).getName());
	}
	
	public ArrayList<BooleanFormulae> getGuards(){
		ArrayList<BooleanFormulae> guards = new ArrayList<BooleanFormulae>(); 
		for (int i=0;i<getOperandsPredicates().size();i++){                           
			guards.add(new SInteractionOperand(mades_combinedfragment.getOperands().get(i)).getGuard());
		}
//		guards.add(new Predicate("guard"));
		return guards;
	}
	
//	public Predicate getLifelinePostPredicate(int index){
//		return getLifelinesPostPredicates().get(index);
//	}
	
	public String getOperator() {
		return this.mades_combinedfragment.getOperatorName();
	}
	
	public ArrayList<Predicate> getFirstMessages(String lifelineName){//returns predicate of messages that can possibly be first message of CombinedFragment.
		ArrayList<Predicate> firstMessages = new ArrayList<Predicate>();
		for (int i = 0; i < getLifelines().size(); i++) {
			if (getLifelines().get(i).getName() == lifelineName)
				for (InteractionOperand operand:mades_combinedfragment.getOperands()) {
					if (new SInteractionOperand(operand).getFirstMessages(i) != null)
						firstMessages.addAll(new SInteractionOperand(operand).getFirstMessages(i));
				}
		}
		if (firstMessages.size() == 0)
			return null;
		return firstMessages;
	}

	public ArrayList<Predicate> getLastMessages(String lifelineName){//returns predicate of messages that can possibly be last message of CombinedFragment.
		ArrayList<Predicate> lastMessages = new ArrayList<Predicate>();
		for (int i = 0; i < getLifelines().size(); i++) {
			if (getLifelines().get(i).getName() == lifelineName)
				for (InteractionOperand operand:mades_combinedfragment.getOperands()) {
					if (new SInteractionOperand(operand).getLastMessages(i) != null)
						lastMessages.addAll(new SInteractionOperand(operand).getLastMessages(i));
				}
		}
		if (lastMessages.size() == 0)
			return null;
		return lastMessages;
	}
}
