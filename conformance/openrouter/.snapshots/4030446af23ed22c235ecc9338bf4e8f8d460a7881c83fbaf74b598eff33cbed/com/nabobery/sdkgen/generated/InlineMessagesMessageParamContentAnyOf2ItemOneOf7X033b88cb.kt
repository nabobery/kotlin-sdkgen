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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/6
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb.Serializer::class)
public class InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb(
  public val `data`: String,
  public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf7TypeXc49277de,
) {
  public class Builder {
    private var dataValue: String? = null

    public var `data`: String
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var typeValue: InlineMessagesMessageParamContentAnyOf2ItemOneOf7TypeXc49277de? = null

    public var type: InlineMessagesMessageParamContentAnyOf2ItemOneOf7TypeXc49277de
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb {
      check(dataValue != null) { "data is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb(
        data = data,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb must be a JSON object")
      val data = json.decodeRequired<String>(rawObject, "data")
      val type = json.decodeRequired<InlineMessagesMessageParamContentAnyOf2ItemOneOf7TypeXc49277de>(rawObject, "type")
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb(
        data = data,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb(block: InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb.Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb = InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
