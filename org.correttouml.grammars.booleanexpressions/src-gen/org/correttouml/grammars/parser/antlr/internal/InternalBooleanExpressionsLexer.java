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
    public static final int RULE_RELATIONS=7;
    public static final int RULE_STRING=11;
    public static final int RULE_NOT=6;
    public static final int RULE_AND=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_OR=4;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_OPERATOR=10;
    public static final int RULE_ID=9;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalBooleanExpressionsLexer() {;} 
    public InternalBooleanExpressionsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBooleanExpressionsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBooleanExpressions.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBooleanExpressions.g:11:7: ( '(' )
            // InternalBooleanExpressions.g:11:9: '('
            {
            match('('); 

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
            // InternalBooleanExpressions.g:12:7: ( ')' )
            // InternalBooleanExpressions.g:12:9: ')'
            {
            match(')'); 

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
            // InternalBooleanExpressions.g:13:7: ( '@' )
            // InternalBooleanExpressions.g:13:9: '@'
            {
            match('@'); 

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
            // InternalBooleanExpressions.g:14:7: ( '-' )
            // InternalBooleanExpressions.g:14:9: '-'
            {
            match('-'); 

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
            // InternalBooleanExpressions.g:15:7: ( '.' )
            // InternalBooleanExpressions.g:15:9: '.'
            {
            match('.'); 

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
            // InternalBooleanExpressions.g:16:7: ( 'now' )
            // InternalBooleanExpressions.g:16:9: 'now'
            {
            match("now"); 


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
            // InternalBooleanExpressions.g:17:7: ( 'exit' )
            // InternalBooleanExpressions.g:17:9: 'exit'
            {
            match("exit"); 


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
            // InternalBooleanExpressions.g:18:7: ( 'enter' )
            // InternalBooleanExpressions.g:18:9: 'enter'
            {
            match("enter"); 


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
            // InternalBooleanExpressions.g:19:7: ( 'start' )
            // InternalBooleanExpressions.g:19:9: 'start'
            {
            match("start"); 


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
            // InternalBooleanExpressions.g:20:7: ( 'end' )
            // InternalBooleanExpressions.g:20:9: 'end'
            {
            match("end"); 


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
            // InternalBooleanExpressions.g:21:7: ( 'tick' )
            // InternalBooleanExpressions.g:21:9: 'tick'
            {
            match("tick"); 


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
            // InternalBooleanExpressions.g:22:7: ( 'sig' )
            // InternalBooleanExpressions.g:22:9: 'sig'
            {
            match("sig"); 


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
            // InternalBooleanExpressions.g:23:7: ( 'call' )
            // InternalBooleanExpressions.g:23:9: 'call'
            {
            match("call"); 


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
            // InternalBooleanExpressions.g:24:7: ( 'send' )
            // InternalBooleanExpressions.g:24:9: 'send'
            {
            match("send"); 


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
            // InternalBooleanExpressions.g:25:7: ( 'receive' )
            // InternalBooleanExpressions.g:25:9: 'receive'
            {
            match("receive"); 


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
            // InternalBooleanExpressions.g:26:7: ( 'reply' )
            // InternalBooleanExpressions.g:26:9: 'reply'
            {
            match("reply"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_OPERATOR"
    public final void mRULE_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBooleanExpressions.g:962:15: ( ( '+' | '*' | '--' ) )
            // InternalBooleanExpressions.g:962:17: ( '+' | '*' | '--' )
            {
            // InternalBooleanExpressions.g:962:17: ( '+' | '*' | '--' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt1=1;
                }
                break;
            case '*':
                {
                alt1=2;
                }
                break;
            case '-':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBooleanExpressions.g:962:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalBooleanExpressions.g:962:22: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 3 :
                    // InternalBooleanExpressions.g:962:26: '--'
                    {
                    match("--"); 


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
    // $ANTLR end "RULE_OPERATOR"

    // $ANTLR start "RULE_RELATIONS"
    public final void mRULE_RELATIONS() throws RecognitionException {
        try {
            int _type = RULE_RELATIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBooleanExpressions.g:964:16: ( ( '<' | '>' | '==' | '<=' | '>=' | '!=' ) )
            // InternalBooleanExpressions.g:964:18: ( '<' | '>' | '==' | '<=' | '>=' | '!=' )
            {
            // InternalBooleanExpressions.g:964:18: ( '<' | '>' | '==' | '<=' | '>=' | '!=' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=4;
                }
                else {
                    alt2=1;}
                }
                break;
            case '>':
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='=') ) {
                    alt2=5;
                }
                else {
                    alt2=2;}
                }
                break;
            case '=':
                {
                alt2=3;
                }
                break;
            case '!':
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBooleanExpressions.g:964:19: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // InternalBooleanExpressions.g:964:23: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // InternalBooleanExpressions.g:964:27: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 4 :
                    // InternalBooleanExpressions.g:964:32: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalBooleanExpressions.g:964:37: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 6 :
                    // InternalBooleanExpressions.g:964:42: '!='
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
            // InternalBooleanExpressions.g:966:9: ( '||' )
            // InternalBooleanExpressions.g:966:11: '||'
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
            // InternalBooleanExpressions.g:968:10: ( '&&' )
            // InternalBooleanExpressions.g:968:12: '&&'
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
            // InternalBooleanExpressions.g:970:10: ( '!!' )
            // InternalBooleanExpressions.g:970:12: '!!'
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
            // InternalBooleanExpressions.g:972:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBooleanExpressions.g:972:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBooleanExpressions.g:972:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBooleanExpressions.g:972:11: '^'
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

            // InternalBooleanExpressions.g:972:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBooleanExpressions.g:
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
            	    break loop4;
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
            // InternalBooleanExpressions.g:974:10: ( ( '0' .. '9' )+ )
            // InternalBooleanExpressions.g:974:12: ( '0' .. '9' )+
            {
            // InternalBooleanExpressions.g:974:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBooleanExpressions.g:974:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // InternalBooleanExpressions.g:976:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBooleanExpressions.g:976:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBooleanExpressions.g:976:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBooleanExpressions.g:976:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBooleanExpressions.g:976:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBooleanExpressions.g:976:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBooleanExpressions.g:976:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalBooleanExpressions.g:976:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBooleanExpressions.g:976:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBooleanExpressions.g:976:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBooleanExpressions.g:976:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalBooleanExpressions.g:978:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBooleanExpressions.g:978:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBooleanExpressions.g:978:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBooleanExpressions.g:978:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalBooleanExpressions.g:980:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBooleanExpressions.g:980:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBooleanExpressions.g:980:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBooleanExpressions.g:980:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalBooleanExpressions.g:980:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBooleanExpressions.g:980:41: ( '\\r' )? '\\n'
                    {
                    // InternalBooleanExpressions.g:980:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalBooleanExpressions.g:980:41: '\\r'
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
            // InternalBooleanExpressions.g:982:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBooleanExpressions.g:982:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBooleanExpressions.g:982:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBooleanExpressions.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalBooleanExpressions.g:984:16: ( . )
            // InternalBooleanExpressions.g:984:18: .
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
        // InternalBooleanExpressions.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_OPERATOR | RULE_RELATIONS | RULE_OR | RULE_AND | RULE_NOT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=28;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalBooleanExpressions.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalBooleanExpressions.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalBooleanExpressions.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalBooleanExpressions.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalBooleanExpressions.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalBooleanExpressions.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalBooleanExpressions.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalBooleanExpressions.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalBooleanExpressions.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalBooleanExpressions.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalBooleanExpressions.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalBooleanExpressions.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalBooleanExpressions.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalBooleanExpressions.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalBooleanExpressions.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalBooleanExpressions.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalBooleanExpressions.g:1:106: RULE_OPERATOR
                {
                mRULE_OPERATOR(); 

                }
                break;
            case 18 :
                // InternalBooleanExpressions.g:1:120: RULE_RELATIONS
                {
                mRULE_RELATIONS(); 

                }
                break;
            case 19 :
                // InternalBooleanExpressions.g:1:135: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 20 :
                // InternalBooleanExpressions.g:1:143: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 21 :
                // InternalBooleanExpressions.g:1:152: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 22 :
                // InternalBooleanExpressions.g:1:161: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalBooleanExpressions.g:1:169: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // InternalBooleanExpressions.g:1:178: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalBooleanExpressions.g:1:190: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // InternalBooleanExpressions.g:1:206: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalBooleanExpressions.g:1:222: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalBooleanExpressions.g:1:230: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\4\uffff\1\40\1\uffff\6\43\4\uffff\5\33\2\uffff\3\33\10\uffff\1\43\1\uffff\10\43\11\uffff\1\100\2\43\1\103\1\43\1\105\5\43\1\uffff\1\113\1\43\1\uffff\1\43\1\uffff\1\116\1\117\1\120\2\43\1\uffff\1\123\1\124\3\uffff\1\43\1\126\2\uffff\1\43\1\uffff\1\130\1\uffff";
    static final String DFA14_eofS =
        "\131\uffff";
    static final String DFA14_minS =
        "\1\0\3\uffff\1\55\1\uffff\1\157\1\156\1\145\1\151\1\141\1\145\4\uffff\1\75\1\41\1\174\1\46\1\101\2\uffff\2\0\1\52\10\uffff\1\167\1\uffff\1\151\1\144\1\141\1\147\1\156\1\143\1\154\1\143\11\uffff\1\60\1\164\1\145\1\60\1\162\1\60\1\144\1\153\1\154\1\145\1\154\1\uffff\1\60\1\162\1\uffff\1\164\1\uffff\3\60\1\151\1\171\1\uffff\2\60\3\uffff\1\166\1\60\2\uffff\1\145\1\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\3\uffff\1\55\1\uffff\1\157\1\170\1\164\1\151\1\141\1\145\4\uffff\2\75\1\174\1\46\1\172\2\uffff\2\uffff\1\57\10\uffff\1\167\1\uffff\1\151\1\164\1\141\1\147\1\156\1\143\1\154\1\160\11\uffff\1\172\1\164\1\145\1\172\1\162\1\172\1\144\1\153\1\154\1\145\1\154\1\uffff\1\172\1\162\1\uffff\1\164\1\uffff\3\172\1\151\1\171\1\uffff\2\172\3\uffff\1\166\1\172\2\uffff\1\145\1\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\6\uffff\2\21\2\22\5\uffff\1\26\1\27\3\uffff\1\33\1\34\1\1\1\2\1\3\1\21\1\4\1\5\1\uffff\1\26\10\uffff\1\22\1\25\1\23\1\24\1\27\1\30\1\31\1\32\1\33\13\uffff\1\6\2\uffff\1\12\1\uffff\1\14\5\uffff\1\7\2\uffff\1\16\1\13\1\15\2\uffff\1\10\1\11\1\uffff\1\20\1\uffff\1\17";
    static final String DFA14_specialS =
        "\1\2\26\uffff\1\0\1\1\100\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\21\1\27\3\33\1\23\1\30\1\1\1\2\1\15\1\14\1\33\1\4\1\5\1\31\12\26\2\33\1\16\1\20\1\17\1\33\1\3\32\25\3\33\1\24\1\25\1\33\2\25\1\12\1\25\1\7\10\25\1\6\3\25\1\13\1\10\1\11\6\25\1\33\1\22\uff83\33",
            "",
            "",
            "",
            "\1\37",
            "",
            "\1\42",
            "\1\45\11\uffff\1\44",
            "\1\50\3\uffff\1\47\12\uffff\1\46",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\55\33\uffff\1\54",
            "\1\56",
            "\1\57",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\0\61",
            "\0\61",
            "\1\62\4\uffff\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "",
            "\1\66",
            "\1\70\17\uffff\1\67",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76\14\uffff\1\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\101",
            "\1\102",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\104",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\114",
            "",
            "\1\115",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\121",
            "\1\122",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\125",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\127",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_OPERATOR | RULE_RELATIONS | RULE_OR | RULE_AND | RULE_NOT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( ((LA14_23>='\u0000' && LA14_23<='\uFFFF')) ) {s = 49;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_24 = input.LA(1);

                        s = -1;
                        if ( ((LA14_24>='\u0000' && LA14_24<='\uFFFF')) ) {s = 49;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='(') ) {s = 1;}

                        else if ( (LA14_0==')') ) {s = 2;}

                        else if ( (LA14_0=='@') ) {s = 3;}

                        else if ( (LA14_0=='-') ) {s = 4;}

                        else if ( (LA14_0=='.') ) {s = 5;}

                        else if ( (LA14_0=='n') ) {s = 6;}

                        else if ( (LA14_0=='e') ) {s = 7;}

                        else if ( (LA14_0=='s') ) {s = 8;}

                        else if ( (LA14_0=='t') ) {s = 9;}

                        else if ( (LA14_0=='c') ) {s = 10;}

                        else if ( (LA14_0=='r') ) {s = 11;}

                        else if ( (LA14_0=='+') ) {s = 12;}

                        else if ( (LA14_0=='*') ) {s = 13;}

                        else if ( (LA14_0=='<') ) {s = 14;}

                        else if ( (LA14_0=='>') ) {s = 15;}

                        else if ( (LA14_0=='=') ) {s = 16;}

                        else if ( (LA14_0=='!') ) {s = 17;}

                        else if ( (LA14_0=='|') ) {s = 18;}

                        else if ( (LA14_0=='&') ) {s = 19;}

                        else if ( (LA14_0=='^') ) {s = 20;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='b')||LA14_0=='d'||(LA14_0>='f' && LA14_0<='m')||(LA14_0>='o' && LA14_0<='q')||(LA14_0>='u' && LA14_0<='z')) ) {s = 21;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 22;}

                        else if ( (LA14_0=='\"') ) {s = 23;}

                        else if ( (LA14_0=='\'') ) {s = 24;}

                        else if ( (LA14_0=='/') ) {s = 25;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 26;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='%')||LA14_0==','||(LA14_0>=':' && LA14_0<=';')||LA14_0=='?'||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='{'||(LA14_0>='}' && LA14_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}