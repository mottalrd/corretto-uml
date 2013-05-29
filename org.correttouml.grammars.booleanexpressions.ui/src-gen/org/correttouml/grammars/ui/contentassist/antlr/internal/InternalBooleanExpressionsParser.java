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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OR", "RULE_AND", "RULE_NOT", "RULE_RELATIONS", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'exit'", "'enter'", "'start'", "'end'", "'tick'", "'sig'", "'call'", "'send'", "'receive'", "'('", "')'", "'@'", "'-'", "'{'", "'}'", "'.'", "'now'"
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


    // $ANTLR start "entryRuleEvent"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:284:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:285:1: ( ruleEvent EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:286:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent541);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent548); 

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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:293:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:297:2: ( ( ( rule__Event__Alternatives ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:298:1: ( ( rule__Event__Alternatives ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:298:1: ( ( rule__Event__Alternatives ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:299:1: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:300:1: ( rule__Event__Alternatives )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:300:2: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_rule__Event__Alternatives_in_ruleEvent574);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:312:1: entryRuleEventExtensions : ruleEventExtensions EOF ;
    public final void entryRuleEventExtensions() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:313:1: ( ruleEventExtensions EOF )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:314:1: ruleEventExtensions EOF
            {
             before(grammarAccess.getEventExtensionsRule()); 
            pushFollow(FOLLOW_ruleEventExtensions_in_entryRuleEventExtensions601);
            ruleEventExtensions();

            state._fsp--;

             after(grammarAccess.getEventExtensionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventExtensions608); 

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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:321:1: ruleEventExtensions : ( ( rule__EventExtensions__Alternatives ) ) ;
    public final void ruleEventExtensions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:325:2: ( ( ( rule__EventExtensions__Alternatives ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:326:1: ( ( rule__EventExtensions__Alternatives ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:326:1: ( ( rule__EventExtensions__Alternatives ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:327:1: ( rule__EventExtensions__Alternatives )
            {
             before(grammarAccess.getEventExtensionsAccess().getAlternatives()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:328:1: ( rule__EventExtensions__Alternatives )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:328:2: rule__EventExtensions__Alternatives
            {
            pushFollow(FOLLOW_rule__EventExtensions__Alternatives_in_ruleEventExtensions634);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:340:1: rule__BaseExpression__Alternatives_1 : ( ( ( rule__BaseExpression__BooleanTermAssignment_1_0 ) ) | ( ( rule__BaseExpression__Group_1_1__0 ) ) );
    public final void rule__BaseExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:344:1: ( ( ( rule__BaseExpression__BooleanTermAssignment_1_0 ) ) | ( ( rule__BaseExpression__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||LA1_0==26||LA1_0==28) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:345:1: ( ( rule__BaseExpression__BooleanTermAssignment_1_0 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:345:1: ( ( rule__BaseExpression__BooleanTermAssignment_1_0 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:346:1: ( rule__BaseExpression__BooleanTermAssignment_1_0 )
                    {
                     before(grammarAccess.getBaseExpressionAccess().getBooleanTermAssignment_1_0()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:347:1: ( rule__BaseExpression__BooleanTermAssignment_1_0 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:347:2: rule__BaseExpression__BooleanTermAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__BaseExpression__BooleanTermAssignment_1_0_in_rule__BaseExpression__Alternatives_1670);
                    rule__BaseExpression__BooleanTermAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseExpressionAccess().getBooleanTermAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:351:6: ( ( rule__BaseExpression__Group_1_1__0 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:351:6: ( ( rule__BaseExpression__Group_1_1__0 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:352:1: ( rule__BaseExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getBaseExpressionAccess().getGroup_1_1()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:353:1: ( rule__BaseExpression__Group_1_1__0 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:353:2: rule__BaseExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__0_in_rule__BaseExpression__Alternatives_1688);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:362:1: rule__BooleanTerm__Alternatives : ( ( ( rule__BooleanTerm__TimeConstraintAssignment_0 ) ) | ( ( rule__BooleanTerm__BooleanVariableAssignment_1 ) ) | ( ( rule__BooleanTerm__VariableConditionAssignment_2 ) ) );
    public final void rule__BooleanTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:366:1: ( ( ( rule__BooleanTerm__TimeConstraintAssignment_0 ) ) | ( ( rule__BooleanTerm__BooleanVariableAssignment_1 ) ) | ( ( rule__BooleanTerm__VariableConditionAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case 28:
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
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:367:1: ( ( rule__BooleanTerm__TimeConstraintAssignment_0 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:367:1: ( ( rule__BooleanTerm__TimeConstraintAssignment_0 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:368:1: ( rule__BooleanTerm__TimeConstraintAssignment_0 )
                    {
                     before(grammarAccess.getBooleanTermAccess().getTimeConstraintAssignment_0()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:369:1: ( rule__BooleanTerm__TimeConstraintAssignment_0 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:369:2: rule__BooleanTerm__TimeConstraintAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BooleanTerm__TimeConstraintAssignment_0_in_rule__BooleanTerm__Alternatives721);
                    rule__BooleanTerm__TimeConstraintAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanTermAccess().getTimeConstraintAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:373:6: ( ( rule__BooleanTerm__BooleanVariableAssignment_1 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:373:6: ( ( rule__BooleanTerm__BooleanVariableAssignment_1 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:374:1: ( rule__BooleanTerm__BooleanVariableAssignment_1 )
                    {
                     before(grammarAccess.getBooleanTermAccess().getBooleanVariableAssignment_1()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:375:1: ( rule__BooleanTerm__BooleanVariableAssignment_1 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:375:2: rule__BooleanTerm__BooleanVariableAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BooleanTerm__BooleanVariableAssignment_1_in_rule__BooleanTerm__Alternatives739);
                    rule__BooleanTerm__BooleanVariableAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanTermAccess().getBooleanVariableAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:379:6: ( ( rule__BooleanTerm__VariableConditionAssignment_2 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:379:6: ( ( rule__BooleanTerm__VariableConditionAssignment_2 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:380:1: ( rule__BooleanTerm__VariableConditionAssignment_2 )
                    {
                     before(grammarAccess.getBooleanTermAccess().getVariableConditionAssignment_2()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:381:1: ( rule__BooleanTerm__VariableConditionAssignment_2 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:381:2: rule__BooleanTerm__VariableConditionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__BooleanTerm__VariableConditionAssignment_2_in_rule__BooleanTerm__Alternatives757);
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


    // $ANTLR start "rule__VariableCondition__Alternatives_3"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:390:1: rule__VariableCondition__Alternatives_3 : ( ( ( rule__VariableCondition__ValueAssignment_3_0 ) ) | ( ( rule__VariableCondition__RightVariableAssignment_3_1 ) ) );
    public final void rule__VariableCondition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:394:1: ( ( ( rule__VariableCondition__ValueAssignment_3_0 ) ) | ( ( rule__VariableCondition__RightVariableAssignment_3_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:395:1: ( ( rule__VariableCondition__ValueAssignment_3_0 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:395:1: ( ( rule__VariableCondition__ValueAssignment_3_0 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:396:1: ( rule__VariableCondition__ValueAssignment_3_0 )
                    {
                     before(grammarAccess.getVariableConditionAccess().getValueAssignment_3_0()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:397:1: ( rule__VariableCondition__ValueAssignment_3_0 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:397:2: rule__VariableCondition__ValueAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__VariableCondition__ValueAssignment_3_0_in_rule__VariableCondition__Alternatives_3790);
                    rule__VariableCondition__ValueAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableConditionAccess().getValueAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:401:6: ( ( rule__VariableCondition__RightVariableAssignment_3_1 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:401:6: ( ( rule__VariableCondition__RightVariableAssignment_3_1 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:402:1: ( rule__VariableCondition__RightVariableAssignment_3_1 )
                    {
                     before(grammarAccess.getVariableConditionAccess().getRightVariableAssignment_3_1()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:403:1: ( rule__VariableCondition__RightVariableAssignment_3_1 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:403:2: rule__VariableCondition__RightVariableAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__VariableCondition__RightVariableAssignment_3_1_in_rule__VariableCondition__Alternatives_3808);
                    rule__VariableCondition__RightVariableAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableConditionAccess().getRightVariableAssignment_3_1()); 

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
    // $ANTLR end "rule__VariableCondition__Alternatives_3"


    // $ANTLR start "rule__Event__Alternatives"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:412:1: rule__Event__Alternatives : ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__NowEventAssignment_1 ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:416:1: ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__NowEventAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==31) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:417:1: ( ( rule__Event__Group_0__0 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:417:1: ( ( rule__Event__Group_0__0 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:418:1: ( rule__Event__Group_0__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_0()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:419:1: ( rule__Event__Group_0__0 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:419:2: rule__Event__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_0__0_in_rule__Event__Alternatives841);
                    rule__Event__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:423:6: ( ( rule__Event__NowEventAssignment_1 ) )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:423:6: ( ( rule__Event__NowEventAssignment_1 ) )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:424:1: ( rule__Event__NowEventAssignment_1 )
                    {
                     before(grammarAccess.getEventAccess().getNowEventAssignment_1()); 
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:425:1: ( rule__Event__NowEventAssignment_1 )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:425:2: rule__Event__NowEventAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Event__NowEventAssignment_1_in_rule__Event__Alternatives859);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:434:1: rule__EventExtensions__Alternatives : ( ( 'exit' ) | ( 'enter' ) | ( 'start' ) | ( 'end' ) | ( 'tick' ) | ( 'sig' ) | ( 'call' ) | ( 'send' ) | ( 'receive' ) );
    public final void rule__EventExtensions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:438:1: ( ( 'exit' ) | ( 'enter' ) | ( 'start' ) | ( 'end' ) | ( 'tick' ) | ( 'sig' ) | ( 'call' ) | ( 'send' ) | ( 'receive' ) )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            case 21:
                {
                alt5=7;
                }
                break;
            case 22:
                {
                alt5=8;
                }
                break;
            case 23:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:439:1: ( 'exit' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:439:1: ( 'exit' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:440:1: 'exit'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__EventExtensions__Alternatives893); 
                     after(grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:447:6: ( 'enter' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:447:6: ( 'enter' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:448:1: 'enter'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__EventExtensions__Alternatives913); 
                     after(grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:455:6: ( 'start' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:455:6: ( 'start' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:456:1: 'start'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); 
                    match(input,17,FOLLOW_17_in_rule__EventExtensions__Alternatives933); 
                     after(grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:463:6: ( 'end' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:463:6: ( 'end' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:464:1: 'end'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); 
                    match(input,18,FOLLOW_18_in_rule__EventExtensions__Alternatives953); 
                     after(grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:471:6: ( 'tick' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:471:6: ( 'tick' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:472:1: 'tick'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); 
                    match(input,19,FOLLOW_19_in_rule__EventExtensions__Alternatives973); 
                     after(grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:479:6: ( 'sig' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:479:6: ( 'sig' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:480:1: 'sig'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); 
                    match(input,20,FOLLOW_20_in_rule__EventExtensions__Alternatives993); 
                     after(grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:487:6: ( 'call' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:487:6: ( 'call' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:488:1: 'call'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); 
                    match(input,21,FOLLOW_21_in_rule__EventExtensions__Alternatives1013); 
                     after(grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:495:6: ( 'send' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:495:6: ( 'send' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:496:1: 'send'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getSendKeyword_7()); 
                    match(input,22,FOLLOW_22_in_rule__EventExtensions__Alternatives1033); 
                     after(grammarAccess.getEventExtensionsAccess().getSendKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:503:6: ( 'receive' )
                    {
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:503:6: ( 'receive' )
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:504:1: 'receive'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getReceiveKeyword_8()); 
                    match(input,23,FOLLOW_23_in_rule__EventExtensions__Alternatives1053); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:518:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:522:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:523:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__01085);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__01088);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:530:1: rule__OrExpression__Group__0__Impl : ( ( rule__OrExpression__LeftExpressionAssignment_0 ) ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:534:1: ( ( ( rule__OrExpression__LeftExpressionAssignment_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:535:1: ( ( rule__OrExpression__LeftExpressionAssignment_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:535:1: ( ( rule__OrExpression__LeftExpressionAssignment_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:536:1: ( rule__OrExpression__LeftExpressionAssignment_0 )
            {
             before(grammarAccess.getOrExpressionAccess().getLeftExpressionAssignment_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:537:1: ( rule__OrExpression__LeftExpressionAssignment_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:537:2: rule__OrExpression__LeftExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__OrExpression__LeftExpressionAssignment_0_in_rule__OrExpression__Group__0__Impl1115);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:547:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:551:1: ( rule__OrExpression__Group__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:552:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__11145);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:558:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )? ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:562:1: ( ( ( rule__OrExpression__Group_1__0 )? ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:563:1: ( ( rule__OrExpression__Group_1__0 )? )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:563:1: ( ( rule__OrExpression__Group_1__0 )? )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:564:1: ( rule__OrExpression__Group_1__0 )?
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:565:1: ( rule__OrExpression__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_OR) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:565:2: rule__OrExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl1172);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:579:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:583:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:584:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__01207);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__01210);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:591:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__OrAssignment_1_0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:595:1: ( ( ( rule__OrExpression__OrAssignment_1_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:596:1: ( ( rule__OrExpression__OrAssignment_1_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:596:1: ( ( rule__OrExpression__OrAssignment_1_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:597:1: ( rule__OrExpression__OrAssignment_1_0 )
            {
             before(grammarAccess.getOrExpressionAccess().getOrAssignment_1_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:598:1: ( rule__OrExpression__OrAssignment_1_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:598:2: rule__OrExpression__OrAssignment_1_0
            {
            pushFollow(FOLLOW_rule__OrExpression__OrAssignment_1_0_in_rule__OrExpression__Group_1__0__Impl1237);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:608:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:612:1: ( rule__OrExpression__Group_1__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:613:2: rule__OrExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__11267);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:619:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__RightExpressionAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:623:1: ( ( ( rule__OrExpression__RightExpressionAssignment_1_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:624:1: ( ( rule__OrExpression__RightExpressionAssignment_1_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:624:1: ( ( rule__OrExpression__RightExpressionAssignment_1_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:625:1: ( rule__OrExpression__RightExpressionAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightExpressionAssignment_1_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:626:1: ( rule__OrExpression__RightExpressionAssignment_1_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:626:2: rule__OrExpression__RightExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExpression__RightExpressionAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl1294);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:640:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:644:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:645:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__01328);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__01331);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:652:1: rule__AndExpression__Group__0__Impl : ( ( rule__AndExpression__LeftExpressionAssignment_0 ) ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:656:1: ( ( ( rule__AndExpression__LeftExpressionAssignment_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:657:1: ( ( rule__AndExpression__LeftExpressionAssignment_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:657:1: ( ( rule__AndExpression__LeftExpressionAssignment_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:658:1: ( rule__AndExpression__LeftExpressionAssignment_0 )
            {
             before(grammarAccess.getAndExpressionAccess().getLeftExpressionAssignment_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:659:1: ( rule__AndExpression__LeftExpressionAssignment_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:659:2: rule__AndExpression__LeftExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__AndExpression__LeftExpressionAssignment_0_in_rule__AndExpression__Group__0__Impl1358);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:669:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:673:1: ( rule__AndExpression__Group__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:674:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__11388);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:680:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )? ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:684:1: ( ( ( rule__AndExpression__Group_1__0 )? ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:685:1: ( ( rule__AndExpression__Group_1__0 )? )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:685:1: ( ( rule__AndExpression__Group_1__0 )? )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:686:1: ( rule__AndExpression__Group_1__0 )?
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:687:1: ( rule__AndExpression__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_AND) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:687:2: rule__AndExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl1415);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:701:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:705:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:706:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__01450);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__01453);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:713:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__AndAssignment_1_0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:717:1: ( ( ( rule__AndExpression__AndAssignment_1_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:718:1: ( ( rule__AndExpression__AndAssignment_1_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:718:1: ( ( rule__AndExpression__AndAssignment_1_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:719:1: ( rule__AndExpression__AndAssignment_1_0 )
            {
             before(grammarAccess.getAndExpressionAccess().getAndAssignment_1_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:720:1: ( rule__AndExpression__AndAssignment_1_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:720:2: rule__AndExpression__AndAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AndExpression__AndAssignment_1_0_in_rule__AndExpression__Group_1__0__Impl1480);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:730:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:734:1: ( rule__AndExpression__Group_1__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:735:2: rule__AndExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__11510);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:741:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__RightExpressionAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:745:1: ( ( ( rule__AndExpression__RightExpressionAssignment_1_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:746:1: ( ( rule__AndExpression__RightExpressionAssignment_1_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:746:1: ( ( rule__AndExpression__RightExpressionAssignment_1_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:747:1: ( rule__AndExpression__RightExpressionAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightExpressionAssignment_1_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:748:1: ( rule__AndExpression__RightExpressionAssignment_1_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:748:2: rule__AndExpression__RightExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__RightExpressionAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl1537);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:762:1: rule__BaseExpression__Group__0 : rule__BaseExpression__Group__0__Impl rule__BaseExpression__Group__1 ;
    public final void rule__BaseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:766:1: ( rule__BaseExpression__Group__0__Impl rule__BaseExpression__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:767:2: rule__BaseExpression__Group__0__Impl rule__BaseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group__0__Impl_in_rule__BaseExpression__Group__01571);
            rule__BaseExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseExpression__Group__1_in_rule__BaseExpression__Group__01574);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:774:1: rule__BaseExpression__Group__0__Impl : ( ( rule__BaseExpression__NotAssignment_0 )? ) ;
    public final void rule__BaseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:778:1: ( ( ( rule__BaseExpression__NotAssignment_0 )? ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:779:1: ( ( rule__BaseExpression__NotAssignment_0 )? )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:779:1: ( ( rule__BaseExpression__NotAssignment_0 )? )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:780:1: ( rule__BaseExpression__NotAssignment_0 )?
            {
             before(grammarAccess.getBaseExpressionAccess().getNotAssignment_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:781:1: ( rule__BaseExpression__NotAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_NOT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:781:2: rule__BaseExpression__NotAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BaseExpression__NotAssignment_0_in_rule__BaseExpression__Group__0__Impl1601);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:791:1: rule__BaseExpression__Group__1 : rule__BaseExpression__Group__1__Impl ;
    public final void rule__BaseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:795:1: ( rule__BaseExpression__Group__1__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:796:2: rule__BaseExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group__1__Impl_in_rule__BaseExpression__Group__11632);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:802:1: rule__BaseExpression__Group__1__Impl : ( ( rule__BaseExpression__Alternatives_1 ) ) ;
    public final void rule__BaseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:806:1: ( ( ( rule__BaseExpression__Alternatives_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:807:1: ( ( rule__BaseExpression__Alternatives_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:807:1: ( ( rule__BaseExpression__Alternatives_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:808:1: ( rule__BaseExpression__Alternatives_1 )
            {
             before(grammarAccess.getBaseExpressionAccess().getAlternatives_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:809:1: ( rule__BaseExpression__Alternatives_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:809:2: rule__BaseExpression__Alternatives_1
            {
            pushFollow(FOLLOW_rule__BaseExpression__Alternatives_1_in_rule__BaseExpression__Group__1__Impl1659);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:823:1: rule__BaseExpression__Group_1_1__0 : rule__BaseExpression__Group_1_1__0__Impl rule__BaseExpression__Group_1_1__1 ;
    public final void rule__BaseExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:827:1: ( rule__BaseExpression__Group_1_1__0__Impl rule__BaseExpression__Group_1_1__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:828:2: rule__BaseExpression__Group_1_1__0__Impl rule__BaseExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__0__Impl_in_rule__BaseExpression__Group_1_1__01693);
            rule__BaseExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__1_in_rule__BaseExpression__Group_1_1__01696);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:835:1: rule__BaseExpression__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__BaseExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:839:1: ( ( '(' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:840:1: ( '(' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:840:1: ( '(' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:841:1: '('
            {
             before(grammarAccess.getBaseExpressionAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,24,FOLLOW_24_in_rule__BaseExpression__Group_1_1__0__Impl1724); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:854:1: rule__BaseExpression__Group_1_1__1 : rule__BaseExpression__Group_1_1__1__Impl rule__BaseExpression__Group_1_1__2 ;
    public final void rule__BaseExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:858:1: ( rule__BaseExpression__Group_1_1__1__Impl rule__BaseExpression__Group_1_1__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:859:2: rule__BaseExpression__Group_1_1__1__Impl rule__BaseExpression__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__1__Impl_in_rule__BaseExpression__Group_1_1__11755);
            rule__BaseExpression__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__2_in_rule__BaseExpression__Group_1_1__11758);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:866:1: rule__BaseExpression__Group_1_1__1__Impl : ( ( rule__BaseExpression__RootExpressionAssignment_1_1_1 ) ) ;
    public final void rule__BaseExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:870:1: ( ( ( rule__BaseExpression__RootExpressionAssignment_1_1_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:871:1: ( ( rule__BaseExpression__RootExpressionAssignment_1_1_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:871:1: ( ( rule__BaseExpression__RootExpressionAssignment_1_1_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:872:1: ( rule__BaseExpression__RootExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getBaseExpressionAccess().getRootExpressionAssignment_1_1_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:873:1: ( rule__BaseExpression__RootExpressionAssignment_1_1_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:873:2: rule__BaseExpression__RootExpressionAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__BaseExpression__RootExpressionAssignment_1_1_1_in_rule__BaseExpression__Group_1_1__1__Impl1785);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:883:1: rule__BaseExpression__Group_1_1__2 : rule__BaseExpression__Group_1_1__2__Impl ;
    public final void rule__BaseExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:887:1: ( rule__BaseExpression__Group_1_1__2__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:888:2: rule__BaseExpression__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BaseExpression__Group_1_1__2__Impl_in_rule__BaseExpression__Group_1_1__21815);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:894:1: rule__BaseExpression__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__BaseExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:898:1: ( ( ')' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:899:1: ( ')' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:899:1: ( ')' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:900:1: ')'
            {
             before(grammarAccess.getBaseExpressionAccess().getRightParenthesisKeyword_1_1_2()); 
            match(input,25,FOLLOW_25_in_rule__BaseExpression__Group_1_1__2__Impl1843); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:919:1: rule__TimeConstraint__Group__0 : rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 ;
    public final void rule__TimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:923:1: ( rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:924:2: rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__0__Impl_in_rule__TimeConstraint__Group__01880);
            rule__TimeConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__1_in_rule__TimeConstraint__Group__01883);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:931:1: rule__TimeConstraint__Group__0__Impl : ( '@' ) ;
    public final void rule__TimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:935:1: ( ( '@' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:936:1: ( '@' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:936:1: ( '@' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:937:1: '@'
            {
             before(grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__TimeConstraint__Group__0__Impl1911); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:950:1: rule__TimeConstraint__Group__1 : rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 ;
    public final void rule__TimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:954:1: ( rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:955:2: rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__1__Impl_in_rule__TimeConstraint__Group__11942);
            rule__TimeConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__2_in_rule__TimeConstraint__Group__11945);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:962:1: rule__TimeConstraint__Group__1__Impl : ( ( rule__TimeConstraint__Event2Assignment_1 ) ) ;
    public final void rule__TimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:966:1: ( ( ( rule__TimeConstraint__Event2Assignment_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:967:1: ( ( rule__TimeConstraint__Event2Assignment_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:967:1: ( ( rule__TimeConstraint__Event2Assignment_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:968:1: ( rule__TimeConstraint__Event2Assignment_1 )
            {
             before(grammarAccess.getTimeConstraintAccess().getEvent2Assignment_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:969:1: ( rule__TimeConstraint__Event2Assignment_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:969:2: rule__TimeConstraint__Event2Assignment_1
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Event2Assignment_1_in_rule__TimeConstraint__Group__1__Impl1972);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:979:1: rule__TimeConstraint__Group__2 : rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3 ;
    public final void rule__TimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:983:1: ( rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:984:2: rule__TimeConstraint__Group__2__Impl rule__TimeConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__2__Impl_in_rule__TimeConstraint__Group__22002);
            rule__TimeConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__3_in_rule__TimeConstraint__Group__22005);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:991:1: rule__TimeConstraint__Group__2__Impl : ( '-' ) ;
    public final void rule__TimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:995:1: ( ( '-' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:996:1: ( '-' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:996:1: ( '-' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:997:1: '-'
            {
             before(grammarAccess.getTimeConstraintAccess().getHyphenMinusKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__TimeConstraint__Group__2__Impl2033); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1010:1: rule__TimeConstraint__Group__3 : rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4 ;
    public final void rule__TimeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1014:1: ( rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1015:2: rule__TimeConstraint__Group__3__Impl rule__TimeConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__3__Impl_in_rule__TimeConstraint__Group__32064);
            rule__TimeConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__4_in_rule__TimeConstraint__Group__32067);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1022:1: rule__TimeConstraint__Group__3__Impl : ( '@' ) ;
    public final void rule__TimeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1026:1: ( ( '@' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1027:1: ( '@' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1027:1: ( '@' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1028:1: '@'
            {
             before(grammarAccess.getTimeConstraintAccess().getCommercialAtKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__TimeConstraint__Group__3__Impl2095); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1041:1: rule__TimeConstraint__Group__4 : rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5 ;
    public final void rule__TimeConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1045:1: ( rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1046:2: rule__TimeConstraint__Group__4__Impl rule__TimeConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__4__Impl_in_rule__TimeConstraint__Group__42126);
            rule__TimeConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__5_in_rule__TimeConstraint__Group__42129);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1053:1: rule__TimeConstraint__Group__4__Impl : ( ( rule__TimeConstraint__Event1Assignment_4 ) ) ;
    public final void rule__TimeConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1057:1: ( ( ( rule__TimeConstraint__Event1Assignment_4 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1058:1: ( ( rule__TimeConstraint__Event1Assignment_4 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1058:1: ( ( rule__TimeConstraint__Event1Assignment_4 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1059:1: ( rule__TimeConstraint__Event1Assignment_4 )
            {
             before(grammarAccess.getTimeConstraintAccess().getEvent1Assignment_4()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1060:1: ( rule__TimeConstraint__Event1Assignment_4 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1060:2: rule__TimeConstraint__Event1Assignment_4
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Event1Assignment_4_in_rule__TimeConstraint__Group__4__Impl2156);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1070:1: rule__TimeConstraint__Group__5 : rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6 ;
    public final void rule__TimeConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1074:1: ( rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1075:2: rule__TimeConstraint__Group__5__Impl rule__TimeConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__5__Impl_in_rule__TimeConstraint__Group__52186);
            rule__TimeConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeConstraint__Group__6_in_rule__TimeConstraint__Group__52189);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1082:1: rule__TimeConstraint__Group__5__Impl : ( ( rule__TimeConstraint__OpAssignment_5 ) ) ;
    public final void rule__TimeConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1086:1: ( ( ( rule__TimeConstraint__OpAssignment_5 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1087:1: ( ( rule__TimeConstraint__OpAssignment_5 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1087:1: ( ( rule__TimeConstraint__OpAssignment_5 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1088:1: ( rule__TimeConstraint__OpAssignment_5 )
            {
             before(grammarAccess.getTimeConstraintAccess().getOpAssignment_5()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1089:1: ( rule__TimeConstraint__OpAssignment_5 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1089:2: rule__TimeConstraint__OpAssignment_5
            {
            pushFollow(FOLLOW_rule__TimeConstraint__OpAssignment_5_in_rule__TimeConstraint__Group__5__Impl2216);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1099:1: rule__TimeConstraint__Group__6 : rule__TimeConstraint__Group__6__Impl ;
    public final void rule__TimeConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1103:1: ( rule__TimeConstraint__Group__6__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1104:2: rule__TimeConstraint__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__TimeConstraint__Group__6__Impl_in_rule__TimeConstraint__Group__62246);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1110:1: rule__TimeConstraint__Group__6__Impl : ( ( rule__TimeConstraint__ValueAssignment_6 ) ) ;
    public final void rule__TimeConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1114:1: ( ( ( rule__TimeConstraint__ValueAssignment_6 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1115:1: ( ( rule__TimeConstraint__ValueAssignment_6 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1115:1: ( ( rule__TimeConstraint__ValueAssignment_6 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1116:1: ( rule__TimeConstraint__ValueAssignment_6 )
            {
             before(grammarAccess.getTimeConstraintAccess().getValueAssignment_6()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1117:1: ( rule__TimeConstraint__ValueAssignment_6 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1117:2: rule__TimeConstraint__ValueAssignment_6
            {
            pushFollow(FOLLOW_rule__TimeConstraint__ValueAssignment_6_in_rule__TimeConstraint__Group__6__Impl2273);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1141:1: rule__VariableCondition__Group__0 : rule__VariableCondition__Group__0__Impl rule__VariableCondition__Group__1 ;
    public final void rule__VariableCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1145:1: ( rule__VariableCondition__Group__0__Impl rule__VariableCondition__Group__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1146:2: rule__VariableCondition__Group__0__Impl rule__VariableCondition__Group__1
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__0__Impl_in_rule__VariableCondition__Group__02317);
            rule__VariableCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableCondition__Group__1_in_rule__VariableCondition__Group__02320);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1153:1: rule__VariableCondition__Group__0__Impl : ( '{' ) ;
    public final void rule__VariableCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1157:1: ( ( '{' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1158:1: ( '{' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1158:1: ( '{' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1159:1: '{'
            {
             before(grammarAccess.getVariableConditionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__VariableCondition__Group__0__Impl2348); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1172:1: rule__VariableCondition__Group__1 : rule__VariableCondition__Group__1__Impl rule__VariableCondition__Group__2 ;
    public final void rule__VariableCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1176:1: ( rule__VariableCondition__Group__1__Impl rule__VariableCondition__Group__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1177:2: rule__VariableCondition__Group__1__Impl rule__VariableCondition__Group__2
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__1__Impl_in_rule__VariableCondition__Group__12379);
            rule__VariableCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableCondition__Group__2_in_rule__VariableCondition__Group__12382);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1184:1: rule__VariableCondition__Group__1__Impl : ( ( rule__VariableCondition__VariableAssignment_1 ) ) ;
    public final void rule__VariableCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1188:1: ( ( ( rule__VariableCondition__VariableAssignment_1 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1189:1: ( ( rule__VariableCondition__VariableAssignment_1 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1189:1: ( ( rule__VariableCondition__VariableAssignment_1 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1190:1: ( rule__VariableCondition__VariableAssignment_1 )
            {
             before(grammarAccess.getVariableConditionAccess().getVariableAssignment_1()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1191:1: ( rule__VariableCondition__VariableAssignment_1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1191:2: rule__VariableCondition__VariableAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableCondition__VariableAssignment_1_in_rule__VariableCondition__Group__1__Impl2409);
            rule__VariableCondition__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableConditionAccess().getVariableAssignment_1()); 

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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1201:1: rule__VariableCondition__Group__2 : rule__VariableCondition__Group__2__Impl rule__VariableCondition__Group__3 ;
    public final void rule__VariableCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1205:1: ( rule__VariableCondition__Group__2__Impl rule__VariableCondition__Group__3 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1206:2: rule__VariableCondition__Group__2__Impl rule__VariableCondition__Group__3
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__2__Impl_in_rule__VariableCondition__Group__22439);
            rule__VariableCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableCondition__Group__3_in_rule__VariableCondition__Group__22442);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1213:1: rule__VariableCondition__Group__2__Impl : ( ( rule__VariableCondition__RelationAssignment_2 ) ) ;
    public final void rule__VariableCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1217:1: ( ( ( rule__VariableCondition__RelationAssignment_2 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1218:1: ( ( rule__VariableCondition__RelationAssignment_2 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1218:1: ( ( rule__VariableCondition__RelationAssignment_2 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1219:1: ( rule__VariableCondition__RelationAssignment_2 )
            {
             before(grammarAccess.getVariableConditionAccess().getRelationAssignment_2()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1220:1: ( rule__VariableCondition__RelationAssignment_2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1220:2: rule__VariableCondition__RelationAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableCondition__RelationAssignment_2_in_rule__VariableCondition__Group__2__Impl2469);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1230:1: rule__VariableCondition__Group__3 : rule__VariableCondition__Group__3__Impl rule__VariableCondition__Group__4 ;
    public final void rule__VariableCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1234:1: ( rule__VariableCondition__Group__3__Impl rule__VariableCondition__Group__4 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1235:2: rule__VariableCondition__Group__3__Impl rule__VariableCondition__Group__4
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__3__Impl_in_rule__VariableCondition__Group__32499);
            rule__VariableCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableCondition__Group__4_in_rule__VariableCondition__Group__32502);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1242:1: rule__VariableCondition__Group__3__Impl : ( ( rule__VariableCondition__Alternatives_3 ) ) ;
    public final void rule__VariableCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1246:1: ( ( ( rule__VariableCondition__Alternatives_3 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1247:1: ( ( rule__VariableCondition__Alternatives_3 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1247:1: ( ( rule__VariableCondition__Alternatives_3 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1248:1: ( rule__VariableCondition__Alternatives_3 )
            {
             before(grammarAccess.getVariableConditionAccess().getAlternatives_3()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1249:1: ( rule__VariableCondition__Alternatives_3 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1249:2: rule__VariableCondition__Alternatives_3
            {
            pushFollow(FOLLOW_rule__VariableCondition__Alternatives_3_in_rule__VariableCondition__Group__3__Impl2529);
            rule__VariableCondition__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableConditionAccess().getAlternatives_3()); 

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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1259:1: rule__VariableCondition__Group__4 : rule__VariableCondition__Group__4__Impl ;
    public final void rule__VariableCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1263:1: ( rule__VariableCondition__Group__4__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1264:2: rule__VariableCondition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VariableCondition__Group__4__Impl_in_rule__VariableCondition__Group__42559);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1270:1: rule__VariableCondition__Group__4__Impl : ( '}' ) ;
    public final void rule__VariableCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1274:1: ( ( '}' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1275:1: ( '}' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1275:1: ( '}' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1276:1: '}'
            {
             before(grammarAccess.getVariableConditionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__VariableCondition__Group__4__Impl2587); 
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


    // $ANTLR start "rule__Event__Group_0__0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1299:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1303:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1304:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
            {
            pushFollow(FOLLOW_rule__Event__Group_0__0__Impl_in_rule__Event__Group_0__02628);
            rule__Event__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_0__1_in_rule__Event__Group_0__02631);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1311:1: rule__Event__Group_0__0__Impl : ( ( rule__Event__EventNameAssignment_0_0 ) ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1315:1: ( ( ( rule__Event__EventNameAssignment_0_0 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1316:1: ( ( rule__Event__EventNameAssignment_0_0 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1316:1: ( ( rule__Event__EventNameAssignment_0_0 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1317:1: ( rule__Event__EventNameAssignment_0_0 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_0_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1318:1: ( rule__Event__EventNameAssignment_0_0 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1318:2: rule__Event__EventNameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Event__EventNameAssignment_0_0_in_rule__Event__Group_0__0__Impl2658);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1328:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl rule__Event__Group_0__2 ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1332:1: ( rule__Event__Group_0__1__Impl rule__Event__Group_0__2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1333:2: rule__Event__Group_0__1__Impl rule__Event__Group_0__2
            {
            pushFollow(FOLLOW_rule__Event__Group_0__1__Impl_in_rule__Event__Group_0__12688);
            rule__Event__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_0__2_in_rule__Event__Group_0__12691);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1340:1: rule__Event__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1344:1: ( ( '.' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1345:1: ( '.' )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1345:1: ( '.' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1346:1: '.'
            {
             before(grammarAccess.getEventAccess().getFullStopKeyword_0_1()); 
            match(input,30,FOLLOW_30_in_rule__Event__Group_0__1__Impl2719); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1359:1: rule__Event__Group_0__2 : rule__Event__Group_0__2__Impl ;
    public final void rule__Event__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1363:1: ( rule__Event__Group_0__2__Impl )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1364:2: rule__Event__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_0__2__Impl_in_rule__Event__Group_0__22750);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1370:1: rule__Event__Group_0__2__Impl : ( ( rule__Event__EventExtensionAssignment_0_2 ) ) ;
    public final void rule__Event__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1374:1: ( ( ( rule__Event__EventExtensionAssignment_0_2 ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1375:1: ( ( rule__Event__EventExtensionAssignment_0_2 ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1375:1: ( ( rule__Event__EventExtensionAssignment_0_2 ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1376:1: ( rule__Event__EventExtensionAssignment_0_2 )
            {
             before(grammarAccess.getEventAccess().getEventExtensionAssignment_0_2()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1377:1: ( rule__Event__EventExtensionAssignment_0_2 )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1377:2: rule__Event__EventExtensionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Event__EventExtensionAssignment_0_2_in_rule__Event__Group_0__2__Impl2777);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1394:1: rule__Model__ExpressionAssignment : ( ruleOrExpression ) ;
    public final void rule__Model__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1398:1: ( ( ruleOrExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1399:1: ( ruleOrExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1399:1: ( ruleOrExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1400:1: ruleOrExpression
            {
             before(grammarAccess.getModelAccess().getExpressionOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__Model__ExpressionAssignment2818);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1409:1: rule__OrExpression__LeftExpressionAssignment_0 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__LeftExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1413:1: ( ( ruleAndExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1414:1: ( ruleAndExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1414:1: ( ruleAndExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1415:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getLeftExpressionAndExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__LeftExpressionAssignment_02849);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1424:1: rule__OrExpression__OrAssignment_1_0 : ( RULE_OR ) ;
    public final void rule__OrExpression__OrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1428:1: ( ( RULE_OR ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1429:1: ( RULE_OR )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1429:1: ( RULE_OR )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1430:1: RULE_OR
            {
             before(grammarAccess.getOrExpressionAccess().getOrORTerminalRuleCall_1_0_0()); 
            match(input,RULE_OR,FOLLOW_RULE_OR_in_rule__OrExpression__OrAssignment_1_02880); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1439:1: rule__OrExpression__RightExpressionAssignment_1_1 : ( ruleOrExpression ) ;
    public final void rule__OrExpression__RightExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1443:1: ( ( ruleOrExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1444:1: ( ruleOrExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1444:1: ( ruleOrExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1445:1: ruleOrExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightExpressionOrExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__OrExpression__RightExpressionAssignment_1_12911);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1454:1: rule__AndExpression__LeftExpressionAssignment_0 : ( ruleBaseExpression ) ;
    public final void rule__AndExpression__LeftExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1458:1: ( ( ruleBaseExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1459:1: ( ruleBaseExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1459:1: ( ruleBaseExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1460:1: ruleBaseExpression
            {
             before(grammarAccess.getAndExpressionAccess().getLeftExpressionBaseExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBaseExpression_in_rule__AndExpression__LeftExpressionAssignment_02942);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1469:1: rule__AndExpression__AndAssignment_1_0 : ( RULE_AND ) ;
    public final void rule__AndExpression__AndAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1473:1: ( ( RULE_AND ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1474:1: ( RULE_AND )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1474:1: ( RULE_AND )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1475:1: RULE_AND
            {
             before(grammarAccess.getAndExpressionAccess().getAndANDTerminalRuleCall_1_0_0()); 
            match(input,RULE_AND,FOLLOW_RULE_AND_in_rule__AndExpression__AndAssignment_1_02973); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1484:1: rule__AndExpression__RightExpressionAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__AndExpression__RightExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1488:1: ( ( ruleAndExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1489:1: ( ruleAndExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1489:1: ( ruleAndExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1490:1: ruleAndExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightExpressionAndExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__AndExpression__RightExpressionAssignment_1_13004);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1499:1: rule__BaseExpression__NotAssignment_0 : ( RULE_NOT ) ;
    public final void rule__BaseExpression__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1503:1: ( ( RULE_NOT ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1504:1: ( RULE_NOT )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1504:1: ( RULE_NOT )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1505:1: RULE_NOT
            {
             before(grammarAccess.getBaseExpressionAccess().getNotNOTTerminalRuleCall_0_0()); 
            match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rule__BaseExpression__NotAssignment_03035); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1514:1: rule__BaseExpression__BooleanTermAssignment_1_0 : ( rulebooleanTerm ) ;
    public final void rule__BaseExpression__BooleanTermAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1518:1: ( ( rulebooleanTerm ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1519:1: ( rulebooleanTerm )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1519:1: ( rulebooleanTerm )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1520:1: rulebooleanTerm
            {
             before(grammarAccess.getBaseExpressionAccess().getBooleanTermBooleanTermParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulebooleanTerm_in_rule__BaseExpression__BooleanTermAssignment_1_03066);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1529:1: rule__BaseExpression__RootExpressionAssignment_1_1_1 : ( ruleOrExpression ) ;
    public final void rule__BaseExpression__RootExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1533:1: ( ( ruleOrExpression ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1534:1: ( ruleOrExpression )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1534:1: ( ruleOrExpression )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1535:1: ruleOrExpression
            {
             before(grammarAccess.getBaseExpressionAccess().getRootExpressionOrExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__BaseExpression__RootExpressionAssignment_1_1_13097);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1544:1: rule__BooleanTerm__TimeConstraintAssignment_0 : ( ruleTimeConstraint ) ;
    public final void rule__BooleanTerm__TimeConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1548:1: ( ( ruleTimeConstraint ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1549:1: ( ruleTimeConstraint )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1549:1: ( ruleTimeConstraint )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1550:1: ruleTimeConstraint
            {
             before(grammarAccess.getBooleanTermAccess().getTimeConstraintTimeConstraintParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTimeConstraint_in_rule__BooleanTerm__TimeConstraintAssignment_03128);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1559:1: rule__BooleanTerm__BooleanVariableAssignment_1 : ( ruleBooleanVariable ) ;
    public final void rule__BooleanTerm__BooleanVariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1563:1: ( ( ruleBooleanVariable ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1564:1: ( ruleBooleanVariable )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1564:1: ( ruleBooleanVariable )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1565:1: ruleBooleanVariable
            {
             before(grammarAccess.getBooleanTermAccess().getBooleanVariableBooleanVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBooleanVariable_in_rule__BooleanTerm__BooleanVariableAssignment_13159);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1574:1: rule__BooleanTerm__VariableConditionAssignment_2 : ( ruleVariableCondition ) ;
    public final void rule__BooleanTerm__VariableConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1578:1: ( ( ruleVariableCondition ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1579:1: ( ruleVariableCondition )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1579:1: ( ruleVariableCondition )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1580:1: ruleVariableCondition
            {
             before(grammarAccess.getBooleanTermAccess().getVariableConditionVariableConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariableCondition_in_rule__BooleanTerm__VariableConditionAssignment_23190);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1589:1: rule__TimeConstraint__Event2Assignment_1 : ( ruleEvent ) ;
    public final void rule__TimeConstraint__Event2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1593:1: ( ( ruleEvent ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1594:1: ( ruleEvent )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1594:1: ( ruleEvent )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1595:1: ruleEvent
            {
             before(grammarAccess.getTimeConstraintAccess().getEvent2EventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__TimeConstraint__Event2Assignment_13221);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1604:1: rule__TimeConstraint__Event1Assignment_4 : ( ruleEvent ) ;
    public final void rule__TimeConstraint__Event1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1608:1: ( ( ruleEvent ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1609:1: ( ruleEvent )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1609:1: ( ruleEvent )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1610:1: ruleEvent
            {
             before(grammarAccess.getTimeConstraintAccess().getEvent1EventParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__TimeConstraint__Event1Assignment_43252);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1619:1: rule__TimeConstraint__OpAssignment_5 : ( RULE_RELATIONS ) ;
    public final void rule__TimeConstraint__OpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1623:1: ( ( RULE_RELATIONS ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1624:1: ( RULE_RELATIONS )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1624:1: ( RULE_RELATIONS )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1625:1: RULE_RELATIONS
            {
             before(grammarAccess.getTimeConstraintAccess().getOpRELATIONSTerminalRuleCall_5_0()); 
            match(input,RULE_RELATIONS,FOLLOW_RULE_RELATIONS_in_rule__TimeConstraint__OpAssignment_53283); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1634:1: rule__TimeConstraint__ValueAssignment_6 : ( RULE_INT ) ;
    public final void rule__TimeConstraint__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1638:1: ( ( RULE_INT ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1639:1: ( RULE_INT )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1639:1: ( RULE_INT )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1640:1: RULE_INT
            {
             before(grammarAccess.getTimeConstraintAccess().getValueINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TimeConstraint__ValueAssignment_63314); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1649:1: rule__BooleanVariable__VariableAssignment : ( RULE_ID ) ;
    public final void rule__BooleanVariable__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1653:1: ( ( RULE_ID ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1654:1: ( RULE_ID )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1654:1: ( RULE_ID )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1655:1: RULE_ID
            {
             before(grammarAccess.getBooleanVariableAccess().getVariableIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BooleanVariable__VariableAssignment3345); 
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


    // $ANTLR start "rule__VariableCondition__VariableAssignment_1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1664:1: rule__VariableCondition__VariableAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableCondition__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1668:1: ( ( RULE_ID ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1669:1: ( RULE_ID )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1669:1: ( RULE_ID )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1670:1: RULE_ID
            {
             before(grammarAccess.getVariableConditionAccess().getVariableIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableCondition__VariableAssignment_13376); 
             after(grammarAccess.getVariableConditionAccess().getVariableIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VariableCondition__VariableAssignment_1"


    // $ANTLR start "rule__VariableCondition__RelationAssignment_2"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1679:1: rule__VariableCondition__RelationAssignment_2 : ( RULE_RELATIONS ) ;
    public final void rule__VariableCondition__RelationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1683:1: ( ( RULE_RELATIONS ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1684:1: ( RULE_RELATIONS )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1684:1: ( RULE_RELATIONS )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1685:1: RULE_RELATIONS
            {
             before(grammarAccess.getVariableConditionAccess().getRelationRELATIONSTerminalRuleCall_2_0()); 
            match(input,RULE_RELATIONS,FOLLOW_RULE_RELATIONS_in_rule__VariableCondition__RelationAssignment_23407); 
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


    // $ANTLR start "rule__VariableCondition__ValueAssignment_3_0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1694:1: rule__VariableCondition__ValueAssignment_3_0 : ( RULE_INT ) ;
    public final void rule__VariableCondition__ValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1698:1: ( ( RULE_INT ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1699:1: ( RULE_INT )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1699:1: ( RULE_INT )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1700:1: RULE_INT
            {
             before(grammarAccess.getVariableConditionAccess().getValueINTTerminalRuleCall_3_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VariableCondition__ValueAssignment_3_03438); 
             after(grammarAccess.getVariableConditionAccess().getValueINTTerminalRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__VariableCondition__ValueAssignment_3_0"


    // $ANTLR start "rule__VariableCondition__RightVariableAssignment_3_1"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1709:1: rule__VariableCondition__RightVariableAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__VariableCondition__RightVariableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1713:1: ( ( RULE_ID ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1714:1: ( RULE_ID )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1714:1: ( RULE_ID )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1715:1: RULE_ID
            {
             before(grammarAccess.getVariableConditionAccess().getRightVariableIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableCondition__RightVariableAssignment_3_13469); 
             after(grammarAccess.getVariableConditionAccess().getRightVariableIDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__VariableCondition__RightVariableAssignment_3_1"


    // $ANTLR start "rule__Event__EventNameAssignment_0_0"
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1724:1: rule__Event__EventNameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1728:1: ( ( RULE_ID ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1729:1: ( RULE_ID )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1729:1: ( RULE_ID )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1730:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_0_03500); 
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1739:1: rule__Event__EventExtensionAssignment_0_2 : ( ruleEventExtensions ) ;
    public final void rule__Event__EventExtensionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1743:1: ( ( ruleEventExtensions ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1744:1: ( ruleEventExtensions )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1744:1: ( ruleEventExtensions )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1745:1: ruleEventExtensions
            {
             before(grammarAccess.getEventAccess().getEventExtensionEventExtensionsParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleEventExtensions_in_rule__Event__EventExtensionAssignment_0_23531);
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
    // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1754:1: rule__Event__NowEventAssignment_1 : ( ( 'now' ) ) ;
    public final void rule__Event__NowEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1758:1: ( ( ( 'now' ) ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1759:1: ( ( 'now' ) )
            {
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1759:1: ( ( 'now' ) )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1760:1: ( 'now' )
            {
             before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1761:1: ( 'now' )
            // ../org.correttouml.grammars.booleanexpressions.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalBooleanExpressions.g:1762:1: 'now'
            {
             before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Event__NowEventAssignment_13567); 
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
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Alternatives_in_ruleEvent574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_entryRuleEventExtensions601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventExtensions608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExtensions__Alternatives_in_ruleEventExtensions634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__BooleanTermAssignment_1_0_in_rule__BaseExpression__Alternatives_1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__0_in_rule__BaseExpression__Alternatives_1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanTerm__TimeConstraintAssignment_0_in_rule__BooleanTerm__Alternatives721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanTerm__BooleanVariableAssignment_1_in_rule__BooleanTerm__Alternatives739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanTerm__VariableConditionAssignment_2_in_rule__BooleanTerm__Alternatives757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__ValueAssignment_3_0_in_rule__VariableCondition__Alternatives_3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__RightVariableAssignment_3_1_in_rule__VariableCondition__Alternatives_3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__0_in_rule__Event__Alternatives841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NowEventAssignment_1_in_rule__Event__Alternatives859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EventExtensions__Alternatives893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EventExtensions__Alternatives913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EventExtensions__Alternatives933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EventExtensions__Alternatives953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EventExtensions__Alternatives973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EventExtensions__Alternatives993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EventExtensions__Alternatives1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EventExtensions__Alternatives1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EventExtensions__Alternatives1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__01085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__01088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__LeftExpressionAssignment_0_in_rule__OrExpression__Group__0__Impl1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__11145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__01207 = new BitSet(new long[]{0x0000000015000240L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__01210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__OrAssignment_1_0_in_rule__OrExpression__Group_1__0__Impl1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__11267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__RightExpressionAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__01328 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__01331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__LeftExpressionAssignment_0_in_rule__AndExpression__Group__0__Impl1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__11388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__01450 = new BitSet(new long[]{0x0000000015000240L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__01453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__AndAssignment_1_0_in_rule__AndExpression__Group_1__0__Impl1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__11510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__RightExpressionAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group__0__Impl_in_rule__BaseExpression__Group__01571 = new BitSet(new long[]{0x0000000015000240L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group__1_in_rule__BaseExpression__Group__01574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__NotAssignment_0_in_rule__BaseExpression__Group__0__Impl1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group__1__Impl_in_rule__BaseExpression__Group__11632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Alternatives_1_in_rule__BaseExpression__Group__1__Impl1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__0__Impl_in_rule__BaseExpression__Group_1_1__01693 = new BitSet(new long[]{0x0000000015000240L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__1_in_rule__BaseExpression__Group_1_1__01696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BaseExpression__Group_1_1__0__Impl1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__1__Impl_in_rule__BaseExpression__Group_1_1__11755 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__2_in_rule__BaseExpression__Group_1_1__11758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__RootExpressionAssignment_1_1_1_in_rule__BaseExpression__Group_1_1__1__Impl1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseExpression__Group_1_1__2__Impl_in_rule__BaseExpression__Group_1_1__21815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BaseExpression__Group_1_1__2__Impl1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__0__Impl_in_rule__TimeConstraint__Group__01880 = new BitSet(new long[]{0x0000000080000200L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__1_in_rule__TimeConstraint__Group__01883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TimeConstraint__Group__0__Impl1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__1__Impl_in_rule__TimeConstraint__Group__11942 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__2_in_rule__TimeConstraint__Group__11945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Event2Assignment_1_in_rule__TimeConstraint__Group__1__Impl1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__2__Impl_in_rule__TimeConstraint__Group__22002 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__3_in_rule__TimeConstraint__Group__22005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TimeConstraint__Group__2__Impl2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__3__Impl_in_rule__TimeConstraint__Group__32064 = new BitSet(new long[]{0x0000000080000200L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__4_in_rule__TimeConstraint__Group__32067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TimeConstraint__Group__3__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__4__Impl_in_rule__TimeConstraint__Group__42126 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__5_in_rule__TimeConstraint__Group__42129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Event1Assignment_4_in_rule__TimeConstraint__Group__4__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__5__Impl_in_rule__TimeConstraint__Group__52186 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__6_in_rule__TimeConstraint__Group__52189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__OpAssignment_5_in_rule__TimeConstraint__Group__5__Impl2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__Group__6__Impl_in_rule__TimeConstraint__Group__62246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeConstraint__ValueAssignment_6_in_rule__TimeConstraint__Group__6__Impl2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__0__Impl_in_rule__VariableCondition__Group__02317 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__1_in_rule__VariableCondition__Group__02320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VariableCondition__Group__0__Impl2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__1__Impl_in_rule__VariableCondition__Group__12379 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__2_in_rule__VariableCondition__Group__12382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__VariableAssignment_1_in_rule__VariableCondition__Group__1__Impl2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__2__Impl_in_rule__VariableCondition__Group__22439 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__3_in_rule__VariableCondition__Group__22442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__RelationAssignment_2_in_rule__VariableCondition__Group__2__Impl2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__3__Impl_in_rule__VariableCondition__Group__32499 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__4_in_rule__VariableCondition__Group__32502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Alternatives_3_in_rule__VariableCondition__Group__3__Impl2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableCondition__Group__4__Impl_in_rule__VariableCondition__Group__42559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VariableCondition__Group__4__Impl2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__0__Impl_in_rule__Event__Group_0__02628 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Event__Group_0__1_in_rule__Event__Group_0__02631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventNameAssignment_0_0_in_rule__Event__Group_0__0__Impl2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__1__Impl_in_rule__Event__Group_0__12688 = new BitSet(new long[]{0x0000000000FF8000L});
    public static final BitSet FOLLOW_rule__Event__Group_0__2_in_rule__Event__Group_0__12691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Event__Group_0__1__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__2__Impl_in_rule__Event__Group_0__22750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventExtensionAssignment_0_2_in_rule__Event__Group_0__2__Impl2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__Model__ExpressionAssignment2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__LeftExpressionAssignment_02849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_rule__OrExpression__OrAssignment_1_02880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__OrExpression__RightExpressionAssignment_1_12911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseExpression_in_rule__AndExpression__LeftExpressionAssignment_02942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_in_rule__AndExpression__AndAssignment_1_02973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__AndExpression__RightExpressionAssignment_1_13004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_rule__BaseExpression__NotAssignment_03035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebooleanTerm_in_rule__BaseExpression__BooleanTermAssignment_1_03066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__BaseExpression__RootExpressionAssignment_1_1_13097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeConstraint_in_rule__BooleanTerm__TimeConstraintAssignment_03128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanVariable_in_rule__BooleanTerm__BooleanVariableAssignment_13159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableCondition_in_rule__BooleanTerm__VariableConditionAssignment_23190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__TimeConstraint__Event2Assignment_13221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__TimeConstraint__Event1Assignment_43252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONS_in_rule__TimeConstraint__OpAssignment_53283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TimeConstraint__ValueAssignment_63314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BooleanVariable__VariableAssignment3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableCondition__VariableAssignment_13376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONS_in_rule__VariableCondition__RelationAssignment_23407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VariableCondition__ValueAssignment_3_03438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableCondition__RightVariableAssignment_3_13469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_0_03500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_rule__Event__EventExtensionAssignment_0_23531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Event__NowEventAssignment_13567 = new BitSet(new long[]{0x0000000000000002L});

}