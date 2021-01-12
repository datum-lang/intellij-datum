// This is a generated file. Not intended for manual editing.
package com.phodal.datum.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.phodal.datum.psi.*;

public class CharjHeadersImpl extends CharjPsiCompositeElementImpl implements CharjHeaders {

  public CharjHeadersImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CharjVisitor visitor) {
    visitor.visitHeaders(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CharjVisitor) accept((CharjVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CharjImportDeclaration getImportDeclaration() {
    return findChildByClass(CharjImportDeclaration.class);
  }

  @Override
  @NotNull
  public CharjPackageDeclaration getPackageDeclaration() {
    return findNotNullChildByClass(CharjPackageDeclaration.class);
  }

}
