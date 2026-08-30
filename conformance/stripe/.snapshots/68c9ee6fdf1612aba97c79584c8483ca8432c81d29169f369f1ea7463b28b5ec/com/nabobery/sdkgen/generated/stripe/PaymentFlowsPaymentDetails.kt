package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_payment_details
 */
@Serializable(with = PaymentFlowsPaymentDetails.Serializer::class)
public class PaymentFlowsPaymentDetails(
  /**
   * A unique value to identify the customer. This field is available only for card payments.
   *
   * This field is truncated to 25 alphanumeric characters, excluding spaces, before being sent to card networks.
   */
  public val customerReference: String? = null,
  /**
   * A unique value assigned by the business to identify the transaction. Required for L2 and L3 rates.
   *
   * For Cards, this field is truncated to 25 alphanumeric characters, excluding spaces, before being sent to card
   * networks. For Klarna, this field is truncated to 255 characters and is visible to customers when they view the
   * order in the Klarna app.
   */
  public val orderReference: String? = null,
) {
  public class Builder {
    /**
     * A unique value to identify the customer. This field is available only for card payments.
     *
     * This field is truncated to 25 alphanumeric characters, excluding spaces, before being sent to card networks.
     */
    public var customerReference: String? = null

    /**
     * A unique value assigned by the business to identify the transaction. Required for L2 and L3 rates.
     *
     * For Cards, this field is truncated to 25 alphanumeric characters, excluding spaces, before being sent to card
     * networks. For Klarna, this field is truncated to 255 characters and is visible to customers when they view the
     * order in the Klarna app.
     */
    public var orderReference: String? = null

    public fun build(): PaymentFlowsPaymentDetails = PaymentFlowsPaymentDetails(
      customerReference = customerReference,
      orderReference = orderReference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsPaymentDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentFlowsPaymentDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsPaymentDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsPaymentDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsPaymentDetails must be a JSON object")
      return PaymentFlowsPaymentDetails(
        customerReference = rawObject["customer_reference"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        orderReference = rawObject["order_reference"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsPaymentDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsPaymentDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customerReference?.let { put("customer_reference", it) }
        value.orderReference?.let { put("order_reference", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsPaymentDetails(block: PaymentFlowsPaymentDetails.Builder.() -> Unit): PaymentFlowsPaymentDetails = PaymentFlowsPaymentDetails.build(block)
