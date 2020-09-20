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

public class CharjStructDeclarationImpl extends CharjPsiCompositeElementImpl implements CharjStructDeclaration {

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
  @Nullable
  public CharjFunctionDefineName getFunctionDefineName() {
    return findChildByClass(CharjFunctionDefineName.class);
  }

  @Override
  @Nullable
  public CharjFunctionParameters getFunctionParameters() {
    return findChildByClass(CharjFunctionParameters.class);
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

}
