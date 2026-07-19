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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/2.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2(
  public val type: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType,
  public val display: AnthropicThinkingDisplay? = null,
) {
  public class Builder {
    private var typeValue:
        InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType? = null

    public var type: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var display: AnthropicThinkingDisplay? = null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2 {
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2(
        type = type,
        display = display,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2 =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2 must be a JSON " +
          "object")
      val type = json.decodeRequired<InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType>(raw,
        "type")
      return InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2(
        type = type,
        display = raw["display"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<AnthropicThinkingDisplay?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.display?.let { put("display", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2(block: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2 = InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2 is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
