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
 */
@Serializable(with = InlineComponentsSchemasObservabilityRampDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityRampDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ramp`.
   */
  public data object Ramp : InlineComponentsSchemasObservabilityRampDestinationPropertiesType() {
    public override val `value`: String = "ramp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityRampDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityRampDestinationPropertiesType =
      when (value) {
      Ramp.value -> Ramp
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityRampDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityRampDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityRampDestinationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityRampDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
