package com.phodal.charj.psi.stubs;

import com.intellij.openapi.project.Project;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndex;
import com.intellij.psi.stubs.StubIndexKey;
import com.phodal.charj.psi.CharjStructDeclaration;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class CharjStructNameIndex extends StringStubIndexExtension<CharjStructDeclaration> {
    public static final StubIndexKey<String, CharjStructDeclaration> KEY = StubIndexKey.createIndexKey("charj.struct.shortName");

    @Override
    public @NotNull StubIndexKey<String, CharjStructDeclaration> getKey() {
        return KEY;
    }

    public static Collection<String> allKeys(Project project) {
        return StubIndex.getInstance().getAllKeys(KEY, project);
    }


    public static Collection<CharjStructDeclaration> find(String name, Project project, GlobalSearchScope scope) {
        return StubIndex.getElements(KEY, name, project, scope, CharjStructDeclaration.class);
    }

    public static Collection<CharjStructDeclaration> find(String name, Project project, boolean includeNonProjectItems) {
        final GlobalSearchScope scope = GlobalSearchScope.projectScope(project);
        return find(name, project, scope);
    }
}
