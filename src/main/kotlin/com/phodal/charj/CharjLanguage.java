package com.phodal.charj;

import com.intellij.lang.Language;

public class CharjLanguage extends Language {

    public static final CharjLanguage INSTANCE = new CharjLanguage();

    private CharjLanguage() {
        super("Charj");
    }

}
