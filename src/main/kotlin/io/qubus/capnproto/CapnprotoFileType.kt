package io.qubus.capnproto

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class CapnprotoFileType private constructor() : LanguageFileType(CapnprotoLanguage.INSTANCE) {
    override fun getName() = "Capnproto Schema File"
    override fun getDescription() = "A Schema File for Capnproto"
    override fun getDefaultExtension() = "capnp"
    override fun getIcon() = CapnprotoLanguage.ICON

    companion object {
        @JvmStatic
        val INSTANCE = CapnprotoFileType()
    }
}