package com.phodal.datum.psi;

import com.intellij.psi.tree.IElementType;
import com.phodal.datum.CharjLanguage;
import org.jetbrains.annotations.NotNull;

public class CharjElementType  extends IElementType {
    public CharjElementType(@NotNull String debugName) {
        super(debugName, CharjLanguage.INSTANCE);
    }
}
