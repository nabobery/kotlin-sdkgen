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
 * The periodicity at which payments will be collected. Defaults to `adhoc`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_mandate_options_payto/properties
 * /payment_schedule
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3.Serializer::class)
public sealed class InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `adhoc`.
   */
  public data object Adhoc : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3() {
    public override val `value`: String = "adhoc"
  }

  /**
   * Documented value. Wire value: `annual`.
   */
  public data object Annual : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3() {
    public override val `value`: String = "annual"
  }

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `fortnightly`.
   */
  public data object Fortnightly : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3() {
    public override val `value`: String = "fortnightly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3() {
    public override val `value`: String = "monthly"
  }

  /**
   * Documented value. Wire value: `quarterly`.
   */
  public data object Quarterly : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3() {
    public override val `value`: String = "quarterly"
  }

  /**
   * Documented value. Wire value: `semi_annual`.
   */
  public data object SemiAnnual : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3() {
    public override val `value`: String = "semi_annual"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3() {
    public override val `value`: String = "weekly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3 = when (value) {
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

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPaymentScheduleXaf2a90a3) {
      encoder.encodeString(value.value)
    }
  }
}
