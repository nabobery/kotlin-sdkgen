package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityOpikDestination/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityOpikDestination/properties/type
 */
@Serializable(with = InlineObservabilityOpikDestinationTypeXf88b0504.Serializer::class)
public sealed class InlineObservabilityOpikDestinationTypeXf88b0504 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `opik`.
   */
  public data object Opik : InlineObservabilityOpikDestinationTypeXf88b0504() {
    public override val `value`: String = "opik"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityOpikDestinationTypeXf88b0504()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityOpikDestinationTypeXf88b0504 = when (value) {
      Opik.value -> Opik
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityOpikDestinationTypeXf88b0504> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineObservabilityOpikDestinationTypeXf88b0504", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityOpikDestinationTypeXf88b0504 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityOpikDestinationTypeXf88b0504) {
      encoder.encodeString(value.value)
    }
  }
}
