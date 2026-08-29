package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicDirectCaller.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicDirectCaller
 */
@Serializable(with = AnthropicDirectCaller.Serializer::class)
public class AnthropicDirectCaller(
  public val type: InlineAnthropicDirectCallerTypeX135b96ea,
) {
  public class Builder {
    private var typeValue: InlineAnthropicDirectCallerTypeX135b96ea? = null

    public var type: InlineAnthropicDirectCallerTypeX135b96ea
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicDirectCaller {
      check(typeValue != null) { "type is required" }
      return AnthropicDirectCaller(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicDirectCaller = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicDirectCaller> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicDirectCaller {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicDirectCaller")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicDirectCaller must be a JSON object")
      val type = json.decodeRequired<InlineAnthropicDirectCallerTypeX135b96ea>(rawObject, "type")
      return AnthropicDirectCaller(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicDirectCaller) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicDirectCaller")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicDirectCaller(block: AnthropicDirectCaller.Builder.() -> Unit): AnthropicDirectCaller = AnthropicDirectCaller.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicDirectCaller is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
