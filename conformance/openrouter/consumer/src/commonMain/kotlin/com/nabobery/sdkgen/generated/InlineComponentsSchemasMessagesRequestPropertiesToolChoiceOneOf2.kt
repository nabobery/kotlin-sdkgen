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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice/oneOf/2.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2(
  public val type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType,
) {
  public class Builder {
    private var typeValue:
        InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType? = null

    public var type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2 must be a JSON " +
          "object")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType>(raw, "type")
      return InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2(block: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2 = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2 is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
