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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_naver_pay
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordNaverPay.Serializer::class)
public class PaymentMethodDetailsPaymentRecordNaverPay(
  /**
   * A unique identifier for the buyer as determined by the local payment processor.
   */
  public val buyerId: String? = null,
  /**
   * The Naver Pay transaction ID associated with this payment.
   */
  public val transactionId: String? = null,
) {
  public class Builder {
    /**
     * A unique identifier for the buyer as determined by the local payment processor.
     */
    public var buyerId: String? = null

    /**
     * The Naver Pay transaction ID associated with this payment.
     */
    public var transactionId: String? = null

    public fun build(): PaymentMethodDetailsPaymentRecordNaverPay = PaymentMethodDetailsPaymentRecordNaverPay(
      buyerId = buyerId,
      transactionId = transactionId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordNaverPay = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordNaverPay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordNaverPay {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordNaverPay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordNaverPay must be a JSON object")
      return PaymentMethodDetailsPaymentRecordNaverPay(
        buyerId = rawObject["buyer_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordNaverPay) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordNaverPay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.buyerId?.let { put("buyer_id", it) }
        value.transactionId?.let { put("transaction_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordNaverPay(block: PaymentMethodDetailsPaymentRecordNaverPay.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordNaverPay = PaymentMethodDetailsPaymentRecordNaverPay.build(block)
