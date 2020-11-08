// This is a generated file. Not intended for manual editing.
package com.phodal.charj.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface CharjStructDeclaration extends CharjNamedElement {

  @NotNull
  List<CharjMemberDeclaration> getMemberDeclarationList();

  @NotNull
  CharjStructNameDeclaration getStructNameDeclaration();

  @Nullable
  String getName();

  @Nullable
  ItemPresentation getPresentation();

}
