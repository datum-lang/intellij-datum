package com.github.phodal.intellijcharj.services

import com.github.phodal.intellijcharj.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
