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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicInputTokensClearAtLeast.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicInputTokensClearAtLeast
 */
@Serializable(with = AnthropicInputTokensClearAtLeast.Serializer::class)
public class AnthropicInputTokensClearAtLeast(
  public val type: InlineAnthropicInputTokensClearAtLeastTypeXa59cf9d4,
  public val `value`: Int,
) {
  public class Builder {
    private var typeValue: InlineAnthropicInputTokensClearAtLeastTypeXa59cf9d4? = null

    public var type: InlineAnthropicInputTokensClearAtLeastTypeXa59cf9d4
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var valueValue: Int? = null

    public var `value`: Int
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): AnthropicInputTokensClearAtLeast {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return AnthropicInputTokensClearAtLeast(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicInputTokensClearAtLeast = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicInputTokensClearAtLeast> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicInputTokensClearAtLeast {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicInputTokensClearAtLeast")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicInputTokensClearAtLeast must be a JSON object")
      val type = json.decodeRequired<InlineAnthropicInputTokensClearAtLeastTypeXa59cf9d4>(rawObject, "type")
      val value = json.decodeRequired<Int>(rawObject, "value")
      return AnthropicInputTokensClearAtLeast(
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicInputTokensClearAtLeast) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicInputTokensClearAtLeast")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicInputTokensClearAtLeast(block: AnthropicInputTokensClearAtLeast.Builder.() -> Unit): AnthropicInputTokensClearAtLeast = AnthropicInputTokensClearAtLeast.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicInputTokensClearAtLeast is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
