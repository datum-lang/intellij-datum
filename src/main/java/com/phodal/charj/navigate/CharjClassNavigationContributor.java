package com.phodal.charj.navigate;

import com.intellij.navigation.GotoClassContributor;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CharjClassNavigationContributor implements GotoClassContributor {
    @Override
    public @Nullable String getQualifiedName(NavigationItem item) {
        System.out.println(item);
        return "$";
    }

    @Override
    public @Nullable String getQualifiedNameSeparator() {
        return "$";
    }

    @Override
    public @NotNull String[] getNames(Project project, boolean includeNonProjectItems) {
        return new String[0];
    }

    @Override
    public @NotNull NavigationItem[] getItemsByName(String name, String pattern, Project project, boolean includeNonProjectItems) {
        return new NavigationItem[0];
    }
}
