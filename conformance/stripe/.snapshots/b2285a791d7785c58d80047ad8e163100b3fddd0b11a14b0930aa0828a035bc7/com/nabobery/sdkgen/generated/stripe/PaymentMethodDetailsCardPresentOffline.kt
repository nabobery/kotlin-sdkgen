package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class PaymentMethodDetailsCardPresentOfflineView(
  @SerialName("stored_at")
  public val storedAt: Int? = null,
  public val type: InlinePaymentMethodDetailsCardPresentOfflineTypeX41dcb4b8? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_present_offline
 */
@Serializable(with = PaymentMethodDetailsCardPresentOffline.Serializer::class)
public class PaymentMethodDetailsCardPresentOffline(
  /**
   * Time at which the payment was collected while offline
   */
  public val storedAt: Int? = null,
  /**
   * The method used to process this payment method offline. Only deferred is allowed.
   */
  public val type: InlinePaymentMethodDetailsCardPresentOfflineTypeX41dcb4b8? = null,
) {
  public class Builder {
    /**
     * Time at which the payment was collected while offline
     */
    public var storedAt: Int? = null

    /**
     * The method used to process this payment method offline. Only deferred is allowed.
     */
    public var type: InlinePaymentMethodDetailsCardPresentOfflineTypeX41dcb4b8? = null

    public fun build(): PaymentMethodDetailsCardPresentOffline = PaymentMethodDetailsCardPresentOffline(
      storedAt = storedAt,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsCardPresentOffline = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentMethodDetailsCardPresentOffline> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsCardPresentOffline {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsCardPresentOffline")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsCardPresentOffline must be a JSON object")
      return PaymentMethodDetailsCardPresentOffline(
        storedAt = rawObject["stored_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsCardPresentOfflineTypeX41dcb4b8?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsCardPresentOffline) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsCardPresentOffline")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.storedAt?.let { put("stored_at", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsCardPresentOffline(block: PaymentMethodDetailsCardPresentOffline.Builder.() -> Unit): PaymentMethodDetailsCardPresentOffline = PaymentMethodDetailsCardPresentOffline.build(block)
