package com.zhutmost.svlsp

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader.findIcon
import javax.swing.Icon


class SystemVerilogFileType : LanguageFileType(SystemVerilogLanguage.INSTANCE) {
    companion object {
        val INSTANCE = SystemVerilogFileType()
    }

    override fun getName(): String = "SystemVerilog"

    override fun getDescription(): String = "SystemVerilog HDL file"

    override fun getDefaultExtension(): String = "sv"

    override fun getIcon(): Icon = SystemVerilogIcon.FILE
}

object SystemVerilogIcon {
    val FILE: Icon = findIcon("/fileIcon.svg", SystemVerilogIcon::class.java)!!
}

class SystemVerilogLanguage : Language("SystemVerilog") {
    companion object {
        val INSTANCE = SystemVerilogLanguage()
    }
}
