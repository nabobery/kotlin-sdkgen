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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/cancel_at/anyOf/2.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/cancel_at/anyOf/2
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_billed_until`.
   */
  public data object MaxBilledUntil : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b() {
    public override val `value`: String = "max_billed_until"
  }

  /**
   * Documented value. Wire value: `max_period_end`.
   */
  public data object MaxPeriodEnd : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b() {
    public override val `value`: String = "max_period_end"
  }

  /**
   * Documented value. Wire value: `min_period_end`.
   */
  public data object MinPeriodEnd : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b() {
    public override val `value`: String = "min_period_end"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b = when (value) {
      MaxBilledUntil.value -> MaxBilledUntil
      MaxPeriodEnd.value -> MaxPeriodEnd
      MinPeriodEnd.value -> MinPeriodEnd
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b) {
      encoder.encodeString(value.value)
    }
  }
}
