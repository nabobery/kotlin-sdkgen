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
 * Specifies invoicing frequency. Either `day`, `week`, `month` or `year`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_pending_invoice_item_interval/properties/interval
 */
@Serializable(with = InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5.Serializer::class)
public sealed class InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5 = when (value) {
      Day.value -> Day
      Month.value -> Month
      Week.value -> Week
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionPendingInvoiceItemIntervalIntervalX4842f3a5) {
      encoder.encodeString(value.value)
    }
  }
}
