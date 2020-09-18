package com.phodal.charj;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class CharjFileType extends LanguageFileType {
    public static final FileType INSTANCE = new CharjFileType();

    protected CharjFileType() {
        super(CharjLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "Charj File";
    }

    @Override
    public @NotNull @NlsContexts.Label String getDescription() {
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
