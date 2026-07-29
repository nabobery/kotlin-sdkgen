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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/payouts/properties/schedule/properties/weekly_payout_days/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/payouts/properties/schedule/properties/weekly_payout_days/items
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `friday`.
   */
  public data object Friday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff() {
    public override val `value`: String = "friday"
  }

  /**
   * Documented value. Wire value: `monday`.
   */
  public data object Monday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff() {
    public override val `value`: String = "monday"
  }

  /**
   * Documented value. Wire value: `thursday`.
   */
  public data object Thursday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff() {
    public override val `value`: String = "thursday"
  }

  /**
   * Documented value. Wire value: `tuesday`.
   */
  public data object Tuesday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff() {
    public override val `value`: String = "tuesday"
  }

  /**
   * Documented value. Wire value: `wednesday`.
   */
  public data object Wednesday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff() {
    public override val `value`: String = "wednesday"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff = when (value) {
      Friday.value -> Friday
      Monday.value -> Monday
      Thursday.value -> Thursday
      Tuesday.value -> Tuesday
      Wednesday.value -> Wednesday
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleItemX6b4070ff) {
      encoder.encodeString(value.value)
    }
  }
}
