package Analizadores;
import java_cup.runtime.Symbol;
import java_cup.runtime.*;

%%

%class Lexer
%public 
%line 
%char 
%cup 
%unicode
%ignorecase

%init{ 
    yyline = 1; 
    yychar = 1; 
%init} 

//TOKENS

BLANCOS=[ \r\t]+
ENTERO=[0-9]+
DECIMAL=[0-9]+("."[  |0-9]+)?
ID=[a-zA-Z_][a-zA-Z0-9_]*
CARACTER=\'([^\'\\]|\\[btnfr\"\'\\])*\' 
CADENA=\"([^\"\\]|\\[btnfr\"\'\\])*\" 
%%

//RESERVADAS
"int" { return new Symbol(sym.INT, yyline, yychar, yytext()); }
"double" { return new Symbol(sym.DOUBLE, yyline, yychar, yytext()); }
"bool" { return new Symbol(sym.BOOL, yyline, yychar, yytext()); }
"char" { return new Symbol(sym.CHAR, yyline, yychar, yytext()); }
"string" { return new Symbol(sym.STRING, yyline, yychar, yytext()); }
"true" { return new Symbol(sym.TRUE, yyline, yychar, yytext()); }
"false" { return new Symbol(sym.FALSE, yyline, yychar, yytext()); }

//OPERADORES
"+" { return new Symbol(sym.SUMA, yyline, yychar, yytext()); }
"-" { return new Symbol(sym.RESTA, yyline, yychar, yytext()); }
"*" { return new Symbol(sym.MULTIPLICACION, yyline, yychar, yytext()); }
"/" { return new Symbol(sym.DIVISION, yyline, yychar, yytext()); }
"=" { return new Symbol(sym.ASIGNACION, yyline, yychar, yytext()); }
"==" { return new Symbol(sym.IGUALDAD, yyline, yychar, yytext()); }
"!=" { return new Symbol(sym.DIFERENTE, yyline, yychar, yytext()); }
"<" { return new Symbol(sym.MENOR, yyline, yychar, yytext()); }
">" { return new Symbol(sym.MAYOR, yyline, yychar, yytext()); }
"<=" { return new Symbol(sym.MENOR_IGUAL, yyline, yychar, yytext()); }
">=" { return new Symbol(sym.MAYOR_IGUAL, yyline, yychar, yytext()); }


//DELIMITADORES
"(" {return new Symbol(sym.PARL,yyline,yychar, yytext());}
")" {return new Symbol(sym.PARD,yyline,yychar, yytext());} 
"{" {return new Symbol(sym.LLAVL,yyline,yychar, yytext());} 
"}" {return new Symbol(sym.LLAVD,yyline,yychar, yytext());} 
"[" {return new Symbol(sym.CORL,yyline,yychar, yytext());} 
"]" {return new Symbol(sym.CORD,yyline,yychar, yytext());} 
";" {return new Symbol(sym.PTCOMA,yyline,yychar, yytext());} 
"," {return new Symbol(sym.COMA,yyline,yychar, yytext());} 

//COMENTARIOS
"//".* { /* Ignorar comentarios de una línea */ }
"/*"([^*]|[\r\n]|"*"[^/])*"*/" { /* Ignorar comentarios multilínea */ }

\n { yyline++; yychar = 1; }

{BLANCOS} {} 
{ENTERO} {return new Symbol(sym.ENTERO,yyline,yychar, yytext());} 
{DECIMAL} {return new Symbol(sym.DECIMAL,yyline,yychar, yytext());}
{ID} {return new Symbol(sym.ID,yyline,yychar, yytext());} 
{CARACTER} {return new Symbol(sym.CARACTER,yyline,yychar, yytext());} 
{CADENA} {return new Symbol(sym.CADENA,yyline,yychar, yytext());}  

// ERRORES
. {
    System.out.println("Error léxico: " + yytext() + ", línea: " + yyline + ", columna: " + yychar);
}