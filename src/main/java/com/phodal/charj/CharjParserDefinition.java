package com.phodal.charj;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.phodal.charj.parser.CharjParser;
import org.jetbrains.annotations.NotNull;

public class CharjParserDefinition implements ParserDefinition {
    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new CharjLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new CharjParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return null;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return null;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return null;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return null;
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new CharjFile(viewProvider);
    }
}
