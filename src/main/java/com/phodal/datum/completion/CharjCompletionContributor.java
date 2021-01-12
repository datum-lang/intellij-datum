package com.phodal.datum.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.phodal.datum.lexer.CharjTypes;
import org.jetbrains.annotations.NotNull;

public class CharjCompletionContributor extends CompletionContributor {

    public CharjCompletionContributor() {
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(CharjTypes.PRIMITIVE_TYPE),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("int"));
                        resultSet.addElement(LookupElementBuilder.create("string"));
                        resultSet.addElement(LookupElementBuilder.create("float"));
                    }
                }
        );
    }
}
