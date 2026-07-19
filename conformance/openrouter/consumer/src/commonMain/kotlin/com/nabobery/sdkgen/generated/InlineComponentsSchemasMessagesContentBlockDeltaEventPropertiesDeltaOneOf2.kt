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
 */
@Serializable(with = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2.Serializer::class)
public class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2(
  public val thinking: String,
  public val type:
      InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType,
) {
  public class Builder {
    private var thinkingValue: String? = null

    public var thinking: String
      get() = requireNotNull(thinkingValue) { "thinking is required" }
      set(`value`) {
        thinkingValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType? =
        null

    public var type:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2 {
      check(thinkingValue != null) { "thinking is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2(
        thinking = thinking,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2 must " +
          "be a JSON object")
      val thinking = json.decodeRequired<String>(raw, "thinking")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType>(raw,
          "type")
      return InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2(
        thinking = thinking,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("thinking", value.thinking)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2(block: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2.Builder.() -> Unit): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2 = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2 is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
