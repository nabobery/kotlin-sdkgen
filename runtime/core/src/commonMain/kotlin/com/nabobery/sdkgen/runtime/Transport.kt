package com.nabobery.sdkgen.runtime

import kotlin.coroutines.cancellation.CancellationException

/**
 * Executes one prepared request.
 *
 * On invocation, ownership of a non-null request body follows [SdkRequestBody.ownership]. The returned response body
 * remains owned by the runtime and is closed after status handling and decoding complete unless the neutral response
 * decoder explicitly transfers it to a caller-owned raw success view.
 */
public fun interface SdkTransport {
    /**
     * Sends [request] and returns response metadata plus a readable body.
     *
     * Implementations must preserve [CancellationException] identity and must not close a successful response body
     * before returning it.
     */
    public suspend fun execute(request: SdkRequest): SdkResponse

    /**
     * Reports what this transport can actually do, so [SdkExecutor] can reject an unsupported request (e.g.
     * streaming) with a typed [SdkCapabilityException] before ever calling [execute].
     *
     * The default is deliberately conservative (nothing beyond ordinary buffered request/response) so an
     * implementation that has not been updated to report richer capabilities never over-promises.
     */
    public fun capabilities(): TransportCapabilities = TransportCapabilities()
}

/** Whether the runtime follows HTTP redirects for a transport response. */
public enum class RedirectCapability {
    /** Redirects are surfaced as ordinary 3xx responses for a declared alternative or API error. */
    UNSUPPORTED,
}

/**
 * What one [SdkTransport] implementation actually supports, so the executor can fail fast with a typed
 * [SdkCapabilityException] instead of discovering the gap mid-request.
 *
 * @property supportsStreaming whether [SdkResponseMode.STREAMING] responses are supported. Unsupported streaming is
 *   uncompensatable — the executor has no fallback for a response shape the transport cannot deliver at all — so
 *   [SdkExecutor] fails preflight with [SdkCapabilityException] before ever calling [SdkTransport.execute] when this
 *   is `false` and the request needs it.
 * @property redirects the redirect posture for this release. [RedirectCapability.UNSUPPORTED] means adapters disable
 *   native following and 3xx responses surface as declared alternatives or typed API errors.
 * @property supportedDeadlines which [TimeoutPhase] kinds this transport enforces *natively* (e.g. via its own
 *   connect/read/call timeouts). This describes an optimization opportunity, not a requirement: deadline enforcement
 *   is runtime-owned overall — [SdkExecutor] enforces the total and attempt deadline phases itself (wrapping
 *   [SdkTransport.execute] with [SdkTimeoutGuard]) regardless of what a transport natively supports, compensating for
 *   any phase a transport does not enforce itself. Stream-idle enforcement for streaming/raw response bodies is also
 *   runtime-owned and is applied by [SdkExecutor] and [SdkByteStream] decorators rather than this native capability set.
 *   A phase missing from this set must never fail preflight — unlike [supportsStreaming], deadlines are always
 *   compensatable, so [SdkExecutor] executes the request regardless of what this set contains. See [SdkDeadlines].
 * @property supportsHttp2 whether the transport may negotiate HTTP/2.
 * @property canSetUserAgent whether the transport allows the runtime to set a `User-Agent` header for SDK
 *   identification (ADR-0006); when `false`, the executor must not fail the request over this alone.
 *
 * Not a `data class`: [supportedDeadlines] is defensively copied at construction, which a data-class primary
 * constructor cannot do (see [ResponseAlternative]'s KDoc for why). [equals]/[hashCode]/[toString]/[copy] are
 * hand-written over that copy.
 */
public class TransportCapabilities(
    public val supportsStreaming: Boolean = false,
    public val redirects: RedirectCapability = RedirectCapability.UNSUPPORTED,
    supportedDeadlines: Set<TimeoutPhase> = emptySet(),
    public val supportsHttp2: Boolean = false,
    public val canSetUserAgent: Boolean = false,
) {
    /** Defensive copy of the deadline phases supplied at construction; later mutation of the input has no effect. */
    public val supportedDeadlines: Set<TimeoutPhase> = supportedDeadlines.toSet()

    public fun copy(
        supportsStreaming: Boolean = this.supportsStreaming,
        redirects: RedirectCapability = this.redirects,
        supportedDeadlines: Set<TimeoutPhase> = this.supportedDeadlines,
        supportsHttp2: Boolean = this.supportsHttp2,
        canSetUserAgent: Boolean = this.canSetUserAgent,
    ): TransportCapabilities =
        TransportCapabilities(supportsStreaming, redirects, supportedDeadlines, supportsHttp2, canSetUserAgent)

    override fun equals(other: Any?): Boolean =
        other is TransportCapabilities &&
            supportsStreaming == other.supportsStreaming &&
            redirects == other.redirects &&
            supportedDeadlines == other.supportedDeadlines &&
            supportsHttp2 == other.supportsHttp2 &&
            canSetUserAgent == other.canSetUserAgent

    override fun hashCode(): Int =
        arrayOf<Any?>(supportsStreaming, redirects, supportedDeadlines, supportsHttp2, canSetUserAgent)
            .contentHashCode()

    override fun toString(): String =
        "TransportCapabilities(supportsStreaming=$supportsStreaming, redirects=$redirects, " +
            "supportedDeadlines=$supportedDeadlines, supportsHttp2=$supportsHttp2, canSetUserAgent=$canSetUserAgent)"
}

