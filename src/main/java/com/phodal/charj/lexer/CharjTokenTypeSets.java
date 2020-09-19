package com.phodal.charj.lexer;

import com.intellij.psi.tree.TokenSet;

public interface CharjTokenTypeSets {
    TokenSet KEY_WORDS = TokenSet
            .create(CharjTypes.BODY_KEYWORD, CharjTypes.IMPORT_KEYWORD, CharjTypes.PACKAGE_KEYWORD);

}
