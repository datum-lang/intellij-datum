package com.phodal.datum.language;

import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.TokenSet;
import com.phodal.datum.CharjLexerAdapter;
import com.phodal.datum.lexer.CharjTypes;
import com.phodal.datum.psi.CharjStructDeclaration;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CharjFindUsagesProvider implements FindUsagesProvider {
    @Nullable
    @Override
    public WordsScanner getWordsScanner() {
        return new DefaultWordsScanner(new CharjLexerAdapter(),
            TokenSet.create(CharjTypes.STRUCT_KEYWORD),
            TokenSet.create(CharjTypes.STRUCT_METHOD_DECLARATION),
            TokenSet.EMPTY);
    }


    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
        return psiElement instanceof PsiNamedElement;
    }

    @Override
    public @Nullable String getHelpId(@NotNull PsiElement psiElement) {
        return null;
    }

    @Override
    public @Nls @NotNull String getType(@NotNull PsiElement element) {
        if (element instanceof CharjStructDeclaration) {
            return "charj struct";
        } else {
            return "";
        }
    }

    @Override
    public @Nls @NotNull String getDescriptiveName(@NotNull PsiElement element) {
        if (element instanceof CharjStructDeclaration) {
            return ((CharjStructDeclaration) element).getName();
        } else {
            return "";
        }    }

    @Override
    public @Nls @NotNull String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        if (element instanceof CharjStructDeclaration) {
            return ((CharjStructDeclaration) element).getName();
        } else {
            return "";
        }
    }
}
