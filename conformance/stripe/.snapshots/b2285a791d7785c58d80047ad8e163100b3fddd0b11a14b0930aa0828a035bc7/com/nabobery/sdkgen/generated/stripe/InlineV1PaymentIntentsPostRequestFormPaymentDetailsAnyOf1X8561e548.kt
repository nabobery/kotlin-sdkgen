package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_details/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_details/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548(
  public val customerReference:
      InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4? = null,
  public val orderReference:
      InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20? = null,
) {
  public class Builder {
    public var customerReference:
        InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4? = null

    public var orderReference:
        InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548 = InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548(
      customerReference = customerReference,
      orderReference = orderReference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548(
        customerReference = rawObject["customer_reference"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceX1de4b9e4>(it) },
        orderReference = rawObject["order_reference"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1OrderReferenceX0ad3df20>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customerReference?.let { put("customer_reference", json.encodeToJsonElement(it)) }
        value.orderReference?.let { put("order_reference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548(block: InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548 = InlineV1PaymentIntentsPostRequestFormPaymentDetailsAnyOf1X8561e548.build(block)
