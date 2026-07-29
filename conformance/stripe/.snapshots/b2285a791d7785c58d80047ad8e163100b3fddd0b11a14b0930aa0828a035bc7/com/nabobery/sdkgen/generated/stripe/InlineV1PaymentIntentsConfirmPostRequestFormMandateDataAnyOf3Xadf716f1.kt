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
 * This hash contains details about the Mandate to create
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/mandate_data/anyOf/2
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1(
  public val customerAcceptance:
      InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff,
) {
  public class Builder {
    private var customerAcceptanceValue:
        InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff? = null

    public var customerAcceptance:
        InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff
      get() = requireNotNull(customerAcceptanceValue) { "customerAcceptance is required" }
      set(`value`) {
        customerAcceptanceValue = value
      }

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1 {
      check(customerAcceptanceValue != null) { "customerAcceptance is required" }
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1(
        customerAcceptance = customerAcceptance,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1 must be a JSON object")
      val customerAcceptance = json.decodeRequired<InlineV1PaymentIntentsConfirmPostRequestFormCustomerAcceptanceXe7c2e6ff>(rawObject, "customer_acceptance")
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1(
        customerAcceptance = customerAcceptance,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("customer_acceptance", json.encodeToJsonElement(value.customerAcceptance))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1(block: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1 = InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
