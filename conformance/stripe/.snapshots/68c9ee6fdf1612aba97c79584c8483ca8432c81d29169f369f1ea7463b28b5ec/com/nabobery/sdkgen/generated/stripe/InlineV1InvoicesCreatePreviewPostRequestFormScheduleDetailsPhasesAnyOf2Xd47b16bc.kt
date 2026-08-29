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
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/trial_end/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/trial_end/anyOf/1
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd47b16bc.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd47b16bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `now`.
   */
  public data object Now : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd47b16bc() {
    public override val `value`: String = "now"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd47b16bc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd47b16bc = when (value) {
      Now.value -> Now
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd47b16bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd47b16bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd47b16bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd47b16bc) {
      encoder.encodeString(value.value)
    }
  }
}
