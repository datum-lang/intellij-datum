// This is a generated file. Not intended for manual editing.
package com.phodal.charj.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;

public class CharjVisitor extends PsiElementVisitor {

  public void visitBody(@NotNull CharjBody o) {
    visitPsiCompositeElement(o);
  }

  public void visitHeaders(@NotNull CharjHeaders o) {
    visitPsiCompositeElement(o);
  }

  public void visitImportDeclaration(@NotNull CharjImportDeclaration o) {
    visitPsiCompositeElement(o);
  }

  public void visitPackageDeclaration(@NotNull CharjPackageDeclaration o) {
    visitPsiCompositeElement(o);
  }

  public void visitPsiCompositeElement(@NotNull CharjPsiCompositeElement o) {
    visitElement(o);
  }

}
