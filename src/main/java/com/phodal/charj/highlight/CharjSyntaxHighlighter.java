package com.phodal.charj.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.phodal.charj.CharjLexerAdapter;
import com.phodal.charj.lexer.CharjTokenTypeSets;
import com.phodal.charj.lexer.CharjTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class CharjSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<IElementType, TextAttributesKey>();

    static {
        fillMap(ATTRIBUTES, CharjTokenTypeSets.KEY_WORDS, DefaultLanguageHighlighterColors.KEYWORD);

        ATTRIBUTES.put(CharjTypes.STRUCT_NAME_DECLARATION, DefaultLanguageHighlighterColors.LABEL);
        ATTRIBUTES.put(CharjTypes.FUNCTION_DEFINE_NAME, DefaultLanguageHighlighterColors.STATIC_METHOD);

        ATTRIBUTES.put(CharjTypes.COMMENT, DefaultLanguageHighlighterColors.LINE_COMMENT);
        ATTRIBUTES.put(CharjTypes.QUALIFIED_NAME, DefaultLanguageHighlighterColors.IDENTIFIER);
        ATTRIBUTES.put(CharjTypes.CLOSE_BRACE, DefaultLanguageHighlighterColors.BRACES);
        ATTRIBUTES.put(CharjTypes.OPEN_BRACE, DefaultLanguageHighlighterColors.BRACES);
        ATTRIBUTES.put(CharjTypes.VARIABLE_DECLARATION, DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    }

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new CharjLexerAdapter();
    }

    @Override
    @NotNull
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(ATTRIBUTES.get(tokenType));
    }
}
