package com.phodal.datum;

import com.intellij.lang.Language;

public class CharjLanguage extends Language {

    public static final CharjLanguage INSTANCE = new CharjLanguage();

    public static CharjLanguage getInstance() {
        return INSTANCE;
    }

    private CharjLanguage() {
        super("Charj");
    }

}
