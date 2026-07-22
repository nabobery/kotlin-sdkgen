package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.bodies.TransferDirection
import com.nabobery.sdkgen.runtime.bodies.TransferObserver
import com.nabobery.sdkgen.runtime.bodies.observeTransfer
import com.nabobery.sdkgen.runtime.middleware.AttemptCallContext
import com.nabobery.sdkgen.runtime.middleware.AttemptMiddleware
import com.nabobery.sdkgen.runtime.middleware.LogicalCallContext
import com.nabobery.sdkgen.runtime.middleware.LogicalMiddleware
import com.nabobery.sdkgen.runtime.middleware.LogicalOutcome
import com.nabobery.sdkgen.runtime.middleware.runAttemptChain
import com.nabobery.sdkgen.runtime.middleware.runLogicalChain
import com.nabobery.sdkgen.runtime.observation.AttemptOutcomeSignal
import com.nabobery.sdkgen.runtime.observation.SdkLifecycleObserver
import com.nabobery.sdkgen.runtime.observation.SdkOutcomeKind
import com.nabobery.sdkgen.runtime.observation.notifyObservers
import com.nabobery.sdkgen.runtime.resilience.CoroutineSdkDelayer
import com.nabobery.sdkgen.runtime.resilience.CoroutineSdkTimeoutGuard
import com.nabobery.sdkgen.runtime.resilience.DefaultSdkRandom
import com.nabobery.sdkgen.runtime.resilience.RetryBudget
import com.nabobery.sdkgen.runtime.resilience.RetryPolicy
import com.nabobery.sdkgen.runtime.resilience.SdkClock
import com.nabobery.sdkgen.runtime.resilience.SdkDelayer
import com.nabobery.sdkgen.runtime.resilience.SdkRandom
import com.nabobery.sdkgen.runtime.resilience.SdkTimeoutGuard
import com.nabobery.sdkgen.runtime.resilience.SdkWallClock
import com.nabobery.sdkgen.runtime.resilience.SystemSdkClock
import com.nabobery.sdkgen.runtime.resilience.SystemSdkWallClock
import kotlin.coroutines.cancellation.CancellationException
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

/**
 * One stage of the deterministic pipeline [SdkExecutor] follows for every call, in execution order. Published as
 * [SdkExecutor.PIPELINE_ORDER] so generated code, documentation, and tests have one authoritative, typed reference
 * instead of matching against ad hoc strings.
 *
 * @property wireName the stable, human-readable identifier for this stage, safe to log, compare, or display; it does
 *   not encode any behavior and is not consumed as configuration.
 */
public enum class SdkPipelineStage(
    public val wireName: String,
) {
    VALIDATION("validation"),
    SERIALIZATION("serialization"),
    USER_MUTATION("user-mutation"),
    LOGICAL_MIDDLEWARE("logical-middleware"),
    RETRY_ENGINE("retry-engine"),
    ATTEMPT_MIDDLEWARE("attempt-middleware"),
    SDK_IDENTIFICATION("sdk-identification"),
    AUTHENTICATION("authentication"),
    TRANSPORT("transport"),
    DECODING("decoding"),
    REDACTION_OBSERVATION("redaction-observation"),
}

/**
 * Carries the operation-shaped parameters shared by every [SdkExecutor] entry point ([SdkExecutor.execute],
 * [SdkExecutor.executeBodyless], [SdkExecutor.executeRaw], [SdkExecutor.executeWithResponse]): the operation's
 * descriptor, the base URI to resolve its path against, the request value to encode, the ordered request codec ids
 * to select from, and the request parameters (path/query/header) to apply.
 *
 * Not a `data class`: [requestCodecIds] and [parameters] are defensively copied at construction, which a data-class
 * primary constructor cannot do (see [ResponseAlternative]'s KDoc for why). [equals]/[hashCode]/[toString]/[copy]
 * are hand-written over those copies. [toString] is intentionally diagnostic-safe: it strips the base URI's query and
 * fragment, reports only the request value's presence and type, and renders parameters through their value-free form.
 */
public class SdkExecutionRequest<Request>(
    public val metadata: OperationMetadata,
    public val baseUri: String,
    public val requestValue: Request,
    requestCodecIds: List<String>,
    parameters: List<SdkRequestParameter> = emptyList(),
) {
    /** Defensive copy of the request codec ids supplied at construction. */
    public val requestCodecIds: List<String> = requestCodecIds.toList()

    /** Defensive copy of the request parameters supplied at construction. */
    public val parameters: List<SdkRequestParameter> = parameters.toList()

    public fun copy(
        metadata: OperationMetadata = this.metadata,
        baseUri: String = this.baseUri,
        requestValue: Request = this.requestValue,
        requestCodecIds: List<String> = this.requestCodecIds,
        parameters: List<SdkRequestParameter> = this.parameters,
    ): SdkExecutionRequest<Request> = SdkExecutionRequest(metadata, baseUri, requestValue, requestCodecIds, parameters)

    override fun equals(other: Any?): Boolean =
        other is SdkExecutionRequest<*> &&
            metadata == other.metadata &&
            baseUri == other.baseUri &&
            requestValue == other.requestValue &&
            requestCodecIds == other.requestCodecIds &&
            parameters == other.parameters

    override fun hashCode(): Int =
        arrayOf<Any?>(metadata, baseUri, requestValue, requestCodecIds, parameters).contentHashCode()

    override fun toString(): String {
        val requestValueDescription =
            requestValue?.let { value -> "present(${value::class.simpleName ?: "unknown"})" } ?: "absent"
        return "SdkExecutionRequest(metadata=$metadata, baseUri=${redactedUriForDisplay(baseUri)}, " +
            "requestValue=$requestValueDescription, requestCodecIds=$requestCodecIds, parameters=$parameters)"
    }
}

/**
 * Executes generated operations in the pipeline order published as [SdkExecutor.PIPELINE_ORDER]: validation,
 * encoding, user mutation, logical middleware, the retry engine, and — once per physical attempt — attempt
 * middleware, authentication, SDK-identification, transport, decoding, and redaction/observation.
 *
 * Buffered response bodies are closed exactly once with the terminal failure as the close cause. [executeBodyless]
 * closes a successful response without decoding it, while [executeRaw] transfers the raw [SdkByteStream] to the caller,
 * who becomes responsible for closing it. Cancellation is rethrown by identity; ordinary codec and transport failures
 * are converted to typed [SdkException] subclasses.
 *
 * User request-mutation hooks run once per logical call, before [logicalMiddleware] and retrying start.
 * [logicalMiddleware] wraps the retry engine (and every physical attempt inside it) exactly once per logical call;
 * [attemptMiddleware] wraps authentication/signing and the transport exchange once per physical attempt, including
 * attempts the retry engine schedules after a transient failure — see
 * [com.nabobery.sdkgen.runtime.middleware.LogicalMiddleware] and
 * [com.nabobery.sdkgen.runtime.middleware.AttemptMiddleware]. Authentication and signing-style authentication hooks
 * run again for every physical attempt so credentials can be refreshed after a retry decision. Total deadlines cover
 * attempts and backoff; attempt deadlines guard each transport call. Stream-idle deadlines wrap each returned response
 * body at the runtime boundary, and streaming consumers may add the same decorator when they open a raw stream
 * outside this executor.
 *
 * [observers] are notified of low-cardinality lifecycle events (see [SdkLifecycleObserver]) for every call; per-call
 * observers supplied via [CallOptions.observers] are notified in addition, not instead of, [observers]. The same
 * additive combination applies to [logicalMiddleware]/[CallOptions.logicalMiddleware] and
 * [attemptMiddleware]/[CallOptions.attemptMiddleware]: client-level middleware runs outermost, per-call middleware
 * innermost.
 *
 * [productToken] identifies this SDK on the `User-Agent` header — set as the reserved, post-middleware
 * SDK-identification pipeline stage, only when [TransportCapabilities.canSetUserAgent] is `true`, and only when the
 * caller has not already supplied a `User-Agent` header via [CallOptions.headers]. The header is *overwritten*, not
 * appended, so no earlier pipeline stage (including middleware) can smuggle a stale or spoofed value past it.
 *
 * See [SdkResponse] for the ADR-0006 redirect-forwarding-policy and bounded-error-body-capture contracts this
 * executor and its transports must honor.
 */
