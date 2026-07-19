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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/3.
 */
@Serializable(with = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3.Serializer::class)
public class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3(
  public val signature: String,
  public val type:
      InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType,
) {
  public class Builder {
    private var signatureValue: String? = null

    public var signature: String
      get() = requireNotNull(signatureValue) { "signature is required" }
      set(`value`) {
        signatureValue = value
      }

    private var typeValue:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType? =
        null

    public var type:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3 {
      check(signatureValue != null) { "signature is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3(
        signature = signature,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3 must " +
          "be a JSON object")
      val signature = json.decodeRequired<String>(raw, "signature")
      val type = json
        .decodeRequired<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType>(raw,
          "type")
      return InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3(
        signature = signature,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("signature", value.signature)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3(block: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3.Builder.() -> Unit): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3 = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3 is " +
      "missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
