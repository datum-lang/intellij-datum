package com.phodal.charj;

import com.intellij.lexer.FlexAdapter;
import com.phodal.charj.lexer._CharjLexer;

public class CharjLexerAdapter extends FlexAdapter {
    public CharjLexerAdapter() {
        super(new _CharjLexer(null));
    }
}
