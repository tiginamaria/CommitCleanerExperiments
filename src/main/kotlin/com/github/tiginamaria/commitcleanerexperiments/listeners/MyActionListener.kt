package com.github.tiginamaria.commitcleanerexperiments.listeners

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.actionSystem.ex.AnActionListener
import com.intellij.refactoring.actions.BaseRefactoringAction
import com.intellij.refactoring.actions.RenameElementAction

class MyActionListener : AnActionListener {
    override fun beforeActionPerformed(action: AnAction, dataContext: DataContext, event: AnActionEvent) {
        println("MyActionListener::beforeActionPerformed")
        println(action)
        if (action is BaseRefactoringAction) {
            println("!!!BASE REFACTORING!!!")
        }
        if (action is RenameElementAction) {
            println("!!!RENAME REFACTORING!!!")
        }
        println(event)
    }

    override fun afterActionPerformed(action: AnAction, dataContext: DataContext, event: AnActionEvent) {
        println("MyActionListener::afterActionPerformed")
        println(action)
        if (action is BaseRefactoringAction) {
            println("!!!BASE REFACTORING!!!")
        }
        if (action is RenameElementAction) {
            println("!!!RENAME REFACTORING!!!")
        }
        println(event)
    }

    override fun beforeEditorTyping(c: Char, dataContext: DataContext) {
        println("MyActionListener::beforeEditorTyping")
        println(c)
    }

    override fun afterEditorTyping(c: Char, dataContext: DataContext) {
        println("MyActionListener::afterEditorTyping")
        println(c)
    }
}