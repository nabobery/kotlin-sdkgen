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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/mandate_data/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/mandate_data/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4(
  public val customerAcceptance:
      InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d,
) {
  public class Builder {
    private var customerAcceptanceValue:
        InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d? = null

    public var customerAcceptance:
        InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d
      get() = requireNotNull(customerAcceptanceValue) { "customerAcceptance is required" }
      set(`value`) {
        customerAcceptanceValue = value
      }

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4 {
      check(customerAcceptanceValue != null) { "customerAcceptance is required" }
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4(
        customerAcceptance = customerAcceptance,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4 must be a JSON object")
      val customerAcceptance = json.decodeRequired<InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceX4236445d>(rawObject, "customer_acceptance")
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4(
        customerAcceptance = customerAcceptance,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("customer_acceptance", json.encodeToJsonElement(value.customerAcceptance))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4(block: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4 = InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
