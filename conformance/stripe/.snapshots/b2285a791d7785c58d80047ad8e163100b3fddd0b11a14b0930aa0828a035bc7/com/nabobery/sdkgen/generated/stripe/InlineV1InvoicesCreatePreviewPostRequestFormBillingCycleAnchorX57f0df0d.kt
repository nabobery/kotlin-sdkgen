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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/billing_cycle_anchor.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/billing_cycle_anchor
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX57f0df0d.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX57f0df0d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX57f0df0d() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `phase_start`.
   */
  public data object PhaseStart : InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX57f0df0d() {
    public override val `value`: String = "phase_start"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX57f0df0d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX57f0df0d = when (value) {
      Automatic.value -> Automatic
      PhaseStart.value -> PhaseStart
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX57f0df0d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX57f0df0d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX57f0df0d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX57f0df0d) {
      encoder.encodeString(value.value)
    }
  }
}
