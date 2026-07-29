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
 * sdkgen://source/openapi.json#/components/schemas/transfer_schedule/properties/weekly_payout_days/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer_schedule/properties/weekly_payout_days/items
 */
@Serializable(with = InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e.Serializer::class)
public sealed class InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `friday`.
   */
  public data object Friday : InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e() {
    public override val `value`: String = "friday"
  }

  /**
   * Documented value. Wire value: `monday`.
   */
  public data object Monday : InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e() {
    public override val `value`: String = "monday"
  }

  /**
   * Documented value. Wire value: `thursday`.
   */
  public data object Thursday : InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e() {
    public override val `value`: String = "thursday"
  }

  /**
   * Documented value. Wire value: `tuesday`.
   */
  public data object Tuesday : InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e() {
    public override val `value`: String = "tuesday"
  }

  /**
   * Documented value. Wire value: `wednesday`.
   */
  public data object Wednesday : InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e() {
    public override val `value`: String = "wednesday"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e()

  public companion object {
    public fun fromValue(`value`: String): InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e = when (value) {
      Friday.value -> Friday
      Monday.value -> Monday
      Thursday.value -> Thursday
      Tuesday.value -> Tuesday
      Wednesday.value -> Wednesday
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTransferScheduleWeeklyPayoutDaysItemXf290ac3e) {
      encoder.encodeString(value.value)
    }
  }
}
