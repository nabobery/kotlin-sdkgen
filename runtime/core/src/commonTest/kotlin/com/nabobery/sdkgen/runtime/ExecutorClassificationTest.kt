@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.resilience.SdkDelayer
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertSame
import kotlin.test.assertTrue

internal class ExecutorClassificationTest {
    @Test
    fun legacySuccessStatusCodesClassifyWhenNoResponseAlternativesDeclared() {
        val result =
            execute(
                metadata =
                    baseMetadata().copy(
                        successStatusCodes = setOf(200),
                        responseAlternatives = emptyList(),
                    ),
                statusCode = 200,
            )

        assertEquals("ok", result)
    }

    @Test
    fun legacyNonSuccessStatusCodeFailsWithSdkApiExceptionWhenNoResponseAlternativesDeclared() {
        val failure =
            assertFailsWith<SdkApiException> {
                execute(
                    metadata =
                        baseMetadata().copy(
                            successStatusCodes = setOf(200),
                            responseAlternatives = emptyList(),
                        ),
                    statusCode = 404,
                )
            }
        assertEquals(404, failure.statusCode)
    }

    @Test
    fun twoXxMatchingAlternativeIsSuccess() {
        val result =
            execute(
                metadata =
                    baseMetadata().copy(
                        successStatusCodes = emptySet(),
                        responseAlternatives =
                            listOf(ResponseAlternative(ResponseSelector.ExactStatus(201), listOf("application/json"))),
                    ),
                statusCode = 201,
            )

        assertEquals("ok", result)
    }

    @Test
    fun legacySuccessStatusCodesHitIsSuccessEvenWhenNonAlternativeMatchesButLegacyDoes() {
        val result =
            execute(
                metadata =
                    baseMetadata().copy(
                        successStatusCodes = setOf(400),
                        responseAlternatives =
                            listOf(ResponseAlternative(ResponseSelector.ExactStatus(400), listOf("application/json"))),
                    ),
                statusCode = 400,
            )

        assertEquals("ok", result)
    }

    @Test
    fun matchedNonSuccessAlternativeThrowsSdkApiException() {
        val failure =
            assertFailsWith<SdkApiException> {
                execute(
                    metadata =
                        baseMetadata().copy(
                            successStatusCodes = emptySet(),
                            responseAlternatives =
                                listOf(
                                    ResponseAlternative(
                                        ResponseSelector.StatusRange(400, 499),
                                        listOf("application/json"),
                                    ),
                                ),
                        ),
                    statusCode = 404,
                )
            }
        assertEquals(404, failure.statusCode)
    }

    @Test
    fun unmatchedStatusThrowsUnknownApiExceptionWithBoundedPreview() {
        val failure =
            assertFailsWith<UnknownApiException> {
                execute(
                    metadata =
                        baseMetadata().copy(
                            successStatusCodes = emptySet(),
                            responseAlternatives =
                                listOf(
                                    ResponseAlternative(ResponseSelector.ExactStatus(200), listOf("application/json")),
                                ),
                        ),
                    statusCode = 599,
                )
            }
        assertEquals(599, failure.statusCode)
        assertEquals("ok", failure.redactedBodyPreview)
        assertEquals("op", failure.operationId)
    }

    @Test
    fun unmatchedStatusCapturesEmptyBodyAsAnEmptyPreview() {
        assertEquals("", unknownFailure(emptyList()).redactedBodyPreview)
    }

    @Test
    fun unmatchedStatusBoundsOversizedBodyAndMarksTruncation() {
        val failure =
            unknownFailure(
                listOf(
                    "a".repeat(UnknownApiException.MAX_BODY_PREVIEW_BYTES + 512).encodeToByteArray(),
                ),
            )

        val preview = requireNotNull(failure.redactedBodyPreview)
        assertTrue(preview.encodeToByteArray().size <= UnknownApiException.MAX_BODY_PREVIEW_BYTES)
        assertTrue(preview.contains("…[truncated]"))
    }

    @Test
    fun unmatchedStatusKeepsTruncationMarkerAfterCredentialRedactionShrinksPreview() {
        val oversizedCredentialBody =
            ("password=" + "secret".repeat(UnknownApiException.MAX_BODY_PREVIEW_BYTES)).encodeToByteArray()
        val failure = unknownFailure(listOf(oversizedCredentialBody))

        val preview = requireNotNull(failure.redactedBodyPreview)
        assertTrue(preview.endsWith("…[truncated]"))
        assertFalse(preview.contains("secret"))
    }

