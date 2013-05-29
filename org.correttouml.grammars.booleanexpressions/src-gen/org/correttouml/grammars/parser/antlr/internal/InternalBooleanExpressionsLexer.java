package org.correttouml.grammars.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBooleanExpressionsLexer extends Lexer {
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
    public static final int T__19=19;
    public static final int T__30=30;
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

    public InternalBooleanExpressionsLexer() {;} 
    public InternalBooleanExpressionsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBooleanExpressionsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:11:7: ( '(' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:12:7: ( ')' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:13:7: ( '@' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:13:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:14:7: ( '-' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:15:7: ( '{' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:16:7: ( '}' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:17:7: ( '.' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:17:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:18:7: ( 'now' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:18:9: 'now'
            {
            match("now"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:19:7: ( 'exit' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:19:9: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:20:7: ( 'enter' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:20:9: 'enter'
            {
            match("enter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:21:7: ( 'start' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:21:9: 'start'
            {
            match("start"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:22:7: ( 'end' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:22:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:23:7: ( 'tick' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:23:9: 'tick'
            {
            match("tick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:24:7: ( 'sig' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:24:9: 'sig'
            {
            match("sig"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:25:7: ( 'call' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:25:9: 'call'
            {
            match("call"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:26:7: ( 'send' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:26:9: 'send'
            {
            match("send"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:27:7: ( 'receive' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:27:9: 'receive'
            {
            match("receive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_RELATIONS"
    public final void mRULE_RELATIONS() throws RecognitionException {
        try {
            int _type = RULE_RELATIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:822:16: ( ( '<' | '>' | '==' | '<=' | '>=' | '!=' ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:822:18: ( '<' | '>' | '==' | '<=' | '>=' | '!=' )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:822:18: ( '<' | '>' | '==' | '<=' | '>=' | '!=' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='=') ) {
                    alt1=4;
                }
                else {
                    alt1=1;}
                }
                break;
            case '>':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='=') ) {
                    alt1=5;
                }
                else {
                    alt1=2;}
                }
                break;
            case '=':
                {
                alt1=3;
                }
                break;
            case '!':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:822:19: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:822:23: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:822:27: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 4 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:822:32: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:822:37: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 6 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:822:42: '!='
                    {
                    match("!="); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RELATIONS"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:824:9: ( '||' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:824:11: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:826:10: ( '&&' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:826:12: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:828:10: ( '!!' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:828:12: '!!'
            {
            match("!!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:830:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:830:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:830:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:830:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:830:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:832:10: ( ( '0' .. '9' )+ )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:832:12: ( '0' .. '9' )+
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:832:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:832:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:834:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:834:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:834:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:834:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:834:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:834:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:834:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:834:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:834:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:834:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:834:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:836:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:836:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:836:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:836:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:838:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:838:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:838:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:838:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:838:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:838:41: ( '\\r' )? '\\n'
                    {
                    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:838:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:838:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:840:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:840:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:840:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:842:16: ( . )
            // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:842:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_RELATIONS | RULE_OR | RULE_AND | RULE_NOT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=28;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:112: RULE_RELATIONS
                {
                mRULE_RELATIONS(); 

                }
                break;
            case 19 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:127: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 20 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:135: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 21 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:144: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 22 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:153: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:161: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:170: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:182: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:198: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:214: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // ../org.correttouml.grammars.booleanexpressions/src-gen/org/correttouml/grammars/parser/antlr/internal/InternalBooleanExpressions.g:1:222: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\10\uffff\6\44\2\uffff\5\33\2\uffff\3\33\11\uffff\1\44\1\uffff\10"+
        "\44\11\uffff\1\100\2\44\1\103\1\44\1\105\4\44\1\uffff\1\112\1\44"+
        "\1\uffff\1\44\1\uffff\1\115\1\116\1\117\1\44\1\uffff\1\121\1\122"+
        "\3\uffff\1\44\2\uffff\1\44\1\125\1\uffff";
    static final String DFA13_eofS =
        "\126\uffff";
    static final String DFA13_minS =
        "\1\0\7\uffff\1\157\1\156\1\145\1\151\1\141\1\145\2\uffff\1\75\1"+
        "\41\1\174\1\46\1\101\2\uffff\2\0\1\52\11\uffff\1\167\1\uffff\1\151"+
        "\1\144\1\141\1\147\1\156\1\143\1\154\1\143\11\uffff\1\60\1\164\1"+
        "\145\1\60\1\162\1\60\1\144\1\153\1\154\1\145\1\uffff\1\60\1\162"+
        "\1\uffff\1\164\1\uffff\3\60\1\151\1\uffff\2\60\3\uffff\1\166\2\uffff"+
        "\1\145\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\7\uffff\1\157\1\170\1\164\1\151\1\141\1\145\2\uffff\2\75"+
        "\1\174\1\46\1\172\2\uffff\2\uffff\1\57\11\uffff\1\167\1\uffff\1"+
        "\151\1\164\1\141\1\147\1\156\1\143\1\154\1\143\11\uffff\1\172\1"+
        "\164\1\145\1\172\1\162\1\172\1\144\1\153\1\154\1\145\1\uffff\1\172"+
        "\1\162\1\uffff\1\164\1\uffff\3\172\1\151\1\uffff\2\172\3\uffff\1"+
        "\166\2\uffff\1\145\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\6\uffff\2\22\5\uffff\1\26\1"+
        "\27\3\uffff\1\33\1\34\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\26\10"+
        "\uffff\1\22\1\25\1\23\1\24\1\27\1\30\1\31\1\32\1\33\12\uffff\1\10"+
        "\2\uffff\1\14\1\uffff\1\16\4\uffff\1\11\2\uffff\1\20\1\15\1\17\1"+
        "\uffff\1\12\1\13\2\uffff\1\21";
    static final String DFA13_specialS =
        "\1\1\26\uffff\1\0\1\2\75\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\21\1\27\3\33\1\23\1\30\1"+
            "\1\1\2\3\33\1\4\1\7\1\31\12\26\2\33\1\16\1\20\1\17\1\33\1\3"+
            "\32\25\3\33\1\24\1\25\1\33\2\25\1\14\1\25\1\11\10\25\1\10\3"+
            "\25\1\15\1\12\1\13\6\25\1\5\1\22\1\6\uff82\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\46\11\uffff\1\45",
            "\1\51\3\uffff\1\50\12\uffff\1\47",
            "\1\52",
            "\1\53",
            "\1\54",
            "",
            "",
            "\1\55",
            "\1\56\33\uffff\1\55",
            "\1\57",
            "\1\60",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\0\62",
            "\0\62",
            "\1\63\4\uffff\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "",
            "\1\67",
            "\1\71\17\uffff\1\70",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\101",
            "\1\102",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\104",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\113",
            "",
            "\1\114",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\120",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\1\123",
            "",
            "",
            "\1\124",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_RELATIONS | RULE_OR | RULE_AND | RULE_NOT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_23 = input.LA(1);

                        s = -1;
                        if ( ((LA13_23>='\u0000' && LA13_23<='\uFFFF')) ) {s = 50;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='(') ) {s = 1;}

                        else if ( (LA13_0==')') ) {s = 2;}

                        else if ( (LA13_0=='@') ) {s = 3;}

                        else if ( (LA13_0=='-') ) {s = 4;}

                        else if ( (LA13_0=='{') ) {s = 5;}

                        else if ( (LA13_0=='}') ) {s = 6;}

                        else if ( (LA13_0=='.') ) {s = 7;}

                        else if ( (LA13_0=='n') ) {s = 8;}

                        else if ( (LA13_0=='e') ) {s = 9;}

                        else if ( (LA13_0=='s') ) {s = 10;}

                        else if ( (LA13_0=='t') ) {s = 11;}

                        else if ( (LA13_0=='c') ) {s = 12;}

                        else if ( (LA13_0=='r') ) {s = 13;}

                        else if ( (LA13_0=='<') ) {s = 14;}

                        else if ( (LA13_0=='>') ) {s = 15;}

                        else if ( (LA13_0=='=') ) {s = 16;}

                        else if ( (LA13_0=='!') ) {s = 17;}

                        else if ( (LA13_0=='|') ) {s = 18;}

                        else if ( (LA13_0=='&') ) {s = 19;}

                        else if ( (LA13_0=='^') ) {s = 20;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='b')||LA13_0=='d'||(LA13_0>='f' && LA13_0<='m')||(LA13_0>='o' && LA13_0<='q')||(LA13_0>='u' && LA13_0<='z')) ) {s = 21;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 22;}

                        else if ( (LA13_0=='\"') ) {s = 23;}

                        else if ( (LA13_0=='\'') ) {s = 24;}

                        else if ( (LA13_0=='/') ) {s = 25;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 26;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='%')||(LA13_0>='*' && LA13_0<=',')||(LA13_0>=':' && LA13_0<=';')||LA13_0=='?'||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_24 = input.LA(1);

                        s = -1;
                        if ( ((LA13_24>='\u0000' && LA13_24<='\uFFFF')) ) {s = 50;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}