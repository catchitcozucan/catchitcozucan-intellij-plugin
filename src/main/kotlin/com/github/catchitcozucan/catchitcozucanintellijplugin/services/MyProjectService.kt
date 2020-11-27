package com.github.catchitcozucan.catchitcozucanintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.catchitcozucan.catchitcozucanintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
