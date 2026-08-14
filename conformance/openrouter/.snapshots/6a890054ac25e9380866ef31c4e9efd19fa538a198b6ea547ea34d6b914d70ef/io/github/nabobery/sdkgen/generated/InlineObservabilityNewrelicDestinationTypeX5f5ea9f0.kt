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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityNewrelicDestination/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityNewrelicDestination/properties/type
 */
@Serializable(with = InlineObservabilityNewrelicDestinationTypeX5f5ea9f0.Serializer::class)
public sealed class InlineObservabilityNewrelicDestinationTypeX5f5ea9f0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `newrelic`.
   */
  public data object Newrelic : InlineObservabilityNewrelicDestinationTypeX5f5ea9f0() {
    public override val `value`: String = "newrelic"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityNewrelicDestinationTypeX5f5ea9f0()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityNewrelicDestinationTypeX5f5ea9f0 = when (value) {
      Newrelic.value -> Newrelic
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityNewrelicDestinationTypeX5f5ea9f0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineObservabilityNewrelicDestinationTypeX5f5ea9f0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityNewrelicDestinationTypeX5f5ea9f0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityNewrelicDestinationTypeX5f5ea9f0) {
      encoder.encodeString(value.value)
    }
  }
}
