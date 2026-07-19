package com.nabobery.sdkgen.transport.okhttp

import com.nabobery.sdkgen.runtime.SdkBodyOwnership
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkConfigurationException
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SdkTransportException
import com.nabobery.sdkgen.runtime.TransportCapabilities
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.suspendCancellableCoroutine
import okhttp3.Call
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.coroutines.executeAsync
import okio.BufferedSink
import okio.IOException
import okio.Source
import kotlin.coroutines.cancellation.CancellationException
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

/**
 * OkHttp-backed transport over a consumer-owned [OkHttpClient].
 *
 * The client is never closed or mutated. For a streaming request, an already configured call timeout is cancelled on
 * the new per-call timeout object after response headers arrive. This follows OkHttp SSE behavior: a finite call timeout
 * must not terminate a long-lived response after the runtime has taken ownership of stream-idle and total semantics.
 * Closing the returned stream closes its response body and cancels its call, so in-flight reads observe cancellation.
 */
public class OkHttpSdkTransport internal constructor(
    client: OkHttpClient,
    private val responseCloseObserver: (Throwable?) -> Unit,
) : SdkTransport {
    private val executionClient: OkHttpClient =
        client
            .newBuilder()
            .followRedirects(false)
            .followSslRedirects(false)
            .build()
    private val capabilities: TransportCapabilities =
        TransportCapabilities(
            supportsStreaming = true,
            supportsHttp2 = Protocol.HTTP_2 in client.protocols || Protocol.H2_PRIOR_KNOWLEDGE in client.protocols,
            canSetUserAgent = true,
        )

    public constructor(client: OkHttpClient) : this(client, {})

    override suspend fun execute(request: SdkRequest): SdkResponse {
        val prepared = request.toOkHttpRequest()
        val call = executionClient.newCall(prepared.request)
        val response =
            try {
                call.executeAsync()
            } catch (cancellation: CancellationException) {
                prepared.closePreserving(cancellation)
                throw cancellation
            } catch (failure: IOException) {
                val original = failure.originalIOException()
                prepared.closePreserving(original)
                throw SdkTransportException(
                    message = "OkHttp failed before returning response headers.",
                    operationId = request.operationId,
                    cause = original,
                    requestMayHaveReachedServer = original.requestMayHaveReachedServer(),
                )
            } catch (failure: Throwable) {
                prepared.closePreserving(failure)
                throw failure
            }
        try {
            prepared.close()
        } catch (failure: Throwable) {
            response.close()
            throw failure
        }
        if (request.expectedResponseMode == SdkResponseMode.STREAMING && call.timeout().timeoutNanos() > 0L) {
            call.timeout().cancel()
        }
        return SdkResponse(
            statusCode = response.code,
            headers =
                response.headers.map {
                    com.nabobery.sdkgen.runtime
                        .SdkHeader(it.first, it.second)
                },
            body =
                OkHttpResponseByteStream(
                    call,
                    response.body.source(),
                    response.body,
                    request.operationId,
                    responseCloseObserver,
                ),
        )
    }

    override fun capabilities(): TransportCapabilities = capabilities
}

private fun IOException.originalIOException(): IOException = cause as? IOException ?: this

/**
 * `false` only when OkHttp reports a direct name-resolution or connect-phase failure. A nested connect-shaped cause is
 * not enough: an interceptor or wrapper may attach one after a request was sent. Anything else — resets while awaiting
 * headers, truncated writes, arbitrary wrappers — stays `true` because provably-unsent failures bypass retry safety gates.
 */
private fun IOException.requestMayHaveReachedServer(): Boolean =
    this !is java.net.ConnectException &&
        this !is java.net.UnknownHostException &&
        this !is java.net.NoRouteToHostException

private class PreparedRequest(
    val request: Request,
    private val body: PreparedRequestBody?,
) {
    fun close(cause: Throwable? = null) {
        body?.close(cause)
    }

    fun closePreserving(cause: Throwable) {
        try {
            close(cause)
        } catch (closeFailure: Throwable) {
            cause.addSuppressed(closeFailure)
        }
    }
}

private class PreparedRequestBody(
    val requestBody: RequestBody,
    private val closeAction: (Throwable?) -> Unit,
) {
    private var closed: Boolean = false

    fun close(cause: Throwable? = null) {
        val shouldClose =
            synchronized(this) {
                if (closed) {
                    false
                } else {
                    closed = true
                    true
                }
            }
        if (shouldClose) closeAction(cause)
    }

    fun closePreserving(cause: Throwable) {
        try {
            close(cause)
        } catch (closeFailure: Throwable) {
            cause.addSuppressed(closeFailure)
        }
    }
}

