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
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_options_payto/properties/payment_schedule
 */
@Serializable(with = InlineMandateOptionsPaytoPaymentScheduleXba8750dc.Serializer::class)
public sealed class InlineMandateOptionsPaytoPaymentScheduleXba8750dc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `adhoc`.
   */
  public data object Adhoc : InlineMandateOptionsPaytoPaymentScheduleXba8750dc() {
    public override val `value`: String = "adhoc"
  }

  /**
   * Documented value. Wire value: `annual`.
   */
  public data object Annual : InlineMandateOptionsPaytoPaymentScheduleXba8750dc() {
    public override val `value`: String = "annual"
  }

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlineMandateOptionsPaytoPaymentScheduleXba8750dc() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `fortnightly`.
   */
  public data object Fortnightly : InlineMandateOptionsPaytoPaymentScheduleXba8750dc() {
    public override val `value`: String = "fortnightly"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineMandateOptionsPaytoPaymentScheduleXba8750dc() {
    public override val `value`: String = "monthly"
  }

  /**
   * Documented value. Wire value: `quarterly`.
   */
  public data object Quarterly : InlineMandateOptionsPaytoPaymentScheduleXba8750dc() {
    public override val `value`: String = "quarterly"
  }

  /**
   * Documented value. Wire value: `semi_annual`.
   */
  public data object SemiAnnual : InlineMandateOptionsPaytoPaymentScheduleXba8750dc() {
    public override val `value`: String = "semi_annual"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineMandateOptionsPaytoPaymentScheduleXba8750dc() {
    public override val `value`: String = "weekly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandateOptionsPaytoPaymentScheduleXba8750dc()

  public companion object {
    public fun fromValue(`value`: String): InlineMandateOptionsPaytoPaymentScheduleXba8750dc = when (value) {
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

  internal object Serializer : KSerializer<InlineMandateOptionsPaytoPaymentScheduleXba8750dc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineMandateOptionsPaytoPaymentScheduleXba8750dc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandateOptionsPaytoPaymentScheduleXba8750dc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandateOptionsPaytoPaymentScheduleXba8750dc) {
      encoder.encodeString(value.value)
    }
  }
}
