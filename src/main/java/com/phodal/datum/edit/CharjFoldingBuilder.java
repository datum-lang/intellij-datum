package com.phodal.datum.edit;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.phodal.datum.CharjFile;
import com.phodal.datum.psi.CharjStructDeclaration;
import com.phodal.datum.psi.CharjStructNameDeclaration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CharjFoldingBuilder extends FoldingBuilderEx {

    @Override
    public @Nullable String getPlaceholderText(@NotNull ASTNode node) {
        String retTxt = "...";

        return retTxt;
    }

    @Override
    public @NotNull FoldingDescriptor[] buildFoldRegions(@NotNull PsiElement element, @NotNull Document document, boolean quick) {
        List<FoldingDescriptor> descriptors = new ArrayList<>();

        if (!(element instanceof CharjFile)) {
            return FoldingDescriptor.EMPTY;
        }

        @Nullable CharjStructDeclaration[] structs = PsiTreeUtil.getChildrenOfType(element, CharjStructDeclaration.class);
        if (structs == null) {
            return descriptors.toArray(new FoldingDescriptor[0]);
        }
        for (CharjStructDeclaration struct : structs) {
            CharjStructNameDeclaration structNameDeclaration = struct.getStructNameDeclaration();

            int nameEnd = structNameDeclaration.getNode().getTextRange().getStartOffset();
            int structEnd = struct.getNode().getTextRange().getEndOffset();

            FoldingDescriptor foldingDescriptor = new FoldingDescriptor(Objects.requireNonNull(struct),
                    new TextRange(nameEnd, structEnd)
            );

            descriptors.add(foldingDescriptor);
        }

        return descriptors.toArray(new FoldingDescriptor[descriptors.size()]);
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return true;
    }
}
