
grammar CSVQueryLang;

@header {
package com.bodins.antlr;
}

/* PARSER */
root:
    with_clause select_clause out_clause ';'
    ;

with_clause:
    WITH FILE FILE_NAME # WithFile
    ;

select_clause:
    SELECT cols ;

out_clause:
    WRITE FILE FILE_NAME # WriteFile
    |                    # Print
    ;


cols:
    STAR
    | col (',' col)*
    ;

col:
    COL COL_DIGIT
    ;


/* LEXER */

//Constants with higher precedence
WITH    : 'with' ;
WRITE   : 'write' ;
FILE    : 'file' ;
SELECT  : 'select' ;
COL     : 'col' ;
STAR    : '*' ;

FILE_NAME: ID ('.' ID)? ;
COL_DIGIT: [1-9]([0-9]*) ;

ID: [A-Za-z]+ ;

WS: [ \r\n\t] + -> skip ;

