package com.phodal.charj.structure;

import com.intellij.ide.projectView.PresentationData;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import com.phodal.charj.CharjFile;
import com.phodal.charj.psi.*;
import com.phodal.charj.psi.impl.CharjStructDeclarationImpl;
import com.phodal.charj.psi.impl.CharjStructNameDeclarationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CharjStructureViewElement implements StructureViewTreeElement, SortableTreeElement {

    private final NavigatablePsiElement myElement;

    public CharjStructureViewElement(NavigatablePsiElement element) {
        this.myElement = element;
    }

    @Override
    public Object getValue() {
        return myElement;
    }

    @Override
    public void navigate(boolean requestFocus) {
        myElement.navigate(requestFocus);
    }

    @Override
    public boolean canNavigate() {
        return myElement.canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return myElement.canNavigateToSource();
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        String name = myElement.getName();
        return name != null ? name : "";
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        if (myElement instanceof CharjStructDeclarationImpl) {
            PresentationData struct = new PresentationData();
            struct.setIcon(null);
            struct.setLocationString(null);
            CharjStructNameDeclaration structNameDeclaration = ((CharjStructDeclarationImpl) myElement).getStructNameDeclaration();
            String structText = structNameDeclaration.getText();

            if (((CharjStructDeclarationImpl) myElement).getFunctionDefineName() != null) {
                CharjFunctionDefineName functionDefineName = ((CharjStructDeclarationImpl) myElement).getFunctionDefineName();
                assert functionDefineName != null;
                String funcName = functionDefineName.getText();
                structText = structText + "$" + funcName;
            }

            struct.setPresentableText(structText);
            return struct;
        }

        ItemPresentation presentation = myElement.getPresentation();
        return presentation != null ? presentation : new PresentationData();
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        if (myElement instanceof CharjFile) {
            List<CharjStructDeclaration> properties = PsiTreeUtil.getChildrenOfTypeAsList(myElement, CharjStructDeclaration.class);
            List<TreeElement> treeElements = new ArrayList<>(properties.size());
            for (CharjStructDeclaration property : properties) {
                treeElements.add(new CharjStructureViewElement(property));
            }
            return treeElements.toArray(new TreeElement[0]);
        }
        // todo: add check for CharjStructDeclaration
//        if (myElement instanceof CharjStructDeclaration) { }
        return EMPTY_ARRAY;
    }

}
