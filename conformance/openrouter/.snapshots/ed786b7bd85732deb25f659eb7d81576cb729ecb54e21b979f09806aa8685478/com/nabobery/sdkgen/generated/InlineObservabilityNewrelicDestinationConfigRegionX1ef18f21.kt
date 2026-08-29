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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityNewrelicDestination/properties/config/properties/region
 */
@Serializable(with = InlineObservabilityNewrelicDestinationConfigRegionX1ef18f21.Serializer::class)
public sealed class InlineObservabilityNewrelicDestinationConfigRegionX1ef18f21 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `us`.
   */
  public data object Us : InlineObservabilityNewrelicDestinationConfigRegionX1ef18f21() {
    public override val `value`: String = "us"
  }

  /**
   * Documented value. Wire value: `eu`.
   */
  public data object Eu : InlineObservabilityNewrelicDestinationConfigRegionX1ef18f21() {
    public override val `value`: String = "eu"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityNewrelicDestinationConfigRegionX1ef18f21()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityNewrelicDestinationConfigRegionX1ef18f21 = when (value) {
      Us.value -> Us
      Eu.value -> Eu
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityNewrelicDestinationConfigRegionX1ef18f21> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineObservabilityNewrelicDestinationConfigRegionX1ef18f21", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityNewrelicDestinationConfigRegionX1ef18f21 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityNewrelicDestinationConfigRegionX1ef18f21) {
      encoder.encodeString(value.value)
    }
  }
}
