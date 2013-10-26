package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.uml2zot.semantics.sequencediagram.SCombinedFragment.PredicateType;
import org.correttouml.uml2zot.semantics.util.bool.And;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.bool.Implies;
import org.correttouml.uml2zot.semantics.util.bool.Not;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;
import org.eclipse.uml2.uml.NamedElement;

import com.google.common.collect.ArrayListMultimap;

/**
 *@author Mohammad Mehdi Pourhashem Kallehbasti 
 */
public class SLink_Pre_Post implements BooleanFormulae{
	//[documentation]: \Dropbox\SharePolimi\Documentation\Sequence Diagram\Combined_Fragment\Modular_Semantics\[Link_Pre_Post].docx
	SCombinedFragment smodule;
	Config config;  

	public SLink_Pre_Post(SCombinedFragment smodule, Config config){
		this.smodule = smodule;
		this.config = config;
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
			Predicate SD_Stop = smodule.getSDPredicate().getPredicateStop();
			Predicate SD_Start = smodule.getSDPredicate().getPredicateStart();
			// // if (config.combine == “ws”){
				if(config.combine == ConfigCombine.WS){
					for (int i = 0; i < n; i++){
						// // borders(CF_X_Li, SD_End || SD_Stop)
						f.add(new SBorders(smodule.getLifelinePredicate(i), SD_Stop).getFun());
						Predicate pre = smodule.getLifelinesPrePredicates().get(i);//<temp variables>
						Predicate start = smodule.getLifelinePredicate(i).getPredicateStart();
						Predicate end = smodule.getLifelinePredicate(i).getPredicateEnd();
						Predicate post = smodule.getLifelinesPostPredicates().get(i);
						PredicateType preType = smodule.getLifelinesPrePredicateTypes().get(i);
						PredicateType postType = smodule.getLifelinesPostPredicateTypes().get(i);//</temp variables>
						
						// // order(CF_X_Li_Pre, CF_X_Li_Start, True , (SD_End || SD_Stop || CF_X_End), True)
						f.add(new SOrder(pre, start, SD_Stop, true).getFun());
						// // 	order(CF_X_Li_End, CF_X_Li_Post, True , (SD_End || SD_Stop || CF_X_End), True)
						f.add(new SOrder(end, post, SD_Stop, true).getFun());
						
						
						// // if CF_X_Li_Pre is Message{
						if (preType == PredicateType.MStart || preType == PredicateType.MEnd) {
						// // 	if CF_X_Li_Post is Message{
							if (postType == PredicateType.MStart || postType == PredicateType.MEnd) {	
						// // 		(CF_X_Li_Pre && CF_X_Li_Start) => CF_X_Li_End //It means Pre and Start can coincide if and only if CF_X collapses (ignored).
								f.add(new Implies(new And(pre, start), end));
						// // 		CF_X_Li_End => !!CF_X_Li_Post	}// It means there is not any way that End and Post can coincide.
								f.add(new Implies(end, new Not(post)));
							}
						// // 	if CF_X_Li_Post is CF_Z_Start{
							if (postType == PredicateType.CFStart || postType == PredicateType.SDStart) {
						// // 		(CF_X_Li_Pre && CF_X_Li_Start) => CF_X_Li_End
								f.add(new Implies(new And(pre, start), end));
						// // 		(CF_X_Li_End && CF_X_Li_Post) => CF_X_Li_Start}
								f.add(new Implies(new And(end, post), start));
							}
						// // 	if CF_X_Li_Post is CF_Z_End{
							if (postType == PredicateType.CFEnd || postType == PredicateType.SDEnd) {
						// // 		(CF_X_Li_Pre && CF_X_Li_Start) => CF_X_Li_End}
								f.add(new Implies(new And(pre, start), end));
							}
						// // }
						}
						
						// // if CF_X_Li_Pre is CF_Y_Start{
						if (preType == PredicateType.CFStart || preType == PredicateType.SDStart) {
						// // 		if CF_X_Li_Post is Message{
							if (postType == PredicateType.MStart || postType == PredicateType.MEnd) {
						// // 			(CF_X_Li_End && CF_X_Li_Post) => CF_X_Li_Start}
								f.add(new Implies(new And(end, post), start));
							}
						// // 		if CF_X_Li_Post is CF_Z_Start{
							
							if (postType == PredicateType.CFStart || postType == PredicateType.SDStart) {
						// // 			(CF_X_Li_End && CF_X_Li_Post) => CF_X_Li_Start}
								f.add(new Implies(new And(end, post), start));
							}
						// // 		if CF_X_Li_Post is CF_Z_End{
						// // 		//no limitations, default concurrent ordering semantics do not need any modificatoin.}
						// // }
						}

						// // 	if CF_X_Li_Pre is CF_Y_End{
						if (preType == PredicateType.CFEnd || preType == PredicateType.SDEnd) {
						// // 		if CF_X_Li_Post is Message{
							if (postType == PredicateType.MStart || postType == PredicateType.MEnd) {
						// // 			(CF_X_Li_Pre && CF_X_Li_Start) => CF_X_Li_End
								f.add(new Implies(new And(pre, start), end));
						// // 			(CF_X_Li_End && CF_X_Li_Post) => (CF_X_Li_Start && SD_Li_Start)})}// (special situation)The only way Message can coincide with  CF_X_Li_Start is that we have them at SD_Start.
								f.add(new Implies(new And(end, post), new And(start, SD_Start)));
							}
						// // 		if CF_X_Li_Post is CF_Z_Start{
							if (postType == PredicateType.CFStart || postType == PredicateType.SDStart) {
						// // 			(CF_X_Li_Pre && CF_X_Li_Start) => CF_X_Li_End}
								f.add(new Implies(new And(pre, start), end));
							}
						// // 		if CF_X_Li_Post is CF_Z_End{
							if (postType == PredicateType.CFEnd || postType == PredicateType.SDEnd) {
						// // 			(CF_X_Li_Pre && CF_X_Li_Start) => CF_X_Li_End}
								f.add(new Implies(new And(pre, start), end));
							}
						// // }
						}
					}
				}else if(config.combine == ConfigCombine.SYNC){
					for (int i = 0; i < n; i++){
						Predicate pre = smodule.getLifelinesPrePredicates().get(i);//<temp variables>
						Predicate start = smodule.getPredicate().getPredicateStart();
						Predicate end = smodule.getPredicate().getPredicateEnd();
						Predicate post = smodule.getLifelinesPostPredicates().get(i);
						PredicateType preType = smodule.getLifelinesPrePredicateTypes().get(i);
						PredicateType postType = smodule.getLifelinesPostPredicateTypes().get(i);//</temp variables>
						
						// // order(CF_X_Li_Pre, CF_X_Start, True , (SD_End || SD_Stop || CF_X_End), True)
						f.add(new SOrder(pre, start, SD_Stop, true).getFun());
						// // order(CF_X_End, CF_X_Li_Post, True , (SD_End || SD_Stop || CF_X_End), True)
						f.add(new SOrder(end, post, SD_Stop, true).getFun());
						
						//this part of codes is same as codes in "ws", I separated them because we may want to add more specification in future.  
						// // if CF_X_Li_Pre is Message{
						if (preType == PredicateType.MStart || preType == PredicateType.MEnd) {
						// // 	if CF_X_Li_Post is Message{
							if (postType == PredicateType.MStart || postType == PredicateType.MEnd) {	
						// // 		(CF_X_Li_Pre && CF_X_Start) => CF_X_End //It means Pre and Start can coincide if and only if CF_X collapses (ignored).
								f.add(new Implies(new And(pre, start), end));
						// // 		CF_X_End => !!CF_X_Li_Post	}// It means there is not any way that End and Post can coincide.
								f.add(new Implies(end, new Not(post)));
							}
						// // 	if CF_X_Li_Post is CF_Z_Start{
							if (postType == PredicateType.CFStart || postType == PredicateType.SDStart) {
						// // 		(CF_X_Li_Pre && CF_X_Start) => CF_X_End
								f.add(new Implies(new And(pre, start), end));
						// // 		(CF_X_End && CF_X_Li_Post) => CF_X_Start}
								f.add(new Implies(new And(end, post), start));
							}
						// // 	if CF_X_Li_Post is CF_Z_End{
							if (postType == PredicateType.CFEnd || postType == PredicateType.SDEnd) {
						// // 		(CF_X_Li_Pre && CF_X_Start) => CF_X_End}
								f.add(new Implies(new And(pre, start), end));
							}
						// // }
						}
						
						// // if CF_X_Li_Pre is CF_Y_Start{
						if (preType == PredicateType.CFStart || preType == PredicateType.SDStart) {
						// // 		if CF_X_Li_Post is Message{
							if (postType == PredicateType.MStart || postType == PredicateType.MEnd) {
						// // 			(CF_X_End && CF_X_Li_Post) => CF_X_Start}
								f.add(new Implies(new And(end, post), start));
							}
						// // 		if CF_X_Li_Post is CF_Z_Start{
							
							if (postType == PredicateType.CFStart || postType == PredicateType.SDStart) {
						// // 			(CF_X_End && CF_X_Li_Post) => CF_X_Start}
								f.add(new Implies(new And(end, post), start));
							}
						// // 		if CF_X_Li_Post is CF_Z_End{
						// // 		//no limitations, default concurrent ordering semantics do not need any modificatoin.}
						// // }
						}

						// // 	if CF_X_Li_Pre is CF_Y_End{
						if (preType == PredicateType.CFEnd || preType == PredicateType.SDEnd) {
						// // 		if CF_X_Li_Post is Message{
							if (postType == PredicateType.MStart || postType == PredicateType.MEnd) {
						// // 			(CF_X_Li_Pre && CF_X_Start) => CF_X_End
								f.add(new Implies(new And(pre, start), end));
						// // 			(CF_X_End && CF_X_Li_Post) => (CF_X_Start && SD_Start)})}// (special situation)The only way Message can coincide with  CF_X_Start is that we have them at SD_Start.
								f.add(new Implies(new And(end, post), new And(start, SD_Start)));
							}
						// // 		if CF_X_Li_Post is CF_Z_Start{
							if (postType == PredicateType.CFStart || postType == PredicateType.SDStart) {
						// // 			(CF_X_Li_Pre && CF_X_Start) => CF_X_End}
								f.add(new Implies(new And(pre, start), end));
							}
						// // 		if CF_X_Li_Post is CF_Z_End{
							if (postType == PredicateType.CFEnd || postType == PredicateType.SDEnd) {
						// // 			(CF_X_Li_Pre && CF_X_Start) => CF_X_End}
								f.add(new Implies(new And(pre, start), end));
							}
						// // }
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

