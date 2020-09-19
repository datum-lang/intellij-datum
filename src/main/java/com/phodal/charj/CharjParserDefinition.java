package com.phodal.charj;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.phodal.charj.lexer.CharjTypes;
import com.phodal.charj.parser.CharjParser;
import org.jetbrains.annotations.NotNull;

public class CharjParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(CharjTypes.COMMENT);

    public static final IFileElementType FILE = new IFileElementType(CharjLanguage.INSTANCE);

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
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return CharjTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new CharjFile(viewProvider);
    }
}