private fun SdkRequest.toOkHttpRequest(): PreparedRequest {
    val builder = Request.Builder().url(uri)
    headers.forEach { builder.addHeader(it.name, it.value) }
    val preparedBody = body?.toOkHttpRequestBody(operationId)
    if (method.equals("GET", true) || method.equals("HEAD", true)) {
        if (preparedBody != null) {
            val failure =
                SdkConfigurationException(
                    "Method '$method' does not permit a request body.",
                    operationId,
                )
            preparedBody.closePreserving(failure)
            throw failure
        }
        builder.method(method, null)
    } else {
        builder.method(method, preparedBody?.requestBody)
    }
    return PreparedRequest(builder.build(), preparedBody)
}

private fun SdkRequestBody.toOkHttpRequestBody(operationId: String): PreparedRequestBody =
    when (this) {
        is SdkRequestBody.Bytes -> {
            PreparedRequestBody(
                requestBody =
                    object : RequestBody() {
                        override fun contentType(): okhttp3.MediaType = contentType.toMediaType()

                        override fun contentLength(): Long = contentLength

                        override fun writeTo(sink: BufferedSink) {
                            sink.write(bytes)
                        }
                    },
                closeAction = {},
            )
        }

        is SdkRequestBody.ReplayFactory -> {
            PreparedRequestBody(
                requestBody =
                    object : RequestBody() {
                        override fun contentType(): okhttp3.MediaType = contentType.toMediaType()

                        override fun contentLength(): Long = contentLength ?: -1L

                        override fun isOneShot(): Boolean = false

                        override fun writeTo(sink: BufferedSink) {
                            val created = runBlocking { create() }.toOkHttpRequestBody(operationId)
                            try {
                                created.requestBody.writeTo(sink)
                                created.close()
                            } catch (failure: Throwable) {
                                created.closePreserving(failure)
                                throw failure
                            }
                        }
                    },
                closeAction = {},
            )
        }

        is SdkRequestBody.OneShot -> {
            val closeAction: (Throwable?) -> Unit =
                if (ownership == SdkBodyOwnership.TRANSPORT) {
                    stream::close
                } else {
                    {}
                }
            lateinit var prepared: PreparedRequestBody
            prepared =
                PreparedRequestBody(
                    requestBody =
                        object : RequestBody() {
                            override fun contentType(): okhttp3.MediaType = contentType.toMediaType()

                            override fun contentLength(): Long = contentLength ?: -1L

                            override fun isOneShot(): Boolean = true

                            override fun writeTo(sink: BufferedSink) {
                                runBlocking {
                                    try {
                                        while (true) {
                                            val chunk = stream.readChunk(SdkByteStream.DEFAULT_READ_SIZE) ?: break
                                            sink.write(chunk)
                                        }
                                        prepared.close()
                                    } catch (failure: Throwable) {
                                        prepared.closePreserving(failure)
                                        throw failure
                                    }
                                }
                            }
                        },
                    closeAction = closeAction,
                )
            prepared
        }
    }

internal class OkHttpResponseByteStream(
    private val call: Call,
    private val source: Source,
    private val responseBody: okhttp3.ResponseBody,
    private val operationId: String,
    private val closeObserver: (Throwable?) -> Unit = {},
) : SdkByteStream {
    private val stateLock: Any = Any()
    private val ioLock: Any = Any()
    private var closed: Boolean = false
    private var closeCause: Throwable? = null

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        require(maxBytes > 0) { "maxBytes must be positive" }
        synchronized(stateLock) { check(!closed) { "stream is closed" } }
        return suspendCancellableCoroutine { continuation ->
            continuation.invokeOnCancellation { call.cancel() }
            Dispatchers.IO.dispatch(continuation.context) {
                try {
                    val result =
                        synchronized(ioLock) {
                            synchronized(stateLock) { check(!closed) { "stream is closed" } }
                            val buffer = okio.Buffer()
                            val count = source.read(buffer, maxBytes.toLong())
                            synchronized(stateLock) {
                                closeCause?.let { throw it }
                                check(!closed) { "stream is closed" }
                            }
                            if (count == -1L) null else buffer.readByteArray(count)
                        }
                    continuation.resume(result) { _, _, _ -> call.cancel() }
                } catch (failure: IOException) {
                    if (continuation.isActive) {
                        continuation.resumeWithException(
                            SdkTransportException(
                                message = "OkHttp response body read failed.",
                                operationId = operationId,
                                cause = failure,
                            ),
                        )
                    }
                } catch (failure: Throwable) {
                    if (continuation.isActive) continuation.resumeWithException(failure)
                }
            }
        }
    }

    override fun close(cause: Throwable?) {
        val shouldClose =
            synchronized(stateLock) {
                if (closed) {
                    false
                } else {
                    closed = true
                    closeCause = cause
                    true
                }
            }
        if (!shouldClose) return
        call.cancel()
        try {
            synchronized(ioLock) { responseBody.close() }
        } finally {
            closeObserver(cause)
        }
    }
}
