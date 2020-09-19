// This is a generated file. Not intended for manual editing.
package com.phodal.charj.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.phodal.charj.lexer.CharjTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CharjParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return compilationUnit(b, l + 1);
  }

  /* ********************************************************** */
  // structDeclaration* memberDeclaration?
  public static boolean body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BODY, "<body>");
    r = body_0(b, l + 1);
    r = r && body_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // structDeclaration*
  private static boolean body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!structDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "body_0", c)) break;
    }
    return true;
  }

  // memberDeclaration?
  private static boolean body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body_1")) return false;
    memberDeclaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // headers body
  static boolean compilationUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit")) return false;
    if (!nextTokenIs(b, PACKAGE_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = headers(b, l + 1);
    p = r; // pin = 1
    r = r && body(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // functionName variableDeclaration COMMA variableDeclaration
  public static boolean exprDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprDeclaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionName(b, l + 1);
    r = r && variableDeclaration(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && variableDeclaration(b, l + 1);
    exit_section_(b, m, EXPR_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // name_component
  public static boolean functionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_component(b, l + 1);
    exit_section_(b, m, FUNCTION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // packageDeclaration importDeclaration?
  public static boolean headers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "headers")) return false;
    if (!nextTokenIs(b, PACKAGE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = packageDeclaration(b, l + 1);
    r = r && headers_1(b, l + 1);
    exit_section_(b, m, HEADERS, r);
    return r;
  }

  // importDeclaration?
  private static boolean headers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "headers_1")) return false;
    importDeclaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // qualified_name
  public static boolean import_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_$")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualified_name(b, l + 1);
    exit_section_(b, m, IMPORT, r);
    return r;
  }

  /* ********************************************************** */
  // IMPORT_KEYWORD import
  public static boolean importDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration")) return false;
    if (!nextTokenIs(b, IMPORT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT_KEYWORD);
    r = r && import_$(b, l + 1);
    exit_section_(b, m, IMPORT_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // MEMBER_PLACEHOLDER structNameDeclaration COLON primitive_type
  //  | exprDeclaration
  public static boolean memberDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberDeclaration")) return false;
    if (!nextTokenIs(b, "<member declaration>", IDENTIFIER, MEMBER_PLACEHOLDER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_DECLARATION, "<member declaration>");
    r = memberDeclaration_0(b, l + 1);
    if (!r) r = exprDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // MEMBER_PLACEHOLDER structNameDeclaration COLON primitive_type
  private static boolean memberDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MEMBER_PLACEHOLDER);
    r = r && structNameDeclaration(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && primitive_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean name_component(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name_component")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, NAME_COMPONENT, r);
    return r;
  }

  /* ********************************************************** */
  // PACKAGE_KEYWORD package_name
  public static boolean packageDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageDeclaration")) return false;
    if (!nextTokenIs(b, PACKAGE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PACKAGE_KEYWORD);
    r = r && package_name(b, l + 1);
    exit_section_(b, m, PACKAGE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // qualified_name
  public static boolean package_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name")) return false;
    if (!nextTokenIs(b, "<package name>", IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_NAME, "<package name>");
    r = qualified_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INT_KEYWORD
  //     | FLOAT_KEYWORD
  //     | STRING_KEYWORD
  public static boolean primitive_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitive_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMITIVE_TYPE, "<primitive type>");
    r = consumeToken(b, INT_KEYWORD);
    if (!r) r = consumeToken(b, FLOAT_KEYWORD);
    if (!r) r = consumeToken(b, STRING_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name_component ("." name_component)*
  public static boolean qualified_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_component(b, l + 1);
    r = r && qualified_name_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_NAME, r);
    return r;
  }

  // ("." name_component)*
  private static boolean qualified_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_name_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qualified_name_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualified_name_1", c)) break;
    }
    return true;
  }

  // "." name_component
  private static boolean qualified_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && name_component(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRUCT_KEYWORD qualified_name OPEN_BRACE memberDeclaration* CLOSE_BRACE
  public static boolean structDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration")) return false;
    if (!nextTokenIs(b, STRUCT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRUCT_KEYWORD);
    r = r && qualified_name(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && structDeclaration_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, STRUCT_DECLARATION, r);
    return r;
  }

  // memberDeclaration*
  private static boolean structDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!memberDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "structDeclaration_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // name_component
  public static boolean structNameDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structNameDeclaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_component(b, l + 1);
    exit_section_(b, m, STRUCT_NAME_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // name_component
  public static boolean variableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = name_component(b, l + 1);
    exit_section_(b, m, VARIABLE_DECLARATION, r);
    return r;
  }

}
