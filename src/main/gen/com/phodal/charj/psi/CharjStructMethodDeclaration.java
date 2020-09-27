// This is a generated file. Not intended for manual editing.
package com.phodal.charj.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CharjStructMethodDeclaration extends CharjNamedElement {

  @NotNull
  CharjFunctionDefineName getFunctionDefineName();

  @NotNull
  CharjFunctionParameters getFunctionParameters();

  @NotNull
  List<CharjMemberDeclaration> getMemberDeclarationList();

  @NotNull
  CharjStructNameDeclaration getStructNameDeclaration();

  @Nullable
  String getName();

}
