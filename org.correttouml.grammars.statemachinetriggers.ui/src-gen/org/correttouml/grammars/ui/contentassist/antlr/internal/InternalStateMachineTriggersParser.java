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
import org.correttouml.grammars.services.StateMachineTriggersGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineTriggersParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RELATIONS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'exit'", "'enter'", "'start'", "'end'", "'tick'", "'sig'", "'call'", "'@'", "'-'", "'.'", "'self'", "'now'"
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
    public String getGrammarFileName() { return "../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g"; }


     
     	private StateMachineTriggersGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(StateMachineTriggersGrammarAccess grammarAccess) {
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:61:1: ( ruleModel EOF )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:62:1: ruleModel EOF
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:69:1: ruleModel : ( ( rule__Model__TriggerAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:73:2: ( ( ( rule__Model__TriggerAssignment ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:74:1: ( ( rule__Model__TriggerAssignment ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:74:1: ( ( rule__Model__TriggerAssignment ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:75:1: ( rule__Model__TriggerAssignment )
            {
             before(grammarAccess.getModelAccess().getTriggerAssignment()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:76:1: ( rule__Model__TriggerAssignment )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:76:2: rule__Model__TriggerAssignment
            {
            pushFollow(FOLLOW_rule__Model__TriggerAssignment_in_ruleModel94);
            rule__Model__TriggerAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTriggerAssignment()); 

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


    // $ANTLR start "entryRuleTrigger"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:88:1: entryRuleTrigger : ruleTrigger EOF ;
    public final void entryRuleTrigger() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:89:1: ( ruleTrigger EOF )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:90:1: ruleTrigger EOF
            {
             before(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_ruleTrigger_in_entryRuleTrigger121);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getTriggerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrigger128); 

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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:97:1: ruleTrigger : ( ( rule__Trigger__Group__0 ) ) ;
    public final void ruleTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:101:2: ( ( ( rule__Trigger__Group__0 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:102:1: ( ( rule__Trigger__Group__0 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:102:1: ( ( rule__Trigger__Group__0 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:103:1: ( rule__Trigger__Group__0 )
            {
             before(grammarAccess.getTriggerAccess().getGroup()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:104:1: ( rule__Trigger__Group__0 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:104:2: rule__Trigger__Group__0
            {
            pushFollow(FOLLOW_rule__Trigger__Group__0_in_ruleTrigger154);
            rule__Trigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getGroup()); 

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleLeft"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:116:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:117:1: ( ruleLeft EOF )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:118:1: ruleLeft EOF
            {
             before(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_ruleLeft_in_entryRuleLeft181);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getLeftRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeft188); 

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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:125:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:129:2: ( ( ( rule__Left__Group__0 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:130:1: ( ( rule__Left__Group__0 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:130:1: ( ( rule__Left__Group__0 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:131:1: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:132:1: ( rule__Left__Group__0 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:132:2: rule__Left__Group__0
            {
            pushFollow(FOLLOW_rule__Left__Group__0_in_ruleLeft214);
            rule__Left__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getGroup()); 

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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:144:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:145:1: ( ruleRight EOF )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:146:1: ruleRight EOF
            {
             before(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_ruleRight_in_entryRuleRight241);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getRightRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRight248); 

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
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:153:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:157:2: ( ( ( rule__Right__Group__0 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:158:1: ( ( rule__Right__Group__0 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:158:1: ( ( rule__Right__Group__0 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:159:1: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:160:1: ( rule__Right__Group__0 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:160:2: rule__Right__Group__0
            {
            pushFollow(FOLLOW_rule__Right__Group__0_in_ruleRight274);
            rule__Right__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getGroup()); 

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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleEvent"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:172:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:173:1: ( ruleEvent EOF )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:174:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent301);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent308); 

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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:181:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:185:2: ( ( ( rule__Event__Alternatives ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:186:1: ( ( rule__Event__Alternatives ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:186:1: ( ( rule__Event__Alternatives ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:187:1: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:188:1: ( rule__Event__Alternatives )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:188:2: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_rule__Event__Alternatives_in_ruleEvent334);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:200:1: entryRuleEventExtensions : ruleEventExtensions EOF ;
    public final void entryRuleEventExtensions() throws RecognitionException {
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:201:1: ( ruleEventExtensions EOF )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:202:1: ruleEventExtensions EOF
            {
             before(grammarAccess.getEventExtensionsRule()); 
            pushFollow(FOLLOW_ruleEventExtensions_in_entryRuleEventExtensions361);
            ruleEventExtensions();

            state._fsp--;

             after(grammarAccess.getEventExtensionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventExtensions368); 

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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:209:1: ruleEventExtensions : ( ( rule__EventExtensions__Alternatives ) ) ;
    public final void ruleEventExtensions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:213:2: ( ( ( rule__EventExtensions__Alternatives ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:214:1: ( ( rule__EventExtensions__Alternatives ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:214:1: ( ( rule__EventExtensions__Alternatives ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:215:1: ( rule__EventExtensions__Alternatives )
            {
             before(grammarAccess.getEventExtensionsAccess().getAlternatives()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:216:1: ( rule__EventExtensions__Alternatives )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:216:2: rule__EventExtensions__Alternatives
            {
            pushFollow(FOLLOW_rule__EventExtensions__Alternatives_in_ruleEventExtensions394);
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


    // $ANTLR start "rule__Left__Alternatives_0"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:228:1: rule__Left__Alternatives_0 : ( ( ( rule__Left__LinkNameAssignment_0_0 ) ) | ( ( rule__Left__SelfAssignment_0_1 ) ) );
    public final void rule__Left__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:232:1: ( ( ( rule__Left__LinkNameAssignment_0_0 ) ) | ( ( rule__Left__SelfAssignment_0_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:233:1: ( ( rule__Left__LinkNameAssignment_0_0 ) )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:233:1: ( ( rule__Left__LinkNameAssignment_0_0 ) )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:234:1: ( rule__Left__LinkNameAssignment_0_0 )
                    {
                     before(grammarAccess.getLeftAccess().getLinkNameAssignment_0_0()); 
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:235:1: ( rule__Left__LinkNameAssignment_0_0 )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:235:2: rule__Left__LinkNameAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Left__LinkNameAssignment_0_0_in_rule__Left__Alternatives_0430);
                    rule__Left__LinkNameAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLeftAccess().getLinkNameAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:239:6: ( ( rule__Left__SelfAssignment_0_1 ) )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:239:6: ( ( rule__Left__SelfAssignment_0_1 ) )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:240:1: ( rule__Left__SelfAssignment_0_1 )
                    {
                     before(grammarAccess.getLeftAccess().getSelfAssignment_0_1()); 
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:241:1: ( rule__Left__SelfAssignment_0_1 )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:241:2: rule__Left__SelfAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Left__SelfAssignment_0_1_in_rule__Left__Alternatives_0448);
                    rule__Left__SelfAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLeftAccess().getSelfAssignment_0_1()); 

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
    // $ANTLR end "rule__Left__Alternatives_0"


    // $ANTLR start "rule__Event__Alternatives"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:250:1: rule__Event__Alternatives : ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__NowEventAssignment_1 ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:254:1: ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__NowEventAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:255:1: ( ( rule__Event__Group_0__0 ) )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:255:1: ( ( rule__Event__Group_0__0 ) )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:256:1: ( rule__Event__Group_0__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_0()); 
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:257:1: ( rule__Event__Group_0__0 )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:257:2: rule__Event__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_0__0_in_rule__Event__Alternatives481);
                    rule__Event__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:261:6: ( ( rule__Event__NowEventAssignment_1 ) )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:261:6: ( ( rule__Event__NowEventAssignment_1 ) )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:262:1: ( rule__Event__NowEventAssignment_1 )
                    {
                     before(grammarAccess.getEventAccess().getNowEventAssignment_1()); 
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:263:1: ( rule__Event__NowEventAssignment_1 )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:263:2: rule__Event__NowEventAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Event__NowEventAssignment_1_in_rule__Event__Alternatives499);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:272:1: rule__EventExtensions__Alternatives : ( ( 'exit' ) | ( 'enter' ) | ( 'start' ) | ( 'end' ) | ( 'tick' ) | ( 'sig' ) | ( 'call' ) );
    public final void rule__EventExtensions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:276:1: ( ( 'exit' ) | ( 'enter' ) | ( 'start' ) | ( 'end' ) | ( 'tick' ) | ( 'sig' ) | ( 'call' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:277:1: ( 'exit' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:277:1: ( 'exit' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:278:1: 'exit'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__EventExtensions__Alternatives533); 
                     after(grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:285:6: ( 'enter' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:285:6: ( 'enter' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:286:1: 'enter'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__EventExtensions__Alternatives553); 
                     after(grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:293:6: ( 'start' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:293:6: ( 'start' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:294:1: 'start'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__EventExtensions__Alternatives573); 
                     after(grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:301:6: ( 'end' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:301:6: ( 'end' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:302:1: 'end'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__EventExtensions__Alternatives593); 
                     after(grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:309:6: ( 'tick' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:309:6: ( 'tick' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:310:1: 'tick'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); 
                    match(input,16,FOLLOW_16_in_rule__EventExtensions__Alternatives613); 
                     after(grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:317:6: ( 'sig' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:317:6: ( 'sig' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:318:1: 'sig'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); 
                    match(input,17,FOLLOW_17_in_rule__EventExtensions__Alternatives633); 
                     after(grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:325:6: ( 'call' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:325:6: ( 'call' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:326:1: 'call'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); 
                    match(input,18,FOLLOW_18_in_rule__EventExtensions__Alternatives653); 
                     after(grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); 

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


    // $ANTLR start "rule__Trigger__Group__0"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:340:1: rule__Trigger__Group__0 : rule__Trigger__Group__0__Impl rule__Trigger__Group__1 ;
    public final void rule__Trigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:344:1: ( rule__Trigger__Group__0__Impl rule__Trigger__Group__1 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:345:2: rule__Trigger__Group__0__Impl rule__Trigger__Group__1
            {
            pushFollow(FOLLOW_rule__Trigger__Group__0__Impl_in_rule__Trigger__Group__0685);
            rule__Trigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trigger__Group__1_in_rule__Trigger__Group__0688);
            rule__Trigger__Group__1();

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
    // $ANTLR end "rule__Trigger__Group__0"


    // $ANTLR start "rule__Trigger__Group__0__Impl"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:352:1: rule__Trigger__Group__0__Impl : ( ( rule__Trigger__LeftAssignment_0 ) ) ;
    public final void rule__Trigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:356:1: ( ( ( rule__Trigger__LeftAssignment_0 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:357:1: ( ( rule__Trigger__LeftAssignment_0 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:357:1: ( ( rule__Trigger__LeftAssignment_0 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:358:1: ( rule__Trigger__LeftAssignment_0 )
            {
             before(grammarAccess.getTriggerAccess().getLeftAssignment_0()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:359:1: ( rule__Trigger__LeftAssignment_0 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:359:2: rule__Trigger__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Trigger__LeftAssignment_0_in_rule__Trigger__Group__0__Impl715);
            rule__Trigger__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__Trigger__Group__0__Impl"


    // $ANTLR start "rule__Trigger__Group__1"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:369:1: rule__Trigger__Group__1 : rule__Trigger__Group__1__Impl ;
    public final void rule__Trigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:373:1: ( rule__Trigger__Group__1__Impl )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:374:2: rule__Trigger__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Trigger__Group__1__Impl_in_rule__Trigger__Group__1745);
            rule__Trigger__Group__1__Impl();

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
    // $ANTLR end "rule__Trigger__Group__1"


    // $ANTLR start "rule__Trigger__Group__1__Impl"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:380:1: rule__Trigger__Group__1__Impl : ( ( rule__Trigger__RightAssignment_1 )? ) ;
    public final void rule__Trigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:384:1: ( ( ( rule__Trigger__RightAssignment_1 )? ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:385:1: ( ( rule__Trigger__RightAssignment_1 )? )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:385:1: ( ( rule__Trigger__RightAssignment_1 )? )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:386:1: ( rule__Trigger__RightAssignment_1 )?
            {
             before(grammarAccess.getTriggerAccess().getRightAssignment_1()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:387:1: ( rule__Trigger__RightAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:387:2: rule__Trigger__RightAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Trigger__RightAssignment_1_in_rule__Trigger__Group__1__Impl772);
                    rule__Trigger__RightAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTriggerAccess().getRightAssignment_1()); 

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
    // $ANTLR end "rule__Trigger__Group__1__Impl"


    // $ANTLR start "rule__Left__Group__0"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:401:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:405:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:406:2: rule__Left__Group__0__Impl rule__Left__Group__1
            {
            pushFollow(FOLLOW_rule__Left__Group__0__Impl_in_rule__Left__Group__0807);
            rule__Left__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Left__Group__1_in_rule__Left__Group__0810);
            rule__Left__Group__1();

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
    // $ANTLR end "rule__Left__Group__0"


    // $ANTLR start "rule__Left__Group__0__Impl"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:413:1: rule__Left__Group__0__Impl : ( ( rule__Left__Alternatives_0 )? ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:417:1: ( ( ( rule__Left__Alternatives_0 )? ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:418:1: ( ( rule__Left__Alternatives_0 )? )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:418:1: ( ( rule__Left__Alternatives_0 )? )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:419:1: ( rule__Left__Alternatives_0 )?
            {
             before(grammarAccess.getLeftAccess().getAlternatives_0()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:420:1: ( rule__Left__Alternatives_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:420:2: rule__Left__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__Left__Alternatives_0_in_rule__Left__Group__0__Impl837);
                    rule__Left__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeftAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Left__Group__0__Impl"


    // $ANTLR start "rule__Left__Group__1"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:430:1: rule__Left__Group__1 : rule__Left__Group__1__Impl rule__Left__Group__2 ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:434:1: ( rule__Left__Group__1__Impl rule__Left__Group__2 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:435:2: rule__Left__Group__1__Impl rule__Left__Group__2
            {
            pushFollow(FOLLOW_rule__Left__Group__1__Impl_in_rule__Left__Group__1868);
            rule__Left__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Left__Group__2_in_rule__Left__Group__1871);
            rule__Left__Group__2();

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
    // $ANTLR end "rule__Left__Group__1"


    // $ANTLR start "rule__Left__Group__1__Impl"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:442:1: rule__Left__Group__1__Impl : ( '@' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:446:1: ( ( '@' ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:447:1: ( '@' )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:447:1: ( '@' )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:448:1: '@'
            {
             before(grammarAccess.getLeftAccess().getCommercialAtKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Left__Group__1__Impl899); 
             after(grammarAccess.getLeftAccess().getCommercialAtKeyword_1()); 

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
    // $ANTLR end "rule__Left__Group__1__Impl"


    // $ANTLR start "rule__Left__Group__2"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:461:1: rule__Left__Group__2 : rule__Left__Group__2__Impl ;
    public final void rule__Left__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:465:1: ( rule__Left__Group__2__Impl )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:466:2: rule__Left__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Left__Group__2__Impl_in_rule__Left__Group__2930);
            rule__Left__Group__2__Impl();

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
    // $ANTLR end "rule__Left__Group__2"


    // $ANTLR start "rule__Left__Group__2__Impl"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:472:1: rule__Left__Group__2__Impl : ( ( rule__Left__EventAssignment_2 ) ) ;
    public final void rule__Left__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:476:1: ( ( ( rule__Left__EventAssignment_2 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:477:1: ( ( rule__Left__EventAssignment_2 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:477:1: ( ( rule__Left__EventAssignment_2 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:478:1: ( rule__Left__EventAssignment_2 )
            {
             before(grammarAccess.getLeftAccess().getEventAssignment_2()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:479:1: ( rule__Left__EventAssignment_2 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:479:2: rule__Left__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Left__EventAssignment_2_in_rule__Left__Group__2__Impl957);
            rule__Left__EventAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getEventAssignment_2()); 

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
    // $ANTLR end "rule__Left__Group__2__Impl"


    // $ANTLR start "rule__Right__Group__0"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:495:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:499:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:500:2: rule__Right__Group__0__Impl rule__Right__Group__1
            {
            pushFollow(FOLLOW_rule__Right__Group__0__Impl_in_rule__Right__Group__0993);
            rule__Right__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group__1_in_rule__Right__Group__0996);
            rule__Right__Group__1();

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
    // $ANTLR end "rule__Right__Group__0"


    // $ANTLR start "rule__Right__Group__0__Impl"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:507:1: rule__Right__Group__0__Impl : ( '-' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:511:1: ( ( '-' ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:512:1: ( '-' )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:512:1: ( '-' )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:513:1: '-'
            {
             before(grammarAccess.getRightAccess().getHyphenMinusKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Right__Group__0__Impl1024); 
             after(grammarAccess.getRightAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Right__Group__0__Impl"


    // $ANTLR start "rule__Right__Group__1"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:526:1: rule__Right__Group__1 : rule__Right__Group__1__Impl rule__Right__Group__2 ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:530:1: ( rule__Right__Group__1__Impl rule__Right__Group__2 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:531:2: rule__Right__Group__1__Impl rule__Right__Group__2
            {
            pushFollow(FOLLOW_rule__Right__Group__1__Impl_in_rule__Right__Group__11055);
            rule__Right__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group__2_in_rule__Right__Group__11058);
            rule__Right__Group__2();

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
    // $ANTLR end "rule__Right__Group__1"


    // $ANTLR start "rule__Right__Group__1__Impl"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:538:1: rule__Right__Group__1__Impl : ( '@' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:542:1: ( ( '@' ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:543:1: ( '@' )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:543:1: ( '@' )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:544:1: '@'
            {
             before(grammarAccess.getRightAccess().getCommercialAtKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Right__Group__1__Impl1086); 
             after(grammarAccess.getRightAccess().getCommercialAtKeyword_1()); 

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
    // $ANTLR end "rule__Right__Group__1__Impl"


    // $ANTLR start "rule__Right__Group__2"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:557:1: rule__Right__Group__2 : rule__Right__Group__2__Impl rule__Right__Group__3 ;
    public final void rule__Right__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:561:1: ( rule__Right__Group__2__Impl rule__Right__Group__3 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:562:2: rule__Right__Group__2__Impl rule__Right__Group__3
            {
            pushFollow(FOLLOW_rule__Right__Group__2__Impl_in_rule__Right__Group__21117);
            rule__Right__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group__3_in_rule__Right__Group__21120);
            rule__Right__Group__3();

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
    // $ANTLR end "rule__Right__Group__2"


    // $ANTLR start "rule__Right__Group__2__Impl"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:569:1: rule__Right__Group__2__Impl : ( ( rule__Right__EventAssignment_2 ) ) ;
    public final void rule__Right__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:573:1: ( ( ( rule__Right__EventAssignment_2 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:574:1: ( ( rule__Right__EventAssignment_2 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:574:1: ( ( rule__Right__EventAssignment_2 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:575:1: ( rule__Right__EventAssignment_2 )
            {
             before(grammarAccess.getRightAccess().getEventAssignment_2()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:576:1: ( rule__Right__EventAssignment_2 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:576:2: rule__Right__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Right__EventAssignment_2_in_rule__Right__Group__2__Impl1147);
            rule__Right__EventAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getEventAssignment_2()); 

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
    // $ANTLR end "rule__Right__Group__2__Impl"


    // $ANTLR start "rule__Right__Group__3"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:586:1: rule__Right__Group__3 : rule__Right__Group__3__Impl rule__Right__Group__4 ;
    public final void rule__Right__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:590:1: ( rule__Right__Group__3__Impl rule__Right__Group__4 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:591:2: rule__Right__Group__3__Impl rule__Right__Group__4
            {
            pushFollow(FOLLOW_rule__Right__Group__3__Impl_in_rule__Right__Group__31177);
            rule__Right__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group__4_in_rule__Right__Group__31180);
            rule__Right__Group__4();

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
    // $ANTLR end "rule__Right__Group__3"


    // $ANTLR start "rule__Right__Group__3__Impl"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:598:1: rule__Right__Group__3__Impl : ( ( rule__Right__OpAssignment_3 ) ) ;
    public final void rule__Right__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:602:1: ( ( ( rule__Right__OpAssignment_3 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:603:1: ( ( rule__Right__OpAssignment_3 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:603:1: ( ( rule__Right__OpAssignment_3 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:604:1: ( rule__Right__OpAssignment_3 )
            {
             before(grammarAccess.getRightAccess().getOpAssignment_3()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:605:1: ( rule__Right__OpAssignment_3 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:605:2: rule__Right__OpAssignment_3
            {
            pushFollow(FOLLOW_rule__Right__OpAssignment_3_in_rule__Right__Group__3__Impl1207);
            rule__Right__OpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getOpAssignment_3()); 

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
    // $ANTLR end "rule__Right__Group__3__Impl"


    // $ANTLR start "rule__Right__Group__4"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:615:1: rule__Right__Group__4 : rule__Right__Group__4__Impl ;
    public final void rule__Right__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:619:1: ( rule__Right__Group__4__Impl )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:620:2: rule__Right__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Right__Group__4__Impl_in_rule__Right__Group__41237);
            rule__Right__Group__4__Impl();

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
    // $ANTLR end "rule__Right__Group__4"


    // $ANTLR start "rule__Right__Group__4__Impl"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:626:1: rule__Right__Group__4__Impl : ( ( rule__Right__ValueAssignment_4 ) ) ;
    public final void rule__Right__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:630:1: ( ( ( rule__Right__ValueAssignment_4 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:631:1: ( ( rule__Right__ValueAssignment_4 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:631:1: ( ( rule__Right__ValueAssignment_4 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:632:1: ( rule__Right__ValueAssignment_4 )
            {
             before(grammarAccess.getRightAccess().getValueAssignment_4()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:633:1: ( rule__Right__ValueAssignment_4 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:633:2: rule__Right__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__Right__ValueAssignment_4_in_rule__Right__Group__4__Impl1264);
            rule__Right__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__Right__Group__4__Impl"


    // $ANTLR start "rule__Event__Group_0__0"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:653:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:657:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:658:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
            {
            pushFollow(FOLLOW_rule__Event__Group_0__0__Impl_in_rule__Event__Group_0__01304);
            rule__Event__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_0__1_in_rule__Event__Group_0__01307);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:665:1: rule__Event__Group_0__0__Impl : ( ( rule__Event__EventNameAssignment_0_0 ) ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:669:1: ( ( ( rule__Event__EventNameAssignment_0_0 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:670:1: ( ( rule__Event__EventNameAssignment_0_0 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:670:1: ( ( rule__Event__EventNameAssignment_0_0 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:671:1: ( rule__Event__EventNameAssignment_0_0 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_0_0()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:672:1: ( rule__Event__EventNameAssignment_0_0 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:672:2: rule__Event__EventNameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Event__EventNameAssignment_0_0_in_rule__Event__Group_0__0__Impl1334);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:682:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl rule__Event__Group_0__2 ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:686:1: ( rule__Event__Group_0__1__Impl rule__Event__Group_0__2 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:687:2: rule__Event__Group_0__1__Impl rule__Event__Group_0__2
            {
            pushFollow(FOLLOW_rule__Event__Group_0__1__Impl_in_rule__Event__Group_0__11364);
            rule__Event__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_0__2_in_rule__Event__Group_0__11367);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:694:1: rule__Event__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:698:1: ( ( '.' ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:699:1: ( '.' )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:699:1: ( '.' )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:700:1: '.'
            {
             before(grammarAccess.getEventAccess().getFullStopKeyword_0_1()); 
            match(input,21,FOLLOW_21_in_rule__Event__Group_0__1__Impl1395); 
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:713:1: rule__Event__Group_0__2 : rule__Event__Group_0__2__Impl ;
    public final void rule__Event__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:717:1: ( rule__Event__Group_0__2__Impl )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:718:2: rule__Event__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_0__2__Impl_in_rule__Event__Group_0__21426);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:724:1: rule__Event__Group_0__2__Impl : ( ( rule__Event__EventExtensionAssignment_0_2 ) ) ;
    public final void rule__Event__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:728:1: ( ( ( rule__Event__EventExtensionAssignment_0_2 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:729:1: ( ( rule__Event__EventExtensionAssignment_0_2 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:729:1: ( ( rule__Event__EventExtensionAssignment_0_2 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:730:1: ( rule__Event__EventExtensionAssignment_0_2 )
            {
             before(grammarAccess.getEventAccess().getEventExtensionAssignment_0_2()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:731:1: ( rule__Event__EventExtensionAssignment_0_2 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:731:2: rule__Event__EventExtensionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Event__EventExtensionAssignment_0_2_in_rule__Event__Group_0__2__Impl1453);
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


    // $ANTLR start "rule__Model__TriggerAssignment"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:748:1: rule__Model__TriggerAssignment : ( ruleTrigger ) ;
    public final void rule__Model__TriggerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:752:1: ( ( ruleTrigger ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:753:1: ( ruleTrigger )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:753:1: ( ruleTrigger )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:754:1: ruleTrigger
            {
             before(grammarAccess.getModelAccess().getTriggerTriggerParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTrigger_in_rule__Model__TriggerAssignment1494);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTriggerTriggerParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__TriggerAssignment"


    // $ANTLR start "rule__Trigger__LeftAssignment_0"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:763:1: rule__Trigger__LeftAssignment_0 : ( ruleLeft ) ;
    public final void rule__Trigger__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:767:1: ( ( ruleLeft ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:768:1: ( ruleLeft )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:768:1: ( ruleLeft )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:769:1: ruleLeft
            {
             before(grammarAccess.getTriggerAccess().getLeftLeftParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLeft_in_rule__Trigger__LeftAssignment_01525);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getLeftLeftParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Trigger__LeftAssignment_0"


    // $ANTLR start "rule__Trigger__RightAssignment_1"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:778:1: rule__Trigger__RightAssignment_1 : ( ruleRight ) ;
    public final void rule__Trigger__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:782:1: ( ( ruleRight ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:783:1: ( ruleRight )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:783:1: ( ruleRight )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:784:1: ruleRight
            {
             before(grammarAccess.getTriggerAccess().getRightRightParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRight_in_rule__Trigger__RightAssignment_11556);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getRightRightParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Trigger__RightAssignment_1"


    // $ANTLR start "rule__Left__LinkNameAssignment_0_0"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:793:1: rule__Left__LinkNameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Left__LinkNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:797:1: ( ( RULE_ID ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:798:1: ( RULE_ID )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:798:1: ( RULE_ID )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:799:1: RULE_ID
            {
             before(grammarAccess.getLeftAccess().getLinkNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Left__LinkNameAssignment_0_01587); 
             after(grammarAccess.getLeftAccess().getLinkNameIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Left__LinkNameAssignment_0_0"


    // $ANTLR start "rule__Left__SelfAssignment_0_1"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:808:1: rule__Left__SelfAssignment_0_1 : ( ( 'self' ) ) ;
    public final void rule__Left__SelfAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:812:1: ( ( ( 'self' ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:813:1: ( ( 'self' ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:813:1: ( ( 'self' ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:814:1: ( 'self' )
            {
             before(grammarAccess.getLeftAccess().getSelfSelfKeyword_0_1_0()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:815:1: ( 'self' )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:816:1: 'self'
            {
             before(grammarAccess.getLeftAccess().getSelfSelfKeyword_0_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Left__SelfAssignment_0_11623); 
             after(grammarAccess.getLeftAccess().getSelfSelfKeyword_0_1_0()); 

            }

             after(grammarAccess.getLeftAccess().getSelfSelfKeyword_0_1_0()); 

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
    // $ANTLR end "rule__Left__SelfAssignment_0_1"


    // $ANTLR start "rule__Left__EventAssignment_2"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:831:1: rule__Left__EventAssignment_2 : ( ruleEvent ) ;
    public final void rule__Left__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:835:1: ( ( ruleEvent ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:836:1: ( ruleEvent )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:836:1: ( ruleEvent )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:837:1: ruleEvent
            {
             before(grammarAccess.getLeftAccess().getEventEventParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Left__EventAssignment_21662);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getLeftAccess().getEventEventParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Left__EventAssignment_2"


    // $ANTLR start "rule__Right__EventAssignment_2"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:846:1: rule__Right__EventAssignment_2 : ( ruleEvent ) ;
    public final void rule__Right__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:850:1: ( ( ruleEvent ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:851:1: ( ruleEvent )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:851:1: ( ruleEvent )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:852:1: ruleEvent
            {
             before(grammarAccess.getRightAccess().getEventEventParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Right__EventAssignment_21693);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getRightAccess().getEventEventParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Right__EventAssignment_2"


    // $ANTLR start "rule__Right__OpAssignment_3"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:861:1: rule__Right__OpAssignment_3 : ( RULE_RELATIONS ) ;
    public final void rule__Right__OpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:865:1: ( ( RULE_RELATIONS ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:866:1: ( RULE_RELATIONS )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:866:1: ( RULE_RELATIONS )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:867:1: RULE_RELATIONS
            {
             before(grammarAccess.getRightAccess().getOpRELATIONSTerminalRuleCall_3_0()); 
            match(input,RULE_RELATIONS,FOLLOW_RULE_RELATIONS_in_rule__Right__OpAssignment_31724); 
             after(grammarAccess.getRightAccess().getOpRELATIONSTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Right__OpAssignment_3"


    // $ANTLR start "rule__Right__ValueAssignment_4"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:876:1: rule__Right__ValueAssignment_4 : ( RULE_INT ) ;
    public final void rule__Right__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:880:1: ( ( RULE_INT ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:881:1: ( RULE_INT )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:881:1: ( RULE_INT )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:882:1: RULE_INT
            {
             before(grammarAccess.getRightAccess().getValueINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Right__ValueAssignment_41755); 
             after(grammarAccess.getRightAccess().getValueINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Right__ValueAssignment_4"


    // $ANTLR start "rule__Event__EventNameAssignment_0_0"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:891:1: rule__Event__EventNameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:895:1: ( ( RULE_ID ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:896:1: ( RULE_ID )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:896:1: ( RULE_ID )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:897:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_0_01786); 
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:906:1: rule__Event__EventExtensionAssignment_0_2 : ( ruleEventExtensions ) ;
    public final void rule__Event__EventExtensionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:910:1: ( ( ruleEventExtensions ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:911:1: ( ruleEventExtensions )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:911:1: ( ruleEventExtensions )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:912:1: ruleEventExtensions
            {
             before(grammarAccess.getEventAccess().getEventExtensionEventExtensionsParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleEventExtensions_in_rule__Event__EventExtensionAssignment_0_21817);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:921:1: rule__Event__NowEventAssignment_1 : ( ( 'now' ) ) ;
    public final void rule__Event__NowEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:925:1: ( ( ( 'now' ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:926:1: ( ( 'now' ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:926:1: ( ( 'now' ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:927:1: ( 'now' )
            {
             before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:928:1: ( 'now' )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:929:1: 'now'
            {
             before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Event__NowEventAssignment_11853); 
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
    public static final BitSet FOLLOW_rule__Model__TriggerAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrigger128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group__0_in_ruleTrigger154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeft_in_entryRuleLeft181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeft188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__0_in_ruleLeft214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRight_in_entryRuleRight241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRight248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group__0_in_ruleRight274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Alternatives_in_ruleEvent334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_entryRuleEventExtensions361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventExtensions368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventExtensions__Alternatives_in_ruleEventExtensions394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__LinkNameAssignment_0_0_in_rule__Left__Alternatives_0430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__SelfAssignment_0_1_in_rule__Left__Alternatives_0448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__0_in_rule__Event__Alternatives481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NowEventAssignment_1_in_rule__Event__Alternatives499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EventExtensions__Alternatives533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EventExtensions__Alternatives553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EventExtensions__Alternatives573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EventExtensions__Alternatives593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EventExtensions__Alternatives613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EventExtensions__Alternatives633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EventExtensions__Alternatives653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group__0__Impl_in_rule__Trigger__Group__0685 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Trigger__Group__1_in_rule__Trigger__Group__0688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__LeftAssignment_0_in_rule__Trigger__Group__0__Impl715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group__1__Impl_in_rule__Trigger__Group__1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__RightAssignment_1_in_rule__Trigger__Group__1__Impl772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__0__Impl_in_rule__Left__Group__0807 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Left__Group__1_in_rule__Left__Group__0810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Alternatives_0_in_rule__Left__Group__0__Impl837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__1__Impl_in_rule__Left__Group__1868 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Left__Group__2_in_rule__Left__Group__1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Left__Group__1__Impl899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__2__Impl_in_rule__Left__Group__2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__EventAssignment_2_in_rule__Left__Group__2__Impl957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group__0__Impl_in_rule__Right__Group__0993 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Right__Group__1_in_rule__Right__Group__0996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Right__Group__0__Impl1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group__1__Impl_in_rule__Right__Group__11055 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Right__Group__2_in_rule__Right__Group__11058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Right__Group__1__Impl1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group__2__Impl_in_rule__Right__Group__21117 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Right__Group__3_in_rule__Right__Group__21120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__EventAssignment_2_in_rule__Right__Group__2__Impl1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group__3__Impl_in_rule__Right__Group__31177 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Right__Group__4_in_rule__Right__Group__31180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__OpAssignment_3_in_rule__Right__Group__3__Impl1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group__4__Impl_in_rule__Right__Group__41237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__ValueAssignment_4_in_rule__Right__Group__4__Impl1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__0__Impl_in_rule__Event__Group_0__01304 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Event__Group_0__1_in_rule__Event__Group_0__01307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventNameAssignment_0_0_in_rule__Event__Group_0__0__Impl1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__1__Impl_in_rule__Event__Group_0__11364 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_rule__Event__Group_0__2_in_rule__Event__Group_0__11367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Event__Group_0__1__Impl1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__2__Impl_in_rule__Event__Group_0__21426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventExtensionAssignment_0_2_in_rule__Event__Group_0__2__Impl1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_rule__Model__TriggerAssignment1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeft_in_rule__Trigger__LeftAssignment_01525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRight_in_rule__Trigger__RightAssignment_11556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Left__LinkNameAssignment_0_01587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Left__SelfAssignment_0_11623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Left__EventAssignment_21662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Right__EventAssignment_21693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONS_in_rule__Right__OpAssignment_31724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Right__ValueAssignment_41755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_0_01786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_rule__Event__EventExtensionAssignment_0_21817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Event__NowEventAssignment_11853 = new BitSet(new long[]{0x0000000000000002L});

}