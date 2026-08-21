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
 * Indicates who reported the payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_record/properties/reported_by
 */
@Serializable(with = InlinePaymentRecordReportedByX800f0f46.Serializer::class)
public sealed class InlinePaymentRecordReportedByX800f0f46 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `self`.
   */
  public data object Self : InlinePaymentRecordReportedByX800f0f46() {
    public override val `value`: String = "self"
  }

  /**
   * Documented value. Wire value: `stripe`.
   */
  public data object Stripe : InlinePaymentRecordReportedByX800f0f46() {
    public override val `value`: String = "stripe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentRecordReportedByX800f0f46()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentRecordReportedByX800f0f46 = when (value) {
      Self.value -> Self
      Stripe.value -> Stripe
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentRecordReportedByX800f0f46> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentRecordReportedByX800f0f46", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentRecordReportedByX800f0f46 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentRecordReportedByX800f0f46) {
      encoder.encodeString(value.value)
    }
  }
}
