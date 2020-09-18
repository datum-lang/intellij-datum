package com.github.phodal.intellijcharj.services

import com.intellij.openapi.project.Project
import com.github.phodal.intellijcharj.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
