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
import org.correttouml.grammars.services.StateMachineTriggersGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineTriggersParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RELATIONS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'self'", "'@'", "'-'", "'.'", "'now'", "'exit'", "'enter'", "'start'", "'end'", "'tick'", "'sig'", "'call'"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_RELATIONS=5;
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
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalStateMachineTriggersParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineTriggersParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineTriggersParser.tokenNames; }
    public String getGrammarFileName() { return "../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g"; }



     	private StateMachineTriggersGrammarAccess grammarAccess;
     	
        public InternalStateMachineTriggersParser(TokenStream input, StateMachineTriggersGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected StateMachineTriggersGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:76:1: ruleModel returns [EObject current=null] : ( (lv_trigger_0_0= ruleTrigger ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_trigger_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:79:28: ( ( (lv_trigger_0_0= ruleTrigger ) ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:80:1: ( (lv_trigger_0_0= ruleTrigger ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:80:1: ( (lv_trigger_0_0= ruleTrigger ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:81:1: (lv_trigger_0_0= ruleTrigger )
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:81:1: (lv_trigger_0_0= ruleTrigger )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:82:3: lv_trigger_0_0= ruleTrigger
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getTriggerTriggerParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleTrigger_in_ruleModel130);
            lv_trigger_0_0=ruleTrigger();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"trigger",
                    		lv_trigger_0_0, 
                    		"Trigger");
            	        afterParserOrEnumRuleCall();
            	    

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


    // $ANTLR start "entryRuleTrigger"
    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:106:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:107:2: (iv_ruleTrigger= ruleTrigger EOF )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:108:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_ruleTrigger_in_entryRuleTrigger165);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrigger175); 

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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:115:1: ruleTrigger returns [EObject current=null] : ( ( (lv_left_0_0= ruleLeft ) ) ( (lv_right_1_0= ruleRight ) )? ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:118:28: ( ( ( (lv_left_0_0= ruleLeft ) ) ( (lv_right_1_0= ruleRight ) )? ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:119:1: ( ( (lv_left_0_0= ruleLeft ) ) ( (lv_right_1_0= ruleRight ) )? )
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:119:1: ( ( (lv_left_0_0= ruleLeft ) ) ( (lv_right_1_0= ruleRight ) )? )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:119:2: ( (lv_left_0_0= ruleLeft ) ) ( (lv_right_1_0= ruleRight ) )?
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:119:2: ( (lv_left_0_0= ruleLeft ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:120:1: (lv_left_0_0= ruleLeft )
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:120:1: (lv_left_0_0= ruleLeft )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:121:3: lv_left_0_0= ruleLeft
            {
             
            	        newCompositeNode(grammarAccess.getTriggerAccess().getLeftLeftParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLeft_in_ruleTrigger221);
            lv_left_0_0=ruleLeft();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTriggerRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"Left");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:137:2: ( (lv_right_1_0= ruleRight ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:138:1: (lv_right_1_0= ruleRight )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:138:1: (lv_right_1_0= ruleRight )
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:139:3: lv_right_1_0= ruleRight
                    {
                     
                    	        newCompositeNode(grammarAccess.getTriggerAccess().getRightRightParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRight_in_ruleTrigger242);
                    lv_right_1_0=ruleRight();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTriggerRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_1_0, 
                            		"Right");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleLeft"
    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:163:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:164:2: (iv_ruleLeft= ruleLeft EOF )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:165:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_ruleLeft_in_entryRuleLeft279);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeft289); 

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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:172:1: ruleLeft returns [EObject current=null] : ( ( ( (lv_linkName_0_0= RULE_ID ) ) | ( (lv_self_1_0= 'self' ) ) )? otherlv_2= '@' ( (lv_event_3_0= ruleEvent ) ) ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token lv_linkName_0_0=null;
        Token lv_self_1_0=null;
        Token otherlv_2=null;
        EObject lv_event_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:175:28: ( ( ( ( (lv_linkName_0_0= RULE_ID ) ) | ( (lv_self_1_0= 'self' ) ) )? otherlv_2= '@' ( (lv_event_3_0= ruleEvent ) ) ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:176:1: ( ( ( (lv_linkName_0_0= RULE_ID ) ) | ( (lv_self_1_0= 'self' ) ) )? otherlv_2= '@' ( (lv_event_3_0= ruleEvent ) ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:176:1: ( ( ( (lv_linkName_0_0= RULE_ID ) ) | ( (lv_self_1_0= 'self' ) ) )? otherlv_2= '@' ( (lv_event_3_0= ruleEvent ) ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:176:2: ( ( (lv_linkName_0_0= RULE_ID ) ) | ( (lv_self_1_0= 'self' ) ) )? otherlv_2= '@' ( (lv_event_3_0= ruleEvent ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:176:2: ( ( (lv_linkName_0_0= RULE_ID ) ) | ( (lv_self_1_0= 'self' ) ) )?
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            switch (alt2) {
                case 1 :
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:176:3: ( (lv_linkName_0_0= RULE_ID ) )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:176:3: ( (lv_linkName_0_0= RULE_ID ) )
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:177:1: (lv_linkName_0_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:177:1: (lv_linkName_0_0= RULE_ID )
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:178:3: lv_linkName_0_0= RULE_ID
                    {
                    lv_linkName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLeft332); 

                    			newLeafNode(lv_linkName_0_0, grammarAccess.getLeftAccess().getLinkNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLeftRule());
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
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:195:6: ( (lv_self_1_0= 'self' ) )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:195:6: ( (lv_self_1_0= 'self' ) )
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:196:1: (lv_self_1_0= 'self' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:196:1: (lv_self_1_0= 'self' )
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:197:3: lv_self_1_0= 'self'
                    {
                    lv_self_1_0=(Token)match(input,12,FOLLOW_12_in_ruleLeft361); 

                            newLeafNode(lv_self_1_0, grammarAccess.getLeftAccess().getSelfSelfKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLeftRule());
                    	        }
                           		setWithLastConsumed(current, "self", lv_self_1_0, "self");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleLeft388); 

                	newLeafNode(otherlv_2, grammarAccess.getLeftAccess().getCommercialAtKeyword_1());
                
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:214:1: ( (lv_event_3_0= ruleEvent ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:215:1: (lv_event_3_0= ruleEvent )
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:215:1: (lv_event_3_0= ruleEvent )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:216:3: lv_event_3_0= ruleEvent
            {
             
            	        newCompositeNode(grammarAccess.getLeftAccess().getEventEventParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEvent_in_ruleLeft409);
            lv_event_3_0=ruleEvent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLeftRule());
            	        }
                   		set(
                   			current, 
                   			"event",
                    		lv_event_3_0, 
                    		"Event");
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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:240:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:241:2: (iv_ruleRight= ruleRight EOF )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:242:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_ruleRight_in_entryRuleRight445);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRight455); 

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
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:249:1: ruleRight returns [EObject current=null] : (otherlv_0= '-' otherlv_1= '@' ( (lv_event_2_0= ruleEvent ) ) ( (lv_op_3_0= RULE_RELATIONS ) ) ( (lv_value_4_0= RULE_INT ) ) ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_op_3_0=null;
        Token lv_value_4_0=null;
        EObject lv_event_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:252:28: ( (otherlv_0= '-' otherlv_1= '@' ( (lv_event_2_0= ruleEvent ) ) ( (lv_op_3_0= RULE_RELATIONS ) ) ( (lv_value_4_0= RULE_INT ) ) ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:253:1: (otherlv_0= '-' otherlv_1= '@' ( (lv_event_2_0= ruleEvent ) ) ( (lv_op_3_0= RULE_RELATIONS ) ) ( (lv_value_4_0= RULE_INT ) ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:253:1: (otherlv_0= '-' otherlv_1= '@' ( (lv_event_2_0= ruleEvent ) ) ( (lv_op_3_0= RULE_RELATIONS ) ) ( (lv_value_4_0= RULE_INT ) ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:253:3: otherlv_0= '-' otherlv_1= '@' ( (lv_event_2_0= ruleEvent ) ) ( (lv_op_3_0= RULE_RELATIONS ) ) ( (lv_value_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleRight492); 

                	newLeafNode(otherlv_0, grammarAccess.getRightAccess().getHyphenMinusKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleRight504); 

                	newLeafNode(otherlv_1, grammarAccess.getRightAccess().getCommercialAtKeyword_1());
                
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:261:1: ( (lv_event_2_0= ruleEvent ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:262:1: (lv_event_2_0= ruleEvent )
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:262:1: (lv_event_2_0= ruleEvent )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:263:3: lv_event_2_0= ruleEvent
            {
             
            	        newCompositeNode(grammarAccess.getRightAccess().getEventEventParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEvent_in_ruleRight525);
            lv_event_2_0=ruleEvent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRightRule());
            	        }
                   		set(
                   			current, 
                   			"event",
                    		lv_event_2_0, 
                    		"Event");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:279:2: ( (lv_op_3_0= RULE_RELATIONS ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:280:1: (lv_op_3_0= RULE_RELATIONS )
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:280:1: (lv_op_3_0= RULE_RELATIONS )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:281:3: lv_op_3_0= RULE_RELATIONS
            {
            lv_op_3_0=(Token)match(input,RULE_RELATIONS,FOLLOW_RULE_RELATIONS_in_ruleRight542); 

            			newLeafNode(lv_op_3_0, grammarAccess.getRightAccess().getOpRELATIONSTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRightRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"op",
                    		lv_op_3_0, 
                    		"RELATIONS");
            	    

            }


            }

            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:297:2: ( (lv_value_4_0= RULE_INT ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:298:1: (lv_value_4_0= RULE_INT )
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:298:1: (lv_value_4_0= RULE_INT )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:299:3: lv_value_4_0= RULE_INT
            {
            lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRight564); 

            			newLeafNode(lv_value_4_0, grammarAccess.getRightAccess().getValueINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRightRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleEvent"
    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:323:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:324:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:325:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent605);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent615); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:332:1: ruleEvent returns [EObject current=null] : ( ( ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) ) ) | ( (lv_nowEvent_3_0= 'now' ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_eventName_0_0=null;
        Token otherlv_1=null;
        Token lv_nowEvent_3_0=null;
        AntlrDatatypeRuleToken lv_eventExtension_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:335:28: ( ( ( ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) ) ) | ( (lv_nowEvent_3_0= 'now' ) ) ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:336:1: ( ( ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) ) ) | ( (lv_nowEvent_3_0= 'now' ) ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:336:1: ( ( ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) ) ) | ( (lv_nowEvent_3_0= 'now' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:336:2: ( ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) ) )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:336:2: ( ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) ) )
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:336:3: ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:336:3: ( (lv_eventName_0_0= RULE_ID ) )
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:337:1: (lv_eventName_0_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:337:1: (lv_eventName_0_0= RULE_ID )
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:338:3: lv_eventName_0_0= RULE_ID
                    {
                    lv_eventName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent658); 

                    			newLeafNode(lv_eventName_0_0, grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"eventName",
                            		lv_eventName_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleEvent675); 

                        	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getFullStopKeyword_0_1());
                        
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:358:1: ( (lv_eventExtension_2_0= ruleEventExtensions ) )
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:359:1: (lv_eventExtension_2_0= ruleEventExtensions )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:359:1: (lv_eventExtension_2_0= ruleEventExtensions )
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:360:3: lv_eventExtension_2_0= ruleEventExtensions
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getEventExtensionEventExtensionsParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEventExtensions_in_ruleEvent696);
                    lv_eventExtension_2_0=ruleEventExtensions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"eventExtension",
                            		lv_eventExtension_2_0, 
                            		"EventExtensions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:377:6: ( (lv_nowEvent_3_0= 'now' ) )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:377:6: ( (lv_nowEvent_3_0= 'now' ) )
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:378:1: (lv_nowEvent_3_0= 'now' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:378:1: (lv_nowEvent_3_0= 'now' )
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:379:3: lv_nowEvent_3_0= 'now'
                    {
                    lv_nowEvent_3_0=(Token)match(input,16,FOLLOW_16_in_ruleEvent721); 

                            newLeafNode(lv_nowEvent_3_0, grammarAccess.getEventAccess().getNowEventNowKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(current, "nowEvent", true, "now");
                    	    

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEventExtensions"
    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:400:1: entryRuleEventExtensions returns [String current=null] : iv_ruleEventExtensions= ruleEventExtensions EOF ;
    public final String entryRuleEventExtensions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEventExtensions = null;


        try {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:401:2: (iv_ruleEventExtensions= ruleEventExtensions EOF )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:402:2: iv_ruleEventExtensions= ruleEventExtensions EOF
            {
             newCompositeNode(grammarAccess.getEventExtensionsRule()); 
            pushFollow(FOLLOW_ruleEventExtensions_in_entryRuleEventExtensions771);
            iv_ruleEventExtensions=ruleEventExtensions();

            state._fsp--;

             current =iv_ruleEventExtensions.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventExtensions782); 

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
    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:409:1: ruleEventExtensions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'exit' | kw= 'enter' | kw= 'start' | kw= 'end' | kw= 'tick' | kw= 'sig' | kw= 'call' ) ;
    public final AntlrDatatypeRuleToken ruleEventExtensions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:412:28: ( (kw= 'exit' | kw= 'enter' | kw= 'start' | kw= 'end' | kw= 'tick' | kw= 'sig' | kw= 'call' ) )
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:413:1: (kw= 'exit' | kw= 'enter' | kw= 'start' | kw= 'end' | kw= 'tick' | kw= 'sig' | kw= 'call' )
            {
            // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:413:1: (kw= 'exit' | kw= 'enter' | kw= 'start' | kw= 'end' | kw= 'tick' | kw= 'sig' | kw= 'call' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case 21:
                {
                alt4=5;
                }
                break;
            case 22:
                {
                alt4=6;
                }
                break;
            case 23:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:414:2: kw= 'exit'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleEventExtensions820); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:421:2: kw= 'enter'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleEventExtensions839); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:428:2: kw= 'start'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleEventExtensions858); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:435:2: kw= 'end'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleEventExtensions877); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:442:2: kw= 'tick'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleEventExtensions896); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:449:2: kw= 'sig'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleEventExtensions915); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.correttouml.grammars.statemachinetriggers/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalStateMachineTriggers.g:456:2: kw= 'call'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleEventExtensions934); 

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
    public static final BitSet FOLLOW_ruleTrigger_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrigger175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeft_in_ruleTrigger221 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleRight_in_ruleTrigger242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeft_in_entryRuleLeft279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeft289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLeft332 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12_in_ruleLeft361 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLeft388 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleLeft409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRight_in_entryRuleRight445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRight455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleRight492 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRight504 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleRight525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_RELATIONS_in_ruleRight542 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRight564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent658 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvent675 = new BitSet(new long[]{0x0000000000FE0000L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_ruleEvent696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEvent721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_entryRuleEventExtensions771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventExtensions782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEventExtensions820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEventExtensions839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEventExtensions858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEventExtensions877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEventExtensions896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEventExtensions915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEventExtensions934 = new BitSet(new long[]{0x0000000000000002L});

}