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
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/add_invoice_items/items/properties/pr
 * ice_data/properties/tax_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/add_invoice_items/items/properties/pr
 * ice_data/properties/tax_behavior
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxBehaviorXd8426dce.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxBehaviorXd8426dce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxBehaviorXd8426dce() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxBehaviorXd8426dce() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxBehaviorXd8426dce() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxBehaviorXd8426dce()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxBehaviorXd8426dce = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxBehaviorXd8426dce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxBehaviorXd8426dce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxBehaviorXd8426dce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxBehaviorXd8426dce) {
      encoder.encodeString(value.value)
    }
  }
}
