package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatUsage/properties/prompt_tokens_details
 */
@Serializable(with = InlineChatUsagePromptTokensDetailsX4d2bbaaa.Serializer::class)
public class InlineChatUsagePromptTokensDetailsX4d2bbaaa(
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

    public fun build(): InlineChatUsagePromptTokensDetailsX4d2bbaaa = InlineChatUsagePromptTokensDetailsX4d2bbaaa(
      audioTokens = audioTokens,
      cacheWriteTokens = cacheWriteTokens,
      cachedTokens = cachedTokens,
      videoTokens = videoTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatUsagePromptTokensDetailsX4d2bbaaa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatUsagePromptTokensDetailsX4d2bbaaa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatUsagePromptTokensDetailsX4d2bbaaa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatUsagePromptTokensDetailsX4d2bbaaa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatUsagePromptTokensDetailsX4d2bbaaa must be a JSON object")
      return InlineChatUsagePromptTokensDetailsX4d2bbaaa(
        audioTokens = rawObject["audio_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        cacheWriteTokens = rawObject["cache_write_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        cachedTokens = rawObject["cached_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        videoTokens = rawObject["video_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatUsagePromptTokensDetailsX4d2bbaaa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatUsagePromptTokensDetailsX4d2bbaaa")
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

public fun inlineChatUsagePromptTokensDetailsX4d2bbaaa(block: InlineChatUsagePromptTokensDetailsX4d2bbaaa.Builder.() -> Unit): InlineChatUsagePromptTokensDetailsX4d2bbaaa = InlineChatUsagePromptTokensDetailsX4d2bbaaa.build(block)
