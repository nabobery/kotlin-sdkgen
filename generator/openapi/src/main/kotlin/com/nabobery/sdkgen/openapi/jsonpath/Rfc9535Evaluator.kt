package com.nabobery.sdkgen.openapi.jsonpath

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.BooleanNode
import com.fasterxml.jackson.databind.node.DecimalNode
import com.fasterxml.jackson.databind.node.NullNode
import com.fasterxml.jackson.databind.node.TextNode
import com.nabobery.sdkgen.openapi.overlays.JsonPathSource
import com.nabobery.sdkgen.openapi.overlays.JsonPathValidationException
import com.nabobery.sdkgen.openapi.overlays.JsonPointerSupport
import java.math.BigDecimal
import java.util.ArrayDeque
import java.util.regex.Pattern
import java.util.regex.PatternSyntaxException

public data class JsonPathMatch(
    public val value: JsonNode,
    public val normalizedPath: String,
    public val pointer: String,
)

public object Rfc9535Evaluator {
    public fun select(
        document: JsonNode,
        expression: String,
        source: JsonPathSource = JsonPathSource("unknown", null, "target"),
    ): List<JsonPathMatch> {
        Rfc9535GrammarValidator.validate(expression, source)
        val query =
            try {
                AstParser(expression).parse()
            } catch (failure: AstParseFailure) {
                throw JsonPathValidationException(
                    expression,
                    source,
                    failure.offset,
                    failure.message ?: "invalid syntax",
                )
            }
        val root = NodeRef(document, emptyList())
        try {
            validateStaticRegexes(query)
            return Evaluator(root).evaluate(query, root).map { selected ->
                JsonPathMatch(selected.value, normalizedPath(selected.path), pointer(selected.path))
            }
        } catch (failure: JsonPathBudgetExceeded) {
            throw JsonPathValidationException(expression, source, 0, failure.message.orEmpty(), failure)
        }
    }

    private fun validateStaticRegexes(query: Query) {
        query.segments.forEach { segment ->
            segment.selectors.filterIsInstance<Selector.Filter>().forEach { filter ->
                validateStaticRegexes(filter.expression)
            }
        }
    }

    private fun validateStaticRegexes(expression: LogicalExpr) {
        when (expression) {
            is LogicalExpr.Or -> {
                validateStaticRegexes(expression.left)
                validateStaticRegexes(expression.right)
            }

            is LogicalExpr.And -> {
                validateStaticRegexes(expression.left)
                validateStaticRegexes(expression.right)
            }

            is LogicalExpr.Not -> {
                validateStaticRegexes(expression.operand)
            }

            is LogicalExpr.Exists -> {
                validateStaticRegexes(expression.query)
            }

            is LogicalExpr.Comparison -> {
                validateStaticRegexes(expression.left)
                validateStaticRegexes(expression.right)
            }

            is LogicalExpr.Function -> {
                expression.arguments.forEach(::validateStaticRegexes)
                if (expression.name in setOf("match", "search")) {
                    val pattern = expression.arguments.getOrNull(1) as? ValueExpr.Literal
                    if (pattern?.value?.isTextual == true) IRegexp.compile(pattern.value.asText())
                }
            }
        }
    }

    private fun validateStaticRegexes(expression: ComparableExpr) {
        when (expression) {
            is ComparableExpr.Literal -> Unit
            is ComparableExpr.QueryValue -> validateStaticRegexes(expression.query)
            is ComparableExpr.FunctionValue -> expression.arguments.forEach(::validateStaticRegexes)
        }
    }

    private fun validateStaticRegexes(expression: ValueExpr) {
        when (expression) {
            is ValueExpr.Literal -> Unit
            is ValueExpr.QueryValue -> validateStaticRegexes(expression.query)
            is ValueExpr.FunctionValue -> validateStaticRegexes(expression.function)
        }
    }

    private fun normalizedPath(path: List<PathToken>): String =
        buildString {
            append('$')
            path.forEach { token ->
                when (token) {
                    is PathToken.Index -> append('[').append(token.value).append(']')
                    is PathToken.Name -> append("['").append(escapeNormalizedName(token.value)).append("']")
                }
            }
        }

    private fun pointer(path: List<PathToken>): String =
        buildString {
            path.forEach { token ->
                append('/')
                append(
                    when (token) {
                        is PathToken.Index -> token.value.toString()
                        is PathToken.Name -> JsonPointerSupport.escape(token.value)
                    },
                )
            }
        }

