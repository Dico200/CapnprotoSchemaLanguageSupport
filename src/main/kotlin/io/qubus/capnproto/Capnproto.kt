package io.qubus.capnproto

object Capnproto {
    val language = CapnprotoLanguage()
    val fileType = CapnprotoFileType(language)
    val syntaxHighlighterFactor = CapnprotoSyntaxHighlighterFactory(language)
}