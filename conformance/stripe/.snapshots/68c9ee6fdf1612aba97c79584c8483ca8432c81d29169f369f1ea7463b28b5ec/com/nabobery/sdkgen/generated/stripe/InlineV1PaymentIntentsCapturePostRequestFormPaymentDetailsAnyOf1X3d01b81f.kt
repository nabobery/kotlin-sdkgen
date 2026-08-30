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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_details/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_details/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f(
  public val customerReference:
      InlineV1PaymentIntentsCapturePostRequestFormCustomerReferenceXf9d124d6? = null,
  public val orderReference:
      InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c? = null,
) {
  public class Builder {
    public var customerReference:
        InlineV1PaymentIntentsCapturePostRequestFormCustomerReferenceXf9d124d6? = null

    public var orderReference: InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c?
        = null

    public fun build(): InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f = InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f(
      customerReference = customerReference,
      orderReference = orderReference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f must be a JSON object")
      return InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f(
        customerReference = rawObject["customer_reference"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormCustomerReferenceXf9d124d6>(it) },
        orderReference = rawObject["order_reference"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customerReference?.let { put("customer_reference", json.encodeToJsonElement(it)) }
        value.orderReference?.let { put("order_reference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f(block: InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f.Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f = InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1X3d01b81f.build(block)
