package com.nabobery.sdkgen.openapi.jsonpath

import com.nabobery.sdkgen.openapi.overlays.JsonPathSource
import com.nabobery.sdkgen.openapi.overlays.JsonPathValidationException

public object Rfc9535GrammarValidator {
    public fun validate(
        expression: String,
        source: JsonPathSource,
    ) {
        if (expression.length > JsonPathEvaluationLimits.MAX_SELECTOR_LENGTH) {
            throw JsonPathValidationException(
                expression,
                source,
                JsonPathEvaluationLimits.MAX_SELECTOR_LENGTH,
                "SDKGEN-JSONPATH-BUDGET: selector length exceeds ${JsonPathEvaluationLimits.MAX_SELECTOR_LENGTH} characters",
            )
        }
        try {
            Parser(expression).parse()
        } catch (failure: ParseFailure) {
            throw JsonPathValidationException(expression, source, failure.offset, failure.message ?: "invalid syntax")
        }
    }

    private class Parser(
        private val input: String,
    ) {
        private var offset = 0

        fun parse() {
            expect('$', "expression must start with root identifier '$'")
            parseSegments()
            if (!atEnd()) fail("unexpected trailing input")
        }

        private fun parseSegments() {
            while (true) {
                val beforeWhitespace = offset
                skipWhitespace()
                if (atEnd()) {
                    if (offset != beforeWhitespace) fail("trailing whitespace is not permitted", beforeWhitespace)
                    return
                }
                if (peek() != '.' && peek() != '[') {
                    if (offset != beforeWhitespace) fail("whitespace must be followed by a segment", beforeWhitespace)
                    return
                }
                parseSegment()
            }
        }

        private fun parseSegment() {
            when {
                consume("..") -> parseDescendantSegment()
                consume(".") -> parseDotSegment()
                peekOrNull() == '[' -> parseBracketedSelection()
                else -> fail("expected child or descendant segment")
            }
        }

        private fun parseDotSegment() {
            when {
                consume("*") -> Unit
                isNameFirst(peekCodePoint()) -> parseMemberNameShorthand()
                else -> fail("expected wildcard or member name immediately after '.'")
            }
        }

        private fun parseDescendantSegment() {
            when {
                peekOrNull() == '[' -> parseBracketedSelection()
                consume("*") -> Unit
                isNameFirst(peekCodePoint()) -> parseMemberNameShorthand()
                else -> fail("expected bracketed selection, wildcard, or member name immediately after '..'")
            }
        }

        private fun parseBracketedSelection() {
            expect('[', "expected '['")
            skipWhitespace()
            if (consume("]")) fail("bracketed selection must contain at least one selector", offset - 1)
            if (consume(",")) fail("selector cannot start with a comma", offset - 1)
            parseSelector()
            while (true) {
                skipWhitespace()
                if (!consume(",")) break
                skipWhitespace()
                if (peekOrNull() == ']') fail("selector cannot end with a comma")
                parseSelector()
            }
            skipWhitespace()
            expect(']', "expected ']' after selector")
        }

        private fun parseSelector(): Boolean =
            when (peekOrNull()) {
                '\'', '"' -> {
                    parseStringLiteral()
                    true
                }

                '*' -> {
                    offset++
                    false
                }

                '?' -> {
                    offset++
                    skipWhitespace()
                    parseLogicalExpression()
                    false
                }

                ':', '-', in '0'..'9' -> {
                    parseIndexOrSlice()
                }

                else -> {
                    fail("expected an RFC 9535 selector")
                }
            }

        private fun parseIndexOrSlice(): Boolean {
            val start = offset
            if (peekOrNull() == ':') {
                parseSlice(null)
                return false
            }
            val integer = parseInteger(allowNegativeZero = false)
            skipWhitespace()
            return if (peekOrNull() == ':') {
                parseSlice(integer)
                false
            } else {
                if (offset == start) fail("expected index or slice")
                true
            }
        }

        private fun parseSlice(start: Long?) {
            @Suppress("UNUSED_VARIABLE")
            val ignoredStart = start
            expect(':', "expected ':' in slice")
            skipWhitespace()
            if (peekOrNull() != ':' && peekOrNull() != ']' && peekOrNull() != ',') {
                parseInteger(allowNegativeZero = false)
                skipWhitespace()
            }
            if (consume(":")) {
                skipWhitespace()
                if (peekOrNull() != ']' && peekOrNull() != ',') {
                    parseInteger(allowNegativeZero = false)
                }
            }
        }

        private fun parseLogicalExpression(): ExprType {
            var type = parseLogicalAndExpression()
            while (true) {
                skipWhitespace()
                if (!consume("||")) break
                skipWhitespace()
                requireLogical(type)
                requireLogical(parseLogicalAndExpression())
                type = ExprType.LOGICAL
            }
            return requireLogical(type)
        }

        private fun parseLogicalAndExpression(): ExprType {
            var type = parseBasicExpression()
            while (true) {
                skipWhitespace()
                if (!consume("&&")) break
                skipWhitespace()
                requireLogical(type)
                requireLogical(parseBasicExpression())
                type = ExprType.LOGICAL
            }
            return type
        }

        private fun parseBasicExpression(): ExprType {
            val start = offset
            if (consume("!")) {
                skipWhitespace()
                val operand =
                    if (consume("(")) {
                        skipWhitespace()
                        val inner = parseLogicalExpression()
                        skipWhitespace()
                        expect(')', "expected ')' after logical expression")
                        inner
                    } else {
                        parseTestPrimary()
                    }
                requireLogical(operand)
                return ExprType.LOGICAL
            }
            if (consume("(")) {
                skipWhitespace()
                val inner = parseLogicalExpression()
                skipWhitespace()
                expect(')', "expected ')' after logical expression")
                return inner
            }

            val left = parsePrimary()
            skipWhitespace()
            if (consumeComparisonOperator()) {
                requireComparable(left, start)
                skipWhitespace()
                val rightStart = offset
                val right = parseComparablePrimary()
                requireComparable(right, rightStart)
                return ExprType.LOGICAL
            }
            return when (left) {
                ExprType.LOGICAL, ExprType.NODES -> ExprType.LOGICAL
                ExprType.SINGULAR_QUERY -> ExprType.LOGICAL
                ExprType.VALUE -> fail("literal or ValueType function result must be compared", start)
            }
        }

        private fun parseTestPrimary(): ExprType {
            val start = offset
            return when (val type = parsePrimary()) {
                ExprType.LOGICAL, ExprType.NODES, ExprType.SINGULAR_QUERY -> ExprType.LOGICAL
                ExprType.VALUE -> fail("ValueType expression cannot be used as a test", start)
            }
        }

        private fun parseComparablePrimary(): ExprType {
            val start = offset
            val type = parsePrimary()
            if (type == ExprType.LOGICAL || type == ExprType.NODES) {
                fail("comparison operands must be literals, singular queries, or ValueType functions", start)
            }
            return type
        }

        private fun parsePrimary(): ExprType =
            when {
                peekOrNull() == '\'' || peekOrNull() == '"' -> {
                    parseStringLiteral()
                    ExprType.VALUE
                }

                startsLiteral("true") -> {
                    consumeKeyword("true")
                    ExprType.VALUE
                }

                startsLiteral("false") -> {
                    consumeKeyword("false")
                    ExprType.VALUE
                }

                startsLiteral("null") -> {
                    consumeKeyword("null")
                    ExprType.VALUE
                }

                isNumberStart() -> {
                    parseNumber()
                    ExprType.VALUE
                }

                peekOrNull() == '$' || peekOrNull() == '@' -> {
                    parseFilterQuery()
                }

                isLowerAlpha(peekOrNull()) -> {
                    parseFunctionExpression()
                }

                else -> {
                    fail("expected query, literal, or function expression")
                }
            }

        private fun parseFilterQuery(): ExprType {
            offset++
            var singular = true
            while (true) {
                val beforeWhitespace = offset
                skipWhitespace()
                when {
                    consume("..") -> {
                        singular = false
                        parseDescendantSegment()
                    }

                    consume(".") -> {
                        if (consume("*")) singular = false else parseMemberNameShorthand()
                    }

                    peekOrNull() == '[' -> {
                        val selectorCount = parseFilterBracketedSegment()
                        if (selectorCount != 1) singular = false
                    }

                    else -> {
                        if (offset != beforeWhitespace) offset = beforeWhitespace
                        break
                    }
                }
            }
            return if (singular) ExprType.SINGULAR_QUERY else ExprType.NODES
        }

        private fun parseFilterBracketedSegment(): Int {
            expect('[', "expected '['")
            skipWhitespace()
            if (peekOrNull() == ']') fail("bracketed selection must contain at least one selector")
            var count = 0
            var allSingular = true
            do {
                if (count > 0) {
                    expect(',', "expected ',' between selectors")
                    skipWhitespace()
                }
                count++
                allSingular = parseSelector() && allSingular
                skipWhitespace()
            } while (peekOrNull() == ',')
            expect(']', "expected ']' after selector")
            return if (allSingular) count else -count
        }

        private fun parseFunctionExpression(): ExprType {
            val nameStart = offset
            val name = parseFunctionName()
            val signature =
                FUNCTION_SIGNATURES[name]
                    ?: fail("unknown RFC 9535 function '$name'", nameStart)
            expect('(', "expected '(' after function name")
            skipWhitespace()
            val arguments = mutableListOf<ExprType>()
            if (peekOrNull() != ')') {
                while (true) {
                    arguments += parseFunctionArgument()
                    skipWhitespace()
                    if (!consume(",")) break
                    skipWhitespace()
                }
            }
            expect(')', "expected ')' after function arguments")
            if (arguments.size != signature.arguments.size) {
                fail(
                    "function '$name' requires ${signature.arguments.size} argument(s), found ${arguments.size}",
                    nameStart,
                )
            }
            arguments.zip(signature.arguments).forEachIndexed { index, (actual, expected) ->
                if (!actual.canConvertTo(expected)) {
                    fail("function '$name' argument ${index + 1} must be ${expected.label}", nameStart)
                }
            }
            return signature.result
        }

        private fun parseFunctionArgument(): ExprType {
            val start = offset
            if (consume("!")) {
                skipWhitespace()
                return requireLogical(parseTestPrimary())
            }
            if (consume("(")) {
                skipWhitespace()
                val type = parseLogicalExpression()
                skipWhitespace()
                expect(')', "expected ')' after function argument")
                return type
            }
            val left = parsePrimary()
            skipWhitespace()
            if (consumeComparisonOperator()) {
                requireComparable(left, start)
                skipWhitespace()
                val rightStart = offset
                requireComparable(parseComparablePrimary(), rightStart)
                return ExprType.LOGICAL
            }
            return left
        }

        private fun parseFunctionName(): String {
            if (!isLowerAlpha(peekOrNull())) fail("function names must start with a lowercase ASCII letter")
            val start = offset++
            while (!atEnd()) {
                val char = peek()
                if (!isLowerAlpha(char) && char != '_' && !char.isDigit()) break
                offset++
            }
            return input.substring(start, offset)
        }

        private fun parseMemberNameShorthand() {
            if (!isNameFirst(peekCodePoint())) fail("invalid member-name shorthand")
            advanceCodePoint()
            while (!atEnd() && isNameChar(peekCodePoint())) advanceCodePoint()
        }

        private fun parseStringLiteral() {
            val quote = peek()
            offset++
            while (!atEnd()) {
                val codePoint = peekCodePoint()
                if (codePoint == quote.code) {
                    offset++
                    return
                }
                if (codePoint < 0x20) fail("unescaped control character in string literal")
                if (codePoint in 0xD800..0xDFFF) fail("unpaired surrogate in string literal")
                if (codePoint == '\\'.code) {
                    parseEscape(quote)
                } else {
                    advanceCodePoint()
                }
            }
            fail("unterminated string literal")
        }

        private fun parseEscape(quote: Char) {
            expect('\\', "expected escape")
            if (atEnd()) fail("incomplete escape sequence")
            val escaped = peek()
            when {
                escaped == quote -> offset++
                escaped in "bfnrt/\\" -> offset++
                escaped == 'u' -> parseUnicodeEscape()
                else -> fail("invalid escape sequence")
            }
        }

        private fun parseUnicodeEscape() {
            expect('u', "expected unicode escape")
            val first = parseHexQuad()
            when (first) {
                in 0xD800..0xDBFF -> {
                    expect('\\', "high surrogate must be followed by an escaped low surrogate")
                    expect('u', "high surrogate must be followed by an escaped low surrogate")
                    val second = parseHexQuad()
                    if (second !in 0xDC00..0xDFFF) fail("high surrogate must be followed by a low surrogate")
                }

                in 0xDC00..0xDFFF -> {
                    fail("low surrogate must follow a high surrogate")
                }
            }
        }

        private fun parseHexQuad(): Int {
            if (offset + 4 > input.length) fail("unicode escape requires four hexadecimal digits")
            val text = input.substring(offset, offset + 4)
            if (!text.all { it.isDigit() || it in 'a'..'f' || it in 'A'..'F' }) {
                fail("unicode escape requires four hexadecimal digits")
            }
            offset += 4
            return text.toInt(16)
        }

        private fun parseInteger(allowNegativeZero: Boolean): Long {
            val start = offset
            val negative = consume("-")
            if (atEnd() || !peek().isDigit()) fail("integer requires a digit", start)
            if (peek() == '0') {
                offset++
                if (!allowNegativeZero && negative) fail("-0 is not a valid index", start)
                if (!atEnd() && peek().isDigit()) fail("leading zeros are not permitted", start)
            } else {
                while (!atEnd() && peek().isDigit()) offset++
            }
            val text = input.substring(start, offset)
            val value = text.toLongOrNull() ?: fail("integer is outside the RFC 9535 exact-value range", start)
            if (value !in MIN_EXACT_INTEGER..MAX_EXACT_INTEGER) {
                fail("integer is outside the RFC 9535 exact-value range", start)
            }
            return value
        }

        private fun parseNumber() {
            val start = offset
            consume("-")
            if (atEnd() || !peek().isDigit()) fail("number requires an integer part", start)
            if (peek() == '0') {
                offset++
                if (!atEnd() && peek().isDigit()) fail("leading zeros are not permitted", start)
            } else {
                while (!atEnd() && peek().isDigit()) offset++
            }
            if (consume(".")) {
                if (atEnd() || !peek().isDigit()) fail("fraction requires at least one digit")
                while (!atEnd() && peek().isDigit()) offset++
            }
            if (!atEnd() && (peek() == 'e' || peek() == 'E')) {
                offset++
                if (!atEnd() && (peek() == '+' || peek() == '-')) offset++
                if (atEnd() || !peek().isDigit()) fail("exponent requires at least one digit")
                while (!atEnd() && peek().isDigit()) offset++
            }
            input.substring(start, offset).toDoubleOrNull() ?: fail("invalid number", start)
        }

        private fun consumeComparisonOperator(): Boolean =
            consume("==") || consume("!=") || consume("<=") || consume(">=") || consume("<") || consume(">")

        private fun requireComparable(
            type: ExprType,
            position: Int = offset,
        ): ExprType =
            when (type) {
                ExprType.VALUE, ExprType.SINGULAR_QUERY -> ExprType.VALUE
                ExprType.LOGICAL -> fail("LogicalType function result cannot be compared", position)
                ExprType.NODES -> fail("non-singular query cannot be compared", position)
            }

        private fun requireLogical(type: ExprType): ExprType =
            when (type) {
                ExprType.LOGICAL, ExprType.NODES, ExprType.SINGULAR_QUERY -> ExprType.LOGICAL
                ExprType.VALUE -> fail("ValueType expression must be compared")
            }

        private fun startsLiteral(value: String): Boolean =
            input.startsWith(value, offset) &&
                (offset + value.length == input.length || !isFunctionNameChar(input[offset + value.length]))

        private fun consumeKeyword(value: String) {
            if (!startsLiteral(value)) fail("expected '$value'")
            offset += value.length
        }

        private fun isNumberStart(): Boolean = peekOrNull()?.let { it == '-' || it.isDigit() } == true

        private fun skipWhitespace() {
            while (!atEnd() && peek() in RFC_WHITESPACE) offset++
        }

        private fun consume(value: String): Boolean {
            if (!input.startsWith(value, offset)) return false
            offset += value.length
            return true
        }

        private fun expect(
            value: Char,
            message: String,
        ) {
            if (atEnd() || peek() != value) fail(message)
            offset++
        }

        private fun peek(): Char = input[offset]

        private fun peekOrNull(): Char? = input.getOrNull(offset)

        private fun peekCodePoint(): Int = if (atEnd()) -1 else input.codePointAt(offset)

        private fun advanceCodePoint() {
            offset += Character.charCount(peekCodePoint())
        }

        private fun atEnd(): Boolean = offset >= input.length

        private fun fail(
            message: String,
            at: Int = offset,
        ): Nothing = throw ParseFailure(at, message)
    }

