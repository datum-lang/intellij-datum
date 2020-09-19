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
  @NotNull
  public List<CharjNameComponent> getNameComponentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CharjNameComponent.class);
  }

  @Override
  @NotNull
  public CharjQualifiedName getQualifiedName() {
    return findNotNullChildByClass(CharjQualifiedName.class);
  }

}
