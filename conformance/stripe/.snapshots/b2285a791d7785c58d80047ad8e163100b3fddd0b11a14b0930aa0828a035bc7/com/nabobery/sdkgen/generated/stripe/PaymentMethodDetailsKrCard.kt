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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_kr_card
 */
@Serializable(with = PaymentMethodDetailsKrCard.Serializer::class)
public class PaymentMethodDetailsKrCard(
  /**
   * The local credit or debit card brand.
   */
  public val brand: InlinePaymentMethodDetailsKrCardBrandX1f13668b? = null,
  /**
   * A unique identifier for the buyer as determined by the local payment processor.
   */
  public val buyerId: String? = null,
  /**
   * The last four digits of the card. This may not be present for American Express cards.
   */
  public val last4: String? = null,
  /**
   * The Korean Card transaction ID associated with this payment.
   */
  public val transactionId: String? = null,
) {
  public class Builder {
    /**
     * The local credit or debit card brand.
     */
    public var brand: InlinePaymentMethodDetailsKrCardBrandX1f13668b? = null

    /**
     * A unique identifier for the buyer as determined by the local payment processor.
     */
    public var buyerId: String? = null

    /**
     * The last four digits of the card. This may not be present for American Express cards.
     */
    public var last4: String? = null

    /**
     * The Korean Card transaction ID associated with this payment.
     */
    public var transactionId: String? = null

    public fun build(): PaymentMethodDetailsKrCard = PaymentMethodDetailsKrCard(
      brand = brand,
      buyerId = buyerId,
      last4 = last4,
      transactionId = transactionId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsKrCard = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsKrCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsKrCard {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsKrCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsKrCard must be a JSON object")
      return PaymentMethodDetailsKrCard(
        brand = rawObject["brand"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsKrCardBrandX1f13668b?>(element) },
        buyerId = rawObject["buyer_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        transactionId = rawObject["transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsKrCard) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsKrCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.brand?.let { put("brand", json.encodeToJsonElement(it)) }
        value.buyerId?.let { put("buyer_id", it) }
        value.last4?.let { put("last4", it) }
        value.transactionId?.let { put("transaction_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsKrCard(block: PaymentMethodDetailsKrCard.Builder.() -> Unit): PaymentMethodDetailsKrCard = PaymentMethodDetailsKrCard.build(block)
