package com.nabobery.sdkgen.runtime

import kotlin.jvm.JvmInline

/**
 * Selects which physical response(s) a [ResponseAlternative] applies to.
 *
 * Runtime behavior derives only from explicit metadata: selection is always evaluated against the descriptor value
 * present on the operation, never inferred from status-code conventions or heuristics.
 */
public sealed interface ResponseSelector {
    /** Returns whether [statusCode] is covered by this selector. */
    public fun matches(statusCode: Int): Boolean

    /** Matches exactly one HTTP status code, e.g. `200`. */
    public data class ExactStatus(
        public val code: Int,
    ) : ResponseSelector {
        override fun matches(statusCode: Int): Boolean = statusCode == code
    }

    /** Matches an inclusive status-code range, e.g. `4xx` as `StatusRange(400, 499)`. */
    public data class StatusRange(
        public val firstInclusive: Int,
        public val lastInclusive: Int,
    ) : ResponseSelector {
        init {
            require(firstInclusive <= lastInclusive) {
                "firstInclusive ($firstInclusive) must be <= lastInclusive ($lastInclusive)"
            }
        }

        override fun matches(statusCode: Int): Boolean = statusCode in firstInclusive..lastInclusive
    }

    /** Matches any status code not claimed by a more specific alternative on the same operation. */
    public data object Default : ResponseSelector {
        override fun matches(statusCode: Int): Boolean = true
    }
}

/**
 * One declared response shape for an operation: the statuses it applies to ([selector]) and the media types
 * acceptable for that shape, in preference order.
 *
 * Not a `data class`: Kotlin requires every primary-constructor parameter of a data class to be a bare `val`/`var`
 * property, which makes it impossible to defensively copy an incoming mutable collection before it becomes part of
 * the class's identity (see [mediaTypes]). This type instead declares [mediaTypes] as a plain constructor parameter
 * and re-exposes it as a property backed by an immutable copy, with [equals], [hashCode], [toString], and [copy]
 * written by hand to match ordinary data-class semantics over that copy.
 *
 * @property id a stable per-operation identity emitted by the generator so alternatives that share a selector remain
 *   distinguishable during generated decoder dispatch. It is nullable only for legacy descriptors constructed before
 *   response-alternative identities were added.
 * @property typeTag an opaque identifier the generator emits to associate this alternative with a generated Kotlin
 *   type (e.g. a response model class name). Carries no runtime behavior in this task: the executor does not read
 *   it, it exists purely so the generator can round-trip which alternative maps to which generated type.
 * @property mode the response delivery mode declared for this alternative. This is explicit metadata; the executor does
 *   not infer it from the media type or operation name.
 */
public class ResponseAlternative(
    public val selector: ResponseSelector,
    mediaTypes: List<String>,
    public val typeTag: String? = null,
    public val mode: SdkResponseMode = SdkResponseMode.BUFFERED,
    public val id: String? = null,
) {
    /** Defensive copy of the media types supplied at construction; later mutation of the input has no effect. */
    public val mediaTypes: List<String> = mediaTypes.toList()

    /** Copies the complete descriptor, including the response delivery mode and stable alternative identity. */
    public fun copy(
        selector: ResponseSelector = this.selector,
        mediaTypes: List<String> = this.mediaTypes,
        typeTag: String? = this.typeTag,
        mode: SdkResponseMode = this.mode,
        id: String? = this.id,
    ): ResponseAlternative = ResponseAlternative(selector, mediaTypes, typeTag, mode, id)

    override fun equals(other: Any?): Boolean =
        other is ResponseAlternative &&
            selector == other.selector &&
            mediaTypes == other.mediaTypes &&
            typeTag == other.typeTag &&
            mode == other.mode &&
            id == other.id

    override fun hashCode(): Int = arrayOf(selector, mediaTypes, typeTag, mode, id).contentHashCode()

    override fun toString(): String =
        "ResponseAlternative(selector=$selector, mediaTypes=$mediaTypes, typeTag=$typeTag, mode=$mode, id=$id)"
}

