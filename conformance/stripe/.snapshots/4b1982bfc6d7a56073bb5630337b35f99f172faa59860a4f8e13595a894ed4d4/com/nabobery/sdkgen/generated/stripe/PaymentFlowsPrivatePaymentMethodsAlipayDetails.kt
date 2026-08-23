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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_alipay_details
 */
@Serializable(with = PaymentFlowsPrivatePaymentMethodsAlipayDetails.Serializer::class)
public class PaymentFlowsPrivatePaymentMethodsAlipayDetails(
  /**
   * Uniquely identifies this particular Alipay account. You can use this attribute to check whether two Alipay accounts
   * are the same.
   */
  public val buyerId: String? = null,
  /**
   * Uniquely identifies this particular Alipay account. You can use this attribute to check whether two Alipay accounts
   * are the same.
   */
  public val fingerprint: String? = null,
  /**
   * Transaction ID of this particular Alipay transaction.
   */
  public val transactionId: String? = null,
) {
  public class Builder {
    /**
     * Uniquely identifies this particular Alipay account. You can use this attribute to check whether two Alipay
     * accounts are the same.
     */
    public var buyerId: String? = null

    /**
     * Uniquely identifies this particular Alipay account. You can use this attribute to check whether two Alipay
     * accounts are the same.
     */
    public var fingerprint: String? = null

    /**
     * Transaction ID of this particular Alipay transaction.
     */
    public var transactionId: String? = null

    public fun build(): PaymentFlowsPrivatePaymentMethodsAlipayDetails = PaymentFlowsPrivatePaymentMethodsAlipayDetails(
      buyerId = buyerId,
      fingerprint = fingerprint,
      transactionId = transactionId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsPrivatePaymentMethodsAlipayDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentFlowsPrivatePaymentMethodsAlipayDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsPrivatePaymentMethodsAlipayDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsPrivatePaymentMethodsAlipayDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsPrivatePaymentMethodsAlipayDetails must be a JSON object")
      return PaymentFlowsPrivatePaymentMethodsAlipayDetails(
        buyerId = rawObject["buyer_id"]?.let { json.decodeFromJsonElement<String>(it) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsPrivatePaymentMethodsAlipayDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsPrivatePaymentMethodsAlipayDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.buyerId?.let { put("buyer_id", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.transactionId?.let { put("transaction_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsPrivatePaymentMethodsAlipayDetails(block: PaymentFlowsPrivatePaymentMethodsAlipayDetails.Builder.() -> Unit): PaymentFlowsPrivatePaymentMethodsAlipayDetails = PaymentFlowsPrivatePaymentMethodsAlipayDetails.build(block)
