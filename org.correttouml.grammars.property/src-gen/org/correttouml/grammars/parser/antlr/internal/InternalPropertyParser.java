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
import org.correttouml.grammars.services.PropertyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPropertyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EXECUTE", "RULE_ID", "RULE_TRIOOPF", "RULE_TRIOOPFF", "RULE_TRIOOPFN", "RULE_INT", "RULE_TRIOOP2", "RULE_ARITH_COMPARE_OP", "RULE_ARITH_OP", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Corretto.'", "'verify('", "')'", "'='", "'.getState('", "','", "'.in('", "'.call('", "'system.getSignal('", "'!('", "'Time.'", "'('", "'Futr('", "'Past('", "'.'", "'::'", "'.getParameter('", "'system.getStaticVar('"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_TRIOOPFN=8;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_TRIOOPFF=7;
    public static final int RULE_FLOAT=13;
    public static final int RULE_SL_COMMENT=16;
    public static final int EOF=-1;
    public static final int RULE_ARITH_OP=12;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=14;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_TRIOOPF=6;
    public static final int RULE_INT=9;
    public static final int RULE_WS=17;
    public static final int RULE_EXECUTE=4;
    public static final int RULE_TRIOOP2=10;
    public static final int RULE_ARITH_COMPARE_OP=11;

    // delegates
    // delegators


        public InternalPropertyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPropertyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPropertyParser.tokenNames; }
    public String getGrammarFileName() { return "../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g"; }



     	private PropertyGrammarAccess grammarAccess;
     	
        public InternalPropertyParser(TokenStream input, PropertyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PropertyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_correttoCommand_1_0= ruleCorretto ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;

        EObject lv_correttoCommand_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:79:28: ( ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_correttoCommand_1_0= ruleCorretto ) ) ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:80:1: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_correttoCommand_1_0= ruleCorretto ) ) )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:80:1: ( ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_correttoCommand_1_0= ruleCorretto ) ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:80:2: ( (lv_declarations_0_0= ruleDeclaration ) )* ( (lv_correttoCommand_1_0= ruleCorretto ) )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:80:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:81:1: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:81:1: (lv_declarations_0_0= ruleDeclaration )
            	    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:82:3: lv_declarations_0_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleModel131);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_0_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:98:3: ( (lv_correttoCommand_1_0= ruleCorretto ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:99:1: (lv_correttoCommand_1_0= ruleCorretto )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:99:1: (lv_correttoCommand_1_0= ruleCorretto )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:100:3: lv_correttoCommand_1_0= ruleCorretto
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getCorrettoCommandCorrettoParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCorretto_in_ruleModel153);
            lv_correttoCommand_1_0=ruleCorretto();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"correttoCommand",
                    		lv_correttoCommand_1_0, 
                    		"Corretto");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCorretto"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:124:1: entryRuleCorretto returns [EObject current=null] : iv_ruleCorretto= ruleCorretto EOF ;
    public final EObject entryRuleCorretto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorretto = null;


        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:125:2: (iv_ruleCorretto= ruleCorretto EOF )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:126:2: iv_ruleCorretto= ruleCorretto EOF
            {
             newCompositeNode(grammarAccess.getCorrettoRule()); 
            pushFollow(FOLLOW_ruleCorretto_in_entryRuleCorretto189);
            iv_ruleCorretto=ruleCorretto();

            state._fsp--;

             current =iv_ruleCorretto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCorretto199); 

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
    // $ANTLR end "entryRuleCorretto"


    // $ANTLR start "ruleCorretto"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:133:1: ruleCorretto returns [EObject current=null] : (otherlv_0= 'Corretto.' ( ( (lv_verify_1_0= ruleVerify ) ) | ( (lv_execute_2_0= RULE_EXECUTE ) ) ) ) ;
    public final EObject ruleCorretto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_execute_2_0=null;
        EObject lv_verify_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:136:28: ( (otherlv_0= 'Corretto.' ( ( (lv_verify_1_0= ruleVerify ) ) | ( (lv_execute_2_0= RULE_EXECUTE ) ) ) ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:137:1: (otherlv_0= 'Corretto.' ( ( (lv_verify_1_0= ruleVerify ) ) | ( (lv_execute_2_0= RULE_EXECUTE ) ) ) )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:137:1: (otherlv_0= 'Corretto.' ( ( (lv_verify_1_0= ruleVerify ) ) | ( (lv_execute_2_0= RULE_EXECUTE ) ) ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:137:3: otherlv_0= 'Corretto.' ( ( (lv_verify_1_0= ruleVerify ) ) | ( (lv_execute_2_0= RULE_EXECUTE ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCorretto236); 

                	newLeafNode(otherlv_0, grammarAccess.getCorrettoAccess().getCorrettoKeyword_0());
                
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:141:1: ( ( (lv_verify_1_0= ruleVerify ) ) | ( (lv_execute_2_0= RULE_EXECUTE ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_EXECUTE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:141:2: ( (lv_verify_1_0= ruleVerify ) )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:141:2: ( (lv_verify_1_0= ruleVerify ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:142:1: (lv_verify_1_0= ruleVerify )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:142:1: (lv_verify_1_0= ruleVerify )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:143:3: lv_verify_1_0= ruleVerify
                    {
                     
                    	        newCompositeNode(grammarAccess.getCorrettoAccess().getVerifyVerifyParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerify_in_ruleCorretto258);
                    lv_verify_1_0=ruleVerify();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCorrettoRule());
                    	        }
                           		set(
                           			current, 
                           			"verify",
                            		lv_verify_1_0, 
                            		"Verify");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:160:6: ( (lv_execute_2_0= RULE_EXECUTE ) )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:160:6: ( (lv_execute_2_0= RULE_EXECUTE ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:161:1: (lv_execute_2_0= RULE_EXECUTE )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:161:1: (lv_execute_2_0= RULE_EXECUTE )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:162:3: lv_execute_2_0= RULE_EXECUTE
                    {
                    lv_execute_2_0=(Token)match(input,RULE_EXECUTE,FOLLOW_RULE_EXECUTE_in_ruleCorretto281); 

                    			newLeafNode(lv_execute_2_0, grammarAccess.getCorrettoAccess().getExecuteEXECUTETerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCorrettoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"execute",
                            		lv_execute_2_0, 
                            		"EXECUTE");
                    	    

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
    // $ANTLR end "ruleCorretto"


    // $ANTLR start "entryRuleVerify"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:186:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:187:2: (iv_ruleVerify= ruleVerify EOF )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:188:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_ruleVerify_in_entryRuleVerify323);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerify333); 

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
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:195:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'verify(' ( (lv_trio_1_0= ruleTRIO ) ) otherlv_2= ')' ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_trio_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:198:28: ( (otherlv_0= 'verify(' ( (lv_trio_1_0= ruleTRIO ) ) otherlv_2= ')' ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:199:1: (otherlv_0= 'verify(' ( (lv_trio_1_0= ruleTRIO ) ) otherlv_2= ')' )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:199:1: (otherlv_0= 'verify(' ( (lv_trio_1_0= ruleTRIO ) ) otherlv_2= ')' )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:199:3: otherlv_0= 'verify(' ( (lv_trio_1_0= ruleTRIO ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleVerify370); 

                	newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
                
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:203:1: ( (lv_trio_1_0= ruleTRIO ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:204:1: (lv_trio_1_0= ruleTRIO )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:204:1: (lv_trio_1_0= ruleTRIO )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:205:3: lv_trio_1_0= ruleTRIO
            {
             
            	        newCompositeNode(grammarAccess.getVerifyAccess().getTrioTRIOParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTRIO_in_ruleVerify391);
            lv_trio_1_0=ruleTRIO();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVerifyRule());
            	        }
                   		set(
                   			current, 
                   			"trio",
                    		lv_trio_1_0, 
                    		"TRIO");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleVerify403); 

                	newLeafNode(otherlv_2, grammarAccess.getVerifyAccess().getRightParenthesisKeyword_2());
                

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
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:233:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:234:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:235:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration439);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration449); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:242:1: ruleDeclaration returns [EObject current=null] : ( ( ( (lv_stateName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_obj_2_0= RULE_ID ) ) otherlv_3= '.getState(' ( (lv_std_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_uMLStateName_6_0= RULE_ID ) ) otherlv_7= ')' ) | ( ( (lv_trioVar_8_0= RULE_ID ) ) otherlv_9= '=' ( ( (lv_trio_10_0= ruleTRIO ) ) | ( ( (lv_obj_11_0= RULE_ID ) ) ( (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' ) | (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' ) ) ) ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_stateName_0_0=null;
        Token otherlv_1=null;
        Token lv_obj_2_0=null;
        Token otherlv_3=null;
        Token lv_std_4_0=null;
        Token otherlv_5=null;
        Token lv_uMLStateName_6_0=null;
        Token otherlv_7=null;
        Token lv_trioVar_8_0=null;
        Token otherlv_9=null;
        Token lv_obj_11_0=null;
        Token otherlv_12=null;
        Token lv_stateName_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_operationName_16_0=null;
        Token otherlv_17=null;
        EObject lv_trio_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:245:28: ( ( ( ( (lv_stateName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_obj_2_0= RULE_ID ) ) otherlv_3= '.getState(' ( (lv_std_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_uMLStateName_6_0= RULE_ID ) ) otherlv_7= ')' ) | ( ( (lv_trioVar_8_0= RULE_ID ) ) otherlv_9= '=' ( ( (lv_trio_10_0= ruleTRIO ) ) | ( ( (lv_obj_11_0= RULE_ID ) ) ( (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' ) | (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' ) ) ) ) ) ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:246:1: ( ( ( (lv_stateName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_obj_2_0= RULE_ID ) ) otherlv_3= '.getState(' ( (lv_std_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_uMLStateName_6_0= RULE_ID ) ) otherlv_7= ')' ) | ( ( (lv_trioVar_8_0= RULE_ID ) ) otherlv_9= '=' ( ( (lv_trio_10_0= ruleTRIO ) ) | ( ( (lv_obj_11_0= RULE_ID ) ) ( (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' ) | (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' ) ) ) ) ) )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:246:1: ( ( ( (lv_stateName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_obj_2_0= RULE_ID ) ) otherlv_3= '.getState(' ( (lv_std_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_uMLStateName_6_0= RULE_ID ) ) otherlv_7= ')' ) | ( ( (lv_trioVar_8_0= RULE_ID ) ) otherlv_9= '=' ( ( (lv_trio_10_0= ruleTRIO ) ) | ( ( (lv_obj_11_0= RULE_ID ) ) ( (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' ) | (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' ) ) ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==22) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_ID) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==23) ) {
                            alt5=1;
                        }
                        else if ( (LA5_3==EOF||LA5_3==RULE_ID||LA5_3==RULE_TRIOOP2||LA5_3==19||(LA5_3>=25 && LA5_3<=26)||(LA5_3>=33 && LA5_3<=35)) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA5_2==RULE_INT||(LA5_2>=27 && LA5_2<=32)||LA5_2==36) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:246:2: ( ( (lv_stateName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_obj_2_0= RULE_ID ) ) otherlv_3= '.getState(' ( (lv_std_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_uMLStateName_6_0= RULE_ID ) ) otherlv_7= ')' )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:246:2: ( ( (lv_stateName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_obj_2_0= RULE_ID ) ) otherlv_3= '.getState(' ( (lv_std_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_uMLStateName_6_0= RULE_ID ) ) otherlv_7= ')' )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:246:3: ( (lv_stateName_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_obj_2_0= RULE_ID ) ) otherlv_3= '.getState(' ( (lv_std_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_uMLStateName_6_0= RULE_ID ) ) otherlv_7= ')'
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:246:3: ( (lv_stateName_0_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:247:1: (lv_stateName_0_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:247:1: (lv_stateName_0_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:248:3: lv_stateName_0_0= RULE_ID
                    {
                    lv_stateName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration492); 

                    			newLeafNode(lv_stateName_0_0, grammarAccess.getDeclarationAccess().getStateNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"stateName",
                            		lv_stateName_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleDeclaration509); 

                        	newLeafNode(otherlv_1, grammarAccess.getDeclarationAccess().getEqualsSignKeyword_0_1());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:268:1: ( (lv_obj_2_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:269:1: (lv_obj_2_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:269:1: (lv_obj_2_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:270:3: lv_obj_2_0= RULE_ID
                    {
                    lv_obj_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration526); 

                    			newLeafNode(lv_obj_2_0, grammarAccess.getDeclarationAccess().getObjIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"obj",
                            		lv_obj_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleDeclaration543); 

                        	newLeafNode(otherlv_3, grammarAccess.getDeclarationAccess().getGetStateKeyword_0_3());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:290:1: ( (lv_std_4_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:291:1: (lv_std_4_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:291:1: (lv_std_4_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:292:3: lv_std_4_0= RULE_ID
                    {
                    lv_std_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration560); 

                    			newLeafNode(lv_std_4_0, grammarAccess.getDeclarationAccess().getStdIDTerminalRuleCall_0_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"std",
                            		lv_std_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleDeclaration577); 

                        	newLeafNode(otherlv_5, grammarAccess.getDeclarationAccess().getCommaKeyword_0_5());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:312:1: ( (lv_uMLStateName_6_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:313:1: (lv_uMLStateName_6_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:313:1: (lv_uMLStateName_6_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:314:3: lv_uMLStateName_6_0= RULE_ID
                    {
                    lv_uMLStateName_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration594); 

                    			newLeafNode(lv_uMLStateName_6_0, grammarAccess.getDeclarationAccess().getUMLStateNameIDTerminalRuleCall_0_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"uMLStateName",
                            		lv_uMLStateName_6_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleDeclaration611); 

                        	newLeafNode(otherlv_7, grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_0_7());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:335:6: ( ( (lv_trioVar_8_0= RULE_ID ) ) otherlv_9= '=' ( ( (lv_trio_10_0= ruleTRIO ) ) | ( ( (lv_obj_11_0= RULE_ID ) ) ( (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' ) | (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' ) ) ) ) )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:335:6: ( ( (lv_trioVar_8_0= RULE_ID ) ) otherlv_9= '=' ( ( (lv_trio_10_0= ruleTRIO ) ) | ( ( (lv_obj_11_0= RULE_ID ) ) ( (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' ) | (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' ) ) ) ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:335:7: ( (lv_trioVar_8_0= RULE_ID ) ) otherlv_9= '=' ( ( (lv_trio_10_0= ruleTRIO ) ) | ( ( (lv_obj_11_0= RULE_ID ) ) ( (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' ) | (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' ) ) ) )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:335:7: ( (lv_trioVar_8_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:336:1: (lv_trioVar_8_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:336:1: (lv_trioVar_8_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:337:3: lv_trioVar_8_0= RULE_ID
                    {
                    lv_trioVar_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration636); 

                    			newLeafNode(lv_trioVar_8_0, grammarAccess.getDeclarationAccess().getTrioVarIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"trioVar",
                            		lv_trioVar_8_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleDeclaration653); 

                        	newLeafNode(otherlv_9, grammarAccess.getDeclarationAccess().getEqualsSignKeyword_1_1());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:357:1: ( ( (lv_trio_10_0= ruleTRIO ) ) | ( ( (lv_obj_11_0= RULE_ID ) ) ( (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' ) | (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' ) ) ) )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        int LA4_1 = input.LA(2);

                        if ( (LA4_1==EOF||LA4_1==RULE_ID||LA4_1==RULE_TRIOOP2||LA4_1==19||(LA4_1>=33 && LA4_1<=35)) ) {
                            alt4=1;
                        }
                        else if ( ((LA4_1>=25 && LA4_1<=26)) ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA4_0==RULE_INT||(LA4_0>=27 && LA4_0<=32)||LA4_0==36) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:357:2: ( (lv_trio_10_0= ruleTRIO ) )
                            {
                            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:357:2: ( (lv_trio_10_0= ruleTRIO ) )
                            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:358:1: (lv_trio_10_0= ruleTRIO )
                            {
                            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:358:1: (lv_trio_10_0= ruleTRIO )
                            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:359:3: lv_trio_10_0= ruleTRIO
                            {
                             
                            	        newCompositeNode(grammarAccess.getDeclarationAccess().getTrioTRIOParserRuleCall_1_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTRIO_in_ruleDeclaration675);
                            lv_trio_10_0=ruleTRIO();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"trio",
                                    		lv_trio_10_0, 
                                    		"TRIO");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:376:6: ( ( (lv_obj_11_0= RULE_ID ) ) ( (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' ) | (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' ) ) )
                            {
                            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:376:6: ( ( (lv_obj_11_0= RULE_ID ) ) ( (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' ) | (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' ) ) )
                            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:376:7: ( (lv_obj_11_0= RULE_ID ) ) ( (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' ) | (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' ) )
                            {
                            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:376:7: ( (lv_obj_11_0= RULE_ID ) )
                            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:377:1: (lv_obj_11_0= RULE_ID )
                            {
                            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:377:1: (lv_obj_11_0= RULE_ID )
                            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:378:3: lv_obj_11_0= RULE_ID
                            {
                            lv_obj_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration699); 

                            			newLeafNode(lv_obj_11_0, grammarAccess.getDeclarationAccess().getObjIDTerminalRuleCall_1_2_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDeclarationRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"obj",
                                    		lv_obj_11_0, 
                                    		"ID");
                            	    

                            }


                            }

                            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:394:2: ( (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' ) | (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' ) )
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==25) ) {
                                alt3=1;
                            }
                            else if ( (LA3_0==26) ) {
                                alt3=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 0, input);

                                throw nvae;
                            }
                            switch (alt3) {
                                case 1 :
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:394:3: (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' )
                                    {
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:394:3: (otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')' )
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:394:5: otherlv_12= '.in(' ( (lv_stateName_13_0= RULE_ID ) ) otherlv_14= ')'
                                    {
                                    otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleDeclaration718); 

                                        	newLeafNode(otherlv_12, grammarAccess.getDeclarationAccess().getInKeyword_1_2_1_1_0_0());
                                        
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:398:1: ( (lv_stateName_13_0= RULE_ID ) )
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:399:1: (lv_stateName_13_0= RULE_ID )
                                    {
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:399:1: (lv_stateName_13_0= RULE_ID )
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:400:3: lv_stateName_13_0= RULE_ID
                                    {
                                    lv_stateName_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration735); 

                                    			newLeafNode(lv_stateName_13_0, grammarAccess.getDeclarationAccess().getStateNameIDTerminalRuleCall_1_2_1_1_0_1_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"stateName",
                                            		lv_stateName_13_0, 
                                            		"ID");
                                    	    

                                    }


                                    }

                                    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleDeclaration752); 

                                        	newLeafNode(otherlv_14, grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_1_2_1_1_0_2());
                                        

                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:421:6: (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' )
                                    {
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:421:6: (otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')' )
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:421:8: otherlv_15= '.call(' ( (lv_operationName_16_0= RULE_ID ) ) otherlv_17= ')'
                                    {
                                    otherlv_15=(Token)match(input,26,FOLLOW_26_in_ruleDeclaration772); 

                                        	newLeafNode(otherlv_15, grammarAccess.getDeclarationAccess().getCallKeyword_1_2_1_1_1_0());
                                        
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:425:1: ( (lv_operationName_16_0= RULE_ID ) )
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:426:1: (lv_operationName_16_0= RULE_ID )
                                    {
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:426:1: (lv_operationName_16_0= RULE_ID )
                                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:427:3: lv_operationName_16_0= RULE_ID
                                    {
                                    lv_operationName_16_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaration789); 

                                    			newLeafNode(lv_operationName_16_0, grammarAccess.getDeclarationAccess().getOperationNameIDTerminalRuleCall_1_2_1_1_1_1_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getDeclarationRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"operationName",
                                            		lv_operationName_16_0, 
                                            		"ID");
                                    	    

                                    }


                                    }

                                    otherlv_17=(Token)match(input,21,FOLLOW_21_in_ruleDeclaration806); 

                                        	newLeafNode(otherlv_17, grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_1_2_1_1_1_2());
                                        

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleTRIO"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:455:1: entryRuleTRIO returns [EObject current=null] : iv_ruleTRIO= ruleTRIO EOF ;
    public final EObject entryRuleTRIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTRIO = null;


        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:456:2: (iv_ruleTRIO= ruleTRIO EOF )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:457:2: iv_ruleTRIO= ruleTRIO EOF
            {
             newCompositeNode(grammarAccess.getTRIORule()); 
            pushFollow(FOLLOW_ruleTRIO_in_entryRuleTRIO847);
            iv_ruleTRIO=ruleTRIO();

            state._fsp--;

             current =iv_ruleTRIO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTRIO857); 

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
    // $ANTLR end "entryRuleTRIO"


    // $ANTLR start "ruleTRIO"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:464:1: ruleTRIO returns [EObject current=null] : ( ( (lv_trioL_0_0= ruleTRIOL ) ) ( (lv_trioR_1_0= ruleTRIOR ) )? ) ;
    public final EObject ruleTRIO() throws RecognitionException {
        EObject current = null;

        EObject lv_trioL_0_0 = null;

        EObject lv_trioR_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:467:28: ( ( ( (lv_trioL_0_0= ruleTRIOL ) ) ( (lv_trioR_1_0= ruleTRIOR ) )? ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:468:1: ( ( (lv_trioL_0_0= ruleTRIOL ) ) ( (lv_trioR_1_0= ruleTRIOR ) )? )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:468:1: ( ( (lv_trioL_0_0= ruleTRIOL ) ) ( (lv_trioR_1_0= ruleTRIOR ) )? )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:468:2: ( (lv_trioL_0_0= ruleTRIOL ) ) ( (lv_trioR_1_0= ruleTRIOR ) )?
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:468:2: ( (lv_trioL_0_0= ruleTRIOL ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:469:1: (lv_trioL_0_0= ruleTRIOL )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:469:1: (lv_trioL_0_0= ruleTRIOL )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:470:3: lv_trioL_0_0= ruleTRIOL
            {
             
            	        newCompositeNode(grammarAccess.getTRIOAccess().getTrioLTRIOLParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTRIOL_in_ruleTRIO903);
            lv_trioL_0_0=ruleTRIOL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTRIORule());
            	        }
                   		set(
                   			current, 
                   			"trioL",
                    		lv_trioL_0_0, 
                    		"TRIOL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:486:2: ( (lv_trioR_1_0= ruleTRIOR ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_TRIOOP2) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:487:1: (lv_trioR_1_0= ruleTRIOR )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:487:1: (lv_trioR_1_0= ruleTRIOR )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:488:3: lv_trioR_1_0= ruleTRIOR
                    {
                     
                    	        newCompositeNode(grammarAccess.getTRIOAccess().getTrioRTRIORParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTRIOR_in_ruleTRIO924);
                    lv_trioR_1_0=ruleTRIOR();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTRIORule());
                    	        }
                           		set(
                           			current, 
                           			"trioR",
                            		lv_trioR_1_0, 
                            		"TRIOR");
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
    // $ANTLR end "ruleTRIO"


    // $ANTLR start "entryRuleTRIOL"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:512:1: entryRuleTRIOL returns [EObject current=null] : iv_ruleTRIOL= ruleTRIOL EOF ;
    public final EObject entryRuleTRIOL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTRIOL = null;


        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:513:2: (iv_ruleTRIOL= ruleTRIOL EOF )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:514:2: iv_ruleTRIOL= ruleTRIOL EOF
            {
             newCompositeNode(grammarAccess.getTRIOLRule()); 
            pushFollow(FOLLOW_ruleTRIOL_in_entryRuleTRIOL961);
            iv_ruleTRIOL=ruleTRIOL();

            state._fsp--;

             current =iv_ruleTRIOL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTRIOL971); 

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
    // $ANTLR end "entryRuleTRIOL"


    // $ANTLR start "ruleTRIOL"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:521:1: ruleTRIOL returns [EObject current=null] : ( ( (lv_trioVar_0_0= RULE_ID ) ) | (otherlv_1= 'system.getSignal(' ( (lv_signal_2_0= RULE_ID ) ) otherlv_3= ')' ) | ( (lv_arithBool_4_0= ruleArithBool ) ) | (otherlv_5= '!(' ( (lv_trioNot_6_0= ruleTRIO ) ) otherlv_7= ')' ) | (otherlv_8= 'Time.' ( (lv_trioOpF_9_0= RULE_TRIOOPF ) ) otherlv_10= '(' ( (lv_trioOpF1_11_0= ruleTRIO ) ) otherlv_12= ')' ) | (otherlv_13= 'Time.' ( (lv_trioOpFF_14_0= RULE_TRIOOPFF ) ) otherlv_15= '(' ( (lv_trioOpFF1_16_0= ruleTRIO ) ) otherlv_17= ',' ( (lv_trioOpFF2_18_0= ruleTRIO ) ) otherlv_19= ')' ) | (otherlv_20= 'Time.' ( (lv_trioOpFN_21_0= RULE_TRIOOPFN ) ) otherlv_22= '(' ( (lv_trioOpFN1_23_0= ruleTRIO ) ) otherlv_24= ',' ( (lv_int_25_0= RULE_INT ) ) otherlv_26= ')' ) ) ;
    public final EObject ruleTRIOL() throws RecognitionException {
        EObject current = null;

        Token lv_trioVar_0_0=null;
        Token otherlv_1=null;
        Token lv_signal_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_trioOpF_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_trioOpFF_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_trioOpFN_21_0=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token lv_int_25_0=null;
        Token otherlv_26=null;
        EObject lv_arithBool_4_0 = null;

        EObject lv_trioNot_6_0 = null;

        EObject lv_trioOpF1_11_0 = null;

        EObject lv_trioOpFF1_16_0 = null;

        EObject lv_trioOpFF2_18_0 = null;

        EObject lv_trioOpFN1_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:524:28: ( ( ( (lv_trioVar_0_0= RULE_ID ) ) | (otherlv_1= 'system.getSignal(' ( (lv_signal_2_0= RULE_ID ) ) otherlv_3= ')' ) | ( (lv_arithBool_4_0= ruleArithBool ) ) | (otherlv_5= '!(' ( (lv_trioNot_6_0= ruleTRIO ) ) otherlv_7= ')' ) | (otherlv_8= 'Time.' ( (lv_trioOpF_9_0= RULE_TRIOOPF ) ) otherlv_10= '(' ( (lv_trioOpF1_11_0= ruleTRIO ) ) otherlv_12= ')' ) | (otherlv_13= 'Time.' ( (lv_trioOpFF_14_0= RULE_TRIOOPFF ) ) otherlv_15= '(' ( (lv_trioOpFF1_16_0= ruleTRIO ) ) otherlv_17= ',' ( (lv_trioOpFF2_18_0= ruleTRIO ) ) otherlv_19= ')' ) | (otherlv_20= 'Time.' ( (lv_trioOpFN_21_0= RULE_TRIOOPFN ) ) otherlv_22= '(' ( (lv_trioOpFN1_23_0= ruleTRIO ) ) otherlv_24= ',' ( (lv_int_25_0= RULE_INT ) ) otherlv_26= ')' ) ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:525:1: ( ( (lv_trioVar_0_0= RULE_ID ) ) | (otherlv_1= 'system.getSignal(' ( (lv_signal_2_0= RULE_ID ) ) otherlv_3= ')' ) | ( (lv_arithBool_4_0= ruleArithBool ) ) | (otherlv_5= '!(' ( (lv_trioNot_6_0= ruleTRIO ) ) otherlv_7= ')' ) | (otherlv_8= 'Time.' ( (lv_trioOpF_9_0= RULE_TRIOOPF ) ) otherlv_10= '(' ( (lv_trioOpF1_11_0= ruleTRIO ) ) otherlv_12= ')' ) | (otherlv_13= 'Time.' ( (lv_trioOpFF_14_0= RULE_TRIOOPFF ) ) otherlv_15= '(' ( (lv_trioOpFF1_16_0= ruleTRIO ) ) otherlv_17= ',' ( (lv_trioOpFF2_18_0= ruleTRIO ) ) otherlv_19= ')' ) | (otherlv_20= 'Time.' ( (lv_trioOpFN_21_0= RULE_TRIOOPFN ) ) otherlv_22= '(' ( (lv_trioOpFN1_23_0= ruleTRIO ) ) otherlv_24= ',' ( (lv_int_25_0= RULE_INT ) ) otherlv_26= ')' ) )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:525:1: ( ( (lv_trioVar_0_0= RULE_ID ) ) | (otherlv_1= 'system.getSignal(' ( (lv_signal_2_0= RULE_ID ) ) otherlv_3= ')' ) | ( (lv_arithBool_4_0= ruleArithBool ) ) | (otherlv_5= '!(' ( (lv_trioNot_6_0= ruleTRIO ) ) otherlv_7= ')' ) | (otherlv_8= 'Time.' ( (lv_trioOpF_9_0= RULE_TRIOOPF ) ) otherlv_10= '(' ( (lv_trioOpF1_11_0= ruleTRIO ) ) otherlv_12= ')' ) | (otherlv_13= 'Time.' ( (lv_trioOpFF_14_0= RULE_TRIOOPFF ) ) otherlv_15= '(' ( (lv_trioOpFF1_16_0= ruleTRIO ) ) otherlv_17= ',' ( (lv_trioOpFF2_18_0= ruleTRIO ) ) otherlv_19= ')' ) | (otherlv_20= 'Time.' ( (lv_trioOpFN_21_0= RULE_TRIOOPFN ) ) otherlv_22= '(' ( (lv_trioOpFN1_23_0= ruleTRIO ) ) otherlv_24= ',' ( (lv_int_25_0= RULE_INT ) ) otherlv_26= ')' ) )
            int alt7=7;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:525:2: ( (lv_trioVar_0_0= RULE_ID ) )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:525:2: ( (lv_trioVar_0_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:526:1: (lv_trioVar_0_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:526:1: (lv_trioVar_0_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:527:3: lv_trioVar_0_0= RULE_ID
                    {
                    lv_trioVar_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTRIOL1013); 

                    			newLeafNode(lv_trioVar_0_0, grammarAccess.getTRIOLAccess().getTrioVarIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTRIOLRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"trioVar",
                            		lv_trioVar_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:544:6: (otherlv_1= 'system.getSignal(' ( (lv_signal_2_0= RULE_ID ) ) otherlv_3= ')' )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:544:6: (otherlv_1= 'system.getSignal(' ( (lv_signal_2_0= RULE_ID ) ) otherlv_3= ')' )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:544:8: otherlv_1= 'system.getSignal(' ( (lv_signal_2_0= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleTRIOL1037); 

                        	newLeafNode(otherlv_1, grammarAccess.getTRIOLAccess().getSystemGetSignalKeyword_1_0());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:548:1: ( (lv_signal_2_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:549:1: (lv_signal_2_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:549:1: (lv_signal_2_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:550:3: lv_signal_2_0= RULE_ID
                    {
                    lv_signal_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTRIOL1054); 

                    			newLeafNode(lv_signal_2_0, grammarAccess.getTRIOLAccess().getSignalIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTRIOLRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"signal",
                            		lv_signal_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleTRIOL1071); 

                        	newLeafNode(otherlv_3, grammarAccess.getTRIOLAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:571:6: ( (lv_arithBool_4_0= ruleArithBool ) )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:571:6: ( (lv_arithBool_4_0= ruleArithBool ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:572:1: (lv_arithBool_4_0= ruleArithBool )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:572:1: (lv_arithBool_4_0= ruleArithBool )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:573:3: lv_arithBool_4_0= ruleArithBool
                    {
                     
                    	        newCompositeNode(grammarAccess.getTRIOLAccess().getArithBoolArithBoolParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArithBool_in_ruleTRIOL1099);
                    lv_arithBool_4_0=ruleArithBool();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTRIOLRule());
                    	        }
                           		set(
                           			current, 
                           			"arithBool",
                            		lv_arithBool_4_0, 
                            		"ArithBool");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:590:6: (otherlv_5= '!(' ( (lv_trioNot_6_0= ruleTRIO ) ) otherlv_7= ')' )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:590:6: (otherlv_5= '!(' ( (lv_trioNot_6_0= ruleTRIO ) ) otherlv_7= ')' )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:590:8: otherlv_5= '!(' ( (lv_trioNot_6_0= ruleTRIO ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleTRIOL1118); 

                        	newLeafNode(otherlv_5, grammarAccess.getTRIOLAccess().getExclamationMarkLeftParenthesisKeyword_3_0());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:594:1: ( (lv_trioNot_6_0= ruleTRIO ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:595:1: (lv_trioNot_6_0= ruleTRIO )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:595:1: (lv_trioNot_6_0= ruleTRIO )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:596:3: lv_trioNot_6_0= ruleTRIO
                    {
                     
                    	        newCompositeNode(grammarAccess.getTRIOLAccess().getTrioNotTRIOParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTRIO_in_ruleTRIOL1139);
                    lv_trioNot_6_0=ruleTRIO();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTRIOLRule());
                    	        }
                           		set(
                           			current, 
                           			"trioNot",
                            		lv_trioNot_6_0, 
                            		"TRIO");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleTRIOL1151); 

                        	newLeafNode(otherlv_7, grammarAccess.getTRIOLAccess().getRightParenthesisKeyword_3_2());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:617:6: (otherlv_8= 'Time.' ( (lv_trioOpF_9_0= RULE_TRIOOPF ) ) otherlv_10= '(' ( (lv_trioOpF1_11_0= ruleTRIO ) ) otherlv_12= ')' )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:617:6: (otherlv_8= 'Time.' ( (lv_trioOpF_9_0= RULE_TRIOOPF ) ) otherlv_10= '(' ( (lv_trioOpF1_11_0= ruleTRIO ) ) otherlv_12= ')' )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:617:8: otherlv_8= 'Time.' ( (lv_trioOpF_9_0= RULE_TRIOOPF ) ) otherlv_10= '(' ( (lv_trioOpF1_11_0= ruleTRIO ) ) otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleTRIOL1171); 

                        	newLeafNode(otherlv_8, grammarAccess.getTRIOLAccess().getTimeKeyword_4_0());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:621:1: ( (lv_trioOpF_9_0= RULE_TRIOOPF ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:622:1: (lv_trioOpF_9_0= RULE_TRIOOPF )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:622:1: (lv_trioOpF_9_0= RULE_TRIOOPF )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:623:3: lv_trioOpF_9_0= RULE_TRIOOPF
                    {
                    lv_trioOpF_9_0=(Token)match(input,RULE_TRIOOPF,FOLLOW_RULE_TRIOOPF_in_ruleTRIOL1188); 

                    			newLeafNode(lv_trioOpF_9_0, grammarAccess.getTRIOLAccess().getTrioOpFTRIOOPFTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTRIOLRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"trioOpF",
                            		lv_trioOpF_9_0, 
                            		"TRIOOPF");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleTRIOL1205); 

                        	newLeafNode(otherlv_10, grammarAccess.getTRIOLAccess().getLeftParenthesisKeyword_4_2());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:643:1: ( (lv_trioOpF1_11_0= ruleTRIO ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:644:1: (lv_trioOpF1_11_0= ruleTRIO )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:644:1: (lv_trioOpF1_11_0= ruleTRIO )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:645:3: lv_trioOpF1_11_0= ruleTRIO
                    {
                     
                    	        newCompositeNode(grammarAccess.getTRIOLAccess().getTrioOpF1TRIOParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTRIO_in_ruleTRIOL1226);
                    lv_trioOpF1_11_0=ruleTRIO();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTRIOLRule());
                    	        }
                           		set(
                           			current, 
                           			"trioOpF1",
                            		lv_trioOpF1_11_0, 
                            		"TRIO");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleTRIOL1238); 

                        	newLeafNode(otherlv_12, grammarAccess.getTRIOLAccess().getRightParenthesisKeyword_4_4());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:666:6: (otherlv_13= 'Time.' ( (lv_trioOpFF_14_0= RULE_TRIOOPFF ) ) otherlv_15= '(' ( (lv_trioOpFF1_16_0= ruleTRIO ) ) otherlv_17= ',' ( (lv_trioOpFF2_18_0= ruleTRIO ) ) otherlv_19= ')' )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:666:6: (otherlv_13= 'Time.' ( (lv_trioOpFF_14_0= RULE_TRIOOPFF ) ) otherlv_15= '(' ( (lv_trioOpFF1_16_0= ruleTRIO ) ) otherlv_17= ',' ( (lv_trioOpFF2_18_0= ruleTRIO ) ) otherlv_19= ')' )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:666:8: otherlv_13= 'Time.' ( (lv_trioOpFF_14_0= RULE_TRIOOPFF ) ) otherlv_15= '(' ( (lv_trioOpFF1_16_0= ruleTRIO ) ) otherlv_17= ',' ( (lv_trioOpFF2_18_0= ruleTRIO ) ) otherlv_19= ')'
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleTRIOL1258); 

                        	newLeafNode(otherlv_13, grammarAccess.getTRIOLAccess().getTimeKeyword_5_0());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:670:1: ( (lv_trioOpFF_14_0= RULE_TRIOOPFF ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:671:1: (lv_trioOpFF_14_0= RULE_TRIOOPFF )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:671:1: (lv_trioOpFF_14_0= RULE_TRIOOPFF )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:672:3: lv_trioOpFF_14_0= RULE_TRIOOPFF
                    {
                    lv_trioOpFF_14_0=(Token)match(input,RULE_TRIOOPFF,FOLLOW_RULE_TRIOOPFF_in_ruleTRIOL1275); 

                    			newLeafNode(lv_trioOpFF_14_0, grammarAccess.getTRIOLAccess().getTrioOpFFTRIOOPFFTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTRIOLRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"trioOpFF",
                            		lv_trioOpFF_14_0, 
                            		"TRIOOPFF");
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,30,FOLLOW_30_in_ruleTRIOL1292); 

                        	newLeafNode(otherlv_15, grammarAccess.getTRIOLAccess().getLeftParenthesisKeyword_5_2());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:692:1: ( (lv_trioOpFF1_16_0= ruleTRIO ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:693:1: (lv_trioOpFF1_16_0= ruleTRIO )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:693:1: (lv_trioOpFF1_16_0= ruleTRIO )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:694:3: lv_trioOpFF1_16_0= ruleTRIO
                    {
                     
                    	        newCompositeNode(grammarAccess.getTRIOLAccess().getTrioOpFF1TRIOParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTRIO_in_ruleTRIOL1313);
                    lv_trioOpFF1_16_0=ruleTRIO();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTRIOLRule());
                    	        }
                           		set(
                           			current, 
                           			"trioOpFF1",
                            		lv_trioOpFF1_16_0, 
                            		"TRIO");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleTRIOL1325); 

                        	newLeafNode(otherlv_17, grammarAccess.getTRIOLAccess().getCommaKeyword_5_4());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:714:1: ( (lv_trioOpFF2_18_0= ruleTRIO ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:715:1: (lv_trioOpFF2_18_0= ruleTRIO )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:715:1: (lv_trioOpFF2_18_0= ruleTRIO )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:716:3: lv_trioOpFF2_18_0= ruleTRIO
                    {
                     
                    	        newCompositeNode(grammarAccess.getTRIOLAccess().getTrioOpFF2TRIOParserRuleCall_5_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTRIO_in_ruleTRIOL1346);
                    lv_trioOpFF2_18_0=ruleTRIO();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTRIOLRule());
                    	        }
                           		set(
                           			current, 
                           			"trioOpFF2",
                            		lv_trioOpFF2_18_0, 
                            		"TRIO");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_19=(Token)match(input,21,FOLLOW_21_in_ruleTRIOL1358); 

                        	newLeafNode(otherlv_19, grammarAccess.getTRIOLAccess().getRightParenthesisKeyword_5_6());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:737:6: (otherlv_20= 'Time.' ( (lv_trioOpFN_21_0= RULE_TRIOOPFN ) ) otherlv_22= '(' ( (lv_trioOpFN1_23_0= ruleTRIO ) ) otherlv_24= ',' ( (lv_int_25_0= RULE_INT ) ) otherlv_26= ')' )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:737:6: (otherlv_20= 'Time.' ( (lv_trioOpFN_21_0= RULE_TRIOOPFN ) ) otherlv_22= '(' ( (lv_trioOpFN1_23_0= ruleTRIO ) ) otherlv_24= ',' ( (lv_int_25_0= RULE_INT ) ) otherlv_26= ')' )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:737:8: otherlv_20= 'Time.' ( (lv_trioOpFN_21_0= RULE_TRIOOPFN ) ) otherlv_22= '(' ( (lv_trioOpFN1_23_0= ruleTRIO ) ) otherlv_24= ',' ( (lv_int_25_0= RULE_INT ) ) otherlv_26= ')'
                    {
                    otherlv_20=(Token)match(input,29,FOLLOW_29_in_ruleTRIOL1378); 

                        	newLeafNode(otherlv_20, grammarAccess.getTRIOLAccess().getTimeKeyword_6_0());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:741:1: ( (lv_trioOpFN_21_0= RULE_TRIOOPFN ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:742:1: (lv_trioOpFN_21_0= RULE_TRIOOPFN )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:742:1: (lv_trioOpFN_21_0= RULE_TRIOOPFN )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:743:3: lv_trioOpFN_21_0= RULE_TRIOOPFN
                    {
                    lv_trioOpFN_21_0=(Token)match(input,RULE_TRIOOPFN,FOLLOW_RULE_TRIOOPFN_in_ruleTRIOL1395); 

                    			newLeafNode(lv_trioOpFN_21_0, grammarAccess.getTRIOLAccess().getTrioOpFNTRIOOPFNTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTRIOLRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"trioOpFN",
                            		lv_trioOpFN_21_0, 
                            		"TRIOOPFN");
                    	    

                    }


                    }

                    otherlv_22=(Token)match(input,30,FOLLOW_30_in_ruleTRIOL1412); 

                        	newLeafNode(otherlv_22, grammarAccess.getTRIOLAccess().getLeftParenthesisKeyword_6_2());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:763:1: ( (lv_trioOpFN1_23_0= ruleTRIO ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:764:1: (lv_trioOpFN1_23_0= ruleTRIO )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:764:1: (lv_trioOpFN1_23_0= ruleTRIO )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:765:3: lv_trioOpFN1_23_0= ruleTRIO
                    {
                     
                    	        newCompositeNode(grammarAccess.getTRIOLAccess().getTrioOpFN1TRIOParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTRIO_in_ruleTRIOL1433);
                    lv_trioOpFN1_23_0=ruleTRIO();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTRIOLRule());
                    	        }
                           		set(
                           			current, 
                           			"trioOpFN1",
                            		lv_trioOpFN1_23_0, 
                            		"TRIO");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_24=(Token)match(input,24,FOLLOW_24_in_ruleTRIOL1445); 

                        	newLeafNode(otherlv_24, grammarAccess.getTRIOLAccess().getCommaKeyword_6_4());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:785:1: ( (lv_int_25_0= RULE_INT ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:786:1: (lv_int_25_0= RULE_INT )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:786:1: (lv_int_25_0= RULE_INT )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:787:3: lv_int_25_0= RULE_INT
                    {
                    lv_int_25_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTRIOL1462); 

                    			newLeafNode(lv_int_25_0, grammarAccess.getTRIOLAccess().getIntINTTerminalRuleCall_6_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTRIOLRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"int",
                            		lv_int_25_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_26=(Token)match(input,21,FOLLOW_21_in_ruleTRIOL1479); 

                        	newLeafNode(otherlv_26, grammarAccess.getTRIOLAccess().getRightParenthesisKeyword_6_6());
                        

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
    // $ANTLR end "ruleTRIOL"


    // $ANTLR start "entryRuleTRIOR"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:815:1: entryRuleTRIOR returns [EObject current=null] : iv_ruleTRIOR= ruleTRIOR EOF ;
    public final EObject entryRuleTRIOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTRIOR = null;


        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:816:2: (iv_ruleTRIOR= ruleTRIOR EOF )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:817:2: iv_ruleTRIOR= ruleTRIOR EOF
            {
             newCompositeNode(grammarAccess.getTRIORRule()); 
            pushFollow(FOLLOW_ruleTRIOR_in_entryRuleTRIOR1516);
            iv_ruleTRIOR=ruleTRIOR();

            state._fsp--;

             current =iv_ruleTRIOR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTRIOR1526); 

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
    // $ANTLR end "entryRuleTRIOR"


    // $ANTLR start "ruleTRIOR"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:824:1: ruleTRIOR returns [EObject current=null] : ( ( (lv_trioOP2_0_0= RULE_TRIOOP2 ) ) ( (lv_trio_1_0= ruleTRIO ) ) ) ;
    public final EObject ruleTRIOR() throws RecognitionException {
        EObject current = null;

        Token lv_trioOP2_0_0=null;
        EObject lv_trio_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:827:28: ( ( ( (lv_trioOP2_0_0= RULE_TRIOOP2 ) ) ( (lv_trio_1_0= ruleTRIO ) ) ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:828:1: ( ( (lv_trioOP2_0_0= RULE_TRIOOP2 ) ) ( (lv_trio_1_0= ruleTRIO ) ) )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:828:1: ( ( (lv_trioOP2_0_0= RULE_TRIOOP2 ) ) ( (lv_trio_1_0= ruleTRIO ) ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:828:2: ( (lv_trioOP2_0_0= RULE_TRIOOP2 ) ) ( (lv_trio_1_0= ruleTRIO ) )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:828:2: ( (lv_trioOP2_0_0= RULE_TRIOOP2 ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:829:1: (lv_trioOP2_0_0= RULE_TRIOOP2 )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:829:1: (lv_trioOP2_0_0= RULE_TRIOOP2 )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:830:3: lv_trioOP2_0_0= RULE_TRIOOP2
            {
            lv_trioOP2_0_0=(Token)match(input,RULE_TRIOOP2,FOLLOW_RULE_TRIOOP2_in_ruleTRIOR1568); 

            			newLeafNode(lv_trioOP2_0_0, grammarAccess.getTRIORAccess().getTrioOP2TRIOOP2TerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTRIORRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"trioOP2",
                    		lv_trioOP2_0_0, 
                    		"TRIOOP2");
            	    

            }


            }

            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:846:2: ( (lv_trio_1_0= ruleTRIO ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:847:1: (lv_trio_1_0= ruleTRIO )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:847:1: (lv_trio_1_0= ruleTRIO )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:848:3: lv_trio_1_0= ruleTRIO
            {
             
            	        newCompositeNode(grammarAccess.getTRIORAccess().getTrioTRIOParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTRIO_in_ruleTRIOR1594);
            lv_trio_1_0=ruleTRIO();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTRIORRule());
            	        }
                   		set(
                   			current, 
                   			"trio",
                    		lv_trio_1_0, 
                    		"TRIO");
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
    // $ANTLR end "ruleTRIOR"


    // $ANTLR start "entryRuleArithBool"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:872:1: entryRuleArithBool returns [EObject current=null] : iv_ruleArithBool= ruleArithBool EOF ;
    public final EObject entryRuleArithBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithBool = null;


        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:873:2: (iv_ruleArithBool= ruleArithBool EOF )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:874:2: iv_ruleArithBool= ruleArithBool EOF
            {
             newCompositeNode(grammarAccess.getArithBoolRule()); 
            pushFollow(FOLLOW_ruleArithBool_in_entryRuleArithBool1630);
            iv_ruleArithBool=ruleArithBool();

            state._fsp--;

             current =iv_ruleArithBool; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithBool1640); 

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
    // $ANTLR end "entryRuleArithBool"


    // $ANTLR start "ruleArithBool"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:881:1: ruleArithBool returns [EObject current=null] : ( ( (lv_arithTerm1_0_0= ruleArithTerm ) ) ( ( (lv_arithCOP_1_0= RULE_ARITH_COMPARE_OP ) ) ( (lv_arithTerm2_2_0= ruleArithTerm ) ) )? ) ;
    public final EObject ruleArithBool() throws RecognitionException {
        EObject current = null;

        Token lv_arithCOP_1_0=null;
        EObject lv_arithTerm1_0_0 = null;

        EObject lv_arithTerm2_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:884:28: ( ( ( (lv_arithTerm1_0_0= ruleArithTerm ) ) ( ( (lv_arithCOP_1_0= RULE_ARITH_COMPARE_OP ) ) ( (lv_arithTerm2_2_0= ruleArithTerm ) ) )? ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:885:1: ( ( (lv_arithTerm1_0_0= ruleArithTerm ) ) ( ( (lv_arithCOP_1_0= RULE_ARITH_COMPARE_OP ) ) ( (lv_arithTerm2_2_0= ruleArithTerm ) ) )? )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:885:1: ( ( (lv_arithTerm1_0_0= ruleArithTerm ) ) ( ( (lv_arithCOP_1_0= RULE_ARITH_COMPARE_OP ) ) ( (lv_arithTerm2_2_0= ruleArithTerm ) ) )? )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:885:2: ( (lv_arithTerm1_0_0= ruleArithTerm ) ) ( ( (lv_arithCOP_1_0= RULE_ARITH_COMPARE_OP ) ) ( (lv_arithTerm2_2_0= ruleArithTerm ) ) )?
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:885:2: ( (lv_arithTerm1_0_0= ruleArithTerm ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:886:1: (lv_arithTerm1_0_0= ruleArithTerm )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:886:1: (lv_arithTerm1_0_0= ruleArithTerm )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:887:3: lv_arithTerm1_0_0= ruleArithTerm
            {
             
            	        newCompositeNode(grammarAccess.getArithBoolAccess().getArithTerm1ArithTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleArithTerm_in_ruleArithBool1686);
            lv_arithTerm1_0_0=ruleArithTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArithBoolRule());
            	        }
                   		set(
                   			current, 
                   			"arithTerm1",
                    		lv_arithTerm1_0_0, 
                    		"ArithTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:903:2: ( ( (lv_arithCOP_1_0= RULE_ARITH_COMPARE_OP ) ) ( (lv_arithTerm2_2_0= ruleArithTerm ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ARITH_COMPARE_OP) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:903:3: ( (lv_arithCOP_1_0= RULE_ARITH_COMPARE_OP ) ) ( (lv_arithTerm2_2_0= ruleArithTerm ) )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:903:3: ( (lv_arithCOP_1_0= RULE_ARITH_COMPARE_OP ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:904:1: (lv_arithCOP_1_0= RULE_ARITH_COMPARE_OP )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:904:1: (lv_arithCOP_1_0= RULE_ARITH_COMPARE_OP )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:905:3: lv_arithCOP_1_0= RULE_ARITH_COMPARE_OP
                    {
                    lv_arithCOP_1_0=(Token)match(input,RULE_ARITH_COMPARE_OP,FOLLOW_RULE_ARITH_COMPARE_OP_in_ruleArithBool1704); 

                    			newLeafNode(lv_arithCOP_1_0, grammarAccess.getArithBoolAccess().getArithCOPARITH_COMPARE_OPTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithBoolRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arithCOP",
                            		lv_arithCOP_1_0, 
                            		"ARITH_COMPARE_OP");
                    	    

                    }


                    }

                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:921:2: ( (lv_arithTerm2_2_0= ruleArithTerm ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:922:1: (lv_arithTerm2_2_0= ruleArithTerm )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:922:1: (lv_arithTerm2_2_0= ruleArithTerm )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:923:3: lv_arithTerm2_2_0= ruleArithTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getArithBoolAccess().getArithTerm2ArithTermParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArithTerm_in_ruleArithBool1730);
                    lv_arithTerm2_2_0=ruleArithTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArithBoolRule());
                    	        }
                           		set(
                           			current, 
                           			"arithTerm2",
                            		lv_arithTerm2_2_0, 
                            		"ArithTerm");
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
    // $ANTLR end "ruleArithBool"


    // $ANTLR start "entryRuleArithTerm"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:947:1: entryRuleArithTerm returns [EObject current=null] : iv_ruleArithTerm= ruleArithTerm EOF ;
    public final EObject entryRuleArithTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithTerm = null;


        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:948:2: (iv_ruleArithTerm= ruleArithTerm EOF )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:949:2: iv_ruleArithTerm= ruleArithTerm EOF
            {
             newCompositeNode(grammarAccess.getArithTermRule()); 
            pushFollow(FOLLOW_ruleArithTerm_in_entryRuleArithTerm1768);
            iv_ruleArithTerm=ruleArithTerm();

            state._fsp--;

             current =iv_ruleArithTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithTerm1778); 

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
    // $ANTLR end "entryRuleArithTerm"


    // $ANTLR start "ruleArithTerm"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:956:1: ruleArithTerm returns [EObject current=null] : ( ( (lv_arithTermL_0_0= ruleArithTermL ) ) ( (lv_arithTermR_1_0= ruleArithTermR ) )? ) ;
    public final EObject ruleArithTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_arithTermL_0_0 = null;

        EObject lv_arithTermR_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:959:28: ( ( ( (lv_arithTermL_0_0= ruleArithTermL ) ) ( (lv_arithTermR_1_0= ruleArithTermR ) )? ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:960:1: ( ( (lv_arithTermL_0_0= ruleArithTermL ) ) ( (lv_arithTermR_1_0= ruleArithTermR ) )? )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:960:1: ( ( (lv_arithTermL_0_0= ruleArithTermL ) ) ( (lv_arithTermR_1_0= ruleArithTermR ) )? )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:960:2: ( (lv_arithTermL_0_0= ruleArithTermL ) ) ( (lv_arithTermR_1_0= ruleArithTermR ) )?
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:960:2: ( (lv_arithTermL_0_0= ruleArithTermL ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:961:1: (lv_arithTermL_0_0= ruleArithTermL )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:961:1: (lv_arithTermL_0_0= ruleArithTermL )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:962:3: lv_arithTermL_0_0= ruleArithTermL
            {
             
            	        newCompositeNode(grammarAccess.getArithTermAccess().getArithTermLArithTermLParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleArithTermL_in_ruleArithTerm1824);
            lv_arithTermL_0_0=ruleArithTermL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArithTermRule());
            	        }
                   		set(
                   			current, 
                   			"arithTermL",
                    		lv_arithTermL_0_0, 
                    		"ArithTermL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:978:2: ( (lv_arithTermR_1_0= ruleArithTermR ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ARITH_OP) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:979:1: (lv_arithTermR_1_0= ruleArithTermR )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:979:1: (lv_arithTermR_1_0= ruleArithTermR )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:980:3: lv_arithTermR_1_0= ruleArithTermR
                    {
                     
                    	        newCompositeNode(grammarAccess.getArithTermAccess().getArithTermRArithTermRParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArithTermR_in_ruleArithTerm1845);
                    lv_arithTermR_1_0=ruleArithTermR();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArithTermRule());
                    	        }
                           		set(
                           			current, 
                           			"arithTermR",
                            		lv_arithTermR_1_0, 
                            		"ArithTermR");
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
    // $ANTLR end "ruleArithTerm"


    // $ANTLR start "entryRuleArithTermL"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1004:1: entryRuleArithTermL returns [EObject current=null] : iv_ruleArithTermL= ruleArithTermL EOF ;
    public final EObject entryRuleArithTermL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithTermL = null;


        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1005:2: (iv_ruleArithTermL= ruleArithTermL EOF )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1006:2: iv_ruleArithTermL= ruleArithTermL EOF
            {
             newCompositeNode(grammarAccess.getArithTermLRule()); 
            pushFollow(FOLLOW_ruleArithTermL_in_entryRuleArithTermL1882);
            iv_ruleArithTermL=ruleArithTermL();

            state._fsp--;

             current =iv_ruleArithTermL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithTermL1892); 

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
    // $ANTLR end "entryRuleArithTermL"


    // $ANTLR start "ruleArithTermL"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1013:1: ruleArithTermL returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_trio_1_0= ruleTRIO ) ) otherlv_2= ')' ) | ( (lv_constant_3_0= ruleDataType ) ) | ( (lv_arithVar_4_0= ruleArithVar ) ) | (otherlv_5= 'Futr(' ( (lv_arithTermF_6_0= ruleArithTerm ) ) otherlv_7= ',' ( (lv_intF_8_0= RULE_INT ) ) otherlv_9= ')' ) | (otherlv_10= 'Past(' ( (lv_arithTermP_11_0= ruleArithTerm ) ) otherlv_12= ',' ( (lv_intP_13_0= RULE_INT ) ) otherlv_14= ')' ) ) ;
    public final EObject ruleArithTermL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_intF_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_intP_13_0=null;
        Token otherlv_14=null;
        EObject lv_trio_1_0 = null;

        EObject lv_constant_3_0 = null;

        EObject lv_arithVar_4_0 = null;

        EObject lv_arithTermF_6_0 = null;

        EObject lv_arithTermP_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1016:28: ( ( (otherlv_0= '(' ( (lv_trio_1_0= ruleTRIO ) ) otherlv_2= ')' ) | ( (lv_constant_3_0= ruleDataType ) ) | ( (lv_arithVar_4_0= ruleArithVar ) ) | (otherlv_5= 'Futr(' ( (lv_arithTermF_6_0= ruleArithTerm ) ) otherlv_7= ',' ( (lv_intF_8_0= RULE_INT ) ) otherlv_9= ')' ) | (otherlv_10= 'Past(' ( (lv_arithTermP_11_0= ruleArithTerm ) ) otherlv_12= ',' ( (lv_intP_13_0= RULE_INT ) ) otherlv_14= ')' ) ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1017:1: ( (otherlv_0= '(' ( (lv_trio_1_0= ruleTRIO ) ) otherlv_2= ')' ) | ( (lv_constant_3_0= ruleDataType ) ) | ( (lv_arithVar_4_0= ruleArithVar ) ) | (otherlv_5= 'Futr(' ( (lv_arithTermF_6_0= ruleArithTerm ) ) otherlv_7= ',' ( (lv_intF_8_0= RULE_INT ) ) otherlv_9= ')' ) | (otherlv_10= 'Past(' ( (lv_arithTermP_11_0= ruleArithTerm ) ) otherlv_12= ',' ( (lv_intP_13_0= RULE_INT ) ) otherlv_14= ')' ) )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1017:1: ( (otherlv_0= '(' ( (lv_trio_1_0= ruleTRIO ) ) otherlv_2= ')' ) | ( (lv_constant_3_0= ruleDataType ) ) | ( (lv_arithVar_4_0= ruleArithVar ) ) | (otherlv_5= 'Futr(' ( (lv_arithTermF_6_0= ruleArithTerm ) ) otherlv_7= ',' ( (lv_intF_8_0= RULE_INT ) ) otherlv_9= ')' ) | (otherlv_10= 'Past(' ( (lv_arithTermP_11_0= ruleArithTerm ) ) otherlv_12= ',' ( (lv_intP_13_0= RULE_INT ) ) otherlv_14= ')' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
            case 36:
                {
                alt10=3;
                }
                break;
            case 31:
                {
                alt10=4;
                }
                break;
            case 32:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1017:2: (otherlv_0= '(' ( (lv_trio_1_0= ruleTRIO ) ) otherlv_2= ')' )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1017:2: (otherlv_0= '(' ( (lv_trio_1_0= ruleTRIO ) ) otherlv_2= ')' )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1017:4: otherlv_0= '(' ( (lv_trio_1_0= ruleTRIO ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleArithTermL1930); 

                        	newLeafNode(otherlv_0, grammarAccess.getArithTermLAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1021:1: ( (lv_trio_1_0= ruleTRIO ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1022:1: (lv_trio_1_0= ruleTRIO )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1022:1: (lv_trio_1_0= ruleTRIO )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1023:3: lv_trio_1_0= ruleTRIO
                    {
                     
                    	        newCompositeNode(grammarAccess.getArithTermLAccess().getTrioTRIOParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTRIO_in_ruleArithTermL1951);
                    lv_trio_1_0=ruleTRIO();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArithTermLRule());
                    	        }
                           		set(
                           			current, 
                           			"trio",
                            		lv_trio_1_0, 
                            		"TRIO");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleArithTermL1963); 

                        	newLeafNode(otherlv_2, grammarAccess.getArithTermLAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1044:6: ( (lv_constant_3_0= ruleDataType ) )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1044:6: ( (lv_constant_3_0= ruleDataType ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1045:1: (lv_constant_3_0= ruleDataType )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1045:1: (lv_constant_3_0= ruleDataType )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1046:3: lv_constant_3_0= ruleDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArithTermLAccess().getConstantDataTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleArithTermL1991);
                    lv_constant_3_0=ruleDataType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArithTermLRule());
                    	        }
                           		set(
                           			current, 
                           			"constant",
                            		lv_constant_3_0, 
                            		"DataType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1063:6: ( (lv_arithVar_4_0= ruleArithVar ) )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1063:6: ( (lv_arithVar_4_0= ruleArithVar ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1064:1: (lv_arithVar_4_0= ruleArithVar )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1064:1: (lv_arithVar_4_0= ruleArithVar )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1065:3: lv_arithVar_4_0= ruleArithVar
                    {
                     
                    	        newCompositeNode(grammarAccess.getArithTermLAccess().getArithVarArithVarParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArithVar_in_ruleArithTermL2018);
                    lv_arithVar_4_0=ruleArithVar();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArithTermLRule());
                    	        }
                           		set(
                           			current, 
                           			"arithVar",
                            		lv_arithVar_4_0, 
                            		"ArithVar");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1082:6: (otherlv_5= 'Futr(' ( (lv_arithTermF_6_0= ruleArithTerm ) ) otherlv_7= ',' ( (lv_intF_8_0= RULE_INT ) ) otherlv_9= ')' )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1082:6: (otherlv_5= 'Futr(' ( (lv_arithTermF_6_0= ruleArithTerm ) ) otherlv_7= ',' ( (lv_intF_8_0= RULE_INT ) ) otherlv_9= ')' )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1082:8: otherlv_5= 'Futr(' ( (lv_arithTermF_6_0= ruleArithTerm ) ) otherlv_7= ',' ( (lv_intF_8_0= RULE_INT ) ) otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleArithTermL2037); 

                        	newLeafNode(otherlv_5, grammarAccess.getArithTermLAccess().getFutrKeyword_3_0());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1086:1: ( (lv_arithTermF_6_0= ruleArithTerm ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1087:1: (lv_arithTermF_6_0= ruleArithTerm )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1087:1: (lv_arithTermF_6_0= ruleArithTerm )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1088:3: lv_arithTermF_6_0= ruleArithTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getArithTermLAccess().getArithTermFArithTermParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArithTerm_in_ruleArithTermL2058);
                    lv_arithTermF_6_0=ruleArithTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArithTermLRule());
                    	        }
                           		set(
                           			current, 
                           			"arithTermF",
                            		lv_arithTermF_6_0, 
                            		"ArithTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleArithTermL2070); 

                        	newLeafNode(otherlv_7, grammarAccess.getArithTermLAccess().getCommaKeyword_3_2());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1108:1: ( (lv_intF_8_0= RULE_INT ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1109:1: (lv_intF_8_0= RULE_INT )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1109:1: (lv_intF_8_0= RULE_INT )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1110:3: lv_intF_8_0= RULE_INT
                    {
                    lv_intF_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArithTermL2087); 

                    			newLeafNode(lv_intF_8_0, grammarAccess.getArithTermLAccess().getIntFINTTerminalRuleCall_3_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithTermLRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"intF",
                            		lv_intF_8_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleArithTermL2104); 

                        	newLeafNode(otherlv_9, grammarAccess.getArithTermLAccess().getRightParenthesisKeyword_3_4());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1131:6: (otherlv_10= 'Past(' ( (lv_arithTermP_11_0= ruleArithTerm ) ) otherlv_12= ',' ( (lv_intP_13_0= RULE_INT ) ) otherlv_14= ')' )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1131:6: (otherlv_10= 'Past(' ( (lv_arithTermP_11_0= ruleArithTerm ) ) otherlv_12= ',' ( (lv_intP_13_0= RULE_INT ) ) otherlv_14= ')' )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1131:8: otherlv_10= 'Past(' ( (lv_arithTermP_11_0= ruleArithTerm ) ) otherlv_12= ',' ( (lv_intP_13_0= RULE_INT ) ) otherlv_14= ')'
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleArithTermL2124); 

                        	newLeafNode(otherlv_10, grammarAccess.getArithTermLAccess().getPastKeyword_4_0());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1135:1: ( (lv_arithTermP_11_0= ruleArithTerm ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1136:1: (lv_arithTermP_11_0= ruleArithTerm )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1136:1: (lv_arithTermP_11_0= ruleArithTerm )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1137:3: lv_arithTermP_11_0= ruleArithTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getArithTermLAccess().getArithTermPArithTermParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArithTerm_in_ruleArithTermL2145);
                    lv_arithTermP_11_0=ruleArithTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArithTermLRule());
                    	        }
                           		set(
                           			current, 
                           			"arithTermP",
                            		lv_arithTermP_11_0, 
                            		"ArithTerm");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleArithTermL2157); 

                        	newLeafNode(otherlv_12, grammarAccess.getArithTermLAccess().getCommaKeyword_4_2());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1157:1: ( (lv_intP_13_0= RULE_INT ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1158:1: (lv_intP_13_0= RULE_INT )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1158:1: (lv_intP_13_0= RULE_INT )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1159:3: lv_intP_13_0= RULE_INT
                    {
                    lv_intP_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArithTermL2174); 

                    			newLeafNode(lv_intP_13_0, grammarAccess.getArithTermLAccess().getIntPINTTerminalRuleCall_4_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithTermLRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"intP",
                            		lv_intP_13_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleArithTermL2191); 

                        	newLeafNode(otherlv_14, grammarAccess.getArithTermLAccess().getRightParenthesisKeyword_4_4());
                        

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
    // $ANTLR end "ruleArithTermL"


    // $ANTLR start "entryRuleArithTermR"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1187:1: entryRuleArithTermR returns [EObject current=null] : iv_ruleArithTermR= ruleArithTermR EOF ;
    public final EObject entryRuleArithTermR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithTermR = null;


        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1188:2: (iv_ruleArithTermR= ruleArithTermR EOF )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1189:2: iv_ruleArithTermR= ruleArithTermR EOF
            {
             newCompositeNode(grammarAccess.getArithTermRRule()); 
            pushFollow(FOLLOW_ruleArithTermR_in_entryRuleArithTermR2228);
            iv_ruleArithTermR=ruleArithTermR();

            state._fsp--;

             current =iv_ruleArithTermR; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithTermR2238); 

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
    // $ANTLR end "entryRuleArithTermR"


    // $ANTLR start "ruleArithTermR"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1196:1: ruleArithTermR returns [EObject current=null] : ( ( (lv_arithOP_0_0= RULE_ARITH_OP ) ) ( (lv_arithTerm_1_0= ruleArithTerm ) ) ) ;
    public final EObject ruleArithTermR() throws RecognitionException {
        EObject current = null;

        Token lv_arithOP_0_0=null;
        EObject lv_arithTerm_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1199:28: ( ( ( (lv_arithOP_0_0= RULE_ARITH_OP ) ) ( (lv_arithTerm_1_0= ruleArithTerm ) ) ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1200:1: ( ( (lv_arithOP_0_0= RULE_ARITH_OP ) ) ( (lv_arithTerm_1_0= ruleArithTerm ) ) )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1200:1: ( ( (lv_arithOP_0_0= RULE_ARITH_OP ) ) ( (lv_arithTerm_1_0= ruleArithTerm ) ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1200:2: ( (lv_arithOP_0_0= RULE_ARITH_OP ) ) ( (lv_arithTerm_1_0= ruleArithTerm ) )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1200:2: ( (lv_arithOP_0_0= RULE_ARITH_OP ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1201:1: (lv_arithOP_0_0= RULE_ARITH_OP )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1201:1: (lv_arithOP_0_0= RULE_ARITH_OP )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1202:3: lv_arithOP_0_0= RULE_ARITH_OP
            {
            lv_arithOP_0_0=(Token)match(input,RULE_ARITH_OP,FOLLOW_RULE_ARITH_OP_in_ruleArithTermR2280); 

            			newLeafNode(lv_arithOP_0_0, grammarAccess.getArithTermRAccess().getArithOPARITH_OPTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArithTermRRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arithOP",
                    		lv_arithOP_0_0, 
                    		"ARITH_OP");
            	    

            }


            }

            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1218:2: ( (lv_arithTerm_1_0= ruleArithTerm ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1219:1: (lv_arithTerm_1_0= ruleArithTerm )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1219:1: (lv_arithTerm_1_0= ruleArithTerm )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1220:3: lv_arithTerm_1_0= ruleArithTerm
            {
             
            	        newCompositeNode(grammarAccess.getArithTermRAccess().getArithTermArithTermParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArithTerm_in_ruleArithTermR2306);
            lv_arithTerm_1_0=ruleArithTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArithTermRRule());
            	        }
                   		set(
                   			current, 
                   			"arithTerm",
                    		lv_arithTerm_1_0, 
                    		"ArithTerm");
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
    // $ANTLR end "ruleArithTermR"


    // $ANTLR start "entryRuleArithVar"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1244:1: entryRuleArithVar returns [EObject current=null] : iv_ruleArithVar= ruleArithVar EOF ;
    public final EObject entryRuleArithVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithVar = null;


        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1245:2: (iv_ruleArithVar= ruleArithVar EOF )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1246:2: iv_ruleArithVar= ruleArithVar EOF
            {
             newCompositeNode(grammarAccess.getArithVarRule()); 
            pushFollow(FOLLOW_ruleArithVar_in_entryRuleArithVar2342);
            iv_ruleArithVar=ruleArithVar();

            state._fsp--;

             current =iv_ruleArithVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithVar2352); 

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
    // $ANTLR end "entryRuleArithVar"


    // $ANTLR start "ruleArithVar"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1253:1: ruleArithVar returns [EObject current=null] : ( ( ( (lv_obj_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_atr_2_0= RULE_ID ) ) ) | ( ( (lv_obj_3_0= RULE_ID ) ) otherlv_4= '::' ( (lv_op_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_param_7_0= RULE_ID ) ) ) | ( ( (lv_sd_8_0= RULE_ID ) ) otherlv_9= '.getParameter(' ( (lv_param_10_0= RULE_ID ) ) otherlv_11= ')' ) | (otherlv_12= 'system.getStaticVar(' ( (lv_staticVar_13_0= RULE_ID ) ) otherlv_14= ')' ) ) ;
    public final EObject ruleArithVar() throws RecognitionException {
        EObject current = null;

        Token lv_obj_0_0=null;
        Token otherlv_1=null;
        Token lv_atr_2_0=null;
        Token lv_obj_3_0=null;
        Token otherlv_4=null;
        Token lv_op_5_0=null;
        Token otherlv_6=null;
        Token lv_param_7_0=null;
        Token lv_sd_8_0=null;
        Token otherlv_9=null;
        Token lv_param_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_staticVar_13_0=null;
        Token otherlv_14=null;

         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1256:28: ( ( ( ( (lv_obj_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_atr_2_0= RULE_ID ) ) ) | ( ( (lv_obj_3_0= RULE_ID ) ) otherlv_4= '::' ( (lv_op_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_param_7_0= RULE_ID ) ) ) | ( ( (lv_sd_8_0= RULE_ID ) ) otherlv_9= '.getParameter(' ( (lv_param_10_0= RULE_ID ) ) otherlv_11= ')' ) | (otherlv_12= 'system.getStaticVar(' ( (lv_staticVar_13_0= RULE_ID ) ) otherlv_14= ')' ) ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1257:1: ( ( ( (lv_obj_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_atr_2_0= RULE_ID ) ) ) | ( ( (lv_obj_3_0= RULE_ID ) ) otherlv_4= '::' ( (lv_op_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_param_7_0= RULE_ID ) ) ) | ( ( (lv_sd_8_0= RULE_ID ) ) otherlv_9= '.getParameter(' ( (lv_param_10_0= RULE_ID ) ) otherlv_11= ')' ) | (otherlv_12= 'system.getStaticVar(' ( (lv_staticVar_13_0= RULE_ID ) ) otherlv_14= ')' ) )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1257:1: ( ( ( (lv_obj_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_atr_2_0= RULE_ID ) ) ) | ( ( (lv_obj_3_0= RULE_ID ) ) otherlv_4= '::' ( (lv_op_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_param_7_0= RULE_ID ) ) ) | ( ( (lv_sd_8_0= RULE_ID ) ) otherlv_9= '.getParameter(' ( (lv_param_10_0= RULE_ID ) ) otherlv_11= ')' ) | (otherlv_12= 'system.getStaticVar(' ( (lv_staticVar_13_0= RULE_ID ) ) otherlv_14= ')' ) )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt11=1;
                    }
                    break;
                case 35:
                    {
                    alt11=3;
                    }
                    break;
                case 34:
                    {
                    alt11=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA11_0==36) ) {
                alt11=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1257:2: ( ( (lv_obj_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_atr_2_0= RULE_ID ) ) )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1257:2: ( ( (lv_obj_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_atr_2_0= RULE_ID ) ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1257:3: ( (lv_obj_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_atr_2_0= RULE_ID ) )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1257:3: ( (lv_obj_0_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1258:1: (lv_obj_0_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1258:1: (lv_obj_0_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1259:3: lv_obj_0_0= RULE_ID
                    {
                    lv_obj_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArithVar2395); 

                    			newLeafNode(lv_obj_0_0, grammarAccess.getArithVarAccess().getObjIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithVarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"obj",
                            		lv_obj_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleArithVar2412); 

                        	newLeafNode(otherlv_1, grammarAccess.getArithVarAccess().getFullStopKeyword_0_1());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1279:1: ( (lv_atr_2_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1280:1: (lv_atr_2_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1280:1: (lv_atr_2_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1281:3: lv_atr_2_0= RULE_ID
                    {
                    lv_atr_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArithVar2429); 

                    			newLeafNode(lv_atr_2_0, grammarAccess.getArithVarAccess().getAtrIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithVarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"atr",
                            		lv_atr_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1298:6: ( ( (lv_obj_3_0= RULE_ID ) ) otherlv_4= '::' ( (lv_op_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_param_7_0= RULE_ID ) ) )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1298:6: ( ( (lv_obj_3_0= RULE_ID ) ) otherlv_4= '::' ( (lv_op_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_param_7_0= RULE_ID ) ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1298:7: ( (lv_obj_3_0= RULE_ID ) ) otherlv_4= '::' ( (lv_op_5_0= RULE_ID ) ) otherlv_6= '.' ( (lv_param_7_0= RULE_ID ) )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1298:7: ( (lv_obj_3_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1299:1: (lv_obj_3_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1299:1: (lv_obj_3_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1300:3: lv_obj_3_0= RULE_ID
                    {
                    lv_obj_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArithVar2459); 

                    			newLeafNode(lv_obj_3_0, grammarAccess.getArithVarAccess().getObjIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithVarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"obj",
                            		lv_obj_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleArithVar2476); 

                        	newLeafNode(otherlv_4, grammarAccess.getArithVarAccess().getColonColonKeyword_1_1());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1320:1: ( (lv_op_5_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1321:1: (lv_op_5_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1321:1: (lv_op_5_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1322:3: lv_op_5_0= RULE_ID
                    {
                    lv_op_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArithVar2493); 

                    			newLeafNode(lv_op_5_0, grammarAccess.getArithVarAccess().getOpIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithVarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_5_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleArithVar2510); 

                        	newLeafNode(otherlv_6, grammarAccess.getArithVarAccess().getFullStopKeyword_1_3());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1342:1: ( (lv_param_7_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1343:1: (lv_param_7_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1343:1: (lv_param_7_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1344:3: lv_param_7_0= RULE_ID
                    {
                    lv_param_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArithVar2527); 

                    			newLeafNode(lv_param_7_0, grammarAccess.getArithVarAccess().getParamIDTerminalRuleCall_1_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithVarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"param",
                            		lv_param_7_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1361:6: ( ( (lv_sd_8_0= RULE_ID ) ) otherlv_9= '.getParameter(' ( (lv_param_10_0= RULE_ID ) ) otherlv_11= ')' )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1361:6: ( ( (lv_sd_8_0= RULE_ID ) ) otherlv_9= '.getParameter(' ( (lv_param_10_0= RULE_ID ) ) otherlv_11= ')' )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1361:7: ( (lv_sd_8_0= RULE_ID ) ) otherlv_9= '.getParameter(' ( (lv_param_10_0= RULE_ID ) ) otherlv_11= ')'
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1361:7: ( (lv_sd_8_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1362:1: (lv_sd_8_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1362:1: (lv_sd_8_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1363:3: lv_sd_8_0= RULE_ID
                    {
                    lv_sd_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArithVar2557); 

                    			newLeafNode(lv_sd_8_0, grammarAccess.getArithVarAccess().getSdIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithVarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"sd",
                            		lv_sd_8_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,35,FOLLOW_35_in_ruleArithVar2574); 

                        	newLeafNode(otherlv_9, grammarAccess.getArithVarAccess().getGetParameterKeyword_2_1());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1383:1: ( (lv_param_10_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1384:1: (lv_param_10_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1384:1: (lv_param_10_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1385:3: lv_param_10_0= RULE_ID
                    {
                    lv_param_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArithVar2591); 

                    			newLeafNode(lv_param_10_0, grammarAccess.getArithVarAccess().getParamIDTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithVarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"param",
                            		lv_param_10_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleArithVar2608); 

                        	newLeafNode(otherlv_11, grammarAccess.getArithVarAccess().getRightParenthesisKeyword_2_3());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1406:6: (otherlv_12= 'system.getStaticVar(' ( (lv_staticVar_13_0= RULE_ID ) ) otherlv_14= ')' )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1406:6: (otherlv_12= 'system.getStaticVar(' ( (lv_staticVar_13_0= RULE_ID ) ) otherlv_14= ')' )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1406:8: otherlv_12= 'system.getStaticVar(' ( (lv_staticVar_13_0= RULE_ID ) ) otherlv_14= ')'
                    {
                    otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleArithVar2628); 

                        	newLeafNode(otherlv_12, grammarAccess.getArithVarAccess().getSystemGetStaticVarKeyword_3_0());
                        
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1410:1: ( (lv_staticVar_13_0= RULE_ID ) )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1411:1: (lv_staticVar_13_0= RULE_ID )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1411:1: (lv_staticVar_13_0= RULE_ID )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1412:3: lv_staticVar_13_0= RULE_ID
                    {
                    lv_staticVar_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArithVar2645); 

                    			newLeafNode(lv_staticVar_13_0, grammarAccess.getArithVarAccess().getStaticVarIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithVarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"staticVar",
                            		lv_staticVar_13_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleArithVar2662); 

                        	newLeafNode(otherlv_14, grammarAccess.getArithVarAccess().getRightParenthesisKeyword_3_2());
                        

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
    // $ANTLR end "ruleArithVar"


    // $ANTLR start "entryRuleDataType"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1440:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1441:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1442:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType2699);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType2709); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1449:1: ruleDataType returns [EObject current=null] : ( ( (lv_i_0_0= RULE_INT ) ) ( (lv_float_1_0= RULE_FLOAT ) )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_i_0_0=null;
        Token lv_float_1_0=null;

         enterRule(); 
            
        try {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1452:28: ( ( ( (lv_i_0_0= RULE_INT ) ) ( (lv_float_1_0= RULE_FLOAT ) )? ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1453:1: ( ( (lv_i_0_0= RULE_INT ) ) ( (lv_float_1_0= RULE_FLOAT ) )? )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1453:1: ( ( (lv_i_0_0= RULE_INT ) ) ( (lv_float_1_0= RULE_FLOAT ) )? )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1453:2: ( (lv_i_0_0= RULE_INT ) ) ( (lv_float_1_0= RULE_FLOAT ) )?
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1453:2: ( (lv_i_0_0= RULE_INT ) )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1454:1: (lv_i_0_0= RULE_INT )
            {
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1454:1: (lv_i_0_0= RULE_INT )
            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1455:3: lv_i_0_0= RULE_INT
            {
            lv_i_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDataType2751); 

            			newLeafNode(lv_i_0_0, grammarAccess.getDataTypeAccess().getIINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"i",
                    		lv_i_0_0, 
                    		"INT");
            	    

            }


            }

            // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1471:2: ( (lv_float_1_0= RULE_FLOAT ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_FLOAT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1472:1: (lv_float_1_0= RULE_FLOAT )
                    {
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1472:1: (lv_float_1_0= RULE_FLOAT )
                    // ../org.correttouml.grammars.property/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalProperty.g:1473:3: lv_float_1_0= RULE_FLOAT
                    {
                    lv_float_1_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleDataType2773); 

                    			newLeafNode(lv_float_1_0, grammarAccess.getDataTypeAccess().getFloatFLOATTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"float",
                            		lv_float_1_0, 
                            		"FLOAT");
                    	    

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
    // $ANTLR end "ruleDataType"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\1\uffff\1\6\10\uffff";
    static final String DFA7_minS =
        "\2\5\3\uffff\1\6\4\uffff";
    static final String DFA7_maxS =
        "\1\44\1\43\3\uffff\1\10\4\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\1\1\7\1\6\1\5";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\3\uffff\1\3\21\uffff\1\2\1\4\1\5\3\3\3\uffff\1\3",
            "\1\6\4\uffff\1\6\10\uffff\1\6\1\uffff\1\6\2\uffff\1\6\10\uffff"+
            "\3\3",
            "",
            "",
            "",
            "\1\11\1\10\1\7",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "525:1: ( ( (lv_trioVar_0_0= RULE_ID ) ) | (otherlv_1= 'system.getSignal(' ( (lv_signal_2_0= RULE_ID ) ) otherlv_3= ')' ) | ( (lv_arithBool_4_0= ruleArithBool ) ) | (otherlv_5= '!(' ( (lv_trioNot_6_0= ruleTRIO ) ) otherlv_7= ')' ) | (otherlv_8= 'Time.' ( (lv_trioOpF_9_0= RULE_TRIOOPF ) ) otherlv_10= '(' ( (lv_trioOpF1_11_0= ruleTRIO ) ) otherlv_12= ')' ) | (otherlv_13= 'Time.' ( (lv_trioOpFF_14_0= RULE_TRIOOPFF ) ) otherlv_15= '(' ( (lv_trioOpFF1_16_0= ruleTRIO ) ) otherlv_17= ',' ( (lv_trioOpFF2_18_0= ruleTRIO ) ) otherlv_19= ')' ) | (otherlv_20= 'Time.' ( (lv_trioOpFN_21_0= RULE_TRIOOPFN ) ) otherlv_22= '(' ( (lv_trioOpFN1_23_0= ruleTRIO ) ) otherlv_24= ',' ( (lv_int_25_0= RULE_INT ) ) otherlv_26= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel131 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleCorretto_in_ruleModel153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCorretto_in_entryRuleCorretto189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCorretto199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCorretto236 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleVerify_in_ruleCorretto258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXECUTE_in_ruleCorretto281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_entryRuleVerify323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerify333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleVerify370 = new BitSet(new long[]{0x00000011F8000220L});
    public static final BitSet FOLLOW_ruleTRIO_in_ruleVerify391 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVerify403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration492 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDeclaration509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration526 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDeclaration543 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration560 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDeclaration577 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration594 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDeclaration611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration636 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDeclaration653 = new BitSet(new long[]{0x00000011F8000220L});
    public static final BitSet FOLLOW_ruleTRIO_in_ruleDeclaration675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration699 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleDeclaration718 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration735 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDeclaration752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDeclaration772 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaration789 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDeclaration806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTRIO_in_entryRuleTRIO847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTRIO857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTRIOL_in_ruleTRIO903 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ruleTRIOR_in_ruleTRIO924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTRIOL_in_entryRuleTRIOL961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTRIOL971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTRIOL1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTRIOL1037 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTRIOL1054 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTRIOL1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithBool_in_ruleTRIOL1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTRIOL1118 = new BitSet(new long[]{0x00000011F8000220L});
    public static final BitSet FOLLOW_ruleTRIO_in_ruleTRIOL1139 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTRIOL1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTRIOL1171 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_TRIOOPF_in_ruleTRIOL1188 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTRIOL1205 = new BitSet(new long[]{0x00000011F8000220L});
    public static final BitSet FOLLOW_ruleTRIO_in_ruleTRIOL1226 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTRIOL1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTRIOL1258 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TRIOOPFF_in_ruleTRIOL1275 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTRIOL1292 = new BitSet(new long[]{0x00000011F8000220L});
    public static final BitSet FOLLOW_ruleTRIO_in_ruleTRIOL1313 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTRIOL1325 = new BitSet(new long[]{0x00000011F8000220L});
    public static final BitSet FOLLOW_ruleTRIO_in_ruleTRIOL1346 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTRIOL1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTRIOL1378 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_TRIOOPFN_in_ruleTRIOL1395 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTRIOL1412 = new BitSet(new long[]{0x00000011F8000220L});
    public static final BitSet FOLLOW_ruleTRIO_in_ruleTRIOL1433 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTRIOL1445 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTRIOL1462 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTRIOL1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTRIOR_in_entryRuleTRIOR1516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTRIOR1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRIOOP2_in_ruleTRIOR1568 = new BitSet(new long[]{0x00000011F8000220L});
    public static final BitSet FOLLOW_ruleTRIO_in_ruleTRIOR1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithBool_in_entryRuleArithBool1630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithBool1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithTerm_in_ruleArithBool1686 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_ARITH_COMPARE_OP_in_ruleArithBool1704 = new BitSet(new long[]{0x00000011C0000220L});
    public static final BitSet FOLLOW_ruleArithTerm_in_ruleArithBool1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithTerm_in_entryRuleArithTerm1768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithTerm1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithTermL_in_ruleArithTerm1824 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleArithTermR_in_ruleArithTerm1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithTermL_in_entryRuleArithTermL1882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithTermL1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleArithTermL1930 = new BitSet(new long[]{0x00000011F8000220L});
    public static final BitSet FOLLOW_ruleTRIO_in_ruleArithTermL1951 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleArithTermL1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleArithTermL1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithVar_in_ruleArithTermL2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleArithTermL2037 = new BitSet(new long[]{0x00000011C0000220L});
    public static final BitSet FOLLOW_ruleArithTerm_in_ruleArithTermL2058 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleArithTermL2070 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArithTermL2087 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleArithTermL2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleArithTermL2124 = new BitSet(new long[]{0x00000011C0000220L});
    public static final BitSet FOLLOW_ruleArithTerm_in_ruleArithTermL2145 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleArithTermL2157 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArithTermL2174 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleArithTermL2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithTermR_in_entryRuleArithTermR2228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithTermR2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARITH_OP_in_ruleArithTermR2280 = new BitSet(new long[]{0x00000011C0000220L});
    public static final BitSet FOLLOW_ruleArithTerm_in_ruleArithTermR2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithVar_in_entryRuleArithVar2342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithVar2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArithVar2395 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleArithVar2412 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArithVar2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArithVar2459 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleArithVar2476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArithVar2493 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleArithVar2510 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArithVar2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArithVar2557 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleArithVar2574 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArithVar2591 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleArithVar2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleArithVar2628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArithVar2645 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleArithVar2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType2699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDataType2751 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleDataType2773 = new BitSet(new long[]{0x0000000000000002L});

}