package org.correttouml.uml2zot.semantics.sequencediagram;

import java.util.ArrayList;

import org.correttouml.uml.diagrams.sequencediagram.*;
import org.correttouml.uml2zot.semantics.sequencediagram.SInteractionOperand;
import org.correttouml.uml2zot.semantics.util.bool.And;
import org.correttouml.uml2zot.semantics.util.bool.BooleanFormulae;
import org.correttouml.uml2zot.semantics.util.bool.Iff;
import org.correttouml.uml2zot.semantics.util.bool.Implies;
import org.correttouml.uml2zot.semantics.util.bool.Not;
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
    	ArrayList<BooleanFormulae> tempf1 = new ArrayList<BooleanFormulae>();
    	tempf1.addAll(getFormulae());
    	for (BooleanFormulae bf:tempf1)
    		s += bf.toString() + "\n";
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
				Predicate SD_Start = ssd.getPredicate().getStartPredicate();
				Predicate SD_End = ssd.getPredicate().getEndPredicate();
				Predicate SD_Stop = ssd.getPredicate().getStopPredicate();
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
					f.add(new SOrder(ssd.getLifelinePredicate(i).getStartPredicate(), ssd.getLifelinePredicate(i).getEndPredicate(), SD_Stop, true).getFun());
				}

				for (int i = 0; i < n; i++) {
					String currentLifelineName = sd.getLifeline(i).getName();
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
					// //if (Ev[i].size == 0)
					if (evSize == 0) {
						// // module_Li_Start <=> module_Li_End
						comments.add(null);
						f.add(new Iff(ssd.getLifelinePredicate(i)
								.getStartPredicate(), ssd.getLifelinePredicate(i)
								.getEndPredicate()));}
					else {
						// // if (Ev[i][0] is message)
						// // order(module_Li_Start, Ev[i][0], True, SD_Stop, True)
						liFirstEv = sd.getLifelines().get(i).getEvents().get(0);
						liFirstEvPrd = null;
						if(liFirstEv instanceof MessageStart)
							liFirstEvPrd = new SMessageStart((MessageStart)liFirstEv).getPredicate(); 
						if(liFirstEv instanceof MessageEnd)
							liFirstEvPrd = new SMessageEnd((MessageEnd)liFirstEv).getPredicate();
						if (liFirstEvPrd != null) {
							comments.add(null);
							f.add(new SOrder(ssd.getLifelinePredicate(i).getStartPredicate(), liFirstEvPrd, SD_Stop, true).getFun());}
						// // module_Li_End <=> EV[i][EV[i].size-1] // in WS and (last event = CF_X) module_Li_End <=> CF_X_Li_End, in SYNC and (last event = CF_X) module_Li_End <=> CF_X_End
						liLastEv = sd.getLifelines().get(i).getEvents().get(evSize - 1);
						if(liLastEv instanceof MessageStart)
							liLastEvPrd = new SMessageStart((MessageStart)liLastEv).getPredicate();
						if(liLastEv instanceof MessageEnd)
							liLastEvPrd = new SMessageEnd((MessageEnd)liLastEv).getPredicate();
						if(liLastEv instanceof CombinedFragment)
							if (config.combine == ConfigCombine.WS) 
								liLastEvPrd = new SCombinedFragment((CombinedFragment)liLastEv, config).getLifelinePredicate(ssd.getLifelinesNames().get(i)).getEndPredicate();// we need to get lifeline's predicate by using its name, because indexes may be different in different CFs.
							else if (config.combine == ConfigCombine.SYNC)
								liLastEvPrd = new SCombinedFragment((CombinedFragment)liLastEv, config).getPredicate().getEndPredicate();
						comments.add(null);
						f.add(new Iff(ssd.getLifelinePredicate(i).getEndPredicate(), liLastEvPrd));

						// // if ((EV[i].size > 1) && (EV[i][1] is message) && (EV[i][0] is message))
						// // order(EV[i][0], EV[i][1], True, SD_Stop, False)
						if (evSize > 1){
							liSecondEv = sd.getLifelines().get(i).getEvents().get(1);
							liSecondEvPrd = null;
							if (liSecondEv instanceof MessageStart)
								liSecondEvPrd = new SMessageStart((MessageStart) liSecondEv).getPredicate();
							if (liSecondEv instanceof MessageEnd)
								liSecondEvPrd = new SMessageEnd((MessageEnd) liSecondEv).getPredicate();
							if (liFirstEvPrd != null && liSecondEvPrd != null) {
								comments.add(null);
								f.add(new SOrder(liFirstEvPrd, liSecondEvPrd,SD_Stop, false).getFun());
							}

							//<Separation> //Please find documentation of used methods in [separate].docx
							// // we have same separation for Operand as well.
							// // lastM = null;
							Predicate lastM = new Predicate();
							// // for (j = 0; j < EV[i].size - 1; j++){
							for (int j = 0; j < evSize - 1; j++) {
								//<auxiliary variables>
								InteractionFragment sepliEvj = null;
								InteractionFragment sepliEvjp1 = null;
								SCombinedFragment sepliCFj = null;
								SCombinedFragment sepliCFjp1 = null;
								Predicate sepliEvjPrd = null;
								Predicate sepliEvjp1Prd = null;
								BooleanFormulae nullcheck;
								
								sepliEvj = sd.getLifelines().get(i).getEvents().get(j);
								sepliEvjp1 = sd.getLifelines().get(i).getEvents().get(j + 1);
								String currentMessageUMLID = "";
								String nextMessageUMLID = "";
								if(sepliEvj instanceof MessageStart) {
									sepliEvjPrd = new SMessageStart((MessageStart)sepliEvj).getPredicate();
									currentMessageUMLID = ((MessageStart)sepliEvj).getMessage().getUMLId();
								}
								if(sepliEvj instanceof MessageEnd)
									sepliEvjPrd = new SMessageEnd((MessageEnd)sepliEvj).getPredicate();

								if(sepliEvjp1 instanceof MessageStart)
									sepliEvjp1Prd = new SMessageStart((MessageStart)sepliEvjp1).getPredicate();
								if(sepliEvjp1 instanceof MessageEnd) {
									sepliEvjp1Prd = new SMessageEnd((MessageEnd)sepliEvjp1).getPredicate();
									nextMessageUMLID = ((MessageEnd)sepliEvjp1).getMessage().getUMLId();
								}
								boolean isRecursiveMessage = false;
								if (currentMessageUMLID != "" && currentMessageUMLID == nextMessageUMLID)
									isRecursiveMessage = true;
								if (SInteractionFragmentFactory.getInstance(sepliEvj, config) instanceof SCombinedFragment)
//									sepliCFj = (SCombinedFragment)SInteractionFragmentFactory.getInstance(sepliEvj, config);
									sepliCFj = (SCombinedFragment)SCombinedFragmentFactory.getInstance((CombinedFragment)sepliEvj, config);
								if (SInteractionFragmentFactory.getInstance(sepliEvjp1, config) instanceof SCombinedFragment)
//									sepliCFjp1 = (SCombinedFragment)SInteractionFragmentFactory.getInstance(sepliEvjp1, config);
									sepliCFjp1 = (SCombinedFragment)SCombinedFragmentFactory.getInstance((CombinedFragment)sepliEvjp1, config);
								//</auxiliary variables>

								// // if  EV[i][j] is M1 and EV[i][j+1] is M2 and (M1 and M2 are not Send and Rec event of same message)
								if (sepliEvjPrd != null && sepliEvjp1Prd != null && !isRecursiveMessage) 
									// //     separate({M1}, {M2})
									f.add(separate(sepliEvjPrd, sepliEvjp1Prd));

								// // if Ev[i][j] is M1 and Ev[i][j+1] is CF_Y{
								if (sepliEvjPrd != null && sepliCFjp1 != null) {
									// //     separate({M1}, getFirstMs(CF_Y));
									nullcheck = separate(sepliEvjPrd, sepliCFjp1.getFirstMessages(currentLifelineName)); 
									if (nullcheck != null)
										f.add(nullcheck);
									// //     lastM = M1;}
									lastM = sepliEvjPrd;
								}

								// // if Ev[i][j] is CF_X and Ev[i][j+1] is M2{
								if (sepliCFj != null && sepliEvjp1Prd != null) {
									// //     separate(getLastMs(CF_X), {M2});
									nullcheck = separate(sepliEvjp1Prd, sepliCFj.getLastMessages(currentLifelineName));
									if (nullcheck != null) 
										f.add(nullcheck);
									// //     separate({lastM}, {M2});}
									nullcheck = separate(lastM, sepliEvjp1Prd);
									if (nullcheck != null)
										f.add(nullcheck);
								}

								// // if Ev[i][j] is CF_X and Ev[i][j+1] is CF_Y{
								if (sepliCFj != null && sepliCFjp1 != null) {
									// //     separate(getLastMs(CF_X), getFirstMs(CF_Y))
									ArrayList<BooleanFormulae> nullcheckarr = new ArrayList<BooleanFormulae>();
									nullcheckarr.addAll(separate(sepliCFj.getLastMessages(currentLifelineName), sepliCFjp1.getFirstMessages(currentLifelineName)));
									if (nullcheckarr != null)
										f.addAll(nullcheckarr);
						            // //     separate({lastM}, getFirstMs(CF_Y))} // because CF_Y may get ignored
									nullcheck = separate(lastM, sepliCFjp1.getFirstMessages(currentLifelineName));
									if (nullcheck != null)
										f.add(nullcheck);
								}
/*								 Since iterations of loop are separated this semantics is not required. 
								// // if Ev[i][j] is CF_Loop //When current element is CF_Loop, we need this additional separation.
								if (sepliCFj != null) {
									// //     separate(getLastMs(CF_Loop), getFirstMs(CF_Loop))
									if (sepliCFj.getOperator().equals("loop"))
										f.addAll(separate(sepliCFj.getLastMessages(currentLifelineName), sepliCFj.getFirstMessages(currentLifelineName)));
								}
*/								
								// // }
							}
							//</Separation>
						}
					}
					// // for (j = 1; j < EV[i].size - 1; j++){
					for (int j = 1; j < evSize - 1; j++) {// for second event to next last event
						liEvjPrd = liEvjp1Prd = null;
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
					tmpAnd.addFormulae(new SSomPIn_i(ssd.getLifelinePredicate(i).getEndPredicate(), ssd.getPredicate()).getFun());
				}
				comments.add(null);
				f.add(new Implies(SD_End, new And(new Or(ssd.getLifelinesPredicateEnds()), tmpAnd)));
				// //for (i = 0; i < n; i++){
				    // //for (j = 0; j < EV[i].size; j++){
				        // //if ((EV[i][j] == CF_X) && (history.indexOF != -1)){
				            // //history.add(CF_X)
				            // //CF_X(CF_X, enclosingFragmentPrd, CF_X_L_Pre, CF_X_L_Post, config)
				        // //}}}
				ArrayList<String> history = new ArrayList<String>();
				for (int i = 0; i < n; i++){
					int evSize = sd.getLifelines().get(i).getEvents().size();
					for (int j = 0; j < evSize ; j++){
						if (SInteractionFragmentFactory.getInstance(sd.getLifelines().get(i).getEvents().get(j), config) instanceof SCombinedFragment && !history.contains(SInteractionFragmentFactory.getInstance(sd.getLifelines().get(i).getEvents().get(j), config).getPredicate().toString())){
							ArrayList<BooleanFormulae> tempf1 = new ArrayList<BooleanFormulae>();
							tempf1 = SCombinedFragmentFactory.getInstance((CombinedFragmentItf)sd.getLifelines().get(i).getEvents().get(j), config).getSemantics();
							f.addAll(tempf1);
							history.add(SInteractionFragmentFactory.getInstance(sd.getLifelines().get(i).getEvents().get(j), config).getPredicate().toString());
						}
				   	}
				}
			}
			
			if(module != null) {///////////////////////////////////////////////////////////////////////////////////////////////////////////
				Predicate SD_Stop = smodule.getSDPredicate().getStopPredicate();
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
					tempf1.add(new SSomPIn_i(smodule.getLifelinePredicate(i).getEndPredicate(), smodule.getPredicate()));
				comments.add(null);
				f.add(new Implies(smodule.getPredicate().getEndPredicate(), new And(new Or(smodule.getLifelinesEndPredicates()), new And(tempf1))));
				// // &&i=1 to n(CF_X_Op_Li => CF_X_Op)
				for (int i = 0; i < n; i++)
					{comments.add(null);
					f.add(new Implies(smodule.getLifelinePredicate(i), smodule.getPredicate()));}
				// // if (config.combine == “ws”)
				if (config.combine == ConfigCombine.WS)
		        // // 	CF_X_Op_Start => ||j=1 to n (CF_X_Op_Lj_Start)
					{comments.add(null);
					f.add(new Implies(smodule.getPredicate().getStartPredicate(), new Or(smodule.getLifelinesStartPredicates())));}
				// // if (config.combine == “sync”)
				if (config.combine == ConfigCombine.SYNC) {
					// // for (int i = 0; i < n; i++){
					for (int i = 0; i < n; i++) {
			        // //     CF_X_Op_Start <=> (CF_X_Op_Li_Start)}
						comments.add(null);
						f.add(new Iff(smodule.getPredicate().getStartPredicate(), smodule.getLifelinePredicate(i).getStartPredicate()));
					}

				}
				// // order(module_Start, module_End, true, SD_Stop, True)
				comments.add(null);
				f.add(new SOrder(smodule.getPredicate().getStartPredicate(), smodule.getPredicate().getEndPredicate(), SD_Stop, true).getFun());
				// // &&i=1 to n (order(module_Li_Start, module_Li_End, True, SD_Stop, True))
				for (int i = 0; i < n; i++) 
					{comments.add(null);
					f.add(new SOrder(smodule.getLifelinePredicate(i).getStartPredicate(), smodule.getLifelinePredicate(i).getEndPredicate(), SD_Stop, true).getFun());}
				for (int i = 0; i < n; i++) {
					String currentLifelineName = module.getLifelinesNames().get(i);
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
					BooleanFormulae nullcheck;
					int evSize = module.getLifelineEvents(i).size();
					// //if (Ev[i].size == 0)
					if (evSize == 0)
						// // module_Li_Start <=> module_Li_End
						{comments.add(null);
						f.add(new Iff(smodule.getLifelinePredicate(i)
								.getStartPredicate(), smodule.getLifelinePredicate(i)
								.getEndPredicate()));}
					else {
						// //gathering information for next line
						liFirstEv = module.getLifelineEvents(i).get(0);
						liFirstEvPrd = null;
						if(liFirstEv instanceof MessageStart)
							liFirstEvPrd = new SMessageStart((MessageStart)liFirstEv).getPredicate();
						if(liFirstEv instanceof MessageEnd)
							liFirstEvPrd = new SMessageEnd((MessageEnd)liFirstEv).getPredicate();
						
						// // if (Ev[i][0] is message)
						// // order(module_Li_Start, Ev[i][0], True, SD_Stop, True)
						if (liFirstEvPrd != null)
							{comments.add(null);
							f.add(new SOrder(smodule.getLifelinePredicate(i).getStartPredicate(), liFirstEvPrd, SD_Stop, true).getFun());}
						// if ((EV[i].size > 1) && (EV[i][1] is message) && (EV[i][0] is message))
						// order(EV[i][0], EV[i][1], True, SD_Stop, False)
						if (evSize > 1) {
							liSecondEv = null;
							liSecondEv = module.getLifelineEvents(i).get(1);
							liSecondEvPrd = null;
							if(liSecondEv instanceof MessageStart)
								liSecondEvPrd = new SMessageStart((MessageStart)liSecondEv).getPredicate().getStartPredicate();
							if(liSecondEv instanceof MessageEnd)
								liSecondEvPrd = new SMessageEnd((MessageEnd)liSecondEv).getPredicate().getEndPredicate();
							if (liFirstEvPrd != null && liSecondEvPrd != null)
							{comments.add(null);
							f.add(new SOrder(liFirstEvPrd, liSecondEvPrd, SD_Stop, false).getFun());}
						
							//<Separation> //Please find documentation of used methods in [separate].docx
							// // we have same separation for Operand as well.
							// // lastM = null;
							Predicate lastM = new Predicate();
				            // // for (j = 0; j < EV[i].size - 1; j++){
							for (int j = 0; j < evSize - 1; j++) {
								//<auxiliary variables>
								InteractionFragment sepliEvj = null;
								InteractionFragment sepliEvjp1 = null;
								SCombinedFragment sepliCFj = null;
								SCombinedFragment sepliCFjp1 = null;
								Predicate sepliEvjPrd = null;
								Predicate sepliEvjp1Prd = null;
								
								sepliEvj = module.getLifelineEvents(i).get(j);
								sepliEvjp1 = module.getLifelineEvents(i).get(j + 1);
								String currentMessageUMLID = "";
								String nextMessageUMLID = "";
								if(sepliEvj instanceof MessageStart) {
									sepliEvjPrd = new SMessageStart((MessageStart)sepliEvj).getPredicate();
									currentMessageUMLID = ((MessageStart)sepliEvj).getMessage().getUMLId();
								}
								if(sepliEvj instanceof MessageEnd)
									sepliEvjPrd = new SMessageEnd((MessageEnd)sepliEvj).getPredicate();
								
								if(sepliEvjp1 instanceof MessageStart)
									sepliEvjp1Prd = new SMessageStart((MessageStart)sepliEvjp1).getPredicate();
								if(sepliEvjp1 instanceof MessageEnd) {
									sepliEvjp1Prd = new SMessageEnd((MessageEnd)sepliEvjp1).getPredicate();
									nextMessageUMLID = ((MessageEnd)sepliEvjp1).getMessage().getUMLId();
								}
								boolean isRecursiveMessage = false;
								if (currentMessageUMLID != "" && currentMessageUMLID == nextMessageUMLID)
									isRecursiveMessage = true;
								if (SInteractionFragmentFactory.getInstance(sepliEvj, config) instanceof SCombinedFragment)
//									sepliCFj = (SCombinedFragment)SInteractionFragmentFactory.getInstance(sepliEvj, config);
									sepliCFj = (SCombinedFragment)SCombinedFragmentFactory.getInstance((CombinedFragment)sepliEvj, config);
								if (SInteractionFragmentFactory.getInstance(sepliEvjp1, config) instanceof SCombinedFragment)
//									sepliCFjp1 = (SCombinedFragment)SInteractionFragmentFactory.getInstance(sepliEvjp1, config);
									sepliCFjp1 = (SCombinedFragment)SCombinedFragmentFactory.getInstance((CombinedFragment)sepliEvjp1, config);
								//</auxiliary variables>
								
								// // if  EV[i][j] is M1 and EV[i][j+1] is M2 and (M1 and M2 are not Send and Rec event of same message)
								if (sepliEvjPrd != null && sepliEvjp1Prd != null && !isRecursiveMessage) 
							// //     separate({M1}, {M2})
									f.add(separate(sepliEvjPrd, sepliEvjp1Prd));

							// // if Ev[i][j] is M1 and Ev[i][j+1] is CF_Y{
								if (sepliEvjPrd != null && sepliCFjp1 != null) {
							// //     separate({M1}, getFirstMs(CF_Y));
									nullcheck = separate(sepliEvjPrd, sepliCFjp1.getFirstMessages(currentLifelineName));
									if (nullcheck != null)
										f.add(nullcheck);
							// //     lastM = M1;}
									lastM = sepliEvjPrd;
								}
							
							// // if Ev[i][j] is CF_X and Ev[i][j+1] is M2{
								if (sepliCFj != null && sepliEvjp1Prd != null) {
							// //     separate(getLastMs(CF_X), {M2});
									nullcheck = separate(sepliEvjp1Prd, sepliCFj.getLastMessages(currentLifelineName));
									if (nullcheck != null)
										f.add(nullcheck);
							// //     separate({lastM}, {M2});}
									nullcheck = separate(lastM, sepliEvjp1Prd);
									if (nullcheck != null)
										f.add(nullcheck);
								}

							// // if Ev[i][j] is CF_X and Ev[i][j+1] is CF_Y
							if (sepliCFj != null && sepliCFjp1 != null) {
							// //     separate(getLastMs(CF_X), getFirstMs(CF_Y))
								ArrayList<BooleanFormulae> nullcheckarr = new ArrayList<BooleanFormulae>();
								nullcheckarr.addAll(separate(sepliCFj.getLastMessages(currentLifelineName), sepliCFjp1.getFirstMessages(currentLifelineName)));
								if (nullcheckarr != null)
									f.addAll(nullcheckarr);
							}
							
							/*Since iterations of loop are separated this semantics is not required. 
							 * // // if Ev[i][j] is CF_Loop //When current element is CF_Loop, we need this additional separation.
							if (sepliCFj != null) {
							// //     separate(getLastMs(CF_Loop), getFirstMs(CF_Loop))
								if (sepliCFj.getOperator().equals("loop"))
									f.addAll(separate(sepliCFj.getLastMessages(currentLifelineName), sepliCFj.getFirstMessages(currentLifelineName)));
							}*/
							
							// // }
							}
				            //</Separation>
						
						}
						
						// // module_Li_End <=> EV[i][EV[i].size-1]	//in WS and (last event = CF_X) module_Li_End <=> CF_X_Li_End. in SYNC and (last event = CF_X) module_Li_End <=> CF_X_End 
						liLastEv = module.getLifelineEvents(i).get(evSize - 1);
						if(liLastEv instanceof MessageStart)
							liLastEvPrd = new SMessageStart((MessageStart)liLastEv).getPredicate();
						if(liLastEv instanceof MessageEnd)
							liLastEvPrd = new SMessageEnd((MessageEnd)liLastEv).getPredicate();
						if(liLastEv instanceof CombinedFragment)
							if (config.combine == ConfigCombine.WS) 
								liLastEvPrd = new SCombinedFragment((CombinedFragment)liLastEv, config).getLifelinePredicate(smodule.getLifelines().get(i).getName()).getEndPredicate();// we need to get lifeline's predicate by using its name, because indexes may be different in different CFs.
							else if (config.combine == ConfigCombine.SYNC)
								liLastEvPrd = new SCombinedFragment((CombinedFragment)liLastEv, config).getPredicate().getEndPredicate();
						comments.add(null);
						f.add(new Iff(smodule.getLifelinePredicate(i).getEndPredicate(), liLastEvPrd));
					}
					
					// // for (j = 1; j < EV[i].size - 1; j++){
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
					tmpAnd.addFormulae(new SSomPIn_i(smodule.getLifelinePredicate(i).getEndPredicate(), smodule.getPredicate()));
				}
				comments.add(null);
				f.add(new Implies(smodule.getPredicate().getEndPredicate(), new And(new Or(smodule.getLifelinesEndPredicates()), tmpAnd)));
				// //for (i = 0; i < n; i++){
				    // //for (j = 0; j < EV[i].size; j++){
				        // //if ((EV[i][j] == CF_X) && (history.indexOF != -1)){
				            // //history.add(CF_X)
				            // //CF_X(CF_X, enclosingFragmentPrd, CF_X_L_Pre, CF_X_L_Post, config)
				        // //}}}
				ArrayList<String> history = new ArrayList<String>();
				for (int i = 0; i < n; i++){
					int evSize = module.getLifelineEvents(i).size();
					for (int j = 0; j < evSize ; j++){
						if (SInteractionFragmentFactory.getInstance(module.getLifelineEvents(i).get(j), config) instanceof SCombinedFragment && !history.contains(SInteractionFragmentFactory.getInstance(module.getLifelineEvents(i).get(j), config).getPredicate().toString())){
							history.add(SInteractionFragmentFactory.getInstance(module.getLifelineEvents(i).get(j), config).getPredicate().toString());
							ArrayList<BooleanFormulae> tempf2 = new ArrayList<BooleanFormulae>();
							tempf2 = SCombinedFragmentFactory.getInstance((CombinedFragmentItf)module.getLifelineEvents(i).get(j), config).getSemantics();
							f.addAll(tempf2);
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

	public ArrayList<BooleanFormulae> separate(ArrayList<Predicate> group1, ArrayList<Predicate> group2) {
		ArrayList<BooleanFormulae> sepf = new ArrayList<BooleanFormulae>();
		if (group1 == null || group2 == null)
			return null;
		if (group1.size() ==0 || group2.size() == 0)
			return null;
		for (Predicate m1: group1) {
			if (separate(m1, group2) != null)
				sepf.add(separate(m1, group2));
		}
		return sepf;
	}
	
	public BooleanFormulae separate(Predicate m1, Predicate m2) {
		return(new Implies(m1, new Not(m2)));
	}
	
	public BooleanFormulae separate(Predicate m1, ArrayList<Predicate> group2) {
		if (group2 == null)
			return null;
		if (group2.size() == 0)
			return null;
		if (group2.size() == 1)
			return separate(m1, group2.get(0));
		else
			return (new Implies(m1, new Not(new Or(group2))));
	}

}