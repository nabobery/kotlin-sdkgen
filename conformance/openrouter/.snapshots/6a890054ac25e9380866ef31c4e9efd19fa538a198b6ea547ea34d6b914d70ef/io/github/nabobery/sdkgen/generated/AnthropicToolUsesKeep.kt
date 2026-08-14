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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolUsesKeep.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolUsesKeep
 */
@Serializable(with = AnthropicToolUsesKeep.Serializer::class)
public class AnthropicToolUsesKeep(
  public val type: InlineAnthropicToolUsesKeepTypeXdcd2cc92,
  public val `value`: Int,
) {
  public class Builder {
    private var typeValue: InlineAnthropicToolUsesKeepTypeXdcd2cc92? = null

    public var type: InlineAnthropicToolUsesKeepTypeXdcd2cc92
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

    public fun build(): AnthropicToolUsesKeep {
      check(typeValue != null) { "type is required" }
      check(valueValue != null) { "value is required" }
      return AnthropicToolUsesKeep(
        type = type,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicToolUsesKeep = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicToolUsesKeep> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicToolUsesKeep {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicToolUsesKeep")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicToolUsesKeep must be a JSON object")
      val type = json.decodeRequired<InlineAnthropicToolUsesKeepTypeXdcd2cc92>(rawObject, "type")
      val value = json.decodeRequired<Int>(rawObject, "value")
      return AnthropicToolUsesKeep(
        type = type,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicToolUsesKeep) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicToolUsesKeep")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicToolUsesKeep(block: AnthropicToolUsesKeep.Builder.() -> Unit): AnthropicToolUsesKeep = AnthropicToolUsesKeep.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicToolUsesKeep is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
