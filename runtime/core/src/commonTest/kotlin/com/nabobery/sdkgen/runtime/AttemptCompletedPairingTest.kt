package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.middleware.AttemptCallContext
import com.nabobery.sdkgen.runtime.middleware.AttemptMiddleware
import com.nabobery.sdkgen.runtime.middleware.AttemptResult
import com.nabobery.sdkgen.runtime.observation.AttemptOutcomeSignal
import com.nabobery.sdkgen.runtime.observation.SdkLifecycleObserver
import com.nabobery.sdkgen.runtime.observation.SdkOutcomeKind
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs

/**
 * Item 5 (review ruling): attemptStarted must always be paired with an eventual attemptCompleted, even when the
 * failure originates directly from attempt middleware (a throw that never becomes a runAttemptChain outcome value)
 * rather than from auth/transport/decoding.
 */
internal class AttemptCompletedPairingTest {
    @Test
    fun throwingAttemptMiddlewareStillEmitsAttemptCompletedWithFailureKind() {
        val transport = ScriptedTransport().response(200)
        val observer = PairingRecordingObserver()
        val customFailure = IllegalStateException("middleware exploded")
        val throwingMiddleware =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult = throw customFailure
            }
        val codecs = MediaTypeCodecRegistry.of(PairingStringCodec)
        val executor =
            SdkExecutor(
                transport = transport,
                attemptMiddleware = listOf(throwingMiddleware),
                observers = listOf(observer),
            )

        val thrown =
            assertFailsWith<IllegalStateException> {
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
                    )
                }
            }

        assertEquals(customFailure, thrown)
        assertEquals(1, observer.attemptStartedCount)
        assertEquals(1, observer.attemptCompletedSignals.size)
        val signal = assertIs<AttemptOutcomeSignal.Failure>(observer.attemptCompletedSignals.single())
        assertEquals(SdkOutcomeKind.UNKNOWN, signal.kind)
    }
}

private class PairingRecordingObserver : SdkLifecycleObserver {
    var attemptStartedCount: Int = 0
    val attemptCompletedSignals = mutableListOf<AttemptOutcomeSignal>()

    override fun attemptStarted(
        callId: String,
        attemptNumber: Int,
    ) {
        attemptStartedCount += 1
    }

    override fun attemptCompleted(
        callId: String,
        attemptNumber: Int,
        outcome: AttemptOutcomeSignal,
        durationMillis: Long,
    ) {
        attemptCompletedSignals += outcome
    }
}

private object PairingStringCodec : MediaTypeCodec<String> {
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
