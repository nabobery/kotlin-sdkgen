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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/mandate_data/anyOf/0/properties/customer_acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/mandate_data/anyOf/0/properties/customer_acceptance
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb(
  public val type: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX1b3149cd,
  public val acceptedAt: Int? = null,
  public val offline: JsonObject? = null,
  public val online:
      InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineXfe8d164f? = null,
) {
  public class Builder {
    private var typeValue: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX1b3149cd?
        = null

    public var type: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX1b3149cd
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var acceptedAt: Int? = null

    public var offline: JsonObject? = null

    public var online: InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineXfe8d164f? =
        null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb {
      check(typeValue != null) { "type is required" }
      return InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb(
        type = type,
        acceptedAt = acceptedAt,
        offline = offline,
        online = online,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb must be a JSON object")
      val type = json.decodeRequired<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX1b3149cd>(rawObject, "type")
      return InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb(
        type = type,
        acceptedAt = rawObject["accepted_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        offline = rawObject["offline"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        online = rawObject["online"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineXfe8d164f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb")
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

public fun inlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb(block: InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb = InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormMandateDataCustomerAcceptanceX4a21bfeb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
