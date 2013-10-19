package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.uml.MadesModel;
import org.correttouml.uml.diagrams.sequencediagram.CF_Opt;
import org.correttouml.uml.diagrams.sequencediagram.CombinedFragment;
import org.correttouml.uml2zot.semantics.util.bool.*;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;
import org.correttouml.uml.diagrams.sequencediagram.*;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.GetGrammarElement;
/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/
public class SCF_Opt extends SCombinedFragment implements SCombinedFragmentItf{
	private CF_Opt mades_cf_opt;
//	public SCF_Opt(CF_Opt cfopt) {
//		super((CombinedFragment)cfopt);
//		this.mades_cf_opt = cfopt;
//	}
	
	public SCF_Opt(CF_Opt cfopt, Config config) {
		super((CombinedFragment)cfopt, config);
		this.mades_cf_opt = cfopt;
	}

	@Override
	public ArrayList<BooleanFormulae> getSemantics() {
		ArrayList<BooleanFormulae> f = new ArrayList<BooleanFormulae>();
		Predicate SD_Stop = getSDPredicate().getPredicateStop();
		int n = getLifelines().size();
		// // borders(CF_Opt, SD_End || SD_Stop)
		// // link_Pre_Post(CF_Opt, config)
		f.addAll(new SBorders(getPredicate(), getSDPredicate().getPredicateStop()).getFormulae());
		f.addAll(new SLink_Pre_Post(this, config).getFormulae());
		// // order(CF_Opt_Start, CF_Opt_End, True, SD_Stop, True)
		f.add(new SOrder(getPredicate().getPredicateStart(), getPredicate().getPredicateEnd(), SD_Stop, true).getFormula());
		// // if (config.combine == “ws”){
		if(config.combine == ConfigCombine.WS){
			// // ||i=1 to n(CF_Opt_Li_Start) => CF_Opt
			f.add(new Implies(new Or(getLifelinesStartPredicates()), getPredicate()));
			// // CF_Opt_Start => ||i=1 to n(CF_Opt_Li_Start) 
			f.add(new Implies(getPredicate().getPredicateStart(), new Or(getLifelinesStartPredicates())));
			// //  &&j=1 to n order(CF_Opt_Lj_Start, CF_Opt_Op_Lj_Start, CF_Opt_Op, (SD_End || SD_Stop || CF_Opt_End || CF_Opt_Op_Lj_End), True)
			for (int i = 0; i < n; i++) 
				f.add(new SOrder(getLifelinesStartPredicates().get(i), getOpiLjPredicate(0, i).getPredicateStart(), getOperandsPredicates().get(0), SD_Stop, true).getFormula());
			// // &&j=1 to n order(CF_Opt_Op_Lj_End, CF_Opt_Lj_End, CF_Opt_Op, (SD_End || SD_Stop || CF_Opt_End || CF_Opt_Op_Lj_End), True)
			for (int i = 0; i < n; i++) 
				f.add(new SOrder(getOpiLjPredicate(0, i).getPredicateEnd(), getLifelinesEndPredicates().get(i), getOperandsPredicates().get(0), SD_Stop, true).getFormula());
			// // CF_Opt_Op_End => ((||j=1 to nCF_Opt_Op_Li_End) && (&&j=1 to nsomPIn_i(CF_Opt_Op_Lj_End, CF_Opt_Op)))
			ArrayList<BooleanFormulae> tempf1 = new ArrayList<BooleanFormulae>();
			ArrayList<BooleanFormulae> tempf2 = new ArrayList<BooleanFormulae>();
			for (int i = 0; i < n; i++){
				tempf1.add(getOpiLjPredicate(0, i).getPredicateEnd());
				tempf2.add(new SSomPIn_i(getOpiLjPredicate(0, i).getPredicateEnd(), getOperandsPredicates().get(0)).getFormula());
			}
			f.add(new Implies(getOperandsPredicates().get(0).getPredicateEnd(), new And(new Or(tempf1), new And(tempf2))));
			// // (CF_Opt_Start && !!CF_Opt_Guard)  => &&j=1 to nsomFIn_i(CF_Opt_Lj_Start && CF_Opt_Lj_End, CF_Opt)
			if (getGuards().get(0) != null){
			tempf1.clear();
			for (int i = 0; i < n; i++)
				tempf1.add(new SSomFIn_i(new And(getOpiLjPredicate(0, i).getPredicateStart(),getOpiLjPredicate(0, i).getPredicateEnd()), getPredicate()).getFormula());
			f.add(new Implies(
					new And(getPredicate().getPredicateStart(), new Not(getGuards().get(0))),
					new And(tempf1)));
			}
			// // (CF_Opt_Start && CF_Opt_Guard) => (CF_Opt_Op_Start || (!!CF_Opt_Op_Start && CF_Opt_End))
			if (getGuards().get(0) != null)
			f.add(new Implies(
					new And(getPredicate().getPredicateStart(), getGuards().get(0)),
					new Or(
							getOperandsPredicates().get(0).getPredicateStart(), 
							new And(new Not(getOperandsPredicates().get(0).getPredicateStart()), getPredicate().getPredicateEnd()))));
			else // // in case of no guard (implicit true) this formula will be added.
				// //::::> CF_Opt_Start => (CF_Opt_Op_Start || (!!CF_Opt_Op_Start && CF_Opt_End))
				f.add(new Implies(
						getPredicate().getPredicateStart(),
						new Or(
								getOperandsPredicates().get(0).getPredicateStart(), 
								new And(new Not(getOperandsPredicates().get(0).getPredicateStart()), getPredicate().getPredicateEnd()))));
			// // CF_Opt_Op_End => CF_Opt_End
			f.add(new Implies(getOperandsPredicates().get(0).getPredicateEnd(), getPredicate().getPredicateEnd()));
			// // borders(CF_Opt_Op, SD_End || SD_Stop)
			f.addAll(new SBorders(getOperandsPredicates().get(0), SD_Stop).getFormulae());
			// // CF_Opt_Op_Start => CF_Opt_Guard && CF_Opt_Start
			if (getGuards().get(0) != null)
				f.add(new Implies(getOperandsPredicates().get(0).getPredicateStart(), new And(getGuards().get(0), getPredicate().getPredicateStart())));
			else
				f.add(new Implies(getOperandsPredicates().get(0).getPredicateStart(), getPredicate().getPredicateStart()));
			for (int i = 0; i < n; i++)
			// // borders(CF_Opt_Op_Li, SD_End || SD_Stop)
				f.addAll(new SBorders(getOpiLjPredicate(0, i), SD_Stop).getFormulae());
			
		
		}//end "ws"
		// // if (config.combine == “sync”){
		else if (config.combine == ConfigCombine.SYNC){
			// // borders(CF_Opt, SD_End || SD_Stop)
			f.addAll(new SBorders(getPredicate(), SD_Stop).getFormulae());
			// // borders(CF_Opt_Op, SD_End || SD_Stop)
			f.addAll(new SBorders(getOperandsPredicates().get(0), SD_Stop).getFormulae());
			// // (CF_Opt_Start && !! CF_Opt_Guard) => CF_Opt_End
			if (getGuards().get(0) != null)
				f.add(new Implies(new And(getPredicate().getPredicateStart(), new Not(getGuards().get(0))), getPredicate().getPredicateEnd()));
			// // (CF_Opt_Start && CF_Opt_Guard) => (CF_Opt_Op_Start || (!!CF_Opt_Op_Start && CF_Opt_End))
			BooleanFormulae tempf1;
			if (getGuards().get(0) != null)
				tempf1 = new And(getPredicate().getPredicateStart(),getGuards().get(0));
			else{
				tempf1 = getPredicate().getPredicateStart();
				f.add(new Implies(
						tempf1, 
						new Or(getOperandsPredicates().get(0).getPredicateStart(), new And(new Not(getOperandsPredicates().get(0).getPredicateStart()), getPredicate().getPredicateEnd()))));
				}
			// // CF_Opt_End => (CF_Opt_Start  || CF_Opr_Op_End)
			f.add(new Implies(getPredicate().getPredicateEnd(), new Or(getPredicate().getPredicateStart(), getOperandsPredicates().get(0).getPredicateEnd())));
			// // CF_Opt_Op_Start => (CF_Opt_Start && CF_Opt_Guard)
			if (getGuards().get(0) != null)
				f.add(new Implies(getOperandsPredicates().get(0).getPredicateStart(), new And(getGuards().get(0), getPredicate().getPredicateStart())));
			else
				f.add(new Implies(getOperandsPredicates().get(0).getPredicateStart(), getPredicate().getPredicateStart()));
			// // CF_Opt_Op_End => CF_Opt_End
			f.add(new Implies(getOperandsPredicates().get(0).getPredicateEnd(), getPredicate().getPredicateEnd()));
		}
		// // combine(CF_Opt_Op, config)
		f.addAll(new SCombine(mades_combinedfragment.getOperands().get(0), config).getFormulae());
		
		return f;
	}
}