    @Test
    fun unmatchedStatusReadsOnlyPreviewLimitPlusOneByte() {
        val body = ClassificationRecordingStream(listOf(ByteArray(UnknownApiException.MAX_BODY_PREVIEW_BYTES + 512)))
        val transport = ClassificationRecordingTransport(SdkResponse(599, emptyList(), body))
        val metadata =
            baseMetadata().copy(
                successStatusCodes = emptySet(),
                responseAlternatives =
                    listOf(ResponseAlternative(ResponseSelector.ExactStatus(200), listOf("application/json"))),
            )

        assertFailsWith<UnknownApiException> {
            runSuspendForClassificationTest {
                SdkExecutor(transport).execute(
                    request = SdkExecutionRequest(metadata, "https://example.test", "request", listOf("json")),
                    responseCodecIds = listOf("json"),
                    requestCodecs = MediaTypeCodecRegistry.of(ClassificationStringCodec),
                    responseCodecs = MediaTypeCodecRegistry.of(ClassificationStringCodec),
                )
            }
        }

        assertEquals(UnknownApiException.MAX_BODY_PREVIEW_BYTES + 1, body.bytesRequested)
    }

    @Test
    fun unmatchedStatusHandlesUtf8CutAtPreviewBoundary() {
        val failure =
            unknownFailure(
                listOf("🙂".repeat(UnknownApiException.MAX_BODY_PREVIEW_BYTES).encodeToByteArray()),
            )

        val preview = requireNotNull(failure.redactedBodyPreview)
        assertTrue(preview.encodeToByteArray().size <= UnknownApiException.MAX_BODY_PREVIEW_BYTES)
        assertTrue(preview.contains("…[truncated]"))
    }

    @Test
    fun unmatchedStatusRedactsCredentialLikeBodyFields() {
        val failure = unknownFailure(listOf("{\"token\":\"secret-token\",\"message\":\"safe\"}".encodeToByteArray()))

        val preview = requireNotNull(failure.redactedBodyPreview)
        assertFalse(preview.contains("secret-token"))
        assertTrue(preview.contains("<redacted>"))
        assertTrue(preview.contains("safe"))
    }

    @Test
    fun unmatchedStatusClosesStreamingBodyWithUnknownFailureIdentity() {
        val body = ClassificationRecordingStream(listOf("unknown".encodeToByteArray()))
        val transport = ClassificationRecordingTransport(SdkResponse(599, emptyList(), body))
        val metadata =
            baseMetadata().copy(
                successStatusCodes = emptySet(),
                responseAlternatives =
                    listOf(ResponseAlternative(ResponseSelector.ExactStatus(200), listOf("application/json"))),
            )

        val failure =
            assertFailsWith<UnknownApiException> {
                runSuspendForClassificationTest {
                    SdkExecutor(transport).execute(
                        request = SdkExecutionRequest(metadata, "https://example.test", "request", listOf("json")),
                        responseCodecIds = listOf("json"),
                        requestCodecs = MediaTypeCodecRegistry.of(ClassificationStringCodec),
                        responseCodecs = MediaTypeCodecRegistry.of(ClassificationStringCodec),
                    )
                }
            }

        assertSame(failure, body.lastCloseCause)
    }

    @Test
    fun exactStatusTakesPrecedenceOverStatusRangeAndDefault() {
        // All three selector kinds could match 404 (StatusRange(400,499), Default, ExactStatus(404));
        // ExactStatus must win by precedence. Since 404 is not 2xx and not in legacy successStatusCodes,
        // the matched alternative classifies this as a mapped failure (SdkApiException), not
        // UnknownApiException -- proving ExactStatus, not Default, was the one consulted.
        val failure =
            assertFailsWith<SdkApiException> {
                execute(
                    metadata =
                        baseMetadata().copy(
                            successStatusCodes = emptySet(),
                            responseAlternatives =
                                listOf(
                                    ResponseAlternative(
                                        ResponseSelector.StatusRange(400, 499),
                                        listOf("application/json"),
                                    ),
                                    ResponseAlternative(ResponseSelector.Default, listOf("application/json")),
                                    ResponseAlternative(ResponseSelector.ExactStatus(404), listOf("application/json")),
                                ),
                        ),
                    statusCode = 404,
                )
            }
        assertEquals(404, failure.statusCode)
    }

    @Test
    fun defaultAlternativeCatchesOtherwiseUnmatchedStatus() {
        val failure =
            assertFailsWith<SdkApiException> {
                execute(
                    metadata =
                        baseMetadata().copy(
                            successStatusCodes = emptySet(),
                            responseAlternatives =
                                listOf(
                                    ResponseAlternative(ResponseSelector.ExactStatus(200), listOf("application/json")),
                                    ResponseAlternative(ResponseSelector.Default, listOf("application/json")),
                                ),
                        ),
                    statusCode = 503,
                )
            }
        assertEquals(503, failure.statusCode)
    }

    @Test
    fun matchAlternativeSelectionPrefersExactStatusThenStatusRangeThenDefaultByTypeTag() {
        // Precedence is not observable through classifyStatus alone (every matched alternative classifies the
        // same status the same way), so this exercises SdkExecutor.matchAlternative directly -- made `internal`
        // for exactly this purpose -- and asserts on typeTag, which now distinguishes which alternative won.
        val executor = SdkExecutor(SdkTransport { error("unused in this test") })
        val exact =
            ResponseAlternative(ResponseSelector.ExactStatus(404), listOf("application/json"), typeTag = "ExactType")
        val range =
            ResponseAlternative(
                ResponseSelector.StatusRange(400, 499),
                listOf("application/json"),
                typeTag = "RangeType",
            )
        val default = ResponseAlternative(ResponseSelector.Default, listOf("application/json"), typeTag = "DefaultType")

        assertEquals("ExactType", executor.matchAlternative(listOf(range, default, exact), 404)?.typeTag)
        assertEquals("RangeType", executor.matchAlternative(listOf(range, default), 404)?.typeTag)
        assertEquals("DefaultType", executor.matchAlternative(listOf(default), 404)?.typeTag)
        assertNull(executor.matchAlternative(emptyList(), 404))
        assertNull(executor.matchAlternative(listOf(exact), 500))
    }