    private fun escapeNormalizedName(value: String): String =
        buildString {
            value.forEach { char ->
                append(
                    when (char) {
                        '\b' -> "\\b"
                        '' -> "\\f"
                        '\n' -> "\\n"
                        '\r' -> "\\r"
                        '\t' -> "\\t"
                        '\'' -> "\\'"
                        '\\' -> "\\\\"
                        else -> char.toString()
                    },
                )
            }
        }
}

private class Evaluator(
    private val root: NodeRef,
) {
    private var visitedNodeCount = 0

    fun evaluate(
        query: Query,
        current: NodeRef,
    ): List<NodeRef> {
        var nodes = listOf(if (query.root == QueryRoot.ROOT) root else current)
        query.segments.forEach { segment ->
            nodes =
                if (segment.descendant) {
                    nodes.flatMap { node ->
                        descendantsOrSelf(node).flatMap { descendant ->
                            applySelectors(descendant, segment.selectors)
                        }
                    }
                } else {
                    nodes.flatMap { node -> applySelectors(node, segment.selectors) }
                }
        }
        return nodes
    }

    private fun applySelectors(
        node: NodeRef,
        selectors: List<Selector>,
    ): List<NodeRef> = selectors.flatMap { selector -> applySelector(node, selector) }

    private fun applySelector(
        node: NodeRef,
        selector: Selector,
    ): List<NodeRef> =
        when (selector) {
            is Selector.Name -> selectName(node, selector.value)
            Selector.Wildcard -> children(node)
            is Selector.Index -> selectIndex(node, selector.value)
            is Selector.Slice -> selectSlice(node, selector)
            is Selector.Filter -> children(node).filter { candidate -> logical(selector.expression, candidate) }
        }

    private fun selectName(
        node: NodeRef,
        name: String,
    ): List<NodeRef> {
        if (!node.value.isObject) return emptyList()
        val value = node.value.get(name) ?: return emptyList()
        return listOf(visited(NodeRef(value, node.path + PathToken.Name(name))))
    }

    private fun selectIndex(
        node: NodeRef,
        index: Long,
    ): List<NodeRef> {
        if (!node.value.isArray) return emptyList()
        val size = node.value.size().toLong()
        val normalized = if (index >= 0) index else size + index
        if (normalized !in 0 until size) return emptyList()
        return listOf(
            visited(NodeRef(node.value.get(normalized.toInt()), node.path + PathToken.Index(normalized.toInt()))),
        )
    }

    private fun selectSlice(
        node: NodeRef,
        selector: Selector.Slice,
    ): List<NodeRef> {
        if (!node.value.isArray) return emptyList()
        val size = node.value.size().toLong()
        val step = selector.step ?: 1L
        if (step == 0L) return emptyList()
        val indexes = mutableListOf<Int>()
        if (step > 0L) {
            val start = normalizePositiveBound(selector.start, size, 0L)
            val end = normalizePositiveBound(selector.end, size, size)
            var index = start
            while (index < end) {
                indexes += index.toInt()
                if (Long.MAX_VALUE - step < index) break
                index += step
            }
        } else {
            val start = normalizeNegativeBound(selector.start, size, size - 1L, false)
            val end = normalizeNegativeBound(selector.end, size, -1L, selector.end == null)
            var index = start
            while (index > end) {
                if (index in 0 until size) indexes += index.toInt()
                if (Long.MIN_VALUE - step > index) break
                index += step
            }
        }
        return indexes.map { index -> visited(NodeRef(node.value.get(index), node.path + PathToken.Index(index))) }
    }

    private fun normalizePositiveBound(
        value: Long?,
        size: Long,
        default: Long,
    ): Long {
        if (value == null) return default
        val adjusted = if (value < 0) safeAdd(size, value) else value
        return adjusted.coerceIn(0L, size)
    }

    private fun normalizeNegativeBound(
        value: Long?,
        size: Long,
        default: Long,
        omittedEnd: Boolean,
    ): Long {
        if (value == null) return default
        if (omittedEnd) return -1L
        val adjusted = if (value < 0) safeAdd(size, value) else value
        return adjusted.coerceIn(-1L, size - 1L)
    }

    private fun safeAdd(
        left: Long,
        right: Long,
    ): Long =
        when {
            right > 0 && left > Long.MAX_VALUE - right -> Long.MAX_VALUE
            right < 0 && left < Long.MIN_VALUE - right -> Long.MIN_VALUE
            else -> left + right
        }

    private fun children(
        node: NodeRef,
        countVisitedNodes: Boolean = true,
    ): List<NodeRef> =
        buildList {
            fun addChild(
                value: JsonNode,
                token: PathToken,
            ) {
                val child = NodeRef(value, node.path + token)
                add(if (countVisitedNodes) visited(child) else child)
            }

            when {
                node.value.isArray -> {
                    node.value.forEachIndexed { index, value -> addChild(value, PathToken.Index(index)) }
                }

                node.value.isObject -> {
                    node.value.properties().forEach { (name, value) -> addChild(value, PathToken.Name(name)) }
                }
            }
        }

    private fun descendantsOrSelf(node: NodeRef): List<NodeRef> {
        val descendants = mutableListOf<NodeRef>()
        val pending = ArrayDeque<NodeRef>()
        pending.addLast(node)
        while (pending.isNotEmpty()) {
            val current = visited(pending.removeLast())
            descendants += current
            children(current, countVisitedNodes = false)
                .asReversed()
                .forEach(pending::addLast)
        }
        return descendants
    }

    private fun visited(node: NodeRef): NodeRef {
        visitedNodeCount++
        if (visitedNodeCount > JsonPathEvaluationLimits.MAX_VISITED_NODES) {
            throw JsonPathBudgetExceeded(
                "SDKGEN-JSONPATH-BUDGET: visited-node count exceeds ${JsonPathEvaluationLimits.MAX_VISITED_NODES}",
            )
        }
        return node
    }

    private fun logical(
        expression: LogicalExpr,
        current: NodeRef,
    ): Boolean =
        when (expression) {
            is LogicalExpr.Or -> {
                logical(expression.left, current) || logical(expression.right, current)
            }

            is LogicalExpr.And -> {
                logical(expression.left, current) && logical(expression.right, current)
            }

            is LogicalExpr.Not -> {
                !logical(expression.operand, current)
            }

            is LogicalExpr.Exists -> {
                evaluate(expression.query, current).isNotEmpty()
            }

            is LogicalExpr.Comparison -> {
                compare(
                    comparable(expression.left, current),
                    comparable(expression.right, current),
                    expression.operator,
                )
            }

            is LogicalExpr.Function -> {
                logicalFunction(expression, current)
            }
        }

    private fun logicalFunction(
        function: LogicalExpr.Function,
        current: NodeRef,
    ): Boolean {
        val first = value(function.arguments[0], current)
        val second = value(function.arguments[1], current)
        if (
            first !is ResultValue.Json ||
            second !is ResultValue.Json ||
            !first.node.isTextual ||
            !second.node.isTextual
        ) {
            return false
        }
        val pattern = IRegexp.compile(second.node.asText()) ?: return false
        val candidate = first.node.asText()
        if (candidate.length > JsonPathEvaluationLimits.MAX_REGEX_CANDIDATE_LENGTH) {
            throw JsonPathBudgetExceeded(
                "SDKGEN-JSONPATH-BUDGET: regex candidate length exceeds ${JsonPathEvaluationLimits.MAX_REGEX_CANDIDATE_LENGTH} characters",
            )
        }
        return when (function.name) {
            "match" -> pattern.matcher(candidate).matches()
            "search" -> pattern.matcher(candidate).find()
            else -> false
        }
    }

    private fun comparable(
        expression: ComparableExpr,
        current: NodeRef,
    ): ResultValue =
        when (expression) {
            is ComparableExpr.Literal -> ResultValue.Json(expression.value)
            is ComparableExpr.QueryValue -> nodesToValue(evaluate(expression.query, current))
            is ComparableExpr.FunctionValue -> valueFunction(expression, current)
        }

    private fun value(
        expression: ValueExpr,
        current: NodeRef,
    ): ResultValue =
        when (expression) {
            is ValueExpr.Literal -> ResultValue.Json(expression.value)
            is ValueExpr.QueryValue -> nodesToValue(evaluate(expression.query, current))
            is ValueExpr.FunctionValue -> valueFunction(expression.function, current)
        }

    private fun valueFunction(
        function: ComparableExpr.FunctionValue,
        current: NodeRef,
    ): ResultValue =
        when (function.name) {
            "length" -> {
                val argument = value(function.arguments.single(), current)
                if (argument !is ResultValue.Json) {
                    ResultValue.Nothing
                } else {
                    val length =
                        when {
                            argument.node.isTextual -> {
                                argument.node.asText().codePointCount(0, argument.node.asText().length)
                            }

                            argument.node.isArray || argument.node.isObject -> {
                                argument.node.size()
                            }

                            else -> {
                                return ResultValue.Nothing
                            }
                        }
                    ResultValue.Json(DecimalNode(BigDecimal(length)))
                }
            }

            "count" -> {
                ResultValue.Json(DecimalNode(BigDecimal(nodes(function.arguments.single(), current).size)))
            }

            "value" -> {
                nodesToValue(nodes(function.arguments.single(), current))
            }

            else -> {
                ResultValue.Nothing
            }
        }

    private fun nodes(
        expression: ValueExpr,
        current: NodeRef,
    ): List<NodeRef> =
        when (expression) {
            is ValueExpr.QueryValue -> evaluate(expression.query, current)
            else -> emptyList()
        }

    private fun nodesToValue(nodes: List<NodeRef>): ResultValue =
        if (nodes.size == 1) ResultValue.Json(nodes.single().value) else ResultValue.Nothing

    private fun compare(
        left: ResultValue,
        right: ResultValue,
        operator: ComparisonOperator,
    ): Boolean =
        when (operator) {
            ComparisonOperator.EQUAL -> {
                equal(left, right)
            }

            ComparisonOperator.NOT_EQUAL -> {
                !equal(left, right)
            }

            ComparisonOperator.LESS_THAN -> {
                orderedCompare(left, right)?.let { it < 0 } ?: false
            }

            ComparisonOperator.LESS_OR_EQUAL -> {
                equal(left, right) || (orderedCompare(left, right)?.let { it < 0 } ?: false)
            }

            ComparisonOperator.GREATER_THAN -> {
                orderedCompare(left, right)?.let { it > 0 } ?: false
            }

            ComparisonOperator.GREATER_OR_EQUAL -> {
                equal(left, right) || (orderedCompare(left, right)?.let { it > 0 } ?: false)
            }
        }

    private fun equal(
        left: ResultValue,
        right: ResultValue,
    ): Boolean {
        if (left === ResultValue.Nothing || right === ResultValue.Nothing) return left === right
        left as ResultValue.Json
        right as ResultValue.Json
        return if (left.node.isNumber && right.node.isNumber) {
            left.node.decimalValue().compareTo(right.node.decimalValue()) == 0
        } else {
            left.node == right.node
        }
    }

    private fun orderedCompare(
        left: ResultValue,
        right: ResultValue,
    ): Int? {
        if (left !is ResultValue.Json || right !is ResultValue.Json) return null
        return when {
            left.node.isNumber && right.node.isNumber -> {
                left.node.decimalValue().compareTo(right.node.decimalValue())
            }

            left.node.isTextual && right.node.isTextual -> {
                left.node.asText().compareTo(right.node.asText())
            }

            else -> {
                null
            }
        }
    }
}

