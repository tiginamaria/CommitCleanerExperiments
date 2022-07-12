package com.github.tiginamaria.commitcleanerexperiments.services

import com.intellij.openapi.project.Project
import com.github.tiginamaria.commitcleanerexperiments.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