    @Test
    fun matchAlternativeRanksMediaSpecificityWithinSelectorTier() {
        val executor = SdkExecutor(SdkTransport { error("unused in this test") })
        val declarationFallback =
            ResponseAlternative(
                ResponseSelector.ExactStatus(200),
                listOf("application/xml"),
                typeTag = "DeclarationFallback",
            )
        val secondDeclarationFallback =
            ResponseAlternative(
                ResponseSelector.ExactStatus(200),
                listOf("text/plain"),
                typeTag = "SecondDeclarationFallback",
            )
        val emptyMediaFallback =
            ResponseAlternative(
                ResponseSelector.ExactStatus(200),
                emptyList(),
                typeTag = "EmptyMediaFallback",
            )
        val globalWildcard =
            ResponseAlternative(
                ResponseSelector.ExactStatus(200),
                listOf("*/*"),
                typeTag = "GlobalWildcard",
            )
        val typeWildcard =
            ResponseAlternative(
                ResponseSelector.ExactStatus(200),
                listOf("application/*"),
                typeTag = "TypeWildcard",
            )
        val exact =
            ResponseAlternative(
                ResponseSelector.ExactStatus(200),
                listOf("application/json"),
                typeTag = "Exact",
            )

        assertEquals(
            "Exact",
            executor
                .matchAlternative(
                    listOf(globalWildcard, typeWildcard, exact, emptyMediaFallback, declarationFallback),
                    200,
                    "Application/JSON; charset=utf-8",
                )?.typeTag,
        )
        assertEquals(
            "TypeWildcard",
            executor
                .matchAlternative(
                    listOf(globalWildcard, typeWildcard, emptyMediaFallback, declarationFallback),
                    200,
                    "application/json",
                )?.typeTag,
        )
        assertEquals(
            "GlobalWildcard",
            executor
                .matchAlternative(
                    listOf(globalWildcard, emptyMediaFallback, declarationFallback),
                    200,
                    "application/json",
                )?.typeTag,
        )
        assertEquals(
            "EmptyMediaFallback",
            executor
                .matchAlternative(
                    listOf(emptyMediaFallback, declarationFallback),
                    200,
                    "application/json",
                )?.typeTag,
        )
        assertEquals(
            "DeclarationFallback",
            executor
                .matchAlternative(
                    listOf(declarationFallback, secondDeclarationFallback),
                    200,
                    "application/json",
                )?.typeTag,
        )
    }

    @Test
    fun bodylessExecutionWithNoDeclaredResponseMediaTypeReturnsUnitAndClosesResponseBody() {
        val responseBody = ClassificationRecordingStream(listOf(ByteArray(0)))
        val transport = ClassificationRecordingTransport(SdkResponse(204, emptyList(), responseBody))
        val metadata =
            baseMetadata().copy(
                requestMediaTypes = emptyList(),
                responseMediaTypes = emptyList(),
                successStatusCodes = setOf(204),
            )

        val result =
            runSuspendForClassificationTest {
                SdkExecutor(transport).executeBodyless(
                    request = SdkExecutionRequest(metadata, "https://example.test", Unit, emptyList()),
                    requestCodecs = MediaTypeCodecRegistry.of(),
                )
            }

        assertEquals(Unit, result)
        assertTrue(responseBody.closed)
    }

    @Test
    fun rawExecutionWithNoDeclaredRequestCodecTransfersStreamOwnershipToCaller() {
        val responseBody = ClassificationRecordingStream(listOf("binary".encodeToByteArray()))
        val transport = ClassificationRecordingTransport(SdkResponse(200, emptyList(), responseBody))
        val metadata =
            baseMetadata().copy(
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/octet-stream"),
            )

        val result =
            runSuspendForClassificationTest {
                SdkExecutor(transport).executeRaw(
                    request = SdkExecutionRequest(metadata, "https://example.test", Unit, emptyList()),
                    requestCodecs = MediaTypeCodecRegistry.of(),
                )
            }

        assertSame(responseBody, result)
        assertFalse(responseBody.closed)
    }

