package com.phodal.charj.structure;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.psi.PsiFile;
import com.phodal.charj.CharjFile;
import org.jetbrains.annotations.NotNull;

public class CharjStructureViewModel extends StructureViewModelBase implements
        StructureViewModel.ElementInfoProvider {


    public CharjStructureViewModel(PsiFile psiFile) {
        super(psiFile, new CharjStructureViewElement(psiFile));
    }

    @NotNull
    public Sorter[] getSorters() {
        return new Sorter[]{Sorter.ALPHA_SORTER};
    }


    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return element instanceof CharjFile;
    }
}
