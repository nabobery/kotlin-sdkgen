package com.nabobery.sdkgen.runtime

import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.Json

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

private fun Set<String>.normalized(): Set<String> = mapTo(linkedSetOf()) { it.substringBefore(';').trim().lowercase() }
