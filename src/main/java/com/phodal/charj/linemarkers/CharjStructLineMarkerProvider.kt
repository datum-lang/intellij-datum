package com.phodal.charj.linemarkers

import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerProvider
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder
import com.intellij.icons.AllIcons
import com.intellij.psi.PsiElement
import com.phodal.charj.psi.CharjStructDeclaration
import com.phodal.charj.psi.impl.CharjStructMethodDeclarationImpl

class CharjStructLineMarkerProvider : RelatedItemLineMarkerProvider() {
//    @SuppressWarnings("formatting.Indentation", "formatting.ParameterListWrapping")
    override fun collectNavigationMarkers(
            element: PsiElement,
            result: MutableCollection<in RelatedItemLineMarkerInfo<*>?>) {

        // This must be an element with a literal expression as a parent
        when (element) {
            is CharjStructDeclaration -> {
                val builder = NavigationGutterIconBuilder.create(AllIcons.Hierarchy.Class)
                        .setTargets(element)
                        .setTooltipText("Struct")
                result.add(builder.createLineMarkerInfo(element))
            }
            is CharjStructMethodDeclarationImpl -> {
                val structName = element.structNameDeclaration.text
                val funcName = element.functionDefineName.text

                if (structName == "default" && funcName == "main") {
                    // all icons: https://jetbrains.design/intellij/resources/icons_list/
                    val builder = NavigationGutterIconBuilder.create(AllIcons.Actions.Execute)
                            .setTargets(element)
                            .setTooltipText("Run App")
                    result.add(builder.createLineMarkerInfo(element))
                }
            }
        }
    }
}