private object IRegexp {
    fun compile(expression: String): Pattern? {
        if (expression.length > JsonPathEvaluationLimits.MAX_REGEX_PATTERN_LENGTH) {
            throw JsonPathBudgetExceeded(
                "SDKGEN-JSONPATH-BUDGET: regex pattern length exceeds ${JsonPathEvaluationLimits.MAX_REGEX_PATTERN_LENGTH} characters",
            )
        }
        if (hasNestedQuantifierOverGroup(expression)) {
            throw JsonPathBudgetExceeded(
                "SDKGEN-JSONPATH-BUDGET: regex contains a quantified group with an inner quantifier",
            )
        }
        val javaExpression = mapToJava(expression) ?: return null
        return try {
            Pattern.compile(javaExpression, Pattern.UNICODE_CHARACTER_CLASS)
        } catch (_: PatternSyntaxException) {
            null
        }
    }

    private fun hasNestedQuantifierOverGroup(expression: String): Boolean {
        val groups = ArrayDeque<Boolean>()
        var escaped = false
        var inCharacterClass = false
        expression.forEachIndexed { index, char ->
            when {
                escaped -> {
                    escaped = false
                }

                char == '\\' -> {
                    escaped = true
                }

                inCharacterClass && char == ']' -> {
                    inCharacterClass = false
                }

                !inCharacterClass && char == '[' -> {
                    inCharacterClass = true
                }

                !inCharacterClass && char == '(' -> {
                    groups.addLast(false)
                }

                !inCharacterClass && char == ')' -> {
                    if (groups.isEmpty()) return false
                    val containsQuantifier = groups.removeLast()
                    if (containsQuantifier && isQuantifierAt(expression, index + 1)) return true
                    if (containsQuantifier && groups.isNotEmpty()) {
                        groups.removeLast()
                        groups.addLast(true)
                    }
                }

                !inCharacterClass && isQuantifierAt(expression, index) && groups.isNotEmpty() -> {
                    groups.removeLast().also { groups.addLast(true) }
                }
            }
        }
        return false
    }

