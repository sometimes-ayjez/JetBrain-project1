package com.github.sometimesayjez.jetbrainproject1.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages

internal class JaysPopup : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val proj: Project? = e.project
        val mess = "Hello World!"
        val title = "Jay says hi :)"
        Messages.showMessageDialog(
                proj,
                mess,
                title,
                com.intellij.icons.AllIcons.Actions.Colors
        )
    }

    override fun update(e: AnActionEvent) {
        e.presentation.isEnabledAndVisible = true
    }
}