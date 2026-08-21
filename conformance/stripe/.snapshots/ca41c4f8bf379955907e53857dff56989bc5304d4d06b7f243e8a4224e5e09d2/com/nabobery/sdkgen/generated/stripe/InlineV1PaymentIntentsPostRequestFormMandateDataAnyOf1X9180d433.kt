package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/mandate_data/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/mandate_data/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433(
  public val customerAcceptance:
      InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4,
) {
  public class Builder {
    private var customerAcceptanceValue:
        InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4? = null

    public var customerAcceptance:
        InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4
      get() = requireNotNull(customerAcceptanceValue) { "customerAcceptance is required" }
      set(`value`) {
        customerAcceptanceValue = value
      }

    public fun build(): InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433 {
      check(customerAcceptanceValue != null) { "customerAcceptance is required" }
      return InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433(
        customerAcceptance = customerAcceptance,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433 must be a JSON object")
      val customerAcceptance = json.decodeRequired<InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4>(rawObject, "customer_acceptance")
      return InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433(
        customerAcceptance = customerAcceptance,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("customer_acceptance", json.encodeToJsonElement(value.customerAcceptance))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433(block: InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433 = InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1X9180d433 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
