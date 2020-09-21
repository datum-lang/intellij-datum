package com.phodal.charj;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class CharjFile extends PsiFileBase {

    public CharjFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CharjLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CharjFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Charj File";
    }

}
