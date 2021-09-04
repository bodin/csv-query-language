
grammar CSVQueryLang;

@header {
package com.bodins.antlr;
}

/* PARSER */
root:
    with_clause filter_clause select_clause out_clause ';'
    ;

with_clause:
    WITH FILE FILE_NAME # WithFile
    ;

select_clause:
    SELECT cols         # SelectSome
    |                   # SelectAll
    ;

filter_clause:
    FILTER expr         # FilterSome
    |                   # FilterNone
    ;

expr:
     LPAREN expr RPAREN                   # ExprNested
    | NOT expr                    # ExprNot
    | expr AND expr               # ExprAnd
    | expr OR expr                # ExprOr
    | col EQUALS STRING_CONST       # ExprEquals
    | col CONTAINS STRING_CONST     # ExprContains
    ;

out_clause:
    WRITE FILE FILE_NAME # WriteFile
    |                    # Print
    ;

cols: col (COMMA col)*
    ;

col:
    COL COL_DIGIT
    ;


/* LEXER */

//Constants with higher precedence
WITH:       'with' ;
WRITE:      'write' ;
FILE:       'file' ;
SELECT:     'select' ;
FILTER:     'filter' ;
COL:        'col' ;
EQUALS:     '=' ;
COMMA:      ',' ;
CONTAINS:   'contains' ;
LPAREN:     '(' ;
RPAREN:     ')' ;
AND:        'and' ;
OR:         'or' ;
NOT:        'not' ;

ID: [A-Za-z]+ ;
FILE_NAME: ID ('.' ID)? ;
COL_DIGIT: [1-9]([0-9]*) ;
STRING_CONST: ['][A-Za-z0-9]*['];

WS: [ \r\n\t] + -> skip ;

