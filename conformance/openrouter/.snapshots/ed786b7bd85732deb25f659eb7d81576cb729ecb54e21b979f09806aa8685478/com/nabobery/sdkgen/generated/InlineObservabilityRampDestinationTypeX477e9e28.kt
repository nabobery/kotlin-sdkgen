package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityRampDestination/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityRampDestination/properties/type
 */
@Serializable(with = InlineObservabilityRampDestinationTypeX477e9e28.Serializer::class)
public sealed class InlineObservabilityRampDestinationTypeX477e9e28 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ramp`.
   */
  public data object Ramp : InlineObservabilityRampDestinationTypeX477e9e28() {
    public override val `value`: String = "ramp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityRampDestinationTypeX477e9e28()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityRampDestinationTypeX477e9e28 = when (value) {
      Ramp.value -> Ramp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityRampDestinationTypeX477e9e28> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineObservabilityRampDestinationTypeX477e9e28", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityRampDestinationTypeX477e9e28 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityRampDestinationTypeX477e9e28) {
      encoder.encodeString(value.value)
    }
  }
}
