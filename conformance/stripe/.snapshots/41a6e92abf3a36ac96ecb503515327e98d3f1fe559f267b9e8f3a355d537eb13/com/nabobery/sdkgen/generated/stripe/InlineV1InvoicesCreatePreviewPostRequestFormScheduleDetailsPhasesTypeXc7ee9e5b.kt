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
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/automatic_tax/properties/liability/pr
 * operties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/automatic_tax/properties/liability/pr
 * operties/type
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b.Serializer::class)
public sealed class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `self`.
   */
  public data object Self : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b() {
    public override val `value`: String = "self"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b = when (value) {
      Account.value -> Account
      Self.value -> Self
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesTypeXc7ee9e5b) {
      encoder.encodeString(value.value)
    }
  }
}
