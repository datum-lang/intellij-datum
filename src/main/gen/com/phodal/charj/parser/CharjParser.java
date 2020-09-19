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
  // BODY_KEYWORD
  public static boolean body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body")) return false;
    if (!nextTokenIs(b, BODY_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BODY_KEYWORD);
    exit_section_(b, m, BODY, r);
    return r;
  }

  /* ********************************************************** */
  // headers body
  static boolean compilationUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = headers(b, l + 1);
    p = r; // pin = 1
    r = r && body(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // packageDeclaration* importDeclaration*
  public static boolean headers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "headers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEADERS, "<headers>");
    r = headers_0(b, l + 1);
    r = r && headers_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // packageDeclaration*
  private static boolean headers_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "headers_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!packageDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "headers_0", c)) break;
    }
    return true;
  }

  // importDeclaration*
  private static boolean headers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "headers_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!importDeclaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "headers_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IMPORT_KEYWORD
  public static boolean importDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration")) return false;
    if (!nextTokenIs(b, IMPORT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT_KEYWORD);
    exit_section_(b, m, IMPORT_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // PACKAGE_KEYWORD
  public static boolean packageDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageDeclaration")) return false;
    if (!nextTokenIs(b, PACKAGE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PACKAGE_KEYWORD);
    exit_section_(b, m, PACKAGE_DECLARATION, r);
    return r;
  }

}