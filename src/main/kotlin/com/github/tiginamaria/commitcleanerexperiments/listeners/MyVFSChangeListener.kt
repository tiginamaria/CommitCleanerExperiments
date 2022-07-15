package com.github.tiginamaria.commitcleanerexperiments.listeners

import com.intellij.openapi.vfs.newvfs.BulkFileListener
import com.intellij.openapi.vfs.newvfs.events.VFileEvent

class MyVFSChangeListener : BulkFileListener {
    override fun before(events: List<VFileEvent?>) {
        println("MyVFSChangeListener::before")
        println(events)
    }

    override fun after(events: List<VFileEvent?>) {
        println("MyVFSChangeListener::after")
        println(events)
    }
}