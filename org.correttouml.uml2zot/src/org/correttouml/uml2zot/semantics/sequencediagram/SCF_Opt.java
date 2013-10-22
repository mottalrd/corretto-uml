package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;
import org.correttouml.uml.MadesModel;
import org.correttouml.uml.diagrams.sequencediagram.CF_Opt;
import org.correttouml.uml.diagrams.sequencediagram.CombinedFragment;
import org.correttouml.uml2zot.semantics.util.bool.*;
import org.correttouml.uml2zot.semantics.util.fun.SomPIn_i;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;
import org.correttouml.uml.diagrams.sequencediagram.*;

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
		f.add(new SBorders(getPredicate(), getSDPredicate().getPredicateStop()).getFun());
		f.addAll(new SLink_Pre_Post(this, config).getFormulae());
		// // order(CF_Opt_Start, CF_Opt_End, True, SD_Stop, True)
		f.add(new SOrder(getPredicate().getPredicateStart(), getPredicate().getPredicateEnd(), SD_Stop, true).getFun());
		// // if (config.combine == “ws”){
		if(config.combine == ConfigCombine.WS){
			// // ||i=1 to n(CF_Opt_Li_Start) => CF_Opt
			f.add(new Implies(new Or(getLifelinesStartPredicates()), getPredicate()));
			// // CF_Opt_Start => ||i=1 to n(CF_Opt_Li_Start) 
			f.add(new Implies(getPredicate().getPredicateStart(), new Or(getLifelinesStartPredicates())));
			// //  &&j=1 to n order(CF_Opt_Lj_Start, CF_Opt_Op_Lj_Start, CF_Opt_Op, (SD_End || SD_Stop || CF_Opt_End || CF_Opt_Op_Lj_End), True)
			for (int i = 0; i < n; i++) 
				f.add(new SOrder(getLifelinesStartPredicates().get(i), getOpiLjPredicate(0, i).getPredicateStart(), getOperandsPredicates().get(0), SD_Stop, true).getFun());
			// // &&j=1 to n orderMonoD(CF_Opt_Op_Lj_End, CF_Opt_Lj_End, True, (SD_End || SD_Stop || CF_Opt_End || CF_Opt_Op_Lj_End), True)
			for (int i = 0; i < n; i++) 
				f.add(new SOrderMonoD(getOpiLjPredicate(0, i).getPredicateEnd(), getLifelinesEndPredicates().get(i), SD_Stop, true).getFun());
			// // CF_Opt_Op_End => ((||j=1 to nCF_Opt_Op_Li_End) && (&&j=1 to nsomPIn_i(CF_Opt_Op_Lj_End, CF_Opt_Op)))
			ArrayList<BooleanFormulae> tempf1 = new ArrayList<BooleanFormulae>();
			ArrayList<BooleanFormulae> tempf2 = new ArrayList<BooleanFormulae>();
			for (int i = 0; i < n; i++){
				tempf1.add(getOpiLjPredicate(0, i).getPredicateEnd());
				tempf2.add(new SSomPIn_i(getOpiLjPredicate(0, i).getPredicateEnd(), getOperandsPredicates().get(0)).getFun());
			}
			f.add(new Implies(getOperandsPredicates().get(0).getPredicateEnd(), new And(new Or(tempf1), new And(tempf2))));
			// // (CF_Opt_Start && !!CF_Opt_Guard)  => &&j=1 to nsomFIn_i(CF_Opt_Lj_Start && CF_Opt_Lj_End, CF_Opt)
			if (getGuards().get(0) != null){
			tempf1.clear();
			for (int i = 0; i < n; i++)
				tempf1.add(new SSomFIn_i(new And(getLifelinesStartPredicates().get(i), getLifelinesEndPredicates().get(i)), getPredicate()).getFun());
			f.add(new Implies(
					new And(getPredicate().getPredicateStart(), new Not(getGuards().get(0))),
					new And(tempf1)));
			}
			// // (CF_Opt_Start && CF_Opt_Guard) => (CF_Opt_Op_Start || (!!CF_Opt_Op_Start && &&j=1 to nsomFIn_i(CF_Opt_Lj_Start && CF_Opt_Lj_End, CF_Opt)))
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
				// // CF_Opt_Start => (CF_Opt_Op_Start || (!!CF_Opt_Op_Start && &&j=1 to nsomFIn_i(CF_Opt_Lj_Start && CF_Opt_Lj_End, CF_Opt)))
				f.add(new Implies(
						getPredicate().getPredicateStart(),
						new Or(
								getOperandsPredicates().get(0).getPredicateStart(), 
								new And(new Not(getOperandsPredicates().get(0).getPredicateStart()), new And(tempf1)))));
				}
			// // CF_Opt_Op_End => CF_Opt_End
			f.add(new Implies(getOperandsPredicates().get(0).getPredicateEnd(), getPredicate().getPredicateEnd()));
			// // CF_Opt_End => ((||j=1 to nCF_Opt_Li_End) && (&&j=1 to nsomPIn_i(CF_Opt_Lj_End, CF_Opt)))
			tempf1.clear();
			for (int i = 0; i < n; i++)
				tempf1.add(new SomPIn_i(getLifelinePredicate(i).getPredicateEnd(), getPredicate()));
			f.add(new Implies(getPredicate().getPredicateEnd(), new And(new Or(getLifelinesEndPredicates()), new And(tempf1))));
			//we have this axiom in scombine
			/*// // CF_Opt_Op_Start => ||j=1 to n (CF_Opt_Op_Lj_Start) 
			tempf1.clear();
			for (int i = 0; i < n; i++)
				tempf1.add(getOpiLjPredicate(0, i).getPredicateStart());
			f.add(new Implies(getOperandsPredicates().get(0).getPredicateStart(), new Or(tempf1)));*/
			
