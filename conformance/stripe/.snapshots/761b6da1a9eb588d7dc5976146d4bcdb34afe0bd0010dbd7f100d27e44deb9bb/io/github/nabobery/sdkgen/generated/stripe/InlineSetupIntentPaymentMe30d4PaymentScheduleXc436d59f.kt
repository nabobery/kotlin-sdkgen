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
 * Payment schedule for the mandate.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_mandate_options_acss_debit/prope
 * rties/payment_schedule
 */
@Serializable(with = InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f.Serializer::class)
public sealed class InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `combined`.
   */
  public data object Combined : InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f() {
    public override val `value`: String = "combined"
  }

  /**
   * Documented value. Wire value: `interval`.
   */
  public data object Interval : InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f() {
    public override val `value`: String = "interval"
  }

  /**
   * Documented value. Wire value: `sporadic`.
   */
  public data object Sporadic : InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f() {
    public override val `value`: String = "sporadic"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f = when (value) {
      Combined.value -> Combined
      Interval.value -> Interval
      Sporadic.value -> Sporadic
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMe30d4PaymentScheduleXc436d59f) {
      encoder.encodeString(value.value)
    }
  }
}
