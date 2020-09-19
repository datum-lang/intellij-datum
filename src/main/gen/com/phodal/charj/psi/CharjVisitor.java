// This is a generated file. Not intended for manual editing.
package com.phodal.charj.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;

public class CharjVisitor extends PsiElementVisitor {

  public void visitBody(@NotNull CharjBody o) {
    visitPsiCompositeElement(o);
  }

  public void visitExprDeclaration(@NotNull CharjExprDeclaration o) {
    visitPsiCompositeElement(o);
  }

  public void visitHeaders(@NotNull CharjHeaders o) {
    visitPsiCompositeElement(o);
  }

  public void visitImport(@NotNull CharjImport o) {
    visitPsiCompositeElement(o);
  }

  public void visitImportDeclaration(@NotNull CharjImportDeclaration o) {
    visitPsiCompositeElement(o);
  }

  public void visitMemberDeclaration(@NotNull CharjMemberDeclaration o) {
    visitPsiCompositeElement(o);
  }

  public void visitNameComponent(@NotNull CharjNameComponent o) {
    visitNamedElement(o);
  }

  public void visitPackageDeclaration(@NotNull CharjPackageDeclaration o) {
    visitPsiCompositeElement(o);
  }

  public void visitPackageName(@NotNull CharjPackageName o) {
    visitPsiCompositeElement(o);
  }

  public void visitPrimitiveType(@NotNull CharjPrimitiveType o) {
    visitPsiCompositeElement(o);
  }

  public void visitQualifiedName(@NotNull CharjQualifiedName o) {
    visitPsiCompositeElement(o);
  }

  public void visitStructDeclaration(@NotNull CharjStructDeclaration o) {
    visitPsiCompositeElement(o);
  }

  public void visitNamedElement(@NotNull CharjNamedElement o) {
    visitPsiCompositeElement(o);
  }

  public void visitPsiCompositeElement(@NotNull CharjPsiCompositeElement o) {
    visitElement(o);
  }

}
