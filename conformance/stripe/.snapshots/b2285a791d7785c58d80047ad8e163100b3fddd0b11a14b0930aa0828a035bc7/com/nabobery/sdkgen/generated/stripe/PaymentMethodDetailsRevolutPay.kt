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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_revolut_pay
 */
@Serializable(with = PaymentMethodDetailsRevolutPay.Serializer::class)
public class PaymentMethodDetailsRevolutPay(
  public val funding: RevolutPayUnderlyingPaymentMethodFundingDetails? = null,
  /**
   * The Revolut Pay transaction ID associated with this payment.
   */
  public val transactionId: String? = null,
) {
  public class Builder {
    public var funding: RevolutPayUnderlyingPaymentMethodFundingDetails? = null

    /**
     * The Revolut Pay transaction ID associated with this payment.
     */
    public var transactionId: String? = null

    public fun build(): PaymentMethodDetailsRevolutPay = PaymentMethodDetailsRevolutPay(
      funding = funding,
      transactionId = transactionId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsRevolutPay = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsRevolutPay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsRevolutPay {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsRevolutPay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsRevolutPay must be a JSON object")
      return PaymentMethodDetailsRevolutPay(
        funding = rawObject["funding"]?.let { json.decodeFromJsonElement<RevolutPayUnderlyingPaymentMethodFundingDetails>(it) },
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsRevolutPay) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsRevolutPay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.funding?.let { put("funding", json.encodeToJsonElement(it)) }
        value.transactionId?.let { put("transaction_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsRevolutPay(block: PaymentMethodDetailsRevolutPay.Builder.() -> Unit): PaymentMethodDetailsRevolutPay = PaymentMethodDetailsRevolutPay.build(block)
