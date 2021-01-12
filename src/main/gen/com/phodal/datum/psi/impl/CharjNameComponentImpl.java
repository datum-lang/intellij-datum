// This is a generated file. Not intended for manual editing.
package com.phodal.datum.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static com.phodal.datum.lexer.CharjTypes.*;
import com.phodal.datum.psi.*;
import com.phodal.datum.parser.CharjPsiImplUtil;
import com.intellij.psi.PsiReference;

public class CharjNameComponentImpl extends CharjNamedElementImpl implements CharjNameComponent {

  public CharjNameComponentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CharjVisitor visitor) {
    visitor.visitNameComponent(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CharjVisitor) accept((CharjVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

  @Override
  public PsiReference getReference() {
    return CharjPsiImplUtil.getReference(this);
  }

}
