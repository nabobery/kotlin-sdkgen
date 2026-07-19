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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/8/proper
 * ties/content/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a
  .Serializer::class)
public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a(
  public val errorCode:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Prob633f602,
  public val type:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe541fe1f,
) {
  public class Builder {
    private var errorCodeValue:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Prob633f602? =
        null

    public var errorCode:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Prob633f602
      get() = requireNotNull(errorCodeValue) { "errorCode is required" }
      set(`value`) {
        errorCodeValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe541fe1f? =
        null

    public var type:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe541fe1f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a {
      check(errorCodeValue != null) { "errorCode is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a(
        errorCode = errorCode,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a = Builder()
        .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a " +
          "must be a JSON object")
      val errorCode = json
        .decodeRequired<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Prob633f602>(raw,
          "error_code")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe541fe1f>(raw,
          "type")
      return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a(
        errorCode = errorCode,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error_code", json.encodeToJsonElement(value.errorCode))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a(block: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a.Builder.() -> Unit): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro8e5c925a " +
      "is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
