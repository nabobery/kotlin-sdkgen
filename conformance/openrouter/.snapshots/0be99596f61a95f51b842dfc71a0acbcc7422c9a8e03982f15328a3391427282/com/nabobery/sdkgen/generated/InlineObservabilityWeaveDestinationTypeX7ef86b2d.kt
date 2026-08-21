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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityWeaveDestination/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityWeaveDestination/properties/type
 */
@Serializable(with = InlineObservabilityWeaveDestinationTypeX7ef86b2d.Serializer::class)
public sealed class InlineObservabilityWeaveDestinationTypeX7ef86b2d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `weave`.
   */
  public data object Weave : InlineObservabilityWeaveDestinationTypeX7ef86b2d() {
    public override val `value`: String = "weave"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityWeaveDestinationTypeX7ef86b2d()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityWeaveDestinationTypeX7ef86b2d = when (value) {
      Weave.value -> Weave
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityWeaveDestinationTypeX7ef86b2d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineObservabilityWeaveDestinationTypeX7ef86b2d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityWeaveDestinationTypeX7ef86b2d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityWeaveDestinationTypeX7ef86b2d) {
      encoder.encodeString(value.value)
    }
  }
}
