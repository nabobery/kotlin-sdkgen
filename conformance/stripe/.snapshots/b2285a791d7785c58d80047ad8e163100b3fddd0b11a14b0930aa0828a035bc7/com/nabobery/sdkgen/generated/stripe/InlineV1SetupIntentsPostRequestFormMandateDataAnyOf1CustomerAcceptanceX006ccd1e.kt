package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/mandate_data/anyOf/0/properties/customer_acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/mandate_data/anyOf/0/properties/customer_acceptance
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e(
  public val type: InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf,
  public val acceptedAt: Int? = null,
  public val offline: JsonObject? = null,
  public val online: InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1OnlineX0371edbf? = null,
) {
  public class Builder {
    private var typeValue: InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf? = null

    public var type: InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var acceptedAt: Int? = null

    public var offline: JsonObject? = null

    public var online: InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1OnlineX0371edbf? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e {
      check(typeValue != null) { "type is required" }
      return InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e(
        type = type,
        acceptedAt = acceptedAt,
        offline = offline,
        online = online,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e must be a JSON object")
      val type = json.decodeRequired<InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1TypeXfbf01faf>(rawObject, "type")
      return InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e(
        type = type,
        acceptedAt = rawObject["accepted_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        offline = rawObject["offline"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        online = rawObject["online"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1OnlineX0371edbf>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.acceptedAt?.let { put("accepted_at", json.encodeToJsonElement(it)) }
        value.offline?.let { put("offline", json.encodeToJsonElement(it)) }
        value.online?.let { put("online", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e(block: InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e = InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1CustomerAcceptanceX006ccd1e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
