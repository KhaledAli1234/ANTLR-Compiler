// $ANTLR 3.4 MiniJava.g 2026-04-30 02:37:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "ASSIGN", "BLOCK", "CLASS", "CONDITION", "FOR", "ID", "IF", "INT", "METHOD", "PARAM", "PROGRAM", "RETURN", "VAR", "WHILE", "WS", "'!='", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'['", "']'", "'boolean'", "'class'", "'else'", "'for'", "'if'", "'int'", "'public'", "'return'", "'while'", "'{'", "'||'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MiniJavaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniJavaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MiniJavaParser.tokenNames; }
    public String getGrammarFileName() { return "MiniJava.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // MiniJava.g:27:1: program : ( classDecl )+ EOF -> ^( PROGRAM ( classDecl )+ ) ;
    public final MiniJavaParser.program_return program() throws RecognitionException {
        MiniJavaParser.program_return retval = new MiniJavaParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF2=null;
        MiniJavaParser.classDecl_return classDecl1 =null;


        Object EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_classDecl=new RewriteRuleSubtreeStream(adaptor,"rule classDecl");
        try {
            // MiniJava.g:28:5: ( ( classDecl )+ EOF -> ^( PROGRAM ( classDecl )+ ) )
            // MiniJava.g:28:7: ( classDecl )+ EOF
            {
            // MiniJava.g:28:7: ( classDecl )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==39||LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MiniJava.g:28:7: classDecl
            	    {
            	    pushFollow(FOLLOW_classDecl_in_program135);
            	    classDecl1=classDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classDecl.add(classDecl1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program138); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: classDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 29:7: -> ^( PROGRAM ( classDecl )+ )
            {
                // MiniJava.g:29:10: ^( PROGRAM ( classDecl )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROGRAM, "PROGRAM")
                , root_1);

                if ( !(stream_classDecl.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_classDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_classDecl.nextTree());

                }
                stream_classDecl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDecl"
    // MiniJava.g:35:1: classDecl : ( 'public' )? 'class' ID '{' ( member )* '}' -> ^( CLASS ID ( member )* ) ;
    public final MiniJavaParser.classDecl_return classDecl() throws RecognitionException {
        MiniJavaParser.classDecl_return retval = new MiniJavaParser.classDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal3=null;
        Token string_literal4=null;
        Token ID5=null;
        Token char_literal6=null;
        Token char_literal8=null;
        MiniJavaParser.member_return member7 =null;


        Object string_literal3_tree=null;
        Object string_literal4_tree=null;
        Object ID5_tree=null;
        Object char_literal6_tree=null;
        Object char_literal8_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_member=new RewriteRuleSubtreeStream(adaptor,"rule member");
        try {
            // MiniJava.g:36:5: ( ( 'public' )? 'class' ID '{' ( member )* '}' -> ^( CLASS ID ( member )* ) )
            // MiniJava.g:36:7: ( 'public' )? 'class' ID '{' ( member )* '}'
            {
            // MiniJava.g:36:7: ( 'public' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==44) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // MiniJava.g:36:7: 'public'
                    {
                    string_literal3=(Token)match(input,44,FOLLOW_44_in_classDecl172); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_44.add(string_literal3);


                    }
                    break;

            }


            string_literal4=(Token)match(input,39,FOLLOW_39_in_classDecl175); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_39.add(string_literal4);


            ID5=(Token)match(input,ID,FOLLOW_ID_in_classDecl177); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID5);


            char_literal6=(Token)match(input,47,FOLLOW_47_in_classDecl179); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal6);


            // MiniJava.g:36:32: ( member )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==38||(LA3_0 >= 43 && LA3_0 <= 44)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // MiniJava.g:36:32: member
            	    {
            	    pushFollow(FOLLOW_member_in_classDecl181);
            	    member7=member();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_member.add(member7.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            char_literal8=(Token)match(input,49,FOLLOW_49_in_classDecl184); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal8);


            // AST REWRITE
            // elements: ID, member
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 37:7: -> ^( CLASS ID ( member )* )
            {
                // MiniJava.g:37:10: ^( CLASS ID ( member )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CLASS, "CLASS")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // MiniJava.g:37:21: ( member )*
                while ( stream_member.hasNext() ) {
                    adaptor.addChild(root_1, stream_member.nextTree());

                }
                stream_member.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classDecl"


    public static class member_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "member"
    // MiniJava.g:40:1: member : ( varDecl | methodDecl );
    public final MiniJavaParser.member_return member() throws RecognitionException {
        MiniJavaParser.member_return retval = new MiniJavaParser.member_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.varDecl_return varDecl9 =null;

        MiniJavaParser.methodDecl_return methodDecl10 =null;



        try {
            // MiniJava.g:41:5: ( varDecl | methodDecl )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==38||LA4_0==43) ) {
                alt4=1;
            }
            else if ( (LA4_0==44) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // MiniJava.g:41:7: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_member218);
                    varDecl9=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl9.getTree());

                    }
                    break;
                case 2 :
                    // MiniJava.g:42:7: methodDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodDecl_in_member226);
                    methodDecl10=methodDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDecl10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "member"


    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDecl"
    // MiniJava.g:48:1: varDecl : type ID ( '[' ']' )? ';' -> ^( VAR type ID ) ;
    public final MiniJavaParser.varDecl_return varDecl() throws RecognitionException {
        MiniJavaParser.varDecl_return retval = new MiniJavaParser.varDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID12=null;
        Token char_literal13=null;
        Token char_literal14=null;
        Token char_literal15=null;
        MiniJavaParser.type_return type11 =null;


        Object ID12_tree=null;
        Object char_literal13_tree=null;
        Object char_literal14_tree=null;
        Object char_literal15_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // MiniJava.g:49:5: ( type ID ( '[' ']' )? ';' -> ^( VAR type ID ) )
            // MiniJava.g:49:7: type ID ( '[' ']' )? ';'
            {
            pushFollow(FOLLOW_type_in_varDecl245);
            type11=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type11.getTree());

            ID12=(Token)match(input,ID,FOLLOW_ID_in_varDecl247); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID12);


            // MiniJava.g:49:15: ( '[' ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // MiniJava.g:49:16: '[' ']'
                    {
                    char_literal13=(Token)match(input,36,FOLLOW_36_in_varDecl250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal13);


                    char_literal14=(Token)match(input,37,FOLLOW_37_in_varDecl252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(char_literal14);


                    }
                    break;

            }


            char_literal15=(Token)match(input,29,FOLLOW_29_in_varDecl256); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal15);


            // AST REWRITE
            // elements: ID, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 50:7: -> ^( VAR type ID )
            {
                // MiniJava.g:50:10: ^( VAR type ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR, "VAR")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varDecl"


    public static class methodDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "methodDecl"
    // MiniJava.g:56:1: methodDecl : 'public' type ID '(' ( paramList )? ')' block -> ^( METHOD ID type ( paramList )? block ) ;
    public final MiniJavaParser.methodDecl_return methodDecl() throws RecognitionException {
        MiniJavaParser.methodDecl_return retval = new MiniJavaParser.methodDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal16=null;
        Token ID18=null;
        Token char_literal19=null;
        Token char_literal21=null;
        MiniJavaParser.type_return type17 =null;

        MiniJavaParser.paramList_return paramList20 =null;

        MiniJavaParser.block_return block22 =null;


        Object string_literal16_tree=null;
        Object ID18_tree=null;
        Object char_literal19_tree=null;
        Object char_literal21_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // MiniJava.g:57:5: ( 'public' type ID '(' ( paramList )? ')' block -> ^( METHOD ID type ( paramList )? block ) )
            // MiniJava.g:57:7: 'public' type ID '(' ( paramList )? ')' block
            {
            string_literal16=(Token)match(input,44,FOLLOW_44_in_methodDecl291); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_44.add(string_literal16);


            pushFollow(FOLLOW_type_in_methodDecl293);
            type17=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type17.getTree());

            ID18=(Token)match(input,ID,FOLLOW_ID_in_methodDecl295); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID18);


            char_literal19=(Token)match(input,22,FOLLOW_22_in_methodDecl297); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_22.add(char_literal19);


            // MiniJava.g:57:28: ( paramList )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==38||LA6_0==43) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // MiniJava.g:57:28: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_methodDecl299);
                    paramList20=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList20.getTree());

                    }
                    break;

            }


            char_literal21=(Token)match(input,23,FOLLOW_23_in_methodDecl302); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_23.add(char_literal21);


            pushFollow(FOLLOW_block_in_methodDecl304);
            block22=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block22.getTree());

            // AST REWRITE
            // elements: ID, paramList, block, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 58:7: -> ^( METHOD ID type ( paramList )? block )
            {
                // MiniJava.g:58:10: ^( METHOD ID type ( paramList )? block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(METHOD, "METHOD")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_type.nextTree());

                // MiniJava.g:58:27: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "methodDecl"


    public static class paramList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramList"
    // MiniJava.g:61:1: paramList : param ( ',' param )* ;
    public final MiniJavaParser.paramList_return paramList() throws RecognitionException {
        MiniJavaParser.paramList_return retval = new MiniJavaParser.paramList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal24=null;
        MiniJavaParser.param_return param23 =null;

        MiniJavaParser.param_return param25 =null;


        Object char_literal24_tree=null;

        try {
            // MiniJava.g:62:5: ( param ( ',' param )* )
            // MiniJava.g:62:7: param ( ',' param )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramList342);
            param23=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param23.getTree());

            // MiniJava.g:62:13: ( ',' param )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // MiniJava.g:62:14: ',' param
            	    {
            	    char_literal24=(Token)match(input,26,FOLLOW_26_in_paramList345); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal24_tree = 
            	    (Object)adaptor.create(char_literal24)
            	    ;
            	    adaptor.addChild(root_0, char_literal24_tree);
            	    }

            	    pushFollow(FOLLOW_param_in_paramList347);
            	    param25=param();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, param25.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramList"


    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // MiniJava.g:65:1: param : type ID -> ^( PARAM type ID ) ;
    public final MiniJavaParser.param_return param() throws RecognitionException {
        MiniJavaParser.param_return retval = new MiniJavaParser.param_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID27=null;
        MiniJavaParser.type_return type26 =null;


        Object ID27_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // MiniJava.g:66:5: ( type ID -> ^( PARAM type ID ) )
            // MiniJava.g:66:7: type ID
            {
            pushFollow(FOLLOW_type_in_param366);
            type26=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type26.getTree());

            ID27=(Token)match(input,ID,FOLLOW_ID_in_param368); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID27);


            // AST REWRITE
            // elements: ID, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 67:7: -> ^( PARAM type ID )
            {
                // MiniJava.g:67:10: ^( PARAM type ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAM, "PARAM")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // MiniJava.g:73:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final MiniJavaParser.block_return block() throws RecognitionException {
        MiniJavaParser.block_return retval = new MiniJavaParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal28=null;
        Token char_literal30=null;
        MiniJavaParser.statement_return statement29 =null;


        Object char_literal28_tree=null;
        Object char_literal30_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // MiniJava.g:74:5: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // MiniJava.g:74:7: '{' ( statement )* '}'
            {
            char_literal28=(Token)match(input,47,FOLLOW_47_in_block403); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal28);


            // MiniJava.g:74:11: ( statement )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID||LA8_0==38||(LA8_0 >= 41 && LA8_0 <= 43)||(LA8_0 >= 45 && LA8_0 <= 47)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // MiniJava.g:74:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block405);
            	    statement29=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement29.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            char_literal30=(Token)match(input,49,FOLLOW_49_in_block408); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal30);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 75:7: -> ^( BLOCK ( statement )* )
            {
                // MiniJava.g:75:10: ^( BLOCK ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // MiniJava.g:75:18: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // MiniJava.g:81:1: statement : ( block | varDecl | assignStmt | ifStmt | whileStmt | forStmt | returnStmt );
    public final MiniJavaParser.statement_return statement() throws RecognitionException {
        MiniJavaParser.statement_return retval = new MiniJavaParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.block_return block31 =null;

        MiniJavaParser.varDecl_return varDecl32 =null;

        MiniJavaParser.assignStmt_return assignStmt33 =null;

        MiniJavaParser.ifStmt_return ifStmt34 =null;

        MiniJavaParser.whileStmt_return whileStmt35 =null;

        MiniJavaParser.forStmt_return forStmt36 =null;

        MiniJavaParser.returnStmt_return returnStmt37 =null;



        try {
            // MiniJava.g:82:5: ( block | varDecl | assignStmt | ifStmt | whileStmt | forStmt | returnStmt )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt9=1;
                }
                break;
            case 38:
            case 43:
                {
                alt9=2;
                }
                break;
            case ID:
                {
                alt9=3;
                }
                break;
            case 42:
                {
                alt9=4;
                }
                break;
            case 46:
                {
                alt9=5;
                }
                break;
            case 41:
                {
                alt9=6;
                }
                break;
            case 45:
                {
                alt9=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // MiniJava.g:82:7: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statement442);
                    block31=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block31.getTree());

                    }
                    break;
                case 2 :
                    // MiniJava.g:83:7: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_statement450);
                    varDecl32=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl32.getTree());

                    }
                    break;
                case 3 :
                    // MiniJava.g:84:7: assignStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignStmt_in_statement458);
                    assignStmt33=assignStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignStmt33.getTree());

                    }
                    break;
                case 4 :
                    // MiniJava.g:85:7: ifStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ifStmt_in_statement466);
                    ifStmt34=ifStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStmt34.getTree());

                    }
                    break;
                case 5 :
                    // MiniJava.g:86:7: whileStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_whileStmt_in_statement474);
                    whileStmt35=whileStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStmt35.getTree());

                    }
                    break;
                case 6 :
                    // MiniJava.g:87:7: forStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_forStmt_in_statement482);
                    forStmt36=forStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStmt36.getTree());

                    }
                    break;
                case 7 :
                    // MiniJava.g:88:7: returnStmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_returnStmt_in_statement490);
                    returnStmt37=returnStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStmt37.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class assignStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignStmt"
    // MiniJava.g:94:1: assignStmt : ID ( '[' expr ']' )? '=' expr ';' -> ^( ASSIGN ID expr ) ;
    public final MiniJavaParser.assignStmt_return assignStmt() throws RecognitionException {
        MiniJavaParser.assignStmt_return retval = new MiniJavaParser.assignStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID38=null;
        Token char_literal39=null;
        Token char_literal41=null;
        Token char_literal42=null;
        Token char_literal44=null;
        MiniJavaParser.expr_return expr40 =null;

        MiniJavaParser.expr_return expr43 =null;


        Object ID38_tree=null;
        Object char_literal39_tree=null;
        Object char_literal41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // MiniJava.g:95:5: ( ID ( '[' expr ']' )? '=' expr ';' -> ^( ASSIGN ID expr ) )
            // MiniJava.g:95:7: ID ( '[' expr ']' )? '=' expr ';'
            {
            ID38=(Token)match(input,ID,FOLLOW_ID_in_assignStmt509); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID38);


            // MiniJava.g:95:10: ( '[' expr ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // MiniJava.g:95:11: '[' expr ']'
                    {
                    char_literal39=(Token)match(input,36,FOLLOW_36_in_assignStmt512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(char_literal39);


                    pushFollow(FOLLOW_expr_in_assignStmt514);
                    expr40=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr40.getTree());

                    char_literal41=(Token)match(input,37,FOLLOW_37_in_assignStmt516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(char_literal41);


                    }
                    break;

            }


            char_literal42=(Token)match(input,32,FOLLOW_32_in_assignStmt520); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_32.add(char_literal42);


            pushFollow(FOLLOW_expr_in_assignStmt522);
            expr43=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr43.getTree());

            char_literal44=(Token)match(input,29,FOLLOW_29_in_assignStmt524); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal44);


            // AST REWRITE
            // elements: ID, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 96:7: -> ^( ASSIGN ID expr )
            {
                // MiniJava.g:96:10: ^( ASSIGN ID expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ASSIGN, "ASSIGN")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignStmt"


    public static class ifStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStmt"
    // MiniJava.g:102:1: ifStmt : 'if' '(' condition ')' statement ( 'else' statement )? -> ^( IF condition statement ( statement )? ) ;
    public final MiniJavaParser.ifStmt_return ifStmt() throws RecognitionException {
        MiniJavaParser.ifStmt_return retval = new MiniJavaParser.ifStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal45=null;
        Token char_literal46=null;
        Token char_literal48=null;
        Token string_literal50=null;
        MiniJavaParser.condition_return condition47 =null;

        MiniJavaParser.statement_return statement49 =null;

        MiniJavaParser.statement_return statement51 =null;


        Object string_literal45_tree=null;
        Object char_literal46_tree=null;
        Object char_literal48_tree=null;
        Object string_literal50_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // MiniJava.g:103:5: ( 'if' '(' condition ')' statement ( 'else' statement )? -> ^( IF condition statement ( statement )? ) )
            // MiniJava.g:103:7: 'if' '(' condition ')' statement ( 'else' statement )?
            {
            string_literal45=(Token)match(input,42,FOLLOW_42_in_ifStmt559); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(string_literal45);


            char_literal46=(Token)match(input,22,FOLLOW_22_in_ifStmt561); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_22.add(char_literal46);


            pushFollow(FOLLOW_condition_in_ifStmt563);
            condition47=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition47.getTree());

            char_literal48=(Token)match(input,23,FOLLOW_23_in_ifStmt565); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_23.add(char_literal48);


            pushFollow(FOLLOW_statement_in_ifStmt567);
            statement49=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement49.getTree());

            // MiniJava.g:104:7: ( 'else' statement )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred16_MiniJava()) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // MiniJava.g:104:8: 'else' statement
                    {
                    string_literal50=(Token)match(input,40,FOLLOW_40_in_ifStmt576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(string_literal50);


                    pushFollow(FOLLOW_statement_in_ifStmt578);
                    statement51=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement51.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: condition, statement, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 105:7: -> ^( IF condition statement ( statement )? )
            {
                // MiniJava.g:105:10: ^( IF condition statement ( statement )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IF, "IF")
                , root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_1, stream_statement.nextTree());

                // MiniJava.g:105:35: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifStmt"


    public static class whileStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStmt"
    // MiniJava.g:111:1: whileStmt : 'while' '(' condition ')' statement -> ^( WHILE condition statement ) ;
    public final MiniJavaParser.whileStmt_return whileStmt() throws RecognitionException {
        MiniJavaParser.whileStmt_return retval = new MiniJavaParser.whileStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal52=null;
        Token char_literal53=null;
        Token char_literal55=null;
        MiniJavaParser.condition_return condition54 =null;

        MiniJavaParser.statement_return statement56 =null;


        Object string_literal52_tree=null;
        Object char_literal53_tree=null;
        Object char_literal55_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // MiniJava.g:112:5: ( 'while' '(' condition ')' statement -> ^( WHILE condition statement ) )
            // MiniJava.g:112:7: 'while' '(' condition ')' statement
            {
            string_literal52=(Token)match(input,46,FOLLOW_46_in_whileStmt618); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(string_literal52);


            char_literal53=(Token)match(input,22,FOLLOW_22_in_whileStmt620); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_22.add(char_literal53);


            pushFollow(FOLLOW_condition_in_whileStmt622);
            condition54=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition54.getTree());

            char_literal55=(Token)match(input,23,FOLLOW_23_in_whileStmt624); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_23.add(char_literal55);


            pushFollow(FOLLOW_statement_in_whileStmt626);
            statement56=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement56.getTree());

            // AST REWRITE
            // elements: condition, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 113:7: -> ^( WHILE condition statement )
            {
                // MiniJava.g:113:10: ^( WHILE condition statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WHILE, "WHILE")
                , root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileStmt"


    public static class forStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forStmt"
    // MiniJava.g:119:1: forStmt : 'for' '(' assignStmt condition ';' assignStmt ')' statement -> ^( FOR assignStmt condition assignStmt statement ) ;
    public final MiniJavaParser.forStmt_return forStmt() throws RecognitionException {
        MiniJavaParser.forStmt_return retval = new MiniJavaParser.forStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal57=null;
        Token char_literal58=null;
        Token char_literal61=null;
        Token char_literal63=null;
        MiniJavaParser.assignStmt_return assignStmt59 =null;

        MiniJavaParser.condition_return condition60 =null;

        MiniJavaParser.assignStmt_return assignStmt62 =null;

        MiniJavaParser.statement_return statement64 =null;


        Object string_literal57_tree=null;
        Object char_literal58_tree=null;
        Object char_literal61_tree=null;
        Object char_literal63_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_assignStmt=new RewriteRuleSubtreeStream(adaptor,"rule assignStmt");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // MiniJava.g:120:5: ( 'for' '(' assignStmt condition ';' assignStmt ')' statement -> ^( FOR assignStmt condition assignStmt statement ) )
            // MiniJava.g:120:7: 'for' '(' assignStmt condition ';' assignStmt ')' statement
            {
            string_literal57=(Token)match(input,41,FOLLOW_41_in_forStmt661); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(string_literal57);


            char_literal58=(Token)match(input,22,FOLLOW_22_in_forStmt663); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_22.add(char_literal58);


            pushFollow(FOLLOW_assignStmt_in_forStmt665);
            assignStmt59=assignStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignStmt.add(assignStmt59.getTree());

            pushFollow(FOLLOW_condition_in_forStmt667);
            condition60=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition60.getTree());

            char_literal61=(Token)match(input,29,FOLLOW_29_in_forStmt669); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal61);


            pushFollow(FOLLOW_assignStmt_in_forStmt671);
            assignStmt62=assignStmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assignStmt.add(assignStmt62.getTree());

            char_literal63=(Token)match(input,23,FOLLOW_23_in_forStmt673); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_23.add(char_literal63);


            pushFollow(FOLLOW_statement_in_forStmt675);
            statement64=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement64.getTree());

            // AST REWRITE
            // elements: assignStmt, assignStmt, condition, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 121:7: -> ^( FOR assignStmt condition assignStmt statement )
            {
                // MiniJava.g:121:10: ^( FOR assignStmt condition assignStmt statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FOR, "FOR")
                , root_1);

                adaptor.addChild(root_1, stream_assignStmt.nextTree());

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_1, stream_assignStmt.nextTree());

                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forStmt"


    public static class returnStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnStmt"
    // MiniJava.g:127:1: returnStmt : 'return' expr ';' -> ^( RETURN expr ) ;
    public final MiniJavaParser.returnStmt_return returnStmt() throws RecognitionException {
        MiniJavaParser.returnStmt_return retval = new MiniJavaParser.returnStmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal65=null;
        Token char_literal67=null;
        MiniJavaParser.expr_return expr66 =null;


        Object string_literal65_tree=null;
        Object char_literal67_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // MiniJava.g:128:5: ( 'return' expr ';' -> ^( RETURN expr ) )
            // MiniJava.g:128:7: 'return' expr ';'
            {
            string_literal65=(Token)match(input,45,FOLLOW_45_in_returnStmt714); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_45.add(string_literal65);


            pushFollow(FOLLOW_expr_in_returnStmt716);
            expr66=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr66.getTree());

            char_literal67=(Token)match(input,29,FOLLOW_29_in_returnStmt718); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_29.add(char_literal67);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 129:7: -> ^( RETURN expr )
            {
                // MiniJava.g:129:10: ^( RETURN expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RETURN, "RETURN")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "returnStmt"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // MiniJava.g:135:1: condition : expr relOp expr ( logicOp condition )? -> ^( CONDITION expr relOp expr ( logicOp )? ( condition )? ) ;
    public final MiniJavaParser.condition_return condition() throws RecognitionException {
        MiniJavaParser.condition_return retval = new MiniJavaParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.expr_return expr68 =null;

        MiniJavaParser.relOp_return relOp69 =null;

        MiniJavaParser.expr_return expr70 =null;

        MiniJavaParser.logicOp_return logicOp71 =null;

        MiniJavaParser.condition_return condition72 =null;


        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_logicOp=new RewriteRuleSubtreeStream(adaptor,"rule logicOp");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_relOp=new RewriteRuleSubtreeStream(adaptor,"rule relOp");
        try {
            // MiniJava.g:136:5: ( expr relOp expr ( logicOp condition )? -> ^( CONDITION expr relOp expr ( logicOp )? ( condition )? ) )
            // MiniJava.g:136:7: expr relOp expr ( logicOp condition )?
            {
            pushFollow(FOLLOW_expr_in_condition751);
            expr68=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr68.getTree());

            pushFollow(FOLLOW_relOp_in_condition753);
            relOp69=relOp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_relOp.add(relOp69.getTree());

            pushFollow(FOLLOW_expr_in_condition755);
            expr70=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr70.getTree());

            // MiniJava.g:136:23: ( logicOp condition )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21||LA12_0==48) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // MiniJava.g:136:24: logicOp condition
                    {
                    pushFollow(FOLLOW_logicOp_in_condition758);
                    logicOp71=logicOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logicOp.add(logicOp71.getTree());

                    pushFollow(FOLLOW_condition_in_condition760);
                    condition72=condition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition.add(condition72.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: expr, condition, logicOp, relOp, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 137:7: -> ^( CONDITION expr relOp expr ( logicOp )? ( condition )? )
            {
                // MiniJava.g:137:10: ^( CONDITION expr relOp expr ( logicOp )? ( condition )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CONDITION, "CONDITION")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_relOp.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                // MiniJava.g:137:38: ( logicOp )?
                if ( stream_logicOp.hasNext() ) {
                    adaptor.addChild(root_1, stream_logicOp.nextTree());

                }
                stream_logicOp.reset();

                // MiniJava.g:137:47: ( condition )?
                if ( stream_condition.hasNext() ) {
                    adaptor.addChild(root_1, stream_condition.nextTree());

                }
                stream_condition.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class relOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relOp"
    // MiniJava.g:140:1: relOp : ( '==' | '!=' | '<' | '>' | '<=' | '>=' );
    public final MiniJavaParser.relOp_return relOp() throws RecognitionException {
        MiniJavaParser.relOp_return retval = new MiniJavaParser.relOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set73=null;

        Object set73_tree=null;

        try {
            // MiniJava.g:141:5: ( '==' | '!=' | '<' | '>' | '<=' | '>=' )
            // MiniJava.g:
            {
            root_0 = (Object)adaptor.nil();


            set73=(Token)input.LT(1);

            if ( input.LA(1)==20||(input.LA(1) >= 30 && input.LA(1) <= 31)||(input.LA(1) >= 33 && input.LA(1) <= 35) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set73)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relOp"


    public static class logicOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicOp"
    // MiniJava.g:144:1: logicOp : ( '&&' | '||' );
    public final MiniJavaParser.logicOp_return logicOp() throws RecognitionException {
        MiniJavaParser.logicOp_return retval = new MiniJavaParser.logicOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set74=null;

        Object set74_tree=null;

        try {
            // MiniJava.g:145:5: ( '&&' | '||' )
            // MiniJava.g:
            {
            root_0 = (Object)adaptor.nil();


            set74=(Token)input.LT(1);

            if ( input.LA(1)==21||input.LA(1)==48 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set74)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logicOp"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // MiniJava.g:151:1: expr : term ( ( '+' | '-' ) term )* ;
    public final MiniJavaParser.expr_return expr() throws RecognitionException {
        MiniJavaParser.expr_return retval = new MiniJavaParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set76=null;
        MiniJavaParser.term_return term75 =null;

        MiniJavaParser.term_return term77 =null;


        Object set76_tree=null;

        try {
            // MiniJava.g:152:5: ( term ( ( '+' | '-' ) term )* )
            // MiniJava.g:152:7: term ( ( '+' | '-' ) term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_expr863);
            term75=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term75.getTree());

            // MiniJava.g:152:12: ( ( '+' | '-' ) term )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // MiniJava.g:152:13: ( '+' | '-' ) term
            	    {
            	    set76=(Token)input.LT(1);

            	    if ( input.LA(1)==25||input.LA(1)==27 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set76)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_expr874);
            	    term77=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term77.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // MiniJava.g:155:1: term : factor ( ( '*' | '/' ) factor )* ;
    public final MiniJavaParser.term_return term() throws RecognitionException {
        MiniJavaParser.term_return retval = new MiniJavaParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set79=null;
        MiniJavaParser.factor_return factor78 =null;

        MiniJavaParser.factor_return factor80 =null;


        Object set79_tree=null;

        try {
            // MiniJava.g:156:5: ( factor ( ( '*' | '/' ) factor )* )
            // MiniJava.g:156:7: factor ( ( '*' | '/' ) factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term893);
            factor78=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor78.getTree());

            // MiniJava.g:156:14: ( ( '*' | '/' ) factor )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24||LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // MiniJava.g:156:15: ( '*' | '/' ) factor
            	    {
            	    set79=(Token)input.LT(1);

            	    if ( input.LA(1)==24||input.LA(1)==28 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set79)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term904);
            	    factor80=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor80.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // MiniJava.g:162:1: factor : ( INT | ID ( '[' expr ']' )? | '(' expr ')' );
    public final MiniJavaParser.factor_return factor() throws RecognitionException {
        MiniJavaParser.factor_return retval = new MiniJavaParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INT81=null;
        Token ID82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal86=null;
        Token char_literal88=null;
        MiniJavaParser.expr_return expr84 =null;

        MiniJavaParser.expr_return expr87 =null;


        Object INT81_tree=null;
        Object ID82_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;
        Object char_literal86_tree=null;
        Object char_literal88_tree=null;

        try {
            // MiniJava.g:163:5: ( INT | ID ( '[' expr ']' )? | '(' expr ')' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt16=1;
                }
                break;
            case ID:
                {
                alt16=2;
                }
                break;
            case 22:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // MiniJava.g:163:7: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT81=(Token)match(input,INT,FOLLOW_INT_in_factor925); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT81_tree = 
                    (Object)adaptor.create(INT81)
                    ;
                    adaptor.addChild(root_0, INT81_tree);
                    }

                    }
                    break;
                case 2 :
                    // MiniJava.g:164:7: ID ( '[' expr ']' )?
                    {
                    root_0 = (Object)adaptor.nil();


                    ID82=(Token)match(input,ID,FOLLOW_ID_in_factor933); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID82_tree = 
                    (Object)adaptor.create(ID82)
                    ;
                    adaptor.addChild(root_0, ID82_tree);
                    }

                    // MiniJava.g:164:10: ( '[' expr ']' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==36) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // MiniJava.g:164:11: '[' expr ']'
                            {
                            char_literal83=(Token)match(input,36,FOLLOW_36_in_factor936); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal83_tree = 
                            (Object)adaptor.create(char_literal83)
                            ;
                            adaptor.addChild(root_0, char_literal83_tree);
                            }

                            pushFollow(FOLLOW_expr_in_factor938);
                            expr84=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr84.getTree());

                            char_literal85=(Token)match(input,37,FOLLOW_37_in_factor940); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal85_tree = 
                            (Object)adaptor.create(char_literal85)
                            ;
                            adaptor.addChild(root_0, char_literal85_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // MiniJava.g:165:7: '(' expr ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal86=(Token)match(input,22,FOLLOW_22_in_factor950); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal86_tree = 
                    (Object)adaptor.create(char_literal86)
                    ;
                    adaptor.addChild(root_0, char_literal86_tree);
                    }

                    pushFollow(FOLLOW_expr_in_factor952);
                    expr87=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr87.getTree());

                    char_literal88=(Token)match(input,23,FOLLOW_23_in_factor954); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal88_tree = 
                    (Object)adaptor.create(char_literal88)
                    ;
                    adaptor.addChild(root_0, char_literal88_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // MiniJava.g:171:1: type : ( 'int' | 'boolean' );
    public final MiniJavaParser.type_return type() throws RecognitionException {
        MiniJavaParser.type_return retval = new MiniJavaParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set89=null;

        Object set89_tree=null;

        try {
            // MiniJava.g:172:5: ( 'int' | 'boolean' )
            // MiniJava.g:
            {
            root_0 = (Object)adaptor.nil();


            set89=(Token)input.LT(1);

            if ( input.LA(1)==38||input.LA(1)==43 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set89)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"

    // $ANTLR start synpred16_MiniJava
    public final void synpred16_MiniJava_fragment() throws RecognitionException {
        // MiniJava.g:104:8: ( 'else' statement )
        // MiniJava.g:104:8: 'else' statement
        {
        match(input,40,FOLLOW_40_in_synpred16_MiniJava576); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred16_MiniJava578);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_MiniJava

    // Delegated rules

    public final boolean synpred16_MiniJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_MiniJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_classDecl_in_program135 = new BitSet(new long[]{0x0000108000000000L});
    public static final BitSet FOLLOW_EOF_in_program138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_classDecl172 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_classDecl175 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_classDecl177 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_classDecl179 = new BitSet(new long[]{0x0002184000000000L});
    public static final BitSet FOLLOW_member_in_classDecl181 = new BitSet(new long[]{0x0002184000000000L});
    public static final BitSet FOLLOW_49_in_classDecl184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_member218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDecl_in_member226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_varDecl245 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_varDecl247 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_36_in_varDecl250 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_varDecl252 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_varDecl256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_methodDecl291 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_type_in_methodDecl293 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_methodDecl295 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_methodDecl297 = new BitSet(new long[]{0x0000084000800000L});
    public static final BitSet FOLLOW_paramList_in_methodDecl299 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_methodDecl302 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_block_in_methodDecl304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramList342 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_paramList345 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_param_in_paramList347 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_type_in_param366 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_param368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_block403 = new BitSet(new long[]{0x0002EE4000000400L});
    public static final BitSet FOLLOW_statement_in_block405 = new BitSet(new long[]{0x0002EE4000000400L});
    public static final BitSet FOLLOW_49_in_block408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStmt_in_statement458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStmt_in_statement466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStmt_in_statement474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStmt_in_statement482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStmt_in_statement490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignStmt509 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_36_in_assignStmt512 = new BitSet(new long[]{0x0000000000401400L});
    public static final BitSet FOLLOW_expr_in_assignStmt514 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_assignStmt516 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_assignStmt520 = new BitSet(new long[]{0x0000000000401400L});
    public static final BitSet FOLLOW_expr_in_assignStmt522 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_assignStmt524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ifStmt559 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ifStmt561 = new BitSet(new long[]{0x0000000000401400L});
    public static final BitSet FOLLOW_condition_in_ifStmt563 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ifStmt565 = new BitSet(new long[]{0x0000EE4000000400L});
    public static final BitSet FOLLOW_statement_in_ifStmt567 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ifStmt576 = new BitSet(new long[]{0x0000EE4000000400L});
    public static final BitSet FOLLOW_statement_in_ifStmt578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_whileStmt618 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_whileStmt620 = new BitSet(new long[]{0x0000000000401400L});
    public static final BitSet FOLLOW_condition_in_whileStmt622 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_whileStmt624 = new BitSet(new long[]{0x0000EE4000000400L});
    public static final BitSet FOLLOW_statement_in_whileStmt626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_forStmt661 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_forStmt663 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_assignStmt_in_forStmt665 = new BitSet(new long[]{0x0000000000401400L});
    public static final BitSet FOLLOW_condition_in_forStmt667 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_forStmt669 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_assignStmt_in_forStmt671 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_forStmt673 = new BitSet(new long[]{0x0000EE4000000400L});
    public static final BitSet FOLLOW_statement_in_forStmt675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_returnStmt714 = new BitSet(new long[]{0x0000000000401400L});
    public static final BitSet FOLLOW_expr_in_returnStmt716 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_returnStmt718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_condition751 = new BitSet(new long[]{0x0000000EC0100000L});
    public static final BitSet FOLLOW_relOp_in_condition753 = new BitSet(new long[]{0x0000000000401400L});
    public static final BitSet FOLLOW_expr_in_condition755 = new BitSet(new long[]{0x0001000000200002L});
    public static final BitSet FOLLOW_logicOp_in_condition758 = new BitSet(new long[]{0x0000000000401400L});
    public static final BitSet FOLLOW_condition_in_condition760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr863 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_set_in_expr866 = new BitSet(new long[]{0x0000000000401400L});
    public static final BitSet FOLLOW_term_in_expr874 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_factor_in_term893 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_set_in_term896 = new BitSet(new long[]{0x0000000000401400L});
    public static final BitSet FOLLOW_factor_in_term904 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_INT_in_factor925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor933 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_factor936 = new BitSet(new long[]{0x0000000000401400L});
    public static final BitSet FOLLOW_expr_in_factor938 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_factor940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_factor950 = new BitSet(new long[]{0x0000000000401400L});
    public static final BitSet FOLLOW_expr_in_factor952 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_factor954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred16_MiniJava576 = new BitSet(new long[]{0x0000EE4000000400L});
    public static final BitSet FOLLOW_statement_in_synpred16_MiniJava578 = new BitSet(new long[]{0x0000000000000002L});

}