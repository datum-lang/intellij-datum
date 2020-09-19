package com.phodal.charj.psi.impl;

import com.phodal.charj.psi.CharjPsiCompositeElement;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class CharjPsiCompositeElementImpl extends ASTWrapperPsiElement implements CharjPsiCompositeElement {
    public CharjPsiCompositeElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