    @Test
    fun bodylessExecutionKeepsApiFailureClassificationAndClosesWithFailure() {
        val responseBody = ClassificationRecordingStream(emptyList())
        val transport = ClassificationRecordingTransport(SdkResponse(503, emptyList(), responseBody))
        val metadata =
            baseMetadata().copy(
                requestMediaTypes = emptyList(),
                responseMediaTypes = emptyList(),
                successStatusCodes = setOf(204),
            )

        val failure =
            assertFailsWith<SdkApiException> {
                runSuspendForClassificationTest {
                    SdkExecutor(transport).executeBodyless(
                        request = SdkExecutionRequest(metadata, "https://example.test", Unit, emptyList()),
                        requestCodecs = MediaTypeCodecRegistry.of(),
                    )
                }
            }

        assertEquals(503, failure.statusCode)
        assertTrue(responseBody.closed)
        assertSame(failure, responseBody.lastCloseCause)
    }

    @Test
    fun rawExecutionKeepsApiFailureClassificationAndDoesNotTransferFailedBody() {
        val responseBody = ClassificationRecordingStream(emptyList())
        val transport = ClassificationRecordingTransport(SdkResponse(503, emptyList(), responseBody))
        val metadata =
            baseMetadata().copy(
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/octet-stream"),
                successStatusCodes = setOf(200),
            )

        val failure =
            assertFailsWith<SdkApiException> {
                runSuspendForClassificationTest {
                    SdkExecutor(transport).executeRaw(
                        request = SdkExecutionRequest(metadata, "https://example.test", Unit, emptyList()),
                        requestCodecs = MediaTypeCodecRegistry.of(),
                    )
                }
            }

        assertEquals(503, failure.statusCode)
        assertTrue(responseBody.closed)
        assertSame(failure, responseBody.lastCloseCause)
    }

    @Test
    fun bodylessExecutionRetriesThroughTheSharedPipeline() {
        val failedBody = ClassificationRecordingStream(emptyList())
        val successfulBody = ClassificationRecordingStream(emptyList())
        val transport =
            ClassificationScriptedTransport(
                listOf(
                    SdkResponse(503, emptyList(), failedBody),
                    SdkResponse(204, emptyList(), successfulBody),
                ),
            )
        val metadata =
            baseMetadata().copy(
                requestMediaTypes = emptyList(),
                responseMediaTypes = emptyList(),
                successStatusCodes = setOf(204),
                safety = OperationSafety(safe = true),
                retry = RetryDescriptor(retryableStatusCodes = listOf(ResponseSelector.ExactStatus(503))),
            )

        val result =
            runSuspendForClassificationTest {
                SdkExecutor(transport, delayer = SdkDelayer { _ -> }).executeBodyless(
                    request = SdkExecutionRequest(metadata, "https://example.test", Unit, emptyList()),
                    requestCodecs = MediaTypeCodecRegistry.of(),
                )
            }

        assertEquals(Unit, result)
        assertEquals(2, transport.requestCount)
        assertTrue(failedBody.closed)
        assertTrue(successfulBody.closed)
    }

    @Test
    fun rawExecutionRetriesThroughTheSharedPipeline() {
        val failedBody = ClassificationRecordingStream(emptyList())
        val successfulBody = ClassificationRecordingStream(emptyList())
        val transport =
            ClassificationScriptedTransport(
                listOf(
                    SdkResponse(503, emptyList(), failedBody),
                    SdkResponse(200, emptyList(), successfulBody),
                ),
            )
        val metadata =
            baseMetadata().copy(
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/octet-stream"),
                safety = OperationSafety(safe = true),
                retry = RetryDescriptor(retryableStatusCodes = listOf(ResponseSelector.ExactStatus(503))),
            )

        val result =
            runSuspendForClassificationTest {
                SdkExecutor(transport, delayer = SdkDelayer { _ -> }).executeRaw(
                    request = SdkExecutionRequest(metadata, "https://example.test", Unit, emptyList()),
                    requestCodecs = MediaTypeCodecRegistry.of(),
                )
            }

        assertSame(successfulBody, result)
        assertEquals(2, transport.requestCount)
        assertTrue(failedBody.closed)
        assertFalse(successfulBody.closed)
    }

    @Test
    fun bodylessExecutionReturnsUnitAndClosesResponseBody() {
        val responseBody = ClassificationRecordingStream(listOf(ByteArray(0)))
        val transport = ClassificationRecordingTransport(SdkResponse(204, emptyList(), responseBody))
        val metadata =
            baseMetadata().copy(
                requestMediaTypes = emptyList(),
                responseMediaTypes = emptyList(),
                successStatusCodes = setOf(204),
            )

        val result =
            runSuspendForClassificationTest {
                SdkExecutor(transport).executeBodyless(
                    request =
                        SdkExecutionRequest(
                            metadata = metadata,
                            baseUri = "https://example.test",
                            requestValue = Unit,
                            requestCodecIds = emptyList(),
                        ),
                    requestCodecs = MediaTypeCodecRegistry.of(),
                )
            }

        assertEquals(Unit, result)
        assertTrue(responseBody.closed)
    }

