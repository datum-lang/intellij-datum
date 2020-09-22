package com.phodal.charj.completion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.patterns.ElementPattern;
import com.intellij.psi.PsiElement;

abstract class CharjCompletionProvider  extends CompletionProvider<CompletionParameters> {
    ElementPattern<PsiElement> elementPattern;
}
