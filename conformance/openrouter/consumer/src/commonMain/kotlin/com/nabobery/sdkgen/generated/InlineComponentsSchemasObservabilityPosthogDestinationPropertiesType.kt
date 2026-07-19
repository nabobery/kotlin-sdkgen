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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityPosthogDestination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityPosthogDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityPosthogDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `posthog`.
   */
  public data object Posthog : InlineComponentsSchemasObservabilityPosthogDestinationPropertiesType() {
    public override val `value`: String = "posthog"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityPosthogDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityPosthogDestinationPropertiesType =
      when (value) {
      Posthog.value -> Posthog
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityPosthogDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityPosthogDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityPosthogDestinationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityPosthogDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
