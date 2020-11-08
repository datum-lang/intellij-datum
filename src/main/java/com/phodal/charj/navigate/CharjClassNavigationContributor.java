package com.phodal.charj.navigate;

import com.intellij.lang.Language;
import com.intellij.navigation.ChooseByNameContributorEx;
import com.intellij.navigation.GotoClassContributor;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StubIndex;
import com.intellij.util.Processor;
import com.intellij.util.indexing.FindSymbolParameters;
import com.intellij.util.indexing.IdFilter;
import com.phodal.charj.CharjLanguage;
import com.phodal.charj.psi.stubs.CharjStructNameIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CharjClassNavigationContributor implements GotoClassContributor, ChooseByNameContributorEx {

    @Override
    public void processNames(@NotNull Processor<? super String> processor, @NotNull GlobalSearchScope scope, @Nullable IdFilter filter) {
        if (!StubIndex.getInstance().processAllKeys(CharjStructNameIndex.KEY, processor, scope, filter)) return;
    }

    @Override
    public void processElementsWithName(@NotNull String name, @NotNull Processor<? super NavigationItem> processor, @NotNull FindSymbolParameters parameters) {

    }

    @Override
    public @Nullable String getQualifiedName(NavigationItem item) {
        return null;
    }

    @Override
    public @Nullable String getQualifiedNameSeparator() {
        return null;
    }

    @Override
    public @Nullable Language getElementLanguage() {
        return CharjLanguage.getInstance();
    }
}
