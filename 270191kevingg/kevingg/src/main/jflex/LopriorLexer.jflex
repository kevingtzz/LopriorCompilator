package co.edu.eafit.dis.st0270.s20191.kevingg.flex;

import java_cup.runtime.*;
import co.edu.eafit.dis.st0270.s20191.kevingg.parser.LopriorSymbol;
import co.edu.eafit.dis.st0270.s20191.kevingg.parser.LopriorParser;

%%

%class LopriorLexer
%public
%cup
%line
%unicode
%column

InCharacter = [^\r\n]
LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\n]
Comment = "#" {InCharacter}* {LineTerminator}


%%

[a-e]([a-z]|[1-9])*                 { return new Symbol(LopriorSymbol.NAME, yytext()); }
[x-z]([a-z]|[1-9])*                 { return new Symbol(LopriorSymbol.VARIABLE, yytext()); }
"f("[[a-z]|[0-9]]*")"               { return new Symbol(LopriorSymbol.FUNCTOR, yytext()); }
[A-Z]([A-Z]|[1-9])*                 { return new Symbol(LopriorSymbol.PREDICATE, yytext()); }
"$"                                 { return new Symbol(LopriorSymbol.FORALL, yytext()); }
"&"                                 { return new Symbol(LopriorSymbol.EXISTENTIAL, yytext()); }
"!"                                 { return new Symbol(LopriorSymbol.NEGATION, yytext()); }
">"                                 { return new Symbol(LopriorSymbol.CONDITIONAL, yytext()); }
"<>"                                { return new Symbol(LopriorSymbol.BICONDITIONAL, yytext()); }
"*"                                 { return new Symbol(LopriorSymbol.AND, yytext()); }
"+"                                 { return new Symbol(LopriorSymbol.OR, yytext()); }
"("                                 { return new Symbol(LopriorSymbol.LPAREN, yytext()); }
")"                                 { return new Symbol(LopriorSymbol.RPAREN, yytext()); }                               
{WhiteSpace}                        {}
{Comment}                           {}
.                                   { return new Symbol(LopriorSymbol.error); }
<<EOF>>                             { return new Symbol(LopriorSymbol.EOF); }