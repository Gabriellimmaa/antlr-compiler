    grammar Lang;

    prog: functions line+             # progLine
        ;

    functions: function functions
            |// empty
            ;
    
    function: FUNCTION VAR '('params')' fnBlock;

    
    fnBlock:
        '{' fnBody '}'                # fnBlockLine
        ;

    fnBody:
        line                      # fnBodyLine
        | line fnBody               # fnBodyLineMore
        | RETURN expr EOL           # fnReturnExprLine
        | RETURN EOL                # fnReturnLine
        ;

    params: 
            VAR
        | VAR SEP params
        | // empty
        ;

    line:
        stmt EOL          # lineStmt
        | ifst              # lineIf
        | whilest         # lineWhile
        | forst           # lineFor
        | ternary EOL     # lineTernary
        | EOL              # lineEOL
        | COMMENT_LINE           # lineComment
        | COMMENT_BLOCK           # blockComment
        ;

    funcInvoc:
        VAR '(' params ')' # funcInvocLine
        ;

    stmt: 
        atrib             # stmtAtrib
        | input             # stmtInput
        | output            # stmtOutput    
        | funcInvoc        # lineFuncInvoc
        ;

    input: 
        READ VAR TYPE=(INT|DOUBLE|STRING|BOOLEAN)            # inputRead
        ;    
    
    output: 
        WRITE VAR           # outputWriteVar
        | WRITE 'f'STR      # outputWriteFStr
        | WRITE STR         # outputWriteStr
        | WRITE expr        # outputWriteExpr
        ;

    ifst:
        IF '(' cond ')' block                  # ifstIf
        | IF '(' cond ')' b1=block ELSE b2=block # ifstIfElse
        ;

    ternary:
        cond '?' e1=STR ':' e2=STR # ternaryCond
        ;

    whilest:
        WHILE '(' cond ')' block #whilestWhile
    ;

    forst:
        FOR '(' VAR EOL cond EOL atrib ')' block #forstFor
    ;

    block:
        '{' line+ '}'                # blockLine
        ;

    cond: 
        expr                        # condExpr
        | e1=expr RELOP=(EQ|NE|LT|GT|LE|GE) e2=expr       # condRelop
        | c1=cond AND c2=cond         # condAnd
        | c1=cond OR c2=cond          # condOr
        | NOT cond                    # condNot
        ;

    atrib: 
        STRING VAR AT STR                # atribString
        // | DOUBLE VAR AT DECIM               # atribDecim	
        | TYPE=(INT|DOUBLE|BOOLEAN) VAR AT expr         # atribVar
        | VAR ATRIB_PLUS expr             # atribPlus
        | VAR ATRIB_MINUS expr             # atribMinus
        ;

    expr: 
        term PLUS expr         # exprPlus
        | term MINUS expr         # exprMinus
        | term '?' expr ':' expr  # condTernary  
        | term                  # exprTerm
        ;

    term: 
        factor MULT term       # termMult
        | factor DIV term       # termDiv
        | factor                # termFactor
        ;           

    factor: 
        '(' expr ')'           # factorExpr
        | VAR                   # factorVar
        | DECIM                 # factorDecim
        | NUM                   # factorNum
        | BOOL_TRUE             # factorBoolTrue
        | BOOL_FALSE            # factorBoolFalse
    //    | STR                   # factorStr
        ;

    // Lexical rules

    OE: '(';
    CE: ')';
    OB: '{';
    CB: '}';
    AT: '=';
    SEP: ',';
    PLUS: '+';
    ATRIB_PLUS: '+=';
    ATRIB_MINUS: '-=';
    MINUS: '-';
    MULT: '*';
    DIV: '/';
    AND: '&&';
    OR: '||';
    NOT: '!';
    EQ : '==';
    LT : '<';
    GT : '>';
    LE : '<=';
    GE : '>=';
    NE : '!=';
    BOOL_TRUE: 'true';
    BOOL_FALSE: 'false';
    IF: [iI][fF];
    WHILE:[wW][hH][iI][lL][eE];
    FOR:[fF][oO][rR];
    FUNCTION: [fF][uU][nN][cC][tT][iI][oO][nN];
    RETURN: [rR][eE][tT][uU][rR][nN];
    THEN: [tT][hH][eE][nN];
    ELSE: [eE][lL][sS][eE];
    WRITE: [wW][rR][iI][tT][eE];
    READ: [rR][eE][aA][dD];
    INT:[iI][nN][tT];
    DOUBLE:[dD][oO][uU][bB][lL][eE];
    STRING:[sS][tT][rR][iI][nN][gG];
    BOOLEAN:[bB][oO][oO][lL][eE][aA][nN];
    STR: '"' ~["]* '"';
    EOL: ';';
    NUM: '-'? [0-9]+;
    DECIM: '-'? [0-9]+ ('.' [0-9]+)? | '-'? '.' [0-9]+;
    VAR: [a-zA-Z_][a-zA-Z0-9_]*;
    COMMENT_LINE: '//' ~[\r\n]* -> skip;
    COMMENT_BLOCK: '/*' .*? '*/' -> skip;
    WS: [ \t\n\r]+ -> skip;