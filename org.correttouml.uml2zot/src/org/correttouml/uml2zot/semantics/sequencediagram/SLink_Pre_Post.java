package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.uml2zot.semantics.sequencediagram.SCombinedFragment.PredicateType;
import org.correttouml.uml2zot.semantics.util.bool.And;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.bool.Implies;
import org.correttouml.uml2zot.semantics.util.bool.MetaBooleanFormulae;
import org.correttouml.uml2zot.semantics.util.bool.Not;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;

/**
 *@author Mohammad Mehdi Pourhashem Kallehbasti 
 */
public class SLink_Pre_Post implements BooleanFormulae, MetaBooleanFormulae{
	//[documentation]: \Dropbox\SharePolimi\Documentation\Sequence Diagram\Combined_Fragment\Modular_Semantics\[Link_Pre_Post].docx
	private String comment="";
	SCombinedFragment smodule;
	Config config;  

	public SLink_Pre_Post(SCombinedFragment smodule, Config config){
		this.smodule = smodule;
		this.config = config;
	}
	
	public SLink_Pre_Post(SCombinedFragment smodule, Config config, String comment){
		this.smodule = smodule;
		this.config = config;
		this.comment = comment;
	}

	@Override
	public String toString() {
		return getFormula().toString();
	}

	@Override
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String getComment() {
		return this.comment;
	}

	public BooleanFormulae getFormula() {
		return new And(getFormulae());
	}
	
	public ArrayList<BooleanFormulae> getFormulae() {
		try {
			ArrayList<BooleanFormulae> f = new ArrayList<BooleanFormulae>();
			int n = smodule.getLifelines().size();
			Predicate SD_Stop = smodule.getSDPredicate().getPredicateStop();
			// // if (config.combine == “ws”){
				if(config.combine == ConfigCombine.WS){
					for (int i = 0; i < n; i++){
						// // borders(CF_X_Li, SD_End || SD_Stop)
						f.add(new SBorders(smodule.getLifelinePredicate(i), SD_Stop).getFun());
						// // if CF_X_Li_Pre is start predicate of a fragment(e.g. SD_Li_Start)
						// // order(CF_X_Li_Pre, CF_X_Li_Start, True , (SD_End || SD_Stop || CF_X_End), True)
						// // Else
						// // order(CF_X_Li_Pre, CF_X_Li_Start, True , (SD_End || SD_Stop || CF_X_End), False)
						boolean isconcurrent = false;
						if ((smodule.getLifelinesPrePredicateTypes().get(i) == PredicateType.SDStart) || (smodule.getLifelinesPrePredicateTypes().get(i) == PredicateType.CFStart))
							isconcurrent = true;
						f.add(new SOrder(smodule.getLifelinesPrePredicates().get(i), smodule.getLifelinePredicate(i).getPredicateStart(), SD_Stop, isconcurrent).getFun());
						// //     if CF_X_Li_Post is End predicate of a fragment(e.g. SD_Li_End)
						if ((smodule.getLifelinesPostPredicateTypes().get(i) == PredicateType.SDEnd) || (smodule.getLifelinesPostPredicateTypes().get(i) == PredicateType.CFEnd))
							// // order(CF_X_Li_End, CF_X_Li_Post, True , (SD_End || SD_Stop || CF_X_End), True)
							f.add(new SOrder(smodule.getLifelinePredicate(i).getPredicateEnd(), smodule.getLifelinesPostPredicates().get(i), SD_Stop, true).getFun());
						else{
							// // order(CF_X_Li_End, CF_X_Li_Post, (SD_End || SD_Stop || CF_X_End), True)
							f.add(new SOrder(smodule.getLifelinePredicate(i).getPredicateEnd(), smodule.getLifelinesPostPredicates().get(i), SD_Stop, true).getFun());
							// // !!somPIn_i(CF_X_Li_Start && CF_X_Li_End, CF_X) => order(CF_X_Li_End, CF_X_Li_Post, , (SD_End || SD_Stop || CF_X_End), False)
							f.add(new Implies(new Not(new SSomPIn_i(new And(smodule.getLifelinePredicate(i).getPredicateStart(), smodule.getLifelinePredicate(i).getPredicateEnd()), smodule.getPredicate()).getFun()), new SOrder(smodule.getLifelinePredicate(i).getPredicateEnd(), smodule.getLifelinesPostPredicates().get(i), SD_Stop, false).getFun()));
						}
					}
					// // if (config.combine == “sync”){
				}else if(config.combine == ConfigCombine.SYNC){
					for (int i = 0; i < n; i++){
						// //  if CF_X_Li_Pre is start predicate of a fragment(e.g. SD_Li_Start)
						// // order(CF_X_Li_Pre, CF_X_Start, True , (SD_End || SD_Stop || CF_X_End), True)
						// // Else
						// // order(CF_X_Li_Pre, CF_X_Start, True , (SD_End || SD_Stop || CF_X_End), False)
						boolean isconcurrent = false;
						if ((smodule.getLifelinesPrePredicateTypes().get(i) == PredicateType.SDStart) || (smodule.getLifelinesPrePredicateTypes().get(i) == PredicateType.CFStart))
							isconcurrent = true;
						f.add(new SOrder(smodule.getLifelinesPrePredicates().get(i), smodule.getPredicate().getPredicateStart(), SD_Stop, isconcurrent).getFun());
						// //     if CF_X_Li_Post is End predicate of a fragment(e.g. SD_Li_End)
						if ((smodule.getLifelinesPostPredicateTypes().get(i) == PredicateType.SDEnd) || (smodule.getLifelinesPostPredicateTypes().get(i) == PredicateType.CFEnd))
							// // order(CF_X_End, CF_X_Li_Post, True , (SD_End || SD_Stop || CF_X_End), True)
							f.add(new SOrder(smodule.getPredicate().getPredicateEnd(), smodule.getLifelinesPostPredicates().get(i), SD_Stop, true).getFun());
						else{
							// // order(CF_X_End, CF_X_Li_Post, (SD_End || SD_Stop || CF_X_End), True)
							f.add(new SOrder(smodule.getPredicate().getPredicateEnd(), smodule.getLifelinesPostPredicates().get(i), SD_Stop, true).getFun());
							// // !!somPIn_i(CF_X_Start && CF_X_End, CF_X) => order(CF_X_End, CF_X_Li_Post, , (SD_End || SD_Stop || CF_X_End), False)
							f.add(new Implies( new Not(new SSomPIn_i(new And(smodule.getPredicate().getPredicateStart(), smodule.getPredicate().getPredicateEnd()), smodule.getPredicate()).getFun()), new SOrder(smodule.getPredicate().getPredicateEnd(), smodule.getLifelinesPostPredicates().get(i), SD_Stop, false).getFun()));
						}
					}
				}
				return f;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

