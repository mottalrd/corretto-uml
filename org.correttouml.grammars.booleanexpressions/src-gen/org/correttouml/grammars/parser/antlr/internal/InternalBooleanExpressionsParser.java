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
import org.correttouml.grammars.services.BooleanExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBooleanExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OR", "RULE_AND", "RULE_NOT", "RULE_RELATIONS", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'@'", "'-'", "'{'", "'}'", "'.'", "'now'", "'exit'", "'enter'", "'start'", "'end'", "'tick'", "'sig'", "'call'", "'send'", "'receive'"
    };
    public static final int RULE_ID=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_OR=4;
    public static final int RULE_RELATIONS=7;
    public static final int RULE_AND=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_NOT=6;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=10;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=8;
    public static final int RULE_WS=13;

    // delegates
    // delegators


        public InternalBooleanExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBooleanExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBooleanExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g"; }



     	private BooleanExpressionsGrammarAccess grammarAccess;
     	
        public InternalBooleanExpressionsParser(TokenStream input, BooleanExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected BooleanExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:76:1: ruleModel returns [EObject current=null] : ( (lv_expression_0_0= ruleOrExpression ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:79:28: ( ( (lv_expression_0_0= ruleOrExpression ) ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:80:1: ( (lv_expression_0_0= ruleOrExpression ) )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:80:1: ( (lv_expression_0_0= ruleOrExpression ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:81:1: (lv_expression_0_0= ruleOrExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:81:1: (lv_expression_0_0= ruleOrExpression )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:82:3: lv_expression_0_0= ruleOrExpression
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getExpressionOrExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleOrExpression_in_ruleModel130);
            lv_expression_0_0=ruleOrExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"OrExpression");
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


    // $ANTLR start "entryRuleOrExpression"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:106:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:107:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:108:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression165);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression175); 

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:115:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_leftExpression_0_0= ruleAndExpression ) ) ( ( (lv_or_1_0= RULE_OR ) ) ( (lv_rightExpression_2_0= ruleOrExpression ) ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_or_1_0=null;
        EObject lv_leftExpression_0_0 = null;

        EObject lv_rightExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:118:28: ( ( ( (lv_leftExpression_0_0= ruleAndExpression ) ) ( ( (lv_or_1_0= RULE_OR ) ) ( (lv_rightExpression_2_0= ruleOrExpression ) ) )? ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:119:1: ( ( (lv_leftExpression_0_0= ruleAndExpression ) ) ( ( (lv_or_1_0= RULE_OR ) ) ( (lv_rightExpression_2_0= ruleOrExpression ) ) )? )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:119:1: ( ( (lv_leftExpression_0_0= ruleAndExpression ) ) ( ( (lv_or_1_0= RULE_OR ) ) ( (lv_rightExpression_2_0= ruleOrExpression ) ) )? )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:119:2: ( (lv_leftExpression_0_0= ruleAndExpression ) ) ( ( (lv_or_1_0= RULE_OR ) ) ( (lv_rightExpression_2_0= ruleOrExpression ) ) )?
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:119:2: ( (lv_leftExpression_0_0= ruleAndExpression ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:120:1: (lv_leftExpression_0_0= ruleAndExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:120:1: (lv_leftExpression_0_0= ruleAndExpression )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:121:3: lv_leftExpression_0_0= ruleAndExpression
            {
             
            	        newCompositeNode(grammarAccess.getOrExpressionAccess().getLeftExpressionAndExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression221);
            lv_leftExpression_0_0=ruleAndExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"leftExpression",
                    		lv_leftExpression_0_0, 
                    		"AndExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:137:2: ( ( (lv_or_1_0= RULE_OR ) ) ( (lv_rightExpression_2_0= ruleOrExpression ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_OR) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:137:3: ( (lv_or_1_0= RULE_OR ) ) ( (lv_rightExpression_2_0= ruleOrExpression ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:137:3: ( (lv_or_1_0= RULE_OR ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:138:1: (lv_or_1_0= RULE_OR )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:138:1: (lv_or_1_0= RULE_OR )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:139:3: lv_or_1_0= RULE_OR
                    {
                    lv_or_1_0=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleOrExpression239); 

                    			newLeafNode(lv_or_1_0, grammarAccess.getOrExpressionAccess().getOrORTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOrExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"or",
                            		lv_or_1_0, 
                            		"OR");
                    	    

                    }


                    }

                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:155:2: ( (lv_rightExpression_2_0= ruleOrExpression ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:156:1: (lv_rightExpression_2_0= ruleOrExpression )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:156:1: (lv_rightExpression_2_0= ruleOrExpression )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:157:3: lv_rightExpression_2_0= ruleOrExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExpressionOrExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleOrExpression265);
                    lv_rightExpression_2_0=ruleOrExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rightExpression",
                            		lv_rightExpression_2_0, 
                            		"OrExpression");
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:181:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:182:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:183:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression303);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression313); 

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:190:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_leftExpression_0_0= ruleBaseExpression ) ) ( ( (lv_and_1_0= RULE_AND ) ) ( (lv_rightExpression_2_0= ruleAndExpression ) ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_and_1_0=null;
        EObject lv_leftExpression_0_0 = null;

        EObject lv_rightExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:193:28: ( ( ( (lv_leftExpression_0_0= ruleBaseExpression ) ) ( ( (lv_and_1_0= RULE_AND ) ) ( (lv_rightExpression_2_0= ruleAndExpression ) ) )? ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:194:1: ( ( (lv_leftExpression_0_0= ruleBaseExpression ) ) ( ( (lv_and_1_0= RULE_AND ) ) ( (lv_rightExpression_2_0= ruleAndExpression ) ) )? )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:194:1: ( ( (lv_leftExpression_0_0= ruleBaseExpression ) ) ( ( (lv_and_1_0= RULE_AND ) ) ( (lv_rightExpression_2_0= ruleAndExpression ) ) )? )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:194:2: ( (lv_leftExpression_0_0= ruleBaseExpression ) ) ( ( (lv_and_1_0= RULE_AND ) ) ( (lv_rightExpression_2_0= ruleAndExpression ) ) )?
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:194:2: ( (lv_leftExpression_0_0= ruleBaseExpression ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:195:1: (lv_leftExpression_0_0= ruleBaseExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:195:1: (lv_leftExpression_0_0= ruleBaseExpression )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:196:3: lv_leftExpression_0_0= ruleBaseExpression
            {
             
            	        newCompositeNode(grammarAccess.getAndExpressionAccess().getLeftExpressionBaseExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBaseExpression_in_ruleAndExpression359);
            lv_leftExpression_0_0=ruleBaseExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"leftExpression",
                    		lv_leftExpression_0_0, 
                    		"BaseExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:212:2: ( ( (lv_and_1_0= RULE_AND ) ) ( (lv_rightExpression_2_0= ruleAndExpression ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_AND) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:212:3: ( (lv_and_1_0= RULE_AND ) ) ( (lv_rightExpression_2_0= ruleAndExpression ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:212:3: ( (lv_and_1_0= RULE_AND ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:213:1: (lv_and_1_0= RULE_AND )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:213:1: (lv_and_1_0= RULE_AND )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:214:3: lv_and_1_0= RULE_AND
                    {
                    lv_and_1_0=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleAndExpression377); 

                    			newLeafNode(lv_and_1_0, grammarAccess.getAndExpressionAccess().getAndANDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAndExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"and",
                            		lv_and_1_0, 
                            		"AND");
                    	    

                    }


                    }

                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:230:2: ( (lv_rightExpression_2_0= ruleAndExpression ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:231:1: (lv_rightExpression_2_0= ruleAndExpression )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:231:1: (lv_rightExpression_2_0= ruleAndExpression )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:232:3: lv_rightExpression_2_0= ruleAndExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExpressionAndExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAndExpression_in_ruleAndExpression403);
                    lv_rightExpression_2_0=ruleAndExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rightExpression",
                            		lv_rightExpression_2_0, 
                            		"AndExpression");
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleBaseExpression"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:256:1: entryRuleBaseExpression returns [EObject current=null] : iv_ruleBaseExpression= ruleBaseExpression EOF ;
    public final EObject entryRuleBaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseExpression = null;


        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:257:2: (iv_ruleBaseExpression= ruleBaseExpression EOF )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:258:2: iv_ruleBaseExpression= ruleBaseExpression EOF
            {
             newCompositeNode(grammarAccess.getBaseExpressionRule()); 
            pushFollow(FOLLOW_ruleBaseExpression_in_entryRuleBaseExpression441);
            iv_ruleBaseExpression=ruleBaseExpression();

            state._fsp--;

             current =iv_ruleBaseExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseExpression451); 

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
    // $ANTLR end "entryRuleBaseExpression"


    // $ANTLR start "ruleBaseExpression"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:265:1: ruleBaseExpression returns [EObject current=null] : ( ( (lv_not_0_0= RULE_NOT ) )? ( ( (lv_booleanTerm_1_0= rulebooleanTerm ) ) | (otherlv_2= '(' ( (lv_rootExpression_3_0= ruleOrExpression ) ) otherlv_4= ')' ) ) ) ;
    public final EObject ruleBaseExpression() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_booleanTerm_1_0 = null;

        EObject lv_rootExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:268:28: ( ( ( (lv_not_0_0= RULE_NOT ) )? ( ( (lv_booleanTerm_1_0= rulebooleanTerm ) ) | (otherlv_2= '(' ( (lv_rootExpression_3_0= ruleOrExpression ) ) otherlv_4= ')' ) ) ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:269:1: ( ( (lv_not_0_0= RULE_NOT ) )? ( ( (lv_booleanTerm_1_0= rulebooleanTerm ) ) | (otherlv_2= '(' ( (lv_rootExpression_3_0= ruleOrExpression ) ) otherlv_4= ')' ) ) )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:269:1: ( ( (lv_not_0_0= RULE_NOT ) )? ( ( (lv_booleanTerm_1_0= rulebooleanTerm ) ) | (otherlv_2= '(' ( (lv_rootExpression_3_0= ruleOrExpression ) ) otherlv_4= ')' ) ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:269:2: ( (lv_not_0_0= RULE_NOT ) )? ( ( (lv_booleanTerm_1_0= rulebooleanTerm ) ) | (otherlv_2= '(' ( (lv_rootExpression_3_0= ruleOrExpression ) ) otherlv_4= ')' ) )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:269:2: ( (lv_not_0_0= RULE_NOT ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NOT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:270:1: (lv_not_0_0= RULE_NOT )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:270:1: (lv_not_0_0= RULE_NOT )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:271:3: lv_not_0_0= RULE_NOT
                    {
                    lv_not_0_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleBaseExpression493); 

                    			newLeafNode(lv_not_0_0, grammarAccess.getBaseExpressionAccess().getNotNOTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"not",
                            		lv_not_0_0, 
                            		"NOT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:287:3: ( ( (lv_booleanTerm_1_0= rulebooleanTerm ) ) | (otherlv_2= '(' ( (lv_rootExpression_3_0= ruleOrExpression ) ) otherlv_4= ')' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==17||LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:287:4: ( (lv_booleanTerm_1_0= rulebooleanTerm ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:287:4: ( (lv_booleanTerm_1_0= rulebooleanTerm ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:288:1: (lv_booleanTerm_1_0= rulebooleanTerm )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:288:1: (lv_booleanTerm_1_0= rulebooleanTerm )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:289:3: lv_booleanTerm_1_0= rulebooleanTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseExpressionAccess().getBooleanTermBooleanTermParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulebooleanTerm_in_ruleBaseExpression521);
                    lv_booleanTerm_1_0=rulebooleanTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBaseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"booleanTerm",
                            		lv_booleanTerm_1_0, 
                            		"booleanTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:306:6: (otherlv_2= '(' ( (lv_rootExpression_3_0= ruleOrExpression ) ) otherlv_4= ')' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:306:6: (otherlv_2= '(' ( (lv_rootExpression_3_0= ruleOrExpression ) ) otherlv_4= ')' )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:306:8: otherlv_2= '(' ( (lv_rootExpression_3_0= ruleOrExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleBaseExpression540); 

                        	newLeafNode(otherlv_2, grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_1_1_0());
                        
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:310:1: ( (lv_rootExpression_3_0= ruleOrExpression ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:311:1: (lv_rootExpression_3_0= ruleOrExpression )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:311:1: (lv_rootExpression_3_0= ruleOrExpression )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:312:3: lv_rootExpression_3_0= ruleOrExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseExpressionAccess().getRootExpressionOrExpressionParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleBaseExpression561);
                    lv_rootExpression_3_0=ruleOrExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBaseExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rootExpression",
                            		lv_rootExpression_3_0, 
                            		"OrExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleBaseExpression573); 

                        	newLeafNode(otherlv_4, grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_1_1_2());
                        

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
    // $ANTLR end "ruleBaseExpression"


    // $ANTLR start "entryRulebooleanTerm"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:340:1: entryRulebooleanTerm returns [EObject current=null] : iv_rulebooleanTerm= rulebooleanTerm EOF ;
    public final EObject entryRulebooleanTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebooleanTerm = null;


        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:341:2: (iv_rulebooleanTerm= rulebooleanTerm EOF )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:342:2: iv_rulebooleanTerm= rulebooleanTerm EOF
            {
             newCompositeNode(grammarAccess.getBooleanTermRule()); 
            pushFollow(FOLLOW_rulebooleanTerm_in_entryRulebooleanTerm611);
            iv_rulebooleanTerm=rulebooleanTerm();

            state._fsp--;

             current =iv_rulebooleanTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRulebooleanTerm621); 

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
    // $ANTLR end "entryRulebooleanTerm"


    // $ANTLR start "rulebooleanTerm"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:349:1: rulebooleanTerm returns [EObject current=null] : ( ( (lv_timeConstraint_0_0= ruleTimeConstraint ) ) | ( (lv_booleanVariable_1_0= ruleBooleanVariable ) ) | ( (lv_variableCondition_2_0= ruleVariableCondition ) ) ) ;
    public final EObject rulebooleanTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_timeConstraint_0_0 = null;

        EObject lv_booleanVariable_1_0 = null;

        EObject lv_variableCondition_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:352:28: ( ( ( (lv_timeConstraint_0_0= ruleTimeConstraint ) ) | ( (lv_booleanVariable_1_0= ruleBooleanVariable ) ) | ( (lv_variableCondition_2_0= ruleVariableCondition ) ) ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:353:1: ( ( (lv_timeConstraint_0_0= ruleTimeConstraint ) ) | ( (lv_booleanVariable_1_0= ruleBooleanVariable ) ) | ( (lv_variableCondition_2_0= ruleVariableCondition ) ) )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:353:1: ( ( (lv_timeConstraint_0_0= ruleTimeConstraint ) ) | ( (lv_booleanVariable_1_0= ruleBooleanVariable ) ) | ( (lv_variableCondition_2_0= ruleVariableCondition ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:353:2: ( (lv_timeConstraint_0_0= ruleTimeConstraint ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:353:2: ( (lv_timeConstraint_0_0= ruleTimeConstraint ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:354:1: (lv_timeConstraint_0_0= ruleTimeConstraint )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:354:1: (lv_timeConstraint_0_0= ruleTimeConstraint )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:355:3: lv_timeConstraint_0_0= ruleTimeConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanTermAccess().getTimeConstraintTimeConstraintParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeConstraint_in_rulebooleanTerm667);
                    lv_timeConstraint_0_0=ruleTimeConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanTermRule());
                    	        }
                           		set(
                           			current, 
                           			"timeConstraint",
                            		lv_timeConstraint_0_0, 
                            		"TimeConstraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:372:6: ( (lv_booleanVariable_1_0= ruleBooleanVariable ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:372:6: ( (lv_booleanVariable_1_0= ruleBooleanVariable ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:373:1: (lv_booleanVariable_1_0= ruleBooleanVariable )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:373:1: (lv_booleanVariable_1_0= ruleBooleanVariable )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:374:3: lv_booleanVariable_1_0= ruleBooleanVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanTermAccess().getBooleanVariableBooleanVariableParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBooleanVariable_in_rulebooleanTerm694);
                    lv_booleanVariable_1_0=ruleBooleanVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanTermRule());
                    	        }
                           		set(
                           			current, 
                           			"booleanVariable",
                            		lv_booleanVariable_1_0, 
                            		"BooleanVariable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:391:6: ( (lv_variableCondition_2_0= ruleVariableCondition ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:391:6: ( (lv_variableCondition_2_0= ruleVariableCondition ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:392:1: (lv_variableCondition_2_0= ruleVariableCondition )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:392:1: (lv_variableCondition_2_0= ruleVariableCondition )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:393:3: lv_variableCondition_2_0= ruleVariableCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getBooleanTermAccess().getVariableConditionVariableConditionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableCondition_in_rulebooleanTerm721);
                    lv_variableCondition_2_0=ruleVariableCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBooleanTermRule());
                    	        }
                           		set(
                           			current, 
                           			"variableCondition",
                            		lv_variableCondition_2_0, 
                            		"VariableCondition");
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
    // $ANTLR end "rulebooleanTerm"


    // $ANTLR start "entryRuleTimeConstraint"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:417:1: entryRuleTimeConstraint returns [EObject current=null] : iv_ruleTimeConstraint= ruleTimeConstraint EOF ;
    public final EObject entryRuleTimeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeConstraint = null;


        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:418:2: (iv_ruleTimeConstraint= ruleTimeConstraint EOF )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:419:2: iv_ruleTimeConstraint= ruleTimeConstraint EOF
            {
             newCompositeNode(grammarAccess.getTimeConstraintRule()); 
            pushFollow(FOLLOW_ruleTimeConstraint_in_entryRuleTimeConstraint757);
            iv_ruleTimeConstraint=ruleTimeConstraint();

            state._fsp--;

             current =iv_ruleTimeConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeConstraint767); 

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
    // $ANTLR end "entryRuleTimeConstraint"


    // $ANTLR start "ruleTimeConstraint"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:426:1: ruleTimeConstraint returns [EObject current=null] : (otherlv_0= '@' ( (lv_event2_1_0= ruleEvent ) ) otherlv_2= '-' otherlv_3= '@' ( (lv_event1_4_0= ruleEvent ) ) ( (lv_op_5_0= RULE_RELATIONS ) ) ( (lv_value_6_0= RULE_INT ) ) ) ;
    public final EObject ruleTimeConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_op_5_0=null;
        Token lv_value_6_0=null;
        EObject lv_event2_1_0 = null;

        EObject lv_event1_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:429:28: ( (otherlv_0= '@' ( (lv_event2_1_0= ruleEvent ) ) otherlv_2= '-' otherlv_3= '@' ( (lv_event1_4_0= ruleEvent ) ) ( (lv_op_5_0= RULE_RELATIONS ) ) ( (lv_value_6_0= RULE_INT ) ) ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:430:1: (otherlv_0= '@' ( (lv_event2_1_0= ruleEvent ) ) otherlv_2= '-' otherlv_3= '@' ( (lv_event1_4_0= ruleEvent ) ) ( (lv_op_5_0= RULE_RELATIONS ) ) ( (lv_value_6_0= RULE_INT ) ) )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:430:1: (otherlv_0= '@' ( (lv_event2_1_0= ruleEvent ) ) otherlv_2= '-' otherlv_3= '@' ( (lv_event1_4_0= ruleEvent ) ) ( (lv_op_5_0= RULE_RELATIONS ) ) ( (lv_value_6_0= RULE_INT ) ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:430:3: otherlv_0= '@' ( (lv_event2_1_0= ruleEvent ) ) otherlv_2= '-' otherlv_3= '@' ( (lv_event1_4_0= ruleEvent ) ) ( (lv_op_5_0= RULE_RELATIONS ) ) ( (lv_value_6_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTimeConstraint804); 

                	newLeafNode(otherlv_0, grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_0());
                
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:434:1: ( (lv_event2_1_0= ruleEvent ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:435:1: (lv_event2_1_0= ruleEvent )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:435:1: (lv_event2_1_0= ruleEvent )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:436:3: lv_event2_1_0= ruleEvent
            {
             
            	        newCompositeNode(grammarAccess.getTimeConstraintAccess().getEvent2EventParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEvent_in_ruleTimeConstraint825);
            lv_event2_1_0=ruleEvent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"event2",
                    		lv_event2_1_0, 
                    		"Event");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleTimeConstraint837); 

                	newLeafNode(otherlv_2, grammarAccess.getTimeConstraintAccess().getHyphenMinusKeyword_2());
                
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleTimeConstraint849); 

                	newLeafNode(otherlv_3, grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_3());
                
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:460:1: ( (lv_event1_4_0= ruleEvent ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:461:1: (lv_event1_4_0= ruleEvent )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:461:1: (lv_event1_4_0= ruleEvent )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:462:3: lv_event1_4_0= ruleEvent
            {
             
            	        newCompositeNode(grammarAccess.getTimeConstraintAccess().getEvent1EventParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEvent_in_ruleTimeConstraint870);
            lv_event1_4_0=ruleEvent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"event1",
                    		lv_event1_4_0, 
                    		"Event");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:478:2: ( (lv_op_5_0= RULE_RELATIONS ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:479:1: (lv_op_5_0= RULE_RELATIONS )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:479:1: (lv_op_5_0= RULE_RELATIONS )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:480:3: lv_op_5_0= RULE_RELATIONS
            {
            lv_op_5_0=(Token)match(input,RULE_RELATIONS,FOLLOW_RULE_RELATIONS_in_ruleTimeConstraint887); 

            			newLeafNode(lv_op_5_0, grammarAccess.getTimeConstraintAccess().getOpRELATIONSTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"op",
                    		lv_op_5_0, 
                    		"RELATIONS");
            	    

            }


            }

            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:496:2: ( (lv_value_6_0= RULE_INT ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:497:1: (lv_value_6_0= RULE_INT )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:497:1: (lv_value_6_0= RULE_INT )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:498:3: lv_value_6_0= RULE_INT
            {
            lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeConstraint909); 

            			newLeafNode(lv_value_6_0, grammarAccess.getTimeConstraintAccess().getValueINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_6_0, 
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
    // $ANTLR end "ruleTimeConstraint"


    // $ANTLR start "entryRuleBooleanVariable"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:522:1: entryRuleBooleanVariable returns [EObject current=null] : iv_ruleBooleanVariable= ruleBooleanVariable EOF ;
    public final EObject entryRuleBooleanVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVariable = null;


        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:523:2: (iv_ruleBooleanVariable= ruleBooleanVariable EOF )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:524:2: iv_ruleBooleanVariable= ruleBooleanVariable EOF
            {
             newCompositeNode(grammarAccess.getBooleanVariableRule()); 
            pushFollow(FOLLOW_ruleBooleanVariable_in_entryRuleBooleanVariable950);
            iv_ruleBooleanVariable=ruleBooleanVariable();

            state._fsp--;

             current =iv_ruleBooleanVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanVariable960); 

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
    // $ANTLR end "entryRuleBooleanVariable"


    // $ANTLR start "ruleBooleanVariable"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:531:1: ruleBooleanVariable returns [EObject current=null] : ( (lv_variable_0_0= RULE_ID ) ) ;
    public final EObject ruleBooleanVariable() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;

         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:534:28: ( ( (lv_variable_0_0= RULE_ID ) ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:535:1: ( (lv_variable_0_0= RULE_ID ) )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:535:1: ( (lv_variable_0_0= RULE_ID ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:536:1: (lv_variable_0_0= RULE_ID )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:536:1: (lv_variable_0_0= RULE_ID )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:537:3: lv_variable_0_0= RULE_ID
            {
            lv_variable_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanVariable1001); 

            			newLeafNode(lv_variable_0_0, grammarAccess.getBooleanVariableAccess().getVariableIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleBooleanVariable"


    // $ANTLR start "entryRuleVariableCondition"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:561:1: entryRuleVariableCondition returns [EObject current=null] : iv_ruleVariableCondition= ruleVariableCondition EOF ;
    public final EObject entryRuleVariableCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCondition = null;


        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:562:2: (iv_ruleVariableCondition= ruleVariableCondition EOF )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:563:2: iv_ruleVariableCondition= ruleVariableCondition EOF
            {
             newCompositeNode(grammarAccess.getVariableConditionRule()); 
            pushFollow(FOLLOW_ruleVariableCondition_in_entryRuleVariableCondition1041);
            iv_ruleVariableCondition=ruleVariableCondition();

            state._fsp--;

             current =iv_ruleVariableCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableCondition1051); 

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
    // $ANTLR end "entryRuleVariableCondition"


    // $ANTLR start "ruleVariableCondition"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:570:1: ruleVariableCondition returns [EObject current=null] : (otherlv_0= '{' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_relation_2_0= RULE_RELATIONS ) ) ( ( (lv_value_3_0= RULE_INT ) ) | ( (lv_rightVariable_4_0= RULE_ID ) ) ) otherlv_5= '}' ) ;
    public final EObject ruleVariableCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token lv_relation_2_0=null;
        Token lv_value_3_0=null;
        Token lv_rightVariable_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:573:28: ( (otherlv_0= '{' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_relation_2_0= RULE_RELATIONS ) ) ( ( (lv_value_3_0= RULE_INT ) ) | ( (lv_rightVariable_4_0= RULE_ID ) ) ) otherlv_5= '}' ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:574:1: (otherlv_0= '{' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_relation_2_0= RULE_RELATIONS ) ) ( ( (lv_value_3_0= RULE_INT ) ) | ( (lv_rightVariable_4_0= RULE_ID ) ) ) otherlv_5= '}' )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:574:1: (otherlv_0= '{' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_relation_2_0= RULE_RELATIONS ) ) ( ( (lv_value_3_0= RULE_INT ) ) | ( (lv_rightVariable_4_0= RULE_ID ) ) ) otherlv_5= '}' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:574:3: otherlv_0= '{' ( (lv_variable_1_0= RULE_ID ) ) ( (lv_relation_2_0= RULE_RELATIONS ) ) ( ( (lv_value_3_0= RULE_INT ) ) | ( (lv_rightVariable_4_0= RULE_ID ) ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleVariableCondition1088); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableConditionAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:578:1: ( (lv_variable_1_0= RULE_ID ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:579:1: (lv_variable_1_0= RULE_ID )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:579:1: (lv_variable_1_0= RULE_ID )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:580:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableCondition1105); 

            			newLeafNode(lv_variable_1_0, grammarAccess.getVariableConditionAccess().getVariableIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:596:2: ( (lv_relation_2_0= RULE_RELATIONS ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:597:1: (lv_relation_2_0= RULE_RELATIONS )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:597:1: (lv_relation_2_0= RULE_RELATIONS )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:598:3: lv_relation_2_0= RULE_RELATIONS
            {
            lv_relation_2_0=(Token)match(input,RULE_RELATIONS,FOLLOW_RULE_RELATIONS_in_ruleVariableCondition1127); 

            			newLeafNode(lv_relation_2_0, grammarAccess.getVariableConditionAccess().getRelationRELATIONSTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableConditionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"relation",
                    		lv_relation_2_0, 
                    		"RELATIONS");
            	    

            }


            }

            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:614:2: ( ( (lv_value_3_0= RULE_INT ) ) | ( (lv_rightVariable_4_0= RULE_ID ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:614:3: ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:614:3: ( (lv_value_3_0= RULE_INT ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:615:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:615:1: (lv_value_3_0= RULE_INT )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:616:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariableCondition1150); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getVariableConditionAccess().getValueINTTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableConditionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:633:6: ( (lv_rightVariable_4_0= RULE_ID ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:633:6: ( (lv_rightVariable_4_0= RULE_ID ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:634:1: (lv_rightVariable_4_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:634:1: (lv_rightVariable_4_0= RULE_ID )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:635:3: lv_rightVariable_4_0= RULE_ID
                    {
                    lv_rightVariable_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableCondition1178); 

                    			newLeafNode(lv_rightVariable_4_0, grammarAccess.getVariableConditionAccess().getRightVariableIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableConditionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rightVariable",
                            		lv_rightVariable_4_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleVariableCondition1196); 

                	newLeafNode(otherlv_5, grammarAccess.getVariableConditionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleVariableCondition"


    // $ANTLR start "entryRuleEvent"
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:663:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:664:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:665:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent1232);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent1242); 

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
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:672:1: ruleEvent returns [EObject current=null] : ( ( ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) ) ) | ( (lv_nowEvent_3_0= 'now' ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_eventName_0_0=null;
        Token otherlv_1=null;
        Token lv_nowEvent_3_0=null;
        AntlrDatatypeRuleToken lv_eventExtension_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:675:28: ( ( ( ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) ) ) | ( (lv_nowEvent_3_0= 'now' ) ) ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:676:1: ( ( ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) ) ) | ( (lv_nowEvent_3_0= 'now' ) ) )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:676:1: ( ( ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) ) ) | ( (lv_nowEvent_3_0= 'now' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:676:2: ( ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:676:2: ( ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:676:3: ( (lv_eventName_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_eventExtension_2_0= ruleEventExtensions ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:676:3: ( (lv_eventName_0_0= RULE_ID ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:677:1: (lv_eventName_0_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:677:1: (lv_eventName_0_0= RULE_ID )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:678:3: lv_eventName_0_0= RULE_ID
                    {
                    lv_eventName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent1285); 

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

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleEvent1302); 

                        	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getFullStopKeyword_0_1());
                        
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:698:1: ( (lv_eventExtension_2_0= ruleEventExtensions ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:699:1: (lv_eventExtension_2_0= ruleEventExtensions )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:699:1: (lv_eventExtension_2_0= ruleEventExtensions )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:700:3: lv_eventExtension_2_0= ruleEventExtensions
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getEventExtensionEventExtensionsParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEventExtensions_in_ruleEvent1323);
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
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:717:6: ( (lv_nowEvent_3_0= 'now' ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:717:6: ( (lv_nowEvent_3_0= 'now' ) )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:718:1: (lv_nowEvent_3_0= 'now' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:718:1: (lv_nowEvent_3_0= 'now' )
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:719:3: lv_nowEvent_3_0= 'now'
                    {
                    lv_nowEvent_3_0=(Token)match(input,22,FOLLOW_22_in_ruleEvent1348); 

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
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:740:1: entryRuleEventExtensions returns [String current=null] : iv_ruleEventExtensions= ruleEventExtensions EOF ;
    public final String entryRuleEventExtensions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEventExtensions = null;


        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:741:2: (iv_ruleEventExtensions= ruleEventExtensions EOF )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:742:2: iv_ruleEventExtensions= ruleEventExtensions EOF
            {
             newCompositeNode(grammarAccess.getEventExtensionsRule()); 
            pushFollow(FOLLOW_ruleEventExtensions_in_entryRuleEventExtensions1398);
            iv_ruleEventExtensions=ruleEventExtensions();

            state._fsp--;

             current =iv_ruleEventExtensions.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventExtensions1409); 

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
    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:749:1: ruleEventExtensions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'exit' | kw= 'enter' | kw= 'start' | kw= 'end' | kw= 'tick' | kw= 'sig' | kw= 'call' | kw= 'send' | kw= 'receive' ) ;
    public final AntlrDatatypeRuleToken ruleEventExtensions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:752:28: ( (kw= 'exit' | kw= 'enter' | kw= 'start' | kw= 'end' | kw= 'tick' | kw= 'sig' | kw= 'call' | kw= 'send' | kw= 'receive' ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:753:1: (kw= 'exit' | kw= 'enter' | kw= 'start' | kw= 'end' | kw= 'tick' | kw= 'sig' | kw= 'call' | kw= 'send' | kw= 'receive' )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:753:1: (kw= 'exit' | kw= 'enter' | kw= 'start' | kw= 'end' | kw= 'tick' | kw= 'sig' | kw= 'call' | kw= 'send' | kw= 'receive' )
            int alt8=9;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 26:
                {
                alt8=4;
                }
                break;
            case 27:
                {
                alt8=5;
                }
                break;
            case 28:
                {
                alt8=6;
                }
                break;
            case 29:
                {
                alt8=7;
                }
                break;
            case 30:
                {
                alt8=8;
                }
                break;
            case 31:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:754:2: kw= 'exit'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleEventExtensions1447); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:761:2: kw= 'enter'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleEventExtensions1466); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:768:2: kw= 'start'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleEventExtensions1485); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:775:2: kw= 'end'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleEventExtensions1504); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:782:2: kw= 'tick'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleEventExtensions1523); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:789:2: kw= 'sig'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleEventExtensions1542); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:796:2: kw= 'call'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleEventExtensions1561); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:803:2: kw= 'send'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleEventExtensions1580); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getSendKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:810:2: kw= 'receive'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleEventExtensions1599); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEventExtensionsAccess().getReceiveKeyword_8()); 
                        

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
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression221 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleOrExpression239 = new BitSet(new long[]{0x00000000000A8240L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleOrExpression265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_ruleAndExpression359 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleAndExpression377 = new BitSet(new long[]{0x00000000000A8240L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleAndExpression403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_entryRuleBaseExpression441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseExpression451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleBaseExpression493 = new BitSet(new long[]{0x00000000000A8200L});
    public static final BitSet FOLLOW_rulebooleanTerm_in_ruleBaseExpression521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBaseExpression540 = new BitSet(new long[]{0x00000000000A8240L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleBaseExpression561 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBaseExpression573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebooleanTerm_in_entryRulebooleanTerm611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebooleanTerm621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeConstraint_in_rulebooleanTerm667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanVariable_in_rulebooleanTerm694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCondition_in_rulebooleanTerm721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeConstraint_in_entryRuleTimeConstraint757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeConstraint767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTimeConstraint804 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleTimeConstraint825 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTimeConstraint837 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTimeConstraint849 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleTimeConstraint870 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RELATIONS_in_ruleTimeConstraint887 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeConstraint909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanVariable_in_entryRuleBooleanVariable950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanVariable960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanVariable1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCondition_in_entryRuleVariableCondition1041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableCondition1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleVariableCondition1088 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableCondition1105 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_RELATIONS_in_ruleVariableCondition1127 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariableCondition1150 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableCondition1178 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVariableCondition1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent1285 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEvent1302 = new BitSet(new long[]{0x00000000FF800000L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_ruleEvent1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEvent1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_entryRuleEventExtensions1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventExtensions1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleEventExtensions1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEventExtensions1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEventExtensions1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEventExtensions1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEventExtensions1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEventExtensions1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEventExtensions1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEventExtensions1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEventExtensions1599 = new BitSet(new long[]{0x0000000000000002L});

}