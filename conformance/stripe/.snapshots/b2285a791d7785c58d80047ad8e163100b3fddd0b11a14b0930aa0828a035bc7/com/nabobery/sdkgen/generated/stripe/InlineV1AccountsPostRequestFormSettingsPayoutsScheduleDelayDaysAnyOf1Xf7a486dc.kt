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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/payouts/properties/schedule/properties/delay_days/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/settings/properties/payouts/properties/schedule/properties/delay_days/anyOf/0
 */
@Serializable(with = InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `minimum`.
   */
  public data object Minimum : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc() {
    public override val `value`: String = "minimum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc = when (value) {
      Minimum.value -> Minimum
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormSettingsPayoutsScheduleDelayDaysAnyOf1Xf7a486dc) {
      encoder.encodeString(value.value)
    }
  }
}
