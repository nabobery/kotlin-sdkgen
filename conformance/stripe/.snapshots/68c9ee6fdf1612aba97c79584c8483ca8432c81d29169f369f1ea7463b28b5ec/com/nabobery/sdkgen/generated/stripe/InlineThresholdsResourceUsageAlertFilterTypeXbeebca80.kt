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
 * sdkgen://source/openapi.json#/components/schemas/thresholds_resource_usage_alert_filter/properties/type.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/thresholds_resource_usage_alert_filter/properties/type
 */
@Serializable(with = InlineThresholdsResourceUsageAlertFilterTypeXbeebca80.Serializer::class)
public sealed class InlineThresholdsResourceUsageAlertFilterTypeXbeebca80 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `customer`.
   */
  public data object Customer : InlineThresholdsResourceUsageAlertFilterTypeXbeebca80() {
    public override val `value`: String = "customer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineThresholdsResourceUsageAlertFilterTypeXbeebca80()

  public companion object {
    public fun fromValue(`value`: String): InlineThresholdsResourceUsageAlertFilterTypeXbeebca80 = when (value) {
      Customer.value -> Customer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineThresholdsResourceUsageAlertFilterTypeXbeebca80> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineThresholdsResourceUsageAlertFilterTypeXbeebca80", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineThresholdsResourceUsageAlertFilterTypeXbeebca80 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineThresholdsResourceUsageAlertFilterTypeXbeebca80) {
      encoder.encodeString(value.value)
    }
  }
}
