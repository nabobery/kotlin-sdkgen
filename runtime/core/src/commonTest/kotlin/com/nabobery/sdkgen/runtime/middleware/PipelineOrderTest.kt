package com.nabobery.sdkgen.runtime.middleware

import com.nabobery.sdkgen.runtime.AttemptClassification
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.DeterministicTime
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.ScriptedTransport
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkRequestHook
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkSerializationException
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.TransportCapabilities
import com.nabobery.sdkgen.runtime.firstValue
import com.nabobery.sdkgen.runtime.observation.AttemptOutcomeSignal
import com.nabobery.sdkgen.runtime.observation.SdkLifecycleObserver
import com.nabobery.sdkgen.runtime.observation.SdkOutcomeKind
import com.nabobery.sdkgen.runtime.runTestSuspend
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

/**
 * Asserts the deterministic pipeline order published as [SdkExecutor.PIPELINE_ORDER] is what actually runs, by
 * having a recording middleware and a recording observer both append into one shared, ordered log.
 */
internal class PipelineOrderTest {
    @Test
    fun observedOrderIsUserMutationThenLogicalMiddlewareThenAttemptMiddlewareThenTransport() {
        val transport = ScriptedTransport().response(200)
        val log = mutableListOf<String>()

        val requestHook =
            SdkRequestHook { request ->
                log += "user-mutation"
                request
            }
        val logicalRecorder =
            object : LogicalMiddleware {
                override suspend fun <T> intercept(
                    call: LogicalCallContext,
                    proceed: suspend (LogicalCallContext) -> LogicalOutcome<T>,
                ): LogicalOutcome<T> {
                    log += "logical-middleware"
                    return proceed(call)
                }
            }
        val attemptRecorder =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    log += "attempt-middleware"
                    return proceed(call)
                }
            }
        val observer =
            object : SdkLifecycleObserver {
                override fun callStarted(
                    callId: String,
                    operationId: String,
                    method: String,
                    normalizedRoute: String,
                ) {
                    log += "call-started"
                }

                override fun attemptStarted(
                    callId: String,
                    attemptNumber: Int,
                ) {
                    log += "attempt-started"
                }

                override fun attemptCompleted(
                    callId: String,
                    attemptNumber: Int,
                    outcome: AttemptOutcomeSignal,
                    durationMillis: Long,
                ) {
                    log += "attempt-completed"
                }

                override fun callCompleted(
                    callId: String,
                    outcome: SdkOutcomeKind,
                    totalAttempts: Int,
                    durationMillis: Long,
                ) {
                    log += "call-completed"
                }
            }

        val codecs = MediaTypeCodecRegistry.of(PipelineOrderStringCodec)
        val executor =
            SdkExecutor(
                transport = transport,
                requestHook = requestHook,
                logicalMiddleware = listOf(logicalRecorder),
                attemptMiddleware = listOf(attemptRecorder),
                observers = listOf(observer),
            )
        val result =
            runTestSuspend {
                executor.execute(
                    request =
                        SdkExecutionRequest(
                            metadata =
                                OperationMetadata(
                                    operationId = "op",
                                    method = "GET",
                                    path = "/op",
                                    requestMediaTypes = listOf("text/plain"),
                                    responseMediaTypes = listOf("text/plain"),
                                    successStatusCodes = setOf(200),
                                    responseMode = SdkResponseMode.BUFFERED,
                                    deadlines = SdkDeadlines(null, null, null),
                                    safety = OperationSafety(safe = true),
                                ),
                            baseUri = "https://example.test",
                            requestValue = "request",
                            requestCodecIds = listOf("text"),
                        ),
                    responseCodecIds = listOf("text"),
                    requestCodecs = codecs,
                    responseCodecs = codecs,
                    options = CallOptions(headers = listOf(SdkHeader("Accept", "text/plain"))),
                )
            }

        assertEquals("ok", result)
        assertEquals(
            listOf(
                // Item 1 (W2-T8 review): callStarted fires at logical-call entry, before user mutation runs.
                "call-started",
                "user-mutation",
                "logical-middleware",
                "attempt-started",
                "attempt-middleware",
                "attempt-completed",
                "call-completed",
            ),
            log,
        )
    }

    /**
     * Item 7 (review ruling): extends pipeline-order coverage past the previous test's scope (which stopped at
     * "attempt middleware then transport") to also cover retry entry, SDK identification, authentication, transport,
     * decoding, and response closure - across a 503 -> 200 retry, so both physical attempts are exercised - plus
     * that client-level and per-call observers both fire, and that a request/header replacement made by a
     * middleware actually reaches authentication.
     */
    @Test
    fun observedOrderAcrossRetrySpansAllPipelineStages() {
        val stageLog = mutableListOf<String>()
        val transport = StageLoggingTransport(stageLog, statuses = listOf(503, 200))
        val time = DeterministicTime()

        val requestHook =
            SdkRequestHook { request ->
                stageLog += "user-mutation"
                request
            }
        val logicalRecorder =
            object : LogicalMiddleware {
                override suspend fun <T> intercept(
                    call: LogicalCallContext,
                    proceed: suspend (LogicalCallContext) -> LogicalOutcome<T>,
                ): LogicalOutcome<T> {
                    stageLog += "logical-middleware"
                    return proceed(call)
                }
            }
        val attemptRecorder =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    stageLog += "attempt-middleware"
                    // Replace the URI and add a header; reaching authentication proves middleware-level request
                    // replacement flows all the way down the pipeline (item 7's URI/header-replacement coverage).
                    val replaced =
                        call.request.copy(
                            uri = call.request.uri + "?traced=1",
                            headers = call.request.headers + SdkHeader("X-Traced", "true"),
                        )
                    return proceed(call.copy(request = replaced))
                }
            }
        val authentication = StageLoggingAuthentication(stageLog, productToken = "my-sdk/9.9.9")
        // Only clientObserver contributes to the shared stageLog, so the full-order assertion below reflects one
        // canonical stream; perCallObserver's own event list is compared against clientObserver's separately to
        // prove both observers actually fire (item 7's "client+per-call observers both firing" coverage) without
        // duplicating every entry in stageLog.
        val clientObserver = StageAndEventRecordingObserver(stageLog, contributesToStageLog = true)
        val perCallObserver = StageAndEventRecordingObserver(stageLog, contributesToStageLog = false)

        val codecs = MediaTypeCodecRegistry.of(StageLoggingCodec(stageLog))
        val executor =
            SdkExecutor(
                transport = transport,
                authentication = authentication,
                requestHook = requestHook,
                clock = time,
                wallClock = time,
                delayer = time,
                random = time,
                logicalMiddleware = listOf(logicalRecorder),
                attemptMiddleware = listOf(attemptRecorder),
                observers = listOf(clientObserver),
                productToken = "my-sdk/9.9.9",
            )
        val result =
            runTestSuspend {
                executor.execute(
                    request =
                        SdkExecutionRequest(
                            metadata =
                                OperationMetadata(
                                    operationId = "op",
                                    method = "GET",
                                    path = "/op",
                                    requestMediaTypes = listOf("text/plain"),
                                    responseMediaTypes = listOf("text/plain"),
                                    successStatusCodes = setOf(200),
                                    responseMode = SdkResponseMode.BUFFERED,
                                    deadlines = SdkDeadlines(null, null, null),
                                    safety = OperationSafety(safe = true),
                                    retry =
                                        RetryDescriptor(
                                            retryableStatusCodes = listOf(ResponseSelector.StatusRange(500, 599)),
                                        ),
                                ),
                            baseUri = "https://example.test",
                            requestValue = "request",
                            requestCodecIds = listOf("text"),
                        ),
                    responseCodecIds = listOf("text"),
                    requestCodecs = codecs,
                    responseCodecs = codecs,
                    options = CallOptions(observers = listOf(perCallObserver)),
                )
            }

        assertEquals("ok", result)
        assertTrue(authentication.sawTracedHeader, "authentication did not observe the middleware's header replacement")
        assertTrue(authentication.sawTracedUri, "authentication did not observe the middleware's URI replacement")
        assertTrue(authentication.sawSdkIdentificationBeforeItRan, "SDK identification did not precede authentication")

        assertEquals(
            listOf(
                "call-started",
                // Validation precedes serialization structurally: encode() is unreachable until validate()
                // succeeds (validation failure is covered by EarlyTerminalObservationTest, which never reaches
                // serialization at all).
                "serialization",
                "user-mutation",
                "logical-middleware",
                // attempt 1 (503): sdk-identification is verified by authentication before it logs "authentication".
                "attempt-started",
                "attempt-middleware",
                "sdk-identification",
                "authentication",
                "transport",
                "response-closed",
                "attempt-completed",
                // retryScheduled pins the retry engine's between-attempts transition (it fires after a failed
                // attempt is classified). The engine's initial entry point has no observable marker by design:
                // it owns the whole attempt loop, which the attempt-started/attempt-completed pairs delimit.
                "retry-scheduled",
                // attempt 2 (200): reaches decoding this time.
                "attempt-started",
                "attempt-middleware",
                "sdk-identification",
                "authentication",
                "transport",
                "decoding",
                "response-closed",
                "attempt-completed",
                "call-completed",
            ),
            stageLog,
        )
        // Item 7: client-level and per-call observers both fire, seeing an identical event sequence for this call.
        assertEquals(clientObserver.ownEvents, perCallObserver.ownEvents)
        assertTrue(clientObserver.ownEvents.isNotEmpty())
    }

    @Test
    fun fabricatedAttemptResponseOrphanClosedOnSuccessThroughFullExecutor() {
        val orphanBody = ClosableRecordingByteStream("orphaned")
        val fabricatedBody = ClosableRecordingByteStream("ok")
        val transport =
            object : SdkTransport {
                override suspend fun execute(request: SdkRequest): SdkResponse =
                    SdkResponse(200, emptyList(), orphanBody)
            }
        val substituting =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    proceed(call)
                    return LogicalOutcome.Success(SdkResponse(200, emptyList(), fabricatedBody))
                }
            }
        val codecs = MediaTypeCodecRegistry.of(PipelineOrderStringCodec)
        val executor = SdkExecutor(transport = transport, attemptMiddleware = listOf(substituting))

        val result =
            runTestSuspend {
                executor.execute(
                    request =
                        SdkExecutionRequest(
                            metadata = fabricationMetadata(),
                            baseUri = "https://example.test",
                            requestValue = "request",
                            requestCodecIds = listOf("text"),
                        ),
                    responseCodecIds = listOf("text"),
                    requestCodecs = codecs,
                    responseCodecs = codecs,
                )
            }

        assertEquals("ok", result)
        assertTrue(orphanBody.closed, "the orphaned (discarded) response was never closed")
        assertEquals(null, orphanBody.closeCause)
        assertTrue(fabricatedBody.closed, "the fabricated (returned) response was never closed")
    }

    @Test
    fun fabricatedAttemptResponseOrphanClosedOnDecodeFailureThroughFullExecutor() {
        val orphanBody = ClosableRecordingByteStream("orphaned")
        val fabricatedBody = ClosableRecordingByteStream("unparseable")
        val transport =
            object : SdkTransport {
                override suspend fun execute(request: SdkRequest): SdkResponse =
                    SdkResponse(200, emptyList(), orphanBody)
            }
        val substituting =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    proceed(call)
                    return LogicalOutcome.Success(SdkResponse(200, emptyList(), fabricatedBody))
                }
            }
        val codecs = MediaTypeCodecRegistry.of(ThrowingDecodeStringCodec)
        val executor = SdkExecutor(transport = transport, attemptMiddleware = listOf(substituting))

        assertFailsWith<SdkSerializationException> {
            runTestSuspend {
                executor.execute(
                    request =
                        SdkExecutionRequest(
                            metadata = fabricationMetadata(),
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

        assertTrue(orphanBody.closed, "the orphaned (discarded) response was never closed")
        assertEquals(null, orphanBody.closeCause)
        assertTrue(fabricatedBody.closed, "the fabricated (returned) response was never closed")
        assertTrue(fabricatedBody.closeCause is SdkSerializationException)
    }

    private fun fabricationMetadata(): OperationMetadata =
        OperationMetadata(
            operationId = "op",
            method = "GET",
            path = "/op",
            requestMediaTypes = listOf("text/plain"),
            responseMediaTypes = listOf("text/plain"),
            successStatusCodes = setOf(200),
            responseMode = SdkResponseMode.BUFFERED,
            deadlines = SdkDeadlines(null, null, null),
            safety = OperationSafety(safe = true),
        )
}

private class StageLoggingTransport(
    private val stageLog: MutableList<String>,
    statuses: List<Int>,
) : SdkTransport {
    private val remaining = statuses.toMutableList()

    override fun capabilities(): TransportCapabilities = TransportCapabilities(canSetUserAgent = true)

    override suspend fun execute(request: SdkRequest): SdkResponse {
        stageLog += "transport"
        val status = remaining.removeFirst()
        return SdkResponse(status, emptyList(), StageLoggingByteStream(stageLog, if (status == 200) "ok" else "error"))
    }
}

private class StageLoggingByteStream(
    private val stageLog: MutableList<String>,
    value: String,
) : SdkByteStream {
    private var bytes: ByteArray? = value.encodeToByteArray()

    override suspend fun readChunk(maxBytes: Int): ByteArray? = bytes.also { bytes = null }

    override fun close(cause: Throwable?) {
        stageLog += "response-closed"
    }
}

private class StageLoggingAuthentication(
    private val stageLog: MutableList<String>,
    private val productToken: String,
) : SdkAuthentication {
    var sawTracedHeader: Boolean = false
        private set
    var sawTracedUri: Boolean = false
        private set
    var sawSdkIdentificationBeforeItRan: Boolean = false
        private set

    override suspend fun apply(request: SdkRequest): SdkRequest {
        sawTracedHeader = request.headers.any { it.name == "X-Traced" && it.value == "true" }
        sawTracedUri = request.uri.endsWith("?traced=1")
        val userAgentAlreadySet = request.headers.firstValue("User-Agent") == productToken
        if (userAgentAlreadySet) {
            stageLog += "sdk-identification"
            sawSdkIdentificationBeforeItRan = true
        }
        stageLog += "authentication"
        return request.copy(headers = request.headers + SdkHeader("Authorization", "Bearer token"))
    }
}

private class StageLoggingCodec(
    private val stageLog: MutableList<String>,
) : MediaTypeCodec<String> {
    override val id: String = "text"
    override val mediaTypes: Set<String> = setOf("text/plain")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody {
        // This marker pins serialization's position relative to the later stages. Validation-before-serialization
        // is structural, not asserted here: encode() is unreachable until validate() succeeds, and a validation
        // failure never reaches a codec at all (see EarlyTerminalObservationTest).
        stageLog += "serialization"
        return SdkRequestBody.Bytes(value.encodeToByteArray(), mediaType)
    }

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String {
        stageLog += "decoding"
        return body.readChunk()?.decodeToString().orEmpty()
    }
}

/**
 * Records both a shared pipeline [stageLog] (for call-started/attempt-started/attempt-completed/retry-scheduled/
 * call-completed markers, shared with every other stage recorder in the test) and its own private [ownEvents] list
 * (used to prove client-level and per-call observers both fire identically for the same call).
 */
private class StageAndEventRecordingObserver(
    private val stageLog: MutableList<String>,
    private val contributesToStageLog: Boolean,
) : SdkLifecycleObserver {
    val ownEvents = mutableListOf<String>()

    private fun stage(marker: String) {
        if (contributesToStageLog) stageLog += marker
    }

    override fun callStarted(
        callId: String,
        operationId: String,
        method: String,
        normalizedRoute: String,
    ) {
        stage("call-started")
        ownEvents += "callStarted"
    }

    override fun attemptStarted(
        callId: String,
        attemptNumber: Int,
    ) {
        stage("attempt-started")
        ownEvents += "attemptStarted($attemptNumber)"
    }

    override fun attemptCompleted(
        callId: String,
        attemptNumber: Int,
        outcome: AttemptOutcomeSignal,
        durationMillis: Long,
    ) {
        stage("attempt-completed")
        ownEvents += "attemptCompleted($attemptNumber)"
    }

    override fun retryScheduled(
        callId: String,
        delayMillis: Long,
        classification: AttemptClassification,
    ) {
        stage("retry-scheduled")
        ownEvents += "retryScheduled"
    }

    override fun callCompleted(
        callId: String,
        outcome: SdkOutcomeKind,
        totalAttempts: Int,
        durationMillis: Long,
    ) {
        stage("call-completed")
        ownEvents += "callCompleted($outcome)"
    }
}

private class ClosableRecordingByteStream(
    value: String,
) : SdkByteStream {
    private var bytes: ByteArray? = value.encodeToByteArray()
    var closed: Boolean = false
        private set
    var closeCause: Throwable? = null
        private set

    override suspend fun readChunk(maxBytes: Int): ByteArray? = bytes.also { bytes = null }

    override fun close(cause: Throwable?) {
        closed = true
        closeCause = cause
    }
}

private object ThrowingDecodeStringCodec : MediaTypeCodec<String> {
    override val id: String = "text"
    override val mediaTypes: Set<String> = setOf("text/plain")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody = SdkRequestBody.Bytes(value.encodeToByteArray(), mediaType)

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String = error("cannot decode")
}

private object PipelineOrderStringCodec : MediaTypeCodec<String> {
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
