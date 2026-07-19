package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.observation.AttemptOutcomeSignal
import com.nabobery.sdkgen.runtime.observation.SdkLifecycleObserver
import com.nabobery.sdkgen.runtime.observation.SdkOutcomeKind
import kotlin.coroutines.cancellation.CancellationException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame

/**
 * Item 1 (review ruling): callStarted fires at logical-call entry, immediately after options/observer resolution
 * and BEFORE validation, encoding, hooks, idempotency generation, and capability preflight; every terminal path
 * (including these early ones) routes through callCompleted (+callFailed) with the correct SdkOutcomeKind.
 */
internal class EarlyTerminalObservationTest {
    @Test
    fun validationFailureIsObservedAsConfigurationError() {
        val observer = RecordingObserver()
        val transport = ScriptedTransport().response(200)
        val codecs = MediaTypeCodecRegistry.of(EarlyStringCodec)
        val executor = SdkExecutor(transport = transport, observers = listOf(observer))

        assertFailsWith<SdkConfigurationException> {
            runTestSuspend {
                executor.execute(
                    request =
                        SdkExecutionRequest(
                            // blank operationId -> validate() fails
                            metadata = metadata(operationId = ""),
                            baseUri = "https://example.test",
                            requestValue = "request",
                            requestCodecIds = listOf("text"),
                        ),
                    responseCodecIds = listOf("text"),
                    requestCodecs = codecs,
                    responseCodecs = codecs,
                )
            }
        }

        assertEquals(
            listOf("callStarted", "callCompleted(CONFIGURATION_ERROR)", "callFailed(CONFIGURATION_ERROR)"),
            observer.events,
        )
    }

    @Test
    fun encodeFailureIsObservedAsSerializationError() {
        val observer = RecordingObserver()
        val transport = ScriptedTransport().response(200)
        val codecs = MediaTypeCodecRegistry.of(ThrowingEncodeStringCodec)
        val executor = SdkExecutor(transport = transport, observers = listOf(observer))

        assertFailsWith<SdkSerializationException> {
            runTestSuspend {
                executor.execute(
                    request =
                        SdkExecutionRequest(
                            metadata = metadata(),
                            baseUri = "https://example.test",
                            requestValue = "request",
                            requestCodecIds = listOf("text"),
                        ),
                    responseCodecIds = listOf("text"),
                    requestCodecs = codecs,
                    responseCodecs = codecs,
                )
            }
        }

        assertEquals(
            listOf("callStarted", "callCompleted(SERIALIZATION_ERROR)", "callFailed(SERIALIZATION_ERROR)"),
            observer.events,
        )
    }

    @Test
    fun capabilityPreflightFailureIsObservedAsCapabilityError() {
        val observer = RecordingObserver()
        val transport = NonStreamingTransport
        val codecs = MediaTypeCodecRegistry.of(EarlyStringCodec)
        val executor = SdkExecutor(transport = transport, observers = listOf(observer))

        assertFailsWith<SdkCapabilityException> {
            runTestSuspend {
                executor.execute(
                    request =
                        SdkExecutionRequest(
                            metadata = metadata(responseMode = SdkResponseMode.STREAMING),
                            baseUri = "https://example.test",
                            requestValue = "request",
                            requestCodecIds = listOf("text"),
                        ),
                    responseCodecIds = listOf("text"),
                    requestCodecs = codecs,
                    responseCodecs = codecs,
                )
            }
        }

        assertEquals(
            listOf("callStarted", "callCompleted(CAPABILITY_ERROR)", "callFailed(CAPABILITY_ERROR)"),
            observer.events,
        )
    }

    @Test
    fun hookCancellationIsObservedAndRethrownByIdentity() {
        val observer = RecordingObserver()
        val transport = ScriptedTransport().response(200)
        val codecs = MediaTypeCodecRegistry.of(EarlyStringCodec)
        val cancellation = CancellationException("cancel in hook")
        val cancellingHook = SdkRequestHook { throw cancellation }
        val executor = SdkExecutor(transport = transport, requestHook = cancellingHook, observers = listOf(observer))

        val thrown =
            assertFailsWith<CancellationException> {
                runTestSuspend {
                    executor.execute(
                        request =
                            SdkExecutionRequest(
                                metadata = metadata(),
                                baseUri = "https://example.test",
                                requestValue = "request",
                                requestCodecIds = listOf("text"),
                            ),
                        responseCodecIds = listOf("text"),
                        requestCodecs = codecs,
                        responseCodecs = codecs,
                    )
                }
            }

        assertSame(cancellation, thrown)
        assertEquals(
            listOf("callStarted", "callCompleted(CANCELLED)", "callFailed(CANCELLED)"),
            observer.events,
        )
    }

    private fun metadata(
        operationId: String = "op",
        responseMode: SdkResponseMode = SdkResponseMode.BUFFERED,
    ): OperationMetadata =
        OperationMetadata(
            operationId = operationId,
            method = "GET",
            path = "/op",
            requestMediaTypes = listOf("text/plain"),
            responseMediaTypes = listOf("text/plain"),
            successStatusCodes = setOf(200),
            responseMode = responseMode,
            deadlines = SdkDeadlines(null, null, null),
            safety = OperationSafety(safe = true),
        )
}

private class RecordingObserver : SdkLifecycleObserver {
    val events = mutableListOf<String>()

    override fun callStarted(
        callId: String,
        operationId: String,
        method: String,
        normalizedRoute: String,
    ) {
        events += "callStarted"
    }

    override fun attemptStarted(
        callId: String,
        attemptNumber: Int,
    ) {
        events += "attemptStarted($attemptNumber)"
    }

    override fun attemptCompleted(
        callId: String,
        attemptNumber: Int,
        outcome: AttemptOutcomeSignal,
        durationMillis: Long,
    ) {
        events += "attemptCompleted($attemptNumber)"
    }

    override fun callCompleted(
        callId: String,
        outcome: SdkOutcomeKind,
        totalAttempts: Int,
        durationMillis: Long,
    ) {
        events += "callCompleted($outcome)"
    }

    override fun callFailed(
        callId: String,
        kind: SdkOutcomeKind,
    ) {
        events += "callFailed($kind)"
    }
}

private object NonStreamingTransport : SdkTransport {
    override fun capabilities(): TransportCapabilities = TransportCapabilities(supportsStreaming = false)

    override suspend fun execute(request: SdkRequest): SdkResponse = error("must not be called")
}

private object EarlyStringCodec : MediaTypeCodec<String> {
    override val id: String = "text"
    override val mediaTypes: Set<String> = setOf("text/plain")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody = SdkRequestBody.Bytes(value.encodeToByteArray(), mediaType)

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String = body.readChunk()?.decodeToString().orEmpty()
}

private object ThrowingEncodeStringCodec : MediaTypeCodec<String> {
    override val id: String = "text"
    override val mediaTypes: Set<String> = setOf("text/plain")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody = error("encode failed")

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String = body.readChunk()?.decodeToString().orEmpty()
}
