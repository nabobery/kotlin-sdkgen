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
 * Payment schedule for the mandate.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_mandate_options_acss_debit/pro
 * perties/payment_schedule
 */
@Serializable(with = InlinePaymentIntentPayment6e62PaymentScheduleX9087db06.Serializer::class)
public sealed class InlinePaymentIntentPayment6e62PaymentScheduleX9087db06 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `combined`.
   */
  public data object Combined : InlinePaymentIntentPayment6e62PaymentScheduleX9087db06() {
    public override val `value`: String = "combined"
  }

  /**
   * Documented value. Wire value: `interval`.
   */
  public data object Interval : InlinePaymentIntentPayment6e62PaymentScheduleX9087db06() {
    public override val `value`: String = "interval"
  }

  /**
   * Documented value. Wire value: `sporadic`.
   */
  public data object Sporadic : InlinePaymentIntentPayment6e62PaymentScheduleX9087db06() {
    public override val `value`: String = "sporadic"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentPayment6e62PaymentScheduleX9087db06()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentPayment6e62PaymentScheduleX9087db06 = when (value) {
      Combined.value -> Combined
      Interval.value -> Interval
      Sporadic.value -> Sporadic
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentPayment6e62PaymentScheduleX9087db06> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPayment6e62PaymentScheduleX9087db06", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPayment6e62PaymentScheduleX9087db06 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPayment6e62PaymentScheduleX9087db06) {
      encoder.encodeString(value.value)
    }
  }
}
