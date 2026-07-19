package com.nabobery.sdkgen.runtime.middleware

import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.DeterministicTime
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.ScriptedTransport
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.runTestSuspend
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Proves [LogicalMiddleware] wraps the *whole* logical call exactly once, even when the retry engine it wraps makes
 * several physical attempts — while [AttemptMiddleware] runs once per physical attempt.
 */
internal class LogicalMiddlewareRetryWrapTest {
    @Test
    fun logicalMiddlewareSeesOneInvocationAcrossRetriedAttempts() {
        val transport = ScriptedTransport().response(503).response(200)
        val time = DeterministicTime()
        var logicalInvocations = 0
        val attemptInvocations = mutableListOf<Int>()

        val logicalCounter =
            object : LogicalMiddleware {
                override suspend fun <T> intercept(
                    call: LogicalCallContext,
                    proceed: suspend (LogicalCallContext) -> LogicalOutcome<T>,
                ): LogicalOutcome<T> {
                    logicalInvocations += 1
                    return proceed(call)
                }
            }
        val attemptCounter =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    attemptInvocations += call.attemptNumber
                    return proceed(call)
                }
            }

        val codecs = MediaTypeCodecRegistry.of(RetryWrapStringCodec)
        val executor =
            SdkExecutor(
                transport = transport,
                clock = time,
                wallClock = time,
                delayer = time,
                random = time,
                logicalMiddleware = listOf(logicalCounter),
                attemptMiddleware = listOf(attemptCounter),
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
                    options = CallOptions(),
                )
            }

        assertEquals("ok", result)
        assertEquals(1, logicalInvocations)
        assertEquals(listOf(1, 2), attemptInvocations)
    }
}

private object RetryWrapStringCodec : MediaTypeCodec<String> {
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