    private fun isQuantifierAt(
        expression: String,
        index: Int,
    ): Boolean =
        expression.getOrNull(index) in setOf('*', '+', '?') ||
            (expression.getOrNull(index) == '{' && expression.getOrNull(index + 1)?.isDigit() == true)

    private fun mapToJava(expression: String): String? {
        val mapped = StringBuilder()
        var escaped = false
        var inCharacterClass = false
        var index = 0
        while (index < expression.length) {
            val char = expression[index]
            when {
                escaped -> {
                    if (char.isDigit() || char == 'k' || char == 'Q' || char == 'E') return null
                    mapped.append('\\').append(char)
                    escaped = false
                }

                char == '\\' -> {
                    escaped = true
                }

                char == '[' -> {
                    inCharacterClass = true
                    mapped.append(char)
                }

                char == ']' -> {
                    inCharacterClass = false
                    mapped.append(char)
                }

                char == '(' && expression.getOrNull(index + 1) == '?' -> {
                    return null
                }

                char == '.' && !inCharacterClass -> {
                    mapped.append("[^\\r\\n]")
                }

                else -> {
                    mapped.append(char)
                }
            }
            index++
        }
        return mapped.toString().takeUnless { escaped }
    }
}

private class JsonPathBudgetExceeded(
    message: String,
) : RuntimeException(message)

