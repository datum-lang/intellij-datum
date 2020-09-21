package com.phodal.charj.navigate;

import com.intellij.navigation.ChooseByNameContributor;
import com.intellij.navigation.GotoClassContributor;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.phodal.charj.CharjFile;
import com.phodal.charj.CharjFileType;
import com.phodal.charj.psi.CharjStructDeclaration;
import com.phodal.charj.psi.CharjStructNameDeclaration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NavigationContributor implements ChooseByNameContributor, GotoClassContributor {
    @Override
    public @Nullable String getQualifiedName(NavigationItem item) {
        System.out.println("item" + item);
        return null;
    }

    @Override
    public @Nullable String getQualifiedNameSeparator() {
        return "$";
    }

    @Override
    public @NotNull String[] getNames(Project project, boolean includeNonProjectItems) {
        List<CharjStructDeclaration> structs = findStructs(project);
        List<String> names = new ArrayList<>(structs.size());
        for (CharjStructDeclaration struct : structs) {
            PsiElement identifier = struct.getStructNameDeclaration().getNameComponent();
            names.add(identifier.getText());
        }

        return names.toArray(new String[names.size()]);
    }

    @Override
    public @NotNull NavigationItem[] getItemsByName(String name, String pattern, Project project, boolean includeNonProjectItems) {
        List<CharjStructDeclaration> properties = findStructByKey(project, name);
        return properties.toArray(new NavigationItem[properties.size()]);
    }

    private List<CharjStructDeclaration> findStructByKey(Project project, String key) {
        List<CharjStructDeclaration> results = new ArrayList<>();
        Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(CharjFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            CharjFile charjFile = (CharjFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (charjFile != null) {
                CharjStructDeclaration[] structs = PsiTreeUtil.getChildrenOfType(charjFile, CharjStructDeclaration.class);
                if (structs != null) {
                    for (CharjStructDeclaration struct : structs) {
                        CharjStructNameDeclaration structName = struct.getStructNameDeclaration();
                        if (key.equals(structName.getText())) {
                            results.add(struct);
                        }
                    }
                }
            }
        }


        return results;
    }

    private List<CharjStructDeclaration> findStructs(Project project) {
        List<CharjStructDeclaration> results = new ArrayList<>();
        Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(CharjFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            CharjFile charjFile = (CharjFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (charjFile != null) {
                CharjStructDeclaration[] structs = PsiTreeUtil.getChildrenOfType(charjFile, CharjStructDeclaration.class);
                if (structs != null) {
                    Collections.addAll(results, structs);
                }
            }
        }


        return results;
    }
}
