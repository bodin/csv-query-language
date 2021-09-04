
grammar CSVQueryLang;

@header {
package com.bodins.antlr;
}

/* PARSER */
root:   OPEN FILE SELECT cols ;
cols:   STAR | col (',' col)* ;
col:    COL COL_DIGIT ;


/* LEXER */

//Constants with higher precedence
OPEN : 'open' ;
SELECT : 'select' ;
COL : 'col' ;
STAR : '*' ;

FILE: ID ('.' ID)? ;
COL_DIGIT: [1-9]([0-9]*) ;


ID: [A-Za-z]+ ;

WS
   : [ \r\n\t] + -> skip
   ;