    @Test
    fun rawResponseTransfersStreamOwnershipToCaller() {
        val responseBody = ClassificationRecordingStream(listOf("binary".encodeToByteArray()))
        val transport = ClassificationRecordingTransport(SdkResponse(200, emptyList(), responseBody))
        val metadata =
            baseMetadata().copy(
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/octet-stream"),
            )

        val result =
            runSuspendForClassificationTest {
                SdkExecutor(transport).executeRaw(
                    request =
                        SdkExecutionRequest(
                            metadata = metadata,
                            baseUri = "https://example.test",
                            requestValue = Unit,
                            requestCodecIds = emptyList(),
                        ),
                    requestCodecs = MediaTypeCodecRegistry.of(),
                )
            }

        assertSame(responseBody, result)
        assertFalse(responseBody.closed)
    }

    @Test
    fun rawUploadBecomesOneShotRequestBodyWithoutASerializationCodec() {
        val requestBody = ClassificationRecordingStream(emptyList())
        val responseBody = ClassificationRecordingStream(emptyList())
        val transport = ClassificationRecordingTransport(SdkResponse(204, emptyList(), responseBody))
        val metadata =
            baseMetadata().copy(
                requestMediaTypes = listOf("application/octet-stream"),
                responseMediaTypes = emptyList(),
                successStatusCodes = setOf(204),
            )

        runSuspendForClassificationTest {
            SdkExecutor(transport).executeBodyless(
                request =
                    SdkExecutionRequest(
                        metadata = metadata,
                        baseUri = "https://example.test",
                        requestValue = requestBody,
                        requestCodecIds = emptyList(),
                    ),
                requestCodecs = MediaTypeCodecRegistry.of(),
            )
        }

        val body = transport.lastRequest?.body
        assertTrue(body is SdkRequestBody.OneShot)
        assertSame(requestBody, body.stream)
        assertTrue(responseBody.closed)
    }

    @Test
    fun withResponseKeepsTwoHundredSuccessTypedAndDoesNotUseLegacySuccessPath() {
        val result =
            executeWithResponse(
                metadata =
                    baseMetadata().copy(
                        successStatusCodes = emptySet(),
                        responseAlternatives =
                            listOf(
                                ResponseAlternative(
                                    ResponseSelector.ExactStatus(200),
                                    listOf("application/json"),
                                    typeTag = "SuccessType",
                                ),
                                ResponseAlternative(
                                    ResponseSelector.StatusRange(400, 499),
                                    listOf("application/json"),
                                    typeTag = "ErrorType",
                                ),
                            ),
                    ),
                statusCode = 200,
            )

        assertTrue(result is SdkResponseResult.Matched<*>)
        val matched = result as SdkResponseResult.Matched<*>
        assertEquals("SuccessType", matched.alternative.typeTag)
        assertEquals("SuccessType", matched.value)
    }

    @Test
    fun withResponseKeepsNonSuccessRangeTypedAndNeverConvertsItToSuccess() {
        val result =
            executeWithResponse(
                metadata =
                    baseMetadata().copy(
                        successStatusCodes = emptySet(),
                        responseAlternatives =
                            listOf(
                                ResponseAlternative(
                                    ResponseSelector.ExactStatus(200),
                                    listOf("application/json"),
                                    typeTag = "SuccessType",
                                ),
                                ResponseAlternative(
                                    ResponseSelector.StatusRange(400, 499),
                                    listOf("application/json"),
                                    typeTag = "ErrorType",
                                ),
                                ResponseAlternative(
                                    ResponseSelector.Default,
                                    listOf("application/json"),
                                    typeTag = "DefaultType",
                                ),
                            ),
                    ),
                statusCode = 404,
            )

        assertTrue(result is SdkResponseResult.Matched<*>)
        val matched = result as SdkResponseResult.Matched<*>
        assertEquals("ErrorType", matched.alternative.typeTag)
        assertEquals("ErrorType", matched.value)
    }

    @Test
    fun withResponseUsesDefaultForMappedStatusAndUnknownForUnmappedStatus() {
        val defaultResult =
            executeWithResponse(
                metadata =
                    baseMetadata().copy(
                        responseAlternatives =
                            listOf(
                                ResponseAlternative(
                                    ResponseSelector.ExactStatus(200),
                                    listOf("application/json"),
                                    typeTag = "SuccessType",
                                ),
                                ResponseAlternative(
                                    ResponseSelector.Default,
                                    listOf("application/json"),
                                    typeTag = "DefaultType",
                                ),
                            ),
                    ),
                statusCode = 503,
            )
        assertTrue(defaultResult is SdkResponseResult.Matched<*>)
        assertEquals("DefaultType", (defaultResult as SdkResponseResult.Matched<*>).value)

        val unknownResult =
            executeWithResponse(
                metadata =
                    baseMetadata().copy(
                        responseAlternatives =
                            listOf(
                                ResponseAlternative(
                                    ResponseSelector.ExactStatus(200),
                                    listOf("application/json"),
                                    typeTag = "SuccessType",
                                ),
                            ),
                    ),
                statusCode = 503,
            )
        assertTrue(unknownResult is SdkResponseResult.Unknown<*>)
        assertEquals("unknown", (unknownResult as SdkResponseResult.Unknown<*>).value)
    }

