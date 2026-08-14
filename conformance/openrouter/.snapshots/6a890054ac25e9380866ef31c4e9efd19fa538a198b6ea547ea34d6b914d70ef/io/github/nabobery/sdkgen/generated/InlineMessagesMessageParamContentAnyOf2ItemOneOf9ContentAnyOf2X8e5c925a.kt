package io.github.nabobery.sdkgen.generated

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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items/oneOf/8/proper
 * ties/content/anyOf/1
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a.Serializer::class)
public class InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a(
  public val errorCode:
      InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602,
  public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2TypeXe541fe1f,
) {
  public class Builder {
    private var errorCodeValue:
        InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602? = null

    public var errorCode:
        InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602
      get() = requireNotNull(errorCodeValue) { "errorCode is required" }
      set(`value`) {
        errorCodeValue = value
      }

    private var typeValue:
        InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2TypeXe541fe1f? = null

    public var type: InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2TypeXe541fe1f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a {
      check(errorCodeValue != null) { "errorCode is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a(
        errorCode = errorCode,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a must be a JSON object")
      val errorCode = json.decodeRequired<InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2ErrorCodeXb633f602>(rawObject, "error_code")
      val type = json.decodeRequired<InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2TypeXe541fe1f>(rawObject, "type")
      return InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a(
        errorCode = errorCode,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error_code", json.encodeToJsonElement(value.errorCode))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a(block: InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a.Builder.() -> Unit): InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a = InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentAnyOf2X8e5c925a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
