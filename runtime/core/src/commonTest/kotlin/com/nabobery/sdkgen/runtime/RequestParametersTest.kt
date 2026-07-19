package com.nabobery.sdkgen.runtime

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

internal class RequestParametersTest {
    @Test
    fun pathTemplateScannerCopiesOrdinaryCharactersAroundPlaceholders() {
        assertEquals(
            "https://example.test/prefix/42/suffix/42",
            buildRequestUri(
                baseUri = "https://example.test",
                pathTemplate = "/prefix/{id}/suffix/{id}",
                parameters = listOf(pathParameter("id", "42")),
            ),
        )
    }

    @Test
    fun pathTemplateSubstitutionPercentEncodesNonAsciiValues() {
        assertEquals(
            "https://example.test/items/caf%C3%A9%2F%E6%97%A5%E6%9C%AC",
            buildRequestUri(
                baseUri = "https://example.test",
                pathTemplate = "/items/{name}",
                parameters = listOf(pathParameter("name", "café/日本")),
            ),
        )
    }

    @Test
    fun pathTemplateRequiresExactlyOneMatchingPathValue() {
        val missing =
            assertFailsWith<IllegalArgumentException> {
                buildRequestUri(
                    baseUri = "https://example.test",
                    pathTemplate = "/items/{id}",
                    parameters = emptyList(),
                )
            }
        assertEquals("path parameter 'id' must have exactly one value", missing.message)

        val duplicate =
            assertFailsWith<IllegalArgumentException> {
                buildRequestUri(
                    baseUri = "https://example.test",
                    pathTemplate = "/items/{id}",
                    parameters = listOf(pathParameter("id", "one", "two")),
                )
            }
        assertEquals("path parameter 'id' must have exactly one value", duplicate.message)
    }

    @Test
    fun pathTemplateRejectsMalformedPlaceholders() {
        assertMalformed(
            pathTemplate = "/items/{}",
            message = "malformed path template: empty placeholder at index 7",
        )
        assertMalformed(
            pathTemplate = "/items/{id",
            message = "malformed path template: unclosed placeholder at index 7",
        )
        assertMalformed(
            pathTemplate = "/items/id}",
            message = "malformed path template: unexpected '}' at index 9",
        )
        assertMalformed(
            pathTemplate = "/items/{id{id}}",
            message = "malformed path template: nested placeholder at index 10",
        )
    }

    private fun assertMalformed(
        pathTemplate: String,
        message: String,
    ) {
        val thrown =
            assertFailsWith<IllegalArgumentException> {
                buildRequestUri(
                    baseUri = "https://example.test",
                    pathTemplate = pathTemplate,
                    parameters = emptyList(),
                )
            }
        assertEquals(message, thrown.message)
    }

    private fun pathParameter(
        name: String,
        vararg values: String,
    ): SdkRequestParameter = SdkRequestParameter(SdkParameterLocation.PATH, name, values.toList())
}
