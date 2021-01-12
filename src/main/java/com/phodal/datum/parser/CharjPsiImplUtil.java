package com.phodal.datum.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiReference;
import com.phodal.datum.CharjIcons;
import com.phodal.datum.lexer.CharjTypes;
import com.phodal.datum.psi.CharjNameComponent;
import com.phodal.datum.psi.CharjStructDeclaration;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

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


    public static ItemPresentation getPresentation(final CharjStructDeclaration element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getName();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Override
            public Icon getIcon(boolean unused) {
                return CharjIcons.FILE;
            }
        };
    }
}
