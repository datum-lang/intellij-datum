package com.phodal.datum.parser;

import com.intellij.psi.tree.IElementType;
import com.phodal.datum.CharjLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CharjElementType extends IElementType {
    public CharjElementType(@NotNull @NonNls String debugName) {
        super(debugName, CharjLanguage.INSTANCE);
    }
}
