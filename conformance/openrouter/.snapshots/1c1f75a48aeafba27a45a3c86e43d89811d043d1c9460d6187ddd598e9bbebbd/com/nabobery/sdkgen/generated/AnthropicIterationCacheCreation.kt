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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicIterationCacheCreation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicIterationCacheCreation
 */
@Serializable(with = AnthropicIterationCacheCreation.Serializer::class)
public class AnthropicIterationCacheCreation(
  public val ephemeral1hInputTokens: Int? = null,
  public val ephemeral5mInputTokens: Int? = null,
) {
  public class Builder {
    public var ephemeral1hInputTokens: Int? = null

    public var ephemeral5mInputTokens: Int? = null

    public fun build(): AnthropicIterationCacheCreation = AnthropicIterationCacheCreation(
      ephemeral1hInputTokens = ephemeral1hInputTokens,
      ephemeral5mInputTokens = ephemeral5mInputTokens,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicIterationCacheCreation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicIterationCacheCreation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicIterationCacheCreation {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicIterationCacheCreation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicIterationCacheCreation must be a JSON object")
      return AnthropicIterationCacheCreation(
        ephemeral1hInputTokens = rawObject["ephemeral_1h_input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        ephemeral5mInputTokens = rawObject["ephemeral_5m_input_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicIterationCacheCreation) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicIterationCacheCreation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ephemeral1hInputTokens?.let { put("ephemeral_1h_input_tokens", json.encodeToJsonElement(it)) }
        value.ephemeral5mInputTokens?.let { put("ephemeral_5m_input_tokens", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicIterationCacheCreation(block: AnthropicIterationCacheCreation.Builder.() -> Unit): AnthropicIterationCacheCreation = AnthropicIterationCacheCreation.build(block)
