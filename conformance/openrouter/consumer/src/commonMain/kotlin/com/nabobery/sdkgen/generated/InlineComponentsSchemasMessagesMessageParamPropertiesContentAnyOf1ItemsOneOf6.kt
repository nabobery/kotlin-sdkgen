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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/6.
 */
@Serializable(with = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6.Serializer::class)
public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6(
  public val `data`: String,
  public val type:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de,
) {
  public class Builder {
    private var dataValue: String? = null

    public var `data`: String
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de? =
        null

    public var type:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6 {
      check(dataValue != null) { "data is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6(
        data = data,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6 = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6 " +
          "must be a JSON object")
      val data = json.decodeRequired<String>(raw, "data")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de>(raw,
          "type")
      return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6(
        data = data,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6(block: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6.Builder.() -> Unit): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6 = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6 is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