/**
 * References one OpenAPI security scheme by id, with the OAuth2/OpenID scopes required for this requirement.
 *
 * No secret material is ever present on this type or reachable from it — schemes are resolved to credentials by the
 * SDK author's [SdkAuthentication] wiring, not carried on the descriptor.
 *
 * Not a `data class`, for the same reason as [ResponseAlternative]: [scopes] is defensively copied at construction,
 * which a data-class primary constructor cannot do. [equals]/[hashCode]/[toString]/[copy] are written by hand over
 * that copy.
 */
public class SecuritySchemeRef(
    public val schemeId: String,
    scopes: List<String> = emptyList(),
) {
    /** Defensive copy of the scopes supplied at construction; later mutation of the input has no effect. */
    public val scopes: List<String> = scopes.toList()

    public fun copy(
        schemeId: String = this.schemeId,
        scopes: List<String> = this.scopes,
    ): SecuritySchemeRef = SecuritySchemeRef(schemeId, scopes)

    override fun equals(other: Any?): Boolean =
        other is SecuritySchemeRef && schemeId == other.schemeId && scopes == other.scopes

    override fun hashCode(): Int = 31 * schemeId.hashCode() + scopes.hashCode()

    override fun toString(): String = "SecuritySchemeRef(schemeId=$schemeId, scopes=$scopes)"
}

/**
 * One OpenAPI security requirement: all [schemes] must be satisfied together (AND-within-requirement).
 *
 * An empty [schemes] list is the OpenAPI convention for "anonymous access is permitted for this requirement". Across
 * the [OperationMetadata.security] list, requirements are OR-ed together: an operation accepts a caller who
 * satisfies *any one* requirement in that list, so declaring several requirements is how OpenAPI expresses
 * "accepts either scheme A, or schemes B and C together".
 *
 * Not a `data class`, for the same reason as [ResponseAlternative]: [schemes] is defensively copied at construction.
 * [equals]/[hashCode]/[toString]/[copy] are written by hand over that copy.
 */
public class SecurityRequirement(
    schemes: List<SecuritySchemeRef>,
) {
    /** Defensive copy of the schemes supplied at construction; later mutation of the input has no effect. */
    public val schemes: List<SecuritySchemeRef> = schemes.toList()

    public fun copy(schemes: List<SecuritySchemeRef> = this.schemes): SecurityRequirement = SecurityRequirement(schemes)

    override fun equals(other: Any?): Boolean = other is SecurityRequirement && schemes == other.schemes

    override fun hashCode(): Int = schemes.hashCode()

    override fun toString(): String = "SecurityRequirement(schemes=$schemes)"
}

/**
 * Declares whether an operation is safe (RFC 9110 §9.2.1, no observable side effect) and/or idempotent (repeating it
 * with the same input has the same effect as performing it once). Both flags default to `false` — the conservative,
 * non-retry-friendly assumption — because runtime behavior must never infer safety from HTTP method or naming
 * conventions.
 */
public data class OperationSafety(
    public val safe: Boolean = false,
    public val idempotent: Boolean = false,
)

/**
 * Declares how an idempotency key is supplied for an operation that opts into client-generated idempotency keys.
 *
 * @property keyHeader the request header name that carries the idempotency key.
 * @property clientGenerated when `true`, the runtime generates one key per logical call and reuses it across retry
 *   attempts; a caller-supplied value (via [CallOptions] or a request hook) always wins over a generated one.
 */
public data class IdempotencyDescriptor(
    public val keyHeader: String,
    public val clientGenerated: Boolean,
)

