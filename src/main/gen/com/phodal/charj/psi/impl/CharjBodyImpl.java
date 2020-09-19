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

public class CharjBodyImpl extends CharjPsiCompositeElementImpl implements CharjBody {

  public CharjBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CharjVisitor visitor) {
    visitor.visitBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CharjVisitor) accept((CharjVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CharjMemberDeclaration getMemberDeclaration() {
    return findChildByClass(CharjMemberDeclaration.class);
  }

  @Override
  @NotNull
  public List<CharjStructDeclaration> getStructDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CharjStructDeclaration.class);
  }

}
