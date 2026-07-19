package com.nabobery.sdkgen.transport.ktor

import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SdkTransportException
import com.nabobery.sdkgen.runtime.TransportCapabilities
import io.ktor.client.HttpClient
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.prepareRequest
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsChannel
import io.ktor.http.Headers
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlin.coroutines.cancellation.CancellationException
import kotlinx.coroutines.CancellationException as CoroutinesCancellationException

/**
 * [SdkTransport] backed by a consumer-supplied Ktor [HttpClient] (ADR-0006, spec §9.3, §8.2).
 *
 * ### Client ownership
 *
 * [client] is entirely consumer-owned: this adapter never closes or mutates it and never installs a plugin on it —
 * not `HttpTimeout`, not a logging plugin, nothing. Each physical exchange uses a short-lived client derived with
 * `HttpClient.config` that shares the consumer's engine and plugin configuration while disabling automatic redirects;
 * the derived client is closed when that exchange ends, without closing the consumer's client. Redirects therefore remain
 * disabled and surface as 3xx responses, while the consumer remains solely responsible for eventually closing [client].
 *
 * ### Capability reporting
 *
 * A bare consumer-supplied [HttpClient] does not portably reveal whether its engine/target streams incrementally,
 * negotiates HTTP/2, or permits a `User-Agent` header (browser engines may forbid it). The one-argument constructor
 * therefore reports conservative capabilities. Consumers that know their concrete engine and deployment target may
 * use the two-argument constructor to declare those three facts. Native deadlines are always reported unsupported:
 * ktor exposes engine support for `HttpTimeoutCapability`, but this adapter deliberately neither installs `HttpTimeout`
 * nor maps [SdkRequest.deadlines] into it, so engine support alone would not make deadline enforcement truthful.
 *
 * ### Streaming scope
 *
 * Both response modes use `client.prepareRequest { }.execute { }` and ktor's `ByteReadChannel` only inside that retained
 * callback scope (ADR-0006's hard rule). A bounded pump coroutine copies bytes into a small [Channel]-backed
 * [KtorResponseByteStream], and the callback remains active while the neutral stream is consumed. This applies to
 * [SdkResponseMode.STREAMING] and [SdkResponseMode.BUFFERED] alike: [execute] returns after response headers arrive and
 * never slurps an attacker-controlled body before the runtime or caller requests bytes. See [KtorResponseByteStream]
 * for the full handoff, backpressure, and cancellation contract.
 *
 * ### Failures
 *
 * A connect/DNS/engine failure that happens *before* a response is observed surfaces from [execute] itself as a
 * [SdkTransportException] wrapping the original failure as [Throwable.cause]. A [CancellationException] closing the
 * response body cancels the underlying ktor call, and a ktor-side cancellation surfaces back through
 * [com.nabobery.sdkgen.runtime.SdkByteStream.readChunk] as the same instance — this adapter's own coroutine hand-offs
 * (the `CompletableDeferred` bridging headers back to the caller, and the `Channel` bridging response bytes) forward
 * whatever they received unchanged, by reference, rather than relying on `Deferred`/`Channel` exceptional-completion
 * delivery to preserve it for them. What this adapter cannot control is a cancellation that crosses *ktor's own*
 * internal dispatcher hop (e.g. `MockEngine`'s `withContext(dispatcher + callContext) { handler(...) }`) before ever
 * reaching this adapter's code — kotlinx.coroutines' JVM-only stack-trace recovery can copy an exception there, and
 * this adapter has no seam to prevent it. See [KtorResponseByteStream]'s KDoc for the same caveat as it applies to a
 * non-cancellation failure crossing the pump/consumer coroutine boundary.
 */
