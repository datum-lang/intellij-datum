// This is a generated file. Not intended for manual editing.
package com.phodal.datum.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.phodal.datum.psi.*;

public class CharjOutputParametersImpl extends CharjPsiCompositeElementImpl implements CharjOutputParameters {

  public CharjOutputParametersImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CharjVisitor visitor) {
    visitor.visitOutputParameters(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CharjVisitor) accept((CharjVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CharjParameter> getParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CharjParameter.class);
  }

}
