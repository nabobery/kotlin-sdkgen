package com.nabobery.sdkgen.runtime.observation

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
import com.nabobery.sdkgen.runtime.SdkApiException
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.runTestSuspend
import kotlin.coroutines.cancellation.CancellationException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

internal class LifecycleObserverTest {
    @Test
    fun successEventSequenceFiresCallStartedAttemptEventsAndCallCompleted() {
        val transport = ScriptedTransport().response(200)
        val observer = RecordingObserver()

        val result = execute(transport, observers = listOf(observer))

        assertEquals("ok", result)
        assertEquals(
            listOf("callStarted", "attemptStarted(1)", "attemptCompleted(1)", "callCompleted(SUCCESS)"),
            observer.events,
        )
    }

    @Test
    fun retryEventSequenceIncludesRetryScheduledAndTwoAttempts() {
        val transport = ScriptedTransport().response(503).response(200)
        val time = DeterministicTime()
        val observer = RecordingObserver()

        val result =
            execute(
                transport,
                observers = listOf(observer),
                time = time,
                retry = RetryDescriptor(retryableStatusCodes = listOf(ResponseSelector.StatusRange(500, 599))),
            )

        assertEquals("ok", result)
        assertEquals(
            listOf(
                "callStarted",
                "attemptStarted(1)",
                "attemptCompleted(1)",
                "retryScheduled",
                "attemptStarted(2)",
                "attemptCompleted(2)",
                "callCompleted(SUCCESS)",
            ),
            observer.events,
        )
    }

    @Test
    fun failureEventSequenceFiresCallCompletedAndCallFailedWithSameKind() {
        val transport = ScriptedTransport().response(500)
        val observer = RecordingObserver()

        assertFailsWith<SdkApiException> {
            execute(transport, observers = listOf(observer))
        }

        assertEquals(
            listOf(
                "callStarted",
                "attemptStarted(1)",
                "attemptCompleted(1)",
                "callCompleted(API_ERROR)",
                "callFailed(API_ERROR)",
            ),
            observer.events,
        )
    }

    @Test
    fun cancellationReportsCallFailedWithCancelledKindAndPreservesIdentity() {
        val cancellation = CancellationException("cancel")
        val observer = RecordingObserver()
        val cancellingTransport =
            object : SdkTransport {
                override suspend fun execute(request: SdkRequest): SdkResponse = throw cancellation
            }

        val thrown =
            assertFailsWith<CancellationException> {
                execute(cancellingTransport, observers = listOf(observer))
            }

        assertEquals(cancellation, thrown)
        assertTrue(observer.events.contains("callFailed(CANCELLED)"))
        assertTrue(observer.events.contains("callCompleted(CANCELLED)"))
    }

    @Test
    fun throwingObserverIsContainedAndCallStillSucceeds() {
        val transport = ScriptedTransport().response(200)
        val throwingObserver =
            object : SdkLifecycleObserver {
                override fun callStarted(
                    callId: String,
                    operationId: String,
                    method: String,
                    normalizedRoute: String,
                ) = throw IllegalStateException("boom")

                override fun attemptStarted(
                    callId: String,
                    attemptNumber: Int,
                ) = throw IllegalStateException("boom")

                override fun attemptCompleted(
                    callId: String,
                    attemptNumber: Int,
                    outcome: AttemptOutcomeSignal,
                    durationMillis: Long,
                ) = throw IllegalStateException("boom")

                override fun callCompleted(
                    callId: String,
                    outcome: SdkOutcomeKind,
                    totalAttempts: Int,
                    durationMillis: Long,
                ) = throw IllegalStateException("boom")
            }
        val healthyObserver = RecordingObserver()

        val result = execute(transport, observers = listOf(throwingObserver, healthyObserver))

        assertEquals("ok", result)
        // Multi-observer isolation: the throwing observer never stopped the healthy one from seeing every event.
        assertEquals(
            listOf("callStarted", "attemptStarted(1)", "attemptCompleted(1)", "callCompleted(SUCCESS)"),
            healthyObserver.events,
        )
    }

    @Test
    fun normalizedRouteIsThePathTemplateNotAnExpandedUri() {
        val transport = ScriptedTransport().response(200)
        val observer = RecordingObserver()

        execute(
            transport,
            observers = listOf(observer),
            path = "/users/{id}/orders/{orderId}",
            parameters =
                listOf(
                    SdkRequestParameter(SdkParameterLocation.PATH, "id", listOf("user-123")),
                    SdkRequestParameter(SdkParameterLocation.PATH, "orderId", listOf("order-456")),
                ),
        )

        assertEquals("/users/{id}/orders/{orderId}", observer.normalizedRoutes.single())
    }

    private fun execute(
        transport: SdkTransport,
        observers: List<SdkLifecycleObserver>,
        time: DeterministicTime = DeterministicTime(),
        retry: RetryDescriptor? = null,
        path: String = "/op",
        parameters: List<SdkRequestParameter> = emptyList(),
    ): String {
        val codecs = MediaTypeCodecRegistry.of(ObserverStringCodec)
        val executor =
            SdkExecutor(
                transport = transport,
                clock = time,
                wallClock = time,
                delayer = time,
                random = time,
                observers = observers,
            )
        return runTestSuspend {
            executor.execute(
                request =
                    SdkExecutionRequest(
                        metadata =
                            OperationMetadata(
                                operationId = "op",
                                method = "GET",
                                path = path,
                                requestMediaTypes = listOf("text/plain"),
                                responseMediaTypes = listOf("text/plain"),
                                successStatusCodes = setOf(200),
                                responseMode = SdkResponseMode.BUFFERED,
                                deadlines = SdkDeadlines(null, null, null),
                                safety = OperationSafety(safe = true),
                                retry = retry,
                            ),
                        baseUri = "https://example.test",
                        requestValue = "request",
                        requestCodecIds = listOf("text"),
                        parameters = parameters,
                    ),
                responseCodecIds = listOf("text"),
                requestCodecs = codecs,
                responseCodecs = codecs,
                options = CallOptions(),
            )
        }
    }
}

private class RecordingObserver : SdkLifecycleObserver {
    val events = mutableListOf<String>()
    val normalizedRoutes = mutableListOf<String>()

    override fun callStarted(
        callId: String,
        operationId: String,
        method: String,
        normalizedRoute: String,
    ) {
        events += "callStarted"
        normalizedRoutes += normalizedRoute
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

    override fun retryScheduled(
        callId: String,
        delayMillis: Long,
        classification: AttemptClassification,
    ) {
        events += "retryScheduled"
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

private object ObserverStringCodec : MediaTypeCodec<String> {
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
