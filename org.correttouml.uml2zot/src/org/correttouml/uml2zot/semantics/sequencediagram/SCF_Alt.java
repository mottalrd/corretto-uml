package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.grammars.booleanExpressions.booleanExpression;
import org.correttouml.uml.diagrams.sequencediagram.CF_Alt;
import org.correttouml.uml.diagrams.sequencediagram.CombinedFragment;
import org.correttouml.uml.diagrams.sequencediagram.InteractionOperand;
import org.correttouml.uml2zot.semantics.util.bool.*;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/

public class SCF_Alt extends SCombinedFragment implements SCombinedFragmentItf{
	private CF_Alt mades_cf_alt;
	/// DONT USE getOperandsPredicates/////////////////////////=>getAltOperandsPredicates
	// DONT USE getFormulae ::::> getFun()
	public SCF_Alt(CF_Alt cfalt, Config config) {
		super((CombinedFragment)cfalt, config);
		this.mades_cf_alt = cfalt;
	}

	@Override
	public ArrayList<BooleanFormulae> getSemantics() {
		
		ArrayList<BooleanFormulae> f = new ArrayList<BooleanFormulae>();
		Predicate SD_Stop = getSDPredicate().getPredicateStop();
		int n = getLifelines().size();
		int m = getOperandsPredicates().size();
		// // borders(CF_Alt, SD_End || SD_Stop)
		// // link_Pre_Post(CF_Alt, config)
		f.add(new SBorders(getPredicate(), getSDPredicate().getPredicateStop()).getFun());
		f.addAll(new SLink_Pre_Post(this, config).getFormulae());
		// // order(CF_Alt_Start, CF_Alt_End, True, SD_Stop, True)
		f.add(new SOrder(getPredicate().getPredicateStart(), getPredicate().getPredicateEnd(), SD_Stop, true).getFun());
		// // if (config.combine == “ws”){
		if(config.combine == ConfigCombine.WS){
			// // ||i=1 to n(CF_Alt_Li_Start) => CF_Alt
			f.add(new Implies(new Or(getLifelinesStartPredicates()), getPredicate()));
			// // CF_Alt_Start => ||i=1 to n(CF_Alt_Li_Start)
			f.add(new Implies(getPredicate().getPredicateStart(), new Or(getLifelinesStartPredicates())));
			// // for (i=1; i<=m; i++){ //for all operands
			for (int i = 0; i < m; i++) { 
			// //     &&j=1 to n order(CF_Alt_Lj_Start, CF_Alt_Opi_Lj_Start, CF_Alt_Opi, (SD_End || SD_Stop || CF_Alt_End || CF_Alt_Opi_Lj_End), True)
				for (int j = 0; j < n; j++) {
				f.add(new SOrder(getLifelinesStartPredicates().get(j),getAltOpiLjPredicate(i, j).getPredicateStart(),getAltOperandsPredicates().get(i), SD_Stop, true).getFun());
				}
			// //     &&j=1 to n orderMonoD(CF_Alt_Opi_Lj_End, CF_Alt_Lj_End, True, (SD_End || SD_Stop || CF_Alt_End || CF_Alt_Opi_Lj_End), True)
				for (int j = 0; j < n; j++) {
					f.add(new SOrderMonoD(getAltOpiLjPredicate(i, j).getPredicateEnd(), getLifelinesEndPredicates().get(j), SD_Stop, true).getFun());
				}
			// // }
			}

			// // if CF_Alt has Else operand {
			if (getAltOpElsePredicate() != null) {
			// //     &&j=1 to n order(CF_Alt_Lj_Start, CF_Alt_OpElse_Lj_Start, CF_Alt_OpElse, (SD_End || SD_Stop || CF_Alt_End || CF_Alt_OpElse_Lj_End), True)
				for (int j = 0; j < n; j++) {
					f.add(new SOrder(getLifelinesStartPredicates().get(j), getAltOpElseLjPredicate(j).getPredicateStart(), getAltOpElsePredicate(), SD_Stop, true).getFun());
				}
			// //     &&j=1 to n orderMonoD(CF_Alt_OpElse_Lj_End, CF_Alt_Lj_End, True, (SD_End || SD_Stop || CF_Alt_End || CF_Alt_Opi_Lj_End), True)
				for (int j = 0; j < n; j++) {
					f.add(new SOrderMonoD(getAltOpElseLjPredicate(j).getPredicateEnd(), getLifelinesEndPredicates().get(j), SD_Stop, true).getFun());
				}
			// //     CF_Alt_OpElse_Start <=> (!! (||i=1 to n CF_Alt_Guardi) && CF_Alt_Start)
				f.add(new Iff(getAltOpElsePredicate().getPredicateStart(), new And(new Not(new Or(getAltGuards())),getPredicate().getPredicateStart())));
			// //     if (config.what == “nondeterministically”)
				if (config.what == ConfigWhat.NONDETERMINISTICALLY) {

			// //         CF_Alt_Start => (||i=1 to m(CF_Alt_Opi_Start && !!(||j=1 to m,j!=iCF_Alt_Opj_Start))) || CF_Alt_OpElse_Start
					if (m == 1) {//////[CF_Alt_Start => (CF_Alt_Op0_Start || CF_Alt_OpElse_Start)]
						f.add(new Implies(getPredicate().getPredicateStart(), new Or(getAltOperandsPredicates().get(0).getPredicateStart(), getAltOpElsePredicate().getPredicateStart())));	
					}
					else {
					ArrayList<BooleanFormulae> tempf1 = new ArrayList<BooleanFormulae>();
					ArrayList<BooleanFormulae> tempf2 = new ArrayList<BooleanFormulae>();
					for (int i = 0; i < m; i++) {
						for (int j = 0; j < m; j++) {
							if (i != j)
								tempf2.add(getAltOperandsPredicates().get(j).getPredicateStart());
						}
						tempf1.add(new And(getAltOperandsPredicates().get(i).getPredicateStart(), new Not(new Or(tempf2))));
					}
					
					f.add(new Implies(getPredicate().getPredicateStart(), new Or(new Or(tempf1), getAltOpElsePredicate().getPredicateStart())));
					}
				}
				
			// //     (CF_Alt_OpElse_End || (||i=1 to m CF_Alt_Opi_End)) <=> CF_Alt_End
				ArrayList<BooleanFormulae> tempf1 = new ArrayList<BooleanFormulae>();
				for (int i = 0; i < m; i++) {
					tempf1.add(getAltOperandsPredicates().get(i).getPredicateEnd());
				}
				f.add(new Iff(new Or(getAltOpElsePredicate().getPredicateEnd(), new Or(tempf1)), getPredicate().getPredicateEnd()));
			// // }
			}
			//####
			
			
			
			
			// //  &&j=1 to n order(CF_Alt_Lj_Start, CF_Alt_Op_Lj_Start, CF_Alt_Op, (SD_End || SD_Stop || CF_Alt_End || CF_Alt_Op_Lj_End), True)
			for (int i = 0; i < n; i++) 
				f.add(new SOrder(getLifelinesStartPredicates().get(i), getOpiLjPredicate(0, i).getPredicateStart(), getOperandsPredicates().get(0), SD_Stop, true).getFun());
			// // &&j=1 to n orderMonoD(CF_Alt_Op_Lj_End, CF_Alt_Lj_End, True, (SD_End || SD_Stop || CF_Alt_End || CF_Alt_Op_Lj_End), True)
			for (int i = 0; i < n; i++) 
				f.add(new SOrderMonoD(getOpiLjPredicate(0, i).getPredicateEnd(), getLifelinesEndPredicates().get(i), SD_Stop, true).getFun());
			// // CF_Alt_Op_End => ((||j=1 to nCF_Alt_Op_Li_End) && (&&j=1 to nsomPIn_i(CF_Alt_Op_Lj_End, CF_Alt_Op)))
			ArrayList<BooleanFormulae> tempf1 = new ArrayList<BooleanFormulae>();
			ArrayList<BooleanFormulae> tempf2 = new ArrayList<BooleanFormulae>();
			for (int i = 0; i < n; i++){
				tempf1.add(getOpiLjPredicate(0, i).getPredicateEnd());
				tempf2.add(new SSomPIn_i(getOpiLjPredicate(0, i).getPredicateEnd(), getOperandsPredicates().get(0)).getFun());
			}
			f.add(new Implies(getOperandsPredicates().get(0).getPredicateEnd(), new And(new Or(tempf1), new And(tempf2))));
			// // (CF_Alt_Start && !!CF_Alt_Guard)  => &&j=1 to nsomFIn_i(CF_Alt_Lj_Start && CF_Alt_Lj_End, CF_Alt)
			if (getGuards().get(0) != null){
			tempf1.clear();
			for (int i = 0; i < n; i++)
				tempf1.add(new SSomFIn_i(new And(getLifelinesStartPredicates().get(i), getLifelinesEndPredicates().get(i)), getPredicate()).getFun());
			f.add(new Implies(
					new And(getPredicate().getPredicateStart(), new Not(getGuards().get(0))),
					new And(tempf1)));
			}
			// // (CF_Alt_Start && CF_Alt_Guard) => (CF_Alt_Op_Start || (!!CF_Alt_Op_Start && &&j=1 to nsomFIn_i(CF_Alt_Lj_Start && CF_Alt_Lj_End, CF_Alt)))
			tempf1.clear();
			for (int i = 0; i < n; i++)
				tempf1.add(new SSomFIn_i(new And(getLifelinesStartPredicates().get(i), getLifelinesEndPredicates().get(i)), getPredicate()).getFun());
			if (getGuards().get(0) != null) {
				f.add(new Implies(
						new And(getPredicate().getPredicateStart(), getGuards().get(0)),
						new Or(
								getOperandsPredicates().get(0).getPredicateStart(), 
								new And(new Not(getOperandsPredicates().get(0).getPredicateStart()), new And(tempf1)))));
			}else {// // in case of no guard (implicit true) this formula will be added.
				// // CF_Alt_Start => (CF_Alt_Op_Start || (!!CF_Alt_Op_Start && &&j=1 to nsomFIn_i(CF_Alt_Lj_Start && CF_Alt_Lj_End, CF_Alt)))
				f.add(new Implies(
						getPredicate().getPredicateStart(),
						new Or(
								getOperandsPredicates().get(0).getPredicateStart(), 
								new And(new Not(getOperandsPredicates().get(0).getPredicateStart()), new And(tempf1)))));
				}
			// // CF_Alt_Op_End => CF_Alt_End
			f.add(new Implies(getOperandsPredicates().get(0).getPredicateEnd(), getPredicate().getPredicateEnd()));
			// // CF_Alt_End => ((||j=1 to nCF_Alt_Li_End) && (&&j=1 to nsomPIn_i(CF_Alt_Lj_End, CF_Alt)))
			tempf1.clear();
			for (int i = 0; i < n; i++)
				tempf1.add(new SSomPIn_i(getLifelinePredicate(i).getPredicateEnd(), getPredicate()));
			f.add(new Implies(getPredicate().getPredicateEnd(), new And(new Or(getLifelinesEndPredicates()), new And(tempf1))));
			//we have this axiom in scombine
			/*// // CF_Alt_Op_Start => ||j=1 to n (CF_Alt_Op_Lj_Start) 
			tempf1.clear();
			for (int i = 0; i < n; i++)
				tempf1.add(getOpiLjPredicate(0, i).getPredicateStart());
			f.add(new Implies(getOperandsPredicates().get(0).getPredicateStart(), new Or(tempf1)));*/
			
//			// // borders(CF_Alt_Op, SD_End || SD_Stop) //// we have this axiom in scombine
//			f.add(new SBorders(getOperandsPredicates().get(0), SD_Stop).getFun());
			// // CF_Alt_Op_Start => CF_Alt_Guard && CF_Alt_Start
			if (getGuards().get(0) != null)
				f.add(new Implies(getOperandsPredicates().get(0).getPredicateStart(), new And(getGuards().get(0), getPredicate().getPredicateStart())));
			else
				f.add(new Implies(getOperandsPredicates().get(0).getPredicateStart(), getPredicate().getPredicateStart()));
//			for (int i = 0; i < n; i++)//// we have this axiom in scombine
//			// // borders(CF_Alt_Op_Li, SD_End || SD_Stop)
//				f.add(new SBorders(getOpiLjPredicate(0, i), SD_Stop).getFun());
			
		
		}//end "ws"
		// // if (config.combine == “sync”){
		else if (config.combine == ConfigCombine.SYNC){
//			// // borders(CF_Alt, SD_End || SD_Stop) //// we have these axiom in scombine
//			f.add(new SBorders(getPredicate(), SD_Stop).getFun());
//			// // borders(CF_Alt_Op, SD_End || SD_Stop)
//			f.add(new SBorders(getOperandsPredicates().get(0), SD_Stop).getFun());
			
			// // (CF_Alt_Start && !! CF_Alt_Guard) => CF_Alt_End
			if (getGuards().get(0) != null)
				f.add(new Implies(new And(getPredicate().getPredicateStart(), new Not(getGuards().get(0))), getPredicate().getPredicateEnd()));
			// // (CF_Alt_Start && CF_Alt_Guard) => (CF_Alt_Op_Start || (!!CF_Alt_Op_Start && CF_Alt_End))
			BooleanFormulae tempf1;
			if (getGuards().get(0) != null)
				tempf1 = new And(getPredicate().getPredicateStart(),getGuards().get(0));
			else
				tempf1 = getPredicate().getPredicateStart();
			f.add(new Implies(
					tempf1, 
					new Or(getOperandsPredicates().get(0).getPredicateStart(), new And(new Not(getOperandsPredicates().get(0).getPredicateStart()), getPredicate().getPredicateEnd()))));
			// // CF_Alt_End => (CF_Alt_Start  || CF_Alt_Op_End)
			f.add(new Implies(getPredicate().getPredicateEnd(), new Or(getPredicate().getPredicateStart(), getOperandsPredicates().get(0).getPredicateEnd())));
			// // CF_Alt_Op_Start => (CF_Alt_Start && CF_Alt_Guard)
			if (getGuards().get(0) != null)
				f.add(new Implies(getOperandsPredicates().get(0).getPredicateStart(), new And(getGuards().get(0), getPredicate().getPredicateStart())));
			else
				f.add(new Implies(getOperandsPredicates().get(0).getPredicateStart(), getPredicate().getPredicateStart()));
			// // CF_Alt_Op_End => CF_Alt_End
			f.add(new Implies(getOperandsPredicates().get(0).getPredicateEnd(), getPredicate().getPredicateEnd()));
		}
		// // combine(CF_Alt_Op, config)
		f.addAll(new SCombine(mades_combinedfragment.getOperands().get(0), config).getFormulae());
		
		return f;
	}
	
