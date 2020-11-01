package com.phodal.charj.linemarkers;

import com.intellij.codeInsight.daemon.LineMarkerInfo;
import com.intellij.codeInsight.daemon.LineMarkerProvider;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo;
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider;
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder;
import com.intellij.icons.AllIcons;
import com.intellij.psi.PsiElement;
import com.phodal.charj.psi.CharjFunctionDefineName;
import com.phodal.charj.psi.CharjStructNameDeclaration;
import com.phodal.charj.psi.impl.CharjStructMethodDeclarationImpl;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class CharjStructLineMarkerProvider extends RelatedItemLineMarkerProvider {
    @Override
    protected void collectNavigationMarkers(@NotNull PsiElement element,
                                            @NotNull Collection<? super RelatedItemLineMarkerInfo<?>> result) {
        // This must be an element with a literal expression as a parent
        System.out.println(element);

        if(!(element instanceof CharjStructMethodDeclarationImpl)) {
            return;
        }

        CharjStructNameDeclaration nameDecl = ((CharjStructMethodDeclarationImpl) element).getStructNameDeclaration();
        String structName = nameDecl.getText();

        CharjFunctionDefineName defineName = ((CharjStructMethodDeclarationImpl) element).getFunctionDefineName();
        String funcName = defineName.getText();

        if (structName.equals("default")  && funcName.equals("main")) {
            // all icons: https://jetbrains.design/intellij/resources/icons_list/
            NavigationGutterIconBuilder<PsiElement> builder =
                    NavigationGutterIconBuilder.create(AllIcons.Actions.Execute)
                            .setTargets(element)
                            .setTooltipText("Run App");

            result.add(builder.createLineMarkerInfo(element));
        }

        return;
    }
}
