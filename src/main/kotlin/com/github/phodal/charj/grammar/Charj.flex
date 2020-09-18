package com.github.phodal.charj.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;

%%

%{

%}

%class CharLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

COMMENT="//"[^\r\n]*
BLOCK_COMMENT=[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*

IDVALUE=(0|[1-9][0-9]*)
IDENTIFIER=[_a-zA-Z][_a-zA-Z0-9]*

%%

[^]                                                         { return TokenType.BAD_CHARACTER; }
