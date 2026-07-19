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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicBaseUsageIteration.
 */
@Serializable(with = AnthropicBaseUsageIteration.Serializer::class)
public class AnthropicBaseUsageIteration(
  public val cacheCreation: AnthropicIterationCacheCreation? = null,
  public val cacheCreationInputTokens: Int? = null,
  public val cacheReadInputTokens: Int? = null,
  public val inputTokens: Int? = null,
  public val outputTokens: Int? = null,
) {
  public class Builder {
    public var cacheCreation: AnthropicIterationCacheCreation? = null

    public var cacheCreationInputTokens: Int? = null

    public var cacheReadInputTokens: Int? = null

    public var inputTokens: Int? = null

    public var outputTokens: Int? = null

    public fun build(): AnthropicBaseUsageIteration = AnthropicBaseUsageIteration(
      cacheCreation = cacheCreation,
      cacheCreationInputTokens = cacheCreationInputTokens,
      cacheReadInputTokens = cacheReadInputTokens,
      inputTokens = inputTokens,
      outputTokens = outputTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicBaseUsageIteration = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicBaseUsageIteration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicBaseUsageIteration {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicBaseUsageIteration")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicBaseUsageIteration must be a JSON object")
      return AnthropicBaseUsageIteration(
        cacheCreation = raw["cache_creation"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<AnthropicIterationCacheCreation?>(element) },
        cacheCreationInputTokens = raw["cache_creation_input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        cacheReadInputTokens = raw["cache_read_input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        inputTokens = raw["input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        outputTokens = raw["output_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicBaseUsageIteration) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicBaseUsageIteration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cacheCreation?.let { put("cache_creation", json.encodeToJsonElement(it)) }
        value.cacheCreationInputTokens?.let { put("cache_creation_input_tokens", json.encodeToJsonElement(it)) }
        value.cacheReadInputTokens?.let { put("cache_read_input_tokens", json.encodeToJsonElement(it)) }
        value.inputTokens?.let { put("input_tokens", json.encodeToJsonElement(it)) }
        value.outputTokens?.let { put("output_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicBaseUsageIteration(block: AnthropicBaseUsageIteration.Builder.() ->
  Unit): AnthropicBaseUsageIteration = AnthropicBaseUsageIteration.build(block)
