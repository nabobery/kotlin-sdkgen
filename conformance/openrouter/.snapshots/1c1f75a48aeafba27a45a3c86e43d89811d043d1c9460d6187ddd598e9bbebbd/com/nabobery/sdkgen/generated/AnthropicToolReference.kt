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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolReference.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolReference
 */
@Serializable(with = AnthropicToolReference.Serializer::class)
public class AnthropicToolReference(
  public val toolName: String,
  public val type: InlineAnthropicToolReferenceTypeXfdc1dc52,
) {
  public class Builder {
    private var toolNameValue: String? = null

    public var toolName: String
      get() = requireNotNull(toolNameValue) { "toolName is required" }
      set(`value`) {
        toolNameValue = value
      }

    private var typeValue: InlineAnthropicToolReferenceTypeXfdc1dc52? = null

    public var type: InlineAnthropicToolReferenceTypeXfdc1dc52
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicToolReference {
      check(toolNameValue != null) { "toolName is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicToolReference(
        toolName = toolName,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicToolReference = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicToolReference> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicToolReference {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicToolReference")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicToolReference must be a JSON object")
      val toolName = json.decodeRequired<String>(rawObject, "tool_name")
      val type = json.decodeRequired<InlineAnthropicToolReferenceTypeXfdc1dc52>(rawObject, "type")
      return AnthropicToolReference(
        toolName = toolName,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicToolReference) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicToolReference")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tool_name", value.toolName)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicToolReference(block: AnthropicToolReference.Builder.() -> Unit): AnthropicToolReference = AnthropicToolReference.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicToolReference is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
