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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_kr_card
 */
@Serializable(with = PaymentMethodKrCard.Serializer::class)
public class PaymentMethodKrCard(
  /**
   * The local credit or debit card brand.
   */
  public val brand: InlinePaymentMethodKrCardBrandXc47ee754? = null,
  /**
   * The last four digits of the card. This may not be present for American Express cards.
   */
  public val last4: String? = null,
) {
  public class Builder {
    /**
     * The local credit or debit card brand.
     */
    public var brand: InlinePaymentMethodKrCardBrandXc47ee754? = null

    /**
     * The last four digits of the card. This may not be present for American Express cards.
     */
    public var last4: String? = null

    public fun build(): PaymentMethodKrCard = PaymentMethodKrCard(
      brand = brand,
      last4 = last4,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodKrCard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodKrCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodKrCard {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodKrCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodKrCard must be a JSON object")
      return PaymentMethodKrCard(
        brand = rawObject["brand"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodKrCardBrandXc47ee754?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodKrCard) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodKrCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.brand?.let { put("brand", json.encodeToJsonElement(it)) }
        value.last4?.let { put("last4", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodKrCard(block: PaymentMethodKrCard.Builder.() -> Unit): PaymentMethodKrCard = PaymentMethodKrCard.build(block)
