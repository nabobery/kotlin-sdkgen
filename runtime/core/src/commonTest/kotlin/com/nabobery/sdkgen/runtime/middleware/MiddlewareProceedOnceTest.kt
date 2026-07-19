package com.nabobery.sdkgen.runtime.middleware

import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.ScriptedTransport
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkConfigurationException
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.StringStream
import com.nabobery.sdkgen.runtime.runTestSuspend
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

internal class MiddlewareProceedOnceTest {
    @Test
    fun logicalMiddlewareCallingProceedTwiceThrowsConfigurationException() {
        val transport = ScriptedTransport().response(200)
        val doubleProceedMiddleware =
            object : LogicalMiddleware {
                override suspend fun <T> intercept(
                    call: LogicalCallContext,
                    proceed: suspend (LogicalCallContext) -> LogicalOutcome<T>,
                ): LogicalOutcome<T> {
                    proceed(call)
                    return proceed(call)
                }
            }

        assertFailsWith<SdkConfigurationException> {
            execute(transport, logicalMiddleware = listOf(doubleProceedMiddleware))
        }
    }

    @Test
    fun attemptMiddlewareCallingProceedTwiceThrowsConfigurationException() {
        val transport = ScriptedTransport().response(200)
        val doubleProceedMiddleware =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    proceed(call)
                    return proceed(call)
                }
            }

        assertFailsWith<SdkConfigurationException> {
            execute(transport, attemptMiddleware = listOf(doubleProceedMiddleware))
        }
    }

    @Test
    fun logicalMiddlewareShortCircuitSkipsTransport() {
        // A logical middleware's `intercept` is generic over the operation's decoded response type, chosen fresh per
        // call (see LogicalMiddleware's KDoc) — a middleware can soundly short-circuit to LogicalOutcome.Failure for
        // any such type without an unchecked cast (Failure is LogicalOutcome<Nothing>, a subtype of every
        // LogicalOutcome<T>), which is exactly what this test proves: the chain never reaches `proceed`, so the
        // transport is never invoked, and the synthesized failure propagates out of `execute` unmodified.
        val transport = ScriptedTransport().response(200)
        val synthesizedFailure = SdkConfigurationException("short-circuited before transport")
        val shortCircuit =
            object : LogicalMiddleware {
                override suspend fun <T> intercept(
                    call: LogicalCallContext,
                    proceed: suspend (LogicalCallContext) -> LogicalOutcome<T>,
                ): LogicalOutcome<T> = LogicalOutcome.Failure(synthesizedFailure)
            }

        val thrown =
            assertFailsWith<SdkConfigurationException> {
                execute(transport, logicalMiddleware = listOf(shortCircuit))
            }

        assertEquals(synthesizedFailure, thrown)
        assertTrue(transport.requests.isEmpty())
    }

    @Test
    fun attemptMiddlewareShortCircuitSkipsTransport() {
        val transport = ScriptedTransport().response(200)
        val shortCircuit =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult = LogicalOutcome.Success(SdkResponse(200, emptyList(), StringStream("short-circuit")))
            }

        val result = execute(transport, attemptMiddleware = listOf(shortCircuit))

        assertEquals("short-circuit", result)
        assertTrue(transport.requests.isEmpty())
    }

    private fun execute(
        transport: ScriptedTransport,
        logicalMiddleware: List<LogicalMiddleware> = emptyList(),
        attemptMiddleware: List<AttemptMiddleware> = emptyList(),
    ): String {
        val codecs = MediaTypeCodecRegistry.of(ProceedOnceStringCodec)
        val executor =
            SdkExecutor(
                transport = transport,
                logicalMiddleware = logicalMiddleware,
                attemptMiddleware = attemptMiddleware,
            )
        return runTestSuspend {
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
    }
}

private object ProceedOnceStringCodec : MediaTypeCodec<String> {
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