	public ArrayList<Predicate> getAltOperandsPredicates(){
		ArrayList<Predicate> altoperandspredicates = new ArrayList<Predicate>();
		for (InteractionOperand io: mades_combinedfragment.getOperands()) {
			if (io.getGuard() != null)
				altoperandspredicates.add(new Predicate(mades_combinedfragment.getPredicateName() + '_' + io.getName()));
		}
		return altoperandspredicates;
	}
	
	public Predicate getAltOpElsePredicate(){
		for (InteractionOperand io: mades_combinedfragment.getOperands()) {
			if (io.getGuard() == null)
				new Predicate(mades_combinedfragment.getPredicateName() + '_' + io.getName());
		}
		return null;
	}
	
	public Predicate getAltOpiLjPredicate(int i, int j){ // returns predicate of Lifeline_j of Operand_i
		return new Predicate(getAltOperandsPredicates().get(i).getPredicateName() + '_' + mades_combinedfragment.getLifelines().get(j).getName());
	}
	
	public Predicate getAltOpElseLjPredicate(int j){ // returns predicate of Lifeline_j of OpElse
		if (getAltOpElsePredicate() == null)
			return null;
		return new Predicate(getAltOpElsePredicate().getPredicateName() + '_' + mades_combinedfragment.getLifelines().get(j).getName());
	}
	
	public ArrayList<BooleanFormulae> getAltGuards(){
		ArrayList<BooleanFormulae> altguards = new ArrayList<BooleanFormulae>(); 
		for (int i=0;i<getAltOperandsPredicates().size();i++){                           
			altguards.add(new SInteractionOperand(mades_combinedfragment.getOperands().get(i)).getGuard());
		}
//		guards.add(new Predicate("guard"));
		return altguards;
	}
	
}