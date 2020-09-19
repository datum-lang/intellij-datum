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

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "import"             { return IMPORT_KEYWORD; }
  "pkg"                { return PACKAGE_KEYWORD; }
  "body"               { return BODY_KEYWORD; }

  {COMMENT}            { return COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }
  {IDENTIFIER}         { return IDENTIFIER; }

}

[^] { return BAD_CHARACTER; }
