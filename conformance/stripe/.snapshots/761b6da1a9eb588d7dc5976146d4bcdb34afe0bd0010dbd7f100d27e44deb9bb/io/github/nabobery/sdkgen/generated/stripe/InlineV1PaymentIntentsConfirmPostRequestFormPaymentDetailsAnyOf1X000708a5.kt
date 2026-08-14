package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_details/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_details/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5(
  public val customerReference:
      InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618? = null,
  public val orderReference:
      InlineV1PaymentIntentsConfirmPostRequestFormOrderReferenceX5774eba2? = null,
) {
  public class Builder {
    public var customerReference:
        InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618? = null

    public var orderReference: InlineV1PaymentIntentsConfirmPostRequestFormOrderReferenceX5774eba2?
        = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5(
      customerReference = customerReference,
      orderReference = orderReference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5(
        customerReference = rawObject["customer_reference"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCustomerReferenceX6b3f2618>(it) },
        orderReference = rawObject["order_reference"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormOrderReferenceX5774eba2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customerReference?.let { put("customer_reference", json.encodeToJsonElement(it)) }
        value.orderReference?.let { put("order_reference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentDetailsAnyOf1X000708a5.build(block)
