
package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.uml.diagrams.sequencediagram.*;
import org.correttouml.uml2zot.semantics.sequencediagram.SInteractionOperand;
import org.correttouml.uml2zot.semantics.util.bool.And;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.bool.Iff;
import org.correttouml.uml2zot.semantics.util.bool.Implies;
import org.correttouml.uml2zot.semantics.util.bool.Or;
import org.correttouml.uml2zot.semantics.util.trio.Predicate;

/**
*@author Mohammad Mehdi Pourhashem Kallehbasti 
*/

public class SCombine implements BooleanFormulae{
	//[documentation]: \Dropbox\SharePolimi\Documentation\Sequence Diagram\Combined_Fragment\Modular_Semantics\[combine].docx
	private SSequenceDiagram ssd;
	private SequenceDiagram sd;
	private InteractionOperand module;
	private SInteractionOperand smodule;
	private Config config;
	public ArrayList<String> comments = null;
	
	public SCombine(SequenceDiagram sd, Config config){
        this.sd = sd;
        this.ssd = new SSequenceDiagram(sd, config);
        this.config = config;
    }

	public SCombine(InteractionOperand module, Config config){
        this.module = module;
        this.smodule = new SInteractionOperand(module);
        this.config = config;
    }
	
	public SCombine(InteractionOperand module){
        this.module = module;
        this.smodule = new SInteractionOperand(module);
    }

    @Override
	public String toString() {
    	String s = "";
//    	for (BooleanFormulae f: getFormulae()) 
//    		s += f.toString() + "\n";
    	for (int i=0;i<getFormulae().size();i++) {
    		if (i< comments.size() && comments.get(i)!=null)
    			s += "#|" + comments.get(i) +"|#"+"\n";
    		s += getFormulae().get(i).toString()+"\n";
    	}
    	return s;
	}
	
