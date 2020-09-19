package com.phodal.charj.psi;

import com.intellij.psi.tree.IElementType;
import com.phodal.charj.CharjLanguage;
import org.jetbrains.annotations.NotNull;

public class CharjElementType  extends IElementType {
    public CharjElementType(@NotNull String debugName) {
        super(debugName, CharjLanguage.INSTANCE);
    }
}
