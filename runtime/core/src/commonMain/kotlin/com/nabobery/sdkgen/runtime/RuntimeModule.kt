package com.nabobery.sdkgen.runtime

import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json
import kotlin.coroutines.cancellation.CancellationException

/**
 * Executes one prepared request.
 *
 * On invocation, ownership of a non-null request body follows [SdkRequestBody.ownership]. The returned response body
 * remains owned by the runtime and is closed after status handling and decoding complete.
 */
public fun interface SdkTransport {
    /**
     * Sends [request] and returns response metadata plus a readable body.
     *
     * Implementations must preserve [CancellationException] identity and must not close a successful response body
     * before returning it.
     */
    public suspend fun execute(request: SdkRequest): SdkResponse
}

public data class SdkHeader(
    public val name: String,
    public val value: String,
)

public fun List<SdkHeader>.firstValue(name: String): String? =
    firstOrNull { it.name.equals(name, ignoreCase = true) }?.value

public enum class SdkResponseMode {
    BUFFERED,
    STREAMING,
}

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

public enum class SdkBodyOwnership {
    RUNTIME,
    TRANSPORT,
}

/** Request content with explicit replayability and ownership semantics. */
public sealed interface SdkRequestBody {
    public val contentType: String
    public val contentLength: Long?
    public val ownership: SdkBodyOwnership

    /** Replayable immutable bytes; constructor input and [bytes] reads are defensively copied. */
    public class Bytes(
        bytes: ByteArray,
        override val contentType: String,
        override val ownership: SdkBodyOwnership = SdkBodyOwnership.TRANSPORT,
    ) : SdkRequestBody {
        private val content: ByteArray = bytes.copyOf()

        public val bytes: ByteArray
            get() = content.copyOf()

        override val contentLength: Long = content.size.toLong()
    }

    /** Replayable body whose [create] callback must return a fresh body for each send attempt. */
    public class ReplayFactory(
        override val contentType: String,
        override val contentLength: Long? = null,
        override val ownership: SdkBodyOwnership = SdkBodyOwnership.TRANSPORT,
        public val create: suspend () -> SdkRequestBody,
    ) : SdkRequestBody

    /** Non-replayable stream that may be consumed only once and must be closed by its [ownership] owner. */
    public class OneShot(
        public val stream: SdkByteStream,
        override val contentType: String,
        override val contentLength: Long? = null,
        override val ownership: SdkBodyOwnership = SdkBodyOwnership.TRANSPORT,
    ) : SdkRequestBody
}

/** Sequential byte source used for request and response bodies. */
public interface SdkByteStream {
    /**
     * Reads between one and [maxBytes] bytes, or returns `null` at EOF.
     *
     * Implementations must reject non-positive limits, never return an empty chunk, and preserve cancellation identity.
     */
    public suspend fun readChunk(maxBytes: Int = DEFAULT_READ_SIZE): ByteArray?

    /**
     * Releases stream resources. Calls must be idempotent; implementations that expose close diagnostics must retain
     * the [cause] from the first call, preserving object identity.
     */
    public fun close(cause: Throwable? = null)

    public companion object {
        public const val DEFAULT_READ_SIZE: Int = 8 * 1024
    }
}

public data class SdkRequest(
    public val method: String,
    public val uri: String,
    public val headers: List<SdkHeader>,
    public val body: SdkRequestBody?,
    public val expectedResponseMode: SdkResponseMode,
    public val deadlines: SdkDeadlines,
    public val operationId: String,
)

public data class SdkResponse(
    public val statusCode: Int,
    public val headers: List<SdkHeader>,
    public val body: SdkByteStream,
)

public data class OperationMetadata(
    public val operationId: String,
    public val method: String,
    public val path: String,
    public val requestMediaTypes: List<String>,
    public val responseMediaTypes: List<String>,
    public val successStatusCodes: Set<Int>,
    public val responseMode: SdkResponseMode,
    public val deadlines: SdkDeadlines,
)

public fun interface SdkRequestHook {
    public suspend fun apply(request: SdkRequest): SdkRequest
}

/** Applies authentication material to a request without coupling the runtime to a transport engine. */
public fun interface SdkAuthentication {
    public suspend fun apply(request: SdkRequest): SdkRequest
}

/** Adds an RFC 6750 bearer token without replacing caller-supplied headers. */
public class BearerTokenAuthentication(
    private val tokenProvider: suspend () -> String,
) : SdkAuthentication {
    override suspend fun apply(request: SdkRequest): SdkRequest {
        val token = tokenProvider().trim()
        require(token.isNotEmpty()) { "Bearer token must not be blank" }
        return request.copy(headers = request.headers + SdkHeader("Authorization", "Bearer $token"))
    }
}

public data class CallOptions(
    public val headers: List<SdkHeader> = emptyList(),
    public val deadlines: SdkDeadlines? = null,
    public val requestHook: SdkRequestHook? = null,
)

/**
 * Encodes request values and decodes response bodies for declared media types.
 *
 * [encode] transfers the returned body's ownership according to [SdkRequestBody.ownership]. [decode] may consume the
 * body but must not close it; [SdkExecutor] owns response-body closure.
 */
