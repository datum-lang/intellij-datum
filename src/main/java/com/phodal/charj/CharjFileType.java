package com.phodal.charj;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class CharjFileType extends LanguageFileType {
    public static final CharjFileType INSTANCE = new CharjFileType();

    private CharjFileType() {
        super(CharjLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "Charj File";
    }

    @Override
    public @NotNull String getDescription() {
        return "Charj language file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "cj";
    }

    @Override
    public @Nullable Icon getIcon() {
        return CharjIcons.FILE;
    }
}