/**
 * Declarative retry defaults for an operation. This is descriptor data only — the retry loop lives in [SdkExecutor],
 * which consumes this descriptor while executing the operation.
 *
 * @property retryableStatusCodes response shapes that are candidates for retry, expressed as selectors so ranges
 *   (e.g. `5xx`) do not require enumerating every status. An empty list is unspecified and uses the runtime defaults
 *   (`408`, `429`, and `5xx`); list selectors explicitly to restrict retryable statuses.
 * @property retryConnectionErrors whether connection-level failures (no response received) are retry candidates.
 * @property maxAttempts optional cap on total attempts, including the first; `null` defers to engine/client defaults.
 * @property backoff optional declarative backoff hints; `null` defers to engine defaults.
 *
 * Not a `data class`, for the same reason as [ResponseAlternative]: [retryableStatusCodes] is defensively copied at
 * construction. [equals]/[hashCode]/[toString]/[copy] are written by hand over that copy.
 */
public class RetryDescriptor(
    retryableStatusCodes: List<ResponseSelector> = emptyList(),
    public val retryConnectionErrors: Boolean = false,
    public val maxAttempts: Int? = null,
    public val backoff: BackoffHints? = null,
) {
    /** Defensive copy of the selectors supplied at construction; later mutation of the input has no effect. */
    public val retryableStatusCodes: List<ResponseSelector> = retryableStatusCodes.toList()

    public fun copy(
        retryableStatusCodes: List<ResponseSelector> = this.retryableStatusCodes,
        retryConnectionErrors: Boolean = this.retryConnectionErrors,
        maxAttempts: Int? = this.maxAttempts,
        backoff: BackoffHints? = this.backoff,
    ): RetryDescriptor = RetryDescriptor(retryableStatusCodes, retryConnectionErrors, maxAttempts, backoff)

    override fun equals(other: Any?): Boolean =
        other is RetryDescriptor &&
            retryableStatusCodes == other.retryableStatusCodes &&
            retryConnectionErrors == other.retryConnectionErrors &&
            maxAttempts == other.maxAttempts &&
            backoff == other.backoff

    override fun hashCode(): Int =
        arrayOf<Any?>(retryableStatusCodes, retryConnectionErrors, maxAttempts, backoff).contentHashCode()

    override fun toString(): String =
        "RetryDescriptor(retryableStatusCodes=$retryableStatusCodes, retryConnectionErrors=$retryConnectionErrors, " +
            "maxAttempts=$maxAttempts, backoff=$backoff)"
}

/**
 * Declarative backoff shape (base delay, growth factor, cap). This is a hint consumed by the executor's retry engine,
 * not an executable policy — no lambdas, only bounded numeric parameters.
 */
public data class BackoffHints(
    public val baseDelayMillis: Long,
    public val multiplier: Double = 2.0,
    public val maxDelayMillis: Long,
) {
    init {
        require(baseDelayMillis > 0) { "baseDelayMillis must be positive" }
        require(multiplier >= 1.0) { "multiplier must be >= 1.0" }
        require(maxDelayMillis >= baseDelayMillis) { "maxDelayMillis must be >= baseDelayMillis" }
    }
}

/**
 * A constrained dot-path into a decoded response value, e.g. `"data.items"` or `"meta.next_cursor"`.
 *
 * Each segment must match `[A-Za-z0-9_-]+` — this is a property accessor, never an executable expression (no
 * indexing, wildcards, or filters). Pagination and streaming descriptors use this type instead of raw strings so
 * malformed paths are rejected at descriptor-construction time rather than at first use.
 */
@JvmInline
public value class PropertyPath(
    public val raw: String,
) {
    init {
        require(raw.isNotEmpty()) { "PropertyPath must not be empty" }
        val parts = raw.split('.')
        require(parts.all { segmentPattern.matches(it) }) {
            "PropertyPath segments must match [A-Za-z0-9_-]+, got '$raw'"
        }
    }

    /** The path split into its individual property-access segments. */
    public val segments: List<String>
        get() = raw.split('.')

    private companion object {
        val segmentPattern = Regex("[A-Za-z0-9_-]+")
    }
}