//			// // borders(CF_Opt_Op, SD_End || SD_Stop) //// we have this axiom in scombine
//			f.add(new SBorders(getOperandsPredicates().get(0), SD_Stop).getFun());
			// // CF_Opt_Op_Start => CF_Opt_Guard && CF_Opt_Start
			if (getGuards().get(0) != null)
				f.add(new Implies(getOperandsPredicates().get(0).getPredicateStart(), new And(getGuards().get(0), getPredicate().getPredicateStart())));
			else
				f.add(new Implies(getOperandsPredicates().get(0).getPredicateStart(), getPredicate().getPredicateStart()));
//			for (int i = 0; i < n; i++)//// we have this axiom in scombine
//			// // borders(CF_Opt_Op_Li, SD_End || SD_Stop)
//				f.add(new SBorders(getOpiLjPredicate(0, i), SD_Stop).getFun());
			
		
		}//end "ws"
		// // if (config.combine == “sync”){
		else if (config.combine == ConfigCombine.SYNC){
//			// // borders(CF_Opt, SD_End || SD_Stop) //// we have these axiom in scombine
//			f.add(new SBorders(getPredicate(), SD_Stop).getFun());
//			// // borders(CF_Opt_Op, SD_End || SD_Stop)
//			f.add(new SBorders(getOperandsPredicates().get(0), SD_Stop).getFun());
			
			// // (CF_Opt_Start && !! CF_Opt_Guard) => CF_Opt_End
			if (getGuards().get(0) != null)
				f.add(new Implies(new And(getPredicate().getPredicateStart(), new Not(getGuards().get(0))), getPredicate().getPredicateEnd()));
			// // (CF_Opt_Start && CF_Opt_Guard) => (CF_Opt_Op_Start || (!!CF_Opt_Op_Start && CF_Opt_End))
			BooleanFormulae tempf1;
			if (getGuards().get(0) != null)
				tempf1 = new And(getPredicate().getPredicateStart(),getGuards().get(0));
			else
				tempf1 = getPredicate().getPredicateStart();
			f.add(new Implies(
					tempf1, 
					new Or(getOperandsPredicates().get(0).getPredicateStart(), new And(new Not(getOperandsPredicates().get(0).getPredicateStart()), getPredicate().getPredicateEnd()))));
			// // CF_Opt_End => (CF_Opt_Start  || CF_Opt_Op_End)
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