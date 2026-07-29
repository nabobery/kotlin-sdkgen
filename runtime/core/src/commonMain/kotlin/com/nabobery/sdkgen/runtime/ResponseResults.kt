@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.runtime

/**
 * A decoded success value paired with the physical response's headers, returned by [SdkExecutor.executeWithHeaders].
 *
 * Not a `data class`: [headers] is defensively copied at construction, for the same reason documented on
 * [ResponseAlternative]'s KDoc (a data-class primary constructor cannot intercept and copy an incoming mutable
 * collection before it becomes part of the instance's identity). [equals]/[hashCode]/[toString]/[copy] are
 * hand-written over that copy.
 */
public class SdkHeaderedResponse<T>(
    public val value: T,
    headers: List<SdkHeader>,
) {
    /** Defensive copy of the headers supplied at construction; later mutation of the input has no effect. */
    public val headers: List<SdkHeader> = headers.toList()

    public fun copy(
        value: T = this.value,
        headers: List<SdkHeader> = this.headers,
    ): SdkHeaderedResponse<T> = SdkHeaderedResponse(value, headers)

    override fun equals(other: Any?): Boolean =
        other is SdkHeaderedResponse<*> && value == other.value && headers == other.headers

    override fun hashCode(): Int = arrayOf<Any?>(value, headers).contentHashCode()

    override fun toString(): String = "SdkHeaderedResponse(value=$value, headers=$headers)"
}

/**
 * The result of decoding a selected response alternative.
 *
 * [transferBody] is an explicit ownership decision for the original response body. It must be `true` only when the
 * decoded value gives the caller a live view of that body (for example, a generated success wrapper containing the
 * neutral [SdkByteStream]); otherwise the executor closes the body after decoding. The runtime never infers this from
 * the decoded value's shape.
 */
public data class SdkResponseDecodeResult<T>(
    public val value: T,
    public val transferBody: Boolean = false,
)

/**
 * Decodes one response alternative selected by [SdkExecutor.executeWithResponse].
 *
 * The generated implementation owns the typed codec wiring; the runtime owns status selection, authentication,
 * retries, cancellation, and response-body lifetime. [decodeWithBody] makes response-body transfer explicit across the
 * neutral runtime seam. The legacy [decode] method remains source-compatible for custom decoders and is wrapped as
 * runtime-owned; generated decoders override [decodeWithBody] for raw success alternatives. No
 * transport-native type crosses this seam.
 */
public interface SdkResponseAlternativeDecoder<T> {
    /** Decodes a response whose [alternative] was selected by the operation descriptor. */
    public suspend fun decode(
        alternative: ResponseAlternative,
        statusCode: Int,
        headers: List<SdkHeader>,
        body: SdkByteStream,
        mediaType: String?,
    ): T

    /**
     * Decodes a selected alternative and explicitly declares whether the original body is transferred to the caller.
     * Existing implementations that override only [decode] remain runtime-owned by default. The executor accepts
     * transfer only for a mapped success status; unknown and typed error bodies are always closed.
     */
    public suspend fun decodeWithBody(
        alternative: ResponseAlternative,
        statusCode: Int,
        headers: List<SdkHeader>,
        body: SdkByteStream,
        mediaType: String?,
    ): SdkResponseDecodeResult<T> =
        SdkResponseDecodeResult(
            value = decode(alternative, statusCode, headers, body, mediaType),
        )

    /** Produces the typed operation-level representation for an unmapped status. */
    public suspend fun decodeUnknown(
        statusCode: Int,
        headers: List<SdkHeader>,
        body: SdkByteStream,
    ): T
}

private const val X_REQUEST_ID_HEADER: String = "X-Request-Id"
private const val REQUEST_ID_HEADER: String = "Request-Id"
private const val X_GITHUB_REQUEST_ID_HEADER: String = "X-GitHub-Request-Id"
private const val STRIPE_REQUEST_ID_HEADER: String = "Stripe-Request-Id"
private val defaultRequestIdHeaderNames: List<String> =
    listOf(
        X_REQUEST_ID_HEADER,
        REQUEST_ID_HEADER,
        X_GITHUB_REQUEST_ID_HEADER,
        STRIPE_REQUEST_ID_HEADER,
    )

private fun List<SdkHeader>.defaultRequestId(): String? =
    defaultRequestIdHeaderNames.firstNotNullOfOrNull { name ->
        firstOrNull { header ->
            header.name.equals(name, ignoreCase = true) && header.value.isNotBlank()
        }?.value
    }

/**
 * A typed result returned by a generated `withResponse` method.
 *
 * A [Matched] result may represent either a success or a declared non-success response; callers must inspect the
 * operation-specific typed value rather than assuming that a normal return means HTTP success. [Unknown] is returned
 * when no exact, range, or default response alternative claims the status. Transport, authentication, serialization,
 * and cancellation failures still leave the executor as exceptions and are never converted into a result.
 */
public sealed interface SdkResponseResult<out T> {
    /** HTTP status of the physical response. */
    public val statusCode: Int

    /** Response headers, copied before the result escapes the executor. */
    public val headers: List<SdkHeader>

    /**
     * The request ID extracted from [headers] using the standard prioritized request ID header names
     * (`X-Request-Id`, `Request-Id`, `X-GitHub-Request-Id`, `Stripe-Request-Id`).
     */
    public val requestId: String?
        get() = headers.defaultRequestId()

    /**
     * Finds the first request ID present in [headers] matching any of the candidate [headerNames]
     * in priority order.
     */
    public fun findRequestId(headerNames: List<String>): String? {
        val candidates = headerNames.toList()
        val seen = HashSet<String>(candidates.size)
        for (name in candidates) {
            require(name.isNotBlank()) { "Header name in findRequestId must not be blank" }
            require(seen.add(name.lowercase())) { "Duplicate candidate header name in findRequestId: $name" }
        }
        for (name in candidates) {
            val value = headers.firstValue(name)
            if (value != null) return value
        }
        return null
    }

    /** A response matched by one declared response alternative. */
    public class Matched<T>(
        public val alternative: ResponseAlternative,
        public override val statusCode: Int,
        headers: List<SdkHeader>,
        public val value: T,
    ) : SdkResponseResult<T> {
        public override val headers: List<SdkHeader> = headers.toList()
    }

    /** A response whose status was not claimed by any declared response alternative. */
    public class Unknown<T>(
        public override val statusCode: Int,
        headers: List<SdkHeader>,
        public val value: T,
    ) : SdkResponseResult<T> {
        public override val headers: List<SdkHeader> = headers.toList()
    }
}
