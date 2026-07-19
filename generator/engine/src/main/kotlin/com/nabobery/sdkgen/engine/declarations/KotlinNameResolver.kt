package com.nabobery.sdkgen.engine.declarations

import java.util.Locale

internal data class NameResolution(
    val names: Map<String, String>,
    val diagnostics: List<String>,
)

internal class KotlinNameResolver {
    fun resolveTypes(rawNames: List<String>): NameResolution {
        val names = linkedMapOf<String, String>()
        val diagnostics = mutableListOf<String>()
        val used = mutableMapOf<String, Int>()
        rawNames.sorted().forEach { raw ->
            val base = typeName(raw)
            val occurrence = (used[base] ?: 0) + 1
            used[base] = occurrence
            val resolved = if (occurrence == 1) base else "$base$occurrence"
            names[raw] = resolved
            if (occurrence > 1) diagnostics += "Type name '$raw' collided on '$base' and resolved to '$resolved'."
        }
        return NameResolution(names, diagnostics)
    }

    internal companion object {
        fun typeName(raw: String): String {
            val candidate =
                words(
                    raw,
                ).joinToString("") { word -> word.replaceFirstChar { it.uppercaseChar() } }.ifEmpty { "Value" }
            val safe = candidate.takeUnless { it.first().isDigit() } ?: "_$candidate"
            return if (safe.lowercase(Locale.ROOT) in KOTLIN_KEYWORDS) "${safe}Value" else safe
        }

        fun memberName(raw: String): String {
            val words = words(raw)
            val candidate =
                words.firstOrNull().orEmpty().lowercase(Locale.ROOT) +
                    words.drop(1).joinToString("") { it.replaceFirstChar(Char::uppercaseChar) }
            val nonEmpty = candidate.ifEmpty { "value" }
            val safe = nonEmpty.takeUnless { it.first().isDigit() } ?: "_$nonEmpty"
            return if (safe in KOTLIN_KEYWORDS) "${safe}Value" else safe
        }

        private fun words(raw: String): List<String> =
            raw
                .replace(Regex("([A-Z]+)([A-Z][a-z])"), "$1 $2")
                .replace(Regex("([a-z0-9])([A-Z])"), "$1 $2")
                .split(Regex("[^A-Za-z0-9]+"))
                .filter(String::isNotEmpty)
                .map { it.lowercase(Locale.ROOT) }

        private val KOTLIN_KEYWORDS =
            setOf(
                "as",
                "break",
                "class",
                "continue",
                "do",
                "else",
                "false",
                "for",
                "fun",
                "if",
                "in",
                "interface",
                "is",
                "null",
                "object",
                "package",
                "return",
                "super",
                "this",
                "throw",
                "true",
                "try",
                "typealias",
                "typeof",
                "val",
                "var",
                "when",
                "while",
            )
    }
}
