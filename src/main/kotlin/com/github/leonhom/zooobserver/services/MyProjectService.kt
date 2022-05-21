package com.github.leonhom.zooobserver.services

import com.intellij.openapi.project.Project
import com.github.leonhom.zooobserver.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
