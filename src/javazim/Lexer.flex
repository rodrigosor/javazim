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
ID = {LETRA}({LETRA}|{DIGITO}|{SUBLINHADO})*
CONST_INTEIRA = {DIGITO}+
CONST_REAL = {CONST_INTEIRA}"."{CONST_INTEIRA}
CONST_STRING = \"([^\\\"]|\\.)*\"
TIPO_PRIMITIVO = "boolean" | "int" | "String" | "float" | "void"
TIPO = {TIPO_PRIMITIVO}"[""]"|{TIPO_PRIMITIVO}
PARAM = {TIPO}{ESPACO}+{ID}
LISTA_PARAM = {PARAM}([, ]*{PARAM})*|{PARAM}
DECLARACAO_VAR = {PARAM}({ESPACO}*";")
OP = "||" | "&&" | "<" | "<=" | ">" | ">=" | "==" | "!=" | "/" | "*" | "-" | "+"
OP_UNARIO = "-" | "!"
PALAVRA_RESERVADA = "public" | "class" | "return" | "static" | "void" | "main" | "if" | "else" | "while" | "print" | "println" | "true" | "false" | "new"
DELIMITADOR = ";"
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
{TIPO}                                                                          {lexema=yytext(); return Tipo;}
{LISTA_PARAM}                                                                   {lexema=yytext(); return ListaParam;}
{DECLARACAO_VAR}                                                                {lexema=yytext(); return DeclaracaoVar;}
{DELIMITADOR}                                                                   {lexema=yytext(); return Delimitador;}
{SIMBOLO_AGRUPADOR}                                                             {lexema=yytext(); return SimboloAgrupador;}
{PALAVRA_RESERVADA}                                                             {lexema=yytext(); return PalavraReservada;}
{ID}                                                                            {lexema=yytext(); return ID;}
.                                                                               {lexema=yytext(); return NaoReconhecido;}
