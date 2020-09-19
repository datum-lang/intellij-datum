package com.phodal.charj.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import com.phodal.charj.psi.CharjNamedElement;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class CharjNamedElementImpl extends CharjPsiCompositeElementImpl implements CharjNamedElement {
    public CharjNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Nullable
    @Override
    public String getName() {
        return getLeaf().getText();
    }

    @Override
    public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
        getLeaf().replaceWithText(name);
        return this;
    }

    @NotNull
    private LeafPsiElement getLeaf() {
        return Objects.requireNonNull(PsiTreeUtil.getChildOfType(this, LeafPsiElement.class));
    }

    @Nullable
    @Override
    public ItemPresentation getPresentation() {
        final PsiElement parent = getParent();
        if (parent instanceof NavigationItem) {
            return ((NavigationItem) parent).getPresentation();
        }
        return null;
    }
}
