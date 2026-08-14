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
 * How frequently funds will be paid out. One of `manual` (payouts only created via API call), `daily`, `weekly`, or
 * `monthly`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_payout_schedule/properties/interval
 */
@Serializable(with = InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3.Serializer::class)
public sealed class InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `daily`.
   */
  public data object Daily : InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3() {
    public override val `value`: String = "daily"
  }

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3() {
    public override val `value`: String = "manual"
  }

  /**
   * Documented value. Wire value: `monthly`.
   */
  public data object Monthly : InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3() {
    public override val `value`: String = "monthly"
  }

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3() {
    public override val `value`: String = "weekly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3()

  public companion object {
    public fun fromValue(`value`: String): InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3 = when (value) {
      Daily.value -> Daily
      Manual.value -> Manual
      Monthly.value -> Monthly
      Weekly.value -> Weekly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBalanceSettingsResourcePayoutScheduleIntervalX89eadcc3) {
      encoder.encodeString(value.value)
    }
  }
}