public class SdkExecutor(
    private val transport: SdkTransport,
    private val authentication: SdkAuthentication? = null,
    private val requestHook: SdkRequestHook? = null,
    private val clock: SdkClock = SystemSdkClock,
    private val wallClock: SdkWallClock = SystemSdkWallClock,
    private val delayer: SdkDelayer = CoroutineSdkDelayer,
    private val random: SdkRandom = DefaultSdkRandom,
    private val retryBudget: RetryBudget = RetryBudget(),
    private val timeoutGuard: SdkTimeoutGuard = CoroutineSdkTimeoutGuard,
    private val logicalMiddleware: List<LogicalMiddleware> = emptyList(),
    private val attemptMiddleware: List<AttemptMiddleware> = emptyList(),
    private val observers: List<SdkLifecycleObserver> = emptyList(),
    private val productToken: String = DEFAULT_PRODUCT_TOKEN,
) {
    private data class CapturedBodyPreview(
        val redactedText: String,
        val truncated: Boolean,
    )

    private interface ResponseDecoder<Response> {
        suspend fun decode(
            metadata: OperationMetadata,
            transportResponse: SdkResponse,
            transferObserver: TransferObserver?,
            logicalCallId: String,
            attemptNumber: Int,
        ): Response
    }

    /**
     * Duplicate-member policy: response bodies decoded through a [MediaTypeCodec] backed by kotlinx.serialization
     * (see [KotlinxSerializationCodec]) resolve duplicate JSON object keys using the parser's last-wins behavior —
     * this executor does not add its own duplicate-key detection or rejection layer. Generated models decode
     * whatever `decodeJsonElement()` produces, including collapsed duplicate discriminators or fields, so they must
     * not be treated as a validation firewall for untrusted relays in Phase 1; callers that need to reject duplicate
     * keys must do so before or alongside decoding.
     */
    @OptIn(ExperimentalUuidApi::class)
    private suspend fun <Request, Decoded> executeInternal(
        metadata: OperationMetadata,
        baseUri: String,
        requestValue: Request,
        requestCodecIds: List<String>,
        responseCodecIds: List<String>,
        requestCodecs: MediaTypeCodecRegistry<Request>,
        decodeResponse: ResponseDecoder<Decoded>,
        options: CallOptions = CallOptions(),
        parameters: List<SdkRequestParameter> = emptyList(),
    ): Decoded {
        val allObservers = observers + options.observers
        val allLogicalMiddleware = logicalMiddleware + options.logicalMiddleware
        val allAttemptMiddleware = attemptMiddleware + options.attemptMiddleware
        val startedAtMillis = clock.monotonicMillis()
        val logicalCallId = Uuid.random().toString()
        var attemptsUsed = 0

        // Item 1 (W2-T8 review): callStarted fires here, at logical-call entry, before validation, encoding, hooks,
        // idempotency generation, and capability preflight run — and the try block below spans every one of those
        // stages, so every terminal path (including these early ones) is observed via callCompleted/callFailed.
        notifyObservers(allObservers) {
            it.callStarted(logicalCallId, metadata.operationId, metadata.method, metadata.path)
        }

        try {
            validate(metadata, baseUri, requestValue, requestCodecIds, responseCodecIds)
            val requestMediaType = metadata.requestMediaTypes.firstOrNull()
            val encodedBody =
                when {
                    requestMediaType == null || requestValue == null -> {
                        null
                    }

                    requestCodecIds.isEmpty() && requestValue is SdkByteStream -> {
                        SdkRequestBody.OneShot(requestValue, requestMediaType)
                    }

                    else -> {
                        val requestCodec = requestCodecs.select(requestCodecIds, requestMediaType)
                        try {
                            requestCodec.encode(requestValue, requestMediaType)
                        } catch (cancellation: CancellationException) {
                            throw cancellation
                        } catch (failure: Throwable) {
                            throw SdkSerializationException(
                                "Failed to encode '${metadata.operationId}'.",
                                metadata.operationId,
                                failure,
                            )
                        }
                    }
                }
            val deadlines = resolveDeadlines(metadata.deadlines, options.deadlines)
            val requestHeaders = buildRequestHeaders(options.headers, parameters)
            var logicalRequest =
                SdkRequest(
                    method = metadata.method,
                    uri = buildRequestUri(baseUri, metadata.path, parameters),
                    headers = addStreamingAcceptHeader(requestHeaders, metadata.streaming),
                    body = encodedBody,
                    expectedResponseMode = metadata.responseMode,
                    deadlines = deadlines,
                    operationId = metadata.operationId,
                    security = metadata.security,
                )
            // Item 6 (W2-T8 review): "caller-supplied" means CallOptions.headers only - the documented contract for
            // applyUserAgent - so a User-Agent injected by a hook (constructor-level or per-call) is not exempted
            // from the reserved SDK-identification stage and gets overwritten just like a middleware-injected one.
            val callerSuppliedUserAgent = options.headers.firstValue(USER_AGENT_HEADER) != null
            logicalRequest = requestHook?.apply(logicalRequest) ?: logicalRequest
            logicalRequest = options.requestHook?.apply(logicalRequest) ?: logicalRequest
            logicalRequest = addGeneratedIdempotencyKey(logicalRequest, metadata.idempotency)
            checkCapabilities(metadata, logicalRequest)

            val retry =
                resolveRetry(metadata.retry, options.retry)
                    ?.let { descriptor ->
                        if (descriptor.retryableStatusCodes.isEmpty()) {
                            descriptor.copy(retryableStatusCodes = DEFAULT_RETRYABLE_STATUSES)
                        } else {
                            descriptor
                        }
                    }?.takeUnless { metadata.responseMode == SdkResponseMode.STREAMING }

            val initialContext =
                LogicalCallContext(logicalRequest, metadata.operationId, metadata.method, metadata.path)
            val result =
                runLogicalChain(allLogicalMiddleware, initialContext) { context ->
                    if (retry == null) {
                        attemptsUsed = 1
                        val attemptRequest = observeRequest(context.request, options.transferObserver, logicalCallId, 1)
                        executeAttempt(
                            metadata,
                            attemptRequest,
                            decodeResponse,
                            startedAtMillis,
                            options.transferObserver,
                            logicalCallId,
                            1,
                            allAttemptMiddleware,
                            allObservers,
                            callerSuppliedUserAgent,
                            onRequestObserved = {},
                        )
                    } else {
                        runWithRetries(
                            metadata,
                            context.request,
                            retry,
                            deadlines,
                            decodeResponse,
                            options,
                            startedAtMillis,
                            logicalCallId,
                            allAttemptMiddleware,
                            allObservers,
                            callerSuppliedUserAgent,
                        ) { attemptsUsed = it }
                    }
                }
            val durationMillis = clock.monotonicMillis() - startedAtMillis
            notifyObservers(allObservers) {
                it.callCompleted(logicalCallId, SdkOutcomeKind.SUCCESS, attemptsUsed, durationMillis)
            }
            return result
        } catch (cancellation: CancellationException) {
            reportCallFailure(allObservers, logicalCallId, SdkOutcomeKind.CANCELLED, attemptsUsed, startedAtMillis)
            throw cancellation
        } catch (failure: Throwable) {
            reportCallFailure(allObservers, logicalCallId, classifyOutcomeKind(failure), attemptsUsed, startedAtMillis)
            throw failure
        }
    }

    /** Executes an operation and returns its declared success response, throwing typed runtime failures otherwise. */
    public suspend fun <Request, Response> execute(
        request: SdkExecutionRequest<Request>,
        responseCodecIds: List<String>,
        requestCodecs: MediaTypeCodecRegistry<Request>,
        responseCodecs: MediaTypeCodecRegistry<Response>,
        options: CallOptions = CallOptions(),
    ): Response =
        executeInternal(
            metadata = request.metadata,
            baseUri = request.baseUri,
            requestValue = request.requestValue,
            requestCodecIds = request.requestCodecIds,
            responseCodecIds = responseCodecIds,
            requestCodecs = requestCodecs,
            decodeResponse =
                object : ResponseDecoder<Response> {
                    override suspend fun decode(
                        metadata: OperationMetadata,
                        transportResponse: SdkResponse,
                        transferObserver: TransferObserver?,
                        logicalCallId: String,
                        attemptNumber: Int,
                    ): Response =
                        decodeAttemptResponse(
                            metadata,
                            transportResponse,
                            responseCodecIds,
                            responseCodecs,
                            transferObserver,
                            logicalCallId,
                            attemptNumber,
                        )
                },
            options = options,
            parameters = request.parameters,
        )

    /**
     * Executes an operation exactly like [execute], but also returns the physical response's headers alongside the
     * decoded success value.
     *
     * For [com.nabobery.sdkgen.runtime.pagination.PaginationDescriptor.HeaderNextUrl] pagination, generated code
     * needs the response headers to locate the `Link` header's continuation target — information [execute] discards
     * once decoding succeeds. This entry point shares every other stage of [execute] (status classification, typed
     * error mapping, retries, cancellation) unchanged; it only additionally captures [SdkResponse.headers] from the
     * same physical response [execute] already decodes.
     */
    public suspend fun <Request, Response> executeWithHeaders(
        request: SdkExecutionRequest<Request>,
        responseCodecIds: List<String>,
        requestCodecs: MediaTypeCodecRegistry<Request>,
        responseCodecs: MediaTypeCodecRegistry<Response>,
        options: CallOptions = CallOptions(),
    ): SdkHeaderedResponse<Response> =
        executeInternal(
            metadata = request.metadata,
            baseUri = request.baseUri,
            requestValue = request.requestValue,
            requestCodecIds = request.requestCodecIds,
            responseCodecIds = responseCodecIds,
            requestCodecs = requestCodecs,
            decodeResponse =
                object : ResponseDecoder<SdkHeaderedResponse<Response>> {
                    override suspend fun decode(
                        metadata: OperationMetadata,
                        transportResponse: SdkResponse,
                        transferObserver: TransferObserver?,
                        logicalCallId: String,
                        attemptNumber: Int,
                    ): SdkHeaderedResponse<Response> {
                        val headers = transportResponse.headers
                        val value =
                            decodeAttemptResponse(
                                metadata,
                                transportResponse,
                                responseCodecIds,
                                responseCodecs,
                                transferObserver,
                                logicalCallId,
                                attemptNumber,
                            )
                        return SdkHeaderedResponse(value, headers)
                    }
                },
            options = options,
            parameters = request.parameters,
        )

    /** Executes an operation that declares no response body and closes the transport body before returning. */
    public suspend fun <Request> executeBodyless(
        request: SdkExecutionRequest<Request>,
        requestCodecs: MediaTypeCodecRegistry<Request>,
        options: CallOptions = CallOptions(),
    ): Unit =
        executeInternal(
            metadata = request.metadata,
            baseUri = request.baseUri,
            requestValue = request.requestValue,
            requestCodecIds = request.requestCodecIds,
            responseCodecIds = emptyList(),
            requestCodecs = requestCodecs,
            decodeResponse =
                object : ResponseDecoder<Unit> {
                    override suspend fun decode(
                        metadata: OperationMetadata,
                        transportResponse: SdkResponse,
                        transferObserver: TransferObserver?,
                        logicalCallId: String,
                        attemptNumber: Int,
                    ) {
                        decodeBodylessAttemptResponse(
                            metadata,
                            transportResponse,
                            transferObserver,
                            logicalCallId,
                            attemptNumber,
                        )
                    }
                },
            options = options,
            parameters = request.parameters,
        )

    /** Executes an operation whose successful response is transferred as an undecoded runtime byte stream. */
    public suspend fun <Request> executeRaw(
        request: SdkExecutionRequest<Request>,
        requestCodecs: MediaTypeCodecRegistry<Request>,
        options: CallOptions = CallOptions(),
    ): SdkByteStream =
        executeInternal(
            metadata = request.metadata,
            baseUri = request.baseUri,
            requestValue = request.requestValue,
            requestCodecIds = request.requestCodecIds,
            responseCodecIds = emptyList(),
            requestCodecs = requestCodecs,
            decodeResponse =
                object : ResponseDecoder<SdkByteStream> {
                    override suspend fun decode(
                        metadata: OperationMetadata,
                        transportResponse: SdkResponse,
                        transferObserver: TransferObserver?,
                        logicalCallId: String,
                        attemptNumber: Int,
                    ): SdkByteStream =
                        decodeRawAttemptResponse(
                            metadata,
                            transportResponse,
                            transferObserver,
                            logicalCallId,
                            attemptNumber,
                        )
                },
            options = options,
            parameters = request.parameters,
        )

    /**
     * Executes an SSE operation as a raw stream on success while preserving generated typed errors on non-success.
     *
     * A successful response transfers its body only after its `Content-Type` matches the operation's declared
     * [StreamingDescriptor.ServerSentEvents.responseContentType]. A declared non-success response is decoded through
     * [responseDecoder] and converted by [mapError]. Unknown statuses retain the bounded, redacted
     * [UnknownApiException] path. Every body is closed on failure or cancellation; ownership transfers only for a
     * validated SSE success.
     */
    public suspend fun <Request, Response> executeRawWithTypedErrors(
        request: SdkExecutionRequest<Request>,
        requestCodecs: MediaTypeCodecRegistry<Request>,
        responseDecoder: SdkResponseAlternativeDecoder<Response>,
        mapError: (Response, Int, List<SdkHeader>) -> SdkApiException,
        options: CallOptions = CallOptions(),
    ): SdkByteStream =
        executeInternal(
            metadata = request.metadata,
            baseUri = request.baseUri,
            requestValue = request.requestValue,
            requestCodecIds = request.requestCodecIds,
            responseCodecIds = emptyList(),
            requestCodecs = requestCodecs,
            decodeResponse =
                object : ResponseDecoder<SdkByteStream> {
                    override suspend fun decode(
                        metadata: OperationMetadata,
                        transportResponse: SdkResponse,
                        transferObserver: TransferObserver?,
                        logicalCallId: String,
                        attemptNumber: Int,
                    ): SdkByteStream =
                        decodeRawTypedErrorAttemptResponse(
                            metadata = metadata,
                            transportResponse = transportResponse,
                            decoder = responseDecoder,
                            mapError = mapError,
                            transferObserver = transferObserver,
                            logicalCallId = logicalCallId,
                            attemptNumber = attemptNumber,
                        )
                },
            options = options,
            parameters = request.parameters,
        )

    /** Executes an operation while preserving each declared response alternative as a typed result. */
    public suspend fun <Request, Response> executeWithResponse(
        request: SdkExecutionRequest<Request>,
        requestCodecs: MediaTypeCodecRegistry<Request>,
        responseDecoder: SdkResponseAlternativeDecoder<Response>,
        options: CallOptions = CallOptions(),
    ): SdkResponseResult<Response> =
        executeInternal(
            metadata = request.metadata,
            baseUri = request.baseUri,
            requestValue = request.requestValue,
            requestCodecIds = request.requestCodecIds,
            responseCodecIds = emptyList(),
            requestCodecs = requestCodecs,
            decodeResponse =
                object : ResponseDecoder<SdkResponseResult<Response>> {
                    override suspend fun decode(
                        metadata: OperationMetadata,
                        transportResponse: SdkResponse,
                        transferObserver: TransferObserver?,
                        logicalCallId: String,
                        attemptNumber: Int,
                    ): SdkResponseResult<Response> =
                        decodeAlternativeAttemptResponse(
                            metadata,
                            transportResponse,
                            responseDecoder,
                            transferObserver,
                            logicalCallId,
                            attemptNumber,
                        )
                },
            options = options,
            parameters = request.parameters,
        )

    /**
     * Executes a generated ergonomic operation using its typed response-alternative decoder.
     *
     * A matched success is converted by [mapSuccess]. A matched non-success is decoded exactly once and converted by
     * [mapError] into an operation-specific [SdkApiException] subtype. Unmatched responses retain the bounded, redacted
     * [UnknownApiException] path. The runtime closes every buffered and error body before it escapes; only an explicitly
     * transferred matched success body may remain open.
     */
    public suspend fun <Request, Response, Success> executeWithTypedErrors(
        request: SdkExecutionRequest<Request>,
        requestCodecs: MediaTypeCodecRegistry<Request>,
        responseDecoder: SdkResponseAlternativeDecoder<Response>,
        mapSuccess: (Response) -> Success,
        mapError: (Response, Int, List<SdkHeader>) -> SdkApiException,
        options: CallOptions = CallOptions(),
    ): Success =
        executeInternal(
            metadata = request.metadata,
            baseUri = request.baseUri,
            requestValue = request.requestValue,
            requestCodecIds = request.requestCodecIds,
            responseCodecIds = emptyList(),
            requestCodecs = requestCodecs,
            decodeResponse =
                object : ResponseDecoder<Success> {
                    override suspend fun decode(
                        metadata: OperationMetadata,
                        transportResponse: SdkResponse,
                        transferObserver: TransferObserver?,
                        logicalCallId: String,
                        attemptNumber: Int,
                    ): Success =
                        decodeTypedErrorAttemptResponse(
                            metadata = metadata,
                            transportResponse = transportResponse,
                            decoder = responseDecoder,
                            mapSuccess = mapSuccess,
                            mapError = mapError,
                            transferObserver = transferObserver,
                            logicalCallId = logicalCallId,
                            attemptNumber = attemptNumber,
                        )
                },
            options = options,
            parameters = request.parameters,
        )

    private fun reportCallFailure(
        allObservers: List<SdkLifecycleObserver>,
        logicalCallId: String,
        kind: SdkOutcomeKind,
        attemptsUsed: Int,
        startedAtMillis: Long,
    ) {
        val durationMillis = clock.monotonicMillis() - startedAtMillis
        notifyObservers(allObservers) { it.callCompleted(logicalCallId, kind, attemptsUsed, durationMillis) }
        notifyObservers(allObservers) { it.callFailed(logicalCallId, kind) }
    }

    @Suppress("LongParameterList")
    private suspend fun <Response> runWithRetries(
        metadata: OperationMetadata,
        logicalRequest: SdkRequest,
        retry: RetryDescriptor,
        deadlines: SdkDeadlines,
        responseDecoder: ResponseDecoder<Response>,
        options: CallOptions,
        startedAtMillis: Long,
        logicalCallId: String,
        allAttemptMiddleware: List<AttemptMiddleware>,
        allObservers: List<SdkLifecycleObserver>,
        callerSuppliedUserAgent: Boolean,
        onAttemptsUsed: (Int) -> Unit,
    ): Response {
        val policy = RetryPolicy(clock, wallClock, random, retryBudget)
        val history = mutableListOf<AttemptOutcome>()
        var attemptNumber = 1
        while (true) {
            onAttemptsUsed(attemptNumber)
            val replayedRequest = logicalRequest.copy(body = bodyForAttempt(logicalRequest.body, attemptNumber))
            val attemptRequest = observeRequest(replayedRequest, options.transferObserver, logicalCallId, attemptNumber)
            // Item 3 (W2-T8 review round 2): recorded at EVERY attempt-middleware/terminal frame entry reached this
            // attempt, deepest wins - reset every attempt and always overwritten at least once (runAttemptChain
            // invokes onRequestObserved for its very first frame unconditionally), so this initial value is only a
            // defensive fallback, never the value actually consumed below.
            var deepestObservedRequest = attemptRequest
            try {
                val result =
                    executeAttempt(
                        metadata,
                        attemptRequest,
                        responseDecoder,
                        startedAtMillis,
                        options.transferObserver,
                        logicalCallId,
                        attemptNumber,
                        allAttemptMiddleware,
                        allObservers,
                        callerSuppliedUserAgent,
                        onRequestObserved = { deepestObservedRequest = it },
                    )
                retryBudget.recordSuccess()
                return result
            } catch (cancellation: CancellationException) {
                throw cancellation
            } catch (failure: SdkException) {
                val headers = (failure as? SdkApiException)?.headers.orEmpty()
                val decision =
                    policy.decide(
                        metadata = metadata,
                        descriptor = retry,
                        body = logicalRequest.body,
                        failure = failure,
                        responseHeaders = headers,
                        attemptNumber = attemptNumber,
                        startedAtMillis = startedAtMillis,
                        totalDeadlineMillis = deadlines.totalMillis,
                        idempotencyKeyPresent =
                            metadata.idempotency?.let {
                                deepestObservedRequest.headers.firstValue(it.keyHeader) != null
                            } == true,
                    )
                history += policy.outcome(attemptNumber, decision, failure)
                if (!decision.retry) {
                    val finalFailure =
                        if (decision.totalDeadlineExceeded) {
                            SdkTimeoutException(
                                TimeoutPhase.TOTAL,
                                "Total deadline expired for '${metadata.operationId}'.",
                                metadata.operationId,
                            )
                        } else {
                            failure
                        }
                    finalFailure.attachRetryHistory(history)
                    throw finalFailure
                }
                val delayMillis = requireNotNull(decision.delayMillis)
                notifyObservers(allObservers) {
                    it.retryScheduled(logicalCallId, delayMillis, AttemptClassification.RETRIED)
                }
                delayer.delay(delayMillis)
                attemptNumber += 1
            }
        }
    }

    @Suppress("LongParameterList")
    private suspend fun <Response> executeAttempt(
        metadata: OperationMetadata,
        logicalRequest: SdkRequest,
        responseDecoder: ResponseDecoder<Response>,
        logicalStartedAtMillis: Long,
        transferObserver: TransferObserver?,
        logicalCallId: String,
        attemptNumber: Int,
        attemptMiddleware: List<AttemptMiddleware>,
        allObservers: List<SdkLifecycleObserver>,
        callerSuppliedUserAgent: Boolean,
        onRequestObserved: (SdkRequest) -> Unit,
    ): Response {
        val attemptStartedAtMillis = clock.monotonicMillis()
        notifyObservers(allObservers) { it.attemptStarted(logicalCallId, attemptNumber) }
        val initialContext = AttemptCallContext(logicalRequest, metadata.operationId, attemptNumber, logicalCallId)
        // Item 5 (W2-T8 review): runAttemptChain itself is now INSIDE this try block. A middleware that throws
        // directly (rather than returning LogicalOutcome.Failure) previously escaped before this try even started,
        // so attemptStarted above was never paired with an attemptCompleted below. Moving the call in closes that
        // gap: every path out of this function past attemptStarted now reports attemptCompleted exactly once.
        return try {
            val outcome =
                // Item 3 (W2-T8 review round 2): onRequestObserved is now supplied straight through to the chain
                // runner, which invokes it at EVERY frame entry (deepest wins) - not just here at the terminal - so
                // an outer middleware's mutation is visible to the retry engine even when an inner middleware
                // short-circuits before ever reaching this terminal closure.
                runAttemptChain(attemptMiddleware, initialContext, onRequestObserved) { context ->
                    val requestWithUserAgent =
                        applyUserAgent(context.request, transport.capabilities(), callerSuppliedUserAgent, productToken)
                    val request =
                        try {
                            authentication?.apply(requestWithUserAgent) ?: requestWithUserAgent
                        } catch (cancellation: CancellationException) {
                            throw cancellation
                        } catch (failure: SdkException) {
                            throw failure
                        } catch (failure: Throwable) {
                            throw SdkAuthenticationException(
                                "Authentication failed for '${metadata.operationId}'.",
                                metadata.operationId,
                                failure,
                            )
                        }
                    executeTransportWithDeadline(metadata, request, logicalStartedAtMillis)
                }
            val response =
                when (outcome) {
                    is LogicalOutcome.Failure -> throw outcome.error
                    is LogicalOutcome.Success -> outcome.value
                }
            val decoded =
                responseDecoder.decode(
                    metadata,
                    response,
                    transferObserver,
                    logicalCallId,
                    attemptNumber,
                )
            reportAttemptCompleted(
                allObservers,
                logicalCallId,
                attemptNumber,
                AttemptOutcomeSignal.StatusClass(response.statusCode / HUNDRED),
                attemptStartedAtMillis,
            )
            decoded
        } catch (cancellation: CancellationException) {
            reportAttemptCompleted(
                allObservers,
                logicalCallId,
                attemptNumber,
                AttemptOutcomeSignal.Failure(SdkOutcomeKind.CANCELLED),
                attemptStartedAtMillis,
            )
            throw cancellation
        } catch (failure: Throwable) {
            val signal =
                (failure as? SdkApiException)?.let { AttemptOutcomeSignal.StatusClass(it.statusCode / HUNDRED) }
                    ?: (failure as? UnknownApiException)?.let {
                        AttemptOutcomeSignal.StatusClass(
                            it.statusCode / HUNDRED,
                        )
                    }
                    ?: AttemptOutcomeSignal.Failure(classifyOutcomeKind(failure))
            reportAttemptCompleted(allObservers, logicalCallId, attemptNumber, signal, attemptStartedAtMillis)
            throw failure
        }
    }

    private fun reportAttemptCompleted(
        allObservers: List<SdkLifecycleObserver>,
        logicalCallId: String,
        attemptNumber: Int,
        outcome: AttemptOutcomeSignal,
        attemptStartedAtMillis: Long,
    ) {
        val durationMillis = clock.monotonicMillis() - attemptStartedAtMillis
        notifyObservers(allObservers) { it.attemptCompleted(logicalCallId, attemptNumber, outcome, durationMillis) }
    }

    private fun observeResponse(
        transportResponse: SdkResponse,
        transferObserver: TransferObserver?,
        logicalCallId: String,
        attemptNumber: Int,
    ): SdkResponse =
        if (transferObserver == null) {
            transportResponse
        } else {
            transportResponse.copy(
                body =
                    observeTransfer(
                        stream = transportResponse.body,
                        observer = transferObserver,
                        direction = TransferDirection.DOWNLOAD,
                        callId = logicalCallId,
                        attemptNumber = attemptNumber,
                        totalBytes = transportResponse.headers.firstValue("Content-Length")?.toLongOrNull(),
                    ),
            )
        }

    private suspend fun decodeBodylessAttemptResponse(
        metadata: OperationMetadata,
        transportResponse: SdkResponse,
        transferObserver: TransferObserver?,
        logicalCallId: String,
        attemptNumber: Int,
    ) {
        val response = observeResponse(transportResponse, transferObserver, logicalCallId, attemptNumber)
        var closeCause: Throwable? = null
        try {
            classifyStatus(metadata, response)
        } catch (failure: Throwable) {
            closeCause = failure
            throw failure
        } finally {
            closeResponseBody(response.body, closeCause, metadata.operationId)
        }
    }

    private suspend fun decodeRawAttemptResponse(
        metadata: OperationMetadata,
        transportResponse: SdkResponse,
        transferObserver: TransferObserver?,
        logicalCallId: String,
        attemptNumber: Int,
    ): SdkByteStream {
        val response = observeResponse(transportResponse, transferObserver, logicalCallId, attemptNumber)
        var closeCause: Throwable? = null
        var transferBody = false
        try {
            classifyStatus(metadata, response)
            validateStreamingContentType(metadata, response)
            transferBody = true
            return response.body
        } catch (failure: Throwable) {
            closeCause = failure
            throw failure
        } finally {
            if (!transferBody) closeResponseBody(response.body, closeCause, metadata.operationId)
        }
    }

    @Suppress("LongParameterList")
    private suspend fun <Response> decodeAttemptResponse(
        metadata: OperationMetadata,
        transportResponse: SdkResponse,
        responseCodecIds: List<String>,
        responseCodecs: MediaTypeCodecRegistry<Response>,
        transferObserver: TransferObserver?,
        logicalCallId: String,
        attemptNumber: Int,
    ): Response {
        require(responseCodecIds.isNotEmpty()) {
            "execute() requires at least one response codec id; use executeBodyless() or executeRaw() for " +
                "operations with no declared response codec."
        }
        val response = observeResponse(transportResponse, transferObserver, logicalCallId, attemptNumber)
        var closeCause: Throwable? = null
        try {
            classifyStatus(metadata, response)
            val contentType = response.headers.firstValue("Content-Type") ?: metadata.responseMediaTypes.firstOrNull()
            val responseCodec = responseCodecs.select(responseCodecIds, contentType)
            val decoded =
                try {
                    responseCodec.decode(response.body, contentType)
                } catch (cancellation: CancellationException) {
                    closeCause = cancellation
                    throw cancellation
                } catch (failure: SdkException) {
                    closeCause = failure
                    throw failure
                } catch (failure: Throwable) {
                    closeCause = failure
                    throw SdkSerializationException(
                        "Failed to decode '${metadata.operationId}'.",
                        metadata.operationId,
                        failure,
                    )
                }
            return decoded
        } catch (failure: Throwable) {
            closeCause = failure
            throw failure
        } finally {
            closeResponseBody(response.body, closeCause, metadata.operationId)
        }
    }

    @Suppress("LongParameterList")
    private suspend fun <Response> decodeRawTypedErrorAttemptResponse(
        metadata: OperationMetadata,
        transportResponse: SdkResponse,
        decoder: SdkResponseAlternativeDecoder<Response>,
        mapError: (Response, Int, List<SdkHeader>) -> SdkApiException,
        transferObserver: TransferObserver?,
        logicalCallId: String,
        attemptNumber: Int,
    ): SdkByteStream {
        val response = observeResponse(transportResponse, transferObserver, logicalCallId, attemptNumber)
        var closeCause: Throwable? = null
        var transferBody = false
        try {
            if (isSuccessStatus(metadata, response.statusCode)) {
                validateStreamingContentType(metadata, response)
                transferBody = true
                return response.body
            }
            val headerContentType = response.headers.firstValue(CONTENT_TYPE_HEADER)
            val alternative =
                matchAlternative(metadata.responseAlternatives, response.statusCode, headerContentType) ?: run {
                    val capturedBody = captureUnknownBody(response.body)
                    throw UnknownApiException(
                        statusCode = response.statusCode,
                        headers = response.headers,
                        redactedBodyPreview = capturedBody.redactedText,
                        operationId = metadata.operationId,
                        bodyPreviewTruncated = capturedBody.truncated,
                    )
                }
            val contentType =
                headerContentType
                    ?: alternative.mediaTypes.firstOrNull()
                    ?: metadata.responseMediaTypes.firstOrNull()
            val decoded =
                try {
                    decoder.decodeWithBody(
                        alternative,
                        response.statusCode,
                        response.headers,
                        response.body,
                        contentType,
                    )
                } catch (cancellation: CancellationException) {
                    closeCause = cancellation
                    throw cancellation
                } catch (failure: SdkException) {
                    closeCause = failure
                    throw failure
                } catch (failure: Throwable) {
                    closeCause = failure
                    throw SdkSerializationException(
                        "Failed to decode '${metadata.operationId}'.",
                        metadata.operationId,
                        failure,
                    )
                }
            throw mapError(decoded.value, response.statusCode, response.headers)
        } catch (failure: Throwable) {
            closeCause = failure
            throw failure
        } finally {
            if (!transferBody) closeResponseBody(response.body, closeCause, metadata.operationId)
        }
    }

    @Suppress("LongParameterList")
    private suspend fun <Response> decodeAlternativeAttemptResponse(
        metadata: OperationMetadata,
        transportResponse: SdkResponse,
        decoder: SdkResponseAlternativeDecoder<Response>,
        transferObserver: TransferObserver?,
        logicalCallId: String,
        attemptNumber: Int,
    ): SdkResponseResult<Response> {
        val response = observeResponse(transportResponse, transferObserver, logicalCallId, attemptNumber)
        var closeCause: Throwable? = null
        var transferBody = false
        try {
            val headerContentType = response.headers.firstValue("Content-Type")
            val alternative =
                matchAlternative(
                    metadata.responseAlternatives,
                    response.statusCode,
                    headerContentType,
                )
            val contentType =
                headerContentType
                    ?: alternative?.mediaTypes?.firstOrNull()
                    ?: metadata.responseMediaTypes.firstOrNull()
            val decoded =
                try {
                    if (alternative == null) {
                        SdkResponseDecodeResult(
                            value = decoder.decodeUnknown(response.statusCode, response.headers, response.body),
                        )
                    } else {
                        decoder.decodeWithBody(
                            alternative,
                            response.statusCode,
                            response.headers,
                            response.body,
                            contentType,
                        )
                    }
                } catch (cancellation: CancellationException) {
                    closeCause = cancellation
                    throw cancellation
                } catch (failure: SdkException) {
                    closeCause = failure
                    throw failure
                } catch (failure: Throwable) {
                    closeCause = failure
                    throw SdkSerializationException(
                        "Failed to decode '${metadata.operationId}'.",
                        metadata.operationId,
                        failure,
                    )
                }
            transferBody =
                alternative != null &&
                decoded.transferBody &&
                isSuccessStatus(metadata, response.statusCode)
            return if (alternative == null) {
                SdkResponseResult.Unknown(response.statusCode, response.headers, decoded.value)
            } else {
                SdkResponseResult.Matched(alternative, response.statusCode, response.headers, decoded.value)
            }
        } catch (failure: Throwable) {
            closeCause = failure
            throw failure
        } finally {
            if (!transferBody) closeResponseBody(response.body, closeCause, metadata.operationId)
        }
    }

    @Suppress("LongParameterList")
    private suspend fun <Response, Success> decodeTypedErrorAttemptResponse(
        metadata: OperationMetadata,
        transportResponse: SdkResponse,
        decoder: SdkResponseAlternativeDecoder<Response>,
        mapSuccess: (Response) -> Success,
        mapError: (Response, Int, List<SdkHeader>) -> SdkApiException,
        transferObserver: TransferObserver?,
        logicalCallId: String,
        attemptNumber: Int,
    ): Success {
        val response = observeResponse(transportResponse, transferObserver, logicalCallId, attemptNumber)
        var closeCause: Throwable? = null
        var transferBody = false
        try {
            val headerContentType = response.headers.firstValue("Content-Type")
            val alternative =
                matchAlternative(
                    metadata.responseAlternatives,
                    response.statusCode,
                    headerContentType,
                ) ?: run {
                    val capturedBody = captureUnknownBody(response.body)
                    throw UnknownApiException(
                        statusCode = response.statusCode,
                        headers = response.headers,
                        redactedBodyPreview = capturedBody.redactedText,
                        operationId = metadata.operationId,
                        bodyPreviewTruncated = capturedBody.truncated,
                    )
                }
            val contentType =
                headerContentType
                    ?: alternative.mediaTypes.firstOrNull()
                    ?: metadata.responseMediaTypes.firstOrNull()
            val decoded =
                try {
                    decoder.decodeWithBody(
                        alternative,
                        response.statusCode,
                        response.headers,
                        response.body,
                        contentType,
                    )
                } catch (cancellation: CancellationException) {
                    closeCause = cancellation
                    throw cancellation
                } catch (failure: SdkException) {
                    closeCause = failure
                    throw failure
                } catch (failure: Throwable) {
                    closeCause = failure
                    throw SdkSerializationException(
                        "Failed to decode '${metadata.operationId}'.",
                        metadata.operationId,
                        failure,
                    )
                }
            if (!isSuccessStatus(metadata, response.statusCode)) {
                throw mapError(decoded.value, response.statusCode, response.headers)
            }
            val success = mapSuccess(decoded.value)
            transferBody = decoded.transferBody
            return success
        } catch (failure: Throwable) {
            closeCause = failure
            throw failure
        } finally {
            if (!transferBody) closeResponseBody(response.body, closeCause, metadata.operationId)
        }
    }

    private fun closeResponseBody(
        body: SdkByteStream,
        closeCause: Throwable?,
        operationId: String,
    ) {
        try {
            body.close(closeCause)
        } catch (closeFailure: Throwable) {
            closeCause?.let { throw it }
            if (closeFailure is CancellationException) throw closeFailure
            throw SdkTransportException(
                "Failed to close response body for '$operationId'.",
                operationId,
                closeFailure,
            )
        }
    }

    private suspend fun executeTransportWithDeadline(
        metadata: OperationMetadata,
        request: SdkRequest,
        logicalStartedAtMillis: Long,
    ): SdkResponse {
        val elapsed = clock.monotonicMillis() - logicalStartedAtMillis
        val remainingTotal = request.deadlines.totalMillis?.minus(elapsed)
        if (remainingTotal != null && remainingTotal <= 0) {
            throw SdkTimeoutException(
                TimeoutPhase.TOTAL,
                "Total deadline expired for '${metadata.operationId}'.",
                metadata.operationId,
            )
        }
        val attemptDeadline = request.deadlines.attemptMillis
        val timeoutMillis = listOfNotNull(remainingTotal, attemptDeadline).minOrNull()
        val timeoutPhase =
            if (remainingTotal != null && remainingTotal <= (attemptDeadline ?: Long.MAX_VALUE)) {
                TimeoutPhase.TOTAL
            } else {
                TimeoutPhase.ATTEMPT
            }
        var response: SdkResponse? = null
        try {
            if (timeoutMillis == null) {
                response = transport.execute(request)
            } else {
                var transportFailure: Throwable? = null
                val completed =
                    timeoutGuard.runWithTimeout(timeoutMillis) {
                        try {
                            response = transport.execute(request)
                        } catch (cancellation: CancellationException) {
                            throw cancellation
                        } catch (failure: Throwable) {
                            transportFailure = failure
                        }
                    }
                transportFailure?.let { throw it }
                if (!completed) {
                    throw SdkTimeoutException(
                        timeoutPhase,
                        "${timeoutPhase.name.lowercase()} deadline expired for '${metadata.operationId}'.",
                        metadata.operationId,
                    )
                }
            }
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (failure: SdkException) {
            throw failure
        } catch (failure: Throwable) {
            throw SdkTransportException(
                "Transport failed for '${metadata.operationId}'.",
                metadata.operationId,
                failure,
            )
        }
        val completedResponse = requireNotNull(response)
        val idleMillis = request.deadlines.idleMillis
        return if (idleMillis == null || request.expectedResponseMode != SdkResponseMode.STREAMING) {
            completedResponse
        } else {
            completedResponse.copy(
                body = completedResponse.body.withIdleDeadline(idleMillis, request.operationId, timeoutGuard),
            )
        }
    }

    @OptIn(ExperimentalUuidApi::class)
    private fun addGeneratedIdempotencyKey(
        request: SdkRequest,
        descriptor: IdempotencyDescriptor?,
    ): SdkRequest {
        if (descriptor == null || !descriptor.clientGenerated ||
            request.headers.firstValue(descriptor.keyHeader) != null
        ) {
            return request
        }
        return request.copy(headers = request.headers + SdkHeader(descriptor.keyHeader, Uuid.random().toString()))
    }

    private fun observeRequest(
        request: SdkRequest,
        observer: TransferObserver?,
        logicalCallId: String,
        attemptNumber: Int,
    ): SdkRequest =
        if (observer == null || request.body == null) {
            request
        } else {
            request.copy(body = observeTransfer(request.body, observer, logicalCallId, attemptNumber))
        }

    private suspend fun bodyForAttempt(
        body: SdkRequestBody?,
        attemptNumber: Int,
    ): SdkRequestBody? =
        when (body) {
            is SdkRequestBody.ReplayFactory -> body.create()
            else -> body
        }

    /**
     * Classifies [response] against [OperationMetadata.responseAlternatives] (falling back to the legacy
     * [OperationMetadata.successStatusCodes]-only contract when no alternatives are declared) and throws the typed
     * failure for a non-success outcome. Returns normally only when the response should be decoded as a success.
     *
     * When [OperationMetadata.responseAlternatives] is non-empty:
     *  - the best-matching alternative is chosen by selector precedence: [ResponseSelector.ExactStatus] over
     *    [ResponseSelector.StatusRange] over [ResponseSelector.Default], then by normalized `Content-Type` within
     *    that selector tier;
     *  - a match on a 2xx status, or a status also present in the legacy [OperationMetadata.successStatusCodes],
     *    is success;
     *  - a match on any other status throws [SdkApiException], exactly as the legacy-only path does;
     *  - no match at all throws [UnknownApiException] (with [UnknownApiException.redactedBodyPreview] left `null`
     *    here — bounded body capture is wired up alongside the retry engine, not in this executor).
     *
     * When [OperationMetadata.responseAlternatives] is empty, behavior is unchanged from before response
     * alternatives existed: any status outside [OperationMetadata.successStatusCodes] throws [SdkApiException].
     */
    private suspend fun classifyStatus(
        metadata: OperationMetadata,
        response: SdkResponse,
    ) {
        val statusCode = response.statusCode
        if (metadata.responseAlternatives.isEmpty()) {
            if (statusCode !in metadata.successStatusCodes) {
                throw SdkApiException(statusCode, response.headers, metadata.operationId)
            }
            return
        }
        val matched =
            matchAlternative(
                metadata.responseAlternatives,
                statusCode,
                response.headers.firstValue("Content-Type"),
            ) ?: run {
                val capturedBody = captureUnknownBody(response.body)
                throw UnknownApiException(
                    statusCode = statusCode,
                    headers = response.headers,
                    redactedBodyPreview = capturedBody.redactedText,
                    operationId = metadata.operationId,
                    bodyPreviewTruncated = capturedBody.truncated,
                )
            }
        if (!isSuccessStatus(metadata, statusCode)) {
            throw SdkApiException(statusCode, response.headers, metadata.operationId)
        }
    }

    private suspend fun captureUnknownBody(body: SdkByteStream): CapturedBodyPreview {
        val maxBytes = UnknownApiException.MAX_BODY_PREVIEW_BYTES
        val captured = ByteArray(maxBytes + 1)
        var size = 0
        var truncated = false
        while (size < captured.size) {
            val chunk = body.readChunk(minOf(SdkByteStream.DEFAULT_READ_SIZE, captured.size - size)) ?: break
            val copySize = minOf(chunk.size, captured.size - size)
            chunk.copyInto(captured, destinationOffset = size, endIndex = copySize)
            size += copySize
            if (copySize < chunk.size || size == captured.size) {
                truncated = true
                break
            }
        }
        return CapturedBodyPreview(
            redactDiagnosticText(captured.copyOf(minOf(size, maxBytes)).decodeToString()),
            truncated,
        )
    }

    private fun isSuccessStatus(
        metadata: OperationMetadata,
        statusCode: Int,
    ): Boolean = statusCode in 200..299 || statusCode in metadata.successStatusCodes

    /**
     * Selects the alternative that governs [statusCode], preferring ExactStatus, then StatusRange, then Default. Within
     * that selector tier, normalized media types rank as exact, type wildcard, global wildcard, empty-media fallback,
     * then declaration-order fallback.
     *
     * Visibility is `internal`, not `private`: this precedence is not observably distinguishable through
     * [execute]'s public outcomes alone (a matched ExactStatus and a matched StatusRange covering the same status
     * throw the identical [SdkApiException] shape), so tests call this directly and assert on
     * [ResponseAlternative.typeTag] to prove which alternative precedence actually selected.
     */
    internal fun matchAlternative(
        alternatives: List<ResponseAlternative>,
        statusCode: Int,
    ): ResponseAlternative? = matchAlternative(alternatives, statusCode, null)

    internal fun matchAlternative(
        alternatives: List<ResponseAlternative>,
        statusCode: Int,
        contentType: String?,
    ): ResponseAlternative? {
        val candidates = alternatives.filter { alternative -> alternative.selector.matches(statusCode) }
        val bestPrecedence =
            candidates.minOfOrNull { alternative -> selectorPrecedence(alternative.selector) }
                ?: return null
        val bestCandidates =
            candidates.filter { alternative -> selectorPrecedence(alternative.selector) == bestPrecedence }
        val normalizedContentType = normalizeMediaType(contentType)
        return bestCandidates.minByOrNull { alternative ->
            mediaTypePrecedence(alternative, normalizedContentType)
        }
    }

    private fun selectorPrecedence(selector: ResponseSelector): Int =
        when (selector) {
            is ResponseSelector.ExactStatus -> 0
            is ResponseSelector.StatusRange -> 1
            ResponseSelector.Default -> 2
        }

    private fun mediaTypePrecedence(
        alternative: ResponseAlternative,
        normalizedContentType: String?,
    ): Int {
        if (alternative.mediaTypes.isEmpty()) return EMPTY_MEDIA_PRECEDENCE
        return alternative.mediaTypes.minOfOrNull { declaredMediaType ->
            mediaTypePrecedence(declaredMediaType, normalizedContentType)
        } ?: DECLARATION_FALLBACK_PRECEDENCE
    }

    private fun mediaTypePrecedence(
        declaredMediaType: String,
        normalizedContentType: String?,
    ): Int {
        val declared = normalizeMediaType(declaredMediaType) ?: return DECLARATION_FALLBACK_PRECEDENCE
        if (normalizedContentType == null) return DECLARATION_FALLBACK_PRECEDENCE
        if (declared == normalizedContentType) return EXACT_MEDIA_PRECEDENCE
        if (declared == "*/*") return GLOBAL_WILDCARD_PRECEDENCE
        if (declared.endsWith("/*") &&
            normalizedContentType.substringBefore('/') == declared.substringBefore('/')
        ) {
            return TYPE_WILDCARD_PRECEDENCE
        }
        return DECLARATION_FALLBACK_PRECEDENCE
    }

    private fun normalizeMediaType(mediaType: String?): String? =
        mediaType
            ?.substringBefore(';')
            ?.trim()
            ?.lowercase()
            ?.takeIf(String::isNotEmpty)

    private fun addStreamingAcceptHeader(
        headers: List<SdkHeader>,
        streaming: StreamingDescriptor?,
    ): List<SdkHeader> {
        val descriptor = streaming as? StreamingDescriptor.ServerSentEvents ?: return headers
        if (headers.firstValue(ACCEPT_HEADER) != null) return headers
        return headers + SdkHeader(ACCEPT_HEADER, descriptor.responseContentType)
    }

    private fun validateStreamingContentType(
        metadata: OperationMetadata,
        response: SdkResponse,
    ) {
        val descriptor = metadata.streaming as? StreamingDescriptor.ServerSentEvents ?: return
        val expected = normalizeMediaType(descriptor.responseContentType)
        val actual = normalizeMediaType(response.headers.firstValue(CONTENT_TYPE_HEADER))
        if (expected == null || actual != expected) {
            throw SdkStreamingException(
                "Streaming response for '${metadata.operationId}' must have Content-Type " +
                    "'${descriptor.responseContentType}', but received '${actual ?: "<missing>"}'.",
                metadata.operationId,
            )
        }
    }

    /**
     * Rejects a request the configured [transport] has declared, via [SdkTransport.capabilities], that it cannot
     * carry out — before [transport].[SdkTransport.execute] is ever called, so a request never partially starts on
     * a transport that cannot honor it.
     */
    private fun checkCapabilities(
        metadata: OperationMetadata,
        request: SdkRequest,
    ) {
        val capabilities = transport.capabilities()
        if (request.expectedResponseMode == SdkResponseMode.STREAMING && !capabilities.supportsStreaming) {
            throw SdkCapabilityException(
                "Transport does not support streaming responses, required by '${metadata.operationId}'.",
                capability = "streaming",
                operationId = metadata.operationId,
            )
        }
    }

    /**
     * Applies the reserved, post-middleware SDK-identification pipeline stage (FR-END-024, ADR-0006): sets
     * `User-Agent` to [productToken] by *overwriting* any existing value (never appending), so a middleware cannot
     * tamper with SDK identification once this stage runs. Only takes effect when [capabilities] reports
     * [TransportCapabilities.canSetUserAgent]; a missing capability never fails the request, it just leaves
     * [request] untouched. A caller-supplied `User-Agent` (tracked by [callerSuppliedUserAgent], computed from
     * [CallOptions.headers] before any middleware ran) always wins over [productToken].
     */
    private fun applyUserAgent(
        request: SdkRequest,
        capabilities: TransportCapabilities,
        callerSuppliedUserAgent: Boolean,
        productToken: String,
    ): SdkRequest {
        if (!capabilities.canSetUserAgent || callerSuppliedUserAgent) return request
        val withoutExisting = request.headers.filterNot { it.name.equals(USER_AGENT_HEADER, ignoreCase = true) }
        return request.copy(headers = withoutExisting + SdkHeader(USER_AGENT_HEADER, productToken))
    }

    /**
     * Maps a thrown failure to the low-cardinality [SdkOutcomeKind] the telemetry SPI reports. Cancellation is
     * handled by its own dedicated catch clauses at every call site — this function is never asked to classify a
     * [CancellationException].
     */
    private fun classifyOutcomeKind(failure: Throwable): SdkOutcomeKind =
        when (failure) {
            is SdkTimeoutException -> SdkOutcomeKind.TIMEOUT
            is SdkTransportException -> SdkOutcomeKind.TRANSPORT_ERROR
            is SdkAuthenticationException -> SdkOutcomeKind.AUTHENTICATION_ERROR
            is SdkSerializationException -> SdkOutcomeKind.SERIALIZATION_ERROR
            is SdkApiException -> SdkOutcomeKind.API_ERROR
            is UnknownApiException -> SdkOutcomeKind.API_ERROR
            is SdkCapabilityException -> SdkOutcomeKind.CAPABILITY_ERROR
            is SdkConfigurationException -> SdkOutcomeKind.CONFIGURATION_ERROR
            else -> SdkOutcomeKind.UNKNOWN
        }

    public companion object {
        /**
         * The deterministic pipeline order this executor follows, published so generated code, documentation, and
         * tests have one authoritative reference (spec §11.5-11.6): validation → serialization (request encoding) →
         * user mutation (request hooks from [CallOptions] and constructor wiring) → logical middleware (wraps the
         * retry engine, once) → the retry engine → per physical attempt: attempt middleware (wraps
         * authentication/signing and transport, once per attempt) → SDK identification (`User-Agent`) →
         * authentication/signing → transport → decoding → redaction/observation (lifecycle events).
         */
        public val PIPELINE_ORDER: List<SdkPipelineStage> = SdkPipelineStage.entries.toList()

        /** Default `User-Agent` product token, applied when no caller-supplied value or explicit override exists. */
        public const val DEFAULT_PRODUCT_TOKEN: String = "kotlin-sdkgen/0.1.0-SNAPSHOT"

        internal const val USER_AGENT_HEADER: String = "User-Agent"
        internal const val ACCEPT_HEADER: String = "Accept"
        internal const val CONTENT_TYPE_HEADER: String = "Content-Type"
        internal const val HUNDRED: Int = 100

        private const val EXACT_MEDIA_PRECEDENCE: Int = 0
        private const val TYPE_WILDCARD_PRECEDENCE: Int = 1
        private const val GLOBAL_WILDCARD_PRECEDENCE: Int = 2
        private const val EMPTY_MEDIA_PRECEDENCE: Int = 3
        private const val DECLARATION_FALLBACK_PRECEDENCE: Int = 4

        private val DEFAULT_RETRYABLE_STATUSES: List<ResponseSelector> =
            listOf(
                ResponseSelector.ExactStatus(408),
                ResponseSelector.ExactStatus(429),
                ResponseSelector.StatusRange(500, 599),
            )
    }

    private fun validate(
        metadata: OperationMetadata,
        baseUri: String,
        requestValue: Any?,
        requestCodecIds: List<String>,
        responseCodecIds: List<String>,
    ) {
        if (metadata.operationId.isBlank()) throw SdkConfigurationException("operationId must not be blank")
        if (metadata.method.isBlank()) throw SdkConfigurationException("method must not be blank", metadata.operationId)
        if (!metadata.path.startsWith(
                '/',
            )
        ) {
            throw SdkConfigurationException("operation path must start with '/'", metadata.operationId)
        }
        if (baseUri.isBlank()) throw SdkConfigurationException("baseUri must not be blank", metadata.operationId)
        if (metadata.requestMediaTypes.isEmpty() && requestValue !is Unit) {
            throw SdkCapabilityException(
                "A non-Unit request requires a media type and codec.",
                "request-codec",
                metadata.operationId,
            )
        }
        if (metadata.requestMediaTypes.isEmpty() && requestCodecIds.isNotEmpty()) {
            throw SdkCapabilityException(
                "A request body cannot declare a codec without a media type.",
                "request-codec",
                metadata.operationId,
            )
        }
        if (metadata.responseMediaTypes.isEmpty() && responseCodecIds.isNotEmpty()) {
            throw SdkCapabilityException(
                "A response body cannot declare a codec without a media type.",
                "response-codec",
                metadata.operationId,
            )
        }
    }
}
