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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OR", "RULE_AND", "RULE_NOT", "RULE_RELATIONS", "RULE_INT", "RULE_ID", "RULE_OPERATOR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'exit'", "'enter'", "'start'", "'end'", "'tick'", "'sig'", "'call'", "'send'", "'receive'", "'reply'", "'('", "')'", "'@'", "'-'", "'{'", "'}'", "'.'", "'now'"
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
    public static final int T__33=33;
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

            if ( (LA1_0==RULE_ID||LA1_0==28||LA1_0==30) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
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
            case 28:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case 30:
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

                if ( (LA3_1==EOF||LA3_1==RULE_RELATIONS||LA3_1==31) ) {
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

                if ( (LA3_2==EOF||LA3_2==RULE_RELATIONS||LA3_2==31) ) {
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
            else if ( (LA5_0==33) ) {
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:512:1: rule__EventExtensions__Alternatives : ( ( 'exit' ) | ( 'enter' ) | ( 'start' ) | ( 'end' ) | ( 'tick' ) | ( 'sig' ) | ( 'call' ) | ( 'send' ) | ( 'receive' ) | ( 'reply' ) );
    public final void rule__EventExtensions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:516:1: ( ( 'exit' ) | ( 'enter' ) | ( 'start' ) | ( 'end' ) | ( 'tick' ) | ( 'sig' ) | ( 'call' ) | ( 'send' ) | ( 'receive' ) | ( 'reply' ) )
            int alt6=10;
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
            case 25:
                {
                alt6=10;
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
                case 10 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:589:6: ( 'reply' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:589:6: ( 'reply' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:590:1: 'reply'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getReplyKeyword_9()); 
                    match(input,25,FOLLOW_25_in_rule__EventExtensions__Alternatives1244); 
                     after(grammarAccess.getEventExtensionsAccess().getReplyKeyword_9()); 

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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:604:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:608:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:609:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__01276);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__01279);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:616:1: rule__OrExpression__Group__0__Impl : ( ( rule__OrExpression__LeftExpressionAssignment_0 ) ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:620:1: ( ( ( rule__OrExpression__LeftExpressionAssignment_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:621:1: ( ( rule__OrExpression__LeftExpressionAssignment_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:621:1: ( ( rule__OrExpression__LeftExpressionAssignment_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:622:1: ( rule__OrExpression__LeftExpressionAssignment_0 )
            {
             before(grammarAccess.getOrExpressionAccess().getLeftExpressionAssignment_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:623:1: ( rule__OrExpression__LeftExpressionAssignment_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:623:2: rule__OrExpression__LeftExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__OrExpression__LeftExpressionAssignment_0_in_rule__OrExpression__Group__0__Impl1306);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:633:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:637:1: ( rule__OrExpression__Group__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:638:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__11336);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:644:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )? ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:648:1: ( ( ( rule__OrExpression__Group_1__0 )? ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:649:1: ( ( rule__OrExpression__Group_1__0 )? )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:649:1: ( ( rule__OrExpression__Group_1__0 )? )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:650:1: ( rule__OrExpression__Group_1__0 )?
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:651:1: ( rule__OrExpression__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_OR) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:651:2: rule__OrExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl1363);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:665:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:669:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:670:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__01398);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__01401);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:677:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__OrAssignment_1_0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:681:1: ( ( ( rule__OrExpression__OrAssignment_1_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:682:1: ( ( rule__OrExpression__OrAssignment_1_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:682:1: ( ( rule__OrExpression__OrAssignment_1_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:683:1: ( rule__OrExpression__OrAssignment_1_0 )
            {
             before(grammarAccess.getOrExpressionAccess().getOrAssignment_1_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:684:1: ( rule__OrExpression__OrAssignment_1_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:684:2: rule__OrExpression__OrAssignment_1_0
            {
            pushFollow(FOLLOW_rule__OrExpression__OrAssignment_1_0_in_rule__OrExpression__Group_1__0__Impl1428);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:694:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:698:1: ( rule__OrExpression__Group_1__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:699:2: rule__OrExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__11458);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:705:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightExpressionAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:709:1: ( ( ( rule__OrExpression__RightExpressionAssignment_1_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:710:1: ( ( rule__OrExpression__RightExpressionAssignment_1_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:710:1: ( ( rule__OrExpression__RightExpressionAssignment_1_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:711:1: ( rule__OrExpression__RightExpressionAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightExpressionAssignment_1_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:712:1: ( rule__OrExpression__RightExpressionAssignment_1_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:712:2: rule__OrExpression__RightExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExpression__RightExpressionAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl1485);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:726:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:730:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:731:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__01519);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__01522);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:738:1: rule__AndExpression__Group__0__Impl : ( ( rule__AndExpression__LeftExpressionAssignment_0 ) ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:742:1: ( ( ( rule__AndExpression__LeftExpressionAssignment_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:743:1: ( ( rule__AndExpression__LeftExpressionAssignment_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:743:1: ( ( rule__AndExpression__LeftExpressionAssignment_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:744:1: ( rule__AndExpression__LeftExpressionAssignment_0 )
            {
             before(grammarAccess.getAndExpressionAccess().getLeftExpressionAssignment_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:745:1: ( rule__AndExpression__LeftExpressionAssignment_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:745:2: rule__AndExpression__LeftExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__AndExpression__LeftExpressionAssignment_0_in_rule__AndExpression__Group__0__Impl1549);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:755:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:759:1: ( rule__AndExpression__Group__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:760:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__11579);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:766:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )? ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:770:1: ( ( ( rule__AndExpression__Group_1__0 )? ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:771:1: ( ( rule__AndExpression__Group_1__0 )? )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:771:1: ( ( rule__AndExpression__Group_1__0 )? )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:772:1: ( rule__AndExpression__Group_1__0 )?
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:773:1: ( rule__AndExpression__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_AND) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:773:2: rule__AndExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl1606);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:787:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:791:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:792:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__01641);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__01644);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:799:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__AndAssignment_1_0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:803:1: ( ( ( rule__AndExpression__AndAssignment_1_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:804:1: ( ( rule__AndExpression__AndAssignment_1_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:804:1: ( ( rule__AndExpression__AndAssignment_1_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:805:1: ( rule__AndExpression__AndAssignment_1_0 )
            {
             before(grammarAccess.getAndExpressionAccess().getAndAssignment_1_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:806:1: ( rule__AndExpression__AndAssignment_1_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:806:2: rule__AndExpression__AndAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AndExpression__AndAssignment_1_0_in_rule__AndExpression__Group_1__0__Impl1671);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:816:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:820:1: ( rule__AndExpression__Group_1__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:821:2: rule__AndExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__11701);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:827:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightExpressionAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:831:1: ( ( ( rule__AndExpression__RightExpressionAssignment_1_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:832:1: ( ( rule__AndExpression__RightExpressionAssignment_1_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:832:1: ( ( rule__AndExpression__RightExpressionAssignment_1_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:833:1: ( rule__AndExpression__RightExpressionAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightExpressionAssignment_1_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:834:1: ( rule__AndExpression__RightExpressionAssignment_1_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:834:2: rule__AndExpression__RightExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__RightExpressionAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl1728);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:848:1: rule__BaseExpression__Group__0 : rule__BaseExpression__Group__0__Impl rule__BaseExpression__Group__1 ;
    public final void rule__BaseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:852:1: ( rule__BaseExpression__Group__0__Impl rule__BaseExpression__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:853:2: rule__BaseExpression__Group__0__Impl rule__BaseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group__0__Impl_in_rule__BaseExpression__Group__01762);
            rule__BaseExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseExpression__Group__1_in_rule__BaseExpression__Group__01765);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:860:1: rule__BaseExpression__Group__0__Impl : ( ( rule__BaseExpression__NotAssignment_0 )? ) ;
    public final void rule__BaseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:864:1: ( ( ( rule__BaseExpression__NotAssignment_0 )? ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:865:1: ( ( rule__BaseExpression__NotAssignment_0 )? )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:865:1: ( ( rule__BaseExpression__NotAssignment_0 )? )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:866:1: ( rule__BaseExpression__NotAssignment_0 )?
            {
             before(grammarAccess.getBaseExpressionAccess().getNotAssignment_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:867:1: ( rule__BaseExpression__NotAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_NOT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:867:2: rule__BaseExpression__NotAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BaseExpression__NotAssignment_0_in_rule__BaseExpression__Group__0__Impl1792);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:877:1: rule__BaseExpression__Group__1 : rule__BaseExpression__Group__1__Impl ;
    public final void rule__BaseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:881:1: ( rule__BaseExpression__Group__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:882:2: rule__BaseExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group__1__Impl_in_rule__BaseExpression__Group__11823);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:888:1: rule__BaseExpression__Group__1__Impl : ( ( rule__BaseExpression__Alternatives_1 ) ) ;
    public final void rule__BaseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:892:1: ( ( ( rule__BaseExpression__Alternatives_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:893:1: ( ( rule__BaseExpression__Alternatives_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:893:1: ( ( rule__BaseExpression__Alternatives_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:894:1: ( rule__BaseExpression__Alternatives_1 )
            {
             before(grammarAccess.getBaseExpressionAccess().getAlternatives_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:895:1: ( rule__BaseExpression__Alternatives_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:895:2: rule__BaseExpression__Alternatives_1
            {
            pushFollow(FOLLOW_rule__BaseExpression__Alternatives_1_in_rule__BaseExpression__Group__1__Impl1850);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:909:1: rule__BaseExpression__Group_1_1__0 : rule__BaseExpression__Group_1_1__0__Impl rule__BaseExpression__Group_1_1__1 ;
    public final void rule__BaseExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:913:1: ( rule__BaseExpression__Group_1_1__0__Impl rule__BaseExpression__Group_1_1__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:914:2: rule__BaseExpression__Group_1_1__0__Impl rule__BaseExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__0__Impl_in_rule__BaseExpression__Group_1_1__01884);
            rule__BaseExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__1_in_rule__BaseExpression__Group_1_1__01887);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:921:1: rule__BaseExpression__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__BaseExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:925:1: ( ( '(' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:926:1: ( '(' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:926:1: ( '(' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:927:1: '('
            {
             before(grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,26,FOLLOW_26_in_rule__BaseExpression__Group_1_1__0__Impl1915); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:940:1: rule__BaseExpression__Group_1_1__1 : rule__BaseExpression__Group_1_1__1__Impl rule__BaseExpression__Group_1_1__2 ;
    public final void rule__BaseExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:944:1: ( rule__BaseExpression__Group_1_1__1__Impl rule__BaseExpression__Group_1_1__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:945:2: rule__BaseExpression__Group_1_1__1__Impl rule__BaseExpression__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__1__Impl_in_rule__BaseExpression__Group_1_1__11946);
            rule__BaseExpression__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__2_in_rule__BaseExpression__Group_1_1__11949);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:952:1: rule__BaseExpression__Group_1_1__1__Impl : ( ( rule__BaseExpression__RootExpressionAssignment_1_1_1 ) ) ;
    public final void rule__BaseExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:956:1: ( ( ( rule__BaseExpression__RootExpressionAssignment_1_1_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:957:1: ( ( rule__BaseExpression__RootExpressionAssignment_1_1_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:957:1: ( ( rule__BaseExpression__RootExpressionAssignment_1_1_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:958:1: ( rule__BaseExpression__RootExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getBaseExpressionAccess().getRootExpressionAssignment_1_1_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:959:1: ( rule__BaseExpression__RootExpressionAssignment_1_1_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:959:2: rule__BaseExpression__RootExpressionAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__BaseExpression__RootExpressionAssignment_1_1_1_in_rule__BaseExpression__Group_1_1__1__Impl1976);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:969:1: rule__BaseExpression__Group_1_1__2 : rule__BaseExpression__Group_1_1__2__Impl ;
    public final void rule__BaseExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:973:1: ( rule__BaseExpression__Group_1_1__2__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:974:2: rule__BaseExpression__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__2__Impl_in_rule__BaseExpression__Group_1_1__22006);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:980:1: rule__BaseExpression__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__BaseExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:984:1: ( ( ')' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:985:1: ( ')' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:985:1: ( ')' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:986:1: ')'
            {
             before(grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_1_1_2()); 
            match(input,27,FOLLOW_27_in_rule__BaseExpression__Group_1_1__2__Impl2034); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1005:1: rule__TimeConstraint__Group__0 : rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 ;
    public final void rule__TimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1009:1: ( rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1010:2: rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__0__Impl_in_rule__TimeConstraint__Group__02071);
            rule__TimeConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__1_in_rule__TimeConstraint__Group__02074);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1017:1: rule__TimeConstraint__Group__0__Impl : ( '@' ) ;
    public final void rule__TimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1021:1: ( ( '@' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1022:1: ( '@' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1022:1: ( '@' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1023:1: '@'
            {
             before(grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__TimeConstraint__Group__0__Impl2102); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1036:1: rule__TimeConstraint__Group__1 : rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 ;
    public final void rule__TimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1040:1: ( rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1041:2: rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__1__Impl_in_rule__TimeConstraint__Group__12133);
            rule__TimeConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__2_in_rule__TimeConstraint__Group__12136);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1048:1: rule__TimeConstraint__Group__1__Impl : ( ( rule__TimeConstraint__Event2Assignment_1 ) ) ;
    public final void rule__TimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1052:1: ( ( ( rule__TimeConstraint__Event2Assignment_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1053:1: ( ( rule__TimeConstraint__Event2Assignment_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1053:1: ( ( rule__TimeConstraint__Event2Assignment_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1054:1: ( rule__TimeConstraint__Event2Assignment_1 )
            {
             before(grammarAccess.getTimeConstraintAccess().getEvent2Assignment_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1055:1: ( rule__TimeConstraint__Event2Assignment_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1055:2: rule__TimeConstraint__Event2Assignment_1
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Event2Assignment_1_in_rule__TimeConstraint__Group__1__Impl2163);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1065:1: rule__TimeConstraint__Group__2 : rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3 ;
    public final void rule__TimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1069:1: ( rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1070:2: rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__2__Impl_in_rule__TimeConstraint__Group__22193);
            rule__TimeConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__3_in_rule__TimeConstraint__Group__22196);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1077:1: rule__TimeConstraint__Group__2__Impl : ( '-' ) ;
    public final void rule__TimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1081:1: ( ( '-' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1082:1: ( '-' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1082:1: ( '-' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1083:1: '-'
            {
             before(grammarAccess.getTimeConstraintAccess().getHyphenMinusKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__TimeConstraint__Group__2__Impl2224); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1096:1: rule__TimeConstraint__Group__3 : rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4 ;
    public final void rule__TimeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1100:1: ( rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1101:2: rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__3__Impl_in_rule__TimeConstraint__Group__32255);
            rule__TimeConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__4_in_rule__TimeConstraint__Group__32258);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1108:1: rule__TimeConstraint__Group__3__Impl : ( '@' ) ;
    public final void rule__TimeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1112:1: ( ( '@' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1113:1: ( '@' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1113:1: ( '@' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1114:1: '@'
            {
             before(grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__TimeConstraint__Group__3__Impl2286); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1127:1: rule__TimeConstraint__Group__4 : rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5 ;
    public final void rule__TimeConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1131:1: ( rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1132:2: rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__4__Impl_in_rule__TimeConstraint__Group__42317);
            rule__TimeConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__5_in_rule__TimeConstraint__Group__42320);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1139:1: rule__TimeConstraint__Group__4__Impl : ( ( rule__TimeConstraint__Event1Assignment_4 ) ) ;
    public final void rule__TimeConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1143:1: ( ( ( rule__TimeConstraint__Event1Assignment_4 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1144:1: ( ( rule__TimeConstraint__Event1Assignment_4 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1144:1: ( ( rule__TimeConstraint__Event1Assignment_4 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1145:1: ( rule__TimeConstraint__Event1Assignment_4 )
            {
             before(grammarAccess.getTimeConstraintAccess().getEvent1Assignment_4()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1146:1: ( rule__TimeConstraint__Event1Assignment_4 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1146:2: rule__TimeConstraint__Event1Assignment_4
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Event1Assignment_4_in_rule__TimeConstraint__Group__4__Impl2347);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1156:1: rule__TimeConstraint__Group__5 : rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6 ;
    public final void rule__TimeConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1160:1: ( rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1161:2: rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__5__Impl_in_rule__TimeConstraint__Group__52377);
            rule__TimeConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__6_in_rule__TimeConstraint__Group__52380);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1168:1: rule__TimeConstraint__Group__5__Impl : ( ( rule__TimeConstraint__OpAssignment_5 ) ) ;
    public final void rule__TimeConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1172:1: ( ( ( rule__TimeConstraint__OpAssignment_5 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1173:1: ( ( rule__TimeConstraint__OpAssignment_5 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1173:1: ( ( rule__TimeConstraint__OpAssignment_5 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1174:1: ( rule__TimeConstraint__OpAssignment_5 )
            {
             before(grammarAccess.getTimeConstraintAccess().getOpAssignment_5()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1175:1: ( rule__TimeConstraint__OpAssignment_5 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1175:2: rule__TimeConstraint__OpAssignment_5
            {
            pushFollow(FOLLOW_rule__TimeConstraint__OpAssignment_5_in_rule__TimeConstraint__Group__5__Impl2407);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1185:1: rule__TimeConstraint__Group__6 : rule__TimeConstraint__Group__6__Impl ;
    public final void rule__TimeConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1189:1: ( rule__TimeConstraint__Group__6__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1190:2: rule__TimeConstraint__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__6__Impl_in_rule__TimeConstraint__Group__62437);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1196:1: rule__TimeConstraint__Group__6__Impl : ( ( rule__TimeConstraint__ValueAssignment_6 ) ) ;
    public final void rule__TimeConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1200:1: ( ( ( rule__TimeConstraint__ValueAssignment_6 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1201:1: ( ( rule__TimeConstraint__ValueAssignment_6 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1201:1: ( ( rule__TimeConstraint__ValueAssignment_6 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1202:1: ( rule__TimeConstraint__ValueAssignment_6 )
            {
             before(grammarAccess.getTimeConstraintAccess().getValueAssignment_6()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1203:1: ( rule__TimeConstraint__ValueAssignment_6 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1203:2: rule__TimeConstraint__ValueAssignment_6
            {
            pushFollow(FOLLOW_rule__TimeConstraint__ValueAssignment_6_in_rule__TimeConstraint__Group__6__Impl2464);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1227:1: rule__VariableCondition__Group__0 : rule__VariableCondition__Group__0__Impl rule__VariableCondition__Group__1 ;
    public final void rule__VariableCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1231:1: ( rule__VariableCondition__Group__0__Impl rule__VariableCondition__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1232:2: rule__VariableCondition__Group__0__Impl rule__VariableCondition__Group__1
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__0__Impl_in_rule__VariableCondition__Group__02508);
            rule__VariableCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableCondition__Group__1_in_rule__VariableCondition__Group__02511);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1239:1: rule__VariableCondition__Group__0__Impl : ( '{' ) ;
    public final void rule__VariableCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1243:1: ( ( '{' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1244:1: ( '{' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1244:1: ( '{' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1245:1: '{'
            {
             before(grammarAccess.getVariableConditionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__VariableCondition__Group__0__Impl2539); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1258:1: rule__VariableCondition__Group__1 : rule__VariableCondition__Group__1__Impl rule__VariableCondition__Group__2 ;
    public final void rule__VariableCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1262:1: ( rule__VariableCondition__Group__1__Impl rule__VariableCondition__Group__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1263:2: rule__VariableCondition__Group__1__Impl rule__VariableCondition__Group__2
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__1__Impl_in_rule__VariableCondition__Group__12570);
            rule__VariableCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableCondition__Group__2_in_rule__VariableCondition__Group__12573);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1270:1: rule__VariableCondition__Group__1__Impl : ( ( rule__VariableCondition__Expression_leftAssignment_1 ) ) ;
    public final void rule__VariableCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1274:1: ( ( ( rule__VariableCondition__Expression_leftAssignment_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1275:1: ( ( rule__VariableCondition__Expression_leftAssignment_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1275:1: ( ( rule__VariableCondition__Expression_leftAssignment_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1276:1: ( rule__VariableCondition__Expression_leftAssignment_1 )
            {
             before(grammarAccess.getVariableConditionAccess().getExpression_leftAssignment_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1277:1: ( rule__VariableCondition__Expression_leftAssignment_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1277:2: rule__VariableCondition__Expression_leftAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableCondition__Expression_leftAssignment_1_in_rule__VariableCondition__Group__1__Impl2600);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1287:1: rule__VariableCondition__Group__2 : rule__VariableCondition__Group__2__Impl rule__VariableCondition__Group__3 ;
    public final void rule__VariableCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1291:1: ( rule__VariableCondition__Group__2__Impl rule__VariableCondition__Group__3 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1292:2: rule__VariableCondition__Group__2__Impl rule__VariableCondition__Group__3
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__2__Impl_in_rule__VariableCondition__Group__22630);
            rule__VariableCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableCondition__Group__3_in_rule__VariableCondition__Group__22633);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1299:1: rule__VariableCondition__Group__2__Impl : ( ( rule__VariableCondition__RelationAssignment_2 ) ) ;
    public final void rule__VariableCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1303:1: ( ( ( rule__VariableCondition__RelationAssignment_2 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1304:1: ( ( rule__VariableCondition__RelationAssignment_2 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1304:1: ( ( rule__VariableCondition__RelationAssignment_2 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1305:1: ( rule__VariableCondition__RelationAssignment_2 )
            {
             before(grammarAccess.getVariableConditionAccess().getRelationAssignment_2()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1306:1: ( rule__VariableCondition__RelationAssignment_2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1306:2: rule__VariableCondition__RelationAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableCondition__RelationAssignment_2_in_rule__VariableCondition__Group__2__Impl2660);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1316:1: rule__VariableCondition__Group__3 : rule__VariableCondition__Group__3__Impl rule__VariableCondition__Group__4 ;
    public final void rule__VariableCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1320:1: ( rule__VariableCondition__Group__3__Impl rule__VariableCondition__Group__4 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1321:2: rule__VariableCondition__Group__3__Impl rule__VariableCondition__Group__4
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__3__Impl_in_rule__VariableCondition__Group__32690);
            rule__VariableCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableCondition__Group__4_in_rule__VariableCondition__Group__32693);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1328:1: rule__VariableCondition__Group__3__Impl : ( ( rule__VariableCondition__Expression_rightAssignment_3 ) ) ;
    public final void rule__VariableCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1332:1: ( ( ( rule__VariableCondition__Expression_rightAssignment_3 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1333:1: ( ( rule__VariableCondition__Expression_rightAssignment_3 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1333:1: ( ( rule__VariableCondition__Expression_rightAssignment_3 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1334:1: ( rule__VariableCondition__Expression_rightAssignment_3 )
            {
             before(grammarAccess.getVariableConditionAccess().getExpression_rightAssignment_3()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1335:1: ( rule__VariableCondition__Expression_rightAssignment_3 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1335:2: rule__VariableCondition__Expression_rightAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableCondition__Expression_rightAssignment_3_in_rule__VariableCondition__Group__3__Impl2720);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1345:1: rule__VariableCondition__Group__4 : rule__VariableCondition__Group__4__Impl ;
    public final void rule__VariableCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1349:1: ( rule__VariableCondition__Group__4__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1350:2: rule__VariableCondition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__4__Impl_in_rule__VariableCondition__Group__42750);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1356:1: rule__VariableCondition__Group__4__Impl : ( '}' ) ;
    public final void rule__VariableCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1360:1: ( ( '}' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1361:1: ( '}' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1361:1: ( '}' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1362:1: '}'
            {
             before(grammarAccess.getVariableConditionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__VariableCondition__Group__4__Impl2778); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1385:1: rule__EXPRESSION__Group_0__0 : rule__EXPRESSION__Group_0__0__Impl rule__EXPRESSION__Group_0__1 ;
    public final void rule__EXPRESSION__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1389:1: ( rule__EXPRESSION__Group_0__0__Impl rule__EXPRESSION__Group_0__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1390:2: rule__EXPRESSION__Group_0__0__Impl rule__EXPRESSION__Group_0__1
            {
            pushFollow(FOLLOW_rule__EXPRESSION__Group_0__0__Impl_in_rule__EXPRESSION__Group_0__02819);
            rule__EXPRESSION__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EXPRESSION__Group_0__1_in_rule__EXPRESSION__Group_0__02822);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1397:1: rule__EXPRESSION__Group_0__0__Impl : ( ( rule__EXPRESSION__FirstTermAssignment_0_0 ) ) ;
    public final void rule__EXPRESSION__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1401:1: ( ( ( rule__EXPRESSION__FirstTermAssignment_0_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1402:1: ( ( rule__EXPRESSION__FirstTermAssignment_0_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1402:1: ( ( rule__EXPRESSION__FirstTermAssignment_0_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1403:1: ( rule__EXPRESSION__FirstTermAssignment_0_0 )
            {
             before(grammarAccess.getEXPRESSIONAccess().getFirstTermAssignment_0_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1404:1: ( rule__EXPRESSION__FirstTermAssignment_0_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1404:2: rule__EXPRESSION__FirstTermAssignment_0_0
            {
            pushFollow(FOLLOW_rule__EXPRESSION__FirstTermAssignment_0_0_in_rule__EXPRESSION__Group_0__0__Impl2849);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1414:1: rule__EXPRESSION__Group_0__1 : rule__EXPRESSION__Group_0__1__Impl rule__EXPRESSION__Group_0__2 ;
    public final void rule__EXPRESSION__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1418:1: ( rule__EXPRESSION__Group_0__1__Impl rule__EXPRESSION__Group_0__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1419:2: rule__EXPRESSION__Group_0__1__Impl rule__EXPRESSION__Group_0__2
            {
            pushFollow(FOLLOW_rule__EXPRESSION__Group_0__1__Impl_in_rule__EXPRESSION__Group_0__12879);
            rule__EXPRESSION__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EXPRESSION__Group_0__2_in_rule__EXPRESSION__Group_0__12882);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1426:1: rule__EXPRESSION__Group_0__1__Impl : ( ( rule__EXPRESSION__OperatorAssignment_0_1 ) ) ;
    public final void rule__EXPRESSION__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1430:1: ( ( ( rule__EXPRESSION__OperatorAssignment_0_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1431:1: ( ( rule__EXPRESSION__OperatorAssignment_0_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1431:1: ( ( rule__EXPRESSION__OperatorAssignment_0_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1432:1: ( rule__EXPRESSION__OperatorAssignment_0_1 )
            {
             before(grammarAccess.getEXPRESSIONAccess().getOperatorAssignment_0_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1433:1: ( rule__EXPRESSION__OperatorAssignment_0_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1433:2: rule__EXPRESSION__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EXPRESSION__OperatorAssignment_0_1_in_rule__EXPRESSION__Group_0__1__Impl2909);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1443:1: rule__EXPRESSION__Group_0__2 : rule__EXPRESSION__Group_0__2__Impl ;
    public final void rule__EXPRESSION__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1447:1: ( rule__EXPRESSION__Group_0__2__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1448:2: rule__EXPRESSION__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__EXPRESSION__Group_0__2__Impl_in_rule__EXPRESSION__Group_0__22939);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1454:1: rule__EXPRESSION__Group_0__2__Impl : ( ( rule__EXPRESSION__SecondTermAssignment_0_2 ) ) ;
    public final void rule__EXPRESSION__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1458:1: ( ( ( rule__EXPRESSION__SecondTermAssignment_0_2 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1459:1: ( ( rule__EXPRESSION__SecondTermAssignment_0_2 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1459:1: ( ( rule__EXPRESSION__SecondTermAssignment_0_2 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1460:1: ( rule__EXPRESSION__SecondTermAssignment_0_2 )
            {
             before(grammarAccess.getEXPRESSIONAccess().getSecondTermAssignment_0_2()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1461:1: ( rule__EXPRESSION__SecondTermAssignment_0_2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1461:2: rule__EXPRESSION__SecondTermAssignment_0_2
            {
            pushFollow(FOLLOW_rule__EXPRESSION__SecondTermAssignment_0_2_in_rule__EXPRESSION__Group_0__2__Impl2966);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1477:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1481:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1482:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
            {
            pushFollow(FOLLOW_rule__Event__Group_0__0__Impl_in_rule__Event__Group_0__03002);
            rule__Event__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_0__1_in_rule__Event__Group_0__03005);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1489:1: rule__Event__Group_0__0__Impl : ( ( rule__Event__EventNameAssignment_0_0 ) ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1493:1: ( ( ( rule__Event__EventNameAssignment_0_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1494:1: ( ( rule__Event__EventNameAssignment_0_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1494:1: ( ( rule__Event__EventNameAssignment_0_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1495:1: ( rule__Event__EventNameAssignment_0_0 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_0_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1496:1: ( rule__Event__EventNameAssignment_0_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1496:2: rule__Event__EventNameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Event__EventNameAssignment_0_0_in_rule__Event__Group_0__0__Impl3032);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1506:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl rule__Event__Group_0__2 ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1510:1: ( rule__Event__Group_0__1__Impl rule__Event__Group_0__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1511:2: rule__Event__Group_0__1__Impl rule__Event__Group_0__2
            {
            pushFollow(FOLLOW_rule__Event__Group_0__1__Impl_in_rule__Event__Group_0__13062);
            rule__Event__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_0__2_in_rule__Event__Group_0__13065);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1518:1: rule__Event__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1522:1: ( ( '.' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1523:1: ( '.' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1523:1: ( '.' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1524:1: '.'
            {
             before(grammarAccess.getEventAccess().getFullStopKeyword_0_1()); 
            match(input,32,FOLLOW_32_in_rule__Event__Group_0__1__Impl3093); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1537:1: rule__Event__Group_0__2 : rule__Event__Group_0__2__Impl ;
    public final void rule__Event__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1541:1: ( rule__Event__Group_0__2__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1542:2: rule__Event__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_0__2__Impl_in_rule__Event__Group_0__23124);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1548:1: rule__Event__Group_0__2__Impl : ( ( rule__Event__EventExtensionAssignment_0_2 ) ) ;
    public final void rule__Event__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1552:1: ( ( ( rule__Event__EventExtensionAssignment_0_2 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1553:1: ( ( rule__Event__EventExtensionAssignment_0_2 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1553:1: ( ( rule__Event__EventExtensionAssignment_0_2 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1554:1: ( rule__Event__EventExtensionAssignment_0_2 )
            {
             before(grammarAccess.getEventAccess().getEventExtensionAssignment_0_2()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1555:1: ( rule__Event__EventExtensionAssignment_0_2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1555:2: rule__Event__EventExtensionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Event__EventExtensionAssignment_0_2_in_rule__Event__Group_0__2__Impl3151);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1572:1: rule__Model__ExpressionAssignment : ( ruleOrExpression ) ;
    public final void rule__Model__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1576:1: ( ( ruleOrExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1577:1: ( ruleOrExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1577:1: ( ruleOrExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1578:1: ruleOrExpression
            {
             before(grammarAccess.getModelAccess().getExpressionOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__Model__ExpressionAssignment3192);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1587:1: rule__OrExpression__LeftExpressionAssignment_0 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__LeftExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1591:1: ( ( ruleAndExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1592:1: ( ruleAndExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1592:1: ( ruleAndExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1593:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getLeftExpressionAndExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__LeftExpressionAssignment_03223);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1602:1: rule__OrExpression__OrAssignment_1_0 : ( RULE_OR ) ;
    public final void rule__OrExpression__OrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1606:1: ( ( RULE_OR ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1607:1: ( RULE_OR )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1607:1: ( RULE_OR )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1608:1: RULE_OR
            {
             before(grammarAccess.getOrExpressionAccess().getOrORTerminalRuleCall_1_0_0()); 
            match(input,RULE_OR,FOLLOW_RULE_OR_in_rule__OrExpression__OrAssignment_1_03254); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1617:1: rule__OrExpression__RightExpressionAssignment_1_1 : ( ruleOrExpression ) ;
    public final void rule__OrExpression__RightExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1621:1: ( ( ruleOrExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1622:1: ( ruleOrExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1622:1: ( ruleOrExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1623:1: ruleOrExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightExpressionOrExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__OrExpression__RightExpressionAssignment_1_13285);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1632:1: rule__AndExpression__LeftExpressionAssignment_0 : ( ruleBaseExpression ) ;
    public final void rule__AndExpression__LeftExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1636:1: ( ( ruleBaseExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1637:1: ( ruleBaseExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1637:1: ( ruleBaseExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1638:1: ruleBaseExpression
            {
             before(grammarAccess.getAndExpressionAccess().getLeftExpressionBaseExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBaseExpression_in_rule__AndExpression__LeftExpressionAssignment_03316);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1647:1: rule__AndExpression__AndAssignment_1_0 : ( RULE_AND ) ;
    public final void rule__AndExpression__AndAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1651:1: ( ( RULE_AND ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1652:1: ( RULE_AND )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1652:1: ( RULE_AND )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1653:1: RULE_AND
            {
             before(grammarAccess.getAndExpressionAccess().getAndANDTerminalRuleCall_1_0_0()); 
            match(input,RULE_AND,FOLLOW_RULE_AND_in_rule__AndExpression__AndAssignment_1_03347); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1662:1: rule__AndExpression__RightExpressionAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__AndExpression__RightExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1666:1: ( ( ruleAndExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1667:1: ( ruleAndExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1667:1: ( ruleAndExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1668:1: ruleAndExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightExpressionAndExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__AndExpression__RightExpressionAssignment_1_13378);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1677:1: rule__BaseExpression__NotAssignment_0 : ( RULE_NOT ) ;
    public final void rule__BaseExpression__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1681:1: ( ( RULE_NOT ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1682:1: ( RULE_NOT )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1682:1: ( RULE_NOT )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1683:1: RULE_NOT
            {
             before(grammarAccess.getBaseExpressionAccess().getNotNOTTerminalRuleCall_0_0()); 
            match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rule__BaseExpression__NotAssignment_03409); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1692:1: rule__BaseExpression__BooleanTermAssignment_1_0 : ( rulebooleanTerm ) ;
    public final void rule__BaseExpression__BooleanTermAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1696:1: ( ( rulebooleanTerm ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1697:1: ( rulebooleanTerm )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1697:1: ( rulebooleanTerm )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1698:1: rulebooleanTerm
            {
             before(grammarAccess.getBaseExpressionAccess().getBooleanTermBooleanTermParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulebooleanTerm_in_rule__BaseExpression__BooleanTermAssignment_1_03440);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1707:1: rule__BaseExpression__RootExpressionAssignment_1_1_1 : ( ruleOrExpression ) ;
    public final void rule__BaseExpression__RootExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1711:1: ( ( ruleOrExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1712:1: ( ruleOrExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1712:1: ( ruleOrExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1713:1: ruleOrExpression
            {
             before(grammarAccess.getBaseExpressionAccess().getRootExpressionOrExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__BaseExpression__RootExpressionAssignment_1_1_13471);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1722:1: rule__BooleanTerm__TimeConstraintAssignment_0 : ( ruleTimeConstraint ) ;
    public final void rule__BooleanTerm__TimeConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1726:1: ( ( ruleTimeConstraint ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1727:1: ( ruleTimeConstraint )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1727:1: ( ruleTimeConstraint )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1728:1: ruleTimeConstraint
            {
             before(grammarAccess.getBooleanTermAccess().getTimeConstraintTimeConstraintParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTimeConstraint_in_rule__BooleanTerm__TimeConstraintAssignment_03502);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1737:1: rule__BooleanTerm__BooleanVariableAssignment_1 : ( ruleBooleanVariable ) ;
    public final void rule__BooleanTerm__BooleanVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1741:1: ( ( ruleBooleanVariable ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1742:1: ( ruleBooleanVariable )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1742:1: ( ruleBooleanVariable )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1743:1: ruleBooleanVariable
            {
             before(grammarAccess.getBooleanTermAccess().getBooleanVariableBooleanVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBooleanVariable_in_rule__BooleanTerm__BooleanVariableAssignment_13533);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1752:1: rule__BooleanTerm__VariableConditionAssignment_2 : ( ruleVariableCondition ) ;
    public final void rule__BooleanTerm__VariableConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1756:1: ( ( ruleVariableCondition ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1757:1: ( ruleVariableCondition )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1757:1: ( ruleVariableCondition )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1758:1: ruleVariableCondition
            {
             before(grammarAccess.getBooleanTermAccess().getVariableConditionVariableConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariableCondition_in_rule__BooleanTerm__VariableConditionAssignment_23564);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1767:1: rule__TimeConstraint__Event2Assignment_1 : ( ruleEvent ) ;
    public final void rule__TimeConstraint__Event2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1771:1: ( ( ruleEvent ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1772:1: ( ruleEvent )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1772:1: ( ruleEvent )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1773:1: ruleEvent
            {
             before(grammarAccess.getTimeConstraintAccess().getEvent2EventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__TimeConstraint__Event2Assignment_13595);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1782:1: rule__TimeConstraint__Event1Assignment_4 : ( ruleEvent ) ;
    public final void rule__TimeConstraint__Event1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1786:1: ( ( ruleEvent ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1787:1: ( ruleEvent )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1787:1: ( ruleEvent )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1788:1: ruleEvent
            {
             before(grammarAccess.getTimeConstraintAccess().getEvent1EventParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__TimeConstraint__Event1Assignment_43626);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1797:1: rule__TimeConstraint__OpAssignment_5 : ( RULE_RELATIONS ) ;
    public final void rule__TimeConstraint__OpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1801:1: ( ( RULE_RELATIONS ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1802:1: ( RULE_RELATIONS )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1802:1: ( RULE_RELATIONS )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1803:1: RULE_RELATIONS
            {
             before(grammarAccess.getTimeConstraintAccess().getOpRELATIONSTerminalRuleCall_5_0()); 
            match(input,RULE_RELATIONS,FOLLOW_RULE_RELATIONS_in_rule__TimeConstraint__OpAssignment_53657); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1812:1: rule__TimeConstraint__ValueAssignment_6 : ( RULE_INT ) ;
    public final void rule__TimeConstraint__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1816:1: ( ( RULE_INT ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1817:1: ( RULE_INT )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1817:1: ( RULE_INT )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1818:1: RULE_INT
            {
             before(grammarAccess.getTimeConstraintAccess().getValueINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TimeConstraint__ValueAssignment_63688); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1827:1: rule__BooleanVariable__VariableAssignment : ( RULE_ID ) ;
    public final void rule__BooleanVariable__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1831:1: ( ( RULE_ID ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1832:1: ( RULE_ID )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1832:1: ( RULE_ID )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1833:1: RULE_ID
            {
             before(grammarAccess.getBooleanVariableAccess().getVariableIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BooleanVariable__VariableAssignment3719); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1842:1: rule__VariableCondition__Expression_leftAssignment_1 : ( ruleEXPRESSION ) ;
    public final void rule__VariableCondition__Expression_leftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1846:1: ( ( ruleEXPRESSION ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1847:1: ( ruleEXPRESSION )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1847:1: ( ruleEXPRESSION )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1848:1: ruleEXPRESSION
            {
             before(grammarAccess.getVariableConditionAccess().getExpression_leftEXPRESSIONParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__VariableCondition__Expression_leftAssignment_13750);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1857:1: rule__VariableCondition__RelationAssignment_2 : ( RULE_RELATIONS ) ;
    public final void rule__VariableCondition__RelationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1861:1: ( ( RULE_RELATIONS ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1862:1: ( RULE_RELATIONS )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1862:1: ( RULE_RELATIONS )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1863:1: RULE_RELATIONS
            {
             before(grammarAccess.getVariableConditionAccess().getRelationRELATIONSTerminalRuleCall_2_0()); 
            match(input,RULE_RELATIONS,FOLLOW_RULE_RELATIONS_in_rule__VariableCondition__RelationAssignment_23781); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1872:1: rule__VariableCondition__Expression_rightAssignment_3 : ( ruleEXPRESSION ) ;
    public final void rule__VariableCondition__Expression_rightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1876:1: ( ( ruleEXPRESSION ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1877:1: ( ruleEXPRESSION )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1877:1: ( ruleEXPRESSION )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1878:1: ruleEXPRESSION
            {
             before(grammarAccess.getVariableConditionAccess().getExpression_rightEXPRESSIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEXPRESSION_in_rule__VariableCondition__Expression_rightAssignment_33812);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1887:1: rule__EXPRESSION__FirstTermAssignment_0_0 : ( ruleTERM ) ;
    public final void rule__EXPRESSION__FirstTermAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1891:1: ( ( ruleTERM ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1892:1: ( ruleTERM )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1892:1: ( ruleTERM )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1893:1: ruleTERM
            {
             before(grammarAccess.getEXPRESSIONAccess().getFirstTermTERMParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleTERM_in_rule__EXPRESSION__FirstTermAssignment_0_03843);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1902:1: rule__EXPRESSION__OperatorAssignment_0_1 : ( RULE_OPERATOR ) ;
    public final void rule__EXPRESSION__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1906:1: ( ( RULE_OPERATOR ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1907:1: ( RULE_OPERATOR )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1907:1: ( RULE_OPERATOR )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1908:1: RULE_OPERATOR
            {
             before(grammarAccess.getEXPRESSIONAccess().getOperatorOPERATORTerminalRuleCall_0_1_0()); 
            match(input,RULE_OPERATOR,FOLLOW_RULE_OPERATOR_in_rule__EXPRESSION__OperatorAssignment_0_13874); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1917:1: rule__EXPRESSION__SecondTermAssignment_0_2 : ( ruleTERM ) ;
    public final void rule__EXPRESSION__SecondTermAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1921:1: ( ( ruleTERM ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1922:1: ( ruleTERM )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1922:1: ( ruleTERM )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1923:1: ruleTERM
            {
             before(grammarAccess.getEXPRESSIONAccess().getSecondTermTERMParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleTERM_in_rule__EXPRESSION__SecondTermAssignment_0_23905);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1932:1: rule__EXPRESSION__AloneAssignment_1 : ( ruleTERM ) ;
    public final void rule__EXPRESSION__AloneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1936:1: ( ( ruleTERM ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1937:1: ( ruleTERM )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1937:1: ( ruleTERM )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1938:1: ruleTERM
            {
             before(grammarAccess.getEXPRESSIONAccess().getAloneTERMParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTERM_in_rule__EXPRESSION__AloneAssignment_13936);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1947:1: rule__TERM__VariableAssignment_0 : ( RULE_ID ) ;
    public final void rule__TERM__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1951:1: ( ( RULE_ID ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1952:1: ( RULE_ID )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1952:1: ( RULE_ID )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1953:1: RULE_ID
            {
             before(grammarAccess.getTERMAccess().getVariableIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TERM__VariableAssignment_03967); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1962:1: rule__TERM__ConstantAssignment_1 : ( RULE_INT ) ;
    public final void rule__TERM__ConstantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1966:1: ( ( RULE_INT ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1967:1: ( RULE_INT )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1967:1: ( RULE_INT )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1968:1: RULE_INT
            {
             before(grammarAccess.getTERMAccess().getConstantINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TERM__ConstantAssignment_13998); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1977:1: rule__Event__EventNameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1981:1: ( ( RULE_ID ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1982:1: ( RULE_ID )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1982:1: ( RULE_ID )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1983:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_0_04029); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1992:1: rule__Event__EventExtensionAssignment_0_2 : ( ruleEventExtensions ) ;
    public final void rule__Event__EventExtensionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1996:1: ( ( ruleEventExtensions ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1997:1: ( ruleEventExtensions )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1997:1: ( ruleEventExtensions )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1998:1: ruleEventExtensions
            {
             before(grammarAccess.getEventAccess().getEventExtensionEventExtensionsParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleEventExtensions_in_rule__Event__EventExtensionAssignment_0_24060);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:2007:1: rule__Event__NowEventAssignment_1 : ( ( 'now' ) ) ;
    public final void rule__Event__NowEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:2011:1: ( ( ( 'now' ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:2012:1: ( ( 'now' ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:2012:1: ( ( 'now' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:2013:1: ( 'now' )
            {
             before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:2014:1: ( 'now' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:2015:1: 'now'
            {
             before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Event__NowEventAssignment_14096); 
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
    public static final BitSet FOLLOW_25_in_rule__EventExtensions__Alternatives1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__01276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__01279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__LeftExpressionAssignment_0_in_rule__OrExpression__Group__0__Impl1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__11336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__01398 = new BitSet(new long[]{0x0000000054000240L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__01401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__OrAssignment_1_0_in_rule__OrExpression__Group_1__0__Impl1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__11458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__RightExpressionAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__01519 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__01522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__LeftExpressionAssignment_0_in_rule__AndExpression__Group__0__Impl1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__11579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__01641 = new BitSet(new long[]{0x0000000054000240L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__01644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__AndAssignment_1_0_in_rule__AndExpression__Group_1__0__Impl1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__11701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__RightExpressionAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group__0__Impl_in_rule__BaseExpression__Group__01762 = new BitSet(new long[]{0x0000000054000240L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group__1_in_rule__BaseExpression__Group__01765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__NotAssignment_0_in_rule__BaseExpression__Group__0__Impl1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group__1__Impl_in_rule__BaseExpression__Group__11823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Alternatives_1_in_rule__BaseExpression__Group__1__Impl1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__0__Impl_in_rule__BaseExpression__Group_1_1__01884 = new BitSet(new long[]{0x0000000054000240L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__1_in_rule__BaseExpression__Group_1_1__01887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BaseExpression__Group_1_1__0__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__1__Impl_in_rule__BaseExpression__Group_1_1__11946 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__2_in_rule__BaseExpression__Group_1_1__11949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__RootExpressionAssignment_1_1_1_in_rule__BaseExpression__Group_1_1__1__Impl1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__2__Impl_in_rule__BaseExpression__Group_1_1__22006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BaseExpression__Group_1_1__2__Impl2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__0__Impl_in_rule__TimeConstraint__Group__02071 = new BitSet(new long[]{0x0000000200000200L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__1_in_rule__TimeConstraint__Group__02074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TimeConstraint__Group__0__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__1__Impl_in_rule__TimeConstraint__Group__12133 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__2_in_rule__TimeConstraint__Group__12136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Event2Assignment_1_in_rule__TimeConstraint__Group__1__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__2__Impl_in_rule__TimeConstraint__Group__22193 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__3_in_rule__TimeConstraint__Group__22196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TimeConstraint__Group__2__Impl2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__3__Impl_in_rule__TimeConstraint__Group__32255 = new BitSet(new long[]{0x0000000200000200L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__4_in_rule__TimeConstraint__Group__32258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__TimeConstraint__Group__3__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__4__Impl_in_rule__TimeConstraint__Group__42317 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__5_in_rule__TimeConstraint__Group__42320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Event1Assignment_4_in_rule__TimeConstraint__Group__4__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__5__Impl_in_rule__TimeConstraint__Group__52377 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__6_in_rule__TimeConstraint__Group__52380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__OpAssignment_5_in_rule__TimeConstraint__Group__5__Impl2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__6__Impl_in_rule__TimeConstraint__Group__62437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__ValueAssignment_6_in_rule__TimeConstraint__Group__6__Impl2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__0__Impl_in_rule__VariableCondition__Group__02508 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__1_in_rule__VariableCondition__Group__02511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VariableCondition__Group__0__Impl2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__1__Impl_in_rule__VariableCondition__Group__12570 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__2_in_rule__VariableCondition__Group__12573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Expression_leftAssignment_1_in_rule__VariableCondition__Group__1__Impl2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__2__Impl_in_rule__VariableCondition__Group__22630 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__3_in_rule__VariableCondition__Group__22633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__RelationAssignment_2_in_rule__VariableCondition__Group__2__Impl2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__3__Impl_in_rule__VariableCondition__Group__32690 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__4_in_rule__VariableCondition__Group__32693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Expression_rightAssignment_3_in_rule__VariableCondition__Group__3__Impl2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__4__Impl_in_rule__VariableCondition__Group__42750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VariableCondition__Group__4__Impl2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Group_0__0__Impl_in_rule__EXPRESSION__Group_0__02819 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Group_0__1_in_rule__EXPRESSION__Group_0__02822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__FirstTermAssignment_0_0_in_rule__EXPRESSION__Group_0__0__Impl2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Group_0__1__Impl_in_rule__EXPRESSION__Group_0__12879 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Group_0__2_in_rule__EXPRESSION__Group_0__12882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__OperatorAssignment_0_1_in_rule__EXPRESSION__Group_0__1__Impl2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__Group_0__2__Impl_in_rule__EXPRESSION__Group_0__22939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EXPRESSION__SecondTermAssignment_0_2_in_rule__EXPRESSION__Group_0__2__Impl2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__0__Impl_in_rule__Event__Group_0__03002 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Event__Group_0__1_in_rule__Event__Group_0__03005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventNameAssignment_0_0_in_rule__Event__Group_0__0__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__1__Impl_in_rule__Event__Group_0__13062 = new BitSet(new long[]{0x0000000003FF0000L});
    public static final BitSet FOLLOW_rule__Event__Group_0__2_in_rule__Event__Group_0__13065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Event__Group_0__1__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__2__Impl_in_rule__Event__Group_0__23124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventExtensionAssignment_0_2_in_rule__Event__Group_0__2__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__Model__ExpressionAssignment3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__LeftExpressionAssignment_03223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_rule__OrExpression__OrAssignment_1_03254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__OrExpression__RightExpressionAssignment_1_13285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_rule__AndExpression__LeftExpressionAssignment_03316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_in_rule__AndExpression__AndAssignment_1_03347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__AndExpression__RightExpressionAssignment_1_13378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_rule__BaseExpression__NotAssignment_03409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebooleanTerm_in_rule__BaseExpression__BooleanTermAssignment_1_03440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__BaseExpression__RootExpressionAssignment_1_1_13471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeConstraint_in_rule__BooleanTerm__TimeConstraintAssignment_03502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanVariable_in_rule__BooleanTerm__BooleanVariableAssignment_13533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCondition_in_rule__BooleanTerm__VariableConditionAssignment_23564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__TimeConstraint__Event2Assignment_13595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__TimeConstraint__Event1Assignment_43626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONS_in_rule__TimeConstraint__OpAssignment_53657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TimeConstraint__ValueAssignment_63688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanVariable__VariableAssignment3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__VariableCondition__Expression_leftAssignment_13750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONS_in_rule__VariableCondition__RelationAssignment_23781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rule__VariableCondition__Expression_rightAssignment_33812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTERM_in_rule__EXPRESSION__FirstTermAssignment_0_03843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_in_rule__EXPRESSION__OperatorAssignment_0_13874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTERM_in_rule__EXPRESSION__SecondTermAssignment_0_23905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTERM_in_rule__EXPRESSION__AloneAssignment_13936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TERM__VariableAssignment_03967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TERM__ConstantAssignment_13998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_0_04029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_rule__Event__EventExtensionAssignment_0_24060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Event__NowEventAssignment_14096 = new BitSet(new long[]{0x0000000000000002L});

}