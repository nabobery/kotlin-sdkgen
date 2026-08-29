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
 * oded/schema/properties/settings/properties/payouts/properties/schedule/properties/weekly_anchor.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/settings/properties/payouts/properties/schedule/properties/weekly_anchor
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `friday`.
   */
  public data object Friday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf() {
    public override val `value`: String = "friday"
  }

  /**
   * Documented value. Wire value: `monday`.
   */
  public data object Monday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf() {
    public override val `value`: String = "monday"
  }

  /**
   * Documented value. Wire value: `saturday`.
   */
  public data object Saturday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf() {
    public override val `value`: String = "saturday"
  }

  /**
   * Documented value. Wire value: `sunday`.
   */
  public data object Sunday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf() {
    public override val `value`: String = "sunday"
  }

  /**
   * Documented value. Wire value: `thursday`.
   */
  public data object Thursday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf() {
    public override val `value`: String = "thursday"
  }

  /**
   * Documented value. Wire value: `tuesday`.
   */
  public data object Tuesday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf() {
    public override val `value`: String = "tuesday"
  }

  /**
   * Documented value. Wire value: `wednesday`.
   */
  public data object Wednesday : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf() {
    public override val `value`: String = "wednesday"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf = when (value) {
      Friday.value -> Friday
      Monday.value -> Monday
      Saturday.value -> Saturday
      Sunday.value -> Sunday
      Thursday.value -> Thursday
      Tuesday.value -> Tuesday
      Wednesday.value -> Wednesday
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleWeeklyAnchorX380a87bf) {
      encoder.encodeString(value.value)
    }
  }
}
