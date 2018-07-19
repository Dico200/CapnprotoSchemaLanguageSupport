package io.qubus.capnproto

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.markup.TextAttributes
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.tree.IElementType
import io.qubus.capnproto.antlr.CapnProtoLexer
import io.qubus.capnproto.antlr.CapnProtoLexer.*
import io.qubus.capnproto.antlr.CapnProtoParser
import org.antlr.jetbrains.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType
import org.antlr.v4.runtime.TokenStream
import java.awt.Color

class CapnprotoSyntaxHighlighter(val project: Project?,
                                 val file: VirtualFile?) : SyntaxHighlighter {
    val lexer = CapnProtoLexer(null)
    val parser = CapnProtoParser(TokenStream(lexer))
    val jbLexer = ANTLRLexerAdaptor(Capnproto.language, lexer)

    override fun getHighlightingLexer() = jbLexer

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        if (tokenType is TokenIElementType) {
            getAttribute(tokenType.antlrTokenType)?.let { return arrayOf(it) }
        }
        return emptyArray()
    }

    private fun getAttribute(tokennr: Int): TextAttributesKey? {
        when (tokennr) {
            WHITESPACE -> return null
            VOID -> ATTKEY_TYPEDECL
            COMMENT -> ATTKEY_COMMENT
            HEXADECIMAL -> ATTKEY_ID

            NAME -> ATTKEY_REGULAR

            LOCATOR,
            FILE_ID -> ATTKEY_ID

            TEXT,
            INTEGER,
            FLOAT,
            BOOLEAN -> ATTKEY_LITERAL

            else -> null
        }?.let { return it }

        lexer.vocabulary.getLiteralName(tokennr)?.apply { substring(1, length - 1) }?.let {
            when (it) {
                "struct",
                "interface",
                "import",
                "enum",
                "annotation",
                "union",
                "extends",
                "using" -> ATTKEY_KEYWORD
                else -> null
            }?.let { return it }
        }

        lexer.vocabulary.getSymbolicName(tokennr)?.let {

        }

        return null
    }

    private fun getAttributeFromLiteral(tokennr: Int): TextAttributesKey? {
        lexer.vocabulary.getLiteralName(tokennr)?.apply { substring(1, length - 1) }?.let {
            when (it) {
                "struct",
                "interface",
                "import",
                "enum",
                "annotation",
                "union",
                "extends",
                "using" -> ATTKEY_KEYWORD
                else -> null
            }?.let { return it }
        }



        return null
    }

    companion object {
        val ATTKEY_REGULAR = newTextAttributesKey("capnp_regular") {

        }

        val ATTKEY_KEYWORD = newTextAttributesKey("capnp_keyword") {

        }

        val ATTKEY_ID = newTextAttributesKey("capnp_id") {

        }

        val ATTKEY_TYPEDECL = newTextAttributesKey("capnp_typedecl") {

        }

        val ATTKEY_LITERAL = newTextAttributesKey("capnp_literal") {

        }

        val ATTKEY_COMMENT = newTextAttributesKey("capnp_comment") {

        }

        val textAttributesKeys = arrayOf(
                newTextAttributesKey("capnp_regular") {

                },
                newTextAttributesKey("capnp_keyword") {

                },
                newTextAttributesKey("capnp_typedecl") {

                },
                newTextAttributesKey("capnp_id") {

                },
                newTextAttributesKey("capnp_literal") {

                },
                newTextAttributesKey("capnp_comment") {

                }
        )

        private inline fun newTextAttributesKey(externalName: String, configure: TextAttributes.() -> Unit): TextAttributesKey {
            return TextAttributesKey.createTextAttributesKey(externalName).also {
                it.defaultAttributes.backgroundColor = Color.WHITE
                configure(it.defaultAttributes)
            }
        }

    }

}