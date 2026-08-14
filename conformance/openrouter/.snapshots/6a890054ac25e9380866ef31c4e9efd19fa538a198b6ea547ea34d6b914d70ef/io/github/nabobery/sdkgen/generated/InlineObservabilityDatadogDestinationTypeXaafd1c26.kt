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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityDatadogDestination/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityDatadogDestination/properties/type
 */
@Serializable(with = InlineObservabilityDatadogDestinationTypeXaafd1c26.Serializer::class)
public sealed class InlineObservabilityDatadogDestinationTypeXaafd1c26 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `datadog`.
   */
  public data object Datadog : InlineObservabilityDatadogDestinationTypeXaafd1c26() {
    public override val `value`: String = "datadog"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityDatadogDestinationTypeXaafd1c26()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityDatadogDestinationTypeXaafd1c26 = when (value) {
      Datadog.value -> Datadog
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityDatadogDestinationTypeXaafd1c26> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineObservabilityDatadogDestinationTypeXaafd1c26", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityDatadogDestinationTypeXaafd1c26 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityDatadogDestinationTypeXaafd1c26) {
      encoder.encodeString(value.value)
    }
  }
}