	public ArrayList<BooleanFormulae> getFormulae() {
		try {
			ArrayList<BooleanFormulae> f = new ArrayList<BooleanFormulae>();
			comments = new ArrayList<String>();
			// first we consider algorithm for module SD and repeat same algorithm
			// for module CF_X_Op
			// //if (module == SD){
			if (ssd != null) {
				Predicate SD = ssd.getPredicate();
				Predicate SD_Start = ssd.getPredicate().getPredicateStart();
				Predicate SD_End = ssd.getPredicate().getPredicateEnd();
				Predicate SD_Stop = ssd.getPredicate().getPredicateStop();
				int n = ssd.getLifelinesPredicates().size(); //n: number of lifelines in the module(or SD)
				// //borders(module, SD_Stop)
//				f.addAll(new SBorders(SD, SD_Stop).getFormulae());
				comments.add("Borders of SD");
				f.add(new SBorders(SD, SD_Stop).getFun());
				// //&&i=1 to n (SD_Start <=> SD_Li_Start)
				for (Predicate p : ssd.getLifelinesPredicateStarts()) {
					comments.add(null);
					f.add(new Iff(SD_Start, p));
				}
				// // order(module_Start, module_End, true, SD_Stop, True)
				comments.add(null);
				f.add(new SOrder(SD_Start, SD_End, SD_Stop, true).getFun());
				// // &&i=1 to n (order(module_Li_Start, module_Li_End, True, SD_Stop, True))
				for (int i = 0; i < n; i++) {
					comments.add(null);
					f.add(new SOrder(ssd.getLifelinePredicate(i).getPredicateStart(), ssd.getLifelinePredicate(i).getPredicateEnd(), SD_Stop, true).getFun());
				}

				for (int i = 0; i < n; i++) {
					InteractionFragment liFirstEv = null;
					InteractionFragment liSecondEv = null;
					InteractionFragment liLastEv = null;
					InteractionFragment liEvj = null;
					InteractionFragment liEvjp1 = null;
					Predicate liFirstEvPrd = null;
					Predicate liSecondEvPrd = null;
					Predicate liLastEvPrd = null;
					Predicate liEvjPrd = null;
					Predicate liEvjp1Prd = null;
					int evSize = sd.getLifelines().get(i).getEvents().size();
					// // borders(SD_Li, SD_End || SD_Stop)
					comments.add(null);
					f.add(new SBorders(ssd.getLifelinePredicate(i), SD_Stop).getFun());
					// //if (Ev[i].length == 0)
					if (evSize == 0) {
						// // module_Li_Start <=> module_Li_End
						comments.add(null);
						f.add(new Iff(ssd.getLifelinePredicate(i)
								.getPredicateStart(), ssd.getLifelinePredicate(i)
								.getPredicateEnd()));}
					else {
						// // if (Ev[i][0] is message)
						// // order(module_Li_Start, Ev[i][0], True, SD_Stop, True)
						liFirstEv = sd.getLifelines().get(i).getEvents().get(0);
						if(liFirstEv instanceof MessageStart)
							liFirstEvPrd = new SMessageStart((MessageStart)liFirstEv).getPredicate();
						if(liFirstEv instanceof MessageEnd)
							liFirstEvPrd = new SMessageEnd((MessageEnd)liFirstEv).getPredicate();
						if (liFirstEvPrd != null) {
							comments.add(null);
							f.add(new SOrder(ssd.getLifelinePredicate(i).getPredicateStart(), liFirstEvPrd, SD_Stop, true).getFun());}
						// // if ((EV[i].length > 1) && (EV[i][1] is message) && (EV[i][0] is message))
						// // order(EV[i][0], EV[i][1], True, SD_Stop, False)
						if (evSize > 1){
							liSecondEv = sd.getLifelines().get(i).getEvents().get(1);
							if (liSecondEv instanceof MessageStart)
								liSecondEvPrd = new SMessageStart((MessageStart) liSecondEv).getPredicate();
							if (liSecondEv instanceof MessageEnd)
								liSecondEvPrd = new SMessageEnd((MessageEnd) liSecondEv).getPredicate();
							if (liFirstEvPrd != null && liSecondEvPrd != null) {
								comments.add(null);
								f.add(new SOrder(liFirstEvPrd, liSecondEvPrd,SD_Stop, false).getFun());
							}
						}
						// // module_Li_End <=> EV[i][EV[i].length-1] // in WS and (last event = CF_X) module_Li_End <=> CF_X_Li_End, in SYNC and (last event = CF_X) module_Li_End <=> CF_X_End
						liLastEv = sd.getLifelines().get(i).getEvents().get(evSize - 1);
						if(liLastEv instanceof MessageStart)
							liLastEvPrd = new SMessageStart((MessageStart)liLastEv).getPredicate();
						if(liLastEv instanceof MessageEnd)
							liLastEvPrd = new SMessageEnd((MessageEnd)liLastEv).getPredicate();
						if(liLastEv instanceof CombinedFragment)
							if (config.combine == ConfigCombine.WS) 
								liLastEvPrd = new SCombinedFragment((CombinedFragment)liLastEv, config).getLifelinePredicate(ssd.getLifelinesNames().get(i)).getPredicateEnd();// we need to get lifeline's predicate by using its name, because indexes may be different in different CFs.
							else if (config.combine == ConfigCombine.SYNC)
								liLastEvPrd = new SCombinedFragment((CombinedFragment)liLastEv, config).getPredicate().getPredicateEnd();
						comments.add(null);
						f.add(new Iff(ssd.getLifelinePredicate(i).getPredicateEnd(), liLastEvPrd));
					}
					// // for (j = 1; j < EV[i].length - 1; j++){
					for (int j = 1; j < evSize - 1; j++) {// for second event to next last event
						liEvj = sd.getLifelines().get(i).getEvents().get(j);
						liEvjp1 = sd.getLifelines().get(i).getEvents().get(j + 1);
						if(liEvj instanceof MessageStart)
							liEvjPrd = new SMessageStart((MessageStart)liEvj).getPredicate();
						if(liEvj instanceof MessageEnd)
							liEvjPrd = new SMessageEnd((MessageEnd)liEvj).getPredicate();
						if(liEvjp1 instanceof MessageStart)
							liEvjp1Prd = new SMessageStart((MessageStart)liEvjp1).getPredicate();
						if(liEvjp1 instanceof MessageEnd)
							liEvjp1Prd = new SMessageEnd((MessageEnd)liEvjp1).getPredicate();
						// // if ((EV[i][j] is message) && (EV[i][j + 1] is message))
						// // order(EV[i][j], EV[i][j + 1], True, (enclosingFragmentPrd_End || SD_Stop || SD_End), False)
						if (liEvjPrd != null && liEvjp1Prd != null) {
							comments.add(null);
							f.add(new SOrder(liEvjPrd, liEvjp1Prd, SD_Stop, false).getFun());
						}
					}
				}
				// // module_End => ((||i=1 to nmodule_Li_End) && (&&i=1 to nsomPIn_i(module_Li_End, module)))
				And tmpAnd = new And();
				for (int i = 0; i < n; i++) {
					tmpAnd.addFormulae(new SSomPIn_i(ssd.getLifelinePredicate(i).getPredicateEnd(), ssd.getPredicate()).getFun());
				}
				comments.add(null);
				f.add(new Implies(SD_End, new And(new Or(ssd.getLifelinesPredicateEnds()), tmpAnd)));
				// //for (i = 0; i < n; i++){
				    // //for (j = 0; j < EV[i].length; j++){
				        // //if ((EV[i][j] == CF_X) && (history.indexOF != -1)){
				            // //history.add(CF_X)
				            // //CF_X(CF_X, enclosingFragmentPrd, CF_X_L_Pre, CF_X_L_Post, config)
				        // //}}}
				ArrayList<String> history = new ArrayList<String>();
				for (int i = 0; i < n; i++){
					int evSize = sd.getLifelines().get(i).getEvents().size();
					for (int j = 0; j < evSize ; j++){
						if (SInteractionFragmentFactory.getInstance(sd.getLifelines().get(i).getEvents().get(j), config) instanceof SCombinedFragment && !history.contains(SInteractionFragmentFactory.getInstance(sd.getLifelines().get(i).getEvents().get(j), config).getPredicate().toString())){
							//	f.addAll(new SCombinedFragment((CombinedFragment)(sd.getLifelines().get(i).getEvents().get(j)), config).getSemantics());
							//	f.addAll(SCombinedFragmentFactory.getInstance((CombinedFragmentItf)sd.getLifelines().get(i).getEvents().get(j), config).getSemantics());
//							comments.add("<Semantics for "+SCombinedFragmentFactory.getInstance((CombinedFragmentItf)sd.getLifelines().get(i).getEvents().get(j), config).getPredicate().getPredicateName()+">");
							for (BooleanFormulae bf: SCombinedFragmentFactory.getInstance((CombinedFragmentItf)sd.getLifelines().get(i).getEvents().get(j), config).getSemantics()) 
								{
								comments.add(null);
								f.add(bf);
								}
//							comments.remove(comments.size()-1);
//							comments.add("</Semantics for "+SCombinedFragmentFactory.getInstance((CombinedFragmentItf)sd.getLifelines().get(i).getEvents().get(j), config).getPredicate().getPredicateName()+">");
							history.add(SInteractionFragmentFactory.getInstance(sd.getLifelines().get(i).getEvents().get(j), config).getPredicate().toString());
						}
				   	}
				}
			}
			
			if(module != null) {///////////////////////////////////////////////////////////////////////////////////////////////////////////
				Predicate SD_Stop = smodule.getSDPredicate().getPredicateStop();
				int n = module.getLifelines().size(); //n: number of lifelines in the module(or SD)
				// //     borders(CF_X_Op, SD_End || SD_Stop)
				comments.add("<Semantics for "+ smodule.getPredicate().getPredicateName()+">");
				f.add(new SBorders(smodule.getPredicate(), SD_Stop).getFun());
			    // // &&i=1 to nborders(CF_X_Op_Li, SD_End || SD_Stop)
				for (int i = 0; i < n; i++) 
					{comments.add(null);
					f.add(new SBorders(smodule.getLifelinePredicate(i), SD_Stop));}
			    // // CF_X_Op_End => ((||j=1 to nCF_X_Op_Li_End) && (&&j=1 to nsomPIn_i(CF_X_Op_Lj_End, CF_X_Op)))
				ArrayList<BooleanFormulae> tempf1 = new ArrayList<BooleanFormulae>();
				for (int i = 0; i < n; i++) 
					tempf1.add(new SSomPIn_i(smodule.getLifelinePredicate(i).getPredicateEnd(), smodule.getPredicate()));
				comments.add(null);
				f.add(new Implies(smodule.getPredicate().getPredicateEnd(), new And(new Or(smodule.getLifelinesPredicateEnds()), new And(tempf1))));
				// // &&i=1 to n(CF_X_Op_Li => CF_X_Op)
				for (int i = 0; i < n; i++)
					{comments.add(null);
					f.add(new Implies(smodule.getLifelinePredicate(i), smodule.getPredicate()));}
				// // if (config.combine == “ws”)
				if (config.combine == ConfigCombine.WS)
		        // // 	CF_X_Op_Start => ||j=1 to n (CF_X_Op_Lj_Start)
					{comments.add(null);
					f.add(new Implies(smodule.getPredicate().getPredicateStart(), new Or(smodule.getLifelinesPredicateStarts())));}
				// // if (config.combine == “sync”)
				if (config.combine == ConfigCombine.SYNC) {
					// // CF_X_Op_Start <=> &&j=1 to n (CF_X_Op_Li_Start)
					comments.add(null);
					f.add(new Iff(smodule.getPredicate().getPredicateStart(), new And(smodule.getLifelinesPredicateStarts())));
					// // CF_X_Op_End <=> &&j=1 to n (CF_X_Op_Li_End) 
					comments.add(null);
					f.add(new Iff(smodule.getPredicate().getPredicateEnd(), new And(smodule.getLifelinesPredicateEnds())));
				}
				// // order(module_Start, module_End, true, SD_Stop, True)
				comments.add(null);
				f.add(new SOrder(smodule.getPredicate().getPredicateStart(), smodule.getPredicate().getPredicateEnd(), SD_Stop, true).getFun());
				// // &&i=1 to n (order(module_Li_Start, module_Li_End, True, SD_Stop, True))
				for (int i = 0; i < n; i++) 
					{comments.add(null);
					f.add(new SOrder(smodule.getLifelinePredicate(i).getPredicateStart(), smodule.getLifelinePredicate(i).getPredicateEnd(), SD_Stop, true).getFun());}
				for (int i = 0; i < n; i++) {
					InteractionFragment liFirstEv = null;
					InteractionFragment liSecondEv = null;
					InteractionFragment liLastEv = null;
					InteractionFragment liEvj = null;
					InteractionFragment liEvjp1 = null;
					Predicate liFirstEvPrd = null;
					Predicate liSecondEvPrd = null;
					Predicate liLastEvPrd = null;
					Predicate liEvjPrd = null;
					Predicate liEvjp1Prd = null;
					int evSize = module.getLifelineEvents(i).size();
					// //if (Ev[i].length == 0)
					if (evSize == 0)
						// // module_Li_Start <=> module_Li_End
						{comments.add(null);
						f.add(new Iff(smodule.getLifelinePredicate(i)
								.getPredicateStart(), smodule.getLifelinePredicate(i)
								.getPredicateEnd()));}
					else {
						// //gathering information for next line
						liFirstEv = module.getLifelineEvents(i).get(0);
						
						if(liFirstEv instanceof MessageStart)
							liFirstEvPrd = new SMessageStart((MessageStart)liFirstEv).getPredicate();
						if(liFirstEv instanceof MessageEnd)
							liFirstEvPrd = new SMessageEnd((MessageEnd)liFirstEv).getPredicate();
						
						// // if (Ev[i][0] is message)
						// // order(module_Li_Start, Ev[i][0], True, SD_Stop, True)
						if (liFirstEvPrd != null)
							{comments.add(null);
							f.add(new SOrder(smodule.getLifelinePredicate(i).getPredicateStart(), liFirstEvPrd, SD_Stop, true).getFun());}
						// if ((EV[i].length > 1) && (EV[i][1] is message) && (EV[i][0] is message))
						// order(EV[i][0], EV[i][1], True, SD_Stop, False)
						if (evSize > 1) {
							liSecondEv = module.getLifelineEvents(i).get(1);
							if(liSecondEv instanceof MessageStart)
								liSecondEvPrd = new SMessageStart((MessageStart)liSecondEv).getPredicate().getPredicateStart();
							if(liSecondEv instanceof MessageEnd)
								liSecondEvPrd = new SMessageEnd((MessageEnd)liSecondEv).getPredicate().getPredicateEnd();
							if (liFirstEvPrd != null && liSecondEvPrd != null)
							{comments.add(null);
							f.add(new SOrder(liFirstEvPrd, liSecondEvPrd, SD_Stop, false).getFun());}
						}
						// // module_Li_End <=> EV[i][EV[i].length-1]	//in WS and (last event = CF_X) module_Li_End <=> CF_X_Li_End. in SYNC and (last event = CF_X) module_Li_End <=> CF_X_End 
						liLastEv = module.getLifelineEvents(i).get(evSize - 1);
						if(liLastEv instanceof MessageStart)
							liLastEvPrd = new SMessageStart((MessageStart)liFirstEv).getPredicate();
						if(liLastEv instanceof MessageEnd)
							liLastEvPrd = new SMessageEnd((MessageEnd)liFirstEv).getPredicate();
						if(liLastEv instanceof CombinedFragment)
							if (config.combine == ConfigCombine.WS) 
								liLastEvPrd = new SCombinedFragment((CombinedFragment)liLastEv, config).getLifelinePredicate(smodule.getLifelines().get(i).getName()).getPredicateEnd();// we need to get lifeline's predicate by using its name, because indexes may be different in different CFs.
							else if (config.combine == ConfigCombine.SYNC)
								liLastEvPrd = new SCombinedFragment((CombinedFragment)liLastEv, config).getPredicate().getPredicateEnd();
						comments.add(null);
						f.add(new Iff(smodule.getLifelinePredicate(i).getPredicateEnd(), liLastEvPrd));
					}
					// // for (j = 1; j < EV[i].length - 1; j++){
					for (int j = 1; j < evSize - 1; j++) {// for second event to next last event
						liEvj = module.getLifelineEvents(i).get(j);
						liEvjp1 = module.getLifelineEvents(i).get(j + 1);
						if(liEvj instanceof MessageStart)
							liEvjPrd = new SMessageStart((MessageStart)liEvj).getPredicate();
						if(liEvj instanceof MessageEnd)
							liEvjPrd = new SMessageEnd((MessageEnd)liEvj).getPredicate();
						if(liEvjp1 instanceof MessageStart)
							liEvjp1Prd = new SMessageStart((MessageStart)liEvjp1).getPredicate();
						if(liEvjp1 instanceof MessageEnd)
							liEvjp1Prd = new SMessageEnd((MessageEnd)liEvjp1).getPredicate();
						// // if ((EV[i][j] is message) && (EV[i][j + 1] is message))
						// // order(EV[i][j], EV[i][j + 1], True, (enclosingFragmentPrd_End || SD_Stop || SD_End), False)
						if (liEvjPrd != null && liEvjp1Prd != null)
							{comments.add(null);
							f.add(new SOrder(liEvjPrd, liEvjp1Prd, SD_Stop, false).getFun());}
					}
				}
				// // module_End => ((||i=1 to nmodule_Li_End) && (&&i=1 to nsomPIn_i(module_Li_End, module)))
				And tmpAnd = new And();
				for (int i = 0; i < n; i++) {
					tmpAnd.addFormulae(new SSomPIn_i(smodule.getLifelinePredicate(i).getPredicateEnd(), smodule.getPredicate()));
				}
				comments.add(null);
				f.add(new Implies(smodule.getPredicate().getPredicateEnd(), new And(new Or(smodule.getLifelinesPredicateEnds()), tmpAnd)));
				// //for (i = 0; i < n; i++){
				    // //for (j = 0; j < EV[i].length; j++){
				        // //if ((EV[i][j] == CF_X) && (history.indexOF != -1)){
				            // //history.add(CF_X)
				            // //CF_X(CF_X, enclosingFragmentPrd, CF_X_L_Pre, CF_X_L_Post, config)
				        // //}}}
				ArrayList<String> history = new ArrayList<String>();
				for (int i = 0; i < n; i++){
					int evSize = module.getLifelineEvents(i).size();
					for (int j = 0; j < evSize ; j++){
						if (SInteractionFragmentFactory.getInstance(module.getLifelineEvents(i).get(j), config) instanceof SCombinedFragment && !history.contains(SInteractionFragmentFactory.getInstance(module.getLifelineEvents(i).get(j), config).getPredicate().toString())){
//							f.addAll(new SCombinedFragment((CombinedFragment)(module.getLifelineEvents(i).get(j)), config).getSemantics());
//							f.addAll(SCombinedFragmentFactory.getInstance((CombinedFragmentItf)sd.getLifelines().get(i).getEvents().get(j), config).getSemantics());
							history.add(SInteractionFragmentFactory.getInstance(module.getLifelineEvents(i).get(j), config).getPredicate().toString());
//							comments.add("<Semantics for "+SCombinedFragmentFactory.getInstance((CombinedFragmentItf)sd.getLifelines().get(i).getEvents().get(j), config).getPredicate().getPredicateName()+">");
							for (BooleanFormulae bf: SCombinedFragmentFactory.getInstance((CombinedFragmentItf)module.getLifelineEvents(i).get(j), config).getSemantics()) 
								{comments.add(null);
								f.add(bf);}
//							comments.remove(comments.size()-1);comments.remove(comments.size()-1);
//							comments.add("</Semantics for "+SCombinedFragmentFactory.getInstance((CombinedFragmentItf)sd.getLifelines().get(i).getEvents().get(j), config).getPredicate().getPredicateName()+">");
						}
				   	}
				}
//				comments.add(comments.size() - 1, "<Semantics for "+smodule.getPredicate().getPredicateName()+">");
			}
			return f;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}