package com.nabobery.sdkgen.runtime

import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
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

    /**
     * The runtime half of the path-union contract. A path segment carries exactly one value, so a union's array
     * branch — which `sdkPrimitiveUnionParameterValues` expands to zero or many — cannot be rendered into one.
     * The generator refuses to emit such a parameter (see `StandardProjectionTest`); this pins the runtime
     * behaviour that makes refusing the right answer rather than an over-restriction.
     */
    @Test
    fun aPathParameterCarryingMoreThanOneValueIsRejected() {
        val thrown =
            assertFailsWith<IllegalArgumentException> {
                buildRequestUri(
                    baseUri = "https://example.test",
                    pathTemplate = "/things/{id}",
                    parameters = listOf(pathParameter("id", "a", "b")),
                )
            }
        assertEquals("path parameter 'id' must have exactly one value", thrown.message)
    }

    @Test
    fun aPathParameterCarryingNoValuesIsRejected() {
        val thrown =
            assertFailsWith<IllegalArgumentException> {
                buildRequestUri(
                    baseUri = "https://example.test",
                    pathTemplate = "/things/{id}",
                    parameters = listOf(pathParameter("id")),
                )
            }
        assertEquals("path parameter 'id' must have exactly one value", thrown.message)
    }

    @Test
    fun primitiveUnionValuesUseTheUnquotedLexicalFormOfEachBranch() {
        // A scalar branch contributes exactly one value; the union's branch is not observable on the wire.
        assertEquals(listOf("patch"), values(JsonPrimitive("patch")))
        assertEquals(listOf("42"), values(JsonPrimitive(42)))
        assertEquals(listOf("true"), values(JsonPrimitive(true)))
        // A numeric-looking string stays its own text: a URI carries no JSON type information.
        assertEquals(listOf("42"), values(JsonPrimitive("42")))
        assertEquals(listOf(""), values(JsonPrimitive("")))
        // Commas are data, not separators — buildRequestUri percent-encodes them.
        assertEquals(listOf("a,b"), values(JsonPrimitive("a,b")))
    }

    @Test
    fun primitiveUnionValuesContributeOnePerArrayElement() {
        assertEquals(
            listOf("a", "b"),
            values(JsonArray(listOf(JsonPrimitive("a"), JsonPrimitive("b")))),
        )
        assertEquals(listOf("1", "2"), values(JsonArray(listOf(JsonPrimitive(1), JsonPrimitive(2)))))
        assertEquals(emptyList(), values(JsonArray(emptyList())))
    }

    @Test
    fun primitiveUnionNullContributesNoValuesSoTheParameterIsOmitted() {
        // Matches every other ParameterSerialization variant: null means absent, not `name=`.
        assertEquals(emptyList(), values(JsonNull))
        assertEquals(
            "https://example.test/items",
            buildRequestUri(
                "https://example.test",
                "/items",
                listOf(SdkRequestParameter(SdkParameterLocation.QUERY, "has", values(JsonNull))),
            ),
        )
    }

    @Test
    fun primitiveUnionRejectsShapesTheProjectionDoesNotAccept() {
        assertFailsWith<IllegalArgumentException> { values(JsonObject(emptyMap())) }
        assertFailsWith<IllegalArgumentException> { values(JsonArray(listOf(JsonArray(emptyList())))) }
        assertFailsWith<IllegalArgumentException> { values(JsonArray(listOf(JsonNull))) }
    }

    @Test
    fun primitiveUnionScalarAndSingleElementArrayBranchesAreWireIdentical() {
        // This is the premise ADR-0016 rests on: the branch a caller picked cannot be recovered from the
        // request, which is what makes projecting the union to a repeated parameter lossless.
        val scalar = values(JsonPrimitive("patch"))
        val singleton = values(JsonArray(listOf(JsonPrimitive("patch"))))
        assertEquals(scalar, singleton)
        assertEquals(
            uriWithHas(scalar),
            uriWithHas(singleton),
        )
    }

    private fun uriWithHas(values: List<String>): String =
        buildRequestUri(
            "https://example.test",
            "/items",
            listOf(SdkRequestParameter(SdkParameterLocation.QUERY, "has", values)),
        )

    private fun values(raw: JsonElement): List<String> = sdkPrimitiveUnionParameterValues(raw)

    private fun pathParameter(
        name: String,
        vararg values: String,
    ): SdkRequestParameter = SdkRequestParameter(SdkParameterLocation.PATH, name, values.toList())
}
