package com.github.mentosl.danielapiplugin.services

import com.intellij.openapi.project.Project
import com.github.mentosl.danielapiplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
