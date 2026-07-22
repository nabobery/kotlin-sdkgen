package com.nabobery.sdkgen.runtime.pagination

/** One relevant `link-value` parsed from an RFC 8288 `Link` header. */
internal data class LinkValue(
    val target: String,
    val rel: List<String>,
)

/** Deterministic parser metrics used by the complexity regression test. */
internal data class LinkHeaderParseResult(
    val values: List<LinkValue>,
    val scannedCharacters: Int,
)

/** Parses every `link-value` across repeated `Link` headers, preserving header and list order. */
internal fun parseLinkHeaders(headerValues: List<String>): List<LinkValue> =
    headerValues.flatMap { header -> parseLinkHeaderValueForTest(header).values }

/** Returns the first case-insensitive `rel=next` target, or `null` when none is well formed. */
internal fun firstNextLinkTarget(headerValues: List<String>): String? =
    parseLinkHeaders(headerValues)
        .firstOrNull { value -> value.rel.any { rel -> rel.equals("next", ignoreCase = true) } }
        ?.target

internal fun parseLinkHeaderValueForTest(header: String): LinkHeaderParseResult = LinkHeaderParser(header).parse()

private class LinkHeaderParser(
    private val header: String,
) {
    private val values = mutableListOf<LinkValue>()
    private var index = 0
    private var scannedCharacters = 0

    fun parse(): LinkHeaderParseResult {
        while (index < header.length) {
            skipWhitespaceAndCommas()
            if (index >= header.length) break
            if (read(index) != '<') {
                skipMalformedValue()
                continue
            }
            parseLinkValue()
        }
        return LinkHeaderParseResult(values.toList(), scannedCharacters)
    }

    private fun parseLinkValue() {
        val targetStart = ++index
        var targetEnd = -1
        while (index < header.length) {
            when (read(index)) {
                '>' -> {
                    targetEnd = index
                    index++
                    break
                }

                '<' -> {
                    return
                }

                else -> {
                    index++
                }
            }
        }
        if (targetEnd < 0) return

        val target = header.substring(targetStart, targetEnd)
        skipWhitespace()
        val params = mutableListOf<Pair<String, String>>()
        var malformed = false
        while (index < header.length && read(index) == ';') {
            index++
            skipWhitespace()
            val nameStart = index
            while (index < header.length) {
                val current = read(index)
                if (current == '=' || current == ';' || current == ',') break
                index++
            }
            val name = header.substring(nameStart, index).trim()
            var value = ""
            if (index < header.length && read(index) == '=') {
                index++
                skipWhitespace()
                if (index < header.length && read(index) == '"') {
                    val parsed = parseQuotedString()
                    value = parsed.value
                    if (!parsed.terminated) {
                        index = parsed.recoveryIndex
                        malformed = true
                        break
                    }
                } else {
                    val valueStart = index
                    while (index < header.length) {
                        val current = read(index)
                        if (current == ';' || current == ',') break
                        index++
                    }
                    value = header.substring(valueStart, index).trim()
                }
            }
            if (name.isNotEmpty()) params += name to value
            skipWhitespace()
        }

        if (malformed) {
            skipMalformedValue()
            return
        }

        val relValue = params.firstOrNull { (name, _) -> name.equals("rel", ignoreCase = true) }?.second
        values += LinkValue(target, relValue?.split(WHITESPACE)?.filter(String::isNotEmpty).orEmpty())
        skipMalformedValue()
    }

    private fun parseQuotedString(): QuotedValue {
        val value = StringBuilder()
        index++
        var recoveryComma = -1
        var recoveryCandidateCount = 0
        while (index < header.length) {
            val current = read(index)
            when {
                current == '\\' && index + 1 < header.length -> {
                    value.append(read(index + 1))
                    index += 2
                }

                current == '"' -> {
                    index++
                    return QuotedValue(value.toString(), index, terminated = true)
                }

                current == ',' && nextNonWhitespaceIsOpenAngle(index + 1) -> {
                    recoveryCandidateCount++
                    if (recoveryCandidateCount == 1) recoveryComma = index
                    value.append(current)
                    index++
                }

                else -> {
                    value.append(current)
                    index++
                }
            }
        }
        val recoveryIndex = recoveryComma.takeIf { recoveryCandidateCount == 1 } ?: index
        return QuotedValue(value.toString(), recoveryIndex, terminated = false)
    }

    private fun nextNonWhitespaceIsOpenAngle(start: Int): Boolean {
        var cursor = start
        while (cursor < header.length) {
            val current = read(cursor)
            if (!current.isWhitespace()) return current == '<'
            cursor++
        }
        return false
    }

    private fun skipMalformedValue() {
        var inQuotes = false
        var inAngle = false
        while (index < header.length) {
            val current = read(index)
            when {
                inQuotes && current == '\\' && index + 1 < header.length -> {
                    index += 2
                }

                inQuotes && current == '"' -> {
                    inQuotes = false
                    index++
                }

                inQuotes -> {
                    index++
                }

                inAngle && current == '>' -> {
                    inAngle = false
                    index++
                }

                inAngle -> {
                    index++
                }

                current == '"' -> {
                    inQuotes = true
                    index++
                }

                current == '<' -> {
                    inAngle = true
                    index++
                }

                current == ',' -> {
                    index++
                    return
                }

                else -> {
                    index++
                }
            }
        }
    }

    private fun skipWhitespace() {
        while (index < header.length && read(index).isWhitespace()) index++
    }

    private fun skipWhitespaceAndCommas() {
        while (index < header.length) {
            val current = read(index)
            if (!current.isWhitespace() && current != ',') return
            index++
        }
    }

    private fun read(position: Int): Char {
        scannedCharacters++
        return header[position]
    }

    private data class QuotedValue(
        val value: String,
        val recoveryIndex: Int,
        val terminated: Boolean,
    )
}

private val WHITESPACE = Regex("\\s+")