    @Test
    fun withResponseTransfersRawStreamOwnershipForBinarySuccessAlternative() {
        val responseBody = ClassificationRecordingStream(listOf("binary".encodeToByteArray()))
        val transport = ClassificationRecordingTransport(SdkResponse(200, emptyList(), responseBody))
        val metadata =
            baseMetadata().copy(
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/octet-stream"),
                responseAlternatives =
                    listOf(
                        ResponseAlternative(
                            ResponseSelector.ExactStatus(200),
                            listOf("application/octet-stream"),
                            typeTag = "Binary",
                        ),
                        ResponseAlternative(
                            ResponseSelector.StatusRange(400, 499),
                            listOf("application/json"),
                            typeTag = "Error",
                        ),
                        ResponseAlternative(ResponseSelector.Default, emptyList(), typeTag = "Default"),
                    ),
            )
        val decoder =
            object : SdkResponseAlternativeDecoder<Any> {
                override suspend fun decode(
                    alternative: ResponseAlternative,
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                    mediaType: String?,
                ): Any = if (alternative.typeTag == "Binary") body else "error"

                override suspend fun decodeWithBody(
                    alternative: ResponseAlternative,
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                    mediaType: String?,
                ): SdkResponseDecodeResult<Any> =
                    SdkResponseDecodeResult(
                        value = if (alternative.typeTag == "Binary") body else "error",
                        transferBody = alternative.typeTag == "Binary",
                    )

                override suspend fun decodeUnknown(
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                ): Any = "unknown"
            }

        val result =
            runSuspendForClassificationTest {
                SdkExecutor(transport).executeWithResponse<Unit, Any>(
                    request =
                        SdkExecutionRequest(
                            metadata = metadata,
                            baseUri = "https://example.test",
                            requestValue = Unit,
                            requestCodecIds = emptyList(),
                        ),
                    requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                    responseDecoder = decoder,
                )
            }

        val matched = result as SdkResponseResult.Matched<*>
        assertEquals("Binary", matched.alternative.typeTag)
        assertSame(responseBody, matched.value)
        assertFalse(responseBody.closed)
    }

    @Test
    fun withResponseTransfersBodyForExplicitNonTwoXxSuccessWhenGeneratedWrapperDeclaresTransfer() {
        val responseBody = ClassificationRecordingStream(listOf("binary".encodeToByteArray()))
        val transport =
            ClassificationRecordingTransport(
                SdkResponse(
                    304,
                    listOf(SdkHeader("Content-Type", "application/octet-stream")),
                    responseBody,
                ),
            )
        val metadata =
            baseMetadata().copy(
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/octet-stream"),
                successStatusCodes = setOf(304),
                responseAlternatives =
                    listOf(
                        ResponseAlternative(
                            selector = ResponseSelector.ExactStatus(304),
                            mediaTypes = listOf("application/octet-stream"),
                            typeTag = "Binary",
                            id = "binary",
                        ),
                    ),
            )
        val decoder =
            object : SdkResponseAlternativeDecoder<WrappedBinaryResponse> {
                override suspend fun decode(
                    alternative: ResponseAlternative,
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                    mediaType: String?,
                ): WrappedBinaryResponse = WrappedBinaryResponse(body)

                override suspend fun decodeWithBody(
                    alternative: ResponseAlternative,
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                    mediaType: String?,
                ): SdkResponseDecodeResult<WrappedBinaryResponse> =
                    SdkResponseDecodeResult(
                        value = WrappedBinaryResponse(body),
                        transferBody = true,
                    )

                override suspend fun decodeUnknown(
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                ): WrappedBinaryResponse = WrappedBinaryResponse(body)
            }

        val result =
            runSuspendForClassificationTest {
                SdkExecutor(transport).executeWithResponse<Unit, WrappedBinaryResponse>(
                    request =
                        SdkExecutionRequest(
                            metadata = metadata,
                            baseUri = "https://example.test",
                            requestValue = Unit,
                            requestCodecIds = emptyList(),
                        ),
                    requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                    responseDecoder = decoder,
                )
            }

        val matched = result as SdkResponseResult.Matched<*>
        assertSame(responseBody, (matched.value as WrappedBinaryResponse).body)
        assertFalse(responseBody.closed)
    }

