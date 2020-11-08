package com.phodal.charj;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.phodal.charj.psi.impl.CharjStructDeclarationImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CharjUtil {
    // Searches the entire project for Simple language files with instances of the Simple property with the given key
    public static List<CharjStructDeclarationImpl> findStructures(Project project, String key) {
        List<CharjStructDeclarationImpl> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
            FileTypeIndex.getFiles(CharjFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            CharjFile simpleFile = (CharjFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                CharjStructDeclarationImpl[] declarations = PsiTreeUtil.getChildrenOfType(simpleFile, CharjStructDeclarationImpl.class);
                if (declarations != null) {
                    for (CharjStructDeclarationImpl decl : declarations) {
                        if (key.equals(decl.getName())) {
                            result.add(decl);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<CharjStructDeclarationImpl> findStructures(Project project) {
        List<CharjStructDeclarationImpl> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
            FileTypeIndex.getFiles(CharjFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            CharjFile charjFile = (CharjFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (charjFile != null) {
                CharjStructDeclarationImpl[] structs = PsiTreeUtil.getChildrenOfType(charjFile, CharjStructDeclarationImpl.class);
                if (structs != null) {
                    Collections.addAll(result, structs);
                }
            }
        }
        return result;
    }
}
