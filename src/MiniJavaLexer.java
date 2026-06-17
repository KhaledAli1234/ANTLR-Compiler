// $ANTLR 3.4 MiniJava.g 2026-04-30 02:37:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int ARRAY=4;
    public static final int ASSIGN=5;
    public static final int BLOCK=6;
    public static final int CLASS=7;
    public static final int CONDITION=8;
    public static final int FOR=9;
    public static final int ID=10;
    public static final int IF=11;
    public static final int INT=12;
    public static final int METHOD=13;
    public static final int PARAM=14;
    public static final int PROGRAM=15;
    public static final int RETURN=16;
    public static final int VAR=17;
    public static final int WHILE=18;
    public static final int WS=19;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MiniJavaLexer() {} 
    public MiniJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "MiniJava.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:2:7: ( '!=' )
            // MiniJava.g:2:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:3:7: ( '&&' )
            // MiniJava.g:3:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:4:7: ( '(' )
            // MiniJava.g:4:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:5:7: ( ')' )
            // MiniJava.g:5:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:6:7: ( '*' )
            // MiniJava.g:6:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:7:7: ( '+' )
            // MiniJava.g:7:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:8:7: ( ',' )
            // MiniJava.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:9:7: ( '-' )
            // MiniJava.g:9:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:10:7: ( '/' )
            // MiniJava.g:10:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:11:7: ( ';' )
            // MiniJava.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:12:7: ( '<' )
            // MiniJava.g:12:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:13:7: ( '<=' )
            // MiniJava.g:13:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:14:7: ( '=' )
            // MiniJava.g:14:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:15:7: ( '==' )
            // MiniJava.g:15:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:16:7: ( '>' )
            // MiniJava.g:16:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:17:7: ( '>=' )
            // MiniJava.g:17:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:18:7: ( '[' )
            // MiniJava.g:18:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:19:7: ( ']' )
            // MiniJava.g:19:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:20:7: ( 'boolean' )
            // MiniJava.g:20:9: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:21:7: ( 'class' )
            // MiniJava.g:21:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:22:7: ( 'else' )
            // MiniJava.g:22:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:23:7: ( 'for' )
            // MiniJava.g:23:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:24:7: ( 'if' )
            // MiniJava.g:24:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:25:7: ( 'int' )
            // MiniJava.g:25:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:26:7: ( 'public' )
            // MiniJava.g:26:9: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:27:7: ( 'return' )
            // MiniJava.g:27:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:28:7: ( 'while' )
            // MiniJava.g:28:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:29:7: ( '{' )
            // MiniJava.g:29:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:30:7: ( '||' )
            // MiniJava.g:30:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:31:7: ( '}' )
            // MiniJava.g:31:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:179:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // MiniJava.g:179:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // MiniJava.g:179:7: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MiniJava.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:180:5: ( ( '0' .. '9' )+ )
            // MiniJava.g:180:7: ( '0' .. '9' )+
            {
            // MiniJava.g:180:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MiniJava.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MiniJava.g:182:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // MiniJava.g:182:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // MiniJava.g:182:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // MiniJava.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // MiniJava.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | ID | INT | WS )
        int alt4=33;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // MiniJava.g:1:10: T__20
                {
                mT__20(); 


                }
                break;
            case 2 :
                // MiniJava.g:1:16: T__21
                {
                mT__21(); 


                }
                break;
            case 3 :
                // MiniJava.g:1:22: T__22
                {
                mT__22(); 


                }
                break;
            case 4 :
                // MiniJava.g:1:28: T__23
                {
                mT__23(); 


                }
                break;
            case 5 :
                // MiniJava.g:1:34: T__24
                {
                mT__24(); 


                }
                break;
            case 6 :
                // MiniJava.g:1:40: T__25
                {
                mT__25(); 


                }
                break;
            case 7 :
                // MiniJava.g:1:46: T__26
                {
                mT__26(); 


                }
                break;
            case 8 :
                // MiniJava.g:1:52: T__27
                {
                mT__27(); 


                }
                break;
            case 9 :
                // MiniJava.g:1:58: T__28
                {
                mT__28(); 


                }
                break;
            case 10 :
                // MiniJava.g:1:64: T__29
                {
                mT__29(); 


                }
                break;
            case 11 :
                // MiniJava.g:1:70: T__30
                {
                mT__30(); 


                }
                break;
            case 12 :
                // MiniJava.g:1:76: T__31
                {
                mT__31(); 


                }
                break;
            case 13 :
                // MiniJava.g:1:82: T__32
                {
                mT__32(); 


                }
                break;
            case 14 :
                // MiniJava.g:1:88: T__33
                {
                mT__33(); 


                }
                break;
            case 15 :
                // MiniJava.g:1:94: T__34
                {
                mT__34(); 


                }
                break;
            case 16 :
                // MiniJava.g:1:100: T__35
                {
                mT__35(); 


                }
                break;
            case 17 :
                // MiniJava.g:1:106: T__36
                {
                mT__36(); 


                }
                break;
            case 18 :
                // MiniJava.g:1:112: T__37
                {
                mT__37(); 


                }
                break;
            case 19 :
                // MiniJava.g:1:118: T__38
                {
                mT__38(); 


                }
                break;
            case 20 :
                // MiniJava.g:1:124: T__39
                {
                mT__39(); 


                }
                break;
            case 21 :
                // MiniJava.g:1:130: T__40
                {
                mT__40(); 


                }
                break;
            case 22 :
                // MiniJava.g:1:136: T__41
                {
                mT__41(); 


                }
                break;
            case 23 :
                // MiniJava.g:1:142: T__42
                {
                mT__42(); 


                }
                break;
            case 24 :
                // MiniJava.g:1:148: T__43
                {
                mT__43(); 


                }
                break;
            case 25 :
                // MiniJava.g:1:154: T__44
                {
                mT__44(); 


                }
                break;
            case 26 :
                // MiniJava.g:1:160: T__45
                {
                mT__45(); 


                }
                break;
            case 27 :
                // MiniJava.g:1:166: T__46
                {
                mT__46(); 


                }
                break;
            case 28 :
                // MiniJava.g:1:172: T__47
                {
                mT__47(); 


                }
                break;
            case 29 :
                // MiniJava.g:1:178: T__48
                {
                mT__48(); 


                }
                break;
            case 30 :
                // MiniJava.g:1:184: T__49
                {
                mT__49(); 


                }
                break;
            case 31 :
                // MiniJava.g:1:190: ID
                {
                mID(); 


                }
                break;
            case 32 :
                // MiniJava.g:1:193: INT
                {
                mINT(); 


                }
                break;
            case 33 :
                // MiniJava.g:1:197: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\13\uffff\1\37\1\41\1\43\2\uffff\10\33\14\uffff\4\33\1\61\7\33\1"+
        "\71\1\uffff\1\72\5\33\1\100\2\uffff\4\33\1\105\1\uffff\2\33\1\110"+
        "\1\33\1\uffff\1\112\1\113\1\uffff\1\114\3\uffff";
    static final String DFA4_eofS =
        "\115\uffff";
    static final String DFA4_minS =
        "\1\11\12\uffff\3\75\2\uffff\1\157\2\154\1\157\1\146\1\165\1\145"+
        "\1\150\14\uffff\1\157\1\141\1\163\1\162\1\101\1\164\1\142\1\164"+
        "\1\151\1\154\1\163\1\145\1\101\1\uffff\1\101\1\154\1\165\1\154\1"+
        "\145\1\163\1\101\2\uffff\1\151\1\162\1\145\1\141\1\101\1\uffff\1"+
        "\143\1\156\1\101\1\156\1\uffff\2\101\1\uffff\1\101\3\uffff";
    static final String DFA4_maxS =
        "\1\175\12\uffff\3\75\2\uffff\1\157\2\154\1\157\1\156\1\165\1\145"+
        "\1\150\14\uffff\1\157\1\141\1\163\1\162\1\172\1\164\1\142\1\164"+
        "\1\151\1\154\1\163\1\145\1\172\1\uffff\1\172\1\154\1\165\1\154\1"+
        "\145\1\163\1\172\2\uffff\1\151\1\162\1\145\1\141\1\172\1\uffff\1"+
        "\143\1\156\1\172\1\156\1\uffff\2\172\1\uffff\1\172\3\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\3\uffff\1\21"+
        "\1\22\10\uffff\1\34\1\35\1\36\1\37\1\40\1\41\1\14\1\13\1\16\1\15"+
        "\1\20\1\17\15\uffff\1\27\7\uffff\1\26\1\30\5\uffff\1\25\4\uffff"+
        "\1\24\2\uffff\1\33\1\uffff\1\31\1\32\1\23";
    static final String DFA4_specialS =
        "\115\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\1\1\4\uffff\1\2\1\uffff\1\3"+
            "\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\12\34\1\uffff\1\12\1\13\1"+
            "\14\1\15\2\uffff\32\33\1\16\1\uffff\1\17\3\uffff\1\33\1\20\1"+
            "\21\1\33\1\22\1\23\2\33\1\24\6\33\1\25\1\33\1\26\4\33\1\27\3"+
            "\33\1\30\1\31\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\40",
            "\1\42",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50\7\uffff\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\32\33\6\uffff\32\33",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\32\33\6\uffff\32\33",
            "",
            "\32\33\6\uffff\32\33",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\32\33\6\uffff\32\33",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\32\33\6\uffff\32\33",
            "",
            "\1\106",
            "\1\107",
            "\32\33\6\uffff\32\33",
            "\1\111",
            "",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "",
            "\32\33\6\uffff\32\33",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | ID | INT | WS );";
        }
    }
 

}