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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/0.
 */
@Serializable(with = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0.Serializer::class)
public class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0(
  public val text: String,
  public val type:
      InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType,
) {
  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType? =
        null

    public var type:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0 {
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0(
        text = text,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0 must " +
          "be a JSON object")
      val text = json.decodeRequired<String>(raw, "text")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType>(raw,
          "type")
      return InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0(
        text = text,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0(block: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0.Builder.() -> Unit): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0 = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0 is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
