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
 * Customizes the types of values to include when calculating the invoice. Defaults to `next` if unspecified.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/preview_mode
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormPreviewModeXcb77da30.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormPreviewModeXcb77da30 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `next`.
   */
  public data object Next : InlineV1InvoicesCreatePreviewPostRequestFormPreviewModeXcb77da30() {
    public override val `value`: String = "next"
  }

  /**
   * Documented value. Wire value: `recurring`.
   */
  public data object Recurring : InlineV1InvoicesCreatePreviewPostRequestFormPreviewModeXcb77da30() {
    public override val `value`: String = "recurring"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormPreviewModeXcb77da30()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormPreviewModeXcb77da30 = when (value) {
      Next.value -> Next
      Recurring.value -> Recurring
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormPreviewModeXcb77da30> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormPreviewModeXcb77da30", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormPreviewModeXcb77da30 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormPreviewModeXcb77da30) {
      encoder.encodeString(value.value)
    }
  }
}
