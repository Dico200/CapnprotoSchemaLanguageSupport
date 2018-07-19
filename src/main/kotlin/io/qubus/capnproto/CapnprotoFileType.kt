package io.qubus.capnproto

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader

class CapnprotoFileType(language: Language) : LanguageFileType(language) {
    override fun getName() = "Capnproto Schema File"
    override fun getDescription() = "A Schema File for Capnproto"
    override fun getDefaultExtension() = "capnp"
    override fun getIcon() = _icon

    companion object {
        private val _icon = IconLoader.getIcon("/icons/cap.png")
    }
}