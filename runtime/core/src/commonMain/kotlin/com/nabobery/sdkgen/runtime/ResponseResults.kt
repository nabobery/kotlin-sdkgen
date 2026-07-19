@file:Suppress("ktlint:standard:max-line-length")

package com.nabobery.sdkgen.runtime

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
