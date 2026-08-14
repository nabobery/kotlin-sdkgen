package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/pending_invoice_item_interval/anyOf/0/properties/interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/pending_invoice_item_interval/anyOf/0/properties/interval
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `day`.
   */
  public data object Day : InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74() {
    public override val `value`: String = "day"
  }

  /**
   * Documented value. Wire value: `month`.
   */
  public data object Month : InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74() {
    public override val `value`: String = "month"
  }

  /**
   * Documented value. Wire value: `week`.
   */
  public data object Week : InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74() {
    public override val `value`: String = "week"
  }

  /**
   * Documented value. Wire value: `year`.
   */
  public data object Year : InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74() {
    public override val `value`: String = "year"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74 = when (value) {
      Day.value -> Day
      Month.value -> Month
      Week.value -> Week
      Year.value -> Year
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIne05dIntervalX1b9d1d74) {
      encoder.encodeString(value.value)
    }
  }
}
