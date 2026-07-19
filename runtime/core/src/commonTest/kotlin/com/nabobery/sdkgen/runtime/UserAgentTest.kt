package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.middleware.AttemptCallContext
import com.nabobery.sdkgen.runtime.middleware.AttemptMiddleware
import com.nabobery.sdkgen.runtime.middleware.AttemptResult
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * SDK identification (FR-END-024): `User-Agent` is set as the reserved, post-middleware pipeline stage, only when
 * the transport reports [TransportCapabilities.canSetUserAgent], overwriting (never appending to) any value a
 * middleware injected, and always losing to a caller-supplied header from [CallOptions.headers].
 */
internal class UserAgentTest {
    @Test
    fun userAgentSetWhenCapabilityAllowsAndOverwritesMiddlewareTampering() {
        val transport = CapabilityControlledTransport(canSetUserAgent = true)
        val tamperingMiddleware =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    val tampered =
                        call.request.copy(
                            headers =
                                call.request.headers + SdkHeader("User-Agent", "evil/1.0"),
                        )
                    return proceed(call.copy(request = tampered))
                }
            }

        execute(transport, attemptMiddleware = listOf(tamperingMiddleware), productToken = "my-sdk/9.9.9")

        val userAgents =
            transport.requests
                .single()
                .headers
                .filter { it.name.equals("User-Agent", ignoreCase = true) }
        assertEquals(listOf(SdkHeader("User-Agent", "my-sdk/9.9.9")), userAgents)
    }

    @Test
    fun userAgentAbsentWhenCapabilityNotReported() {
        val transport = CapabilityControlledTransport(canSetUserAgent = false)

        execute(transport, productToken = "my-sdk/9.9.9")

        assertNull(
            transport.requests
                .single()
                .headers
                .firstValue("User-Agent"),
        )
    }

    @Test
    fun hookInjectedUserAgentIsOverwrittenByProductToken() {
        // Item 6 (review ruling): callerSuppliedUserAgent is computed from CallOptions.headers only - the
        // documented contract - so a request hook injecting a User-Agent does not count as "caller-supplied" and
        // gets overwritten by the reserved SDK-identification stage, same as a middleware-injected one.
        val transport = CapabilityControlledTransport(canSetUserAgent = true)
        val hookInjectingUserAgent =
            SdkRequestHook { request -> request.copy(headers = request.headers + SdkHeader("User-Agent", "hook/1.0")) }

        execute(transport, productToken = "my-sdk/9.9.9", requestHook = hookInjectingUserAgent)

        val userAgents =
            transport.requests
                .single()
                .headers
                .filter { it.name.equals("User-Agent", ignoreCase = true) }
        assertEquals(listOf(SdkHeader("User-Agent", "my-sdk/9.9.9")), userAgents)
    }

    @Test
    fun callerSuppliedUserAgentWinsOverDefault() {
        val transport = CapabilityControlledTransport(canSetUserAgent = true)

        execute(
            transport,
            productToken = "my-sdk/9.9.9",
            callOptions = CallOptions(headers = listOf(SdkHeader("User-Agent", "caller/1.0"))),
        )

        val userAgents =
            transport.requests
                .single()
                .headers
                .filter { it.name.equals("User-Agent", ignoreCase = true) }
        assertEquals(listOf(SdkHeader("User-Agent", "caller/1.0")), userAgents)
    }

    private fun execute(
        transport: CapabilityControlledTransport,
        attemptMiddleware: List<AttemptMiddleware> = emptyList(),
        productToken: String = SdkExecutor.DEFAULT_PRODUCT_TOKEN,
        callOptions: CallOptions = CallOptions(),
        requestHook: SdkRequestHook? = null,
    ): String {
        val codecs = MediaTypeCodecRegistry.of(UserAgentStringCodec)
        val executor =
            SdkExecutor(
                transport = transport,
                requestHook = requestHook,
                attemptMiddleware = attemptMiddleware,
                productToken = productToken,
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
                options = callOptions,
            )
        }
    }
}

private class CapabilityControlledTransport(
    private val canSetUserAgent: Boolean,
) : SdkTransport {
    val requests = mutableListOf<SdkRequest>()

    override fun capabilities(): TransportCapabilities = TransportCapabilities(canSetUserAgent = canSetUserAgent)

    override suspend fun execute(request: SdkRequest): SdkResponse {
        requests += request
        return SdkResponse(200, emptyList(), StringStream("ok"))
    }
}

private object UserAgentStringCodec : MediaTypeCodec<String> {
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
