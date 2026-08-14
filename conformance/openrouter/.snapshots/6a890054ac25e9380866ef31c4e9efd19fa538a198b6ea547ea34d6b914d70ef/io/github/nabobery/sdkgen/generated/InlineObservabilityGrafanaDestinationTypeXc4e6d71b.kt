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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityGrafanaDestination/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityGrafanaDestination/properties/type
 */
@Serializable(with = InlineObservabilityGrafanaDestinationTypeXc4e6d71b.Serializer::class)
public sealed class InlineObservabilityGrafanaDestinationTypeXc4e6d71b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `grafana`.
   */
  public data object Grafana : InlineObservabilityGrafanaDestinationTypeXc4e6d71b() {
    public override val `value`: String = "grafana"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityGrafanaDestinationTypeXc4e6d71b()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityGrafanaDestinationTypeXc4e6d71b = when (value) {
      Grafana.value -> Grafana
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityGrafanaDestinationTypeXc4e6d71b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineObservabilityGrafanaDestinationTypeXc4e6d71b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityGrafanaDestinationTypeXc4e6d71b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityGrafanaDestinationTypeXc4e6d71b) {
      encoder.encodeString(value.value)
    }
  }
}