    @Test
    fun withResponseSelectsSameStatusAlternativesByNormalizedContentTypeInEitherOrder() {
        val json =
            ResponseAlternative(
                selector = ResponseSelector.ExactStatus(200),
                mediaTypes = listOf("application/json"),
                typeTag = "Json",
                id = "json",
            )
        val binary =
            ResponseAlternative(
                selector = ResponseSelector.ExactStatus(200),
                mediaTypes = listOf("application/octet-stream"),
                typeTag = "Binary",
                id = "binary",
            )
        val cases =
            listOf(
                listOf(json, binary) to ("Application/JSON; charset=utf-8" to "Json"),
                listOf(binary, json) to ("Application/JSON; charset=utf-8" to "Json"),
                listOf(json, binary) to ("APPLICATION/OCTET-STREAM; version=1" to "Binary"),
                listOf(binary, json) to ("APPLICATION/OCTET-STREAM; version=1" to "Binary"),
            )

        cases.forEach { (alternatives, contentTypeAndExpected) ->
            val (contentType, expectedType) = contentTypeAndExpected
            val responseBody = ClassificationRecordingStream(emptyList())
            val transport =
                ClassificationRecordingTransport(
                    SdkResponse(
                        200,
                        listOf(SdkHeader("Content-Type", contentType)),
                        responseBody,
                    ),
                )
            val decoder =
                object : SdkResponseAlternativeDecoder<String> {
                    override suspend fun decode(
                        alternative: ResponseAlternative,
                        statusCode: Int,
                        headers: List<SdkHeader>,
                        body: SdkByteStream,
                        mediaType: String?,
                    ): String = alternative.typeTag.orEmpty()

                    override suspend fun decodeUnknown(
                        statusCode: Int,
                        headers: List<SdkHeader>,
                        body: SdkByteStream,
                    ): String = "unknown"
                }
            val result =
                runSuspendForClassificationTest {
                    SdkExecutor(transport).executeWithResponse<Unit, String>(
                        request =
                            SdkExecutionRequest(
                                metadata =
                                    baseMetadata().copy(
                                        requestMediaTypes = emptyList(),
                                        responseMediaTypes = listOf("application/json", "application/octet-stream"),
                                        responseAlternatives = alternatives,
                                    ),
                                baseUri = "https://example.test",
                                requestValue = Unit,
                                requestCodecIds = emptyList(),
                            ),
                        requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                        responseDecoder = decoder,
                    )
                }

            val matched = result as SdkResponseResult.Matched<*>
            assertEquals(expectedType, matched.alternative.typeTag)
            assertEquals(expectedType, matched.value)
            assertTrue(responseBody.closed)
        }
    }

    @Test
    fun withResponseClosesBodyAfterUnknownAlternativeDecoding() {
        val responseBody = ClassificationRecordingStream(listOf("unknown".encodeToByteArray()))
        val transport = ClassificationRecordingTransport(SdkResponse(503, emptyList(), responseBody))
        val metadata =
            baseMetadata().copy(
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/json"),
                responseAlternatives =
                    listOf(
                        ResponseAlternative(
                            ResponseSelector.ExactStatus(200),
                            listOf("application/json"),
                            typeTag = "Success",
                        ),
                    ),
            )
        val decoder =
            object : SdkResponseAlternativeDecoder<String> {
                override suspend fun decode(
                    alternative: ResponseAlternative,
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                    mediaType: String?,
                ): String = "success"

                override suspend fun decodeUnknown(
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                ): String = "unknown"
            }

        val result =
            runSuspendForClassificationTest {
                SdkExecutor(transport).executeWithResponse<Unit, String>(
                    request =
                        SdkExecutionRequest(
                            metadata = metadata,
                            baseUri = "https://example.test",
                            requestValue = Unit,
                            requestCodecIds = emptyList(),
                        ),
                    requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                    responseDecoder = decoder,
                )
            }

        assertEquals("unknown", (result as SdkResponseResult.Unknown<*>).value)
        assertTrue(responseBody.closed)
    }

    @Test
    fun withResponseClosesBodyAfterTypedErrorAlternativeDecoding() {
        val responseBody = ClassificationRecordingStream(listOf("error".encodeToByteArray()))
        val transport = ClassificationRecordingTransport(SdkResponse(404, emptyList(), responseBody))
        val metadata =
            baseMetadata().copy(
                requestMediaTypes = emptyList(),
                responseMediaTypes = listOf("application/octet-stream"),
                responseAlternatives =
                    listOf(
                        ResponseAlternative(
                            ResponseSelector.ExactStatus(200),
                            listOf("application/octet-stream"),
                            typeTag = "Binary",
                        ),
                        ResponseAlternative(
                            ResponseSelector.StatusRange(400, 499),
                            listOf("application/json"),
                            typeTag = "Error",
                        ),
                    ),
            )
        val decoder =
            object : SdkResponseAlternativeDecoder<String> {
                override suspend fun decode(
                    alternative: ResponseAlternative,
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                    mediaType: String?,
                ): String {
                    assertEquals("application/json", mediaType)
                    return body.readChunk()?.decodeToString().orEmpty()
                }

                override suspend fun decodeWithBody(
                    alternative: ResponseAlternative,
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                    mediaType: String?,
                ): SdkResponseDecodeResult<String> =
                    SdkResponseDecodeResult(
                        value = decode(alternative, statusCode, headers, body, mediaType),
                        transferBody = true,
                    )

                override suspend fun decodeUnknown(
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                ): String = "unknown"
            }

        val result =
            runSuspendForClassificationTest {
                SdkExecutor(transport).executeWithResponse<Unit, String>(
                    request =
                        SdkExecutionRequest(
                            metadata = metadata,
                            baseUri = "https://example.test",
                            requestValue = Unit,
                            requestCodecIds = emptyList(),
                        ),
                    requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                    responseDecoder = decoder,
                )
            }

        assertEquals("error", (result as SdkResponseResult.Matched<*>).value)
        assertTrue(responseBody.closed)
    }

