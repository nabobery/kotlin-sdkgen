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
 * rlencoded/schema/properties/schedule_details/properties/end_behavior.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/end_behavior
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndBehaviorXdf1f62c5.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndBehaviorXdf1f62c5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cancel`.
   */
  public data object Cancel : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndBehaviorXdf1f62c5() {
    public override val `value`: String = "cancel"
  }

  /**
   * Documented value. Wire value: `release`.
   */
  public data object Release : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndBehaviorXdf1f62c5() {
    public override val `value`: String = "release"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndBehaviorXdf1f62c5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndBehaviorXdf1f62c5 = when (value) {
      Cancel.value -> Cancel
      Release.value -> Release
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndBehaviorXdf1f62c5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndBehaviorXdf1f62c5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndBehaviorXdf1f62c5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndBehaviorXdf1f62c5) {
      encoder.encodeString(value.value)
    }
  }
}
