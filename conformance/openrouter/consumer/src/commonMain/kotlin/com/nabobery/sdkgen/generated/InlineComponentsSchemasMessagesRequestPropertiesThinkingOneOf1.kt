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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/1.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1(
  public val type: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType,
) {
  public class Builder {
    private var typeValue:
        InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType? = null

    public var type: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1 must be a JSON " +
          "object")
      val type = json.decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType>(raw,
        "type")
      return InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1(block: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1 = InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1 is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
