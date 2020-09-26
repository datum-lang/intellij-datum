package com.phodal.charj.edit;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilder;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CharjFoldingBuilder implements FoldingBuilder {
    @Override
    public @NotNull FoldingDescriptor[] buildFoldRegions(@NotNull ASTNode node, @NotNull Document document) {
        return new FoldingDescriptor[0];
    }

    @Override
    public @Nullable String getPlaceholderText(@NotNull ASTNode node) {
        return null;
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return true;
    }
}
