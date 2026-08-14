package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_private_card_payment_method_options_resource_restricti
 * ons
 */
@Serializable(with = PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions.Serializer::class)
public class PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions(
  brandsBlocked: List<InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c>? = null,
) {
  /**
   * The card brands to block. If a customer enters or selects a card belonging to a blocked brand, they can't complete
   * the payment.
   */
  public val brandsBlocked: List<InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c>? =
      brandsBlocked?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var brandsBlockedValue: List<InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c>?
        = null

    /**
     * The card brands to block. If a customer enters or selects a card belonging to a blocked brand, they can't
     * complete the payment.
     */
    public var brandsBlocked: List<InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c>?
      get() = brandsBlockedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        brandsBlockedValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions = PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions(
      brandsBlocked = brandsBlocked,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions must be a JSON object")
      return PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions(
        brandsBlocked = rawObject["brands_blocked"]?.let { json.decodeFromJsonElement<List<InlinePaymentPagesPrivateC800cBrandsBlockedItemX9ea0b67c>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.brandsBlocked?.let { put("brands_blocked", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions(block: PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions.Builder.() -> Unit): PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions = PaymentPagesPrivateCardPaymentMethodOptionsResourceRestrictions.build(block)
