// This is a generated file. Not intended for manual editing.
package com.phodal.charj.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.phodal.charj.lexer.CharjTypes.*;
import com.phodal.charj.psi.*;
import com.phodal.charj.parser.CharjPsiImplUtil;

public class CharjParameterImpl extends CharjPsiCompositeElementImpl implements CharjParameter {

  public CharjParameterImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CharjVisitor visitor) {
    visitor.visitParameter(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CharjVisitor) accept((CharjVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CharjParameterType getParameterType() {
    return findNotNullChildByClass(CharjParameterType.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
