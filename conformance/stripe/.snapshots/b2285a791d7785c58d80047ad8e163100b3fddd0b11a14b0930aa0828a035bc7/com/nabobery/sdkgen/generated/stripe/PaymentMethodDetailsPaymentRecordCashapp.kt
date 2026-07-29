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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_cashapp
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordCashapp.Serializer::class)
public class PaymentMethodDetailsPaymentRecordCashapp(
  /**
   * A unique and immutable identifier assigned by Cash App to every buyer.
   */
  public val buyerId: String? = null,
  /**
   * A public identifier for buyers using Cash App.
   */
  public val cashtag: String? = null,
  /**
   * A unique and immutable identifier of payments assigned by Cash App.
   */
  public val transactionId: String? = null,
) {
  public class Builder {
    /**
     * A unique and immutable identifier assigned by Cash App to every buyer.
     */
    public var buyerId: String? = null

    /**
     * A public identifier for buyers using Cash App.
     */
    public var cashtag: String? = null

    /**
     * A unique and immutable identifier of payments assigned by Cash App.
     */
    public var transactionId: String? = null

    public fun build(): PaymentMethodDetailsPaymentRecordCashapp = PaymentMethodDetailsPaymentRecordCashapp(
      buyerId = buyerId,
      cashtag = cashtag,
      transactionId = transactionId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordCashapp = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordCashapp> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordCashapp {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordCashapp")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsPaymentRecordCashapp must be a JSON object")
      return PaymentMethodDetailsPaymentRecordCashapp(
        buyerId = rawObject["buyer_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        cashtag = rawObject["cashtag"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsPaymentRecordCashapp) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordCashapp")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.buyerId?.let { put("buyer_id", it) }
        value.cashtag?.let { put("cashtag", it) }
        value.transactionId?.let { put("transaction_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsPaymentRecordCashapp(block: PaymentMethodDetailsPaymentRecordCashapp.Builder.() -> Unit): PaymentMethodDetailsPaymentRecordCashapp = PaymentMethodDetailsPaymentRecordCashapp.build(block)
