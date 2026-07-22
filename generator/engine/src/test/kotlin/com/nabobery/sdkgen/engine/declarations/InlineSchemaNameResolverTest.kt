package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.model.SchemaId
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class InlineSchemaNameResolverTest {
    private val resolver = InlineSchemaNameResolver()

    @Test
    fun decodesEachRfc6901SegmentExactlyOnce() {
        assertReadableContains(
            "/components/schemas/Owner~01Name/properties/a~1b/properties/c~0d",
            "Owner1Name",
            "AB",
            "CD",
        )
    }

    @Test
    fun namesPathRequestsAndResponsesWithStatusMediaAndSemanticTail() {
        val request =
            name(
                "/paths/~1keys~1{id}/patch/requestBody/content/application~1merge-patch+json/schema/properties/value",
            )
        val response =
            name(
                "/paths/~1keys~1{id}/patch/responses/422/content/application~1problem+json/schema/properties/error/items",
            )

        assertTrue(request.startsWith("InlineKeysPatchRequestMergePatchJson"), request)
        assertTrue(request.contains("Value"), request)
        assertTrue(response.startsWith("InlineKeysPatchResponse422ProblemJson"), response)
        assertTrue(response.contains("ErrorItem"), response)
    }

    @Test
    fun namesOperationParametersAndResponseHeadersWithContent() {
        assertReadableContains(
            "/paths/~1widgets/get/parameters/0/content/application~1json/schema/properties/filter",
            "Widgets",
            "Get",
            "Parameter",
            "Json",
            "Filter",
        )
        assertReadableContains(
            "/paths/~1widgets/get/responses/200/headers/X-Trace/content/text~1plain/schema/properties/id",
            "Widgets",
            "Get",
            "Response",
            "200",
            "Header",
            "XTrace",
            "TextPlain",
            "Id",
        )
    }

    @Test
    fun namesReusableRequestBodiesResponsesParametersAndHeaders() {
        assertReadableContains(
            "/components/requestBodies/UpdateWidget/content/application~1json/schema/properties/name",
            "UpdateWidget",
            "Request",
            "Json",
            "Name",
        )
        assertReadableContains(
            "/components/responses/Problem/content/application~1problem+json/schema/properties/detail",
            "Problem",
            "Response",
            "ProblemJson",
            "Detail",
        )
        assertReadableContains(
            "/components/parameters/Filter/content/application~1json/schema/properties/value",
            "Filter",
            "Parameter",
            "Json",
            "Value",
        )
        assertReadableContains(
            "/components/headers/RateLimit/content/application~1json/schema/properties/remaining",
            "RateLimit",
            "Header",
            "Json",
            "Remaining",
        )
    }

    @Test
    fun classifiesCanonicalPathItemAndOperationParameterShapesByPosition() {
        assertReadableContains(
            "/paths/~1widgets/parameters/0/schema/properties/pathValue",
            "Widgets",
            "Parameter",
            "PathValue",
        )
        assertReadableContains(
            "/paths/~1widgets/parameters/1/content/application~1json/schema/properties/pathContentValue",
            "Widgets",
            "Parameter",
            "Json",
            "PathContentValue",
        )
        assertReadableContains(
            "/paths/~1widgets/get/parameters/0/schema/properties/operationValue",
            "Widgets",
            "Get",
            "Parameter",
            "OperationValue",
        )
    }

    @Test
    fun classifiesCanonicalRequestResponseHeaderAndReusableComponentShapesByPosition() {
        assertReadableContains(
            "/paths/~1widgets/post/requestBody/content/application~1json/schema/properties/requestValue",
            "Widgets",
            "Post",
            "Request",
            "Json",
            "RequestValue",
        )
        assertReadableContains(
            "/paths/~1widgets/get/responses/201/content/application~1json/schema/properties/responseValue",
            "Widgets",
            "Get",
            "Response201",
            "Json",
            "ResponseValue",
        )
        assertReadableContains(
            "/paths/~1widgets/get/responses/201/headers/X-Rate/schema/properties/headerValue",
            "Widgets",
            "Get",
            "Response201",
            "Header",
            "XRate",
            "HeaderValue",
        )
        assertReadableContains(
            "/components/parameters/Filter/schema/properties/parameterValue",
            "Filter",
            "Parameter",
            "ParameterValue",
        )
        assertReadableContains(
            "/components/headers/RateLimit/schema/properties/headerValue",
            "RateLimit",
            "Header",
            "HeaderValue",
        )
    }

    @Test
    fun structuralMarkerWordsRemainLiteralWhenTheyAreUserOwnedTokens() {
        assertReadableContains(
            "/components/schemas/responses/properties/parameters/properties/content/properties/headers/properties/schema",
            "Responses",
            "Parameters",
            "Content",
            "Headers",
            "Schema",
        )
        val headerNamedContent =
            name("/paths/~1widgets/get/responses/200/headers/content/schema/properties/schema")
        assertTrue(headerNamedContent.contains("HeaderContentSchema"), headerNamedContent)
        assertTrue(!headerNamedContent.contains("SchemaProperties"), headerNamedContent)
        assertReadableContains(
            "/components/responses/parameters/headers/responses/content/application~1json/schema/properties/headers",
            "Parameters",
            "Response",
            "Header",
            "Responses",
            "Json",
            "Headers",
        )
    }

    @Test
    fun pathParameterVariantsShareReadableAnchorButHaveDistinctIdentityTags() {
        val byId = name("/paths/~1users~1{id}/get/responses/200/content/application~1json/schema")
        val byName = name("/paths/~1users~1{name}/get/responses/200/content/application~1json/schema")

        assertEquals(byId.substringBeforeLast('X'), byName.substringBeforeLast('X'))
        assertNotEquals(byId.substringAfterLast('X'), byName.substringAfterLast('X'))
    }

    @Test
    fun mediaTypesRemainReadableAndDistinct() {
        val expected =
            mapOf(
                "application/json" to "Json",
                "application/problem+json" to "ProblemJson",
                "application/merge-patch+json" to "MergePatchJson",
                "text/event-stream" to "EventStream",
                "multipart/form-data" to "Multipart",
                "application/x-www-form-urlencoded" to "Form",
                "application/octet-stream" to "Binary",
                "application/vnd.example+yaml" to "ApplicationVndExampleYaml",
            )

        expected.forEach { (media, token) ->
            val escaped = media.replace("~", "~0").replace("/", "~1")
            assertTrue(
                name("/paths/~1items/post/requestBody/content/$escaped/schema").contains(token),
                media,
            )
        }
    }

    @Test
    fun mediaNormalizationIgnoresCaseWhitespaceAndParametersForReadableAnchors() {
        val variants =
            listOf(
                "application/json",
                " Application/JSON ",
                "application/json; charset=utf-8",
                " APPLICATION/JSON ; profile=\"https://example.test/a;b\" ; charset = \"UTF-8\" ",
                "application/json;charset=\"UTF-8\";profile=compact",
            ).map { media -> name(requestMediaPointer(media)) }

        assertEquals(setOf("InlineItemsPostRequestJson"), variants.map { it.substringBeforeLast('X') }.toSet())
        assertEquals(variants.size, variants.map { it.substringAfterLast('X') }.toSet().size)
    }

    @Test
    fun knownMediaBaseTypesNormalizeWithArbitraryParameterPresentation() {
        val expected =
            mapOf(
                " Application/Problem+JSON ; charset=\"utf-8\" " to "ProblemJson",
                "application/merge-patch+json; profile=compact; charset=utf-8" to "MergePatchJson",
                " TEXT/EVENT-STREAM ; charset = utf-8" to "EventStream",
                "Multipart/Form-Data; boundary=\"a;b\"" to "Multipart",
                "APPLICATION/X-WWW-FORM-URLENCODED ; charset=UTF-8" to "Form",
                "Application/Octet-Stream; name=payload" to "Binary",
            )

        expected.forEach { (media, token) ->
            assertTrue(name(requestMediaPointer(media)).contains(token), media)
        }
    }

    @Test
    fun vendorJsonAndDistinctCustomBaseMediaTypesKeepStableReadableAnchors() {
        val vendor = name(requestMediaPointer("Application/Vnd.Example+JSON; charset=utf-8"))
        val firstCustom = name(requestMediaPointer("application/vnd.first+yaml; version=1"))
        val reorderedFirstCustom = name(requestMediaPointer(" APPLICATION/VND.FIRST+YAML ; version = \"2\" "))
        val secondCustom = name(requestMediaPointer("application/vnd.second+yaml; version=1"))

        assertTrue(vendor.contains("ApplicationVndExampleJson"), vendor)
        assertEquals(firstCustom.substringBeforeLast('X'), reorderedFirstCustom.substringBeforeLast('X'))
        assertNotEquals(firstCustom.substringBeforeLast('X'), secondCustom.substringBeforeLast('X'))
    }

    @Test
    fun semanticTailsUseFrozenOneBasedConventions() {
        assertReadableContains("/components/schemas/Owner/properties/name", "Name")
        assertReadableContains("/components/schemas/Owner/items", "Item")
        assertReadableContains("/components/schemas/Owner/additionalProperties", "AdditionalValue")
        assertReadableContains("/components/schemas/Owner/oneOf/0", "OneOf1")
        assertReadableContains("/components/schemas/Owner/anyOf/1", "AnyOf2")
        assertReadableContains("/components/schemas/Owner/allOf/2", "AllOf3")
    }

    @Test
    fun unknownLocationsUseDeterministicGenericFallback() {
        val first = name("/webhooks/widget/callbacks/onEvent/schema/properties/value")
        val second = name("/webhooks/widget/callbacks/onEvent/schema/properties/value")

        assertEquals(first, second)
        assertTrue(first.startsWith("Inline"), first)
        assertTrue(first.contains("Value"), first)
    }

    @Test
    fun longMiddleAncestryPreservesLeafAndLengthTarget() {
        val long =
            name(
                "/components/schemas/ExtraordinarilyLongOwnerNameThatWouldOtherwiseDominateTheIdentifier/" +
                    "properties/firstVeryLongMiddleProperty/properties/secondVeryLongMiddleProperty/" +
                    "properties/finalLeafThatMustSurvive",
            )

        assertTrue(long.length <= 80, "$long (${long.length})")
        assertTrue(long.contains("FinalLeafThatMustSurvive"), long)
        assertTrue(long.matches(Regex(".*X[0-9a-f]{8}$")), long)
    }

    @Test
    fun pathologicalOwnerTokenIsShortenedWithinTheIdentifierBudget() {
        val owner = "Owner".repeat(50)
        val resolved = name("/components/schemas/$owner/properties/value")

        assertValidBudgetedName(resolved)
        assertTrue(resolved.contains("Owner"), resolved)
        assertTrue(resolved.contains("Value"), resolved)
    }

    @Test
    fun pathologicalFinalPropertyTokenIsShortenedWithinTheIdentifierBudget() {
        val property = "FinalProperty".repeat(20)
        val resolved = name("/components/schemas/Owner/properties/$property")

        assertValidBudgetedName(resolved)
        assertTrue(resolved.contains("Owner"), resolved)
        assertTrue(resolved.contains("FinalProperty"), resolved)
    }

    @Test
    fun pathologicalModelPrefixIsShortenedWithinTheIdentifierBudget() {
        val prefixedResolver = InlineSchemaNameResolver(modelPrefix = "GeneratedModelPrefix".repeat(20))
        val resolved =
            prefixedResolver
                .resolveAll(
                    listOf(schemaId("/components/schemas/Owner/properties/value")),
                    emptySet(),
                ).values
                .single()

        assertValidBudgetedName(resolved)
        assertTrue(resolved.contains("Generated"), resolved)
        assertTrue(resolved.contains("Owner"), resolved)
        assertTrue(resolved.contains("Value"), resolved)
    }

    @Test
    fun punctuationAndUnicodeOnlyTokensStillProduceAValidIdentifier() {
        listOf("---", "💥💥💥", "。。。").forEach { token ->
            val resolved = name("/components/schemas/$token/properties/$token")

            assertValidBudgetedName(resolved)
            assertTrue(resolved.substringBeforeLast('X').isNotBlank(), resolved)
        }
    }

    @Test
    fun pathologicalOwnerAndLeafAreBothShortenedWithinTheIdentifierBudget() {
        val owner = "RecognizableOwner".repeat(20)
        val property = "RecognizableLeaf".repeat(20)
        val resolved = name("/components/schemas/$owner/properties/$property")

        assertValidBudgetedName(resolved)
        assertTrue(resolved.contains("Recognizable"), resolved)
        assertTrue(resolved.substringBeforeLast('X').count { it.isDigit() } >= 2, resolved)
    }

    @Test
    fun everyInlineNameHasStableEightCharacterIdentityTag() {
        assertTrue(name("/paths/~1keys/patch/requestBody/content/application~1json/schema").matches(TAGGED_NAME))
    }

    @Test
    fun collisionEscalationExtendsOnlyInvolvedTagsAndIsInsertionStable() {
        val digest: (SchemaId) -> String = { id ->
            when {
                "foo-bar" in id.value -> "12345678aaaa0000000000000000000000000000000000000000000000000000"
                "foo_bar" in id.value -> "12345678bbbb0000000000000000000000000000000000000000000000000000"
                else -> "abcdef0123456789000000000000000000000000000000000000000000000000"
            }
        }
        val ids =
            listOf(
                schemaId("/components/schemas/Owner/properties/foo-bar"),
                schemaId("/components/schemas/Owner/properties/foo_bar"),
                schemaId("/components/schemas/Owner/properties/gamma"),
            )
        val collidingResolver = InlineSchemaNameResolver(digest)
        val baseline = collidingResolver.resolveAll(ids, emptySet())
        val withUnrelated = collidingResolver.resolveAll(listOf(schemaId("/unknown/earlier")) + ids, emptySet())

        assertTrue(baseline.getValue(ids[0]).matches(Regex(".*X[0-9a-f]{12}$")))
        assertTrue(baseline.getValue(ids[1]).matches(Regex(".*X[0-9a-f]{12}$")))
        assertTrue(baseline.getValue(ids[2]).matches(TAGGED_NAME))
        ids.forEach { id -> assertEquals(baseline.getValue(id), withUnrelated.getValue(id)) }
    }

    @Test
    fun reservedConflictsEscalateWithoutNumericSuffixes() {
        val id = schemaId("/components/schemas/Owner/properties/value")
        val baseName = resolver.resolveAll(listOf(id), emptySet()).getValue(id)
        val resolved = resolver.resolveAll(listOf(id), setOf(baseName)).getValue(id)

        assertTrue(resolved.matches(Regex(".*X[0-9a-f]{12}$")), resolved)
        assertTrue(!resolved.substringBeforeLast('X').matches(Regex(".*\\d+$")), resolved)
    }

    private fun assertReadableContains(
        pointer: String,
        vararg tokens: String,
    ) {
        val resolved = name(pointer)
        tokens.forEach { token -> assertTrue(resolved.contains(token), "$resolved missing $token") }
    }

    private fun name(pointer: String): String =
        resolver.resolveAll(listOf(schemaId(pointer)), emptySet()).values.single()

    private fun requestMediaPointer(media: String): String =
        "/paths/~1items/post/requestBody/content/${media.replace("~", "~0").replace("/", "~1")}/schema"

    private fun assertValidBudgetedName(name: String) {
        assertTrue(name.length <= 80, "$name (${name.length})")
        assertTrue(name.matches(Regex("[A-Za-z_][A-Za-z0-9_]*")), name)
        assertTrue(name.matches(TAGGED_NAME), name)
    }

    private fun schemaId(pointer: String): SchemaId = SchemaId("sdkgen://source/openapi.yaml#$pointer")

    private companion object {
        val TAGGED_NAME = Regex(".*X[0-9a-f]{8}$")
    }
}
