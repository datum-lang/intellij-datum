package com.phodal.charj.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.phodal.charj.parser.CharjElementType;

public interface CharjTypes {
    IElementType PROPERTY = new CharjElementType("PROPERTY");
    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            throw new AssertionError("Unknown element type: " + type);
        }
    }
}
