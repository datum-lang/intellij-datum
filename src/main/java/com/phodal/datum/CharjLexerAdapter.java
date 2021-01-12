package com.phodal.datum;

import com.intellij.lexer.FlexAdapter;
import com.phodal.datum.lexer._CharjLexer;

public class CharjLexerAdapter extends FlexAdapter {
    public CharjLexerAdapter() {
        super(new _CharjLexer(null));
    }
}
