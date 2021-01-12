// This is a generated file. Not intended for manual editing.
package com.phodal.datum.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.phodal.datum.psi.*;

public class CharjFunctionNameImpl extends CharjPsiCompositeElementImpl implements CharjFunctionName {

  public CharjFunctionNameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CharjVisitor visitor) {
    visitor.visitFunctionName(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CharjVisitor) accept((CharjVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CharjNameComponent getNameComponent() {
    return findNotNullChildByClass(CharjNameComponent.class);
  }

}
