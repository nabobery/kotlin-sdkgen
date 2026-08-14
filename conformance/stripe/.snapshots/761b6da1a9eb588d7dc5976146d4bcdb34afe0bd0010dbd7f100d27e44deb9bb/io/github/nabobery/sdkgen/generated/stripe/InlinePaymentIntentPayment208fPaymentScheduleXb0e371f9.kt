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
 * The periodicity at which payments will be collected. Defaults to `adhoc`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_mandate_options_payto/properti
 * es/payment_schedule
 */
@Serializable(with = InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9.Serializer::class)
public sealed class InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `adhoc`.
   */
  public data object Adhoc : InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9() {
    public override val `value`: String = "adhoc"
  }

  /**
   * Documented value. Wire value: `annual`.
   */
  public data object Annual : InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9() {
    public override val `value`: String = "annual"
  }

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `fortnightly`.
   */
  public data object Fortnightly : InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9() {
    public override val `value`: String = "fortnightly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9() {
    public override val `value`: String = "monthly"
  }

  /**
   * Documented value. Wire value: `quarterly`.
   */
  public data object Quarterly : InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9() {
    public override val `value`: String = "quarterly"
  }

  /**
   * Documented value. Wire value: `semi_annual`.
   */
  public data object SemiAnnual : InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9() {
    public override val `value`: String = "semi_annual"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9() {
    public override val `value`: String = "weekly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9 = when (value) {
      Adhoc.value -> Adhoc
      Annual.value -> Annual
      Daily.value -> Daily
      Fortnightly.value -> Fortnightly
      Monthly.value -> Monthly
      Quarterly.value -> Quarterly
      SemiAnnual.value -> SemiAnnual
      Weekly.value -> Weekly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPayment208fPaymentScheduleXb0e371f9) {
      encoder.encodeString(value.value)
    }
  }
}
