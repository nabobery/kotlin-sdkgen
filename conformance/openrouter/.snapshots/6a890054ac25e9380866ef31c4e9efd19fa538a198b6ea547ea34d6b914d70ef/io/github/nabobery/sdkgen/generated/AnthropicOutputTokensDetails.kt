package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicOutputTokensDetails.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicOutputTokensDetails
 */
@Serializable(with = AnthropicOutputTokensDetails.Serializer::class)
public class AnthropicOutputTokensDetails(
  public val thinkingTokens: Int,
) {
  public class Builder {
    private var thinkingTokensValue: Int? = null

    public var thinkingTokens: Int
      get() = requireNotNull(thinkingTokensValue) { "thinkingTokens is required" }
      set(`value`) {
        thinkingTokensValue = value
      }

    public fun build(): AnthropicOutputTokensDetails {
      check(thinkingTokensValue != null) { "thinkingTokens is required" }
      return AnthropicOutputTokensDetails(
        thinkingTokens = thinkingTokens,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicOutputTokensDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicOutputTokensDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicOutputTokensDetails {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicOutputTokensDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicOutputTokensDetails must be a JSON object")
      val thinkingTokens = json.decodeRequired<Int>(rawObject, "thinking_tokens")
      return AnthropicOutputTokensDetails(
        thinkingTokens = thinkingTokens,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicOutputTokensDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicOutputTokensDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("thinking_tokens", json.encodeToJsonElement(value.thinkingTokens))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicOutputTokensDetails(block: AnthropicOutputTokensDetails.Builder.() -> Unit): AnthropicOutputTokensDetails = AnthropicOutputTokensDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicOutputTokensDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
