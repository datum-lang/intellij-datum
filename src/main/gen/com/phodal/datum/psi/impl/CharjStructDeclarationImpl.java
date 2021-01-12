// This is a generated file. Not intended for manual editing.
package com.phodal.datum.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.phodal.datum.psi.*;
import com.phodal.datum.parser.CharjPsiImplUtil;
import com.intellij.navigation.ItemPresentation;

public class CharjStructDeclarationImpl extends CharjNamedElementImpl implements CharjStructDeclaration {

  public CharjStructDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CharjVisitor visitor) {
    visitor.visitStructDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CharjVisitor) accept((CharjVisitor)visitor);
    else super.accept(visitor);
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
  public String getName() {
    return CharjPsiImplUtil.getName(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return CharjPsiImplUtil.getPresentation(this);
  }

}
