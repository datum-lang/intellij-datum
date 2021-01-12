// This is a generated file. Not intended for manual editing.
package com.phodal.datum.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.phodal.datum.psi.CharjElementType;
import com.phodal.datum.psi.impl.*;

public interface CharjTypes {

  IElementType EXPR_DECLARATION = new CharjElementType("EXPR_DECLARATION");
  IElementType FUNCTION_DEFINE_NAME = new CharjElementType("FUNCTION_DEFINE_NAME");
  IElementType FUNCTION_NAME = new CharjElementType("FUNCTION_NAME");
  IElementType FUNCTION_PARAMETERS = new CharjElementType("FUNCTION_PARAMETERS");
  IElementType HEADERS = new CharjElementType("HEADERS");
  IElementType IMPORT = new CharjElementType("IMPORT");
  IElementType IMPORT_DECLARATION = new CharjElementType("IMPORT_DECLARATION");
  IElementType INPUT_PARAMETERS = new CharjElementType("INPUT_PARAMETERS");
  IElementType MEMBER_DECLARATION = new CharjElementType("MEMBER_DECLARATION");
  IElementType NAME_COMPONENT = new CharjElementType("NAME_COMPONENT");
  IElementType OUTPUT_PARAMETERS = new CharjElementType("OUTPUT_PARAMETERS");
  IElementType PACKAGE_DECLARATION = new CharjElementType("PACKAGE_DECLARATION");
  IElementType PACKAGE_NAME = new CharjElementType("PACKAGE_NAME");
  IElementType PARAMETER = new CharjElementType("PARAMETER");
  IElementType PARAMETER_TYPE = new CharjElementType("PARAMETER_TYPE");
  IElementType PRIMITIVE_TYPE = new CharjElementType("PRIMITIVE_TYPE");
  IElementType QUALIFIED_NAME = new CharjElementType("QUALIFIED_NAME");
  IElementType STRUCT_DECLARATION = new CharjElementType("STRUCT_DECLARATION");
  IElementType STRUCT_METHOD_DECLARATION = new CharjElementType("STRUCT_METHOD_DECLARATION");
  IElementType STRUCT_NAME_DECLARATION = new CharjElementType("STRUCT_NAME_DECLARATION");
  IElementType TYPE_LITERAL = new CharjElementType("TYPE_LITERAL");
  IElementType VARIABLE_DECLARATION = new CharjElementType("VARIABLE_DECLARATION");

  IElementType AS_KEYWORD = new CharjTokenType("as");
  IElementType BLOCK_COMMENT = new CharjTokenType("BLOCK_COMMENT");
  IElementType BOOL_KEYWORD = new CharjTokenType("bool");
  IElementType BREAK_KEYWORD = new CharjTokenType("break");
  IElementType BYTES_KEYWORD = new CharjTokenType("bytes");
  IElementType CLOSE_BRACE = new CharjTokenType("}");
  IElementType COLON = new CharjTokenType(":");
  IElementType COMMA = new CharjTokenType(",");
  IElementType COMMENT = new CharjTokenType("COMMENT");
  IElementType CONTINUE_KEYWORD = new CharjTokenType("continue");
  IElementType DEF_KEYWORD = new CharjTokenType("DEF_KEYWORD");
  IElementType DOLLAR = new CharjTokenType("$");
  IElementType DOUBLE_COLON = new CharjTokenType("::");
  IElementType ELIF_KEYWORD = new CharjTokenType("elif");
  IElementType ELSE_KEYWORD = new CharjTokenType("else");
  IElementType END_KEYWORD = new CharjTokenType("end");
  IElementType EQUAL = new CharjTokenType("=");
  IElementType FLOAT_KEYWORD = new CharjTokenType("float");
  IElementType FOR_KEYWORD = new CharjTokenType("for");
  IElementType FUN_KEYWORD = new CharjTokenType("fun");
  IElementType GT = new CharjTokenType("GT");
  IElementType IDENTIFIER = new CharjTokenType("IDENTIFIER");
  IElementType IF_KEYWORD = new CharjTokenType("if");
  IElementType IMPORT_KEYWORD = new CharjTokenType("import");
  IElementType IN = new CharjTokenType("IN");
  IElementType INSTANCE_KEYWORD = new CharjTokenType("instance");
  IElementType INT_KEYWORD = new CharjTokenType("int");
  IElementType IN_KEYWORD = new CharjTokenType("in");
  IElementType LPAREN = new CharjTokenType("(");
  IElementType MATCH_KEYWORD = new CharjTokenType("match");
  IElementType MEMBER_KEYWORD = new CharjTokenType("member");
  IElementType OPEN_BRACE = new CharjTokenType("{");
  IElementType OUT_KEYWORD = new CharjTokenType("out");
  IElementType PACKAGE_KEYWORD = new CharjTokenType("package");
  IElementType PKG_KEYWORD = new CharjTokenType("pkg");
  IElementType QUOTA = new CharjTokenType("'");
  IElementType RARROW = new CharjTokenType("->");
  IElementType RETURN_KEYWORD = new CharjTokenType("return");
  IElementType RPAREN = new CharjTokenType(")");
  IElementType SEMICOLON = new CharjTokenType(";");
  IElementType SLASH = new CharjTokenType("/");
  IElementType STAR = new CharjTokenType("*");
  IElementType STRING_KEYWORD = new CharjTokenType("string");
  IElementType STRING_LITERAL = new CharjTokenType("STRING_LITERAL");
  IElementType STRUCT_KEYWORD = new CharjTokenType("struct");
  IElementType SUB = new CharjTokenType("SUB");
  IElementType WHILE_KEYWORD = new CharjTokenType("while");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == EXPR_DECLARATION) {
        return new CharjExprDeclarationImpl(node);
      }
      else if (type == FUNCTION_DEFINE_NAME) {
        return new CharjFunctionDefineNameImpl(node);
      }
      else if (type == FUNCTION_NAME) {
        return new CharjFunctionNameImpl(node);
      }
      else if (type == FUNCTION_PARAMETERS) {
        return new CharjFunctionParametersImpl(node);
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
      else if (type == INPUT_PARAMETERS) {
        return new CharjInputParametersImpl(node);
      }
      else if (type == MEMBER_DECLARATION) {
        return new CharjMemberDeclarationImpl(node);
      }
      else if (type == NAME_COMPONENT) {
        return new CharjNameComponentImpl(node);
      }
      else if (type == OUTPUT_PARAMETERS) {
        return new CharjOutputParametersImpl(node);
      }
      else if (type == PACKAGE_DECLARATION) {
        return new CharjPackageDeclarationImpl(node);
      }
      else if (type == PACKAGE_NAME) {
        return new CharjPackageNameImpl(node);
      }
      else if (type == PARAMETER) {
        return new CharjParameterImpl(node);
      }
      else if (type == PARAMETER_TYPE) {
        return new CharjParameterTypeImpl(node);
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
      else if (type == STRUCT_METHOD_DECLARATION) {
        return new CharjStructMethodDeclarationImpl(node);
      }
      else if (type == STRUCT_NAME_DECLARATION) {
        return new CharjStructNameDeclarationImpl(node);
      }
      else if (type == TYPE_LITERAL) {
        return new CharjTypeLiteralImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new CharjVariableDeclarationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
