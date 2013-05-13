package org.correttouml.grammars.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.correttouml.grammars.services.StateMachineActionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineActionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_OPERATOR", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'='", "'self'", "'@'", "'('", "')'", "'.'", "'exit'", "'enter'", "'start'", "'end'", "'tick'", "'sig'", "'call'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_OPERATOR=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalStateMachineActionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineActionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineActionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g"; }



     	private StateMachineActionsGrammarAccess grammarAccess;
     	
        public InternalStateMachineActionsParser(TokenStream input, StateMachineActionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected StateMachineActionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_action_0_0= ruleAction ) ) (otherlv_1= ',' ( (lv_actions_2_0= ruleModel ) ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_action_0_0 = null;

        EObject lv_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:79:28: ( ( ( (lv_action_0_0= ruleAction ) ) (otherlv_1= ',' ( (lv_actions_2_0= ruleModel ) ) )? ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:80:1: ( ( (lv_action_0_0= ruleAction ) ) (otherlv_1= ',' ( (lv_actions_2_0= ruleModel ) ) )? )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:80:1: ( ( (lv_action_0_0= ruleAction ) ) (otherlv_1= ',' ( (lv_actions_2_0= ruleModel ) ) )? )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:80:2: ( (lv_action_0_0= ruleAction ) ) (otherlv_1= ',' ( (lv_actions_2_0= ruleModel ) ) )?
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:80:2: ( (lv_action_0_0= ruleAction ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:81:1: (lv_action_0_0= ruleAction )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:81:1: (lv_action_0_0= ruleAction )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:82:3: lv_action_0_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getActionActionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAction_in_ruleModel131);
            lv_action_0_0=ruleAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"action",
                    		lv_action_0_0, 
                    		"Action");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:98:2: (otherlv_1= ',' ( (lv_actions_2_0= ruleModel ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:98:4: otherlv_1= ',' ( (lv_actions_2_0= ruleModel ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleModel144); 

                        	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getCommaKeyword_1_0());
                        
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:102:1: ( (lv_actions_2_0= ruleModel ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:103:1: (lv_actions_2_0= ruleModel )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:103:1: (lv_actions_2_0= ruleModel )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:104:3: lv_actions_2_0= ruleModel
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getActionsModelParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModel_in_ruleModel165);
                    lv_actions_2_0=ruleModel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		set(
                           			current, 
                           			"actions",
                            		lv_actions_2_0, 
                            		"Model");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAction"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:128:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:129:2: (iv_ruleAction= ruleAction EOF )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:130:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction203);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction213); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:137:1: ruleAction returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleAssignment ) ) | ( (lv_eventAction_1_0= ruleEventAction ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_0_0 = null;

        EObject lv_eventAction_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:140:28: ( ( ( (lv_assignment_0_0= ruleAssignment ) ) | ( (lv_eventAction_1_0= ruleEventAction ) ) ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:141:1: ( ( (lv_assignment_0_0= ruleAssignment ) ) | ( (lv_eventAction_1_0= ruleEventAction ) ) )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:141:1: ( ( (lv_assignment_0_0= ruleAssignment ) ) | ( (lv_eventAction_1_0= ruleEventAction ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==13) ) {
                    alt2=1;
                }
                else if ( (LA2_1==15) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:141:2: ( (lv_assignment_0_0= ruleAssignment ) )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:141:2: ( (lv_assignment_0_0= ruleAssignment ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:142:1: (lv_assignment_0_0= ruleAssignment )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:142:1: (lv_assignment_0_0= ruleAssignment )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:143:3: lv_assignment_0_0= ruleAssignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getAssignmentAssignmentParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssignment_in_ruleAction259);
                    lv_assignment_0_0=ruleAssignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"assignment",
                            		lv_assignment_0_0, 
                            		"Assignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:160:6: ( (lv_eventAction_1_0= ruleEventAction ) )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:160:6: ( (lv_eventAction_1_0= ruleEventAction ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:161:1: (lv_eventAction_1_0= ruleEventAction )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:161:1: (lv_eventAction_1_0= ruleEventAction )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:162:3: lv_eventAction_1_0= ruleEventAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getEventActionEventActionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEventAction_in_ruleAction286);
                    lv_eventAction_1_0=ruleEventAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"eventAction",
                            		lv_eventAction_1_0, 
                            		"EventAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAssignment"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:186:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:187:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:188:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment322);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment332); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:195:1: ruleAssignment returns [EObject current=null] : ( ( (lv_leftvar_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_leftvar_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:198:28: ( ( ( (lv_leftvar_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleEXPRESSION ) ) ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:199:1: ( ( (lv_leftvar_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleEXPRESSION ) ) )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:199:1: ( ( (lv_leftvar_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleEXPRESSION ) ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:199:2: ( (lv_leftvar_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleEXPRESSION ) )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:199:2: ( (lv_leftvar_0_0= RULE_ID ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:200:1: (lv_leftvar_0_0= RULE_ID )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:200:1: (lv_leftvar_0_0= RULE_ID )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:201:3: lv_leftvar_0_0= RULE_ID
            {
            lv_leftvar_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment374); 

            			newLeafNode(lv_leftvar_0_0, grammarAccess.getAssignmentAccess().getLeftvarIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"leftvar",
                    		lv_leftvar_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleAssignment391); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:221:1: ( (lv_expression_2_0= ruleEXPRESSION ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:222:1: (lv_expression_2_0= ruleEXPRESSION )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:222:1: (lv_expression_2_0= ruleEXPRESSION )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:223:3: lv_expression_2_0= ruleEXPRESSION
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionEXPRESSIONParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleAssignment412);
            lv_expression_2_0=ruleEXPRESSION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"EXPRESSION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleEXPRESSION"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:247:1: entryRuleEXPRESSION returns [EObject current=null] : iv_ruleEXPRESSION= ruleEXPRESSION EOF ;
    public final EObject entryRuleEXPRESSION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXPRESSION = null;


        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:248:2: (iv_ruleEXPRESSION= ruleEXPRESSION EOF )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:249:2: iv_ruleEXPRESSION= ruleEXPRESSION EOF
            {
             newCompositeNode(grammarAccess.getEXPRESSIONRule()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION448);
            iv_ruleEXPRESSION=ruleEXPRESSION();

            state._fsp--;

             current =iv_ruleEXPRESSION; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRESSION458); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXPRESSION"


    // $ANTLR start "ruleEXPRESSION"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:256:1: ruleEXPRESSION returns [EObject current=null] : ( ( ( (lv_firstTerm_0_0= ruleTERM ) ) ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_secondTerm_2_0= ruleTERM ) ) ) | ( (lv_alone_3_0= ruleTERM ) ) ) ;
    public final EObject ruleEXPRESSION() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        EObject lv_firstTerm_0_0 = null;

        EObject lv_secondTerm_2_0 = null;

        EObject lv_alone_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:259:28: ( ( ( ( (lv_firstTerm_0_0= ruleTERM ) ) ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_secondTerm_2_0= ruleTERM ) ) ) | ( (lv_alone_3_0= ruleTERM ) ) ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:260:1: ( ( ( (lv_firstTerm_0_0= ruleTERM ) ) ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_secondTerm_2_0= ruleTERM ) ) ) | ( (lv_alone_3_0= ruleTERM ) ) )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:260:1: ( ( ( (lv_firstTerm_0_0= ruleTERM ) ) ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_secondTerm_2_0= ruleTERM ) ) ) | ( (lv_alone_3_0= ruleTERM ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==12) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_OPERATOR) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_INT) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_OPERATOR) ) {
                    alt3=1;
                }
                else if ( (LA3_2==EOF||LA3_2==12) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:260:2: ( ( (lv_firstTerm_0_0= ruleTERM ) ) ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_secondTerm_2_0= ruleTERM ) ) )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:260:2: ( ( (lv_firstTerm_0_0= ruleTERM ) ) ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_secondTerm_2_0= ruleTERM ) ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:260:3: ( (lv_firstTerm_0_0= ruleTERM ) ) ( (lv_operator_1_0= RULE_OPERATOR ) ) ( (lv_secondTerm_2_0= ruleTERM ) )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:260:3: ( (lv_firstTerm_0_0= ruleTERM ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:261:1: (lv_firstTerm_0_0= ruleTERM )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:261:1: (lv_firstTerm_0_0= ruleTERM )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:262:3: lv_firstTerm_0_0= ruleTERM
                    {
                     
                    	        newCompositeNode(grammarAccess.getEXPRESSIONAccess().getFirstTermTERMParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTERM_in_ruleEXPRESSION505);
                    lv_firstTerm_0_0=ruleTERM();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEXPRESSIONRule());
                    	        }
                           		set(
                           			current, 
                           			"firstTerm",
                            		lv_firstTerm_0_0, 
                            		"TERM");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:278:2: ( (lv_operator_1_0= RULE_OPERATOR ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:279:1: (lv_operator_1_0= RULE_OPERATOR )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:279:1: (lv_operator_1_0= RULE_OPERATOR )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:280:3: lv_operator_1_0= RULE_OPERATOR
                    {
                    lv_operator_1_0=(Token)match(input,RULE_OPERATOR,FOLLOW_RULE_OPERATOR_in_ruleEXPRESSION522); 

                    			newLeafNode(lv_operator_1_0, grammarAccess.getEXPRESSIONAccess().getOperatorOPERATORTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEXPRESSIONRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_1_0, 
                            		"OPERATOR");
                    	    

                    }


                    }

                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:296:2: ( (lv_secondTerm_2_0= ruleTERM ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:297:1: (lv_secondTerm_2_0= ruleTERM )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:297:1: (lv_secondTerm_2_0= ruleTERM )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:298:3: lv_secondTerm_2_0= ruleTERM
                    {
                     
                    	        newCompositeNode(grammarAccess.getEXPRESSIONAccess().getSecondTermTERMParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTERM_in_ruleEXPRESSION548);
                    lv_secondTerm_2_0=ruleTERM();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEXPRESSIONRule());
                    	        }
                           		set(
                           			current, 
                           			"secondTerm",
                            		lv_secondTerm_2_0, 
                            		"TERM");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:315:6: ( (lv_alone_3_0= ruleTERM ) )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:315:6: ( (lv_alone_3_0= ruleTERM ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:316:1: (lv_alone_3_0= ruleTERM )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:316:1: (lv_alone_3_0= ruleTERM )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:317:3: lv_alone_3_0= ruleTERM
                    {
                     
                    	        newCompositeNode(grammarAccess.getEXPRESSIONAccess().getAloneTERMParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTERM_in_ruleEXPRESSION576);
                    lv_alone_3_0=ruleTERM();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEXPRESSIONRule());
                    	        }
                           		set(
                           			current, 
                           			"alone",
                            		lv_alone_3_0, 
                            		"TERM");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXPRESSION"


    // $ANTLR start "entryRuleTERM"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:341:1: entryRuleTERM returns [EObject current=null] : iv_ruleTERM= ruleTERM EOF ;
    public final EObject entryRuleTERM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTERM = null;


        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:342:2: (iv_ruleTERM= ruleTERM EOF )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:343:2: iv_ruleTERM= ruleTERM EOF
            {
             newCompositeNode(grammarAccess.getTERMRule()); 
            pushFollow(FOLLOW_ruleTERM_in_entryRuleTERM612);
            iv_ruleTERM=ruleTERM();

            state._fsp--;

             current =iv_ruleTERM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTERM622); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTERM"


    // $ANTLR start "ruleTERM"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:350:1: ruleTERM returns [EObject current=null] : ( ( (lv_variable_0_0= RULE_ID ) ) | ( (lv_constant_1_0= RULE_INT ) ) ) ;
    public final EObject ruleTERM() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        Token lv_constant_1_0=null;

         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:353:28: ( ( ( (lv_variable_0_0= RULE_ID ) ) | ( (lv_constant_1_0= RULE_INT ) ) ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:354:1: ( ( (lv_variable_0_0= RULE_ID ) ) | ( (lv_constant_1_0= RULE_INT ) ) )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:354:1: ( ( (lv_variable_0_0= RULE_ID ) ) | ( (lv_constant_1_0= RULE_INT ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:354:2: ( (lv_variable_0_0= RULE_ID ) )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:354:2: ( (lv_variable_0_0= RULE_ID ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:355:1: (lv_variable_0_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:355:1: (lv_variable_0_0= RULE_ID )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:356:3: lv_variable_0_0= RULE_ID
                    {
                    lv_variable_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTERM664); 

                    			newLeafNode(lv_variable_0_0, grammarAccess.getTERMAccess().getVariableIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTERMRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"variable",
                            		lv_variable_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:373:6: ( (lv_constant_1_0= RULE_INT ) )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:373:6: ( (lv_constant_1_0= RULE_INT ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:374:1: (lv_constant_1_0= RULE_INT )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:374:1: (lv_constant_1_0= RULE_INT )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:375:3: lv_constant_1_0= RULE_INT
                    {
                    lv_constant_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTERM692); 

                    			newLeafNode(lv_constant_1_0, grammarAccess.getTERMAccess().getConstantINTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTERMRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"constant",
                            		lv_constant_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTERM"


    // $ANTLR start "entryRuleEventAction"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:399:1: entryRuleEventAction returns [EObject current=null] : iv_ruleEventAction= ruleEventAction EOF ;
    public final EObject entryRuleEventAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventAction = null;


        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:400:2: (iv_ruleEventAction= ruleEventAction EOF )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:401:2: iv_ruleEventAction= ruleEventAction EOF
            {
             newCompositeNode(grammarAccess.getEventActionRule()); 
            pushFollow(FOLLOW_ruleEventAction_in_entryRuleEventAction733);
            iv_ruleEventAction=ruleEventAction();

            state._fsp--;

             current =iv_ruleEventAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventAction743); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventAction"


    // $ANTLR start "ruleEventAction"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:408:1: ruleEventAction returns [EObject current=null] : ( ( ( (lv_linkName_0_0= RULE_ID ) ) | ( (lv_self_1_0= 'self' ) ) )? otherlv_2= '@' ( (lv_eventName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameters ) ) otherlv_6= ')' )? otherlv_7= '.' ( (lv_eventExtension_8_0= ruleEventExtensions ) ) ) ;
    public final EObject ruleEventAction() throws RecognitionException {
        EObject current = null;

        Token lv_linkName_0_0=null;
        Token lv_self_1_0=null;
        Token otherlv_2=null;
        Token lv_eventName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameters_5_0 = null;

        AntlrDatatypeRuleToken lv_eventExtension_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:411:28: ( ( ( ( (lv_linkName_0_0= RULE_ID ) ) | ( (lv_self_1_0= 'self' ) ) )? otherlv_2= '@' ( (lv_eventName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameters ) ) otherlv_6= ')' )? otherlv_7= '.' ( (lv_eventExtension_8_0= ruleEventExtensions ) ) ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:412:1: ( ( ( (lv_linkName_0_0= RULE_ID ) ) | ( (lv_self_1_0= 'self' ) ) )? otherlv_2= '@' ( (lv_eventName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameters ) ) otherlv_6= ')' )? otherlv_7= '.' ( (lv_eventExtension_8_0= ruleEventExtensions ) ) )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:412:1: ( ( ( (lv_linkName_0_0= RULE_ID ) ) | ( (lv_self_1_0= 'self' ) ) )? otherlv_2= '@' ( (lv_eventName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameters ) ) otherlv_6= ')' )? otherlv_7= '.' ( (lv_eventExtension_8_0= ruleEventExtensions ) ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:412:2: ( ( (lv_linkName_0_0= RULE_ID ) ) | ( (lv_self_1_0= 'self' ) ) )? otherlv_2= '@' ( (lv_eventName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameters ) ) otherlv_6= ')' )? otherlv_7= '.' ( (lv_eventExtension_8_0= ruleEventExtensions ) )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:412:2: ( ( (lv_linkName_0_0= RULE_ID ) ) | ( (lv_self_1_0= 'self' ) ) )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:412:3: ( (lv_linkName_0_0= RULE_ID ) )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:412:3: ( (lv_linkName_0_0= RULE_ID ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:413:1: (lv_linkName_0_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:413:1: (lv_linkName_0_0= RULE_ID )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:414:3: lv_linkName_0_0= RULE_ID
                    {
                    lv_linkName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventAction786); 

                    			newLeafNode(lv_linkName_0_0, grammarAccess.getEventActionAccess().getLinkNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventActionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"linkName",
                            		lv_linkName_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:431:6: ( (lv_self_1_0= 'self' ) )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:431:6: ( (lv_self_1_0= 'self' ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:432:1: (lv_self_1_0= 'self' )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:432:1: (lv_self_1_0= 'self' )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:433:3: lv_self_1_0= 'self'
                    {
                    lv_self_1_0=(Token)match(input,14,FOLLOW_14_in_ruleEventAction815); 

                            newLeafNode(lv_self_1_0, grammarAccess.getEventActionAccess().getSelfSelfKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventActionRule());
                    	        }
                           		setWithLastConsumed(current, "self", lv_self_1_0, "self");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEventAction842); 

                	newLeafNode(otherlv_2, grammarAccess.getEventActionAccess().getCommercialAtKeyword_1());
                
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:450:1: ( (lv_eventName_3_0= RULE_ID ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:451:1: (lv_eventName_3_0= RULE_ID )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:451:1: (lv_eventName_3_0= RULE_ID )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:452:3: lv_eventName_3_0= RULE_ID
            {
            lv_eventName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventAction859); 

            			newLeafNode(lv_eventName_3_0, grammarAccess.getEventActionAccess().getEventNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"eventName",
                    		lv_eventName_3_0, 
                    		"ID");
            	    

            }


            }

            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:468:2: (otherlv_4= '(' ( (lv_parameters_5_0= ruleParameters ) ) otherlv_6= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:468:4: otherlv_4= '(' ( (lv_parameters_5_0= ruleParameters ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleEventAction877); 

                        	newLeafNode(otherlv_4, grammarAccess.getEventActionAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:472:1: ( (lv_parameters_5_0= ruleParameters ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:473:1: (lv_parameters_5_0= ruleParameters )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:473:1: (lv_parameters_5_0= ruleParameters )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:474:3: lv_parameters_5_0= ruleParameters
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventActionAccess().getParametersParametersParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameters_in_ruleEventAction898);
                    lv_parameters_5_0=ruleParameters();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventActionRule());
                    	        }
                           		set(
                           			current, 
                           			"parameters",
                            		lv_parameters_5_0, 
                            		"Parameters");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleEventAction910); 

                        	newLeafNode(otherlv_6, grammarAccess.getEventActionAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleEventAction924); 

                	newLeafNode(otherlv_7, grammarAccess.getEventActionAccess().getFullStopKeyword_4());
                
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:498:1: ( (lv_eventExtension_8_0= ruleEventExtensions ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:499:1: (lv_eventExtension_8_0= ruleEventExtensions )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:499:1: (lv_eventExtension_8_0= ruleEventExtensions )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:500:3: lv_eventExtension_8_0= ruleEventExtensions
            {
             
            	        newCompositeNode(grammarAccess.getEventActionAccess().getEventExtensionEventExtensionsParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEventExtensions_in_ruleEventAction945);
            lv_eventExtension_8_0=ruleEventExtensions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventActionRule());
            	        }
                   		set(
                   			current, 
                   			"eventExtension",
                    		lv_eventExtension_8_0, 
                    		"EventExtensions");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventAction"


    // $ANTLR start "entryRuleParameters"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:524:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:525:2: (iv_ruleParameters= ruleParameters EOF )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:526:2: iv_ruleParameters= ruleParameters EOF
            {
             newCompositeNode(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters981);
            iv_ruleParameters=ruleParameters();

            state._fsp--;

             current =iv_ruleParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameters991); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:533:1: ruleParameters returns [EObject current=null] : ( ( (lv_param_0_0= RULE_ID ) ) | ( ( (lv_param_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_parameters_3_0= ruleParameters ) ) ) ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token lv_param_0_0=null;
        Token lv_param_1_0=null;
        Token otherlv_2=null;
        EObject lv_parameters_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:536:28: ( ( ( (lv_param_0_0= RULE_ID ) ) | ( ( (lv_param_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_parameters_3_0= ruleParameters ) ) ) ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:537:1: ( ( (lv_param_0_0= RULE_ID ) ) | ( ( (lv_param_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_parameters_3_0= ruleParameters ) ) ) )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:537:1: ( ( (lv_param_0_0= RULE_ID ) ) | ( ( (lv_param_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_parameters_3_0= ruleParameters ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==12) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||LA7_1==17) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:537:2: ( (lv_param_0_0= RULE_ID ) )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:537:2: ( (lv_param_0_0= RULE_ID ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:538:1: (lv_param_0_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:538:1: (lv_param_0_0= RULE_ID )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:539:3: lv_param_0_0= RULE_ID
                    {
                    lv_param_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameters1033); 

                    			newLeafNode(lv_param_0_0, grammarAccess.getParametersAccess().getParamIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParametersRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"param",
                            		lv_param_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:556:6: ( ( (lv_param_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_parameters_3_0= ruleParameters ) ) )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:556:6: ( ( (lv_param_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_parameters_3_0= ruleParameters ) ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:556:7: ( (lv_param_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_parameters_3_0= ruleParameters ) )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:556:7: ( (lv_param_1_0= RULE_ID ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:557:1: (lv_param_1_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:557:1: (lv_param_1_0= RULE_ID )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:558:3: lv_param_1_0= RULE_ID
                    {
                    lv_param_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameters1062); 

                    			newLeafNode(lv_param_1_0, grammarAccess.getParametersAccess().getParamIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParametersRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"param",
                            		lv_param_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleParameters1079); 

                        	newLeafNode(otherlv_2, grammarAccess.getParametersAccess().getCommaKeyword_1_1());
                        
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:578:1: ( (lv_parameters_3_0= ruleParameters ) )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:579:1: (lv_parameters_3_0= ruleParameters )
                    {
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:579:1: (lv_parameters_3_0= ruleParameters )
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:580:3: lv_parameters_3_0= ruleParameters
                    {
                     
                    	        newCompositeNode(grammarAccess.getParametersAccess().getParametersParametersParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameters_in_ruleParameters1100);
                    lv_parameters_3_0=ruleParameters();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParametersRule());
                    	        }
                           		set(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"Parameters");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleEventExtensions"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:604:1: entryRuleEventExtensions returns [String current=null] : iv_ruleEventExtensions= ruleEventExtensions EOF ;
    public final String entryRuleEventExtensions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEventExtensions = null;


        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:605:2: (iv_ruleEventExtensions= ruleEventExtensions EOF )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:606:2: iv_ruleEventExtensions= ruleEventExtensions EOF
            {
             newCompositeNode(grammarAccess.getEventExtensionsRule()); 
            pushFollow(FOLLOW_ruleEventExtensions_in_entryRuleEventExtensions1138);
            iv_ruleEventExtensions=ruleEventExtensions();

            state._fsp--;

             current =iv_ruleEventExtensions.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventExtensions1149); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventExtensions"


    // $ANTLR start "ruleEventExtensions"
    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:613:1: ruleEventExtensions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'exit' | kw= 'enter' | kw= 'start' | kw= 'end' | kw= 'tick' | kw= 'sig' | kw= 'call' ) ;
    public final AntlrDatatypeRuleToken ruleEventExtensions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:616:28: ( (kw= 'exit' | kw= 'enter' | kw= 'start' | kw= 'end' | kw= 'tick' | kw= 'sig' | kw= 'call' ) )
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:617:1: (kw= 'exit' | kw= 'enter' | kw= 'start' | kw= 'end' | kw= 'tick' | kw= 'sig' | kw= 'call' )
            {
            // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:617:1: (kw= 'exit' | kw= 'enter' | kw= 'start' | kw= 'end' | kw= 'tick' | kw= 'sig' | kw= 'call' )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 23:
                {
                alt8=5;
                }
                break;
            case 24:
                {
                alt8=6;
                }
                break;
            case 25:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:618:2: kw= 'exit'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleEventExtensions1187); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:625:2: kw= 'enter'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleEventExtensions1206); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:632:2: kw= 'start'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleEventExtensions1225); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:639:2: kw= 'end'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleEventExtensions1244); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:646:2: kw= 'tick'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleEventExtensions1263); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:653:2: kw= 'sig'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleEventExtensions1282); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.correttouml.grammars.statemachineactions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineActions.g:660:2: kw= 'call'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleEventExtensions1301); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventExtensions"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleModel131 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleModel144 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_ruleModel_in_ruleModel165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleAction259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventAction_in_ruleAction286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment374 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssignment391 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleAssignment412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRESSION458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTERM_in_ruleEXPRESSION505 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_OPERATOR_in_ruleEXPRESSION522 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleTERM_in_ruleEXPRESSION548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTERM_in_ruleEXPRESSION576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTERM_in_entryRuleTERM612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTERM622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTERM664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTERM692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventAction_in_entryRuleEventAction733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventAction743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventAction786 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14_in_ruleEventAction815 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEventAction842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventAction859 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_ruleEventAction877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameters_in_ruleEventAction898 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEventAction910 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEventAction924 = new BitSet(new long[]{0x0000000003F80000L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_ruleEventAction945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameters991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameters1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameters1062 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleParameters1079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameters_in_ruleParameters1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_entryRuleEventExtensions1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventExtensions1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEventExtensions1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEventExtensions1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEventExtensions1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEventExtensions1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEventExtensions1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEventExtensions1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEventExtensions1301 = new BitSet(new long[]{0x0000000000000002L});

}