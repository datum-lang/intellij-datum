package com.phodal.datum.psi;

import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.tree.IElementType;

public interface CharjPsiCompositeElement extends NavigatablePsiElement {
    IElementType getTokenType();
}
