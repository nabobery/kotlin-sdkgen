package com.nabobery.sdkgen.openapi.overlays

import com.nabobery.sdkgen.openapi.jsonpath.Rfc9535Evaluator
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class Rfc9535SelectorTest {
    private val document =
        DocumentCodec.parse(
            """
            items:
              - kind: a
                value: 1
              - kind: b
                value: 2
            paths:
              /chat:
                post:
                  operationId: chat
            """.trimIndent().toByteArray(),
        )

    @Test
    fun `selects standard member index wildcard and filter paths`() {
        val selector = Rfc9535Selector()
        assertEquals(listOf("/items/0/value"), selector.selectPointers(document, "$['items'][0]['value']"))
        assertEquals(
            listOf("/items/0/kind", "/items/1/kind"),
            selector.selectPointers(document, "$['items'][*]['kind']"),
        )
        assertEquals(listOf("/items/0"), selector.selectPointers(document, "$['items'][?@['kind'] == 'a']"))
    }

    @Test
    fun `rejects nonstandard JSONPath extensions`() {
        val selector = Rfc9535Selector()
        val source = JsonPathSource("selector-test", 3, "target")
        val extension =
            assertFailsWith<JsonPathValidationException> {
                selector.selectPointers(document, "$['items'][?(@.kind in ['a'])]", source)
            }
        assertEquals(source, extension.source)
        assertTrue(extension.offset > 0)
        assertFailsWith<JsonPathValidationException> {
            selector.selectPointers(document, "$['items'][?(@.kind =~ /a/)]", source)
        }
    }

    @Test
    fun `rejects unsafe regexes and oversized regex inputs with budget diagnostics`() {
        val document = DocumentCodec.parse("x: '${"a".repeat(65_537)}!'".toByteArray())
        val unsafeDocument = DocumentCodec.parse("x: 'aaaa!'".toByteArray())
        val unsafe =
            assertFailsWith<JsonPathValidationException> {
                Rfc9535Evaluator.select(unsafeDocument, "$[?search(@, '(a+)+$')]")
            }
        assertContains(unsafe.message.orEmpty(), "SDKGEN-JSONPATH-BUDGET")

        val oversizedPattern =
            assertFailsWith<JsonPathValidationException> {
                Rfc9535Evaluator.select(document, "$[?search(@, '${"a".repeat(4_097)}')]")
            }
        assertContains(oversizedPattern.message.orEmpty(), "SDKGEN-JSONPATH-BUDGET")

        val oversizedCandidate =
            assertFailsWith<JsonPathValidationException> {
                Rfc9535Evaluator.select(document, "$[?search(@, 'a+')]")
            }
        assertContains(oversizedCandidate.message.orEmpty(), "SDKGEN-JSONPATH-BUDGET")
    }

    @Test
    fun `rejects oversized selectors with a budget diagnostic`() {
        val failure =
            assertFailsWith<JsonPathValidationException> {
                Rfc9535Selector().validate("$['${"a".repeat(16_385)}']", JsonPathSource("selector-test", 4, "target"))
            }
        assertContains(failure.message.orEmpty(), "SDKGEN-JSONPATH-BUDGET")
    }

    @Test
    fun `preserves duplicate selections and produces normalized paths`() {
        val selected = Rfc9535Evaluator.select(document, "$['items'][0,0]['kind']")
        assertEquals(listOf("$['items'][0]['kind']", "$['items'][0]['kind']"), selected.map { it.normalizedPath })
        assertEquals(listOf("/items/0/kind", "/items/0/kind"), selected.map { it.pointer })
    }

    @Test
    fun `escapes normalized paths and JSON pointers independently`() {
        val selected = Rfc9535Evaluator.select(document, "$['paths']['/chat']['post']").single()
        assertEquals("$['paths']['/chat']['post']", selected.normalizedPath)
        assertEquals("/paths/~1chat/post", selected.pointer)
    }
}
