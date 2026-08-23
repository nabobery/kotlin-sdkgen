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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_amazon_pay
 */
@Serializable(with = PaymentMethodDetailsAmazonPay.Serializer::class)
public class PaymentMethodDetailsAmazonPay(
  public val funding: AmazonPayUnderlyingPaymentMethodFundingDetails? = null,
  /**
   * The Amazon Pay transaction ID associated with this payment.
   */
  public val transactionId: String? = null,
) {
  public class Builder {
    public var funding: AmazonPayUnderlyingPaymentMethodFundingDetails? = null

    /**
     * The Amazon Pay transaction ID associated with this payment.
     */
    public var transactionId: String? = null

    public fun build(): PaymentMethodDetailsAmazonPay = PaymentMethodDetailsAmazonPay(
      funding = funding,
      transactionId = transactionId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsAmazonPay = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsAmazonPay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsAmazonPay {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsAmazonPay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsAmazonPay must be a JSON object")
      return PaymentMethodDetailsAmazonPay(
        funding = rawObject["funding"]?.let { json.decodeFromJsonElement<AmazonPayUnderlyingPaymentMethodFundingDetails>(it) },
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsAmazonPay) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsAmazonPay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.funding?.let { put("funding", json.encodeToJsonElement(it)) }
        value.transactionId?.let { put("transaction_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsAmazonPay(block: PaymentMethodDetailsAmazonPay.Builder.() -> Unit): PaymentMethodDetailsAmazonPay = PaymentMethodDetailsAmazonPay.build(block)
