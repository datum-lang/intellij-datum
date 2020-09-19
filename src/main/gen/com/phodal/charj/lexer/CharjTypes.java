// This is a generated file. Not intended for manual editing.
package com.phodal.charj.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.phodal.charj.psi.CharjElementType;
import com.phodal.charj.psi.impl.*;

public interface CharjTypes {

  IElementType BODY = new CharjElementType("BODY");
  IElementType HEADERS = new CharjElementType("HEADERS");
  IElementType IMPORT_DECLARATION = new CharjElementType("IMPORT_DECLARATION");
  IElementType PACKAGE_DECLARATION = new CharjElementType("PACKAGE_DECLARATION");

  IElementType BLOCK_COMMENT = new CharjTokenType("BLOCK_COMMENT");
  IElementType BODY_KEYWORD = new CharjTokenType("body");
  IElementType COMMENT = new CharjTokenType("COMMENT");
  IElementType IMPORT_KEYWORD = new CharjTokenType("import");
  IElementType PACKAGE_KEYWORD = new CharjTokenType("pkg");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BODY) {
        return new CharjBodyImpl(node);
      }
      else if (type == HEADERS) {
        return new CharjHeadersImpl(node);
      }
      else if (type == IMPORT_DECLARATION) {
        return new CharjImportDeclarationImpl(node);
      }
      else if (type == PACKAGE_DECLARATION) {
        return new CharjPackageDeclarationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}