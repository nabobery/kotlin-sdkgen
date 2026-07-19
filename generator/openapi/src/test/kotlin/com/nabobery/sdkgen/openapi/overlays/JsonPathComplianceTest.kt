package com.nabobery.sdkgen.openapi.overlays

import com.fasterxml.jackson.databind.JsonNode
import com.nabobery.sdkgen.openapi.jsonpath.Rfc9535Evaluator
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class JsonPathComplianceTest {
    @Test
    fun `passes the pinned RFC 9535 compliance suite`() {
        val ctsBytes = resourceBytes("/jsonpath-cts/cts.json")
        assertEquals(
            "07b65aae2dec4ea19455a33310fa0536203f280f001995d8c105d3ee12e31618",
            DocumentCodec.sha256(ctsBytes),
        )
        val tests = DocumentCodec.parseJson(ctsBytes).path("tests")
        val outcomes = tests.map(::runCase)
        writeMatrix(outcomes)

        val failures = outcomes.filter { it.status == "fail" }
        assertEquals(emptyList(), failures.map { "${it.name}: ${it.detail}" })
        assertEquals(703, outcomes.size)
        assertEquals(703, outcomes.count { it.status == "pass" })
        println("MEASURE jsonpath_cts_total=703 passed=703 failed=0")
    }

    @Test
    fun `deep descendant selection fails with a typed budget instead of overflowing the stack`() {
        var document: JsonNode = DocumentCodec.objectNode()
        repeat(100_000) {
            document = DocumentCodec.objectNode().set<JsonNode>("child", document)
        }

        val failure =
            assertFailsWith<JsonPathValidationException> {
                Rfc9535Evaluator.select(document, "$..*")
            }
        assertContains(failure.message.orEmpty(), "SDKGEN-JSONPATH-BUDGET")
    }

    private fun runCase(test: JsonNode): Outcome {
        val name = test.path("name").asText()
        val expression = test.path("selector").asText()
        val categories = categories(test)
        val invalid = test.path("invalid_selector").asBoolean(false)
        val source = JsonPathSource("jsonpath-cts", null, "selector", name)
        val document = test.get("document") ?: DocumentCodec.parseResource("null")
        val result = runCatching { Rfc9535Evaluator.select(document, expression, source) }

        if (invalid) {
            return if (result.isFailure) {
                Outcome(name, expression, categories, "invalid", "pass", null)
            } else {
                Outcome(name, expression, categories, "invalid", "fail", "Invalid selector was accepted")
            }
        }
        if (result.isFailure) {
            return Outcome(name, expression, categories, "valid", "fail", result.exceptionOrNull()?.message)
        }

        val actual = result.getOrThrow()
        val actualValues = actual.map { canonical(it.value) }
        val actualPaths = actual.map { it.normalizedPath }
        val expectedValues = expectedOptions(test, "result", "results") { node -> node.map(::canonical) }
        val expectedPaths =
            expectedOptions(test, "result_paths", "results_paths") { node -> node.map(JsonNode::asText) }
        val valueMatches = expectedValues.isEmpty() || actualValues in expectedValues
        val pathMatches = expectedPaths.isEmpty() || actualPaths in expectedPaths
        return if (valueMatches && pathMatches) {
            Outcome(name, expression, categories, "valid", "pass", null)
        } else {
            Outcome(
                name,
                expression,
                categories,
                "valid",
                "fail",
                "Expected values=$expectedValues paths=$expectedPaths but selected values=$actualValues paths=$actualPaths",
            )
        }
    }

    private fun <T> expectedOptions(
        test: JsonNode,
        singleField: String,
        multipleField: String,
        transform: (JsonNode) -> List<T>,
    ): List<List<T>> =
        when {
            test.has(singleField) -> listOf(transform(test.path(singleField)))
            test.has(multipleField) -> test.path(multipleField).map(transform)
            else -> emptyList()
        }

    private fun categories(test: JsonNode): List<String> {
        val result = linkedSetOf<String>()
        val name = test.path("name").asText()
        result +=
            when {
                name.startsWith("basic,") -> "basic"
                name.startsWith("filter,") -> "filter"
                name.startsWith("functions,") -> "functions"
                name.startsWith("index selector,") -> "index"
                name.startsWith("name selector,") -> "name"
                name.startsWith("slice selector,") -> "slice"
                name.startsWith("whitespace,") -> "whitespace"
                else -> "other"
            }
        test.path("tags").forEach { tag ->
            val value = tag.asText()
            if (value in REPORTED_TAGS) result += value
        }
        return result.toList().sorted()
    }

    private fun writeMatrix(outcomes: List<Outcome>) {
        val root = DocumentCodec.objectNode()
        root.put("suiteRepository", "https://github.com/jsonpath-standard/jsonpath-compliance-test-suite")
        root.put("suiteCommit", "7be7c1fc28057c91e8eefaf197060fba7ed43acd")
        root.put("ctsSha256", "07b65aae2dec4ea19455a33310fa0536203f280f001995d8c105d3ee12e31618")
        root.put("evaluator", "com.nabobery.sdkgen.openapi.jsonpath.Rfc9535Evaluator")
        root.put("total", outcomes.size)
        root.put("passed", outcomes.count { it.status == "pass" })
        root.put("failed", outcomes.count { it.status == "fail" })

        val categories = DocumentCodec.objectNode()
        outcomes.flatMap { it.categories }.toSortedSet().forEach { category ->
            val members = outcomes.filter { category in it.categories }
            val summary = DocumentCodec.objectNode()
            summary.put("total", members.size)
            summary.put("passed", members.count { it.status == "pass" })
            summary.put("failed", members.count { it.status == "fail" })
            categories.set<JsonNode>(category, summary)
        }
        root.set<JsonNode>("categories", categories)

        val cases = DocumentCodec.arrayNode()
        outcomes.forEach { outcome ->
            val node = DocumentCodec.objectNode()
            node.put("name", outcome.name)
            node.put("selector", outcome.selector)
            val caseCategories = DocumentCodec.arrayNode()
            outcome.categories.forEach(caseCategories::add)
            node.set<JsonNode>("categories", caseCategories)
            node.put("expectation", outcome.expectation)
            node.put("status", outcome.status)
            outcome.detail?.let { node.put("detail", it) }
            cases.add(node)
        }
        root.set<JsonNode>("cases", cases)

        val resultRoot = Path.of(checkNotNull(System.getProperty("overlay.resultRoot")))
        resultRoot
            .resolve("jsonpath-cts")
            .createDirectories()
            .resolve("matrix.json")
            .writeText(DocumentCodec.prettyJson(root))
    }

    private fun canonical(node: JsonNode): String = DocumentCodec.canonicalJson(node)

    private fun resourceBytes(path: String): ByteArray = checkNotNull(javaClass.getResource(path)).readBytes()

    private data class Outcome(
        val name: String,
        val selector: String,
        val categories: List<String>,
        val expectation: String,
        val status: String,
        val detail: String?,
    )

    private companion object {
        val REPORTED_TAGS =
            setOf(
                "boundary",
                "case",
                "count",
                "function",
                "index",
                "length",
                "match",
                "search",
                "slice",
                "unicode",
                "value",
                "whitespace",
            )
    }
}