public interface MediaTypeCodec<T> {
    public val id: String
    public val mediaTypes: Set<String>
    public val structuredSyntaxSuffixes: Set<String>
        get() = emptySet()

    public suspend fun encode(
        value: T,
        mediaType: String,
    ): SdkRequestBody

    public suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): T
}

/**
 * JSON codec backed by kotlinx.serialization.
 *
 * Decoding is intentionally buffered and rejects bodies larger than `maxBufferedBytes`; it does not provide streaming
 * execution semantics.
 *
 * Duplicate-member policy: this codec calls straight into kotlinx.serialization's `Json.decodeFromString`, which
 * inherits the parser's `decodeJsonElement` last-wins behavior for duplicate JSON object keys — the last occurrence
 * of a repeated key (including a discriminator field) silently wins and earlier occurrences are discarded before
 * generated models ever see the object. This is an accepted Phase 1 policy, not an oversight: generated models are
 * not a validation firewall for untrusted relays, and callers who must reject or flag duplicate keys need an
 * upstream parsing layer that detects them ahead of this codec.
 */
public class KotlinxSerializationCodec<T>(
    override val id: String,
    private val serializer: KSerializer<T>,
    private val json: Json,
    override val mediaTypes: Set<String> = setOf("application/json"),
    override val structuredSyntaxSuffixes: Set<String> = setOf("json"),
    private val maxBufferedBytes: Long = DEFAULT_MAX_BUFFERED_BYTES,
) : MediaTypeCodec<T> {
    init {
        require(maxBufferedBytes > 0) { "maxBufferedBytes must be positive" }
    }

    override suspend fun encode(
        value: T,
        mediaType: String,
    ): SdkRequestBody = SdkRequestBody.Bytes(json.encodeToString(serializer, value).encodeToByteArray(), mediaType)

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): T = json.decodeFromString(serializer, body.toByteArray(maxBufferedBytes).decodeToString())

    public companion object {
        public const val DEFAULT_MAX_BUFFERED_BYTES: Long = 16L * 1024L * 1024L
    }
}

public class MediaTypeCodecRegistry<T> private constructor(
    private val codecs: List<MediaTypeCodec<T>>,
    private val defaultCodecId: String?,
) {
    public fun select(
        candidateCodecIds: List<String>,
        mediaType: String?,
    ): MediaTypeCodec<T> {
        val candidates = codecs.filter { it.id in candidateCodecIds }
        val normalized = mediaType?.substringBefore(';')?.trim()?.lowercase()
        val exact =
            normalized?.let { type ->
                candidates.firstOrNull { codec -> codec.mediaTypes.normalized().contains(type) }
            }
        val suffix = normalized?.substringAfterLast('+', missingDelimiterValue = "")?.takeIf(String::isNotEmpty)
        val structured = suffix?.let { value -> candidates.firstOrNull { value in it.structuredSyntaxSuffixes } }
        val fallback = defaultCodecId?.let { id -> candidates.firstOrNull { it.id == id } }
        val selected = exact ?: structured ?: fallback
        if (selected == null) {
            throw SdkCapabilityException(
                message = "No codec is available for content type '${mediaType ?: "<missing>"}'.",
                capability = "media-type:$normalized",
            )
        }
        return selected
    }

    public companion object {
        public fun <T> of(
            vararg codecs: MediaTypeCodec<T>,
            defaultCodecId: String? = null,
        ): MediaTypeCodecRegistry<T> {
            require(codecs.map(MediaTypeCodec<*>::id).distinct().size == codecs.size) { "codec ids must be unique" }
            require(
                defaultCodecId == null || codecs.any { it.id == defaultCodecId },
            ) { "default codec must be registered" }
            return MediaTypeCodecRegistry(codecs.toList(), defaultCodecId)
        }
    }
}

/** Raised when a buffered read would exceed its configured byte limit. */
public class SdkBufferLimitExceededException(
    public val maxBytes: Long,
    public val observedBytes: Long,
) : RuntimeException("Buffered body exceeded $maxBytes bytes after reading $observedBytes bytes.")

public open class SdkException(
    message: String,
    public val operationId: String? = null,
    cause: Throwable? = null,
) : RuntimeException(message, cause)

public class SdkConfigurationException(
    message: String,
    operationId: String? = null,
    cause: Throwable? = null,
) : SdkException(message, operationId, cause)

public class SdkSerializationException(
    message: String,
    operationId: String? = null,
    cause: Throwable? = null,
) : SdkException(message, operationId, cause)

public class SdkTransportException(
    message: String,
    operationId: String? = null,
    cause: Throwable? = null,
) : SdkException(message, operationId, cause)

public class SdkApiException(
    public val statusCode: Int,
    public val headers: List<SdkHeader>,
    operationId: String,
) : SdkException("Operation '$operationId' returned HTTP $statusCode.", operationId)

public class SdkCapabilityException(
    message: String,
    public val capability: String,
    operationId: String? = null,
    cause: Throwable? = null,
) : SdkException(message, operationId, cause)

