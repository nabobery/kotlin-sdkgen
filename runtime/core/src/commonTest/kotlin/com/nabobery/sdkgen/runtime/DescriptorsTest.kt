package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.StreamingDescriptor.ServerSentEvents
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class DescriptorsTest {
    @Test
    fun responseSelectorMatchesExactStatusOnlyForThatCode() {
        val selector = ResponseSelector.ExactStatus(200)

        assertTrue(selector.matches(200))
        assertFalse(selector.matches(201))
    }

    @Test
    fun responseSelectorMatchesStatusRangeInclusiveBounds() {
        val selector = ResponseSelector.StatusRange(400, 499)

        assertTrue(selector.matches(400))
        assertTrue(selector.matches(450))
        assertTrue(selector.matches(499))
        assertFalse(selector.matches(399))
        assertFalse(selector.matches(500))
    }

    @Test
    fun responseSelectorStatusRangeRejectsInvertedBounds() {
        assertFailsWith<IllegalArgumentException> { ResponseSelector.StatusRange(499, 400) }
    }

    @Test
    fun responseSelectorDefaultMatchesAnyStatus() {
        assertTrue(ResponseSelector.Default.matches(200))
        assertTrue(ResponseSelector.Default.matches(599))
    }

    @Test
    fun operationMetadataDefaultsResponseAlternativesToEmptyForLegacyClassification() {
        val metadata =
            OperationMetadata(
                operationId = "op",
                method = "GET",
                path = "/items",
                requestMediaTypes = listOf("application/json"),
                responseMediaTypes = listOf("application/json"),
                successStatusCodes = setOf(200, 201),
                responseMode = SdkResponseMode.BUFFERED,
                deadlines = SdkDeadlines(null, null, null),
            )

        // Empty by default (not derived from successStatusCodes): SdkExecutor's status classification uses
        // this emptiness as the signal to fall back to the legacy successStatusCodes-only contract, so a call
        // site that never opts into response alternatives keeps exactly its pre-existing behavior.
        assertTrue(metadata.responseAlternatives.isEmpty())
        assertTrue(metadata.security.isEmpty())
        assertEquals(OperationSafety(safe = false, idempotent = false), metadata.safety)
    }

    @Test
    fun responseAlternativeTypeTagDefaultsToNullAndIsSettable() {
        val untagged = ResponseAlternative(ResponseSelector.ExactStatus(200), listOf("application/json"))
        assertEquals(null, untagged.typeTag)

        val tagged =
            ResponseAlternative(ResponseSelector.ExactStatus(200), listOf("application/json"), typeTag = "ChatResponse")
        assertEquals("ChatResponse", tagged.typeTag)
    }

    @Test
    fun responseAlternativeIdentityIsOptionalForLegacyAndPreservedByCopy() {
        val alternative =
            ResponseAlternative(
                selector = ResponseSelector.ExactStatus(200),
                mediaTypes = listOf("application/json"),
                typeTag = "Success",
                id = "operation.response.alternative0",
            )

        assertEquals("operation.response.alternative0", alternative.id)
        assertEquals(alternative, alternative.copy())
    }

    @Test
    fun operationMetadataAcceptsExplicitResponseAlternatives() {
        val alternatives =
            listOf(
                ResponseAlternative(ResponseSelector.ExactStatus(200), listOf("application/json")),
                ResponseAlternative(ResponseSelector.StatusRange(400, 499), listOf("application/problem+json")),
                ResponseAlternative(ResponseSelector.Default, listOf("application/json")),
            )
        val metadata =
            OperationMetadata(
                operationId = "op",
                method = "GET",
                path = "/items",
                requestMediaTypes = listOf("application/json"),
                responseMediaTypes = listOf("application/json"),
                successStatusCodes = setOf(200),
                responseMode = SdkResponseMode.BUFFERED,
                deadlines = SdkDeadlines(null, null, null),
                responseAlternatives = alternatives,
            )

        assertEquals(alternatives, metadata.responseAlternatives)
    }

    @Test
    fun securityRequirementAndAcrossSchemesOrAcrossRequirementsAnonymousWhenEmpty() {
        val anonymous = SecurityRequirement(emptyList())
        val apiKeyAndBearer =
            SecurityRequirement(
                listOf(SecuritySchemeRef("apiKey"), SecuritySchemeRef("bearer", scopes = listOf("read"))),
            )

        assertTrue(anonymous.schemes.isEmpty())
        assertEquals(2, apiKeyAndBearer.schemes.size)
        assertEquals(listOf("read"), apiKeyAndBearer.schemes[1].scopes)
    }

    @Test
    fun propertyPathValidatesSegments() {
        val path = PropertyPath("data.items")
        assertEquals(listOf("data", "items"), path.segments)

        assertFailsWith<IllegalArgumentException> { PropertyPath("data..items") }
        assertFailsWith<IllegalArgumentException> { PropertyPath("data.\$items") }
        assertFailsWith<IllegalArgumentException> { PropertyPath("") }
    }

    @Test
    fun paginationDescriptorCursorTokenHoldsPropertyPaths() {
        val descriptor =
            PaginationDescriptor.CursorToken(
                requestCursorParam = "cursor",
                requestLimitParam = "limit",
                responseItemsPath = PropertyPath("data"),
                responseNextCursorPath = PropertyPath("meta.next_cursor"),
            )

        assertEquals("cursor", descriptor.requestCursorParam)
        assertEquals(listOf("meta", "next_cursor"), descriptor.responseNextCursorPath.segments)
    }

    @Test
    fun streamingDescriptorServerSentEventsHoldsSentinelAndMatcher() {
        val descriptor =
            StreamingDescriptor.ServerSentEvents(
                terminalSentinel = "[DONE]",
                inBandError = EventMatcher.FieldEquals(field = "event", value = "error"),
            )

        assertEquals("[DONE]", descriptor.terminalSentinel)
        assertEquals(EventMatcher.FieldEquals("event", "error"), descriptor.inBandError)
    }

    @Test
    fun streamingDescriptorCarriesDeclaredRequestFlagAndResponseContentType() {
        val descriptor =
            StreamingDescriptor.ServerSentEvents(
                terminalSentinel = "[DONE]",
                inBandError = null,
                requestFlag = "stream",
                responseContentType = "text/event-stream",
            )

        assertEquals("stream", descriptor.requestFlag)
        assertEquals("text/event-stream", descriptor.responseContentType)
    }

    @Test
    fun responseAlternativeCarriesDeclaredResponseMode() {
        val alternative =
            ResponseAlternative(
                selector = ResponseSelector.ExactStatus(200),
                mediaTypes = listOf("text/event-stream"),
                typeTag = "Event",
                mode = SdkResponseMode.STREAMING,
            )

        assertEquals(SdkResponseMode.STREAMING, alternative.mode)
    }

    @Test
    fun responseAlternativeSupportsDefaultedTrailingParameters() {
        val untaggedShape =
            ResponseAlternative(
                selector = ResponseSelector.ExactStatus(200),
                mediaTypes = listOf("application/octet-stream"),
                typeTag = "Binary",
            )
        assertEquals(SdkResponseMode.BUFFERED, untaggedShape.mode)

        val streamingShape =
            ResponseAlternative(
                selector = ResponseSelector.ExactStatus(200),
                mediaTypes = listOf("application/octet-stream"),
                typeTag = "Binary",
                mode = SdkResponseMode.STREAMING,
            )
        assertEquals(SdkResponseMode.STREAMING, streamingShape.mode)

        val defaultShape =
            ResponseAlternative(
                selector = ResponseSelector.ExactStatus(200),
                mediaTypes = listOf("application/octet-stream"),
            )
        assertEquals(null, defaultShape.typeTag)
        assertEquals(SdkResponseMode.BUFFERED, defaultShape.mode)

        val partialCopy =
            streamingShape.copy(
                selector = streamingShape.selector,
                mediaTypes = streamingShape.mediaTypes,
                typeTag = streamingShape.typeTag,
            )
        assertEquals(SdkResponseMode.STREAMING, partialCopy.mode)

        val fullCopy =
            streamingShape.copy(
                selector = streamingShape.selector,
                mediaTypes = streamingShape.mediaTypes,
                typeTag = streamingShape.typeTag,
                mode = SdkResponseMode.BUFFERED,
            )
        assertEquals(SdkResponseMode.BUFFERED, fullCopy.mode)

        val defaultCopy = streamingShape.copy()
        assertEquals(streamingShape, defaultCopy)
    }

    @Test
    fun serverSentEventsSupportsDefaultedTrailingParameters() {
        val sentinelOnlyShape =
            StreamingDescriptor.ServerSentEvents(
                terminalSentinel = "[DONE]",
                inBandError = null,
            )
        assertEquals(null, sentinelOnlyShape.requestFlag)
        assertEquals("text/event-stream", sentinelOnlyShape.responseContentType)

        val fullShape =
            StreamingDescriptor.ServerSentEvents(
                terminalSentinel = "[DONE]",
                inBandError = null,
                requestFlag = "stream",
                responseContentType = "text/event-stream; charset=utf-8",
            )
        assertEquals("stream", fullShape.requestFlag)

        val defaultShape = StreamingDescriptor.ServerSentEvents()
        assertEquals(null, defaultShape.terminalSentinel)
        assertEquals(null, defaultShape.inBandError)
        assertEquals(null, defaultShape.requestFlag)
        assertEquals("text/event-stream", defaultShape.responseContentType)

        val partialCopy =
            fullShape.copy(
                terminalSentinel = fullShape.terminalSentinel,
                inBandError = fullShape.inBandError,
            )
        assertEquals("stream", partialCopy.requestFlag)
        assertEquals("text/event-stream; charset=utf-8", partialCopy.responseContentType)

        val fullCopy =
            fullShape.copy(
                terminalSentinel = fullShape.terminalSentinel,
                inBandError = fullShape.inBandError,
                requestFlag = null,
                responseContentType = "application/x-ndjson",
            )
        assertEquals(null, fullCopy.requestFlag)
        assertEquals("application/x-ndjson", fullCopy.responseContentType)

        val defaultCopy = fullShape.copy()
        assertEquals(fullShape, defaultCopy)
    }

    @Test
    fun idempotencyAndRetryDescriptorsAreImmutableDataHolders() {
        val idempotency = IdempotencyDescriptor(keyHeader = "Idempotency-Key", clientGenerated = true)
        val retry =
            RetryDescriptor(
                retryableStatusCodes = listOf(ResponseSelector.StatusRange(500, 599)),
                retryConnectionErrors = true,
                maxAttempts = 3,
            )

        assertEquals("Idempotency-Key", idempotency.keyHeader)
        assertTrue(retry.retryConnectionErrors)
        assertEquals(3, retry.maxAttempts)
    }

    @Test
    fun responseAlternativeDefensivelyCopiesMediaTypes() {
        val source = mutableListOf("application/json")
        val alternative = ResponseAlternative(ResponseSelector.ExactStatus(200), source)

        source.add("text/plain")

        assertEquals(listOf("application/json"), alternative.mediaTypes)
    }

    @Test
    fun securitySchemeRefDefensivelyCopiesScopes() {
        val source = mutableListOf("read")
        val ref = SecuritySchemeRef("bearer", source)

        source.add("write")

        assertEquals(listOf("read"), ref.scopes)
    }

    @Test
    fun securityRequirementDefensivelyCopiesSchemes() {
        val source = mutableListOf(SecuritySchemeRef("apiKey"))
        val requirement = SecurityRequirement(source)

        source.add(SecuritySchemeRef("bearer"))

        assertEquals(listOf(SecuritySchemeRef("apiKey")), requirement.schemes)
    }

    @Test
    fun retryDescriptorDefensivelyCopiesRetryableStatusCodes() {
        val source = mutableListOf<ResponseSelector>(ResponseSelector.ExactStatus(500))
        val retry = RetryDescriptor(retryableStatusCodes = source)

        source.add(ResponseSelector.ExactStatus(503))

        assertEquals(listOf<ResponseSelector>(ResponseSelector.ExactStatus(500)), retry.retryableStatusCodes)
    }

    @Test
    fun operationMetadataDefensivelyCopiesAllCollections() {
        val requestMediaTypes = mutableListOf("application/json")
        val responseMediaTypes = mutableListOf("application/json")
        val successStatusCodes = mutableSetOf(200)
        val responseAlternatives =
            mutableListOf(ResponseAlternative(ResponseSelector.ExactStatus(200), listOf("application/json")))
        val security = mutableListOf(SecurityRequirement(listOf(SecuritySchemeRef("apiKey"))))

        val metadata =
            OperationMetadata(
                operationId = "op",
                method = "GET",
                path = "/x",
                requestMediaTypes = requestMediaTypes,
                responseMediaTypes = responseMediaTypes,
                successStatusCodes = successStatusCodes,
                responseMode = SdkResponseMode.BUFFERED,
                deadlines = SdkDeadlines(null, null, null),
                responseAlternatives = responseAlternatives,
                security = security,
            )

        requestMediaTypes.add("text/plain")
        responseMediaTypes.add("text/plain")
        successStatusCodes.add(201)
        responseAlternatives.add(ResponseAlternative(ResponseSelector.ExactStatus(500), listOf("application/json")))
        security.add(SecurityRequirement(emptyList()))

        assertEquals(listOf("application/json"), metadata.requestMediaTypes)
        assertEquals(listOf("application/json"), metadata.responseMediaTypes)
        assertEquals(setOf(200), metadata.successStatusCodes)
        assertEquals(1, metadata.responseAlternatives.size)
        assertEquals(1, metadata.security.size)
    }

    @Test
    fun operationMetadataCopyAlsoDefensivelyCopiesReplacedCollections() {
        val metadata =
            OperationMetadata(
                operationId = "op",
                method = "GET",
                path = "/x",
                requestMediaTypes = listOf("application/json"),
                responseMediaTypes = listOf("application/json"),
                successStatusCodes = setOf(200),
                responseMode = SdkResponseMode.BUFFERED,
                deadlines = SdkDeadlines(null, null, null),
            )
        val replacement = mutableListOf("text/plain")

        val copied = metadata.copy(requestMediaTypes = replacement)
        replacement.add("application/xml")

        assertEquals(listOf("text/plain"), copied.requestMediaTypes)
    }

    @Test
    fun fullOperationMetadataRoundTripsThroughCopyWithCorrectEqualsAndHashCode() {
        val metadata =
            OperationMetadata(
                operationId = "createChatCompletion",
                method = "POST",
                path = "/chat/completions",
                requestMediaTypes = listOf("application/json"),
                responseMediaTypes = listOf("application/json"),
                successStatusCodes = setOf(200),
                responseMode = SdkResponseMode.STREAMING,
                deadlines = SdkDeadlines(totalMillis = 60_000, attemptMillis = 30_000, idleMillis = 10_000),
                responseAlternatives =
                    listOf(
                        ResponseAlternative(
                            ResponseSelector.ExactStatus(200),
                            listOf("application/json"),
                            "ChatResponse",
                        ),
                        ResponseAlternative(
                            ResponseSelector.StatusRange(400, 499),
                            listOf("application/problem+json"),
                            "ChatError",
                        ),
                        ResponseAlternative(ResponseSelector.Default, listOf("application/json"), null),
                    ),
                security =
                    listOf(
                        SecurityRequirement(listOf(SecuritySchemeRef("bearer", listOf("chat:write")))),
                        SecurityRequirement(emptyList()),
                    ),
                safety = OperationSafety(safe = false, idempotent = true),
                idempotency = IdempotencyDescriptor(keyHeader = "Idempotency-Key", clientGenerated = true),
                retry =
                    RetryDescriptor(
                        retryableStatusCodes = listOf(ResponseSelector.StatusRange(500, 599)),
                        retryConnectionErrors = true,
                        maxAttempts = 3,
                        backoff = BackoffHints(baseDelayMillis = 500, multiplier = 2.0, maxDelayMillis = 8_000),
                    ),
                pagination =
                    PaginationDescriptor.CursorToken(
                        requestCursorParam = "cursor",
                        requestLimitParam = "limit",
                        responseItemsPath = PropertyPath("data"),
                        responseNextCursorPath = PropertyPath("meta.next_cursor"),
                    ),
                streaming =
                    StreamingDescriptor.ServerSentEvents(
                        terminalSentinel = "[DONE]",
                        inBandError = EventMatcher.FieldEquals("event", "error"),
                    ),
            )

        // An independently-constructed value with identical field values must compare equal and hash equal.
        val identical =
            OperationMetadata(
                operationId = metadata.operationId,
                method = metadata.method,
                path = metadata.path,
                requestMediaTypes = metadata.requestMediaTypes,
                responseMediaTypes = metadata.responseMediaTypes,
                successStatusCodes = metadata.successStatusCodes,
                responseMode = metadata.responseMode,
                deadlines = metadata.deadlines,
                responseAlternatives = metadata.responseAlternatives,
                security = metadata.security,
                safety = metadata.safety,
                idempotency = metadata.idempotency,
                retry = metadata.retry,
                pagination = metadata.pagination,
                streaming = metadata.streaming,
            )
        assertEquals(metadata, identical)
        assertEquals(metadata.hashCode(), identical.hashCode())

        val roundTripped = metadata.copy()
        assertEquals(metadata, roundTripped)
        assertEquals(metadata.hashCode(), roundTripped.hashCode())

        val changed = metadata.copy(operationId = "other")
        assertFalse(metadata == changed)
    }
}
