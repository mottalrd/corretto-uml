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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_RELATIONS", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'exit'", "'enter'", "'start'", "'end'", "'tick'", "'sig'", "'call'", "'reply'", "'@'", "'-'", "'.'", "'now'"
    };
    public static final int RULE_ID=6;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_RELATIONS=4;
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
    public static final int RULE_INT=5;
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


    // $ANTLR start "rule__Event__Alternatives"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:228:1: rule__Event__Alternatives : ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__NowEventAssignment_1 ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:232:1: ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__NowEventAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:233:1: ( ( rule__Event__Group_0__0 ) )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:233:1: ( ( rule__Event__Group_0__0 ) )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:234:1: ( rule__Event__Group_0__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_0()); 
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:235:1: ( rule__Event__Group_0__0 )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:235:2: rule__Event__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_0__0_in_rule__Event__Alternatives430);
                    rule__Event__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:239:6: ( ( rule__Event__NowEventAssignment_1 ) )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:239:6: ( ( rule__Event__NowEventAssignment_1 ) )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:240:1: ( rule__Event__NowEventAssignment_1 )
                    {
                     before(grammarAccess.getEventAccess().getNowEventAssignment_1()); 
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:241:1: ( rule__Event__NowEventAssignment_1 )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:241:2: rule__Event__NowEventAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Event__NowEventAssignment_1_in_rule__Event__Alternatives448);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:250:1: rule__EventExtensions__Alternatives : ( ( 'exit' ) | ( 'enter' ) | ( 'start' ) | ( 'end' ) | ( 'tick' ) | ( 'sig' ) | ( 'call' ) | ( 'reply' ) );
    public final void rule__EventExtensions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:254:1: ( ( 'exit' ) | ( 'enter' ) | ( 'start' ) | ( 'end' ) | ( 'tick' ) | ( 'sig' ) | ( 'call' ) | ( 'reply' ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            case 19:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:255:1: ( 'exit' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:255:1: ( 'exit' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:256:1: 'exit'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__EventExtensions__Alternatives482); 
                     after(grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:263:6: ( 'enter' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:263:6: ( 'enter' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:264:1: 'enter'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__EventExtensions__Alternatives502); 
                     after(grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:271:6: ( 'start' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:271:6: ( 'start' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:272:1: 'start'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__EventExtensions__Alternatives522); 
                     after(grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:279:6: ( 'end' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:279:6: ( 'end' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:280:1: 'end'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__EventExtensions__Alternatives542); 
                     after(grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:287:6: ( 'tick' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:287:6: ( 'tick' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:288:1: 'tick'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); 
                    match(input,16,FOLLOW_16_in_rule__EventExtensions__Alternatives562); 
                     after(grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:295:6: ( 'sig' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:295:6: ( 'sig' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:296:1: 'sig'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); 
                    match(input,17,FOLLOW_17_in_rule__EventExtensions__Alternatives582); 
                     after(grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:303:6: ( 'call' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:303:6: ( 'call' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:304:1: 'call'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); 
                    match(input,18,FOLLOW_18_in_rule__EventExtensions__Alternatives602); 
                     after(grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:311:6: ( 'reply' )
                    {
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:311:6: ( 'reply' )
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:312:1: 'reply'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getReplyKeyword_7()); 
                    match(input,19,FOLLOW_19_in_rule__EventExtensions__Alternatives622); 
                     after(grammarAccess.getEventExtensionsAccess().getReplyKeyword_7()); 

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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:326:1: rule__Trigger__Group__0 : rule__Trigger__Group__0__Impl rule__Trigger__Group__1 ;
    public final void rule__Trigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:330:1: ( rule__Trigger__Group__0__Impl rule__Trigger__Group__1 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:331:2: rule__Trigger__Group__0__Impl rule__Trigger__Group__1
            {
            pushFollow(FOLLOW_rule__Trigger__Group__0__Impl_in_rule__Trigger__Group__0654);
            rule__Trigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trigger__Group__1_in_rule__Trigger__Group__0657);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:338:1: rule__Trigger__Group__0__Impl : ( ( rule__Trigger__LeftAssignment_0 ) ) ;
    public final void rule__Trigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:342:1: ( ( ( rule__Trigger__LeftAssignment_0 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:343:1: ( ( rule__Trigger__LeftAssignment_0 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:343:1: ( ( rule__Trigger__LeftAssignment_0 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:344:1: ( rule__Trigger__LeftAssignment_0 )
            {
             before(grammarAccess.getTriggerAccess().getLeftAssignment_0()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:345:1: ( rule__Trigger__LeftAssignment_0 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:345:2: rule__Trigger__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Trigger__LeftAssignment_0_in_rule__Trigger__Group__0__Impl684);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:355:1: rule__Trigger__Group__1 : rule__Trigger__Group__1__Impl ;
    public final void rule__Trigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:359:1: ( rule__Trigger__Group__1__Impl )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:360:2: rule__Trigger__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Trigger__Group__1__Impl_in_rule__Trigger__Group__1714);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:366:1: rule__Trigger__Group__1__Impl : ( ( rule__Trigger__RightAssignment_1 )? ) ;
    public final void rule__Trigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:370:1: ( ( ( rule__Trigger__RightAssignment_1 )? ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:371:1: ( ( rule__Trigger__RightAssignment_1 )? )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:371:1: ( ( rule__Trigger__RightAssignment_1 )? )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:372:1: ( rule__Trigger__RightAssignment_1 )?
            {
             before(grammarAccess.getTriggerAccess().getRightAssignment_1()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:373:1: ( rule__Trigger__RightAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:373:2: rule__Trigger__RightAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Trigger__RightAssignment_1_in_rule__Trigger__Group__1__Impl741);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:387:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:391:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:392:2: rule__Left__Group__0__Impl rule__Left__Group__1
            {
            pushFollow(FOLLOW_rule__Left__Group__0__Impl_in_rule__Left__Group__0776);
            rule__Left__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Left__Group__1_in_rule__Left__Group__0779);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:399:1: rule__Left__Group__0__Impl : ( '@' ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:403:1: ( ( '@' ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:404:1: ( '@' )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:404:1: ( '@' )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:405:1: '@'
            {
             before(grammarAccess.getLeftAccess().getCommercialAtKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Left__Group__0__Impl807); 
             after(grammarAccess.getLeftAccess().getCommercialAtKeyword_0()); 

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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:418:1: rule__Left__Group__1 : rule__Left__Group__1__Impl ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:422:1: ( rule__Left__Group__1__Impl )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:423:2: rule__Left__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Left__Group__1__Impl_in_rule__Left__Group__1838);
            rule__Left__Group__1__Impl();

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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:429:1: rule__Left__Group__1__Impl : ( ( rule__Left__EventAssignment_1 ) ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:433:1: ( ( ( rule__Left__EventAssignment_1 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:434:1: ( ( rule__Left__EventAssignment_1 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:434:1: ( ( rule__Left__EventAssignment_1 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:435:1: ( rule__Left__EventAssignment_1 )
            {
             before(grammarAccess.getLeftAccess().getEventAssignment_1()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:436:1: ( rule__Left__EventAssignment_1 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:436:2: rule__Left__EventAssignment_1
            {
            pushFollow(FOLLOW_rule__Left__EventAssignment_1_in_rule__Left__Group__1__Impl865);
            rule__Left__EventAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getEventAssignment_1()); 

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


    // $ANTLR start "rule__Right__Group__0"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:450:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:454:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:455:2: rule__Right__Group__0__Impl rule__Right__Group__1
            {
            pushFollow(FOLLOW_rule__Right__Group__0__Impl_in_rule__Right__Group__0899);
            rule__Right__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group__1_in_rule__Right__Group__0902);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:462:1: rule__Right__Group__0__Impl : ( '-' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:466:1: ( ( '-' ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:467:1: ( '-' )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:467:1: ( '-' )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:468:1: '-'
            {
             before(grammarAccess.getRightAccess().getHyphenMinusKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Right__Group__0__Impl930); 
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:481:1: rule__Right__Group__1 : rule__Right__Group__1__Impl rule__Right__Group__2 ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:485:1: ( rule__Right__Group__1__Impl rule__Right__Group__2 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:486:2: rule__Right__Group__1__Impl rule__Right__Group__2
            {
            pushFollow(FOLLOW_rule__Right__Group__1__Impl_in_rule__Right__Group__1961);
            rule__Right__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group__2_in_rule__Right__Group__1964);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:493:1: rule__Right__Group__1__Impl : ( '@' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:497:1: ( ( '@' ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:498:1: ( '@' )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:498:1: ( '@' )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:499:1: '@'
            {
             before(grammarAccess.getRightAccess().getCommercialAtKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Right__Group__1__Impl992); 
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:512:1: rule__Right__Group__2 : rule__Right__Group__2__Impl rule__Right__Group__3 ;
    public final void rule__Right__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:516:1: ( rule__Right__Group__2__Impl rule__Right__Group__3 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:517:2: rule__Right__Group__2__Impl rule__Right__Group__3
            {
            pushFollow(FOLLOW_rule__Right__Group__2__Impl_in_rule__Right__Group__21023);
            rule__Right__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group__3_in_rule__Right__Group__21026);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:524:1: rule__Right__Group__2__Impl : ( ( rule__Right__EventAssignment_2 ) ) ;
    public final void rule__Right__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:528:1: ( ( ( rule__Right__EventAssignment_2 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:529:1: ( ( rule__Right__EventAssignment_2 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:529:1: ( ( rule__Right__EventAssignment_2 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:530:1: ( rule__Right__EventAssignment_2 )
            {
             before(grammarAccess.getRightAccess().getEventAssignment_2()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:531:1: ( rule__Right__EventAssignment_2 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:531:2: rule__Right__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Right__EventAssignment_2_in_rule__Right__Group__2__Impl1053);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:541:1: rule__Right__Group__3 : rule__Right__Group__3__Impl rule__Right__Group__4 ;
    public final void rule__Right__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:545:1: ( rule__Right__Group__3__Impl rule__Right__Group__4 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:546:2: rule__Right__Group__3__Impl rule__Right__Group__4
            {
            pushFollow(FOLLOW_rule__Right__Group__3__Impl_in_rule__Right__Group__31083);
            rule__Right__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Right__Group__4_in_rule__Right__Group__31086);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:553:1: rule__Right__Group__3__Impl : ( ( rule__Right__OpAssignment_3 ) ) ;
    public final void rule__Right__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:557:1: ( ( ( rule__Right__OpAssignment_3 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:558:1: ( ( rule__Right__OpAssignment_3 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:558:1: ( ( rule__Right__OpAssignment_3 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:559:1: ( rule__Right__OpAssignment_3 )
            {
             before(grammarAccess.getRightAccess().getOpAssignment_3()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:560:1: ( rule__Right__OpAssignment_3 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:560:2: rule__Right__OpAssignment_3
            {
            pushFollow(FOLLOW_rule__Right__OpAssignment_3_in_rule__Right__Group__3__Impl1113);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:570:1: rule__Right__Group__4 : rule__Right__Group__4__Impl ;
    public final void rule__Right__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:574:1: ( rule__Right__Group__4__Impl )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:575:2: rule__Right__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Right__Group__4__Impl_in_rule__Right__Group__41143);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:581:1: rule__Right__Group__4__Impl : ( ( rule__Right__ValueAssignment_4 ) ) ;
    public final void rule__Right__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:585:1: ( ( ( rule__Right__ValueAssignment_4 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:586:1: ( ( rule__Right__ValueAssignment_4 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:586:1: ( ( rule__Right__ValueAssignment_4 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:587:1: ( rule__Right__ValueAssignment_4 )
            {
             before(grammarAccess.getRightAccess().getValueAssignment_4()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:588:1: ( rule__Right__ValueAssignment_4 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:588:2: rule__Right__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__Right__ValueAssignment_4_in_rule__Right__Group__4__Impl1170);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:608:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:612:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:613:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
            {
            pushFollow(FOLLOW_rule__Event__Group_0__0__Impl_in_rule__Event__Group_0__01210);
            rule__Event__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_0__1_in_rule__Event__Group_0__01213);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:620:1: rule__Event__Group_0__0__Impl : ( ( rule__Event__EventNameAssignment_0_0 ) ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:624:1: ( ( ( rule__Event__EventNameAssignment_0_0 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:625:1: ( ( rule__Event__EventNameAssignment_0_0 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:625:1: ( ( rule__Event__EventNameAssignment_0_0 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:626:1: ( rule__Event__EventNameAssignment_0_0 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_0_0()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:627:1: ( rule__Event__EventNameAssignment_0_0 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:627:2: rule__Event__EventNameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Event__EventNameAssignment_0_0_in_rule__Event__Group_0__0__Impl1240);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:637:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl rule__Event__Group_0__2 ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:641:1: ( rule__Event__Group_0__1__Impl rule__Event__Group_0__2 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:642:2: rule__Event__Group_0__1__Impl rule__Event__Group_0__2
            {
            pushFollow(FOLLOW_rule__Event__Group_0__1__Impl_in_rule__Event__Group_0__11270);
            rule__Event__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_0__2_in_rule__Event__Group_0__11273);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:649:1: rule__Event__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:653:1: ( ( '.' ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:654:1: ( '.' )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:654:1: ( '.' )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:655:1: '.'
            {
             before(grammarAccess.getEventAccess().getFullStopKeyword_0_1()); 
            match(input,22,FOLLOW_22_in_rule__Event__Group_0__1__Impl1301); 
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:668:1: rule__Event__Group_0__2 : rule__Event__Group_0__2__Impl ;
    public final void rule__Event__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:672:1: ( rule__Event__Group_0__2__Impl )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:673:2: rule__Event__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_0__2__Impl_in_rule__Event__Group_0__21332);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:679:1: rule__Event__Group_0__2__Impl : ( ( rule__Event__EventExtensionAssignment_0_2 ) ) ;
    public final void rule__Event__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:683:1: ( ( ( rule__Event__EventExtensionAssignment_0_2 ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:684:1: ( ( rule__Event__EventExtensionAssignment_0_2 ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:684:1: ( ( rule__Event__EventExtensionAssignment_0_2 ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:685:1: ( rule__Event__EventExtensionAssignment_0_2 )
            {
             before(grammarAccess.getEventAccess().getEventExtensionAssignment_0_2()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:686:1: ( rule__Event__EventExtensionAssignment_0_2 )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:686:2: rule__Event__EventExtensionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Event__EventExtensionAssignment_0_2_in_rule__Event__Group_0__2__Impl1359);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:703:1: rule__Model__TriggerAssignment : ( ruleTrigger ) ;
    public final void rule__Model__TriggerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:707:1: ( ( ruleTrigger ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:708:1: ( ruleTrigger )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:708:1: ( ruleTrigger )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:709:1: ruleTrigger
            {
             before(grammarAccess.getModelAccess().getTriggerTriggerParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTrigger_in_rule__Model__TriggerAssignment1400);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:718:1: rule__Trigger__LeftAssignment_0 : ( ruleLeft ) ;
    public final void rule__Trigger__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:722:1: ( ( ruleLeft ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:723:1: ( ruleLeft )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:723:1: ( ruleLeft )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:724:1: ruleLeft
            {
             before(grammarAccess.getTriggerAccess().getLeftLeftParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLeft_in_rule__Trigger__LeftAssignment_01431);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:733:1: rule__Trigger__RightAssignment_1 : ( ruleRight ) ;
    public final void rule__Trigger__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:737:1: ( ( ruleRight ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:738:1: ( ruleRight )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:738:1: ( ruleRight )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:739:1: ruleRight
            {
             before(grammarAccess.getTriggerAccess().getRightRightParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRight_in_rule__Trigger__RightAssignment_11462);
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


    // $ANTLR start "rule__Left__EventAssignment_1"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:748:1: rule__Left__EventAssignment_1 : ( ruleEvent ) ;
    public final void rule__Left__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:752:1: ( ( ruleEvent ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:753:1: ( ruleEvent )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:753:1: ( ruleEvent )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:754:1: ruleEvent
            {
             before(grammarAccess.getLeftAccess().getEventEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Left__EventAssignment_11493);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getLeftAccess().getEventEventParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Left__EventAssignment_1"


    // $ANTLR start "rule__Right__EventAssignment_2"
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:763:1: rule__Right__EventAssignment_2 : ( ruleEvent ) ;
    public final void rule__Right__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:767:1: ( ( ruleEvent ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:768:1: ( ruleEvent )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:768:1: ( ruleEvent )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:769:1: ruleEvent
            {
             before(grammarAccess.getRightAccess().getEventEventParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Right__EventAssignment_21524);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:778:1: rule__Right__OpAssignment_3 : ( RULE_RELATIONS ) ;
    public final void rule__Right__OpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:782:1: ( ( RULE_RELATIONS ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:783:1: ( RULE_RELATIONS )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:783:1: ( RULE_RELATIONS )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:784:1: RULE_RELATIONS
            {
             before(grammarAccess.getRightAccess().getOpRELATIONSTerminalRuleCall_3_0()); 
            match(input,RULE_RELATIONS,FOLLOW_RULE_RELATIONS_in_rule__Right__OpAssignment_31555); 
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:793:1: rule__Right__ValueAssignment_4 : ( RULE_INT ) ;
    public final void rule__Right__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:797:1: ( ( RULE_INT ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:798:1: ( RULE_INT )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:798:1: ( RULE_INT )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:799:1: RULE_INT
            {
             before(grammarAccess.getRightAccess().getValueINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Right__ValueAssignment_41586); 
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:808:1: rule__Event__EventNameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:812:1: ( ( RULE_ID ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:813:1: ( RULE_ID )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:813:1: ( RULE_ID )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:814:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_0_01617); 
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:823:1: rule__Event__EventExtensionAssignment_0_2 : ( ruleEventExtensions ) ;
    public final void rule__Event__EventExtensionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:827:1: ( ( ruleEventExtensions ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:828:1: ( ruleEventExtensions )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:828:1: ( ruleEventExtensions )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:829:1: ruleEventExtensions
            {
             before(grammarAccess.getEventAccess().getEventExtensionEventExtensionsParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleEventExtensions_in_rule__Event__EventExtensionAssignment_0_21648);
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
    // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:838:1: rule__Event__NowEventAssignment_1 : ( ( 'now' ) ) ;
    public final void rule__Event__NowEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:842:1: ( ( ( 'now' ) ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:843:1: ( ( 'now' ) )
            {
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:843:1: ( ( 'now' ) )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:844:1: ( 'now' )
            {
             before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:845:1: ( 'now' )
            // ../org.correttouml.grammars.statemachinetriggers.ui/src-gen/org/correttouml/grammars/ui/contentassist/antlr/internal/InternalStateMachineTriggers.g:846:1: 'now'
            {
             before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Event__NowEventAssignment_11684); 
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
    public static final BitSet FOLLOW_rule__Event__Group_0__0_in_rule__Event__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NowEventAssignment_1_in_rule__Event__Alternatives448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EventExtensions__Alternatives482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EventExtensions__Alternatives502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EventExtensions__Alternatives522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EventExtensions__Alternatives542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EventExtensions__Alternatives562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EventExtensions__Alternatives582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EventExtensions__Alternatives602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EventExtensions__Alternatives622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group__0__Impl_in_rule__Trigger__Group__0654 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Trigger__Group__1_in_rule__Trigger__Group__0657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__LeftAssignment_0_in_rule__Trigger__Group__0__Impl684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group__1__Impl_in_rule__Trigger__Group__1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__RightAssignment_1_in_rule__Trigger__Group__1__Impl741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__0__Impl_in_rule__Left__Group__0776 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_rule__Left__Group__1_in_rule__Left__Group__0779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Left__Group__0__Impl807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__Group__1__Impl_in_rule__Left__Group__1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Left__EventAssignment_1_in_rule__Left__Group__1__Impl865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group__0__Impl_in_rule__Right__Group__0899 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Right__Group__1_in_rule__Right__Group__0902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Right__Group__0__Impl930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group__1__Impl_in_rule__Right__Group__1961 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_rule__Right__Group__2_in_rule__Right__Group__1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Right__Group__1__Impl992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group__2__Impl_in_rule__Right__Group__21023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Right__Group__3_in_rule__Right__Group__21026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__EventAssignment_2_in_rule__Right__Group__2__Impl1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group__3__Impl_in_rule__Right__Group__31083 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Right__Group__4_in_rule__Right__Group__31086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__OpAssignment_3_in_rule__Right__Group__3__Impl1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__Group__4__Impl_in_rule__Right__Group__41143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Right__ValueAssignment_4_in_rule__Right__Group__4__Impl1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__0__Impl_in_rule__Event__Group_0__01210 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Event__Group_0__1_in_rule__Event__Group_0__01213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventNameAssignment_0_0_in_rule__Event__Group_0__0__Impl1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__1__Impl_in_rule__Event__Group_0__11270 = new BitSet(new long[]{0x00000000000FF000L});
    public static final BitSet FOLLOW_rule__Event__Group_0__2_in_rule__Event__Group_0__11273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Event__Group_0__1__Impl1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_0__2__Impl_in_rule__Event__Group_0__21332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventExtensionAssignment_0_2_in_rule__Event__Group_0__2__Impl1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_rule__Model__TriggerAssignment1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeft_in_rule__Trigger__LeftAssignment_01431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRight_in_rule__Trigger__RightAssignment_11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Left__EventAssignment_11493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Right__EventAssignment_21524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONS_in_rule__Right__OpAssignment_31555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Right__ValueAssignment_41586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__EventNameAssignment_0_01617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventExtensions_in_rule__Event__EventExtensionAssignment_0_21648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Event__NowEventAssignment_11684 = new BitSet(new long[]{0x0000000000000002L});

}