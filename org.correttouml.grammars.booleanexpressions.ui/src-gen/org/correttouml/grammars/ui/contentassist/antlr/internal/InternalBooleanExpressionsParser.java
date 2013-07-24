package org.correttouml.grammars.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.correttouml.grammars.services.BooleanExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBooleanExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OR", "RULE_AND", "RULE_NOT", "RULE_RELATIONS", "RULE_INT", "RULE_ID", "RULE_OPERATOR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'exit'", "'enter'", "'start'", "'end'", "'tick'", "'sig'", "'call'", "'send'", "'receive'", "'('", "')'", "'@'", "'-'", "'{'", "'}'", "'.'", "'now'"
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
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_OR=4;
    public static final int RULE_RELATIONS=7;
    public static final int RULE_AND=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_NOT=6;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=11;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=8;
    public static final int RULE_OPERATOR=10;
    public static final int RULE_WS=14;

    // delegates
    // delegators


        public InternalBooleanExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBooleanExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBooleanExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g"; }


     
     	private BooleanExpressionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BooleanExpressionsGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:61:1: ( ruleModel EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:69:1: ruleModel : ( ( rule__Model__ExpressionAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:73:2: ( ( ( rule__Model__ExpressionAssignment ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:74:1: ( ( rule__Model__ExpressionAssignment ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:74:1: ( ( rule__Model__ExpressionAssignment ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:75:1: ( rule__Model__ExpressionAssignment )
            {
             before(grammarAccess.getModelAccess().getExpressionAssignment()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:76:1: ( rule__Model__ExpressionAssignment )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:76:2: rule__Model__ExpressionAssignment
            {
            pushFollow(FOLLOW_rule__Model__ExpressionAssignment_in_ruleModel94);
            rule__Model__ExpressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getExpressionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:88:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:89:1: ( ruleOrExpression EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:90:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression121);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:97:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:101:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:102:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:102:1: ( ( rule__OrExpression__Group__0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:103:1: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:104:1: ( rule__OrExpression__Group__0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:104:2: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression154);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:116:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:117:1: ( ruleAndExpression EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:118:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression181);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:125:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:129:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:130:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:130:1: ( ( rule__AndExpression__Group__0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:131:1: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:132:1: ( rule__AndExpression__Group__0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:132:2: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression214);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleBaseExpression"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:144:1: entryRuleBaseExpression : ruleBaseExpression EOF ;
    public final void entryRuleBaseExpression() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:145:1: ( ruleBaseExpression EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:146:1: ruleBaseExpression EOF
            {
             before(grammarAccess.getBaseExpressionRule()); 
            pushFollow(FOLLOW_ruleBaseExpression_in_entryRuleBaseExpression241);
            ruleBaseExpression();

            state._fsp--;

             after(grammarAccess.getBaseExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseExpression248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseExpression"


    // $ANTLR start "ruleBaseExpression"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:153:1: ruleBaseExpression : ( ( rule__BaseExpression__Group__0 ) ) ;
    public final void ruleBaseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:157:2: ( ( ( rule__BaseExpression__Group__0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:158:1: ( ( rule__BaseExpression__Group__0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:158:1: ( ( rule__BaseExpression__Group__0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:159:1: ( rule__BaseExpression__Group__0 )
            {
             before(grammarAccess.getBaseExpressionAccess().getGroup()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:160:1: ( rule__BaseExpression__Group__0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:160:2: rule__BaseExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group__0_in_ruleBaseExpression274);
            rule__BaseExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseExpression"


    // $ANTLR start "entryRulebooleanTerm"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:172:1: entryRulebooleanTerm : rulebooleanTerm EOF ;
    public final void entryRulebooleanTerm() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:173:1: ( rulebooleanTerm EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:174:1: rulebooleanTerm EOF
            {
             before(grammarAccess.getBooleanTermRule()); 
            pushFollow(FOLLOW_rulebooleanTerm_in_entryRulebooleanTerm301);
            rulebooleanTerm();

            state._fsp--;

             after(grammarAccess.getBooleanTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulebooleanTerm308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebooleanTerm"


    // $ANTLR start "rulebooleanTerm"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:181:1: rulebooleanTerm : ( ( rule__BooleanTerm__Alternatives ) ) ;
    public final void rulebooleanTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:185:2: ( ( ( rule__BooleanTerm__Alternatives ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:186:1: ( ( rule__BooleanTerm__Alternatives ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:186:1: ( ( rule__BooleanTerm__Alternatives ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:187:1: ( rule__BooleanTerm__Alternatives )
            {
             before(grammarAccess.getBooleanTermAccess().getAlternatives()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:188:1: ( rule__BooleanTerm__Alternatives )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:188:2: rule__BooleanTerm__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanTerm__Alternatives_in_rulebooleanTerm334);
            rule__BooleanTerm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTermAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebooleanTerm"


    // $ANTLR start "entryRuleTimeConstraint"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:200:1: entryRuleTimeConstraint : ruleTimeConstraint EOF ;
    public final void entryRuleTimeConstraint() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:201:1: ( ruleTimeConstraint EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:202:1: ruleTimeConstraint EOF
            {
             before(grammarAccess.getTimeConstraintRule()); 
            pushFollow(FOLLOW_ruleTimeConstraint_in_entryRuleTimeConstraint361);
            ruleTimeConstraint();

            state._fsp--;

             after(grammarAccess.getTimeConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeConstraint368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeConstraint"


    // $ANTLR start "ruleTimeConstraint"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:209:1: ruleTimeConstraint : ( ( rule__TimeConstraint__Group__0 ) ) ;
    public final void ruleTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:213:2: ( ( ( rule__TimeConstraint__Group__0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:214:1: ( ( rule__TimeConstraint__Group__0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:214:1: ( ( rule__TimeConstraint__Group__0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:215:1: ( rule__TimeConstraint__Group__0 )
            {
             before(grammarAccess.getTimeConstraintAccess().getGroup()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:216:1: ( rule__TimeConstraint__Group__0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:216:2: rule__TimeConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__0_in_ruleTimeConstraint394);
            rule__TimeConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeConstraint"


    // $ANTLR start "entryRuleBooleanVariable"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:228:1: entryRuleBooleanVariable : ruleBooleanVariable EOF ;
    public final void entryRuleBooleanVariable() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:229:1: ( ruleBooleanVariable EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:230:1: ruleBooleanVariable EOF
            {
             before(grammarAccess.getBooleanVariableRule()); 
            pushFollow(FOLLOW_ruleBooleanVariable_in_entryRuleBooleanVariable421);
            ruleBooleanVariable();

            state._fsp--;

             after(grammarAccess.getBooleanVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanVariable428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanVariable"


    // $ANTLR start "ruleBooleanVariable"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:237:1: ruleBooleanVariable : ( ( rule__BooleanVariable__VariableAssignment ) ) ;
    public final void ruleBooleanVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:241:2: ( ( ( rule__BooleanVariable__VariableAssignment ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:242:1: ( ( rule__BooleanVariable__VariableAssignment ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:242:1: ( ( rule__BooleanVariable__VariableAssignment ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:243:1: ( rule__BooleanVariable__VariableAssignment )
            {
             before(grammarAccess.getBooleanVariableAccess().getVariableAssignment()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:244:1: ( rule__BooleanVariable__VariableAssignment )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:244:2: rule__BooleanVariable__VariableAssignment
            {
            pushFollow(FOLLOW_rule__BooleanVariable__VariableAssignment_in_ruleBooleanVariable454);
            rule__BooleanVariable__VariableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanVariableAccess().getVariableAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanVariable"


    // $ANTLR start "entryRuleVariableCondition"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:256:1: entryRuleVariableCondition : ruleVariableCondition EOF ;
    public final void entryRuleVariableCondition() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:257:1: ( ruleVariableCondition EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:258:1: ruleVariableCondition EOF
            {
             before(grammarAccess.getVariableConditionRule()); 
            pushFollow(FOLLOW_ruleVariableCondition_in_entryRuleVariableCondition481);
            ruleVariableCondition();

            state._fsp--;

             after(grammarAccess.getVariableConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableCondition488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableCondition"


    // $ANTLR start "ruleVariableCondition"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:265:1: ruleVariableCondition : ( ( rule__VariableCondition__Group__0 ) ) ;
    public final void ruleVariableCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:269:2: ( ( ( rule__VariableCondition__Group__0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:270:1: ( ( rule__VariableCondition__Group__0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:270:1: ( ( rule__VariableCondition__Group__0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:271:1: ( rule__VariableCondition__Group__0 )
            {
             before(grammarAccess.getVariableConditionAccess().getGroup()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:272:1: ( rule__VariableCondition__Group__0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:272:2: rule__VariableCondition__Group__0
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__0_in_ruleVariableCondition514);
            rule__VariableCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableCondition"


    // $ANTLR start "entryRuleEXPRESSION"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:284:1: entryRuleEXPRESSION : ruleEXPRESSION EOF ;
    public final void entryRuleEXPRESSION() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:285:1: ( ruleEXPRESSION EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:286:1: ruleEXPRESSION EOF
            {
             before(grammarAccess.getEXPRESSIONRule()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION541);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getEXPRESSIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRESSION548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEXPRESSION"


    // $ANTLR start "ruleEXPRESSION"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:293:1: ruleEXPRESSION : ( ( rule__EXPRESSION__Alternatives ) ) ;
    public final void ruleEXPRESSION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:297:2: ( ( ( rule__EXPRESSION__Alternatives ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:298:1: ( ( rule__EXPRESSION__Alternatives ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:298:1: ( ( rule__EXPRESSION__Alternatives ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:299:1: ( rule__EXPRESSION__Alternatives )
            {
             before(grammarAccess.getEXPRESSIONAccess().getAlternatives()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:300:1: ( rule__EXPRESSION__Alternatives )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:300:2: rule__EXPRESSION__Alternatives
            {
            pushFollow(FOLLOW_rule__EXPRESSION__Alternatives_in_ruleEXPRESSION574);
            rule__EXPRESSION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEXPRESSIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEXPRESSION"


    // $ANTLR start "entryRuleTERM"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:312:1: entryRuleTERM : ruleTERM EOF ;
    public final void entryRuleTERM() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:313:1: ( ruleTERM EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:314:1: ruleTERM EOF
            {
             before(grammarAccess.getTERMRule()); 
            pushFollow(FOLLOW_ruleTERM_in_entryRuleTERM601);
            ruleTERM();

            state._fsp--;

             after(grammarAccess.getTERMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTERM608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTERM"


    // $ANTLR start "ruleTERM"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:321:1: ruleTERM : ( ( rule__TERM__Alternatives ) ) ;
    public final void ruleTERM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:325:2: ( ( ( rule__TERM__Alternatives ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:326:1: ( ( rule__TERM__Alternatives ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:326:1: ( ( rule__TERM__Alternatives ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:327:1: ( rule__TERM__Alternatives )
            {
             before(grammarAccess.getTERMAccess().getAlternatives()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:328:1: ( rule__TERM__Alternatives )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:328:2: rule__TERM__Alternatives
            {
            pushFollow(FOLLOW_rule__TERM__Alternatives_in_ruleTERM634);
            rule__TERM__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTERMAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTERM"


    // $ANTLR start "entryRuleEvent"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:340:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:341:1: ( ruleEvent EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:342:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent661);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:349:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:353:2: ( ( ( rule__Event__Alternatives ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:354:1: ( ( rule__Event__Alternatives ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:354:1: ( ( rule__Event__Alternatives ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:355:1: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:356:1: ( rule__Event__Alternatives )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:356:2: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_rule__Event__Alternatives_in_ruleEvent694);
            rule__Event__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEventExtensions"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:368:1: entryRuleEventExtensions : ruleEventExtensions EOF ;
    public final void entryRuleEventExtensions() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:369:1: ( ruleEventExtensions EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:370:1: ruleEventExtensions EOF
            {
             before(grammarAccess.getEventExtensionsRule()); 
            pushFollow(FOLLOW_ruleEventExtensions_in_entryRuleEventExtensions721);
            ruleEventExtensions();

            state._fsp--;

             after(grammarAccess.getEventExtensionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventExtensions728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventExtensions"


    // $ANTLR start "ruleEventExtensions"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:377:1: ruleEventExtensions : ( ( rule__EventExtensions__Alternatives ) ) ;
    public final void ruleEventExtensions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:381:2: ( ( ( rule__EventExtensions__Alternatives ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:382:1: ( ( rule__EventExtensions__Alternatives ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:382:1: ( ( rule__EventExtensions__Alternatives ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:383:1: ( rule__EventExtensions__Alternatives )
            {
             before(grammarAccess.getEventExtensionsAccess().getAlternatives()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:384:1: ( rule__EventExtensions__Alternatives )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:384:2: rule__EventExtensions__Alternatives
            {
            pushFollow(FOLLOW_rule__EventExtensions__Alternatives_in_ruleEventExtensions754);
            rule__EventExtensions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventExtensionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventExtensions"


    // $ANTLR start "rule__BaseExpression__Alternatives_1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:396:1: rule__BaseExpression__Alternatives_1 : ( ( ( rule__BaseExpression__BooleanTermAssignment_1_0 ) ) | ( ( rule__BaseExpression__Group_1_1__0 ) ) );
    public final void rule__BaseExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:400:1: ( ( ( rule__BaseExpression__BooleanTermAssignment_1_0 ) ) | ( ( rule__BaseExpression__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||LA1_0==27||LA1_0==29) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:401:1: ( ( rule__BaseExpression__BooleanTermAssignment_1_0 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:401:1: ( ( rule__BaseExpression__BooleanTermAssignment_1_0 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:402:1: ( rule__BaseExpression__BooleanTermAssignment_1_0 )
                    {
                     before(grammarAccess.getBaseExpressionAccess().getBooleanTermAssignment_1_0()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:403:1: ( rule__BaseExpression__BooleanTermAssignment_1_0 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:403:2: rule__BaseExpression__BooleanTermAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__BaseExpression__BooleanTermAssignment_1_0_in_rule__BaseExpression__Alternatives_1790);
                    rule__BaseExpression__BooleanTermAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseExpressionAccess().getBooleanTermAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:407:6: ( ( rule__BaseExpression__Group_1_1__0 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:407:6: ( ( rule__BaseExpression__Group_1_1__0 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:408:1: ( rule__BaseExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getBaseExpressionAccess().getGroup_1_1()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:409:1: ( rule__BaseExpression__Group_1_1__0 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:409:2: rule__BaseExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__0_in_rule__BaseExpression__Alternatives_1808);
                    rule__BaseExpression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseExpressionAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Alternatives_1"


    // $ANTLR start "rule__BooleanTerm__Alternatives"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:418:1: rule__BooleanTerm__Alternatives : ( ( ( rule__BooleanTerm__TimeConstraintAssignment_0 ) ) | ( ( rule__BooleanTerm__BooleanVariableAssignment_1 ) ) | ( ( rule__BooleanTerm__VariableConditionAssignment_2 ) ) );
    public final void rule__BooleanTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:422:1: ( ( ( rule__BooleanTerm__TimeConstraintAssignment_0 ) ) | ( ( rule__BooleanTerm__BooleanVariableAssignment_1 ) ) | ( ( rule__BooleanTerm__VariableConditionAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:423:1: ( ( rule__BooleanTerm__TimeConstraintAssignment_0 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:423:1: ( ( rule__BooleanTerm__TimeConstraintAssignment_0 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:424:1: ( rule__BooleanTerm__TimeConstraintAssignment_0 )
                    {
                     before(grammarAccess.getBooleanTermAccess().getTimeConstraintAssignment_0()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:425:1: ( rule__BooleanTerm__TimeConstraintAssignment_0 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:425:2: rule__BooleanTerm__TimeConstraintAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BooleanTerm__TimeConstraintAssignment_0_in_rule__BooleanTerm__Alternatives841);
                    rule__BooleanTerm__TimeConstraintAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanTermAccess().getTimeConstraintAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:429:6: ( ( rule__BooleanTerm__BooleanVariableAssignment_1 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:429:6: ( ( rule__BooleanTerm__BooleanVariableAssignment_1 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:430:1: ( rule__BooleanTerm__BooleanVariableAssignment_1 )
                    {
                     before(grammarAccess.getBooleanTermAccess().getBooleanVariableAssignment_1()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:431:1: ( rule__BooleanTerm__BooleanVariableAssignment_1 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:431:2: rule__BooleanTerm__BooleanVariableAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BooleanTerm__BooleanVariableAssignment_1_in_rule__BooleanTerm__Alternatives859);
                    rule__BooleanTerm__BooleanVariableAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanTermAccess().getBooleanVariableAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:435:6: ( ( rule__BooleanTerm__VariableConditionAssignment_2 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:435:6: ( ( rule__BooleanTerm__VariableConditionAssignment_2 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:436:1: ( rule__BooleanTerm__VariableConditionAssignment_2 )
                    {
                     before(grammarAccess.getBooleanTermAccess().getVariableConditionAssignment_2()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:437:1: ( rule__BooleanTerm__VariableConditionAssignment_2 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:437:2: rule__BooleanTerm__VariableConditionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__BooleanTerm__VariableConditionAssignment_2_in_rule__BooleanTerm__Alternatives877);
                    rule__BooleanTerm__VariableConditionAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanTermAccess().getVariableConditionAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanTerm__Alternatives"


    // $ANTLR start "rule__EXPRESSION__Alternatives"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:446:1: rule__EXPRESSION__Alternatives : ( ( ( rule__EXPRESSION__Group_0__0 ) ) | ( ( rule__EXPRESSION__AloneAssignment_1 ) ) );
    public final void rule__EXPRESSION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:450:1: ( ( ( rule__EXPRESSION__Group_0__0 ) ) | ( ( rule__EXPRESSION__AloneAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_RELATIONS||LA3_1==30) ) {
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

                if ( (LA3_2==EOF||LA3_2==RULE_RELATIONS||LA3_2==30) ) {
                    alt3=2;
                }
                else if ( (LA3_2==RULE_OPERATOR) ) {
                    alt3=1;
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
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:451:1: ( ( rule__EXPRESSION__Group_0__0 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:451:1: ( ( rule__EXPRESSION__Group_0__0 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:452:1: ( rule__EXPRESSION__Group_0__0 )
                    {
                     before(grammarAccess.getEXPRESSIONAccess().getGroup_0()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:453:1: ( rule__EXPRESSION__Group_0__0 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:453:2: rule__EXPRESSION__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__EXPRESSION__Group_0__0_in_rule__EXPRESSION__Alternatives910);
                    rule__EXPRESSION__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEXPRESSIONAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:457:6: ( ( rule__EXPRESSION__AloneAssignment_1 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:457:6: ( ( rule__EXPRESSION__AloneAssignment_1 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:458:1: ( rule__EXPRESSION__AloneAssignment_1 )
                    {
                     before(grammarAccess.getEXPRESSIONAccess().getAloneAssignment_1()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:459:1: ( rule__EXPRESSION__AloneAssignment_1 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:459:2: rule__EXPRESSION__AloneAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EXPRESSION__AloneAssignment_1_in_rule__EXPRESSION__Alternatives928);
                    rule__EXPRESSION__AloneAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEXPRESSIONAccess().getAloneAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Alternatives"


    // $ANTLR start "rule__TERM__Alternatives"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:468:1: rule__TERM__Alternatives : ( ( ( rule__TERM__VariableAssignment_0 ) ) | ( ( rule__TERM__ConstantAssignment_1 ) ) );
    public final void rule__TERM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:472:1: ( ( ( rule__TERM__VariableAssignment_0 ) ) | ( ( rule__TERM__ConstantAssignment_1 ) ) )
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
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:473:1: ( ( rule__TERM__VariableAssignment_0 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:473:1: ( ( rule__TERM__VariableAssignment_0 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:474:1: ( rule__TERM__VariableAssignment_0 )
                    {
                     before(grammarAccess.getTERMAccess().getVariableAssignment_0()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:475:1: ( rule__TERM__VariableAssignment_0 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:475:2: rule__TERM__VariableAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TERM__VariableAssignment_0_in_rule__TERM__Alternatives961);
                    rule__TERM__VariableAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTERMAccess().getVariableAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:479:6: ( ( rule__TERM__ConstantAssignment_1 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:479:6: ( ( rule__TERM__ConstantAssignment_1 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:480:1: ( rule__TERM__ConstantAssignment_1 )
                    {
                     before(grammarAccess.getTERMAccess().getConstantAssignment_1()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:481:1: ( rule__TERM__ConstantAssignment_1 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:481:2: rule__TERM__ConstantAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TERM__ConstantAssignment_1_in_rule__TERM__Alternatives979);
                    rule__TERM__ConstantAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTERMAccess().getConstantAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TERM__Alternatives"


    // $ANTLR start "rule__Event__Alternatives"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:490:1: rule__Event__Alternatives : ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__NowEventAssignment_1 ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:494:1: ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__NowEventAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==32) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:495:1: ( ( rule__Event__Group_0__0 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:495:1: ( ( rule__Event__Group_0__0 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:496:1: ( rule__Event__Group_0__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_0()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:497:1: ( rule__Event__Group_0__0 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:497:2: rule__Event__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_0__0_in_rule__Event__Alternatives1012);
                    rule__Event__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:501:6: ( ( rule__Event__NowEventAssignment_1 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:501:6: ( ( rule__Event__NowEventAssignment_1 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:502:1: ( rule__Event__NowEventAssignment_1 )
                    {
                     before(grammarAccess.getEventAccess().getNowEventAssignment_1()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:503:1: ( rule__Event__NowEventAssignment_1 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:503:2: rule__Event__NowEventAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Event__NowEventAssignment_1_in_rule__Event__Alternatives1030);
                    rule__Event__NowEventAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getNowEventAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Alternatives"


    // $ANTLR start "rule__EventExtensions__Alternatives"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:512:1: rule__EventExtensions__Alternatives : ( ( 'exit' ) | ( 'enter' ) | ( 'start' ) | ( 'end' ) | ( 'tick' ) | ( 'sig' ) | ( 'call' ) | ( 'send' ) | ( 'receive' ) );
    public final void rule__EventExtensions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:516:1: ( ( 'exit' ) | ( 'enter' ) | ( 'start' ) | ( 'end' ) | ( 'tick' ) | ( 'sig' ) | ( 'call' ) | ( 'send' ) | ( 'receive' ) )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            case 21:
                {
                alt6=6;
                }
                break;
            case 22:
                {
                alt6=7;
                }
                break;
            case 23:
                {
                alt6=8;
                }
                break;
            case 24:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:517:1: ( 'exit' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:517:1: ( 'exit' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:518:1: 'exit'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__EventExtensions__Alternatives1064); 
                     after(grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:525:6: ( 'enter' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:525:6: ( 'enter' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:526:1: 'enter'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__EventExtensions__Alternatives1084); 
                     after(grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:533:6: ( 'start' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:533:6: ( 'start' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:534:1: 'start'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); 
                    match(input,18,FOLLOW_18_in_rule__EventExtensions__Alternatives1104); 
                     after(grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:541:6: ( 'end' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:541:6: ( 'end' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:542:1: 'end'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); 
                    match(input,19,FOLLOW_19_in_rule__EventExtensions__Alternatives1124); 
                     after(grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:549:6: ( 'tick' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:549:6: ( 'tick' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:550:1: 'tick'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); 
                    match(input,20,FOLLOW_20_in_rule__EventExtensions__Alternatives1144); 
                     after(grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:557:6: ( 'sig' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:557:6: ( 'sig' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:558:1: 'sig'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); 
                    match(input,21,FOLLOW_21_in_rule__EventExtensions__Alternatives1164); 
                     after(grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:565:6: ( 'call' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:565:6: ( 'call' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:566:1: 'call'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); 
                    match(input,22,FOLLOW_22_in_rule__EventExtensions__Alternatives1184); 
                     after(grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:573:6: ( 'send' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:573:6: ( 'send' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:574:1: 'send'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getSendKeyword_7()); 
                    match(input,23,FOLLOW_23_in_rule__EventExtensions__Alternatives1204); 
                     after(grammarAccess.getEventExtensionsAccess().getSendKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:581:6: ( 'receive' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:581:6: ( 'receive' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:582:1: 'receive'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getReceiveKeyword_8()); 
                    match(input,24,FOLLOW_24_in_rule__EventExtensions__Alternatives1224); 
                     after(grammarAccess.getEventExtensionsAccess().getReceiveKeyword_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventExtensions__Alternatives"


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:596:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:600:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:601:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__01256);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__01259);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:608:1: rule__OrExpression__Group__0__Impl : ( ( rule__OrExpression__LeftExpressionAssignment_0 ) ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:612:1: ( ( ( rule__OrExpression__LeftExpressionAssignment_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:613:1: ( ( rule__OrExpression__LeftExpressionAssignment_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:613:1: ( ( rule__OrExpression__LeftExpressionAssignment_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:614:1: ( rule__OrExpression__LeftExpressionAssignment_0 )
            {
             before(grammarAccess.getOrExpressionAccess().getLeftExpressionAssignment_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:615:1: ( rule__OrExpression__LeftExpressionAssignment_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:615:2: rule__OrExpression__LeftExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__OrExpression__LeftExpressionAssignment_0_in_rule__OrExpression__Group__0__Impl1286);
            rule__OrExpression__LeftExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getLeftExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:625:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:629:1: ( rule__OrExpression__Group__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:630:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__11316);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:636:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )? ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:640:1: ( ( ( rule__OrExpression__Group_1__0 )? ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:641:1: ( ( rule__OrExpression__Group_1__0 )? )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:641:1: ( ( rule__OrExpression__Group_1__0 )? )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:642:1: ( rule__OrExpression__Group_1__0 )?
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:643:1: ( rule__OrExpression__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_OR) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:643:2: rule__OrExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl1343);
                    rule__OrExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:657:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:661:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:662:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__01378);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__01381);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:669:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__OrAssignment_1_0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:673:1: ( ( ( rule__OrExpression__OrAssignment_1_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:674:1: ( ( rule__OrExpression__OrAssignment_1_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:674:1: ( ( rule__OrExpression__OrAssignment_1_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:675:1: ( rule__OrExpression__OrAssignment_1_0 )
            {
             before(grammarAccess.getOrExpressionAccess().getOrAssignment_1_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:676:1: ( rule__OrExpression__OrAssignment_1_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:676:2: rule__OrExpression__OrAssignment_1_0
            {
            pushFollow(FOLLOW_rule__OrExpression__OrAssignment_1_0_in_rule__OrExpression__Group_1__0__Impl1408);
            rule__OrExpression__OrAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getOrAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:686:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:690:1: ( rule__OrExpression__Group_1__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:691:2: rule__OrExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__11438);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:697:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightExpressionAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:701:1: ( ( ( rule__OrExpression__RightExpressionAssignment_1_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:702:1: ( ( rule__OrExpression__RightExpressionAssignment_1_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:702:1: ( ( rule__OrExpression__RightExpressionAssignment_1_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:703:1: ( rule__OrExpression__RightExpressionAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightExpressionAssignment_1_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:704:1: ( rule__OrExpression__RightExpressionAssignment_1_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:704:2: rule__OrExpression__RightExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExpression__RightExpressionAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl1465);
            rule__OrExpression__RightExpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRightExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:718:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:722:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:723:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__01499);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__01502);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:730:1: rule__AndExpression__Group__0__Impl : ( ( rule__AndExpression__LeftExpressionAssignment_0 ) ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:734:1: ( ( ( rule__AndExpression__LeftExpressionAssignment_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:735:1: ( ( rule__AndExpression__LeftExpressionAssignment_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:735:1: ( ( rule__AndExpression__LeftExpressionAssignment_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:736:1: ( rule__AndExpression__LeftExpressionAssignment_0 )
            {
             before(grammarAccess.getAndExpressionAccess().getLeftExpressionAssignment_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:737:1: ( rule__AndExpression__LeftExpressionAssignment_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:737:2: rule__AndExpression__LeftExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__AndExpression__LeftExpressionAssignment_0_in_rule__AndExpression__Group__0__Impl1529);
            rule__AndExpression__LeftExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getLeftExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:747:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:751:1: ( rule__AndExpression__Group__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:752:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__11559);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:758:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )? ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:762:1: ( ( ( rule__AndExpression__Group_1__0 )? ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:763:1: ( ( rule__AndExpression__Group_1__0 )? )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:763:1: ( ( rule__AndExpression__Group_1__0 )? )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:764:1: ( rule__AndExpression__Group_1__0 )?
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:765:1: ( rule__AndExpression__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_AND) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:765:2: rule__AndExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl1586);
                    rule__AndExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:779:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:783:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:784:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__01621);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__01624);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:791:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__AndAssignment_1_0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:795:1: ( ( ( rule__AndExpression__AndAssignment_1_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:796:1: ( ( rule__AndExpression__AndAssignment_1_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:796:1: ( ( rule__AndExpression__AndAssignment_1_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:797:1: ( rule__AndExpression__AndAssignment_1_0 )
            {
             before(grammarAccess.getAndExpressionAccess().getAndAssignment_1_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:798:1: ( rule__AndExpression__AndAssignment_1_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:798:2: rule__AndExpression__AndAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AndExpression__AndAssignment_1_0_in_rule__AndExpression__Group_1__0__Impl1651);
            rule__AndExpression__AndAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getAndAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:808:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:812:1: ( rule__AndExpression__Group_1__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:813:2: rule__AndExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__11681);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:819:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightExpressionAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:823:1: ( ( ( rule__AndExpression__RightExpressionAssignment_1_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:824:1: ( ( rule__AndExpression__RightExpressionAssignment_1_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:824:1: ( ( rule__AndExpression__RightExpressionAssignment_1_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:825:1: ( rule__AndExpression__RightExpressionAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightExpressionAssignment_1_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:826:1: ( rule__AndExpression__RightExpressionAssignment_1_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:826:2: rule__AndExpression__RightExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__RightExpressionAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl1708);
            rule__AndExpression__RightExpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__BaseExpression__Group__0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:840:1: rule__BaseExpression__Group__0 : rule__BaseExpression__Group__0__Impl rule__BaseExpression__Group__1 ;
    public final void rule__BaseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:844:1: ( rule__BaseExpression__Group__0__Impl rule__BaseExpression__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:845:2: rule__BaseExpression__Group__0__Impl rule__BaseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group__0__Impl_in_rule__BaseExpression__Group__01742);
            rule__BaseExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseExpression__Group__1_in_rule__BaseExpression__Group__01745);
            rule__BaseExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group__0"


    // $ANTLR start "rule__BaseExpression__Group__0__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:852:1: rule__BaseExpression__Group__0__Impl : ( ( rule__BaseExpression__NotAssignment_0 )? ) ;
    public final void rule__BaseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:856:1: ( ( ( rule__BaseExpression__NotAssignment_0 )? ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:857:1: ( ( rule__BaseExpression__NotAssignment_0 )? )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:857:1: ( ( rule__BaseExpression__NotAssignment_0 )? )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:858:1: ( rule__BaseExpression__NotAssignment_0 )?
            {
             before(grammarAccess.getBaseExpressionAccess().getNotAssignment_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:859:1: ( rule__BaseExpression__NotAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_NOT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:859:2: rule__BaseExpression__NotAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BaseExpression__NotAssignment_0_in_rule__BaseExpression__Group__0__Impl1772);
                    rule__BaseExpression__NotAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseExpressionAccess().getNotAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group__0__Impl"


    // $ANTLR start "rule__BaseExpression__Group__1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:869:1: rule__BaseExpression__Group__1 : rule__BaseExpression__Group__1__Impl ;
    public final void rule__BaseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:873:1: ( rule__BaseExpression__Group__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:874:2: rule__BaseExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group__1__Impl_in_rule__BaseExpression__Group__11803);
            rule__BaseExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group__1"


    // $ANTLR start "rule__BaseExpression__Group__1__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:880:1: rule__BaseExpression__Group__1__Impl : ( ( rule__BaseExpression__Alternatives_1 ) ) ;
    public final void rule__BaseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:884:1: ( ( ( rule__BaseExpression__Alternatives_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:885:1: ( ( rule__BaseExpression__Alternatives_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:885:1: ( ( rule__BaseExpression__Alternatives_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:886:1: ( rule__BaseExpression__Alternatives_1 )
            {
             before(grammarAccess.getBaseExpressionAccess().getAlternatives_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:887:1: ( rule__BaseExpression__Alternatives_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:887:2: rule__BaseExpression__Alternatives_1
            {
            pushFollow(FOLLOW_rule__BaseExpression__Alternatives_1_in_rule__BaseExpression__Group__1__Impl1830);
            rule__BaseExpression__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseExpressionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group__1__Impl"


    // $ANTLR start "rule__BaseExpression__Group_1_1__0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:901:1: rule__BaseExpression__Group_1_1__0 : rule__BaseExpression__Group_1_1__0__Impl rule__BaseExpression__Group_1_1__1 ;
    public final void rule__BaseExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:905:1: ( rule__BaseExpression__Group_1_1__0__Impl rule__BaseExpression__Group_1_1__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:906:2: rule__BaseExpression__Group_1_1__0__Impl rule__BaseExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__0__Impl_in_rule__BaseExpression__Group_1_1__01864);
            rule__BaseExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__1_in_rule__BaseExpression__Group_1_1__01867);
            rule__BaseExpression__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_1_1__0"


    // $ANTLR start "rule__BaseExpression__Group_1_1__0__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:913:1: rule__BaseExpression__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__BaseExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:917:1: ( ( '(' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:918:1: ( '(' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:918:1: ( '(' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:919:1: '('
            {
             before(grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,25,FOLLOW_25_in_rule__BaseExpression__Group_1_1__0__Impl1895); 
             after(grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__BaseExpression__Group_1_1__1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:932:1: rule__BaseExpression__Group_1_1__1 : rule__BaseExpression__Group_1_1__1__Impl rule__BaseExpression__Group_1_1__2 ;
    public final void rule__BaseExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:936:1: ( rule__BaseExpression__Group_1_1__1__Impl rule__BaseExpression__Group_1_1__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:937:2: rule__BaseExpression__Group_1_1__1__Impl rule__BaseExpression__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__1__Impl_in_rule__BaseExpression__Group_1_1__11926);
            rule__BaseExpression__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__2_in_rule__BaseExpression__Group_1_1__11929);
            rule__BaseExpression__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_1_1__1"


    // $ANTLR start "rule__BaseExpression__Group_1_1__1__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:944:1: rule__BaseExpression__Group_1_1__1__Impl : ( ( rule__BaseExpression__RootExpressionAssignment_1_1_1 ) ) ;
    public final void rule__BaseExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:948:1: ( ( ( rule__BaseExpression__RootExpressionAssignment_1_1_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:949:1: ( ( rule__BaseExpression__RootExpressionAssignment_1_1_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:949:1: ( ( rule__BaseExpression__RootExpressionAssignment_1_1_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:950:1: ( rule__BaseExpression__RootExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getBaseExpressionAccess().getRootExpressionAssignment_1_1_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:951:1: ( rule__BaseExpression__RootExpressionAssignment_1_1_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:951:2: rule__BaseExpression__RootExpressionAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__BaseExpression__RootExpressionAssignment_1_1_1_in_rule__BaseExpression__Group_1_1__1__Impl1956);
            rule__BaseExpression__RootExpressionAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseExpressionAccess().getRootExpressionAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__BaseExpression__Group_1_1__2"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:961:1: rule__BaseExpression__Group_1_1__2 : rule__BaseExpression__Group_1_1__2__Impl ;
    public final void rule__BaseExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:965:1: ( rule__BaseExpression__Group_1_1__2__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:966:2: rule__BaseExpression__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__2__Impl_in_rule__BaseExpression__Group_1_1__21986);
            rule__BaseExpression__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_1_1__2"


    // $ANTLR start "rule__BaseExpression__Group_1_1__2__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:972:1: rule__BaseExpression__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__BaseExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:976:1: ( ( ')' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:977:1: ( ')' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:977:1: ( ')' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:978:1: ')'
            {
             before(grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_1_1_2()); 
            match(input,26,FOLLOW_26_in_rule__BaseExpression__Group_1_1__2__Impl2014); 
             after(grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__Group_1_1__2__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:997:1: rule__TimeConstraint__Group__0 : rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 ;
    public final void rule__TimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1001:1: ( rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1002:2: rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__0__Impl_in_rule__TimeConstraint__Group__02051);
            rule__TimeConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__1_in_rule__TimeConstraint__Group__02054);
            rule__TimeConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__0"


    // $ANTLR start "rule__TimeConstraint__Group__0__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1009:1: rule__TimeConstraint__Group__0__Impl : ( '@' ) ;
    public final void rule__TimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1013:1: ( ( '@' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1014:1: ( '@' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1014:1: ( '@' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1015:1: '@'
            {
             before(grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__TimeConstraint__Group__0__Impl2082); 
             after(grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__0__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1028:1: rule__TimeConstraint__Group__1 : rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 ;
    public final void rule__TimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1032:1: ( rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1033:2: rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__1__Impl_in_rule__TimeConstraint__Group__12113);
            rule__TimeConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__2_in_rule__TimeConstraint__Group__12116);
            rule__TimeConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__1"


    // $ANTLR start "rule__TimeConstraint__Group__1__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1040:1: rule__TimeConstraint__Group__1__Impl : ( ( rule__TimeConstraint__Event2Assignment_1 ) ) ;
    public final void rule__TimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1044:1: ( ( ( rule__TimeConstraint__Event2Assignment_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1045:1: ( ( rule__TimeConstraint__Event2Assignment_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1045:1: ( ( rule__TimeConstraint__Event2Assignment_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1046:1: ( rule__TimeConstraint__Event2Assignment_1 )
            {
             before(grammarAccess.getTimeConstraintAccess().getEvent2Assignment_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1047:1: ( rule__TimeConstraint__Event2Assignment_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1047:2: rule__TimeConstraint__Event2Assignment_1
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Event2Assignment_1_in_rule__TimeConstraint__Group__1__Impl2143);
            rule__TimeConstraint__Event2Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getEvent2Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__1__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__2"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1057:1: rule__TimeConstraint__Group__2 : rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3 ;
    public final void rule__TimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1061:1: ( rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1062:2: rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__2__Impl_in_rule__TimeConstraint__Group__22173);
            rule__TimeConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__3_in_rule__TimeConstraint__Group__22176);
            rule__TimeConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__2"


    // $ANTLR start "rule__TimeConstraint__Group__2__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1069:1: rule__TimeConstraint__Group__2__Impl : ( '-' ) ;
    public final void rule__TimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1073:1: ( ( '-' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1074:1: ( '-' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1074:1: ( '-' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1075:1: '-'
            {
             before(grammarAccess.getTimeConstraintAccess().getHyphenMinusKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__TimeConstraint__Group__2__Impl2204); 
             after(grammarAccess.getTimeConstraintAccess().getHyphenMinusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__2__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__3"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1088:1: rule__TimeConstraint__Group__3 : rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4 ;
    public final void rule__TimeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1092:1: ( rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1093:2: rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__3__Impl_in_rule__TimeConstraint__Group__32235);
            rule__TimeConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__4_in_rule__TimeConstraint__Group__32238);
            rule__TimeConstraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__3"


    // $ANTLR start "rule__TimeConstraint__Group__3__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1100:1: rule__TimeConstraint__Group__3__Impl : ( '@' ) ;
    public final void rule__TimeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1104:1: ( ( '@' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1105:1: ( '@' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1105:1: ( '@' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1106:1: '@'
            {
             before(grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__TimeConstraint__Group__3__Impl2266); 
             after(grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__3__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__4"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1119:1: rule__TimeConstraint__Group__4 : rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5 ;
    public final void rule__TimeConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1123:1: ( rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1124:2: rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__4__Impl_in_rule__TimeConstraint__Group__42297);
            rule__TimeConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__5_in_rule__TimeConstraint__Group__42300);
            rule__TimeConstraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__4"


    // $ANTLR start "rule__TimeConstraint__Group__4__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1131:1: rule__TimeConstraint__Group__4__Impl : ( ( rule__TimeConstraint__Event1Assignment_4 ) ) ;
    public final void rule__TimeConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1135:1: ( ( ( rule__TimeConstraint__Event1Assignment_4 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1136:1: ( ( rule__TimeConstraint__Event1Assignment_4 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1136:1: ( ( rule__TimeConstraint__Event1Assignment_4 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1137:1: ( rule__TimeConstraint__Event1Assignment_4 )
            {
             before(grammarAccess.getTimeConstraintAccess().getEvent1Assignment_4()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1138:1: ( rule__TimeConstraint__Event1Assignment_4 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1138:2: rule__TimeConstraint__Event1Assignment_4
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Event1Assignment_4_in_rule__TimeConstraint__Group__4__Impl2327);
            rule__TimeConstraint__Event1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getEvent1Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__4__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__5"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1148:1: rule__TimeConstraint__Group__5 : rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6 ;
    public final void rule__TimeConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1152:1: ( rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1153:2: rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__5__Impl_in_rule__TimeConstraint__Group__52357);
            rule__TimeConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__6_in_rule__TimeConstraint__Group__52360);
            rule__TimeConstraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__5"


    // $ANTLR start "rule__TimeConstraint__Group__5__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1160:1: rule__TimeConstraint__Group__5__Impl : ( ( rule__TimeConstraint__OpAssignment_5 ) ) ;
    public final void rule__TimeConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1164:1: ( ( ( rule__TimeConstraint__OpAssignment_5 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1165:1: ( ( rule__TimeConstraint__OpAssignment_5 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1165:1: ( ( rule__TimeConstraint__OpAssignment_5 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1166:1: ( rule__TimeConstraint__OpAssignment_5 )
            {
             before(grammarAccess.getTimeConstraintAccess().getOpAssignment_5()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1167:1: ( rule__TimeConstraint__OpAssignment_5 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1167:2: rule__TimeConstraint__OpAssignment_5
            {
            pushFollow(FOLLOW_rule__TimeConstraint__OpAssignment_5_in_rule__TimeConstraint__Group__5__Impl2387);
            rule__TimeConstraint__OpAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getOpAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__5__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__6"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1177:1: rule__TimeConstraint__Group__6 : rule__TimeConstraint__Group__6__Impl ;
    public final void rule__TimeConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1181:1: ( rule__TimeConstraint__Group__6__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1182:2: rule__TimeConstraint__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__6__Impl_in_rule__TimeConstraint__Group__62417);
            rule__TimeConstraint__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__6"


    // $ANTLR start "rule__TimeConstraint__Group__6__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1188:1: rule__TimeConstraint__Group__6__Impl : ( ( rule__TimeConstraint__ValueAssignment_6 ) ) ;
    public final void rule__TimeConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1192:1: ( ( ( rule__TimeConstraint__ValueAssignment_6 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1193:1: ( ( rule__TimeConstraint__ValueAssignment_6 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1193:1: ( ( rule__TimeConstraint__ValueAssignment_6 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1194:1: ( rule__TimeConstraint__ValueAssignment_6 )
            {
             before(grammarAccess.getTimeConstraintAccess().getValueAssignment_6()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1195:1: ( rule__TimeConstraint__ValueAssignment_6 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1195:2: rule__TimeConstraint__ValueAssignment_6
            {
            pushFollow(FOLLOW_rule__TimeConstraint__ValueAssignment_6_in_rule__TimeConstraint__Group__6__Impl2444);
            rule__TimeConstraint__ValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getValueAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__6__Impl"


    // $ANTLR start "rule__VariableCondition__Group__0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1219:1: rule__VariableCondition__Group__0 : rule__VariableCondition__Group__0__Impl rule__VariableCondition__Group__1 ;
    public final void rule__VariableCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1223:1: ( rule__VariableCondition__Group__0__Impl rule__VariableCondition__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1224:2: rule__VariableCondition__Group__0__Impl rule__VariableCondition__Group__1
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__0__Impl_in_rule__VariableCondition__Group__02488);
            rule__VariableCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableCondition__Group__1_in_rule__VariableCondition__Group__02491);
            rule__VariableCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCondition__Group__0"


    // $ANTLR start "rule__VariableCondition__Group__0__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1231:1: rule__VariableCondition__Group__0__Impl : ( '{' ) ;
    public final void rule__VariableCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1235:1: ( ( '{' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1236:1: ( '{' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1236:1: ( '{' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1237:1: '{'
            {
             before(grammarAccess.getVariableConditionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__VariableCondition__Group__0__Impl2519); 
             after(grammarAccess.getVariableConditionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCondition__Group__0__Impl"


    // $ANTLR start "rule__VariableCondition__Group__1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1250:1: rule__VariableCondition__Group__1 : rule__VariableCondition__Group__1__Impl rule__VariableCondition__Group__2 ;
    public final void rule__VariableCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1254:1: ( rule__VariableCondition__Group__1__Impl rule__VariableCondition__Group__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1255:2: rule__VariableCondition__Group__1__Impl rule__VariableCondition__Group__2
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__1__Impl_in_rule__VariableCondition__Group__12550);
            rule__VariableCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableCondition__Group__2_in_rule__VariableCondition__Group__12553);
            rule__VariableCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCondition__Group__1"


    // $ANTLR start "rule__VariableCondition__Group__1__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1262:1: rule__VariableCondition__Group__1__Impl : ( ( rule__VariableCondition__Expression_leftAssignment_1 ) ) ;
    public final void rule__VariableCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1266:1: ( ( ( rule__VariableCondition__Expression_leftAssignment_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1267:1: ( ( rule__VariableCondition__Expression_leftAssignment_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1267:1: ( ( rule__VariableCondition__Expression_leftAssignment_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1268:1: ( rule__VariableCondition__Expression_leftAssignment_1 )
            {
             before(grammarAccess.getVariableConditionAccess().getExpression_leftAssignment_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1269:1: ( rule__VariableCondition__Expression_leftAssignment_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1269:2: rule__VariableCondition__Expression_leftAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableCondition__Expression_leftAssignment_1_in_rule__VariableCondition__Group__1__Impl2580);
            rule__VariableCondition__Expression_leftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableConditionAccess().getExpression_leftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCondition__Group__1__Impl"


    // $ANTLR start "rule__VariableCondition__Group__2"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1279:1: rule__VariableCondition__Group__2 : rule__VariableCondition__Group__2__Impl rule__VariableCondition__Group__3 ;
    public final void rule__VariableCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1283:1: ( rule__VariableCondition__Group__2__Impl rule__VariableCondition__Group__3 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1284:2: rule__VariableCondition__Group__2__Impl rule__VariableCondition__Group__3
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__2__Impl_in_rule__VariableCondition__Group__22610);
            rule__VariableCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableCondition__Group__3_in_rule__VariableCondition__Group__22613);
            rule__VariableCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCondition__Group__2"


    // $ANTLR start "rule__VariableCondition__Group__2__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1291:1: rule__VariableCondition__Group__2__Impl : ( ( rule__VariableCondition__RelationAssignment_2 ) ) ;
    public final void rule__VariableCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1295:1: ( ( ( rule__VariableCondition__RelationAssignment_2 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1296:1: ( ( rule__VariableCondition__RelationAssignment_2 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1296:1: ( ( rule__VariableCondition__RelationAssignment_2 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1297:1: ( rule__VariableCondition__RelationAssignment_2 )
            {
             before(grammarAccess.getVariableConditionAccess().getRelationAssignment_2()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1298:1: ( rule__VariableCondition__RelationAssignment_2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1298:2: rule__VariableCondition__RelationAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableCondition__RelationAssignment_2_in_rule__VariableCondition__Group__2__Impl2640);
            rule__VariableCondition__RelationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableConditionAccess().getRelationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCondition__Group__2__Impl"


    // $ANTLR start "rule__VariableCondition__Group__3"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1308:1: rule__VariableCondition__Group__3 : rule__VariableCondition__Group__3__Impl rule__VariableCondition__Group__4 ;
    public final void rule__VariableCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1312:1: ( rule__VariableCondition__Group__3__Impl rule__VariableCondition__Group__4 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1313:2: rule__VariableCondition__Group__3__Impl rule__VariableCondition__Group__4
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__3__Impl_in_rule__VariableCondition__Group__32670);
            rule__VariableCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableCondition__Group__4_in_rule__VariableCondition__Group__32673);
            rule__VariableCondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCondition__Group__3"


    // $ANTLR start "rule__VariableCondition__Group__3__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1320:1: rule__VariableCondition__Group__3__Impl : ( ( rule__VariableCondition__Expression_rightAssignment_3 ) ) ;
    public final void rule__VariableCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1324:1: ( ( ( rule__VariableCondition__Expression_rightAssignment_3 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1325:1: ( ( rule__VariableCondition__Expression_rightAssignment_3 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1325:1: ( ( rule__VariableCondition__Expression_rightAssignment_3 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1326:1: ( rule__VariableCondition__Expression_rightAssignment_3 )
            {
             before(grammarAccess.getVariableConditionAccess().getExpression_rightAssignment_3()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1327:1: ( rule__VariableCondition__Expression_rightAssignment_3 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1327:2: rule__VariableCondition__Expression_rightAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableCondition__Expression_rightAssignment_3_in_rule__VariableCondition__Group__3__Impl2700);
            rule__VariableCondition__Expression_rightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableConditionAccess().getExpression_rightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCondition__Group__3__Impl"


    // $ANTLR start "rule__VariableCondition__Group__4"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1337:1: rule__VariableCondition__Group__4 : rule__VariableCondition__Group__4__Impl ;
    public final void rule__VariableCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1341:1: ( rule__VariableCondition__Group__4__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1342:2: rule__VariableCondition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__4__Impl_in_rule__VariableCondition__Group__42730);
            rule__VariableCondition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCondition__Group__4"


    // $ANTLR start "rule__VariableCondition__Group__4__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1348:1: rule__VariableCondition__Group__4__Impl : ( '}' ) ;
    public final void rule__VariableCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1352:1: ( ( '}' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1353:1: ( '}' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1353:1: ( '}' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1354:1: '}'
            {
             before(grammarAccess.getVariableConditionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__VariableCondition__Group__4__Impl2758); 
             after(grammarAccess.getVariableConditionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCondition__Group__4__Impl"


    // $ANTLR start "rule__EXPRESSION__Group_0__0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1377:1: rule__EXPRESSION__Group_0__0 : rule__EXPRESSION__Group_0__0__Impl rule__EXPRESSION__Group_0__1 ;
    public final void rule__EXPRESSION__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1381:1: ( rule__EXPRESSION__Group_0__0__Impl rule__EXPRESSION__Group_0__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1382:2: rule__EXPRESSION__Group_0__0__Impl rule__EXPRESSION__Group_0__1
            {
            pushFollow(FOLLOW_rule__EXPRESSION__Group_0__0__Impl_in_rule__EXPRESSION__Group_0__02799);
            rule__EXPRESSION__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EXPRESSION__Group_0__1_in_rule__EXPRESSION__Group_0__02802);
            rule__EXPRESSION__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group_0__0"


    // $ANTLR start "rule__EXPRESSION__Group_0__0__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1389:1: rule__EXPRESSION__Group_0__0__Impl : ( ( rule__EXPRESSION__FirstTermAssignment_0_0 ) ) ;
    public final void rule__EXPRESSION__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1393:1: ( ( ( rule__EXPRESSION__FirstTermAssignment_0_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1394:1: ( ( rule__EXPRESSION__FirstTermAssignment_0_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1394:1: ( ( rule__EXPRESSION__FirstTermAssignment_0_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1395:1: ( rule__EXPRESSION__FirstTermAssignment_0_0 )
            {
             before(grammarAccess.getEXPRESSIONAccess().getFirstTermAssignment_0_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1396:1: ( rule__EXPRESSION__FirstTermAssignment_0_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1396:2: rule__EXPRESSION__FirstTermAssignment_0_0
            {
            pushFollow(FOLLOW_rule__EXPRESSION__FirstTermAssignment_0_0_in_rule__EXPRESSION__Group_0__0__Impl2829);
            rule__EXPRESSION__FirstTermAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEXPRESSIONAccess().getFirstTermAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group_0__0__Impl"


    // $ANTLR start "rule__EXPRESSION__Group_0__1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1406:1: rule__EXPRESSION__Group_0__1 : rule__EXPRESSION__Group_0__1__Impl rule__EXPRESSION__Group_0__2 ;
    public final void rule__EXPRESSION__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1410:1: ( rule__EXPRESSION__Group_0__1__Impl rule__EXPRESSION__Group_0__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1411:2: rule__EXPRESSION__Group_0__1__Impl rule__EXPRESSION__Group_0__2
            {
            pushFollow(FOLLOW_rule__EXPRESSION__Group_0__1__Impl_in_rule__EXPRESSION__Group_0__12859);
            rule__EXPRESSION__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EXPRESSION__Group_0__2_in_rule__EXPRESSION__Group_0__12862);
            rule__EXPRESSION__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group_0__1"


    // $ANTLR start "rule__EXPRESSION__Group_0__1__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1418:1: rule__EXPRESSION__Group_0__1__Impl : ( ( rule__EXPRESSION__OperatorAssignment_0_1 ) ) ;
    public final void rule__EXPRESSION__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1422:1: ( ( ( rule__EXPRESSION__OperatorAssignment_0_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1423:1: ( ( rule__EXPRESSION__OperatorAssignment_0_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1423:1: ( ( rule__EXPRESSION__OperatorAssignment_0_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1424:1: ( rule__EXPRESSION__OperatorAssignment_0_1 )
            {
             before(grammarAccess.getEXPRESSIONAccess().getOperatorAssignment_0_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1425:1: ( rule__EXPRESSION__OperatorAssignment_0_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1425:2: rule__EXPRESSION__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EXPRESSION__OperatorAssignment_0_1_in_rule__EXPRESSION__Group_0__1__Impl2889);
            rule__EXPRESSION__OperatorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEXPRESSIONAccess().getOperatorAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group_0__1__Impl"


    // $ANTLR start "rule__EXPRESSION__Group_0__2"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1435:1: rule__EXPRESSION__Group_0__2 : rule__EXPRESSION__Group_0__2__Impl ;
    public final void rule__EXPRESSION__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1439:1: ( rule__EXPRESSION__Group_0__2__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1440:2: rule__EXPRESSION__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EXPRESSION__Group_0__2__Impl_in_rule__EXPRESSION__Group_0__22919);
            rule__EXPRESSION__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group_0__2"


    // $ANTLR start "rule__EXPRESSION__Group_0__2__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1446:1: rule__EXPRESSION__Group_0__2__Impl : ( ( rule__EXPRESSION__SecondTermAssignment_0_2 ) ) ;
    public final void rule__EXPRESSION__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1450:1: ( ( ( rule__EXPRESSION__SecondTermAssignment_0_2 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1451:1: ( ( rule__EXPRESSION__SecondTermAssignment_0_2 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1451:1: ( ( rule__EXPRESSION__SecondTermAssignment_0_2 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1452:1: ( rule__EXPRESSION__SecondTermAssignment_0_2 )
            {
             before(grammarAccess.getEXPRESSIONAccess().getSecondTermAssignment_0_2()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1453:1: ( rule__EXPRESSION__SecondTermAssignment_0_2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1453:2: rule__EXPRESSION__SecondTermAssignment_0_2
            {
            pushFollow(FOLLOW_rule__EXPRESSION__SecondTermAssignment_0_2_in_rule__EXPRESSION__Group_0__2__Impl2946);
            rule__EXPRESSION__SecondTermAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEXPRESSIONAccess().getSecondTermAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__Group_0__2__Impl"


    // $ANTLR start "rule__Event__Group_0__0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1469:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1473:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1474:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
            {
            pushFollow(FOLLOW_rule__Event__Group_0__0__Impl_in_rule__Event__Group_0__02982);
            rule__Event__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_0__1_in_rule__Event__Group_0__02985);
            rule__Event__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__0"


    // $ANTLR start "rule__Event__Group_0__0__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1481:1: rule__Event__Group_0__0__Impl : ( ( rule__Event__EventNameAssignment_0_0 ) ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1485:1: ( ( ( rule__Event__EventNameAssignment_0_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1486:1: ( ( rule__Event__EventNameAssignment_0_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1486:1: ( ( rule__Event__EventNameAssignment_0_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1487:1: ( rule__Event__EventNameAssignment_0_0 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_0_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1488:1: ( rule__Event__EventNameAssignment_0_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1488:2: rule__Event__EventNameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Event__EventNameAssignment_0_0_in_rule__Event__Group_0__0__Impl3012);
            rule__Event__EventNameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__0__Impl"


    // $ANTLR start "rule__Event__Group_0__1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1498:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl rule__Event__Group_0__2 ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1502:1: ( rule__Event__Group_0__1__Impl rule__Event__Group_0__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1503:2: rule__Event__Group_0__1__Impl rule__Event__Group_0__2
            {
            pushFollow(FOLLOW_rule__Event__Group_0__1__Impl_in_rule__Event__Group_0__13042);
            rule__Event__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_0__2_in_rule__Event__Group_0__13045);
            rule__Event__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__1"


    // $ANTLR start "rule__Event__Group_0__1__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1510:1: rule__Event__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1514:1: ( ( '.' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1515:1: ( '.' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1515:1: ( '.' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1516:1: '.'
            {
             before(grammarAccess.getEventAccess().getFullStopKeyword_0_1()); 
            match(input,31,FOLLOW_31_in_rule__Event__Group_0__1__Impl3073); 
             after(grammarAccess.getEventAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__1__Impl"


    // $ANTLR start "rule__Event__Group_0__2"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1529:1: rule__Event__Group_0__2 : rule__Event__Group_0__2__Impl ;
    public final void rule__Event__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1533:1: ( rule__Event__Group_0__2__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1534:2: rule__Event__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_0__2__Impl_in_rule__Event__Group_0__23104);
            rule__Event__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__2"


    // $ANTLR start "rule__Event__Group_0__2__Impl"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1540:1: rule__Event__Group_0__2__Impl : ( ( rule__Event__EventExtensionAssignment_0_2 ) ) ;
    public final void rule__Event__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1544:1: ( ( ( rule__Event__EventExtensionAssignment_0_2 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1545:1: ( ( rule__Event__EventExtensionAssignment_0_2 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1545:1: ( ( rule__Event__EventExtensionAssignment_0_2 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1546:1: ( rule__Event__EventExtensionAssignment_0_2 )
            {
             before(grammarAccess.getEventAccess().getEventExtensionAssignment_0_2()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1547:1: ( rule__Event__EventExtensionAssignment_0_2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1547:2: rule__Event__EventExtensionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Event__EventExtensionAssignment_0_2_in_rule__Event__Group_0__2__Impl3131);
            rule__Event__EventExtensionAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventExtensionAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__2__Impl"


    // $ANTLR start "rule__Model__ExpressionAssignment"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1564:1: rule__Model__ExpressionAssignment : ( ruleOrExpression ) ;
    public final void rule__Model__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1568:1: ( ( ruleOrExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1569:1: ( ruleOrExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1569:1: ( ruleOrExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1570:1: ruleOrExpression
            {
             before(grammarAccess.getModelAccess().getExpressionOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__Model__ExpressionAssignment3172);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExpressionOrExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ExpressionAssignment"


    // $ANTLR start "rule__OrExpression__LeftExpressionAssignment_0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1579:1: rule__OrExpression__LeftExpressionAssignment_0 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__LeftExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1583:1: ( ( ruleAndExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1584:1: ( ruleAndExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1584:1: ( ruleAndExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1585:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getLeftExpressionAndExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__LeftExpressionAssignment_03203);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getLeftExpressionAndExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__LeftExpressionAssignment_0"


    // $ANTLR start "rule__OrExpression__OrAssignment_1_0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1594:1: rule__OrExpression__OrAssignment_1_0 : ( RULE_OR ) ;
    public final void rule__OrExpression__OrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1598:1: ( ( RULE_OR ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1599:1: ( RULE_OR )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1599:1: ( RULE_OR )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1600:1: RULE_OR
            {
             before(grammarAccess.getOrExpressionAccess().getOrORTerminalRuleCall_1_0_0()); 
            match(input,RULE_OR,FOLLOW_RULE_OR_in_rule__OrExpression__OrAssignment_1_03234); 
             after(grammarAccess.getOrExpressionAccess().getOrORTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__OrAssignment_1_0"


    // $ANTLR start "rule__OrExpression__RightExpressionAssignment_1_1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1609:1: rule__OrExpression__RightExpressionAssignment_1_1 : ( ruleOrExpression ) ;
    public final void rule__OrExpression__RightExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1613:1: ( ( ruleOrExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1614:1: ( ruleOrExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1614:1: ( ruleOrExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1615:1: ruleOrExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightExpressionOrExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__OrExpression__RightExpressionAssignment_1_13265);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRightExpressionOrExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RightExpressionAssignment_1_1"


    // $ANTLR start "rule__AndExpression__LeftExpressionAssignment_0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1624:1: rule__AndExpression__LeftExpressionAssignment_0 : ( ruleBaseExpression ) ;
    public final void rule__AndExpression__LeftExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1628:1: ( ( ruleBaseExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1629:1: ( ruleBaseExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1629:1: ( ruleBaseExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1630:1: ruleBaseExpression
            {
             before(grammarAccess.getAndExpressionAccess().getLeftExpressionBaseExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBaseExpression_in_rule__AndExpression__LeftExpressionAssignment_03296);
            ruleBaseExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getLeftExpressionBaseExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__LeftExpressionAssignment_0"


    // $ANTLR start "rule__AndExpression__AndAssignment_1_0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1639:1: rule__AndExpression__AndAssignment_1_0 : ( RULE_AND ) ;
    public final void rule__AndExpression__AndAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1643:1: ( ( RULE_AND ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1644:1: ( RULE_AND )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1644:1: ( RULE_AND )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1645:1: RULE_AND
            {
             before(grammarAccess.getAndExpressionAccess().getAndANDTerminalRuleCall_1_0_0()); 
            match(input,RULE_AND,FOLLOW_RULE_AND_in_rule__AndExpression__AndAssignment_1_03327); 
             after(grammarAccess.getAndExpressionAccess().getAndANDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__AndAssignment_1_0"


    // $ANTLR start "rule__AndExpression__RightExpressionAssignment_1_1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1654:1: rule__AndExpression__RightExpressionAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__AndExpression__RightExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1658:1: ( ( ruleAndExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1659:1: ( ruleAndExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1659:1: ( ruleAndExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1660:1: ruleAndExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightExpressionAndExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__AndExpression__RightExpressionAssignment_1_13358);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightExpressionAndExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RightExpressionAssignment_1_1"


    // $ANTLR start "rule__BaseExpression__NotAssignment_0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1669:1: rule__BaseExpression__NotAssignment_0 : ( RULE_NOT ) ;
    public final void rule__BaseExpression__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1673:1: ( ( RULE_NOT ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1674:1: ( RULE_NOT )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1674:1: ( RULE_NOT )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1675:1: RULE_NOT
            {
             before(grammarAccess.getBaseExpressionAccess().getNotNOTTerminalRuleCall_0_0()); 
            match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rule__BaseExpression__NotAssignment_03389); 
             after(grammarAccess.getBaseExpressionAccess().getNotNOTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__NotAssignment_0"


    // $ANTLR start "rule__BaseExpression__BooleanTermAssignment_1_0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1684:1: rule__BaseExpression__BooleanTermAssignment_1_0 : ( rulebooleanTerm ) ;
    public final void rule__BaseExpression__BooleanTermAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1688:1: ( ( rulebooleanTerm ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1689:1: ( rulebooleanTerm )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1689:1: ( rulebooleanTerm )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1690:1: rulebooleanTerm
            {
             before(grammarAccess.getBaseExpressionAccess().getBooleanTermBooleanTermParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulebooleanTerm_in_rule__BaseExpression__BooleanTermAssignment_1_03420);
            rulebooleanTerm();

            state._fsp--;

             after(grammarAccess.getBaseExpressionAccess().getBooleanTermBooleanTermParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__BooleanTermAssignment_1_0"


    // $ANTLR start "rule__BaseExpression__RootExpressionAssignment_1_1_1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1699:1: rule__BaseExpression__RootExpressionAssignment_1_1_1 : ( ruleOrExpression ) ;
    public final void rule__BaseExpression__RootExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1703:1: ( ( ruleOrExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1704:1: ( ruleOrExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1704:1: ( ruleOrExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1705:1: ruleOrExpression
            {
             before(grammarAccess.getBaseExpressionAccess().getRootExpressionOrExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__BaseExpression__RootExpressionAssignment_1_1_13451);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getBaseExpressionAccess().getRootExpressionOrExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseExpression__RootExpressionAssignment_1_1_1"


    // $ANTLR start "rule__BooleanTerm__TimeConstraintAssignment_0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1714:1: rule__BooleanTerm__TimeConstraintAssignment_0 : ( ruleTimeConstraint ) ;
    public final void rule__BooleanTerm__TimeConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1718:1: ( ( ruleTimeConstraint ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1719:1: ( ruleTimeConstraint )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1719:1: ( ruleTimeConstraint )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1720:1: ruleTimeConstraint
            {
             before(grammarAccess.getBooleanTermAccess().getTimeConstraintTimeConstraintParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTimeConstraint_in_rule__BooleanTerm__TimeConstraintAssignment_03482);
            ruleTimeConstraint();

            state._fsp--;

             after(grammarAccess.getBooleanTermAccess().getTimeConstraintTimeConstraintParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanTerm__TimeConstraintAssignment_0"


    // $ANTLR start "rule__BooleanTerm__BooleanVariableAssignment_1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1729:1: rule__BooleanTerm__BooleanVariableAssignment_1 : ( ruleBooleanVariable ) ;
    public final void rule__BooleanTerm__BooleanVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1733:1: ( ( ruleBooleanVariable ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1734:1: ( ruleBooleanVariable )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1734:1: ( ruleBooleanVariable )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1735:1: ruleBooleanVariable
            {
             before(grammarAccess.getBooleanTermAccess().getBooleanVariableBooleanVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBooleanVariable_in_rule__BooleanTerm__BooleanVariableAssignment_13513);
            ruleBooleanVariable();

            state._fsp--;

             after(grammarAccess.getBooleanTermAccess().getBooleanVariableBooleanVariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanTerm__BooleanVariableAssignment_1"


    // $ANTLR start "rule__BooleanTerm__VariableConditionAssignment_2"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1744:1: rule__BooleanTerm__VariableConditionAssignment_2 : ( ruleVariableCondition ) ;
    public final void rule__BooleanTerm__VariableConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1748:1: ( ( ruleVariableCondition ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1749:1: ( ruleVariableCondition )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1749:1: ( ruleVariableCondition )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1750:1: ruleVariableCondition
            {
             before(grammarAccess.getBooleanTermAccess().getVariableConditionVariableConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariableCondition_in_rule__BooleanTerm__VariableConditionAssignment_23544);
            ruleVariableCondition();

            state._fsp--;

             after(grammarAccess.getBooleanTermAccess().getVariableConditionVariableConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanTerm__VariableConditionAssignment_2"


    // $ANTLR start "rule__TimeConstraint__Event2Assignment_1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1759:1: rule__TimeConstraint__Event2Assignment_1 : ( ruleEvent ) ;
    public final void rule__TimeConstraint__Event2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1763:1: ( ( ruleEvent ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1764:1: ( ruleEvent )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1764:1: ( ruleEvent )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1765:1: ruleEvent
            {
             before(grammarAccess.getTimeConstraintAccess().getEvent2EventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__TimeConstraint__Event2Assignment_13575);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getTimeConstraintAccess().getEvent2EventParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Event2Assignment_1"


    // $ANTLR start "rule__TimeConstraint__Event1Assignment_4"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1774:1: rule__TimeConstraint__Event1Assignment_4 : ( ruleEvent ) ;
    public final void rule__TimeConstraint__Event1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1778:1: ( ( ruleEvent ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1779:1: ( ruleEvent )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1779:1: ( ruleEvent )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1780:1: ruleEvent
            {
             before(grammarAccess.getTimeConstraintAccess().getEvent1EventParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__TimeConstraint__Event1Assignment_43606);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getTimeConstraintAccess().getEvent1EventParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Event1Assignment_4"


    // $ANTLR start "rule__TimeConstraint__OpAssignment_5"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1789:1: rule__TimeConstraint__OpAssignment_5 : ( RULE_RELATIONS ) ;
    public final void rule__TimeConstraint__OpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1793:1: ( ( RULE_RELATIONS ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1794:1: ( RULE_RELATIONS )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1794:1: ( RULE_RELATIONS )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1795:1: RULE_RELATIONS
            {
             before(grammarAccess.getTimeConstraintAccess().getOpRELATIONSTerminalRuleCall_5_0()); 
            match(input,RULE_RELATIONS,FOLLOW_RULE_RELATIONS_in_rule__TimeConstraint__OpAssignment_53637); 
             after(grammarAccess.getTimeConstraintAccess().getOpRELATIONSTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__OpAssignment_5"


    // $ANTLR start "rule__TimeConstraint__ValueAssignment_6"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1804:1: rule__TimeConstraint__ValueAssignment_6 : ( RULE_INT ) ;
    public final void rule__TimeConstraint__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1808:1: ( ( RULE_INT ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1809:1: ( RULE_INT )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1809:1: ( RULE_INT )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1810:1: RULE_INT
            {
             before(grammarAccess.getTimeConstraintAccess().getValueINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TimeConstraint__ValueAssignment_63668); 
             after(grammarAccess.getTimeConstraintAccess().getValueINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__ValueAssignment_6"


    // $ANTLR start "rule__BooleanVariable__VariableAssignment"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1819:1: rule__BooleanVariable__VariableAssignment : ( RULE_ID ) ;
    public final void rule__BooleanVariable__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1823:1: ( ( RULE_ID ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1824:1: ( RULE_ID )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1824:1: ( RULE_ID )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1825:1: RULE_ID
            {
             before(grammarAccess.getBooleanVariableAccess().getVariableIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BooleanVariable__VariableAssignment3699); 
             after(grammarAccess.getBooleanVariableAccess().getVariableIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanVariable__VariableAssignment"


    // $ANTLR start "rule__VariableCondition__Expression_leftAssignment_1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1834:1: rule__VariableCondition__Expression_leftAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__VariableCondition__Expression_leftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1838:1: ( ( ruleEXPRESSION ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1839:1: ( ruleEXPRESSION )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1839:1: ( ruleEXPRESSION )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1840:1: ruleEXPRESSION
            {
             before(grammarAccess.getVariableConditionAccess().getExpression_leftEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__VariableCondition__Expression_leftAssignment_13730);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getVariableConditionAccess().getExpression_leftEXPRESSIONParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCondition__Expression_leftAssignment_1"


    // $ANTLR start "rule__VariableCondition__RelationAssignment_2"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1849:1: rule__VariableCondition__RelationAssignment_2 : ( RULE_RELATIONS ) ;
    public final void rule__VariableCondition__RelationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1853:1: ( ( RULE_RELATIONS ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1854:1: ( RULE_RELATIONS )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1854:1: ( RULE_RELATIONS )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1855:1: RULE_RELATIONS
            {
             before(grammarAccess.getVariableConditionAccess().getRelationRELATIONSTerminalRuleCall_2_0()); 
            match(input,RULE_RELATIONS,FOLLOW_RULE_RELATIONS_in_rule__VariableCondition__RelationAssignment_23761); 
             after(grammarAccess.getVariableConditionAccess().getRelationRELATIONSTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCondition__RelationAssignment_2"


    // $ANTLR start "rule__VariableCondition__Expression_rightAssignment_3"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1864:1: rule__VariableCondition__Expression_rightAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__VariableCondition__Expression_rightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1868:1: ( ( ruleEXPRESSION ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1869:1: ( ruleEXPRESSION )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1869:1: ( ruleEXPRESSION )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1870:1: ruleEXPRESSION
            {
             before(grammarAccess.getVariableConditionAccess().getExpression_rightEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__VariableCondition__Expression_rightAssignment_33792);
            ruleEXPRESSION();

            state._fsp--;

             after(grammarAccess.getVariableConditionAccess().getExpression_rightEXPRESSIONParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCondition__Expression_rightAssignment_3"


    // $ANTLR start "rule__EXPRESSION__FirstTermAssignment_0_0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1879:1: rule__EXPRESSION__FirstTermAssignment_0_0 : ( ruleTERM ) ;
    public final void rule__EXPRESSION__FirstTermAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1883:1: ( ( ruleTERM ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1884:1: ( ruleTERM )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1884:1: ( ruleTERM )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1885:1: ruleTERM
            {
             before(grammarAccess.getEXPRESSIONAccess().getFirstTermTERMParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleTERM_in_rule__EXPRESSION__FirstTermAssignment_0_03823);
            ruleTERM();

            state._fsp--;

             after(grammarAccess.getEXPRESSIONAccess().getFirstTermTERMParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__FirstTermAssignment_0_0"


    // $ANTLR start "rule__EXPRESSION__OperatorAssignment_0_1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1894:1: rule__EXPRESSION__OperatorAssignment_0_1 : ( RULE_OPERATOR ) ;
    public final void rule__EXPRESSION__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1898:1: ( ( RULE_OPERATOR ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1899:1: ( RULE_OPERATOR )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1899:1: ( RULE_OPERATOR )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1900:1: RULE_OPERATOR
            {
             before(grammarAccess.getEXPRESSIONAccess().getOperatorOPERATORTerminalRuleCall_0_1_0()); 
            match(input,RULE_OPERATOR,FOLLOW_RULE_OPERATOR_in_rule__EXPRESSION__OperatorAssignment_0_13854); 
             after(grammarAccess.getEXPRESSIONAccess().getOperatorOPERATORTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__OperatorAssignment_0_1"


    // $ANTLR start "rule__EXPRESSION__SecondTermAssignment_0_2"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1909:1: rule__EXPRESSION__SecondTermAssignment_0_2 : ( ruleTERM ) ;
    public final void rule__EXPRESSION__SecondTermAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1913:1: ( ( ruleTERM ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1914:1: ( ruleTERM )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1914:1: ( ruleTERM )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1915:1: ruleTERM
            {
             before(grammarAccess.getEXPRESSIONAccess().getSecondTermTERMParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleTERM_in_rule__EXPRESSION__SecondTermAssignment_0_23885);
            ruleTERM();

            state._fsp--;

             after(grammarAccess.getEXPRESSIONAccess().getSecondTermTERMParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__SecondTermAssignment_0_2"


    // $ANTLR start "rule__EXPRESSION__AloneAssignment_1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1924:1: rule__EXPRESSION__AloneAssignment_1 : ( ruleTERM ) ;
    public final void rule__EXPRESSION__AloneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1928:1: ( ( ruleTERM ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1929:1: ( ruleTERM )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1929:1: ( ruleTERM )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1930:1: ruleTERM
            {
             before(grammarAccess.getEXPRESSIONAccess().getAloneTERMParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTERM_in_rule__EXPRESSION__AloneAssignment_13916);
            ruleTERM();

            state._fsp--;

             after(grammarAccess.getEXPRESSIONAccess().getAloneTERMParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EXPRESSION__AloneAssignment_1"


    // $ANTLR start "rule__TERM__VariableAssignment_0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1939:1: rule__TERM__VariableAssignment_0 : ( RULE_ID ) ;
    public final void rule__TERM__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1943:1: ( ( RULE_ID ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1944:1: ( RULE_ID )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1944:1: ( RULE_ID )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1945:1: RULE_ID
            {
             before(grammarAccess.getTERMAccess().getVariableIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TERM__VariableAssignment_03947); 
             after(grammarAccess.getTERMAccess().getVariableIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TERM__VariableAssignment_0"


    // $ANTLR start "rule__TERM__ConstantAssignment_1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1954:1: rule__TERM__ConstantAssignment_1 : ( RULE_INT ) ;
    public final void rule__TERM__ConstantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1958:1: ( ( RULE_INT ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1959:1: ( RULE_INT )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1959:1: ( RULE_INT )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1960:1: RULE_INT
            {
             before(grammarAccess.getTERMAccess().getConstantINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TERM__ConstantAssignment_13978); 
             after(grammarAccess.getTERMAccess().getConstantINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TERM__ConstantAssignment_1"


    // $ANTLR start "rule__Event__EventNameAssignment_0_0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1969:1: rule__Event__EventNameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1973:1: ( ( RULE_ID ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1974:1: ( RULE_ID )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1974:1: ( RULE_ID )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1975:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_0_04009); 
             after(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventNameAssignment_0_0"


    // $ANTLR start "rule__Event__EventExtensionAssignment_0_2"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1984:1: rule__Event__EventExtensionAssignment_0_2 : ( ruleEventExtensions ) ;
    public final void rule__Event__EventExtensionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1988:1: ( ( ruleEventExtensions ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1989:1: ( ruleEventExtensions )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1989:1: ( ruleEventExtensions )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1990:1: ruleEventExtensions
            {
             before(grammarAccess.getEventAccess().getEventExtensionEventExtensionsParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleEventExtensions_in_rule__Event__EventExtensionAssignment_0_24040);
            ruleEventExtensions();

            state._fsp--;

             after(grammarAccess.getEventAccess().getEventExtensionEventExtensionsParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventExtensionAssignment_0_2"


    // $ANTLR start "rule__Event__NowEventAssignment_1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1999:1: rule__Event__NowEventAssignment_1 : ( ( 'now' ) ) ;
    public final void rule__Event__NowEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:2003:1: ( ( ( 'now' ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:2004:1: ( ( 'now' ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:2004:1: ( ( 'now' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:2005:1: ( 'now' )
            {
             before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:2006:1: ( 'now' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:2007:1: 'now'
            {
             before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Event__NowEventAssignment_14076); 
             after(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 

            }

             after(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NowEventAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExpressionAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_entryRuleBaseExpression241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseExpression248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group__0_in_ruleBaseExpression274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebooleanTerm_in_entryRulebooleanTerm301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebooleanTerm308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanTerm__Alternatives_in_rulebooleanTerm334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeConstraint_in_entryRuleTimeConstraint361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeConstraint368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__0_in_ruleTimeConstraint394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanVariable_in_entryRuleBooleanVariable421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanVariable428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanVariable__VariableAssignment_in_ruleBooleanVariable454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCondition_in_entryRuleVariableCondition481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableCondition488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__0_in_ruleVariableCondition514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRESSION548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Alternatives_in_ruleEXPRESSION574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTERM_in_entryRuleTERM601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTERM608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TERM__Alternatives_in_ruleTERM634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Alternatives_in_ruleEvent694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_entryRuleEventExtensions721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventExtensions728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExtensions__Alternatives_in_ruleEventExtensions754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__BooleanTermAssignment_1_0_in_rule__BaseExpression__Alternatives_1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__0_in_rule__BaseExpression__Alternatives_1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanTerm__TimeConstraintAssignment_0_in_rule__BooleanTerm__Alternatives841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanTerm__BooleanVariableAssignment_1_in_rule__BooleanTerm__Alternatives859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanTerm__VariableConditionAssignment_2_in_rule__BooleanTerm__Alternatives877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Group_0__0_in_rule__EXPRESSION__Alternatives910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__AloneAssignment_1_in_rule__EXPRESSION__Alternatives928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TERM__VariableAssignment_0_in_rule__TERM__Alternatives961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TERM__ConstantAssignment_1_in_rule__TERM__Alternatives979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__0_in_rule__Event__Alternatives1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NowEventAssignment_1_in_rule__Event__Alternatives1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EventExtensions__Alternatives1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EventExtensions__Alternatives1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EventExtensions__Alternatives1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EventExtensions__Alternatives1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EventExtensions__Alternatives1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EventExtensions__Alternatives1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EventExtensions__Alternatives1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EventExtensions__Alternatives1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EventExtensions__Alternatives1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__01256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__01259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__LeftExpressionAssignment_0_in_rule__OrExpression__Group__0__Impl1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__01378 = new BitSet(new long[]{0x000000002A000240L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__01381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__OrAssignment_1_0_in_rule__OrExpression__Group_1__0__Impl1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__11438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__RightExpressionAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__01499 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__01502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__LeftExpressionAssignment_0_in_rule__AndExpression__Group__0__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__11559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__01621 = new BitSet(new long[]{0x000000002A000240L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__01624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__AndAssignment_1_0_in_rule__AndExpression__Group_1__0__Impl1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__11681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__RightExpressionAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group__0__Impl_in_rule__BaseExpression__Group__01742 = new BitSet(new long[]{0x000000002A000240L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group__1_in_rule__BaseExpression__Group__01745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__NotAssignment_0_in_rule__BaseExpression__Group__0__Impl1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group__1__Impl_in_rule__BaseExpression__Group__11803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Alternatives_1_in_rule__BaseExpression__Group__1__Impl1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__0__Impl_in_rule__BaseExpression__Group_1_1__01864 = new BitSet(new long[]{0x000000002A000240L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__1_in_rule__BaseExpression__Group_1_1__01867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BaseExpression__Group_1_1__0__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__1__Impl_in_rule__BaseExpression__Group_1_1__11926 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__2_in_rule__BaseExpression__Group_1_1__11929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__RootExpressionAssignment_1_1_1_in_rule__BaseExpression__Group_1_1__1__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__2__Impl_in_rule__BaseExpression__Group_1_1__21986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BaseExpression__Group_1_1__2__Impl2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__0__Impl_in_rule__TimeConstraint__Group__02051 = new BitSet(new long[]{0x0000000100000200L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__1_in_rule__TimeConstraint__Group__02054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TimeConstraint__Group__0__Impl2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__1__Impl_in_rule__TimeConstraint__Group__12113 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__2_in_rule__TimeConstraint__Group__12116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Event2Assignment_1_in_rule__TimeConstraint__Group__1__Impl2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__2__Impl_in_rule__TimeConstraint__Group__22173 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__3_in_rule__TimeConstraint__Group__22176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TimeConstraint__Group__2__Impl2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__3__Impl_in_rule__TimeConstraint__Group__32235 = new BitSet(new long[]{0x0000000100000200L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__4_in_rule__TimeConstraint__Group__32238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TimeConstraint__Group__3__Impl2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__4__Impl_in_rule__TimeConstraint__Group__42297 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__5_in_rule__TimeConstraint__Group__42300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Event1Assignment_4_in_rule__TimeConstraint__Group__4__Impl2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__5__Impl_in_rule__TimeConstraint__Group__52357 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__6_in_rule__TimeConstraint__Group__52360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__OpAssignment_5_in_rule__TimeConstraint__Group__5__Impl2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__6__Impl_in_rule__TimeConstraint__Group__62417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__ValueAssignment_6_in_rule__TimeConstraint__Group__6__Impl2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__0__Impl_in_rule__VariableCondition__Group__02488 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__1_in_rule__VariableCondition__Group__02491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VariableCondition__Group__0__Impl2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__1__Impl_in_rule__VariableCondition__Group__12550 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__2_in_rule__VariableCondition__Group__12553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Expression_leftAssignment_1_in_rule__VariableCondition__Group__1__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__2__Impl_in_rule__VariableCondition__Group__22610 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__3_in_rule__VariableCondition__Group__22613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__RelationAssignment_2_in_rule__VariableCondition__Group__2__Impl2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__3__Impl_in_rule__VariableCondition__Group__32670 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__4_in_rule__VariableCondition__Group__32673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Expression_rightAssignment_3_in_rule__VariableCondition__Group__3__Impl2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__4__Impl_in_rule__VariableCondition__Group__42730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VariableCondition__Group__4__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Group_0__0__Impl_in_rule__EXPRESSION__Group_0__02799 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Group_0__1_in_rule__EXPRESSION__Group_0__02802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__FirstTermAssignment_0_0_in_rule__EXPRESSION__Group_0__0__Impl2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Group_0__1__Impl_in_rule__EXPRESSION__Group_0__12859 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Group_0__2_in_rule__EXPRESSION__Group_0__12862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__OperatorAssignment_0_1_in_rule__EXPRESSION__Group_0__1__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Group_0__2__Impl_in_rule__EXPRESSION__Group_0__22919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__SecondTermAssignment_0_2_in_rule__EXPRESSION__Group_0__2__Impl2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__0__Impl_in_rule__Event__Group_0__02982 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Event__Group_0__1_in_rule__Event__Group_0__02985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventNameAssignment_0_0_in_rule__Event__Group_0__0__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__1__Impl_in_rule__Event__Group_0__13042 = new BitSet(new long[]{0x0000000001FF0000L});
    public static final BitSet FOLLOW_rule__Event__Group_0__2_in_rule__Event__Group_0__13045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Event__Group_0__1__Impl3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__2__Impl_in_rule__Event__Group_0__23104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventExtensionAssignment_0_2_in_rule__Event__Group_0__2__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__Model__ExpressionAssignment3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__LeftExpressionAssignment_03203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_rule__OrExpression__OrAssignment_1_03234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__OrExpression__RightExpressionAssignment_1_13265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_rule__AndExpression__LeftExpressionAssignment_03296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_in_rule__AndExpression__AndAssignment_1_03327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__AndExpression__RightExpressionAssignment_1_13358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_rule__BaseExpression__NotAssignment_03389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebooleanTerm_in_rule__BaseExpression__BooleanTermAssignment_1_03420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__BaseExpression__RootExpressionAssignment_1_1_13451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeConstraint_in_rule__BooleanTerm__TimeConstraintAssignment_03482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanVariable_in_rule__BooleanTerm__BooleanVariableAssignment_13513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCondition_in_rule__BooleanTerm__VariableConditionAssignment_23544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__TimeConstraint__Event2Assignment_13575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__TimeConstraint__Event1Assignment_43606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONS_in_rule__TimeConstraint__OpAssignment_53637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TimeConstraint__ValueAssignment_63668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanVariable__VariableAssignment3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__VariableCondition__Expression_leftAssignment_13730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONS_in_rule__VariableCondition__RelationAssignment_23761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__VariableCondition__Expression_rightAssignment_33792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTERM_in_rule__EXPRESSION__FirstTermAssignment_0_03823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_in_rule__EXPRESSION__OperatorAssignment_0_13854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTERM_in_rule__EXPRESSION__SecondTermAssignment_0_23885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTERM_in_rule__EXPRESSION__AloneAssignment_13916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TERM__VariableAssignment_03947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TERM__ConstantAssignment_13978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_0_04009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_rule__Event__EventExtensionAssignment_0_24040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Event__NowEventAssignment_14076 = new BitSet(new long[]{0x0000000000000002L});

}