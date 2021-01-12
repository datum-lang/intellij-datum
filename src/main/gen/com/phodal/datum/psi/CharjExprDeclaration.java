// This is a generated file. Not intended for manual editing.
package com.phodal.datum.psi;

import java.util.List;
import org.jetbrains.annotations.*;

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
