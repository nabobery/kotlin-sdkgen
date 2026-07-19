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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityGrafanaDestination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `grafana`.
   */
  public data object Grafana : InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesType() {
    public override val `value`: String = "grafana"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesType =
      when (value) {
      Grafana.value -> Grafana
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityGrafanaDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
