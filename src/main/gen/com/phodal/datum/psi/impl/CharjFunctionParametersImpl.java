// This is a generated file. Not intended for manual editing.
package com.phodal.datum.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.phodal.datum.psi.*;

public class CharjFunctionParametersImpl extends CharjPsiCompositeElementImpl implements CharjFunctionParameters {

  public CharjFunctionParametersImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CharjVisitor visitor) {
    visitor.visitFunctionParameters(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CharjVisitor) accept((CharjVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CharjInputParameters getInputParameters() {
    return findChildByClass(CharjInputParameters.class);
  }

  @Override
  @Nullable
  public CharjOutputParameters getOutputParameters() {
    return findChildByClass(CharjOutputParameters.class);
  }

}
