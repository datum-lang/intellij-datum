package com.phodal.charj.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.phodal.charj.lexer.CharjTypes.*;

%%

%{
  public _CharjLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _CharjLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

COMMENT="//"[^\r\n]*
BLOCK_COMMENT=[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
IDENTIFIER=[_a-zA-Z][_a-zA-Z0-9]*
STRING_LITERAL=\"([^\\\"\r\n]|\\[^\r\n])*\"?

%%
<YYINITIAL> {
  {WHITE_SPACE}         { return WHITE_SPACE; }

  "struct"              { return STRUCT_KEYWORD; }
  "pkg"                 { return PKG_KEYWORD; }
  "package"             { return PACKAGE_KEYWORD; }
  "import"              { return IMPORT_KEYWORD; }
  "as"                  { return AS_KEYWORD; }
  "if"                  { return IF_KEYWORD; }
  "else"                { return ELSE_KEYWORD; }
  "fun"                 { return FUN_KEYWORD; }
  "while"               { return WHILE_KEYWORD; }
  "for"                 { return FOR_KEYWORD; }
  "break"               { return BREAK_KEYWORD; }
  "continue"            { return CONTINUE_KEYWORD; }
  "return"              { return RETURN_KEYWORD; }
  "int"                 { return INT_KEYWORD; }
  "float"               { return FLOAT_KEYWORD; }
  "string"              { return STRING_KEYWORD; }
  "bool"                { return BOOL_KEYWORD; }
  "bytes"               { return BYTES_KEYWORD; }
  "in"                  { return IN_KEYWORD; }
  "out"                 { return OUT_KEYWORD; }
  "member"              { return MEMBER_KEYWORD; }
  "instance"            { return INSTANCE_KEYWORD; }
  "match"               { return MATCH_KEYWORD; }
  "elif"                { return ELIF_KEYWORD; }
  "then"                { return THEN_KEYWORD; }
  "end"                 { return END_KEYWORD; }
  ":"                   { return COLON; }
  "::"                  { return DOUBLE_COLON; }
  ";"                   { return SEMICOLON; }
  "/"                   { return SLASH; }
  "{"                   { return OPEN_BRACE; }
  "}"                   { return CLOSE_BRACE; }
  ","                   { return COMMA; }
  "="                   { return EQUAL; }
  "$"                   { return DOLLAR; }
  "'"                   { return QUOTA; }
  "("                   { return LPAREN; }
  ")"                   { return RPAREN; }
  "DEF_KEYWORD"         { return DEF_KEYWORD; }
  "IN"                  { return IN; }
  "SUB"                 { return SUB; }
  "GT"                  { return GT; }

  {COMMENT}             { return COMMENT; }
  {BLOCK_COMMENT}       { return BLOCK_COMMENT; }
  {IDENTIFIER}          { return IDENTIFIER; }
  {STRING_LITERAL}      { return STRING_LITERAL; }

}

[^] { return BAD_CHARACTER; }
