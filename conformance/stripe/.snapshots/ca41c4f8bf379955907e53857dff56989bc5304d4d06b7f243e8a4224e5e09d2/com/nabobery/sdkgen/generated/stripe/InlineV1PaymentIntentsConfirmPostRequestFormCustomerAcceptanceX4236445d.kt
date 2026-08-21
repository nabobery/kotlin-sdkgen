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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/mandate_data/anyOf/0/properties/customer_acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/mandate_data/anyOf/0/properties/customer_acceptance
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d(
  public val type: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db,
  public val acceptedAt: Int? = null,
  public val offline: JsonObject? = null,
  public val online:
      InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db? = null

    public var type: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var acceptedAt: Int? = null

    public var offline: JsonObject? = null

    public var online: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c?
        = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d {
      check(typeValue != null) { "type is required" }
      return InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d(
        type = type,
        acceptedAt = acceptedAt,
        offline = offline,
        online = online,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d must be a JSON object")
      val type = json.decodeRequired<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1TypeX348da1db>(rawObject, "type")
      return InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d(
        type = type,
        acceptedAt = rawObject["accepted_at"]?.let { json.decodeFromJsonElement<Int>(it) },
        offline = rawObject["offline"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        online = rawObject["online"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1OnlineX6de4c84c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d")
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

public fun inlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d(block: InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d = InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
