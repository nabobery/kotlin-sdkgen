package com.nabobery.sdkgen.openapi.overlays

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.ObjectNode

internal object JsonPointerSupport {
    fun child(
        pointer: String,
        token: String,
    ): String = pointer + "/" + escape(token)

    fun escape(token: String): String = token.replace("~", "~0").replace("/", "~1")

    fun unescape(token: String): String = token.replace("~1", "/").replace("~0", "~")

    fun parent(pointer: String): Pair<String, String> {
        require(pointer.isNotEmpty()) { "The document root has no parent" }
        val separator = pointer.lastIndexOf('/')
        return pointer.substring(0, separator) to unescape(pointer.substring(separator + 1))
    }

    fun replace(
        root: JsonNode,
        pointer: String,
        replacement: JsonNode,
    ): JsonNode {
        if (pointer.isEmpty()) return replacement.deepCopy()
        val (parentPointer, token) = parent(pointer)
        when (val parent = root.at(parentPointer)) {
            is ObjectNode -> parent.set<JsonNode>(token, replacement.deepCopy())
            is ArrayNode -> parent.set(token.toInt(), replacement.deepCopy())
            else -> throw OverlayFormatException("Cannot replace $pointer because its parent is not a container")
        }
        return root
    }

    fun remove(
        root: JsonNode,
        pointer: String,
    ) {
        if (pointer.isEmpty()) {
            throw OverlayFormatException("Removing the document root is not supported")
        }
        val (parentPointer, token) = parent(pointer)
        when (val parent = root.at(parentPointer)) {
            is ObjectNode -> parent.remove(token)
            is ArrayNode -> parent.remove(token.toInt())
            else -> throw OverlayFormatException("Cannot remove $pointer because its parent is not a container")
        }
    }
}
