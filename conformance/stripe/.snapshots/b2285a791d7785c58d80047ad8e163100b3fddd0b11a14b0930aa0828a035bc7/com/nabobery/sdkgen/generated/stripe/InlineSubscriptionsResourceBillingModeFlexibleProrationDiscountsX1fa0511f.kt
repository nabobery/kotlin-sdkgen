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
 * Controls how invoices and invoice items display proration amounts and discount amounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_mode_flexible/properties/proration_di
 * scounts
 */
@Serializable(with = InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f.Serializer::class)
public sealed class InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `included`.
   */
  public data object Included : InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f() {
    public override val `value`: String = "included"
  }

  /**
   * Documented value. Wire value: `itemized`.
   */
  public data object Itemized : InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f() {
    public override val `value`: String = "itemized"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f = when (value) {
      Included.value -> Included
      Itemized.value -> Itemized
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourceBillingModeFlexibleProrationDiscountsX1fa0511f) {
      encoder.encodeString(value.value)
    }
  }
}
