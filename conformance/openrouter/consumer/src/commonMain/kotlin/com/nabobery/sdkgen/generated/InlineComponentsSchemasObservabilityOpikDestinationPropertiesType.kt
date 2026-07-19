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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityOpikDestination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityOpikDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityOpikDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `opik`.
   */
  public data object Opik : InlineComponentsSchemasObservabilityOpikDestinationPropertiesType() {
    public override val `value`: String = "opik"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityOpikDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityOpikDestinationPropertiesType =
      when (value) {
      Opik.value -> Opik
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityOpikDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityOpikDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityOpikDestinationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityOpikDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
