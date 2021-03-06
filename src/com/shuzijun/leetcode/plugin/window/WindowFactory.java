package com.shuzijun.leetcode.plugin.window;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @author shuzijun
 */
public class WindowFactory implements ToolWindowFactory {
    private ToolWindow mToolWindow;
    private Project mProject;

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {

        WindowUI windowUI = new WindowUI(toolWindow,project);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(windowUI.getContent(), "", false);
        toolWindow.getContentManager().addContent(content);

    }

}
