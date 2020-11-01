package com.phodal.charj.linemarkers;

import com.intellij.codeInsight.daemon.LineMarkerInfo;
import com.intellij.codeInsight.daemon.LineMarkerProvider;
import com.intellij.psi.PsiElement;
import com.phodal.charj.psi.impl.CharjStructMethodDeclarationImpl;
import org.jetbrains.annotations.NotNull;

public class CharjStructLineMarkerProvider implements LineMarkerProvider {
    @Override
    public LineMarkerInfo<?> getLineMarkerInfo(@NotNull PsiElement element) {
        // This must be an element with a literal expression as a parent
        System.out.println(element);

        if(!(element instanceof CharjStructMethodDeclarationImpl)) {
            return null;
        }

        return null;
    }
}