    private fun executeWithResponse(
        metadata: OperationMetadata,
        statusCode: Int,
    ): SdkResponseResult<String> {
        val responseBody = ClassificationRecordingStream(listOf("ignored".encodeToByteArray()))
        val transport = ClassificationRecordingTransport(SdkResponse(statusCode, emptyList(), responseBody))
        val codec = ClassificationStringCodec
        val codecs = MediaTypeCodecRegistry.of(codec)
        val decoder =
            object : SdkResponseAlternativeDecoder<String> {
                override suspend fun decode(
                    alternative: ResponseAlternative,
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                    mediaType: String?,
                ): String = alternative.typeTag.orEmpty()

                override suspend fun decodeUnknown(
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                ): String = "unknown"
            }
        return runSuspendForClassificationTest {
            SdkExecutor(transport).executeWithResponse(
                request =
                    SdkExecutionRequest(
                        metadata = metadata,
                        baseUri = "https://example.test",
                        requestValue = "request",
                        requestCodecIds = listOf("json"),
                    ),
                requestCodecs = codecs,
                responseDecoder = decoder,
            )
        }
    }

    private fun baseMetadata(): OperationMetadata =
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

    private fun unknownFailure(chunks: List<ByteArray>): UnknownApiException {
        val body = ClassificationRecordingStream(chunks)
        val transport = ClassificationRecordingTransport(SdkResponse(599, emptyList(), body))
        val metadata =
            baseMetadata().copy(
                successStatusCodes = emptySet(),
                responseAlternatives =
                    listOf(ResponseAlternative(ResponseSelector.ExactStatus(200), listOf("application/json"))),
            )
        return assertFailsWith {
            runSuspendForClassificationTest {
                SdkExecutor(transport).execute(
                    request = SdkExecutionRequest(metadata, "https://example.test", "request", listOf("json")),
                    responseCodecIds = listOf("json"),
                    requestCodecs = MediaTypeCodecRegistry.of(ClassificationStringCodec),
                    responseCodecs = MediaTypeCodecRegistry.of(ClassificationStringCodec),
                )
            }
        }
    }

    private fun execute(
        metadata: OperationMetadata,
        statusCode: Int,
    ): String {
        val responseBody = ClassificationRecordingStream(listOf("ok".encodeToByteArray()))
        val transport =
            ClassificationRecordingTransport(SdkResponse(statusCode, emptyList(), responseBody))
        val codec = ClassificationStringCodec
        val codecs = MediaTypeCodecRegistry.of(codec)
        val executor = SdkExecutor(transport)

        return runSuspendForClassificationTest {
            executor.execute(
                request =
                    SdkExecutionRequest(
                        metadata = metadata,
                        baseUri = "https://example.test",
                        requestValue = "request",
                        requestCodecIds = listOf("json"),
                    ),
                responseCodecIds = listOf("json"),
                requestCodecs = codecs,
                responseCodecs = codecs,
            )
        }
    }
}

private object ClassificationStringCodec : MediaTypeCodec<String> {
    override val id: String = "json"
    override val mediaTypes: Set<String> = setOf("application/json")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody = SdkRequestBody.Bytes(value.encodeToByteArray(), mediaType)

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String =
        buildList {
            while (true) add(body.readChunk() ?: break)
        }.fold(ByteArray(0), ByteArray::plus).decodeToString()
}

private data class WrappedBinaryResponse(
    val body: SdkByteStream,
)

private class ClassificationScriptedTransport(
    responses: List<SdkResponse>,
) : SdkTransport {
    private val remaining = responses.toMutableList()
    var requestCount: Int = 0
        private set

    override suspend fun execute(request: SdkRequest): SdkResponse {
        requestCount += 1
        return remaining.removeFirst()
    }
}

private class ClassificationRecordingTransport(
    private val response: SdkResponse,
) : SdkTransport {
    var lastRequest: SdkRequest? = null

    override suspend fun execute(request: SdkRequest): SdkResponse {
        lastRequest = request
        return response
    }
}

private class ClassificationRecordingStream(
    chunks: List<ByteArray>,
) : SdkByteStream {
    private val remaining = chunks.toMutableList()
    var closed: Boolean = false
        private set
    var lastCloseCause: Throwable? = null
        private set
    var bytesRequested: Int = 0
        private set

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        require(maxBytes > 0)
        bytesRequested += maxBytes
        val chunk = remaining.removeFirstOrNull() ?: return null
        if (chunk.size <= maxBytes) return chunk
        remaining.add(0, chunk.copyOfRange(maxBytes, chunk.size))
        return chunk.copyOf(maxBytes)
    }

    override fun close(cause: Throwable?) {
        closed = true
        lastCloseCause = cause
    }
}

private fun <T> runSuspendForClassificationTest(block: suspend () -> T): T {
    var outcome: Result<T>? = null
    block.startCoroutine(
        object : Continuation<T> {
            override val context = EmptyCoroutineContext

            override fun resumeWith(result: Result<T>) {
                outcome = result
            }
        },
    )
    return requireNotNull(outcome).getOrThrow()
}
