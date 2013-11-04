package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.uml2zot.semantics.util.bool.And;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;

/**
 *@author Mohammad Mehdi Pourhashem Kallehbasti 
 */
public class SLink_Pre_Post implements BooleanFormulae{
	//[documentation]: \Dropbox\SharePolimi\Documentation\Sequence Diagram\Combined_Fragment\Modular_Semantics\[Link_Pre_Post].docx
	SCombinedFragment smodule;
	ConfigCombine configCombine;  

	public SLink_Pre_Post(SCombinedFragment smodule, ConfigCombine configcombine){
		this.smodule = smodule;
		this.configCombine = configcombine;
	}
	
	@Override
	public String toString() {
		return getFormula().toString();
	}

	public BooleanFormulae getFormula() {
		return new And(getFormulae());
	}
	
	public ArrayList<BooleanFormulae> getFormulae() {
		try {
			ArrayList<BooleanFormulae> f = new ArrayList<BooleanFormulae>();
			int n = smodule.getLifelines().size();
			Predicate SD_Stop = smodule.getSDPredicate().getStopPredicate();
			Predicate SD_Start = smodule.getSDPredicate().getStartPredicate();
			// // if (configCombine == “ws”){
				if(configCombine == ConfigCombine.WS){
					for (int i = 0; i < n; i++){
						// // borders(CF_X_Li, SD_End || SD_Stop)
						f.add(new SBorders(smodule.getLifelinePredicate(i), SD_Stop).getFun());
						
						Predicate pre = smodule.getLifelinesPrePredicates().get(i);
						Predicate start = smodule.getLifelinePredicate(i).getStartPredicate();
						Predicate end = smodule.getLifelinePredicate(i).getEndPredicate();
						Predicate post = smodule.getLifelinesPostPredicates().get(i);
						
						// // order(CF_X_Li_Pre, CF_X_Li_Start, True , (SD_End || SD_Stop || CF_X_End), True)
						f.add(new SOrder(pre, start, SD_Stop, true).getFun());
						// // 	order(CF_X_Li_End, CF_X_Li_Post, True , (SD_End || SD_Stop || CF_X_End), True)
						f.add(new SOrder(end, post, SD_Stop, true).getFun());
					}
				}else if(configCombine == ConfigCombine.SYNC){
					for (int i = 0; i < n; i++){
						Predicate pre = smodule.getLifelinesPrePredicates().get(i);
						Predicate start = smodule.getPredicate().getStartPredicate();
						Predicate end = smodule.getPredicate().getEndPredicate();
						Predicate post = smodule.getLifelinesPostPredicates().get(i);
						
						// // order(CF_X_Li_Pre, CF_X_Start, True , (SD_End || SD_Stop || CF_X_End), True)
						f.add(new SOrder(pre, start, SD_Stop, true).getFun());
						// // order(CF_X_End, CF_X_Li_Post, True , (SD_End || SD_Stop || CF_X_End), True)
						f.add(new SOrder(end, post, SD_Stop, true).getFun());
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