/**
 * Declarative pagination strategy for an operation. All property references are [PropertyPath]s so the runtime
 * pagination engine (W2-T6) can walk decoded response values without evaluating arbitrary expressions.
 */
public sealed interface PaginationDescriptor {
    /** Opaque cursor/token supplied on the request and returned in the response for the next page. */
    public data class CursorToken(
        public val requestCursorParam: String,
        public val requestLimitParam: String? = null,
        public val responseItemsPath: PropertyPath,
        public val responseNextCursorPath: PropertyPath,
    ) : PaginationDescriptor

    /** Numeric offset/limit pagination. */
    public data class OffsetLimit(
        public val requestOffsetParam: String,
        public val requestLimitParam: String,
        public val responseItemsPath: PropertyPath,
        public val responseTotalPath: PropertyPath? = null,
    ) : PaginationDescriptor

    /** Page-number/page-size pagination. */
    public data class PageSize(
        public val requestPageParam: String,
        public val requestSizeParam: String,
        public val responseItemsPath: PropertyPath,
        public val responseTotalPagesPath: PropertyPath? = null,
    ) : PaginationDescriptor

    /** The response embeds a full absolute or same-origin-relative URL for the next page. */
    public data class NextUrl(
        public val responseItemsPath: PropertyPath,
        public val responseNextUrlPath: PropertyPath,
    ) : PaginationDescriptor

    /** The response embeds an opaque token consumed as a distinct request parameter (not a raw cursor value). */
    public data class NextToken(
        public val requestTokenParam: String,
        public val responseItemsPath: PropertyPath,
        public val responseNextTokenPath: PropertyPath,
    ) : PaginationDescriptor

    /**
     * The next page is sourced from the RFC 8288 `Link` response header's `rel="next"` target rather than any body
     * field — [responseItemsPath] still locates the item list in the decoded body, but there is no
     * `responseNextUrlPath`: the runtime pagination engine parses the `Link` header itself
     * (`com.nabobery.sdkgen.runtime.pagination.firstNextLinkTarget`) and resolves the result against the URI of the
     * request that produced that response (not a fixed operation base URI), so relative targets stay correct across
     * however many hops the walk takes.
     */
    public data class HeaderNextUrl(
        public val responseItemsPath: PropertyPath,
    ) : PaginationDescriptor
}

/** A bounded, declarative predicate over a decoded streaming event. No predicate lambdas are permitted. */
public sealed interface EventMatcher {
    /** Matches when the named field of the event is present and equal to [value]. */
    public data class FieldEquals(
        public val field: String,
        public val value: String,
    ) : EventMatcher
}

/**
 * Declarative streaming strategy for an operation. The runtime streaming engine (W2-T3) is the sole consumer of
 * these framing rules; generated code never parses stream bytes itself.
 */
public sealed interface StreamingDescriptor {
    /**
     * text/event-stream framing (WHATWG Server-Sent Events).
     *
     * @property terminalSentinel an in-band `data:` value (e.g. `"[DONE]"`) that ends the stream without being
     *   surfaced as an event; `null` means the stream ends only when the transport closes it.
     * @property inBandError an optional bounded matcher identifying events that represent an application-level error
     *   delivered inside the stream rather than as an HTTP failure status.
     * @property requestFlag the declared request parameter/header flag that opts the operation into streaming, when
     *   the contract defines one. It is metadata only; generated code does not infer this from a property name.
     * @property responseContentType the declared response content type for the SSE stream.
     */
    public class ServerSentEvents(
        public val terminalSentinel: String? = null,
        public val inBandError: EventMatcher? = null,
        public val requestFlag: String? = null,
        public val responseContentType: String = "text/event-stream",
    ) : StreamingDescriptor {
        public operator fun component1(): String? = terminalSentinel

        public operator fun component2(): EventMatcher? = inBandError

        public operator fun component3(): String? = requestFlag

        public operator fun component4(): String = responseContentType

        /** Copies the complete descriptor. */
        public fun copy(
            terminalSentinel: String? = this.terminalSentinel,
            inBandError: EventMatcher? = this.inBandError,
            requestFlag: String? = this.requestFlag,
            responseContentType: String = this.responseContentType,
        ): ServerSentEvents = ServerSentEvents(terminalSentinel, inBandError, requestFlag, responseContentType)

        override fun equals(other: Any?): Boolean =
            other is ServerSentEvents &&
                terminalSentinel == other.terminalSentinel &&
                inBandError == other.inBandError &&
                requestFlag == other.requestFlag &&
                responseContentType == other.responseContentType

        override fun hashCode(): Int =
            arrayOf<Any?>(terminalSentinel, inBandError, requestFlag, responseContentType).contentHashCode()

        override fun toString(): String =
            "ServerSentEvents(terminalSentinel=$terminalSentinel, inBandError=$inBandError, " +
                "requestFlag=$requestFlag, responseContentType=$responseContentType)"
    }

