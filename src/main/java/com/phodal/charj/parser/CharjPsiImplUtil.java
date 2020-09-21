package com.phodal.charj.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.psi.PsiReference;
import com.phodal.charj.lexer.CharjTypes;
import com.phodal.charj.psi.CharjNameComponent;
import com.phodal.charj.psi.CharjStructDeclaration;

public class CharjPsiImplUtil {
    static void qualifiedName(PsiBuilder builder, int level, GeneratedParserUtilBase.Parser parser) {

    }

    public static PsiReference getReference(final CharjNameComponent namePart) {
        return null;
    }

    public static String getKey(CharjStructDeclaration element) {
        ASTNode keyNode = element.getNode().findChildByType(CharjTypes.STRUCT_NAME_DECLARATION);
        if (keyNode != null) {
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getName(CharjStructDeclaration element) {
        return getKey(element);
    }
}
