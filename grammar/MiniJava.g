grammar MiniJava;

options {
    output=AST;
    backtrack=true;
}

tokens {
    PROGRAM;
    CLASS;
    METHOD;
    VAR;
    PARAM;
    BLOCK;
    ASSIGN;
    IF;
    WHILE;
    FOR;
    RETURN;
    CONDITION;
    ARRAY;
}

/* =========================
        ENTRY POINT
========================= */
program
    : classDecl+ EOF
      -> ^(PROGRAM classDecl+)
    ;

/* =========================
        CLASS
========================= */
classDecl
    : 'public'? 'class' ID '{' member* '}'
      -> ^(CLASS ID member*)
    ;

member
    : varDecl
    | methodDecl
    ;

/* =========================
        VARIABLES
========================= */
varDecl
    : type ID ('[' ']')? ';'
      -> ^(VAR type ID)
    ;

/* =========================
        METHODS
========================= */
methodDecl
    : 'public' type ID '(' paramList? ')' block
      -> ^(METHOD ID type paramList? block)
    ;

paramList
    : param (',' param)*
    ;

param
    : type ID
      -> ^(PARAM type ID)
    ;

/* =========================
        BLOCK
========================= */
block
    : '{' statement* '}'
      -> ^(BLOCK statement*)
    ;

/* =========================
        STATEMENTS
========================= */
statement
    : block
    | varDecl
    | assignStmt
    | ifStmt
    | whileStmt
    | forStmt
    | returnStmt
    ;

/* =========================
        ASSIGNMENT
========================= */
assignStmt
    : ID ('[' expr ']')? '=' expr ';'
      -> ^(ASSIGN ID expr)
    ;

/* =========================
        IF / ELSE (FIXED)
========================= */
ifStmt
    : 'if' '(' condition ')' statement
      ('else' statement)?
      -> ^(IF condition statement statement?)
    ;

/* =========================
        WHILE
========================= */
whileStmt
    : 'while' '(' condition ')' statement
      -> ^(WHILE condition statement)
    ;

/* =========================
        FOR
========================= */
forStmt
    : 'for' '(' assignStmt condition ';' assignStmt ')' statement
      -> ^(FOR assignStmt condition assignStmt statement)
    ;

/* =========================
        RETURN
========================= */
returnStmt
    : 'return' expr ';'
      -> ^(RETURN expr)
    ;

/* =========================
        CONDITION
========================= */
condition
    : expr relOp expr (logicOp condition)?
      -> ^(CONDITION expr relOp expr logicOp? condition?)
    ;

relOp
    : '==' | '!=' | '<' | '>' | '<=' | '>='
    ;

logicOp
    : '&&' | '||'
    ;

/* =========================
        EXPRESSIONS
========================= */
expr
    : term (('+' | '-') term)*
    ;

term
    : factor (('*' | '/') factor)*
    ;

/* =========================
        FACTOR
========================= */
factor
    : INT
    | ID ('[' expr ']')?
    | '(' expr ')'
    ;

/* =========================
        TYPES
========================= */
type
    : 'int'
    | 'boolean'
    ;

/* =========================
        LEXER RULES
========================= */
ID  : ('a'..'z' | 'A'..'Z')+ ;
INT : ('0'..'9')+ ;

WS  : (' ' | '\t' | '\n' | '\r')+ {skip();} ;