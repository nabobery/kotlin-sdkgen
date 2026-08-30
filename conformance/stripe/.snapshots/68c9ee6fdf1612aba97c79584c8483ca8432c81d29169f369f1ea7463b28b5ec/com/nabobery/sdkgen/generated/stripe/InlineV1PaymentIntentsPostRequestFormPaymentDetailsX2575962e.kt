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
 * Provides industry-specific information about the charge.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_details
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e(
  public val customerReference:
      InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceXa120a180? = null,
  public val orderReference:
      InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622? = null,
) {
  public class Builder {
    public var customerReference:
        InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceXa120a180? = null

    public var orderReference:
        InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e = InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e(
      customerReference = customerReference,
      orderReference = orderReference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e(
        customerReference = rawObject["customer_reference"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentDetailsCustomerReferenceXa120a180>(it) },
        orderReference = rawObject["order_reference"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentDetailsOrderReferenceXfaa35622>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customerReference?.let { put("customer_reference", json.encodeToJsonElement(it)) }
        value.orderReference?.let { put("order_reference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e(block: InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e = InlineV1PaymentIntentsPostRequestFormPaymentDetailsX2575962e.build(block)
