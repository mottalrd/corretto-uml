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
    public static final int RULE_RELATIONS=4;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStateMachineTriggersParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineTriggersParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineTriggersParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateMachineTriggers.g"; }


     
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
    // InternalStateMachineTriggers.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalStateMachineTriggers.g:61:1: ( ruleModel EOF )
            // InternalStateMachineTriggers.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalStateMachineTriggers.g:69:1: ruleModel : ( ( rule__Model__TriggerAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:73:2: ( ( ( rule__Model__TriggerAssignment ) ) )
            // InternalStateMachineTriggers.g:74:1: ( ( rule__Model__TriggerAssignment ) )
            {
            // InternalStateMachineTriggers.g:74:1: ( ( rule__Model__TriggerAssignment ) )
            // InternalStateMachineTriggers.g:75:1: ( rule__Model__TriggerAssignment )
            {
             before(grammarAccess.getModelAccess().getTriggerAssignment()); 
            // InternalStateMachineTriggers.g:76:1: ( rule__Model__TriggerAssignment )
            // InternalStateMachineTriggers.g:76:2: rule__Model__TriggerAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:88:1: entryRuleTrigger : ruleTrigger EOF ;
    public final void entryRuleTrigger() throws RecognitionException {
        try {
            // InternalStateMachineTriggers.g:89:1: ( ruleTrigger EOF )
            // InternalStateMachineTriggers.g:90:1: ruleTrigger EOF
            {
             before(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getTriggerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalStateMachineTriggers.g:97:1: ruleTrigger : ( ( rule__Trigger__Group__0 ) ) ;
    public final void ruleTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:101:2: ( ( ( rule__Trigger__Group__0 ) ) )
            // InternalStateMachineTriggers.g:102:1: ( ( rule__Trigger__Group__0 ) )
            {
            // InternalStateMachineTriggers.g:102:1: ( ( rule__Trigger__Group__0 ) )
            // InternalStateMachineTriggers.g:103:1: ( rule__Trigger__Group__0 )
            {
             before(grammarAccess.getTriggerAccess().getGroup()); 
            // InternalStateMachineTriggers.g:104:1: ( rule__Trigger__Group__0 )
            // InternalStateMachineTriggers.g:104:2: rule__Trigger__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:116:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // InternalStateMachineTriggers.g:117:1: ( ruleLeft EOF )
            // InternalStateMachineTriggers.g:118:1: ruleLeft EOF
            {
             before(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getLeftRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalStateMachineTriggers.g:125:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:129:2: ( ( ( rule__Left__Group__0 ) ) )
            // InternalStateMachineTriggers.g:130:1: ( ( rule__Left__Group__0 ) )
            {
            // InternalStateMachineTriggers.g:130:1: ( ( rule__Left__Group__0 ) )
            // InternalStateMachineTriggers.g:131:1: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // InternalStateMachineTriggers.g:132:1: ( rule__Left__Group__0 )
            // InternalStateMachineTriggers.g:132:2: rule__Left__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:144:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalStateMachineTriggers.g:145:1: ( ruleRight EOF )
            // InternalStateMachineTriggers.g:146:1: ruleRight EOF
            {
             before(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getRightRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalStateMachineTriggers.g:153:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:157:2: ( ( ( rule__Right__Group__0 ) ) )
            // InternalStateMachineTriggers.g:158:1: ( ( rule__Right__Group__0 ) )
            {
            // InternalStateMachineTriggers.g:158:1: ( ( rule__Right__Group__0 ) )
            // InternalStateMachineTriggers.g:159:1: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // InternalStateMachineTriggers.g:160:1: ( rule__Right__Group__0 )
            // InternalStateMachineTriggers.g:160:2: rule__Right__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:172:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalStateMachineTriggers.g:173:1: ( ruleEvent EOF )
            // InternalStateMachineTriggers.g:174:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalStateMachineTriggers.g:181:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:185:2: ( ( ( rule__Event__Alternatives ) ) )
            // InternalStateMachineTriggers.g:186:1: ( ( rule__Event__Alternatives ) )
            {
            // InternalStateMachineTriggers.g:186:1: ( ( rule__Event__Alternatives ) )
            // InternalStateMachineTriggers.g:187:1: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // InternalStateMachineTriggers.g:188:1: ( rule__Event__Alternatives )
            // InternalStateMachineTriggers.g:188:2: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:200:1: entryRuleEventExtensions : ruleEventExtensions EOF ;
    public final void entryRuleEventExtensions() throws RecognitionException {
        try {
            // InternalStateMachineTriggers.g:201:1: ( ruleEventExtensions EOF )
            // InternalStateMachineTriggers.g:202:1: ruleEventExtensions EOF
            {
             before(grammarAccess.getEventExtensionsRule()); 
            pushFollow(FOLLOW_1);
            ruleEventExtensions();

            state._fsp--;

             after(grammarAccess.getEventExtensionsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalStateMachineTriggers.g:209:1: ruleEventExtensions : ( ( rule__EventExtensions__Alternatives ) ) ;
    public final void ruleEventExtensions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:213:2: ( ( ( rule__EventExtensions__Alternatives ) ) )
            // InternalStateMachineTriggers.g:214:1: ( ( rule__EventExtensions__Alternatives ) )
            {
            // InternalStateMachineTriggers.g:214:1: ( ( rule__EventExtensions__Alternatives ) )
            // InternalStateMachineTriggers.g:215:1: ( rule__EventExtensions__Alternatives )
            {
             before(grammarAccess.getEventExtensionsAccess().getAlternatives()); 
            // InternalStateMachineTriggers.g:216:1: ( rule__EventExtensions__Alternatives )
            // InternalStateMachineTriggers.g:216:2: rule__EventExtensions__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:228:1: rule__Event__Alternatives : ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__NowEventAssignment_1 ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:232:1: ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__NowEventAssignment_1 ) ) )
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
                    // InternalStateMachineTriggers.g:233:1: ( ( rule__Event__Group_0__0 ) )
                    {
                    // InternalStateMachineTriggers.g:233:1: ( ( rule__Event__Group_0__0 ) )
                    // InternalStateMachineTriggers.g:234:1: ( rule__Event__Group_0__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_0()); 
                    // InternalStateMachineTriggers.g:235:1: ( rule__Event__Group_0__0 )
                    // InternalStateMachineTriggers.g:235:2: rule__Event__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachineTriggers.g:239:6: ( ( rule__Event__NowEventAssignment_1 ) )
                    {
                    // InternalStateMachineTriggers.g:239:6: ( ( rule__Event__NowEventAssignment_1 ) )
                    // InternalStateMachineTriggers.g:240:1: ( rule__Event__NowEventAssignment_1 )
                    {
                     before(grammarAccess.getEventAccess().getNowEventAssignment_1()); 
                    // InternalStateMachineTriggers.g:241:1: ( rule__Event__NowEventAssignment_1 )
                    // InternalStateMachineTriggers.g:241:2: rule__Event__NowEventAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:250:1: rule__EventExtensions__Alternatives : ( ( 'exit' ) | ( 'enter' ) | ( 'start' ) | ( 'end' ) | ( 'tick' ) | ( 'sig' ) | ( 'call' ) | ( 'reply' ) );
    public final void rule__EventExtensions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:254:1: ( ( 'exit' ) | ( 'enter' ) | ( 'start' ) | ( 'end' ) | ( 'tick' ) | ( 'sig' ) | ( 'call' ) | ( 'reply' ) )
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
                    // InternalStateMachineTriggers.g:255:1: ( 'exit' )
                    {
                    // InternalStateMachineTriggers.g:255:1: ( 'exit' )
                    // InternalStateMachineTriggers.g:256:1: 'exit'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEventExtensionsAccess().getExitKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachineTriggers.g:263:6: ( 'enter' )
                    {
                    // InternalStateMachineTriggers.g:263:6: ( 'enter' )
                    // InternalStateMachineTriggers.g:264:1: 'enter'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEventExtensionsAccess().getEnterKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalStateMachineTriggers.g:271:6: ( 'start' )
                    {
                    // InternalStateMachineTriggers.g:271:6: ( 'start' )
                    // InternalStateMachineTriggers.g:272:1: 'start'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEventExtensionsAccess().getStartKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalStateMachineTriggers.g:279:6: ( 'end' )
                    {
                    // InternalStateMachineTriggers.g:279:6: ( 'end' )
                    // InternalStateMachineTriggers.g:280:1: 'end'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEventExtensionsAccess().getEndKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalStateMachineTriggers.g:287:6: ( 'tick' )
                    {
                    // InternalStateMachineTriggers.g:287:6: ( 'tick' )
                    // InternalStateMachineTriggers.g:288:1: 'tick'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEventExtensionsAccess().getTickKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalStateMachineTriggers.g:295:6: ( 'sig' )
                    {
                    // InternalStateMachineTriggers.g:295:6: ( 'sig' )
                    // InternalStateMachineTriggers.g:296:1: 'sig'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEventExtensionsAccess().getSigKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalStateMachineTriggers.g:303:6: ( 'call' )
                    {
                    // InternalStateMachineTriggers.g:303:6: ( 'call' )
                    // InternalStateMachineTriggers.g:304:1: 'call'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEventExtensionsAccess().getCallKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalStateMachineTriggers.g:311:6: ( 'reply' )
                    {
                    // InternalStateMachineTriggers.g:311:6: ( 'reply' )
                    // InternalStateMachineTriggers.g:312:1: 'reply'
                    {
                     before(grammarAccess.getEventExtensionsAccess().getReplyKeyword_7()); 
                    match(input,19,FOLLOW_2); 
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
    // InternalStateMachineTriggers.g:326:1: rule__Trigger__Group__0 : rule__Trigger__Group__0__Impl rule__Trigger__Group__1 ;
    public final void rule__Trigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:330:1: ( rule__Trigger__Group__0__Impl rule__Trigger__Group__1 )
            // InternalStateMachineTriggers.g:331:2: rule__Trigger__Group__0__Impl rule__Trigger__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Trigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:338:1: rule__Trigger__Group__0__Impl : ( ( rule__Trigger__LeftAssignment_0 ) ) ;
    public final void rule__Trigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:342:1: ( ( ( rule__Trigger__LeftAssignment_0 ) ) )
            // InternalStateMachineTriggers.g:343:1: ( ( rule__Trigger__LeftAssignment_0 ) )
            {
            // InternalStateMachineTriggers.g:343:1: ( ( rule__Trigger__LeftAssignment_0 ) )
            // InternalStateMachineTriggers.g:344:1: ( rule__Trigger__LeftAssignment_0 )
            {
             before(grammarAccess.getTriggerAccess().getLeftAssignment_0()); 
            // InternalStateMachineTriggers.g:345:1: ( rule__Trigger__LeftAssignment_0 )
            // InternalStateMachineTriggers.g:345:2: rule__Trigger__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:355:1: rule__Trigger__Group__1 : rule__Trigger__Group__1__Impl ;
    public final void rule__Trigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:359:1: ( rule__Trigger__Group__1__Impl )
            // InternalStateMachineTriggers.g:360:2: rule__Trigger__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:366:1: rule__Trigger__Group__1__Impl : ( ( rule__Trigger__RightAssignment_1 )? ) ;
    public final void rule__Trigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:370:1: ( ( ( rule__Trigger__RightAssignment_1 )? ) )
            // InternalStateMachineTriggers.g:371:1: ( ( rule__Trigger__RightAssignment_1 )? )
            {
            // InternalStateMachineTriggers.g:371:1: ( ( rule__Trigger__RightAssignment_1 )? )
            // InternalStateMachineTriggers.g:372:1: ( rule__Trigger__RightAssignment_1 )?
            {
             before(grammarAccess.getTriggerAccess().getRightAssignment_1()); 
            // InternalStateMachineTriggers.g:373:1: ( rule__Trigger__RightAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalStateMachineTriggers.g:373:2: rule__Trigger__RightAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:387:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:391:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // InternalStateMachineTriggers.g:392:2: rule__Left__Group__0__Impl rule__Left__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Left__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:399:1: rule__Left__Group__0__Impl : ( '@' ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:403:1: ( ( '@' ) )
            // InternalStateMachineTriggers.g:404:1: ( '@' )
            {
            // InternalStateMachineTriggers.g:404:1: ( '@' )
            // InternalStateMachineTriggers.g:405:1: '@'
            {
             before(grammarAccess.getLeftAccess().getCommercialAtKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalStateMachineTriggers.g:418:1: rule__Left__Group__1 : rule__Left__Group__1__Impl ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:422:1: ( rule__Left__Group__1__Impl )
            // InternalStateMachineTriggers.g:423:2: rule__Left__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:429:1: rule__Left__Group__1__Impl : ( ( rule__Left__EventAssignment_1 ) ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:433:1: ( ( ( rule__Left__EventAssignment_1 ) ) )
            // InternalStateMachineTriggers.g:434:1: ( ( rule__Left__EventAssignment_1 ) )
            {
            // InternalStateMachineTriggers.g:434:1: ( ( rule__Left__EventAssignment_1 ) )
            // InternalStateMachineTriggers.g:435:1: ( rule__Left__EventAssignment_1 )
            {
             before(grammarAccess.getLeftAccess().getEventAssignment_1()); 
            // InternalStateMachineTriggers.g:436:1: ( rule__Left__EventAssignment_1 )
            // InternalStateMachineTriggers.g:436:2: rule__Left__EventAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:450:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:454:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalStateMachineTriggers.g:455:2: rule__Right__Group__0__Impl rule__Right__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Right__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:462:1: rule__Right__Group__0__Impl : ( '-' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:466:1: ( ( '-' ) )
            // InternalStateMachineTriggers.g:467:1: ( '-' )
            {
            // InternalStateMachineTriggers.g:467:1: ( '-' )
            // InternalStateMachineTriggers.g:468:1: '-'
            {
             before(grammarAccess.getRightAccess().getHyphenMinusKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalStateMachineTriggers.g:481:1: rule__Right__Group__1 : rule__Right__Group__1__Impl rule__Right__Group__2 ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:485:1: ( rule__Right__Group__1__Impl rule__Right__Group__2 )
            // InternalStateMachineTriggers.g:486:2: rule__Right__Group__1__Impl rule__Right__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Right__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:493:1: rule__Right__Group__1__Impl : ( '@' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:497:1: ( ( '@' ) )
            // InternalStateMachineTriggers.g:498:1: ( '@' )
            {
            // InternalStateMachineTriggers.g:498:1: ( '@' )
            // InternalStateMachineTriggers.g:499:1: '@'
            {
             before(grammarAccess.getRightAccess().getCommercialAtKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalStateMachineTriggers.g:512:1: rule__Right__Group__2 : rule__Right__Group__2__Impl rule__Right__Group__3 ;
    public final void rule__Right__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:516:1: ( rule__Right__Group__2__Impl rule__Right__Group__3 )
            // InternalStateMachineTriggers.g:517:2: rule__Right__Group__2__Impl rule__Right__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Right__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:524:1: rule__Right__Group__2__Impl : ( ( rule__Right__EventAssignment_2 ) ) ;
    public final void rule__Right__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:528:1: ( ( ( rule__Right__EventAssignment_2 ) ) )
            // InternalStateMachineTriggers.g:529:1: ( ( rule__Right__EventAssignment_2 ) )
            {
            // InternalStateMachineTriggers.g:529:1: ( ( rule__Right__EventAssignment_2 ) )
            // InternalStateMachineTriggers.g:530:1: ( rule__Right__EventAssignment_2 )
            {
             before(grammarAccess.getRightAccess().getEventAssignment_2()); 
            // InternalStateMachineTriggers.g:531:1: ( rule__Right__EventAssignment_2 )
            // InternalStateMachineTriggers.g:531:2: rule__Right__EventAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:541:1: rule__Right__Group__3 : rule__Right__Group__3__Impl rule__Right__Group__4 ;
    public final void rule__Right__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:545:1: ( rule__Right__Group__3__Impl rule__Right__Group__4 )
            // InternalStateMachineTriggers.g:546:2: rule__Right__Group__3__Impl rule__Right__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Right__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:553:1: rule__Right__Group__3__Impl : ( ( rule__Right__OpAssignment_3 ) ) ;
    public final void rule__Right__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:557:1: ( ( ( rule__Right__OpAssignment_3 ) ) )
            // InternalStateMachineTriggers.g:558:1: ( ( rule__Right__OpAssignment_3 ) )
            {
            // InternalStateMachineTriggers.g:558:1: ( ( rule__Right__OpAssignment_3 ) )
            // InternalStateMachineTriggers.g:559:1: ( rule__Right__OpAssignment_3 )
            {
             before(grammarAccess.getRightAccess().getOpAssignment_3()); 
            // InternalStateMachineTriggers.g:560:1: ( rule__Right__OpAssignment_3 )
            // InternalStateMachineTriggers.g:560:2: rule__Right__OpAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:570:1: rule__Right__Group__4 : rule__Right__Group__4__Impl ;
    public final void rule__Right__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:574:1: ( rule__Right__Group__4__Impl )
            // InternalStateMachineTriggers.g:575:2: rule__Right__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:581:1: rule__Right__Group__4__Impl : ( ( rule__Right__ValueAssignment_4 ) ) ;
    public final void rule__Right__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:585:1: ( ( ( rule__Right__ValueAssignment_4 ) ) )
            // InternalStateMachineTriggers.g:586:1: ( ( rule__Right__ValueAssignment_4 ) )
            {
            // InternalStateMachineTriggers.g:586:1: ( ( rule__Right__ValueAssignment_4 ) )
            // InternalStateMachineTriggers.g:587:1: ( rule__Right__ValueAssignment_4 )
            {
             before(grammarAccess.getRightAccess().getValueAssignment_4()); 
            // InternalStateMachineTriggers.g:588:1: ( rule__Right__ValueAssignment_4 )
            // InternalStateMachineTriggers.g:588:2: rule__Right__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:608:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:612:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // InternalStateMachineTriggers.g:613:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Event__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:620:1: rule__Event__Group_0__0__Impl : ( ( rule__Event__EventNameAssignment_0_0 ) ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:624:1: ( ( ( rule__Event__EventNameAssignment_0_0 ) ) )
            // InternalStateMachineTriggers.g:625:1: ( ( rule__Event__EventNameAssignment_0_0 ) )
            {
            // InternalStateMachineTriggers.g:625:1: ( ( rule__Event__EventNameAssignment_0_0 ) )
            // InternalStateMachineTriggers.g:626:1: ( rule__Event__EventNameAssignment_0_0 )
            {
             before(grammarAccess.getEventAccess().getEventNameAssignment_0_0()); 
            // InternalStateMachineTriggers.g:627:1: ( rule__Event__EventNameAssignment_0_0 )
            // InternalStateMachineTriggers.g:627:2: rule__Event__EventNameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:637:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl rule__Event__Group_0__2 ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:641:1: ( rule__Event__Group_0__1__Impl rule__Event__Group_0__2 )
            // InternalStateMachineTriggers.g:642:2: rule__Event__Group_0__1__Impl rule__Event__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Event__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:649:1: rule__Event__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:653:1: ( ( '.' ) )
            // InternalStateMachineTriggers.g:654:1: ( '.' )
            {
            // InternalStateMachineTriggers.g:654:1: ( '.' )
            // InternalStateMachineTriggers.g:655:1: '.'
            {
             before(grammarAccess.getEventAccess().getFullStopKeyword_0_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalStateMachineTriggers.g:668:1: rule__Event__Group_0__2 : rule__Event__Group_0__2__Impl ;
    public final void rule__Event__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:672:1: ( rule__Event__Group_0__2__Impl )
            // InternalStateMachineTriggers.g:673:2: rule__Event__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:679:1: rule__Event__Group_0__2__Impl : ( ( rule__Event__EventExtensionAssignment_0_2 ) ) ;
    public final void rule__Event__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:683:1: ( ( ( rule__Event__EventExtensionAssignment_0_2 ) ) )
            // InternalStateMachineTriggers.g:684:1: ( ( rule__Event__EventExtensionAssignment_0_2 ) )
            {
            // InternalStateMachineTriggers.g:684:1: ( ( rule__Event__EventExtensionAssignment_0_2 ) )
            // InternalStateMachineTriggers.g:685:1: ( rule__Event__EventExtensionAssignment_0_2 )
            {
             before(grammarAccess.getEventAccess().getEventExtensionAssignment_0_2()); 
            // InternalStateMachineTriggers.g:686:1: ( rule__Event__EventExtensionAssignment_0_2 )
            // InternalStateMachineTriggers.g:686:2: rule__Event__EventExtensionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:703:1: rule__Model__TriggerAssignment : ( ruleTrigger ) ;
    public final void rule__Model__TriggerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:707:1: ( ( ruleTrigger ) )
            // InternalStateMachineTriggers.g:708:1: ( ruleTrigger )
            {
            // InternalStateMachineTriggers.g:708:1: ( ruleTrigger )
            // InternalStateMachineTriggers.g:709:1: ruleTrigger
            {
             before(grammarAccess.getModelAccess().getTriggerTriggerParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:718:1: rule__Trigger__LeftAssignment_0 : ( ruleLeft ) ;
    public final void rule__Trigger__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:722:1: ( ( ruleLeft ) )
            // InternalStateMachineTriggers.g:723:1: ( ruleLeft )
            {
            // InternalStateMachineTriggers.g:723:1: ( ruleLeft )
            // InternalStateMachineTriggers.g:724:1: ruleLeft
            {
             before(grammarAccess.getTriggerAccess().getLeftLeftParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:733:1: rule__Trigger__RightAssignment_1 : ( ruleRight ) ;
    public final void rule__Trigger__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:737:1: ( ( ruleRight ) )
            // InternalStateMachineTriggers.g:738:1: ( ruleRight )
            {
            // InternalStateMachineTriggers.g:738:1: ( ruleRight )
            // InternalStateMachineTriggers.g:739:1: ruleRight
            {
             before(grammarAccess.getTriggerAccess().getRightRightParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:748:1: rule__Left__EventAssignment_1 : ( ruleEvent ) ;
    public final void rule__Left__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:752:1: ( ( ruleEvent ) )
            // InternalStateMachineTriggers.g:753:1: ( ruleEvent )
            {
            // InternalStateMachineTriggers.g:753:1: ( ruleEvent )
            // InternalStateMachineTriggers.g:754:1: ruleEvent
            {
             before(grammarAccess.getLeftAccess().getEventEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:763:1: rule__Right__EventAssignment_2 : ( ruleEvent ) ;
    public final void rule__Right__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:767:1: ( ( ruleEvent ) )
            // InternalStateMachineTriggers.g:768:1: ( ruleEvent )
            {
            // InternalStateMachineTriggers.g:768:1: ( ruleEvent )
            // InternalStateMachineTriggers.g:769:1: ruleEvent
            {
             before(grammarAccess.getRightAccess().getEventEventParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:778:1: rule__Right__OpAssignment_3 : ( RULE_RELATIONS ) ;
    public final void rule__Right__OpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:782:1: ( ( RULE_RELATIONS ) )
            // InternalStateMachineTriggers.g:783:1: ( RULE_RELATIONS )
            {
            // InternalStateMachineTriggers.g:783:1: ( RULE_RELATIONS )
            // InternalStateMachineTriggers.g:784:1: RULE_RELATIONS
            {
             before(grammarAccess.getRightAccess().getOpRELATIONSTerminalRuleCall_3_0()); 
            match(input,RULE_RELATIONS,FOLLOW_2); 
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
    // InternalStateMachineTriggers.g:793:1: rule__Right__ValueAssignment_4 : ( RULE_INT ) ;
    public final void rule__Right__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:797:1: ( ( RULE_INT ) )
            // InternalStateMachineTriggers.g:798:1: ( RULE_INT )
            {
            // InternalStateMachineTriggers.g:798:1: ( RULE_INT )
            // InternalStateMachineTriggers.g:799:1: RULE_INT
            {
             before(grammarAccess.getRightAccess().getValueINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalStateMachineTriggers.g:808:1: rule__Event__EventNameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Event__EventNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:812:1: ( ( RULE_ID ) )
            // InternalStateMachineTriggers.g:813:1: ( RULE_ID )
            {
            // InternalStateMachineTriggers.g:813:1: ( RULE_ID )
            // InternalStateMachineTriggers.g:814:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalStateMachineTriggers.g:823:1: rule__Event__EventExtensionAssignment_0_2 : ( ruleEventExtensions ) ;
    public final void rule__Event__EventExtensionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:827:1: ( ( ruleEventExtensions ) )
            // InternalStateMachineTriggers.g:828:1: ( ruleEventExtensions )
            {
            // InternalStateMachineTriggers.g:828:1: ( ruleEventExtensions )
            // InternalStateMachineTriggers.g:829:1: ruleEventExtensions
            {
             before(grammarAccess.getEventAccess().getEventExtensionEventExtensionsParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalStateMachineTriggers.g:838:1: rule__Event__NowEventAssignment_1 : ( ( 'now' ) ) ;
    public final void rule__Event__NowEventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalStateMachineTriggers.g:842:1: ( ( ( 'now' ) ) )
            // InternalStateMachineTriggers.g:843:1: ( ( 'now' ) )
            {
            // InternalStateMachineTriggers.g:843:1: ( ( 'now' ) )
            // InternalStateMachineTriggers.g:844:1: ( 'now' )
            {
             before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 
            // InternalStateMachineTriggers.g:845:1: ( 'now' )
            // InternalStateMachineTriggers.g:846:1: 'now'
            {
             before(grammarAccess.getEventAccess().getNowEventNowKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000FF000L});

}