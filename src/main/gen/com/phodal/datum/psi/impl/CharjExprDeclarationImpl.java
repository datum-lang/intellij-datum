// This is a generated file. Not intended for manual editing.
package com.phodal.datum.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.phodal.datum.psi.*;

public class CharjExprDeclarationImpl extends CharjPsiCompositeElementImpl implements CharjExprDeclaration {

  public CharjExprDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CharjVisitor visitor) {
    visitor.visitExprDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CharjVisitor) accept((CharjVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CharjFunctionName getFunctionName() {
    return findChildByClass(CharjFunctionName.class);
  }

  @Override
  @NotNull
  public List<CharjNameComponent> getNameComponentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CharjNameComponent.class);
  }

  @Override
  @Nullable
  public CharjPrimitiveType getPrimitiveType() {
    return findChildByClass(CharjPrimitiveType.class);
  }

  @Override
  @NotNull
  public List<CharjVariableDeclaration> getVariableDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CharjVariableDeclaration.class);
  }

}