/**
 * One HTTP header name/value pair (ADR-0006).
 *
 * Header names are compared case-insensitively everywhere in this runtime ([firstValue] and codec content-type
 * lookups included) per RFC 9110 §5.1, but the original casing supplied here is preserved on the wire whenever the
 * transport allows it. Repeated header names (e.g. multiple `Set-Cookie` values) are preserved as separate
 * [SdkHeader] entries rather than collapsed — callers that need RFC 9110 §5.3 comma-joined semantics for a
 * single-valued header must join the matching entries themselves; the runtime never comma-joins on their behalf,
 * since not every header is safe to join that way (`Set-Cookie` notably is not).
 *
 * Not a `data class`, matching [ResponseAlternative]'s pattern for the same reasons: hand-written [equals]/
 * [hashCode]/[toString]/[copy]. [toString] renders [value] only for the explicit diagnostic-safe allowlist (for
 * example `Content-Type`, `Accept`, `Content-Length`, `Cache-Control`, `Location`, and request-id headers). Credential
 * headers (`Authorization`, `Proxy-Authorization`, `Cookie`, `Set-Cookie`) and every unknown or configured-sensitive
 * header remain redacted by default; [name] is not a secret and is printed as-is.
 */
public class SdkHeader(
    public val name: String,
    public val value: String,
) {
    public fun copy(
        name: String = this.name,
        value: String = this.value,
    ): SdkHeader = SdkHeader(name, value)

    override fun equals(other: Any?): Boolean = other is SdkHeader && name == other.name && value == other.value

    override fun hashCode(): Int = 31 * name.hashCode() + value.hashCode()

    override fun toString(): String = "SdkHeader(name=$name, value=${diagnosticHeaderValue(name, value)})"
}

private val DIAGNOSTIC_SAFE_HEADER_NAMES =
    setOf(
        "Accept",
        "Cache-Control",
        "Content-Length",
        "Content-Type",
        "ETag",
        "Last-Modified",
        "Location",
        "Retry-After",
    )
private val REQUEST_ID_HEADER =
    Regex(
        """^(?:x-)?(?:request|trace|correlation)[-_]?id$""",
        RegexOption.IGNORE_CASE,
    )

internal fun diagnosticHeaderValue(
    name: String,
    value: String,
): String =
    if (DIAGNOSTIC_SAFE_HEADER_NAMES.any { it.equals(name, ignoreCase = true) } || REQUEST_ID_HEADER.matches(name)) {
        value
    } else {
        "<redacted>"
    }

public fun List<SdkHeader>.firstValue(name: String): String? =
    firstOrNull { it.name.equals(name, ignoreCase = true) }?.value

public enum class SdkResponseMode {
    BUFFERED,
    STREAMING,
}

/**
 * Semantic deadlines requested for one operation.
 *
 * Enforcement is runtime-owned: whether or not the configured [SdkTransport] reports native support for a given
 * phase in [TransportCapabilities.supportedDeadlines], [SdkExecutor] compensates by enforcing the total and attempt
 * phases itself through its timeout guard. A transport's [TransportCapabilities.supportedDeadlines] is therefore an
 * optimization signal only — [SdkExecutor] never fails preflight because a transport lacks native support for a
 * requested deadline phase; it only fails preflight for genuinely uncompensatable capabilities (currently:
 * [TransportCapabilities.supportsStreaming]). The idle phase is not a native transport capability: the runtime wraps
 * returned response streams before exposing them, while direct streaming helpers apply the same decorator on open.
 */
public data class SdkDeadlines(
    public val totalMillis: Long?,
    public val attemptMillis: Long?,
    public val idleMillis: Long?,
) {
    init {
        require(totalMillis == null || totalMillis > 0) { "total deadline must be positive" }
        require(attemptMillis == null || attemptMillis > 0) { "attempt deadline must be positive" }
        require(idleMillis == null || idleMillis > 0) { "idle deadline must be positive" }
    }
}

/**
 * @property security the operation's OpenAPI security requirements ([OperationMetadata.security]), carried onto the
 *   request so the low-level [SdkAuthentication] seam can resolve which requirement to satisfy without needing its
 *   own copy of [OperationMetadata]. Defaults to an empty list (anonymous), matching [OperationMetadata.security]'s
 *   own "empty means anonymous" default so call sites that never populate it keep prior behavior unchanged.
 *
 * Not a `data class`: [headers] and [security] are defensively copied at construction (see [ResponseAlternative]'s
 * KDoc for why), and [toString] is redaction-safe — [headers] renders through [SdkHeader]'s own diagnostic-safe
 * [toString],
 * and [uri] is rendered with its query and fragment stripped ([redactedUriForDisplay]) since either may carry
 * credentials (e.g. an `apiKey` scheme in [SecurityScheme.ApiKeyLocation.QUERY]). The body is represented only by
 * presence, never by delegating to an arbitrary body implementation's `toString()`.
 */
