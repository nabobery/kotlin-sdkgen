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
 * Indicates who reported the payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_attempt_record/properties/reported_by
 */
@Serializable(with = InlinePaymentAttemptRecordReportedByXb8d2c634.Serializer::class)
public sealed class InlinePaymentAttemptRecordReportedByXb8d2c634 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `self`.
   */
  public data object Self : InlinePaymentAttemptRecordReportedByXb8d2c634() {
    public override val `value`: String = "self"
  }

  /**
   * Documented value. Wire value: `stripe`.
   */
  public data object Stripe : InlinePaymentAttemptRecordReportedByXb8d2c634() {
    public override val `value`: String = "stripe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentAttemptRecordReportedByXb8d2c634()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentAttemptRecordReportedByXb8d2c634 = when (value) {
      Self.value -> Self
      Stripe.value -> Stripe
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentAttemptRecordReportedByXb8d2c634> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentAttemptRecordReportedByXb8d2c634", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentAttemptRecordReportedByXb8d2c634 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentAttemptRecordReportedByXb8d2c634) {
      encoder.encodeString(value.value)
    }
  }
}
