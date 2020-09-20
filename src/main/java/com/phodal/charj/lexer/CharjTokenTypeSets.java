package com.phodal.charj.lexer;

import com.intellij.psi.tree.TokenSet;

public interface CharjTokenTypeSets {
    TokenSet KEY_WORDS = TokenSet
            .create(
                    CharjTypes.DOLLAR,
                    CharjTypes.IN_KEYWORD,
                    CharjTypes.OUT_KEYWORD,
                    CharjTypes.DEF_KEYWORD,
                    CharjTypes.BODY_KEYWORD,
                    CharjTypes.IMPORT_KEYWORD,
                    CharjTypes.PACKAGE_KEYWORD,
                    CharjTypes.MEMBER_PLACEHOLDER,
                    CharjTypes.STRUCT_KEYWORD
            );

}
