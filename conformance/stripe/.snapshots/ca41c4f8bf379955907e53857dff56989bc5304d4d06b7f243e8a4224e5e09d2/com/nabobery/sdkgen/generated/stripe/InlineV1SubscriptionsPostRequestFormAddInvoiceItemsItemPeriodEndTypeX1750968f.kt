package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/add_invoice_items/items/properties/period/properties/end/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/add_invoice_items/items/properties/period/properties/end/properties/type
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `min_item_period_end`.
   */
  public data object MinItemPeriodEnd : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f() {
    public override val `value`: String = "min_item_period_end"
  }

  /**
   * Documented value. Wire value: `timestamp`.
   */
  public data object Timestamp : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f() {
    public override val `value`: String = "timestamp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f = when (value) {
      MinItemPeriodEnd.value -> MinItemPeriodEnd
      Timestamp.value -> Timestamp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPeriodEndTypeX1750968f) {
      encoder.encodeString(value.value)
    }
  }
}