private data class NodeRef(
    val value: JsonNode,
    val path: List<PathToken>,
)

private sealed interface PathToken {
    data class Name(
        val value: String,
    ) : PathToken

    data class Index(
        val value: Int,
    ) : PathToken
}

private data class Query(
    val root: QueryRoot,
    val segments: List<Segment>,
)

private enum class QueryRoot { ROOT, CURRENT }

private data class Segment(
    val descendant: Boolean,
    val selectors: List<Selector>,
)

private sealed interface Selector {
    data class Name(
        val value: String,
    ) : Selector

    data object Wildcard : Selector

    data class Index(
        val value: Long,
    ) : Selector

    data class Slice(
        val start: Long?,
        val end: Long?,
        val step: Long?,
    ) : Selector

    data class Filter(
        val expression: LogicalExpr,
    ) : Selector
}

private sealed interface LogicalExpr {
    data class Or(
        val left: LogicalExpr,
        val right: LogicalExpr,
    ) : LogicalExpr

    data class And(
        val left: LogicalExpr,
        val right: LogicalExpr,
    ) : LogicalExpr

    data class Not(
        val operand: LogicalExpr,
    ) : LogicalExpr

    data class Exists(
        val query: Query,
    ) : LogicalExpr

    data class Comparison(
        val left: ComparableExpr,
        val operator: ComparisonOperator,
        val right: ComparableExpr,
    ) : LogicalExpr

    data class Function(
        val name: String,
        val arguments: List<ValueExpr>,
    ) : LogicalExpr
}

private sealed interface ComparableExpr {
    data class Literal(
        val value: JsonNode,
    ) : ComparableExpr

    data class QueryValue(
        val query: Query,
    ) : ComparableExpr

    data class FunctionValue(
        val name: String,
        val arguments: List<ValueExpr>,
    ) : ComparableExpr
}

private sealed interface ValueExpr {
    data class Literal(
        val value: JsonNode,
    ) : ValueExpr

    data class QueryValue(
        val query: Query,
    ) : ValueExpr

