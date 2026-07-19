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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityOtelCollectorDestination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `otel-collector`.
   */
  public data object OtelCollector : InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesType() {
    public override val `value`: String = "otel-collector"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesType =
      when (value) {
      OtelCollector.value -> OtelCollector
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityOtelCollectorDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
