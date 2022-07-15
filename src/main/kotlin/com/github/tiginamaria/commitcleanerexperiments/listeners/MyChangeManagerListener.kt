package com.github.tiginamaria.commitcleanerexperiments.listeners

import com.intellij.history.core.LocalHistoryFacade
import com.intellij.history.core.changes.Change

internal class MyChangeManagerListener : LocalHistoryFacade.Listener() {
    override fun changeAdded(c: Change?) {
        println("MyChangeManagerListener::changeAdded")
        println(c)
    }

    override fun changeSetFinished() {
        println("MyChangeManagerListener::changeSetFinished")
    }
}