public class SdkRequest(
    public val method: String,
    public val uri: String,
    headers: List<SdkHeader>,
    public val body: SdkRequestBody?,
    public val expectedResponseMode: SdkResponseMode,
    public val deadlines: SdkDeadlines,
    public val operationId: String,
    security: List<SecurityRequirement> = emptyList(),
) {
    /** Defensive copy of the headers supplied at construction; later mutation of the input has no effect. */
    public val headers: List<SdkHeader> = headers.toList()

    /** Defensive copy of the security requirements supplied at construction. */
    public val security: List<SecurityRequirement> = security.toList()

    public fun copy(
        method: String = this.method,
        uri: String = this.uri,
        headers: List<SdkHeader> = this.headers,
        body: SdkRequestBody? = this.body,
        expectedResponseMode: SdkResponseMode = this.expectedResponseMode,
        deadlines: SdkDeadlines = this.deadlines,
        operationId: String = this.operationId,
        security: List<SecurityRequirement> = this.security,
    ): SdkRequest = SdkRequest(method, uri, headers, body, expectedResponseMode, deadlines, operationId, security)

    override fun equals(other: Any?): Boolean =
        other is SdkRequest &&
            method == other.method &&
            uri == other.uri &&
            headers == other.headers &&
            body == other.body &&
            expectedResponseMode == other.expectedResponseMode &&
            deadlines == other.deadlines &&
            operationId == other.operationId &&
            security == other.security

    override fun hashCode(): Int =
        arrayOf<Any?>(method, uri, headers, body, expectedResponseMode, deadlines, operationId, security)
            .contentHashCode()

    override fun toString(): String =
        "SdkRequest(method=$method, uri=${redactedUriForDisplay(uri)}, headers=$headers, " +
            "bodyPresent=${body != null}, expectedResponseMode=$expectedResponseMode, deadlines=$deadlines, " +
            "operationId=$operationId, security=$security)"
}

/**
 * Renders [uri] for logs/`toString()` with its query and fragment stripped — either may carry credentials (an
 * `apiKey` scheme applied in the query, or an opaque fragment token) — leaving only `scheme://authority/path`.
 * Never used for anything except display: request execution always uses the original, complete [SdkRequest.uri].
 */
internal fun redactedUriForDisplay(uri: String): String = uri.substringBefore('?').substringBefore('#')

/**
 * One physical response returned by [SdkTransport.execute].
 *
 * Redirect forwarding policy (ADR-0006): redirects are explicitly unsupported in this release. Adapters disable
 * native redirect following, [TransportCapabilities.redirects] is [RedirectCapability.UNSUPPORTED], and a 3xx response
 * surfaces as a declared response alternative or a typed [SdkApiException]. No credentials are forwarded to a redirect
 * target because no redirect loop is entered in this release.
 *
 * Bounded error-body capture: when a non-success (or unmapped) status is observed, callers that want to attach body
 * content to a thrown exception (see [UnknownApiException.redactedBodyPreview]) must cap how much of [body] they
 * buffer — [UnknownApiException.MAX_BODY_PREVIEW_BYTES] documents the runtime's default cap. Unbounded buffering of
 * an error body is never acceptable, since error bodies are exactly as attacker-influenced as success bodies.
 *
 * Not a `data class`: [headers] is defensively copied at construction (see [ResponseAlternative]'s KDoc for why),
 * and [toString] is redaction-safe — [headers] renders through [SdkHeader]'s own diagnostic-safe [toString] (e.g. a
 * `Set-Cookie` response header), and [body] is represented only as an opaque presence marker rather than by
 * delegating to an arbitrary stream implementation's `toString()`.
 */
public class SdkResponse(
    public val statusCode: Int,
    headers: List<SdkHeader>,
    public val body: SdkByteStream,
) {
    /** Defensive copy of the headers supplied at construction; later mutation of the input has no effect. */
    public val headers: List<SdkHeader> = headers.toList()

    public fun copy(
        statusCode: Int = this.statusCode,
        headers: List<SdkHeader> = this.headers,
        body: SdkByteStream = this.body,
    ): SdkResponse = SdkResponse(statusCode, headers, body)

    override fun equals(other: Any?): Boolean =
        other is SdkResponse && statusCode == other.statusCode && headers == other.headers && body == other.body

    override fun hashCode(): Int = arrayOf<Any?>(statusCode, headers, body).contentHashCode()

    override fun toString(): String = "SdkResponse(statusCode=$statusCode, headers=$headers, body=<stream>)"
}