    data class FunctionValue(
        val function: ComparableExpr.FunctionValue,
    ) : ValueExpr
}

private sealed interface ResultValue {
    data class Json(
        val node: JsonNode,
    ) : ResultValue

    data object Nothing : ResultValue
}

private enum class ComparisonOperator {
    EQUAL,
    NOT_EQUAL,
    LESS_THAN,
    LESS_OR_EQUAL,
    GREATER_THAN,
    GREATER_OR_EQUAL,
}

private class AstParser(
    private val input: String,
) {
    private var offset: Int = 0

    fun parse(): Query {
        val query = parseQuery()
        skipWhitespace()
        if (!atEnd()) fail("unexpected trailing input")
        return query
    }

    private fun parseQuery(): Query {
        val root =
            when {
                consume("$") -> QueryRoot.ROOT
                consume("@") -> QueryRoot.CURRENT
                else -> fail("expected root or current-node identifier")
            }
        val segments = mutableListOf<Segment>()
        while (true) {
            skipWhitespace()
            when {
                consume("..") -> segments += parseSegment(descendant = true)
                consume(".") -> segments += parseDotSegment(descendant = false)
                peekOrNull() == '[' -> segments += parseBracketSegment(descendant = false)
                else -> break
            }
        }
        return Query(root, segments)
    }

    private fun parseSegment(descendant: Boolean): Segment =
        when {
            peekOrNull() == '[' -> parseBracketSegment(descendant)
            consume("*") -> Segment(descendant, listOf(Selector.Wildcard))
            else -> Segment(descendant, listOf(Selector.Name(parseNameShorthand())))
        }

    private fun parseDotSegment(descendant: Boolean): Segment =
        when {
            consume("*") -> Segment(descendant, listOf(Selector.Wildcard))
            else -> Segment(descendant, listOf(Selector.Name(parseNameShorthand())))
        }

    private fun parseBracketSegment(descendant: Boolean): Segment {
        expect('[')
        skipWhitespace()
        val selectors = mutableListOf<Selector>()
        do {
            if (selectors.isNotEmpty()) {
                expect(',')
                skipWhitespace()
            }
            selectors += parseSelector()
            skipWhitespace()
        } while (peekOrNull() == ',')
        expect(']')
        return Segment(descendant, selectors)
    }

    private fun parseSelector(): Selector =
        when (peekOrNull()) {
            '\'', '"' -> {
                Selector.Name(parseString())
            }

            '*' -> {
                offset++
                Selector.Wildcard
            }

            '?' -> {
                offset++
                skipWhitespace()
                Selector.Filter(parseLogicalOr())
            }

            ':', '-', in '0'..'9' -> {
                parseIndexOrSlice()
            }

            else -> {
                fail("expected selector")
            }
        }

    private fun parseIndexOrSlice(): Selector {
        val start = if (peekOrNull() == ':') null else parseInteger()
        skipWhitespace()
        if (!consume(":")) return Selector.Index(checkNotNull(start))
        skipWhitespace()
        val end = if (peekOrNull() in setOf(':', ']', ',')) null else parseInteger()
        skipWhitespace()
        val step =
            if (consume(":")) {
                skipWhitespace()
                if (peekOrNull() in setOf(']', ',')) null else parseInteger()
            } else {
                null
            }
        return Selector.Slice(start, end, step)
    }

    private fun parseLogicalOr(): LogicalExpr {
        var expression = parseLogicalAnd()
        while (true) {
            skipWhitespace()
            if (!consume("||")) return expression
            skipWhitespace()
            expression = LogicalExpr.Or(expression, parseLogicalAnd())
        }
    }

    private fun parseLogicalAnd(): LogicalExpr {
        var expression = parseBasicExpression()
        while (true) {
            skipWhitespace()
            if (!consume("&&")) return expression
            skipWhitespace()
            expression = LogicalExpr.And(expression, parseBasicExpression())
        }
    }

    private fun parseBasicExpression(): LogicalExpr {
        if (consume("!")) {
            skipWhitespace()
            return LogicalExpr.Not(if (consume("(")) parseParenthesized() else parseTestExpression())
        }
        if (consume("(")) return parseParenthesized()
        return parseTestExpression()
    }

    private fun parseParenthesized(): LogicalExpr {
        skipWhitespace()
        val expression = parseLogicalOr()
        skipWhitespace()
        expect(')')
        return expression
    }

    private fun parseTestExpression(): LogicalExpr {
        val primary = parsePrimary()
        skipWhitespace()
        val operator = parseComparisonOperator()
        if (operator != null) {
            skipWhitespace()
            return LogicalExpr.Comparison(primary.asComparable(), operator, parsePrimary().asComparable())
        }
        return when (primary) {
            is ParsedPrimary.QueryPrimary -> LogicalExpr.Exists(primary.query)
            is ParsedPrimary.LogicalFunction -> LogicalExpr.Function(primary.name, primary.arguments)
            else -> fail("value expression must be compared")
        }
    }

    private fun parsePrimary(): ParsedPrimary =
        when {
            peekOrNull() == '\'' || peekOrNull() == '"' -> {
                ParsedPrimary.ValuePrimary(
                    ValueExpr.Literal(TextNode.valueOf(parseString())),
                )
            }

            startsKeyword("true") -> {
                offset += 4
                ParsedPrimary.ValuePrimary(ValueExpr.Literal(BooleanNode.TRUE))
            }

            startsKeyword("false") -> {
                offset += 5
                ParsedPrimary.ValuePrimary(ValueExpr.Literal(BooleanNode.FALSE))
            }

            startsKeyword("null") -> {
                offset += 4
                ParsedPrimary.ValuePrimary(ValueExpr.Literal(NullNode.instance))
            }

            peekOrNull() == '$' || peekOrNull() == '@' -> {
                ParsedPrimary.QueryPrimary(parseQuery())
            }

            peekOrNull()?.let { it == '-' || it.isDigit() } == true -> {
                ParsedPrimary.ValuePrimary(ValueExpr.Literal(DecimalNode(parseNumber())))
            }

            peekOrNull() in 'a'..'z' -> {
                parseFunction()
            }

            else -> {
                fail("expected primary expression")
            }
        }

    private fun parseFunction(): ParsedPrimary {
        val start = offset
        while (peekOrNull()?.let { it in 'a'..'z' || it == '_' || it.isDigit() } == true) offset++
        val name = input.substring(start, offset)
        expect('(')
        skipWhitespace()
        val arguments = mutableListOf<ValueExpr>()
        if (peekOrNull() != ')') {
            do {
                if (arguments.isNotEmpty()) {
                    expect(',')
                    skipWhitespace()
                }
                arguments += parseFunctionArgument()
                skipWhitespace()
            } while (peekOrNull() == ',')
        }
        expect(')')
        return when (name) {
            "match", "search" -> {
                ParsedPrimary.LogicalFunction(name, arguments)
            }

            else -> {
                ParsedPrimary.ValuePrimary(
                    ValueExpr.FunctionValue(ComparableExpr.FunctionValue(name, arguments)),
                )
            }
        }
    }

    private fun parseFunctionArgument(): ValueExpr {
        if (consume("!")) fail("logical arguments are not used by standard value functions")
        if (consume("(")) fail("logical arguments are not used by standard value functions")
        return when (val primary = parsePrimary()) {
            is ParsedPrimary.QueryPrimary -> ValueExpr.QueryValue(primary.query)
            is ParsedPrimary.ValuePrimary -> primary.expression
            is ParsedPrimary.LogicalFunction -> fail("logical function cannot be a value argument")
        }
    }

    private fun ParsedPrimary.asComparable(): ComparableExpr =
        when (this) {
            is ParsedPrimary.QueryPrimary -> {
                ComparableExpr.QueryValue(query)
            }

            is ParsedPrimary.ValuePrimary -> {
                when (val value = expression) {
                    is ValueExpr.Literal -> ComparableExpr.Literal(value.value)
                    is ValueExpr.QueryValue -> ComparableExpr.QueryValue(value.query)
                    is ValueExpr.FunctionValue -> value.function
                }
            }

            is ParsedPrimary.LogicalFunction -> {
                fail("logical function cannot be compared")
            }
        }

    private fun parseComparisonOperator(): ComparisonOperator? =
        when {
            consume("==") -> ComparisonOperator.EQUAL
            consume("!=") -> ComparisonOperator.NOT_EQUAL
            consume("<=") -> ComparisonOperator.LESS_OR_EQUAL
            consume(">=") -> ComparisonOperator.GREATER_OR_EQUAL
            consume("<") -> ComparisonOperator.LESS_THAN
            consume(">") -> ComparisonOperator.GREATER_THAN
            else -> null
        }

    private fun parseNameShorthand(): String {
        val start = offset
        advanceCodePoint()
        while (!atEnd() && isNameChar(peekCodePoint())) advanceCodePoint()
        return input.substring(start, offset)
    }

    private fun parseString(): String {
        val quote = input[offset++]
        val result = StringBuilder()
        while (peekOrNull() != quote) {
            val codePoint = peekCodePoint()
            if (codePoint != '\\'.code) {
                result.appendCodePoint(codePoint)
                advanceCodePoint()
                continue
            }
            offset++
            when (val escaped = input[offset++]) {
                quote -> {
                    result.append(quote)
                }

                '\\' -> {
                    result.append('\\')
                }

                '/' -> {
                    result.append('/')
                }

                'b' -> {
                    result.append('\b')
                }

                'f' -> {
                    result.append('')
                }

                'n' -> {
                    result.append('\n')
                }

                'r' -> {
                    result.append('\r')
                }

                't' -> {
                    result.append('\t')
                }

                'u' -> {
                    val first = parseHexQuad()
                    if (first in 0xD800..0xDBFF) {
                        offset += 2
                        val second = parseHexQuad()
                        result.appendCodePoint(Character.toCodePoint(first.toChar(), second.toChar()))
                    } else {
                        result.append(first.toChar())
                    }
                }

                else -> {
                    fail("invalid escape '$escaped'")
                }
            }
        }
        offset++
        return result.toString()
    }

    private fun parseHexQuad(): Int {
        val value = input.substring(offset, offset + 4).toInt(16)
        offset += 4
        return value
    }

    private fun parseInteger(): Long {
        val start = offset
        if (peekOrNull() == '-') offset++
        while (peekOrNull()?.isDigit() == true) offset++
        return input.substring(start, offset).toLong()
    }

    private fun parseNumber(): BigDecimal {
        val start = offset
        if (peekOrNull() == '-') offset++
        while (peekOrNull()?.isDigit() == true) offset++
        if (peekOrNull() == '.') {
            offset++
            while (peekOrNull()?.isDigit() == true) offset++
        }
        if (peekOrNull() == 'e' || peekOrNull() == 'E') {
            offset++
            if (peekOrNull() == '+' || peekOrNull() == '-') offset++
            while (peekOrNull()?.isDigit() == true) offset++
        }
        return input.substring(start, offset).toBigDecimal()
    }

    private fun startsKeyword(keyword: String): Boolean = input.startsWith(keyword, offset)

    private fun skipWhitespace() {
        while (peekOrNull() in RFC_WHITESPACE) offset++
    }

    private fun consume(value: String): Boolean {
        if (!input.startsWith(value, offset)) return false
        offset += value.length
        return true
    }

    private fun expect(value: Char) {
        if (peekOrNull() != value) fail("expected '$value'")
        offset++
    }

    private fun peekOrNull(): Char? = input.getOrNull(offset)

    private fun peekCodePoint(): Int = input.codePointAt(offset)

    private fun advanceCodePoint() {
        offset += Character.charCount(peekCodePoint())
    }

    private fun atEnd(): Boolean = offset >= input.length

    private fun fail(message: String): Nothing = throw AstParseFailure(offset, message)

    private sealed interface ParsedPrimary {
        data class QueryPrimary(
            val query: Query,
        ) : ParsedPrimary

        data class ValuePrimary(
            val expression: ValueExpr,
        ) : ParsedPrimary

        data class LogicalFunction(
            val name: String,
            val arguments: List<ValueExpr>,
        ) : ParsedPrimary
    }

    private companion object {
        val RFC_WHITESPACE: Set<Char> = setOf(' ', '\t', '\n', '\r')

        fun isNameFirst(codePoint: Int): Boolean =
            codePoint == '_'.code || codePoint in 'A'.code..'Z'.code || codePoint in 'a'.code..'z'.code ||
                codePoint in 0x80..0xD7FF || codePoint in 0xE000..0x10FFFF

        fun isNameChar(codePoint: Int): Boolean = isNameFirst(codePoint) || codePoint in '0'.code..'9'.code
    }
}

private class AstParseFailure(
    val offset: Int,
    message: String,
) : RuntimeException(message)
