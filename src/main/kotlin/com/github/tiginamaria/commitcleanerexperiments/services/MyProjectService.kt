package com.github.tiginamaria.commitcleanerexperiments.services

import com.github.tiginamaria.commitcleanerexperiments.listeners.MyActionListener
import com.github.tiginamaria.commitcleanerexperiments.listeners.MyChangeManagerListener
import com.github.tiginamaria.commitcleanerexperiments.listeners.MyVFSChangeListener
import com.intellij.history.integration.LocalHistoryImpl
import com.intellij.openapi.actionSystem.ex.AnActionListener
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFileManager

class MyProjectService(project: Project) {

    init {
        LocalHistoryImpl.getInstanceImpl().facade!!.addListener(MyChangeManagerListener(), null)

        ApplicationManager.getApplication().messageBus.connect(project)
            .subscribe(AnActionListener.TOPIC, MyActionListener())

        ApplicationManager.getApplication().messageBus.connect(project)
            .subscribe(VirtualFileManager.VFS_CHANGES, MyVFSChangeListener())
    }
}