/**
 * Executes generated operations in validation, encoding, hook, transport, status, decoding, and closure order.
 *
 * Response bodies are closed exactly once with the terminal failure as the close cause. Cancellation is rethrown by
 * identity; ordinary codec and transport failures are converted to typed [SdkException] subclasses.
 */
public class SdkExecutor(
    private val transport: SdkTransport,
    private val authentication: SdkAuthentication? = null,
    private val requestHook: SdkRequestHook? = null,
) {
    /**
     * Duplicate-member policy: response bodies decoded through a [MediaTypeCodec] backed by kotlinx.serialization
     * (see [KotlinxSerializationCodec]) resolve duplicate JSON object keys using the parser's last-wins behavior —
     * this executor does not add its own duplicate-key detection or rejection layer. Generated models decode
     * whatever `decodeJsonElement()` produces, including collapsed duplicate discriminators or fields, so they must
     * not be treated as a validation firewall for untrusted relays in Phase 1; callers that need to reject duplicate
     * keys must do so before or alongside decoding.
     */
    public suspend fun <Request, Response> execute(
        metadata: OperationMetadata,
        baseUri: String,
        requestValue: Request,
        requestCodecIds: List<String>,
        responseCodecIds: List<String>,
        requestCodecs: MediaTypeCodecRegistry<Request>,
        responseCodecs: MediaTypeCodecRegistry<Response>,
        options: CallOptions = CallOptions(),
    ): Response {
        validate(metadata, baseUri, requestCodecIds, responseCodecIds)
        val requestMediaType = metadata.requestMediaTypes.first()
        val requestCodec = requestCodecs.select(requestCodecIds, requestMediaType)
        val body =
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
        var request =
            SdkRequest(
                method = metadata.method,
                uri = baseUri.trimEnd('/') + "/" + metadata.path.trimStart('/'),
                headers = options.headers,
                body = body,
                expectedResponseMode = metadata.responseMode,
                deadlines = options.deadlines ?: metadata.deadlines,
                operationId = metadata.operationId,
            )
        request = authentication?.apply(request) ?: request
        request = requestHook?.apply(request) ?: request
        request = options.requestHook?.apply(request) ?: request
        val response =
            try {
                transport.execute(request)
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
        var closeCause: Throwable? = null
        try {
            if (response.statusCode !in metadata.successStatusCodes) {
                throw SdkApiException(response.statusCode, response.headers, metadata.operationId)
            }
            val contentType = response.headers.firstValue("Content-Type") ?: metadata.responseMediaTypes.firstOrNull()
            val responseCodec = responseCodecs.select(responseCodecIds, contentType)
            return try {
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
        } catch (failure: Throwable) {
            closeCause = failure
            throw failure
        } finally {
            try {
                response.body.close(closeCause)
            } catch (cancellation: CancellationException) {
                throw cancellation
            } catch (closeFailure: Throwable) {
                closeCause?.let { throw it }
                throw SdkTransportException(
                    "Failed to close response body for '${metadata.operationId}'.",
                    metadata.operationId,
                    closeFailure,
                )
            }
        }
    }

    private fun validate(
        metadata: OperationMetadata,
        baseUri: String,
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
        if (metadata.requestMediaTypes.isEmpty() || requestCodecIds.isEmpty()) {
            throw SdkCapabilityException("A request codec is required.", "request-codec", metadata.operationId)
        }
        if (metadata.responseMediaTypes.isEmpty() || responseCodecIds.isEmpty()) {
            throw SdkCapabilityException("A response codec is required.", "response-codec", metadata.operationId)
        }
    }
}

/**
 * Buffers this stream up to [maxBytes], copying chunks once into the returned array.
 *
 * @throws IllegalArgumentException when the limit is not representable by a Kotlin [ByteArray].
 * @throws SdkBufferLimitExceededException before allocating beyond the configured limit.
 */
public suspend fun SdkByteStream.toByteArray(maxBytes: Long): ByteArray {
    require(maxBytes > 0) { "maxBytes must be positive" }
    require(maxBytes <= Int.MAX_VALUE.toLong()) { "maxBytes must fit in a Kotlin ByteArray" }
    val chunks = mutableListOf<ByteArray>()
    var size = 0L
    while (true) {
        val chunk = readChunk() ?: break
        check(chunk.isNotEmpty()) { "readChunk must return null at EOF instead of an empty chunk" }
        val chunkSize = chunk.size.toLong()
        if (size > maxBytes - chunkSize) {
            throw SdkBufferLimitExceededException(maxBytes, size + chunkSize)
        }
        size += chunkSize
        chunks += chunk
    }
    val bytes = ByteArray(size.toInt())
    var offset = 0
    chunks.forEach { chunk ->
        chunk.copyInto(bytes, destinationOffset = offset)
        offset += chunk.size
    }
    return bytes
}

private fun Set<String>.normalized(): Set<String> = mapTo(linkedSetOf()) { it.substringBefore(';').trim().lowercase() }
