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
 * Defines how the alert will behave.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/thresholds_resource_usage_threshold_config/properties/recurrence
 */
@Serializable(with = InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d.Serializer::class)
public sealed class InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `one_time`.
   */
  public data object OneTime : InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d() {
    public override val `value`: String = "one_time"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d()

  public companion object {
    public fun fromValue(`value`: String): InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d = when (value) {
      OneTime.value -> OneTime
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineThresholdsResourceUsageThresholdConfigRecurrenceXbf90c41d) {
      encoder.encodeString(value.value)
    }
  }
}
