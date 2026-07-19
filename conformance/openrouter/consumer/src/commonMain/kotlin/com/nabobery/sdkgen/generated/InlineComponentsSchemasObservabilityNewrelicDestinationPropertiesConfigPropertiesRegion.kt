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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityNewrelicDestination/properties/config/properties/region
 * .
 */
@Serializable(with = InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfigPropertiesRegion
  .Serializer::class)
public sealed class InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfigPropertiesRegion {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `us`.
   */
  public data object Us : InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfigPropertiesRegion() {
    public override val `value`: String = "us"
  }

  /**
   * Documented value. Wire value: `eu`.
   */
  public data object Eu : InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfigPropertiesRegion() {
    public override val `value`: String = "eu"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfigPropertiesRegion()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfigPropertiesRegion = when (value) {
      Us.value -> Us
      Eu.value -> Eu
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfigPropertiesRegion> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfigPropertiesRegion", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfigPropertiesRegion = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityNewrelicDestinationPropertiesConfigPropertiesRegion) {
      encoder.encodeString(value.value)
    }
  }
}
