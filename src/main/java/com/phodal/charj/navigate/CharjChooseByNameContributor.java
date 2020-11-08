package com.phodal.charj.navigate;

import com.intellij.navigation.ChooseByNameContributor;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import com.phodal.charj.CharjUtil;
import com.phodal.charj.psi.impl.CharjStructDeclarationImpl;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CharjChooseByNameContributor implements ChooseByNameContributor {

    @Override
    public @NotNull String[] getNames(Project project, boolean includeNonProjectItems) {
        List<CharjStructDeclarationImpl> declarations = CharjUtil.findStructures(project);
        List<String> names = new ArrayList<>(declarations.size());
        for (CharjStructDeclarationImpl decl : declarations) {
            names.add(decl.getName());
        }
        return names.toArray(new String[names.size()]);
    }

    @Override
    public @NotNull NavigationItem[] getItemsByName(String name, String pattern, Project project, boolean includeNonProjectItems) {
        List<CharjStructDeclarationImpl> properties = CharjUtil.findStructures(project, name);
        return properties.toArray(new NavigationItem[properties.size()]);
    }
}
