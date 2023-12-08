package com.github.sometimesayjez.jetbrainproject1.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages

/**
 * A quick plugin that displays a modal window; it is accessible through Tools and the Search Everywhere function.
 */
internal class JaysPopup : AnAction() {
    /**
     * Create a dialogue window with the specified message on event
     */
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

    /**
     * Enable action regardless of project loading status
     */
    override fun update(e: AnActionEvent) {
        e.presentation.isEnabledAndVisible = true
    }
}