    /**
     * One JSON value per line (`application/jsonlines`, `application/json-seq` framing family).
     *
     * @property terminalSentinel an in-band line value that ends the stream without being surfaced as an item.
     * @property inBandError an optional bounded matcher identifying lines that represent an application-level error.
     */
    public data class JsonLines(
        public val terminalSentinel: String? = null,
        public val inBandError: EventMatcher? = null,
    ) : StreamingDescriptor

    public companion object {
        /**
         * Default maximum size, in bytes, of one buffered streaming event (ADR-0006). Adapters and the streaming
         * engine must reject or split events exceeding this bound rather than growing an in-memory buffer without
         * limit; event bytes are UTF-8 decoded only after this bound is enforced.
         */
        public const val DEFAULT_MAX_EVENT_BYTES: Int = 1 * 1024 * 1024
    }
}

/**
 * The immutable, fully explicit description of one operation that the runtime executor consumes.
 *
 * Runtime behavior derives only from explicit metadata carried on this type — never from endpoint-name or
 * property-name heuristics. No property here may carry secret material; descriptors are safe to log, hash, or
 * include in diagnostics as-is (subject to the redaction contracts documented on [SdkRequest]/[SdkResponse]).
 *
 * Backward-compatible construction: [responseAlternatives] defaults to an empty list, so a call site built only
 * from [successStatusCodes] keeps compiling and behaving exactly as before this type gained response-alternative
 * support — [SdkExecutor] classifies status codes via the legacy [successStatusCodes]-only contract whenever
 * [responseAlternatives] is empty, and only switches to selector-based classification (see [SdkExecutor]'s status
 * classification KDoc) once a call site opts in by supplying a non-empty [responseAlternatives] list explicitly.
 *
 * [security] semantics (OpenAPI security requirements): within one [SecurityRequirement], all its
 * [SecuritySchemeRef]s must be satisfied together (AND-within-requirement). Across the [security] list itself,
 * requirements are OR-ed: the operation accepts a caller who satisfies *any one* requirement in the list. An empty
 * [security] list, or a list containing one [SecurityRequirement] with no schemes, both mean anonymous access is
 * permitted.
 *
 * Not a `data class`: [requestMediaTypes], [responseMediaTypes], [successStatusCodes], [responseAlternatives], and
 * [security] are all defensively copied at construction, which Kotlin's data-class primary constructor cannot do
 * (every primary-constructor parameter of a data class must be a bare `val`/`var` property, so there is no place to
 * intercept and copy the incoming collection before it becomes part of the class's identity). This type instead
 * declares those five as plain constructor parameters, re-exposes each as a property backed by an immutable copy,
 * and hand-writes [equals], [hashCode], [toString], and [copy] to match ordinary data-class semantics over those
 * copies — including copies made through [copy] itself, so replacing a collection via `metadata.copy(security = …)`
 * is exactly as defended against later external mutation as the original constructor call.
 */
