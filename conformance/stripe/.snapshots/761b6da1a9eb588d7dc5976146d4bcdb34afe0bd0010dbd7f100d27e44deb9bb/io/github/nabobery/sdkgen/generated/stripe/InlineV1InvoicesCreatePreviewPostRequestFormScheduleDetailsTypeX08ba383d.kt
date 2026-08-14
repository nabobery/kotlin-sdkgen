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
 * rlencoded/schema/properties/schedule_details/properties/billing_mode/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/billing_mode/properties/type
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `classic`.
   */
  public data object Classic : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d() {
    public override val `value`: String = "classic"
  }

  /**
   * Documented value. Wire value: `flexible`.
   */
  public data object Flexible : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d() {
    public override val `value`: String = "flexible"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d = when (value) {
      Classic.value -> Classic
      Flexible.value -> Flexible
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTypeX08ba383d) {
      encoder.encodeString(value.value)
    }
  }
}
