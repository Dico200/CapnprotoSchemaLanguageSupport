package io.qubus.capnproto

import com.intellij.lang.Language
import com.intellij.openapi.util.IconLoader

class CapnprotoLanguage private constructor() : Language("Capnproto") {
    companion object {
        @JvmStatic
        val INSTANCE = CapnprotoLanguage()
        val ICON = IconLoader.getIcon("/icons/cap.png")
    }
}