public class OperationMetadata(
    public val operationId: String,
    public val method: String,
    public val path: String,
    requestMediaTypes: List<String>,
    responseMediaTypes: List<String>,
    successStatusCodes: Set<Int>,
    public val responseMode: SdkResponseMode,
    public val deadlines: SdkDeadlines,
    responseAlternatives: List<ResponseAlternative> = emptyList(),
    security: List<SecurityRequirement> = emptyList(),
    public val safety: OperationSafety = OperationSafety(),
    public val idempotency: IdempotencyDescriptor? = null,
    public val retry: RetryDescriptor? = null,
    public val pagination: PaginationDescriptor? = null,
    public val streaming: StreamingDescriptor? = null,
) {
    /** Defensive copy of the request media types supplied at construction. */
    public val requestMediaTypes: List<String> = requestMediaTypes.toList()

    /** Defensive copy of the response media types supplied at construction. */
    public val responseMediaTypes: List<String> = responseMediaTypes.toList()

    /** Defensive copy of the success status codes supplied at construction. */
    public val successStatusCodes: Set<Int> = successStatusCodes.toSet()

    /** Defensive copy of the response alternatives supplied at construction. */
    public val responseAlternatives: List<ResponseAlternative> = responseAlternatives.toList()

    /** Defensive copy of the security requirements supplied at construction. */
    public val security: List<SecurityRequirement> = security.toList()

    public fun copy(
        operationId: String = this.operationId,
        method: String = this.method,
        path: String = this.path,
        requestMediaTypes: List<String> = this.requestMediaTypes,
        responseMediaTypes: List<String> = this.responseMediaTypes,
        successStatusCodes: Set<Int> = this.successStatusCodes,
        responseMode: SdkResponseMode = this.responseMode,
        deadlines: SdkDeadlines = this.deadlines,
        responseAlternatives: List<ResponseAlternative> = this.responseAlternatives,
        security: List<SecurityRequirement> = this.security,
        safety: OperationSafety = this.safety,
        idempotency: IdempotencyDescriptor? = this.idempotency,
        retry: RetryDescriptor? = this.retry,
        pagination: PaginationDescriptor? = this.pagination,
        streaming: StreamingDescriptor? = this.streaming,
    ): OperationMetadata =
        OperationMetadata(
            operationId,
            method,
            path,
            requestMediaTypes,
            responseMediaTypes,
            successStatusCodes,
            responseMode,
            deadlines,
            responseAlternatives,
            security,
            safety,
            idempotency,
            retry,
            pagination,
            streaming,
        )

    override fun equals(other: Any?): Boolean =
        other is OperationMetadata &&
            operationId == other.operationId &&
            method == other.method &&
            path == other.path &&
            requestMediaTypes == other.requestMediaTypes &&
            responseMediaTypes == other.responseMediaTypes &&
            successStatusCodes == other.successStatusCodes &&
            responseMode == other.responseMode &&
            deadlines == other.deadlines &&
            responseAlternatives == other.responseAlternatives &&
            security == other.security &&
            safety == other.safety &&
            idempotency == other.idempotency &&
            retry == other.retry &&
            pagination == other.pagination &&
            streaming == other.streaming

    override fun hashCode(): Int =
        arrayOf<Any?>(
            operationId,
            method,
            path,
            requestMediaTypes,
            responseMediaTypes,
            successStatusCodes,
            responseMode,
            deadlines,
            responseAlternatives,
            security,
            safety,
            idempotency,
            retry,
            pagination,
            streaming,
        ).contentHashCode()

    override fun toString(): String =
        "OperationMetadata(operationId=$operationId, method=$method, path=$path, " +
            "requestMediaTypes=$requestMediaTypes, responseMediaTypes=$responseMediaTypes, " +
            "successStatusCodes=$successStatusCodes, responseMode=$responseMode, deadlines=$deadlines, " +
            "responseAlternatives=$responseAlternatives, security=$security, safety=$safety, " +
            "idempotency=$idempotency, retry=$retry, pagination=$pagination, streaming=$streaming)"
}
