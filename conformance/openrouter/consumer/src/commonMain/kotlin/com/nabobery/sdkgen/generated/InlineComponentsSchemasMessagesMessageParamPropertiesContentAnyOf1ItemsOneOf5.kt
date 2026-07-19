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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/5.
 */
@Serializable(with = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5.Serializer::class)
public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5(
  public val signature: String,
  public val thinking: String,
  public val type:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5Prodaecd580,
) {
  public class Builder {
    private var signatureValue: String? = null

    public var signature: String
      get() = requireNotNull(signatureValue) { "signature is required" }
      set(`value`) {
        signatureValue = value
      }

    private var thinkingValue: String? = null

    public var thinking: String
      get() = requireNotNull(thinkingValue) { "thinking is required" }
      set(`value`) {
        thinkingValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5Prodaecd580? =
        null

    public var type:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5Prodaecd580
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5 {
      check(signatureValue != null) { "signature is required" }
      check(thinkingValue != null) { "thinking is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5(
        signature = signature,
        thinking = thinking,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5 = Builder().apply(block)
        .build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5 " +
          "must be a JSON object")
      val signature = json.decodeRequired<String>(raw, "signature")
      val thinking = json.decodeRequired<String>(raw, "thinking")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5Prodaecd580>(raw,
          "type")
      return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5(
        signature = signature,
        thinking = thinking,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("signature", value.signature)
        put("thinking", value.thinking)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5(block: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5.Builder.() -> Unit): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5 = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5 is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
