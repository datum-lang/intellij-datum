// This is a generated file. Not intended for manual editing.
package com.phodal.charj.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CharjExprDeclaration extends CharjPsiCompositeElement {

  @Nullable
  CharjFunctionName getFunctionName();

  @NotNull
  List<CharjNameComponent> getNameComponentList();

  @Nullable
  CharjPrimitiveType getPrimitiveType();

  @NotNull
  List<CharjVariableDeclaration> getVariableDeclarationList();

}
