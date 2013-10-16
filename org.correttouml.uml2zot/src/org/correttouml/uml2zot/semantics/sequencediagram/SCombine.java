
package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.uml.diagrams.sequencediagram.*;
import org.correttouml.uml.diagrams.sequencediagram.InteractionOperand;
import org.correttouml.uml2zot.semantics.sequencediagram.SSequenceDiagram.Config;
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

	/*
	 * module <=> (module_Start || since_ei(!!(module_End || exception), module_Start))  //Assures that we have (module = True) when it is active, i.e. some events are happening inside its borders.
	 * module_Start => until_ei(!!module_Start, (module_End || exception)) //Assures that we cannot have more than one module_Start, when module is true.
	 */

    @Override
	public String toString() {
    	return getFormula().toString();
	}

	public ArrayList<BooleanFormulae> getFormula() {
		try {
			ArrayList<BooleanFormulae> f = new ArrayList<BooleanFormulae>();
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
				// //SD_Start => &&i=1 to nSD_Li_Start
				f.addAll(new SBorders(SD, SD_Stop).getFormulae());
				f.add(new Implies(SD_Start, new And(ssd.getLifelinesPredicateStarts())));

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
					f.add(new SBorders(ssd.getLifelinePredicate(i), new Or(SD_End, SD_Stop)));
					// //if (Ev[i].length == 0)
					if (evSize == 0)
						// // module_Li_Start <=> module_Li_End
						f.add(new Iff(ssd.getLifelinePredicate(i)
								.getPredicateStart(), ssd.getLifelinePredicate(i)
								.getPredicateEnd()));
					else {
						// //gathering information for next line
						liFirstEv = sd.getLifelines().get(i).getEvents().get(0);
						if(liFirstEv instanceof MessageStart)
							liFirstEvPrd = new SMessageStart((MessageStart)liFirstEv).getPredicate().getPredicateStart();
						if(liFirstEv instanceof MessageEnd)
							liFirstEvPrd = new SMessageEnd((MessageEnd)liFirstEv).getPredicate().getPredicateEnd();
						// // if (Ev[i][0] is message)
						// // order(module_Li_Start, Ev[i][0], True, SD_Stop, True)
						if (liFirstEvPrd != null)
							f.add(new SOrder(ssd.getLifelinePredicate(i).getPredicateStart(), liFirstEvPrd, SD_Stop, true));
						// if ((EV[i].length > 1) && (EV[i][1] is message) && (EV[i][0] is message))
						// order(EV[i][0], EV[i][1], True, SD_Stop, False)
						if ((evSize > 1) && (liFirstEvPrd != null) && (liSecondEvPrd != null)) {
							liSecondEv = sd.getLifelines().get(i).getEvents().get(1);
							if (liSecondEv instanceof MessageStart)
								liSecondEvPrd = new SMessageStart((MessageStart) liSecondEv).getPredicate();
							if (liSecondEv instanceof MessageEnd)
								liSecondEvPrd = new SMessageEnd((MessageEnd) liSecondEv).getPredicate();
							f.add(new SOrder(liFirstEvPrd, liSecondEvPrd,SD_Stop, false));
						}
						// // module_Li_End <=> EV[i][EV[i].length-1]	
						liLastEv = sd.getLifelines().get(i).getEvents().get(evSize - 1);
						if(liLastEv instanceof MessageStart)
							liLastEvPrd = new SMessageStart((MessageStart)liFirstEv).getPredicate().getPredicateStart();
						if(liLastEv instanceof MessageEnd)
							liLastEvPrd = new SMessageEnd((MessageEnd)liFirstEv).getPredicate().getPredicateEnd();
						if(liLastEv instanceof CombinedFragment)
							liLastEvPrd = new SCombinedFragment((CombinedFragment)liLastEv).getPredicate().getPredicateEnd();
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
						if (liEvjPrd != null && liEvjp1Prd != null)
							f.add(new SOrder(liEvjPrd, liEvjp1Prd, SD_Stop, false));
					}
				}
				// // module_End => ((||i=1 to nmodule_Li_End) && (&&i=1 to nsomPIn_i(module_Li_End, module)))
				And tmpAnd = new And();
				for (int i = 0; i < n; i++) {
					tmpAnd.addFormulae(new SSomPIn_i(ssd.getLifelinePredicate(i).getPredicateEnd(), ssd.getPredicate()));
				}
				f.add(new Implies(SD_End, new And(new Or(ssd.getLifelinesPredicateEnds()), tmpAnd)));
				// //for (i = 0; i < n; i++){
				    // //for (j = 0; j < EV[i].length; j++){
				        // //if ((EV[i][j] == CF_X) && (history.indexOF != -1)){
				            // //history.add(CF_X)
				            // //CF_X(CF_X, enclosingFragmentPrd, CF_X_L_Pre, CF_X_L_Post, config)
				        // //}}}
				ArrayList<Integer> history = new ArrayList<Integer>();
				for (int i = 0; i < n; i++){
					int evSize = sd.getLifelines().get(i).getEvents().size();
					for (int j = 0; j < evSize ; j++){
						if (sd.getLifelines().get(i).getEvents().get(j) instanceof CombinedFragment && history.contains(sd.getLifelines().get(i).getEvents().get(j).hashCode())){
//							f.addAll(new SCombinedFragment((CombinedFragment)(sd.getLifelines().get(i).getEvents().get(j)), config).getSemantics());
//							SCombinedFragmentItf SCFItf = (SCombinedFragmentItf)new SCombinedFragment((CombinedFragment)(sd.getLifelines().get(i).getEvents().get(j)), config);
							
							f.addAll(SCombinedFragmentFactory.getInstance(CombinedFragmentFactory.getInstance(uml_combinedfragment)) .getSemantics());
							history.add(sd.getLifelines().get(i).getEvents().get(j).hashCode());
						}
				   	}
				}
			}
			
			if(module != null) {///////////////////////////////////////////////////////////////////////////////////////////////////////////
				int n = module.getLifelines().size(); //n: number of lifelines in the module(or SD)
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
					Predicate SD_Stop = smodule.getSDPredicate().getPredicateStop();
					int evSize = module.getLifelineEvents(i).size();
					// //if (Ev[i].length == 0)
					if (evSize == 0)
						// // module_Li_Start <=> module_Li_End
						f.add(new Iff(smodule.getLifelinePredicate(i)
								.getPredicateStart(), smodule.getLifelinePredicate(i)
								.getPredicateEnd()));
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
							f.add(new SOrder(smodule.getLifelinePredicate(i).getPredicateStart(), liFirstEvPrd, SD_Stop, true));
						// if ((EV[i].length > 1) && (EV[i][1] is message) && (EV[i][0] is message))
						// order(EV[i][0], EV[i][1], True, SD_Stop, False)
						if ((evSize > 1) && (liFirstEvPrd != null) && (liSecondEvPrd != null)){
							liSecondEv = module.getLifelineEvents(i).get(1);
							if(liSecondEv instanceof MessageStart)
								liSecondEvPrd = new SMessageStart((MessageStart)liSecondEv).getPredicate().getPredicateStart();
							if(liSecondEv instanceof MessageEnd)
								liSecondEvPrd = new SMessageEnd((MessageEnd)liSecondEv).getPredicate().getPredicateEnd();
							f.add(new SOrder(liFirstEvPrd, liSecondEvPrd, SD_Stop, false));
						}
						// // module_Li_End <=> EV[i][EV[i].length-1]	
						liLastEv = module.getLifelineEvents(i).get(evSize - 1);
						if(liLastEv instanceof MessageStart)
							liLastEvPrd = new SMessageStart((MessageStart)liFirstEv).getPredicate();
						if(liLastEv instanceof MessageEnd)
							liLastEvPrd = new SMessageEnd((MessageEnd)liFirstEv).getPredicate();
						if(liLastEv instanceof CombinedFragment)
							liLastEvPrd = new SCombinedFragment((CombinedFragment)liLastEv).getPredicate().getPredicateEnd();
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
							f.add(new SOrder(liEvjPrd, liEvjp1Prd, SD_Stop, false));
					}
				}
				// // module_End => ((||i=1 to nmodule_Li_End) && (&&i=1 to nsomPIn_i(module_Li_End, module)))
				And tmpAnd = new And();
				for (int i = 0; i < n; i++) {
					tmpAnd.addFormulae(new SSomPIn_i(smodule.getLifelinePredicate(i).getPredicateEnd(), smodule.getPredicate()));
				}
				f.add(new Implies(smodule.getPredicate().getPredicateEnd(), new And(new Or(smodule.getLifelinesPredicateEnds()), tmpAnd)));
				// //for (i = 0; i < n; i++){
				    // //for (j = 0; j < EV[i].length; j++){
				        // //if ((EV[i][j] == CF_X) && (history.indexOF != -1)){
				            // //history.add(CF_X)
				            // //CF_X(CF_X, enclosingFragmentPrd, CF_X_L_Pre, CF_X_L_Post, config)
				        // //}}}
				ArrayList<Integer> history = new ArrayList<Integer>();
				for (int i = 0; i < n; i++){
					int evSize = module.getLifelineEvents(i).size();
					for (int j = 0; j < evSize ; j++){
						if (module.getLifelineEvents(i).get(j) instanceof CombinedFragment && history.contains(module.getLifelineEvents(i).get(j).hashCode())){
							f.addAll(new SCombinedFragment((CombinedFragment)module.getLifelineEvents(i).get(j), config).getSemantics());
							history.add(module.getLifelineEvents(i).get(j).hashCode());
						}
				   	}
				}
			}
			return f;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}