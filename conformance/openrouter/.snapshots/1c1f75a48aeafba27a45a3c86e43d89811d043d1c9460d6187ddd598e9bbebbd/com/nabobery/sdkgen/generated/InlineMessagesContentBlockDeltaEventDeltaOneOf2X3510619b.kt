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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/1
 */
@Serializable(with = InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b.Serializer::class)
public class InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b(
  public val partialJson: String,
  public val type: InlineMessagesContentBlockDeltaEventDeltaOneOf2TypeXd038041d,
) {
  public class Builder {
    private var partialJsonValue: String? = null

    public var partialJson: String
      get() = requireNotNull(partialJsonValue) { "partialJson is required" }
      set(`value`) {
        partialJsonValue = value
      }

    private var typeValue: InlineMessagesContentBlockDeltaEventDeltaOneOf2TypeXd038041d? = null

    public var type: InlineMessagesContentBlockDeltaEventDeltaOneOf2TypeXd038041d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b {
      check(partialJsonValue != null) { "partialJson is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b(
        partialJson = partialJson,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b must be a JSON object")
      val partialJson = json.decodeRequired<String>(rawObject, "partial_json")
      val type = json.decodeRequired<InlineMessagesContentBlockDeltaEventDeltaOneOf2TypeXd038041d>(rawObject, "type")
      return InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b(
        partialJson = partialJson,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("partial_json", value.partialJson)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b(block: InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b.Builder.() -> Unit): InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b = InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf2X3510619b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