    private enum class ExprType(
        val label: String,
    ) {
        VALUE("ValueType"),
        LOGICAL("LogicalType"),
        NODES("NodesType"),
        SINGULAR_QUERY("a singular query"),
        ;

        fun canConvertTo(expected: ExprType): Boolean =
            when (expected) {
                VALUE -> this == VALUE || this == SINGULAR_QUERY
                LOGICAL -> this == LOGICAL
                NODES -> this == NODES || this == SINGULAR_QUERY
                SINGULAR_QUERY -> this == SINGULAR_QUERY
            }
    }

    private data class FunctionSignature(
        val arguments: List<ExprType>,
        val result: ExprType,
    )

    private class ParseFailure(
        val offset: Int,
        message: String,
    ) : RuntimeException(message)

    private const val MAX_EXACT_INTEGER = 9_007_199_254_740_991L
    private const val MIN_EXACT_INTEGER = -MAX_EXACT_INTEGER
    private val RFC_WHITESPACE = setOf(' ', '\t', '\n', '\r')
    private val FUNCTION_SIGNATURES =
        mapOf(
            "length" to FunctionSignature(listOf(ExprType.VALUE), ExprType.VALUE),
            "count" to FunctionSignature(listOf(ExprType.NODES), ExprType.VALUE),
            "match" to FunctionSignature(listOf(ExprType.VALUE, ExprType.VALUE), ExprType.LOGICAL),
            "search" to FunctionSignature(listOf(ExprType.VALUE, ExprType.VALUE), ExprType.LOGICAL),
            "value" to FunctionSignature(listOf(ExprType.NODES), ExprType.VALUE),
        )

    private fun isLowerAlpha(char: Char?): Boolean = char != null && char in 'a'..'z'

    private fun isFunctionNameChar(char: Char): Boolean = char in 'a'..'z' || char == '_' || char.isDigit()

    private fun isNameFirst(codePoint: Int): Boolean =
        codePoint == '_'.code || codePoint in 'A'.code..'Z'.code || codePoint in 'a'.code..'z'.code ||
            codePoint in 0x80..0xD7FF || codePoint in 0xE000..0x10FFFF

    private fun isNameChar(codePoint: Int): Boolean = isNameFirst(codePoint) || codePoint in '0'.code..'9'.code
}

internal object JsonPathEvaluationLimits {
    const val MAX_SELECTOR_LENGTH = 16_384
    const val MAX_REGEX_PATTERN_LENGTH = 4_096
    const val MAX_REGEX_CANDIDATE_LENGTH = 65_536
    const val MAX_VISITED_NODES = 1_024
}
