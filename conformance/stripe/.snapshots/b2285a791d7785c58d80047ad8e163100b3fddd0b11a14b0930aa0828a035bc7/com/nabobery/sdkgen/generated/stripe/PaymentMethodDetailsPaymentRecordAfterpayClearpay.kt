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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_afterpay_clearpay
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordAfterpayClearpay.Serializer::class)
public class PaymentMethodDetailsPaymentRecordAfterpayClearpay(
  /**
   * The Afterpay order ID associated with this payment intent.
   */
  public val orderId: String? = null,
  /**
   * Order identifier shown to the merchant in Afterpay's online portal.
   */
  public val reference: String? = null,
) {
  public class Builder {
    /**
     * The Afterpay order ID associated with this payment intent.
     */
    public var orderId: String? = null

    /**
     * Order identifier shown to the merchant in Afterpay's online portal.
     */
    public var reference: String? = null

    public fun build(): PaymentMethodDetailsPaymentRecordAfterpayClearpay = PaymentMethodDetailsPaymentRecordAfterpayClearpay(
      orderId = orderId,
      reference = reference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordAfterpayClearpay = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordAfterpayClearpay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordAfterpayClearpay {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordAfterpayClearpay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordAfterpayClearpay must be a JSON object")
      return PaymentMethodDetailsPaymentRecordAfterpayClearpay(
        orderId = rawObject["order_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reference = rawObject["reference"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordAfterpayClearpay) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordAfterpayClearpay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.orderId?.let { put("order_id", it) }
        value.reference?.let { put("reference", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordAfterpayClearpay(block: PaymentMethodDetailsPaymentRecordAfterpayClearpay.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordAfterpayClearpay = PaymentMethodDetailsPaymentRecordAfterpayClearpay.build(block)
