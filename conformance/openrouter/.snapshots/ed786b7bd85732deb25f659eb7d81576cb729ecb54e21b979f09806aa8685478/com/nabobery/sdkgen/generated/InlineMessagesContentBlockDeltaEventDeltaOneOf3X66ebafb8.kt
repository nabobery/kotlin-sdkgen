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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/2
 */
@Serializable(with = InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8.Serializer::class)
public class InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8(
  public val thinking: String,
  public val type: InlineMessagesContentBlockDeltaEventDeltaOneOf3TypeX0d76797a,
) {
  public class Builder {
    private var thinkingValue: String? = null

    public var thinking: String
      get() = requireNotNull(thinkingValue) { "thinking is required" }
      set(`value`) {
        thinkingValue = value
      }

    private var typeValue: InlineMessagesContentBlockDeltaEventDeltaOneOf3TypeX0d76797a? = null

    public var type: InlineMessagesContentBlockDeltaEventDeltaOneOf3TypeX0d76797a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8 {
      check(thinkingValue != null) { "thinking is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8(
        thinking = thinking,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8 must be a JSON object")
      val thinking = json.decodeRequired<String>(rawObject, "thinking")
      val type = json.decodeRequired<InlineMessagesContentBlockDeltaEventDeltaOneOf3TypeX0d76797a>(rawObject, "type")
      return InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8(
        thinking = thinking,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("thinking", value.thinking)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8(block: InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8.Builder.() -> Unit): InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8 = InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesContentBlockDeltaEventDeltaOneOf3X66ebafb8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
