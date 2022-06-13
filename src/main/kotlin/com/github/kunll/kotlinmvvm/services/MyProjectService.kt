package com.github.kunll.kotlinmvvm.services

import com.intellij.openapi.project.Project
import com.github.kunll.kotlinmvvm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
