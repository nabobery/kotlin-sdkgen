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
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.runTestSuspend
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

internal class RequestReplacementValidationTest {
    @Test
    fun replacingBytesBodyWithOneShotBodyIsRejected() {
        val transport = ScriptedTransport().response(200)
        val incompatibleReplacement =
            object : LogicalMiddleware {
                override suspend fun <T> intercept(
                    call: LogicalCallContext,
                    proceed: suspend (LogicalCallContext) -> LogicalOutcome<T>,
                ): LogicalOutcome<T> {
                    val oneShot =
                        SdkRequestBody.OneShot(
                            stream = EmptyByteStream,
                            contentType = "text/plain",
                            contentLength = 0,
                        )
                    return proceed(call.copy(request = call.request.copy(body = oneShot)))
                }
            }

        assertFailsWith<SdkConfigurationException> {
            execute(transport, logicalMiddleware = listOf(incompatibleReplacement))
        }
    }

    @Test
    fun replacingBytesBodyWithReplayFactoryBodyIsRejected() {
        // Same "replayable" informal shape as the original Bytes body, but a different concrete class - rejected
        // per the ruling that Bytes and ReplayFactory are not interchangeable (see MiddlewareChains'
        // ReplayabilityClass KDoc).
        val transport = ScriptedTransport().response(200)
        val bytesToReplayFactory =
            object : LogicalMiddleware {
                override suspend fun <T> intercept(
                    call: LogicalCallContext,
                    proceed: suspend (LogicalCallContext) -> LogicalOutcome<T>,
                ): LogicalOutcome<T> {
                    val original = call.request.body as SdkRequestBody.Bytes
                    val replacement =
                        SdkRequestBody.ReplayFactory(original.contentType, original.contentLength) {
                            SdkRequestBody.Bytes(original.bytes, original.contentType)
                        }
                    return proceed(call.copy(request = call.request.copy(body = replacement)))
                }
            }

        assertFailsWith<SdkConfigurationException> {
            execute(transport, logicalMiddleware = listOf(bytesToReplayFactory))
        }
    }

    @Test
    fun replacingReplayFactoryBodyWithBytesBodyIsRejected() {
        val transport = ScriptedTransport().response(200)
        val replayFactoryToBytes =
            object : LogicalMiddleware {
                override suspend fun <T> intercept(
                    call: LogicalCallContext,
                    proceed: suspend (LogicalCallContext) -> LogicalOutcome<T>,
                ): LogicalOutcome<T> {
                    val original = call.request.body as SdkRequestBody.ReplayFactory
                    val replacement = SdkRequestBody.Bytes("request".encodeToByteArray(), original.contentType)
                    return proceed(call.copy(request = call.request.copy(body = replacement)))
                }
            }

        assertFailsWith<SdkConfigurationException> {
            execute(
                transport,
                logicalMiddleware = listOf(replayFactoryToBytes),
                codec = ReplayFactoryProducingStringCodec,
            )
        }
    }

    @Test
    fun replacingBodyWithDifferentContentLengthIsRejected() {
        val transport = ScriptedTransport().response(200)
        val lengthChanged =
            object : LogicalMiddleware {
                override suspend fun <T> intercept(
                    call: LogicalCallContext,
                    proceed: suspend (LogicalCallContext) -> LogicalOutcome<T>,
                ): LogicalOutcome<T> {
                    val original = call.request.body as SdkRequestBody.Bytes
                    val replacement =
                        SdkRequestBody.Bytes(
                            bytes = "request-with-more-bytes".encodeToByteArray(),
                            contentType = original.contentType,
                        )
                    return proceed(call.copy(request = call.request.copy(body = replacement)))
                }
            }

        assertFailsWith<SdkConfigurationException> {
            execute(transport, logicalMiddleware = listOf(lengthChanged))
        }
    }

    @Test
    fun replacingBodyContentWithSameShapeIsAccepted() {
        val transport = ScriptedTransport().response(200)
        val redaction =
            object : LogicalMiddleware {
                override suspend fun <T> intercept(
                    call: LogicalCallContext,
                    proceed: suspend (LogicalCallContext) -> LogicalOutcome<T>,
                ): LogicalOutcome<T> {
                    val original = call.request.body as SdkRequestBody.Bytes
                    // Same length ("request" -> "REQUEST"), same content type, same ownership: sanctioned.
                    val replacement = SdkRequestBody.Bytes("REQUEST".encodeToByteArray(), original.contentType)
                    return proceed(call.copy(request = call.request.copy(body = replacement)))
                }
            }

        val result = execute(transport, logicalMiddleware = listOf(redaction))

        assertEquals("ok", result)
        assertEquals(
            "REQUEST",
            transport.requests
                .single()
                .body
                ?.let { (it as SdkRequestBody.Bytes).bytes.decodeToString() },
        )
    }

    private fun execute(
        transport: ScriptedTransport,
        logicalMiddleware: List<LogicalMiddleware>,
        codec: MediaTypeCodec<String> = ReplacementStringCodec,
    ): String {
        val codecs = MediaTypeCodecRegistry.of(codec)
        val executor = SdkExecutor(transport = transport, logicalMiddleware = logicalMiddleware)
        return runTestSuspend {
            executor.execute(
                request =
                    SdkExecutionRequest(
                        metadata =
                            OperationMetadata(
                                operationId = "op",
                                method = "POST",
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
                options = CallOptions(),
            )
        }
    }
}

private object EmptyByteStream : SdkByteStream {
    override suspend fun readChunk(maxBytes: Int): ByteArray? = null

    override fun close(cause: Throwable?) {}
}

private object ReplacementStringCodec : MediaTypeCodec<String> {
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

private object ReplayFactoryProducingStringCodec : MediaTypeCodec<String> {
    override val id: String = "text"
    override val mediaTypes: Set<String> = setOf("text/plain")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody {
        val bytes = value.encodeToByteArray()
        return SdkRequestBody.ReplayFactory(mediaType, bytes.size.toLong()) {
            SdkRequestBody.Bytes(bytes, mediaType)
        }
    }

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String = body.readChunk()?.decodeToString().orEmpty()
}
