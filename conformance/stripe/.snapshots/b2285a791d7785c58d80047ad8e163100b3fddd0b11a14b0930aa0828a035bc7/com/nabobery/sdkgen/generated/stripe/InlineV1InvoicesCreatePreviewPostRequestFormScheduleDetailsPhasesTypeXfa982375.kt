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
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/add_invoice_items/items/properties/pe
 * riod/properties/end/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/add_invoice_items/items/properties/pe
 * riod/properties/end/properties/type
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXfa982375.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXfa982375 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `min_item_period_end`.
   */
  public data object MinItemPeriodEnd : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXfa982375() {
    public override val `value`: String = "min_item_period_end"
  }

  /**
   * Documented value. Wire value: `phase_end`.
   */
  public data object PhaseEnd : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXfa982375() {
    public override val `value`: String = "phase_end"
  }

  /**
   * Documented value. Wire value: `timestamp`.
   */
  public data object Timestamp : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXfa982375() {
    public override val `value`: String = "timestamp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXfa982375()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXfa982375 = when (value) {
      MinItemPeriodEnd.value -> MinItemPeriodEnd
      PhaseEnd.value -> PhaseEnd
      Timestamp.value -> Timestamp
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXfa982375> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXfa982375", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXfa982375 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXfa982375) {
      encoder.encodeString(value.value)
    }
  }
}
