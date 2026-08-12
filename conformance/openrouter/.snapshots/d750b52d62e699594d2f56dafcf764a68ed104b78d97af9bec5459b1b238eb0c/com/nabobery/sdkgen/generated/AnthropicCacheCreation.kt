package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCacheCreation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCacheCreation
 */
@Serializable(with = AnthropicCacheCreation.Serializer::class)
public class AnthropicCacheCreation(
  public val ephemeral1hInputTokens: Int,
  public val ephemeral5mInputTokens: Int,
) {
  public class Builder {
    private var ephemeral1hInputTokensValue: Int? = null

    public var ephemeral1hInputTokens: Int
      get() = requireNotNull(ephemeral1hInputTokensValue) { "ephemeral1hInputTokens is required" }
      set(`value`) {
        ephemeral1hInputTokensValue = value
      }

    private var ephemeral5mInputTokensValue: Int? = null

    public var ephemeral5mInputTokens: Int
      get() = requireNotNull(ephemeral5mInputTokensValue) { "ephemeral5mInputTokens is required" }
      set(`value`) {
        ephemeral5mInputTokensValue = value
      }

    public fun build(): AnthropicCacheCreation {
      check(ephemeral1hInputTokensValue != null) { "ephemeral1hInputTokens is required" }
      check(ephemeral5mInputTokensValue != null) { "ephemeral5mInputTokens is required" }
      return AnthropicCacheCreation(
        ephemeral1hInputTokens = ephemeral1hInputTokens,
        ephemeral5mInputTokens = ephemeral5mInputTokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicCacheCreation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicCacheCreation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCacheCreation {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCacheCreation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicCacheCreation must be a JSON object")
      val ephemeral1hInputTokens = json.decodeRequired<Int>(rawObject, "ephemeral_1h_input_tokens")
      val ephemeral5mInputTokens = json.decodeRequired<Int>(rawObject, "ephemeral_5m_input_tokens")
      return AnthropicCacheCreation(
        ephemeral1hInputTokens = ephemeral1hInputTokens,
        ephemeral5mInputTokens = ephemeral5mInputTokens,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCacheCreation) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCacheCreation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ephemeral_1h_input_tokens", json.encodeToJsonElement(value.ephemeral1hInputTokens))
        put("ephemeral_5m_input_tokens", json.encodeToJsonElement(value.ephemeral5mInputTokens))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicCacheCreation(block: AnthropicCacheCreation.Builder.() -> Unit): AnthropicCacheCreation = AnthropicCacheCreation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicCacheCreation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
