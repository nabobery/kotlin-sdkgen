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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_sunbit
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordSunbit.Serializer::class)
public class PaymentMethodDetailsPaymentRecordSunbit(
  /**
   * The Sunbit transaction ID associated with this payment.
   */
  public val transactionId: String? = null,
) {
  public class Builder {
    /**
     * The Sunbit transaction ID associated with this payment.
     */
    public var transactionId: String? = null

    public fun build(): PaymentMethodDetailsPaymentRecordSunbit = PaymentMethodDetailsPaymentRecordSunbit(
      transactionId = transactionId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordSunbit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordSunbit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordSunbit {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordSunbit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordSunbit must be a JSON object")
      return PaymentMethodDetailsPaymentRecordSunbit(
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordSunbit) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordSunbit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.transactionId?.let { put("transaction_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordSunbit(block: PaymentMethodDetailsPaymentRecordSunbit.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordSunbit = PaymentMethodDetailsPaymentRecordSunbit.build(block)
