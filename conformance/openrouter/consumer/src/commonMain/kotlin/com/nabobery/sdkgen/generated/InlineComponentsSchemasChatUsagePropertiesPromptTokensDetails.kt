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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Detailed prompt token usage
 */
@Serializable(with = InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails.Serializer::class)
public class InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails(
  /**
   * Audio input tokens
   */
  public val audioTokens: Int? = null,
  /**
   * Tokens written to cache. Only returned for models with explicit caching and cache write pricing.
   */
  public val cacheWriteTokens: Int? = null,
  /**
   * Cached prompt tokens
   */
  public val cachedTokens: Int? = null,
  /**
   * Video input tokens
   */
  public val videoTokens: Int? = null,
) {
  public class Builder {
    /**
     * Audio input tokens
     */
    public var audioTokens: Int? = null

    /**
     * Tokens written to cache. Only returned for models with explicit caching and cache write pricing.
     */
    public var cacheWriteTokens: Int? = null

    /**
     * Cached prompt tokens
     */
    public var cachedTokens: Int? = null

    /**
     * Video input tokens
     */
    public var videoTokens: Int? = null

    public fun build(): InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails =
      InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails(
      audioTokens = audioTokens,
      cacheWriteTokens = cacheWriteTokens,
      cachedTokens = cachedTokens,
      videoTokens = videoTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails must be a JSON " +
          "object")
      return InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails(
        audioTokens = raw["audio_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        cacheWriteTokens = raw["cache_write_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        cachedTokens = raw["cached_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        videoTokens = raw["video_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.audioTokens?.let { put("audio_tokens", json.encodeToJsonElement(it)) }
        value.cacheWriteTokens?.let { put("cache_write_tokens", json.encodeToJsonElement(it)) }
        value.cachedTokens?.let { put("cached_tokens", json.encodeToJsonElement(it)) }
        value.videoTokens?.let { put("video_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatUsagePropertiesPromptTokensDetails(block: InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails.Builder.() -> Unit): InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails = InlineComponentsSchemasChatUsagePropertiesPromptTokensDetails.build(block)
