package com.zhutmost.svlsp

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServerSupportProvider
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor

private fun isSystemVerilogFile(file: VirtualFile) = file.extension == "sv" || file.extension == "svh"

class VeribleLspServerSupportProvider : LspServerSupportProvider {
    override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerSupportProvider.LspServerStarter) {
        if (isSystemVerilogFile(file))
            serverStarter.ensureServerStarted(VeribleLspServerDescriptor(project))
    }
}

private class VeribleLspServerDescriptor(project: Project) : ProjectWideLspServerDescriptor(project, "Verible") {
    override fun isSupportedFile(file: VirtualFile) = isSystemVerilogFile(file)
    override fun createCommandLine() = GeneralCommandLine("verible-verilog-ls")
}
