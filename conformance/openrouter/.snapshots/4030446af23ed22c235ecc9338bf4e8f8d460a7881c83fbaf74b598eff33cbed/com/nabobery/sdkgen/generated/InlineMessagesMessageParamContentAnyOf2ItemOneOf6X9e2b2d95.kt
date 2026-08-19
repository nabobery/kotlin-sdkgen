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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/5
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95.Serializer::class)
public class InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95(
  public val signature: String,
  public val thinking: String,
  public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580,
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

    private var typeValue: InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580? = null

    public var type: InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95 {
      check(signatureValue != null) { "signature is required" }
      check(thinkingValue != null) { "thinking is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95(
        signature = signature,
        thinking = thinking,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95 must be a JSON object")
      val signature = json.decodeRequired<String>(rawObject, "signature")
      val thinking = json.decodeRequired<String>(rawObject, "thinking")
      val type = json.decodeRequired<InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580>(rawObject, "type")
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95(
        signature = signature,
        thinking = thinking,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95")
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

public fun inlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95(block: InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95.Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95 = InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
