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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.early_fraud_warning/properties/object
 */
@Serializable(with = InlineRadarEarlyFraudWarningObjectValueX813e1b3f.Serializer::class)
public sealed class InlineRadarEarlyFraudWarningObjectValueX813e1b3f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `radar.early_fraud_warning`.
   */
  public data object RadarEarlyFraudWarning : InlineRadarEarlyFraudWarningObjectValueX813e1b3f() {
    public override val `value`: String = "radar.early_fraud_warning"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRadarEarlyFraudWarningObjectValueX813e1b3f()

  public companion object {
    public fun fromValue(`value`: String): InlineRadarEarlyFraudWarningObjectValueX813e1b3f = when (value) {
      RadarEarlyFraudWarning.value -> RadarEarlyFraudWarning
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRadarEarlyFraudWarningObjectValueX813e1b3f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineRadarEarlyFraudWarningObjectValueX813e1b3f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRadarEarlyFraudWarningObjectValueX813e1b3f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRadarEarlyFraudWarningObjectValueX813e1b3f) {
      encoder.encodeString(value.value)
    }
  }
}
