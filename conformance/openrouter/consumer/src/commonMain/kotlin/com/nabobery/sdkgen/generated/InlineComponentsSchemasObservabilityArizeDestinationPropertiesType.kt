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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityArizeDestination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityArizeDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityArizeDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `arize`.
   */
  public data object Arize : InlineComponentsSchemasObservabilityArizeDestinationPropertiesType() {
    public override val `value`: String = "arize"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityArizeDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityArizeDestinationPropertiesType =
      when (value) {
      Arize.value -> Arize
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityArizeDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityArizeDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityArizeDestinationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityArizeDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
