package javazim;

import static javazim.Token.*;

%%
%class Lexer
%type Token

ESPACO =[ ]
BRANCO = [ESPACO\t\r]
NOVA_LINHA = [\n]
LETRA = [a-zA-Z]
DIGITO = [0-9]
SUBLINHADO = [_]
DELIMITADOR = ";"
ID = {LETRA}({LETRA}|{DIGITO}|{SUBLINHADO})*
CONST_INTEIRA = {DIGITO}+
CONST_REAL = {CONST_INTEIRA}"."{CONST_INTEIRA}
CONST_STRING = \"([^\\\"]|\\.)*\"
TIPO_PRIMITIVO = "boolean" | "int" | "String" | "float" | "void"
TIPO = {TIPO_PRIMITIVO}"[""]"|{TIPO_PRIMITIVO}
OP = "||" | "&&" | "<" | "<=" | ">" | ">=" | "==" | "!=" | "/" | "*" | "-" | "+"
OP_UNARIO = "-" | "!"
ATRIBUICAO = "="
PALAVRA_RESERVADA = "public" | "class" | "return" | "static" | "main" | "if" | "else" | "while" | "print" | "println" | "true" | "false" | "new"
SIMBOLO_AGRUPADOR = "(" | ")" | "[" | "]" | "{" | "}"

%{
public String lexema;
%}

%%
{BRANCO}                                                                        {/* ignora espaço em branco, tabulação e quebra de linha*/}
{ESPACO}                                                                        {/* ignora espaço em branco, tabulação e quebra de linha*/}
{NOVA_LINHA}                                                                    {lexema=yytext(); return NovaLinha;}
{CONST_INTEIRA}                                                                 {lexema=yytext(); return ConstInteira;}
{CONST_REAL}                                                                    {lexema=yytext(); return ConstReal;}
{CONST_STRING}                                                                  {lexema=yytext(); return ConstString;}
{OP}                                                                            {lexema=yytext(); return Op;}
{OP_UNARIO}                                                                     {lexema=yytext(); return OpUnario;}
{ATRIBUICAO}                                                                    {lexema=yytext(); return Atribuicao;}
{TIPO}                                                                          {lexema=yytext(); return Tipo;}
{DELIMITADOR}                                                                   {lexema=yytext(); return Delimitador;}
{SIMBOLO_AGRUPADOR}                                                             {lexema=yytext(); return SimboloAgrupador;}
{PALAVRA_RESERVADA}                                                             {lexema=yytext(); return PalavraReservada;}
{ID}                                                                            {lexema=yytext(); return ID;}
.                                                                               {lexema=yytext(); return NaoReconhecido;}
