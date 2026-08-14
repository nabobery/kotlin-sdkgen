package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_amazon_pay
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordAmazonPay.Serializer::class)
public class PaymentMethodDetailsPaymentRecordAmazonPay(
  public val funding:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAmazonPayDetailsResourceFunding? = null,
  /**
   * The Amazon Pay transaction ID associated with this payment.
   */
  public val transactionId: String? = null,
) {
  public class Builder {
    public var funding:
        PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAmazonPayDetailsResourceFunding? = null

    /**
     * The Amazon Pay transaction ID associated with this payment.
     */
    public var transactionId: String? = null

    public fun build(): PaymentMethodDetailsPaymentRecordAmazonPay = PaymentMethodDetailsPaymentRecordAmazonPay(
      funding = funding,
      transactionId = transactionId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordAmazonPay = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordAmazonPay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordAmazonPay {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordAmazonPay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordAmazonPay must be a JSON object")
      return PaymentMethodDetailsPaymentRecordAmazonPay(
        funding = rawObject["funding"]?.let { json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAmazonPayDetailsResourceFunding>(it) },
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordAmazonPay) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordAmazonPay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.funding?.let { put("funding", json.encodeToJsonElement(it)) }
        value.transactionId?.let { put("transaction_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordAmazonPay(block: PaymentMethodDetailsPaymentRecordAmazonPay.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordAmazonPay = PaymentMethodDetailsPaymentRecordAmazonPay.build(block)
