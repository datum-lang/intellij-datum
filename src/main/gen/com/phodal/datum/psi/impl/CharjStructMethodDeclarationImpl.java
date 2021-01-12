// This is a generated file. Not intended for manual editing.
package com.phodal.datum.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.phodal.datum.psi.*;

public class CharjStructMethodDeclarationImpl extends CharjNamedElementImpl implements CharjStructMethodDeclaration {

  public CharjStructMethodDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CharjVisitor visitor) {
    visitor.visitStructMethodDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CharjVisitor) accept((CharjVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CharjFunctionDefineName getFunctionDefineName() {
    return findNotNullChildByClass(CharjFunctionDefineName.class);
  }

  @Override
  @NotNull
  public CharjFunctionParameters getFunctionParameters() {
    return findNotNullChildByClass(CharjFunctionParameters.class);
  }

  @Override
  @NotNull
  public List<CharjMemberDeclaration> getMemberDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CharjMemberDeclaration.class);
  }

  @Override
  @NotNull
  public CharjStructNameDeclaration getStructNameDeclaration() {
    return findNotNullChildByClass(CharjStructNameDeclaration.class);
  }

  @Override
  @Nullable
  public CharjTypeLiteral getTypeLiteral() {
    return findChildByClass(CharjTypeLiteral.class);
  }

}
