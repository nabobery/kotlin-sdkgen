package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Breakdown of tokens used in the prompt.
 */
@Serializable(with = InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails.Serializer::class)
public class InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails(
  /**
   * Tokens used for input audio.
   */
  public val audioTokens: Int? = null,
  /**
   * Tokens written to cache. Only returned for models with explicit caching and cache write pricing.
   */
  public val cacheWriteTokens: Int? = null,
  /**
   * Tokens cached by the endpoint.
   */
  public val cachedTokens: Int? = null,
  /**
   * Tokens used for input files/documents.
   */
  public val fileTokens: Int? = null,
  /**
   * Tokens used for input video.
   */
  public val videoTokens: Int? = null,
) {
  public class Builder {
    /**
     * Tokens used for input audio.
     */
    public var audioTokens: Int? = null

    /**
     * Tokens written to cache. Only returned for models with explicit caching and cache write pricing.
     */
    public var cacheWriteTokens: Int? = null

    /**
     * Tokens cached by the endpoint.
     */
    public var cachedTokens: Int? = null

    /**
     * Tokens used for input files/documents.
     */
    public var fileTokens: Int? = null

    /**
     * Tokens used for input video.
     */
    public var videoTokens: Int? = null

    public fun build(): InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails =
      InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails(
      audioTokens = audioTokens,
      cacheWriteTokens = cacheWriteTokens,
      cachedTokens = cachedTokens,
      fileTokens = fileTokens,
      videoTokens = videoTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails must " +
          "be a JSON object")
      return InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails(
        audioTokens = raw["audio_tokens"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        cacheWriteTokens = raw["cache_write_tokens"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        cachedTokens = raw["cached_tokens"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        fileTokens = raw["file_tokens"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        videoTokens = raw["video_tokens"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.audioTokens?.let { put("audio_tokens", json.encodeToJsonElement(it)) }
        value.cacheWriteTokens?.let { put("cache_write_tokens", json.encodeToJsonElement(it)) }
        value.cachedTokens?.let { put("cached_tokens", json.encodeToJsonElement(it)) }
        value.fileTokens?.let { put("file_tokens", json.encodeToJsonElement(it)) }
        value.videoTokens?.let { put("video_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails(block: InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails.Builder.() -> Unit): InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails = InlineComponentsSchemasImageGenerationUsagePropertiesPromptTokensDetails.build(block)