public class KtorSdkTransport internal constructor(
    private val client: HttpClient,
    private val reportedCapabilities: TransportCapabilities,
    private val exchangeObserver: KtorExchangeObserver,
) : SdkTransport {
    public constructor(client: HttpClient) : this(
        client,
        TransportCapabilities(),
        NoOpKtorExchangeObserver,
    )

    public constructor(client: HttpClient, capabilities: TransportCapabilities) : this(
        client,
        capabilities.withKtorNativeDeadlines(),
        NoOpKtorExchangeObserver,
    )

    internal constructor(client: HttpClient, exchangeObserver: KtorExchangeObserver) : this(
        client,
        TransportCapabilities(supportsStreaming = true, canSetUserAgent = true),
        exchangeObserver,
    )

    override suspend fun execute(request: SdkRequest): SdkResponse {
        val bodyScope = RequestBodyScope()
        var completionCause: Throwable? = null
        try {
            val builder = request.toHttpRequestBuilder(bodyScope)
            val requestClient = client.config { followRedirects = false }
            return executeStreaming(requestClient, request, builder)
        } catch (failure: Throwable) {
            completionCause = failure
            throw failure
        } finally {
            bodyScope.close(completionCause)
        }
    }

    /**
     * Bridges the retained `execute {}` scope to a promptly-returning [SdkResponse]: a pump coroutine launched
     * *inside* that scope (see [deliverStreaming]) copies bytes into a [KtorResponseByteStream], and this function
     * returns as soon as response headers arrive, without waiting for the body to drain.
     */
    private suspend fun executeStreaming(
        requestClient: HttpClient,
        request: SdkRequest,
        builder: HttpRequestBuilder,
    ): SdkResponse {
        val headerSignal = CompletableDeferred<SdkResponse>()
        // Set once, from the pump coroutine, strictly before headerSignal is completed exceptionally — read here
        // only after headerSignal.await() has itself resumed (successfully or not), so the Deferred completion
        // establishes the happens-before edge. Thrown by identity via a plain `throw` below rather than by
        // rethrowing whatever await() handed back, because a value crossing the CompletableDeferred boundary is not
        // guaranteed `===`-identical on the JVM (kotlinx.coroutines stack-trace recovery) even for a
        // CancellationException that did not originate from this Job's own cancellation — verified empirically: an
        // ad-hoc CancellationException thrown by a handler and routed through completeExceptionally()/await() lost
        // identity in this adapter's own tests.
        var preHeaderFailure: Throwable? = null
        // A plain CoroutineScope over the current context — deliberately NOT wrapped in an extra `Job(parent)`,
        // which would never reach a terminal state on its own (a bare Job never auto-completes when its children
        // finish; only an explicit `complete()` call does that) and would therefore dangle as a permanently-active
        // child of the caller's job, silently preventing the caller's own scope from ever completing. `pumpJob`
        // itself (the launch() return value) is already an independent, cancellable handle — no extra wrapper layer
        // is needed to cancel it in isolation.
        val callScope = CoroutineScope(currentCoroutineContext())

        val pumpJob =
            callScope.launch(start = CoroutineStart.UNDISPATCHED) {
                try {
                    requestClient.prepareRequest(builder).execute { httpResponse ->
                        deliverStreaming(request, httpResponse, headerSignal)
                    }
                } catch (cancellation: CancellationException) {
                    preHeaderFailure = cancellation
                    headerSignal.completeExceptionally(cancellation)
                } catch (failure: SdkTransportException) {
                    preHeaderFailure = failure
                    headerSignal.completeExceptionally(failure)
                } catch (failure: Throwable) {
                    val wrapped =
                        failure.findTransportException()
                            ?: SdkTransportException(
                                "Ktor request failed before a response was received.",
                                request.operationId,
                                failure,
                            )
                    preHeaderFailure = wrapped
                    headerSignal.completeExceptionally(wrapped)
                } finally {
                    requestClient.close()
                }
            }

        return try {
            headerSignal.await()
        } catch (awaited: Throwable) {
            val cancellationToPropagate =
                preHeaderFailure as? CancellationException ?: (awaited as? CancellationException)
            // Job.cancel() requires kotlinx.coroutines.CancellationException specifically, not the stdlib
            // kotlin.coroutines.cancellation.CancellationException caught above — see
            // KtorResponseByteStream.close()'s equivalent conversion for why a re-wrap (rather than a type check) is
            // used: in common code the two are unrelated types (they only happen to coincide as the same actual
            // java.util.concurrent.CancellationException on the JVM), so an `is` check between them is always false.
            val jobCancellation: CoroutinesCancellationException =
                if (cancellationToPropagate == null) {
                    CoroutinesCancellationException("streaming request failed", awaited)
                } else {
                    CoroutinesCancellationException(cancellationToPropagate.message, cancellationToPropagate)
                }
            pumpJob.cancel(jobCancellation)
            throw preHeaderFailure ?: awaited
        }
    }

    /** Runs entirely inside the retained `HttpStatement.execute` scope for [httpResponse]. */
    private suspend fun deliverStreaming(
        request: SdkRequest,
        httpResponse: HttpResponse,
        headerSignal: CompletableDeferred<SdkResponse>,
    ) {
        val statusCode = httpResponse.status.value
        val headers = httpResponse.headers.toSdkHeaders()
        val bodyChannel = Channel<ByteArray>(RESPONSE_CHANNEL_CAPACITY)
        val neutralStream = KtorResponseByteStream(bodyChannel, currentCoroutineContext().job)
        val exchangeId = exchangeObserver.onResponseStarted()
        var terminationCause: Throwable? = null
        // headerSignal.complete() may cross a coroutine boundary — see KtorResponseByteStream's KDoc for why that
        // is safe for CancellationException identity but not asserted for ordinary failures.
        headerSignal.complete(SdkResponse(statusCode, headers, neutralStream))
        try {
            pumpKtorResponseBody(httpResponse.bodyAsChannel().asResponseSource(), bodyChannel)
            bodyChannel.close()
        } catch (cancellation: CancellationException) {
            terminationCause = neutralStream.closeCause ?: cancellation
            bodyChannel.close(cancellation)
            throw cancellation
        } catch (failure: Throwable) {
            val wrapped = SdkTransportException("Ktor response stream failed.", request.operationId, failure)
            terminationCause = wrapped
            bodyChannel.close(wrapped)
        } finally {
            exchangeObserver.onResponseTerminated(exchangeId, terminationCause ?: neutralStream.closeCause)
        }
    }

    override fun capabilities(): TransportCapabilities = reportedCapabilities

    public companion object
}

private fun TransportCapabilities.withKtorNativeDeadlines(): TransportCapabilities =
    copy(
        // Ktor exposes HttpClient.engine.supportedCapabilities (including HttpTimeoutCapability), but that only says
        // an engine can consume timeout configuration. This adapter neither installs HttpTimeout nor maps SdkDeadlines
        // into it, so claiming native deadline enforcement would still be false even for a timeout-capable engine.
        supportedDeadlines = emptySet(),
    )

private fun Headers.toSdkHeaders(): List<SdkHeader> =
    entries().flatMap { (name, values) -> values.map { value -> SdkHeader(name, value) } }

private fun Throwable.findTransportException(): SdkTransportException? =
    generateSequence(this) { failure -> failure.cause }
        .filterIsInstance<SdkTransportException>()
        .firstOrNull()
