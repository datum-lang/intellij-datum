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

public class CharjMemberDeclarationImpl extends CharjPsiCompositeElementImpl implements CharjMemberDeclaration {

  public CharjMemberDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CharjVisitor visitor) {
    visitor.visitMemberDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CharjVisitor) accept((CharjVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CharjExprDeclaration getExprDeclaration() {
    return findChildByClass(CharjExprDeclaration.class);
  }

  @Override
  @Nullable
  public CharjPrimitiveType getPrimitiveType() {
    return findChildByClass(CharjPrimitiveType.class);
  }

  @Override
  @Nullable
  public CharjStructNameDeclaration getStructNameDeclaration() {
    return findChildByClass(CharjStructNameDeclaration.class);
  }

}
