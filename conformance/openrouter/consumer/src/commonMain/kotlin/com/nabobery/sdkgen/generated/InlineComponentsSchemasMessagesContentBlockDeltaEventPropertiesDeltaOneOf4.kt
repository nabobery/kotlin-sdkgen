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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/4.
 */
@Serializable(with = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4.Serializer::class)
public class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4(
  public val citation:
      InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4Proper6739e8d6,
  public val type:
      InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4PropertiesType,
) {
  public class Builder {
    private var citationValue:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4Proper6739e8d6? =
        null

    public var citation:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4Proper6739e8d6
      get() = requireNotNull(citationValue) { "citation is required" }
      set(`value`) {
        citationValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4PropertiesType? =
        null

    public var type:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4 {
      check(citationValue != null) { "citation is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4(
        citation = citation,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4 must " +
          "be a JSON object")
      val citation = json
        .decodeRequired<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4Proper6739e8d6>(raw,
          "citation")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4PropertiesType>(raw,
          "type")
      return InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4(
        citation = citation,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("citation", json.encodeToJsonElement(value.citation))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4(block: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4.Builder.() -> Unit): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4 = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4 is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
