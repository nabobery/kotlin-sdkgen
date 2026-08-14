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
 * Provides industry-specific information about the charge.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/payment_details
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b(
  public val customerReference:
      InlineV1PaymentIntentsIncra167PostRequestFormCustomerReferenceXf28866d7? = null,
  public val orderReference:
      InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871? = null,
) {
  public class Builder {
    public var customerReference:
        InlineV1PaymentIntentsIncra167PostRequestFormCustomerReferenceXf28866d7? = null

    public var orderReference: InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871?
        = null

    public fun build(): InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b = InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b(
      customerReference = customerReference,
      orderReference = orderReference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b must be a JSON object")
      return InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b(
        customerReference = rawObject["customer_reference"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormCustomerReferenceXf28866d7>(it) },
        orderReference = rawObject["order_reference"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customerReference?.let { put("customer_reference", json.encodeToJsonElement(it)) }
        value.orderReference?.let { put("order_reference", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b(block: InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b.Builder.() -> Unit): InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b = InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsX78b8483b.build(block)
