package co.edu.eafit.dis.st0270.s20191.kevingg.flex;

import co.edu.eafit.dis.st0270.s20191.kevingg.parser.LopriorSymbol;
import java_cup.runtime.Symbol;

%%
%class LopriorLexer
%unicode
%line
%column
%public
%cup

start = f
rest = [abc]*
%%

{start}{rest}   { System.out.println("Lexer: " + yytext());
                    return new Symbol(LopriorSymbol.FUNCTOR, yytext()); }
.               { return new Symbol(LopriorSymbol.error); }
<<EOF>>         { return new Symbol(LopriorSymbol.EOF); }