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
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_payto/properties/payment_schedule
 */
@Serializable(with = InlineMandatePaytoPaymentScheduleX3b38629b.Serializer::class)
public sealed class InlineMandatePaytoPaymentScheduleX3b38629b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `adhoc`.
   */
  public data object Adhoc : InlineMandatePaytoPaymentScheduleX3b38629b() {
    public override val `value`: String = "adhoc"
  }

  /**
   * Documented value. Wire value: `annual`.
   */
  public data object Annual : InlineMandatePaytoPaymentScheduleX3b38629b() {
    public override val `value`: String = "annual"
  }

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlineMandatePaytoPaymentScheduleX3b38629b() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `fortnightly`.
   */
  public data object Fortnightly : InlineMandatePaytoPaymentScheduleX3b38629b() {
    public override val `value`: String = "fortnightly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineMandatePaytoPaymentScheduleX3b38629b() {
    public override val `value`: String = "monthly"
  }

  /**
   * Documented value. Wire value: `quarterly`.
   */
  public data object Quarterly : InlineMandatePaytoPaymentScheduleX3b38629b() {
    public override val `value`: String = "quarterly"
  }

  /**
   * Documented value. Wire value: `semi_annual`.
   */
  public data object SemiAnnual : InlineMandatePaytoPaymentScheduleX3b38629b() {
    public override val `value`: String = "semi_annual"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineMandatePaytoPaymentScheduleX3b38629b() {
    public override val `value`: String = "weekly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandatePaytoPaymentScheduleX3b38629b()

  public companion object {
    public fun fromValue(`value`: String): InlineMandatePaytoPaymentScheduleX3b38629b = when (value) {
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

  public object Serializer : KSerializer<InlineMandatePaytoPaymentScheduleX3b38629b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineMandatePaytoPaymentScheduleX3b38629b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandatePaytoPaymentScheduleX3b38629b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandatePaytoPaymentScheduleX3b38629b) {
      encoder.encodeString(value.value)
    }
  }
}
