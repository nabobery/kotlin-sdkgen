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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityDatadogDestination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityDatadogDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityDatadogDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `datadog`.
   */
  public data object Datadog : InlineComponentsSchemasObservabilityDatadogDestinationPropertiesType() {
    public override val `value`: String = "datadog"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityDatadogDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityDatadogDestinationPropertiesType =
      when (value) {
      Datadog.value -> Datadog
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityDatadogDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityDatadogDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityDatadogDestinationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityDatadogDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
