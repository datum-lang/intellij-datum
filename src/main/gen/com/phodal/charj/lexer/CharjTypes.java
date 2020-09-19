// This is a generated file. Not intended for manual editing.
package com.phodal.charj.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.phodal.charj.psi.CharjElementType;
import com.phodal.charj.psi.impl.*;

public interface CharjTypes {

  IElementType BODY = new CharjElementType("BODY");
  IElementType EXPR_DECLARATION = new CharjElementType("EXPR_DECLARATION");
  IElementType FUNCTION_DEFINE_NAME = new CharjElementType("FUNCTION_DEFINE_NAME");
  IElementType FUNCTION_NAME = new CharjElementType("FUNCTION_NAME");
  IElementType HEADERS = new CharjElementType("HEADERS");
  IElementType IMPORT = new CharjElementType("IMPORT");
  IElementType IMPORT_DECLARATION = new CharjElementType("IMPORT_DECLARATION");
  IElementType MEMBER_DECLARATION = new CharjElementType("MEMBER_DECLARATION");
  IElementType NAME_COMPONENT = new CharjElementType("NAME_COMPONENT");
  IElementType PACKAGE_DECLARATION = new CharjElementType("PACKAGE_DECLARATION");
  IElementType PACKAGE_NAME = new CharjElementType("PACKAGE_NAME");
  IElementType PRIMITIVE_TYPE = new CharjElementType("PRIMITIVE_TYPE");
  IElementType QUALIFIED_NAME = new CharjElementType("QUALIFIED_NAME");
  IElementType STRUCT_DECLARATION = new CharjElementType("STRUCT_DECLARATION");
  IElementType STRUCT_NAME_DECLARATION = new CharjElementType("STRUCT_NAME_DECLARATION");
  IElementType VARIABLE_DECLARATION = new CharjElementType("VARIABLE_DECLARATION");

  IElementType BLOCK_COMMENT = new CharjTokenType("BLOCK_COMMENT");
  IElementType BODY_KEYWORD = new CharjTokenType("body");
  IElementType CLOSE_BRACE = new CharjTokenType("}");
  IElementType COLON = new CharjTokenType(":");
  IElementType COMMA = new CharjTokenType(",");
  IElementType COMMENT = new CharjTokenType("COMMENT");
  IElementType DEF_KEYWORD = new CharjTokenType("def");
  IElementType DOLLAR = new CharjTokenType("$");
  IElementType DOUBLE_COLON = new CharjTokenType("::");
  IElementType FLOAT_KEYWORD = new CharjTokenType("float");
  IElementType IDENTIFIER = new CharjTokenType("IDENTIFIER");
  IElementType IMPORT_KEYWORD = new CharjTokenType("import");
  IElementType INT_KEYWORD = new CharjTokenType("int");
  IElementType MEMBER_PLACEHOLDER = new CharjTokenType("member");
  IElementType OPEN_BRACE = new CharjTokenType("{");
  IElementType PACKAGE_KEYWORD = new CharjTokenType("pkg");
  IElementType SEMICOLON = new CharjTokenType(";");
  IElementType SLASH = new CharjTokenType("/");
  IElementType STRING_KEYWORD = new CharjTokenType("string");
  IElementType STRUCT_KEYWORD = new CharjTokenType("struct");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BODY) {
        return new CharjBodyImpl(node);
      }
      else if (type == EXPR_DECLARATION) {
        return new CharjExprDeclarationImpl(node);
      }
      else if (type == FUNCTION_DEFINE_NAME) {
        return new CharjFunctionDefineNameImpl(node);
      }
      else if (type == FUNCTION_NAME) {
        return new CharjFunctionNameImpl(node);
      }
      else if (type == HEADERS) {
        return new CharjHeadersImpl(node);
      }
      else if (type == IMPORT) {
        return new CharjImportImpl(node);
      }
      else if (type == IMPORT_DECLARATION) {
        return new CharjImportDeclarationImpl(node);
      }
      else if (type == MEMBER_DECLARATION) {
        return new CharjMemberDeclarationImpl(node);
      }
      else if (type == NAME_COMPONENT) {
        return new CharjNameComponentImpl(node);
      }
      else if (type == PACKAGE_DECLARATION) {
        return new CharjPackageDeclarationImpl(node);
      }
      else if (type == PACKAGE_NAME) {
        return new CharjPackageNameImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new CharjPrimitiveTypeImpl(node);
      }
      else if (type == QUALIFIED_NAME) {
        return new CharjQualifiedNameImpl(node);
      }
      else if (type == STRUCT_DECLARATION) {
        return new CharjStructDeclarationImpl(node);
      }
      else if (type == STRUCT_NAME_DECLARATION) {
        return new CharjStructNameDeclarationImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new CharjVariableDeclarationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
