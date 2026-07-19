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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityLangsmithDestination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `langsmith`.
   */
  public data object Langsmith : InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesType() {
    public override val `value`: String = "langsmith"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesType =
      when (value) {
      Langsmith.value -> Langsmith
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityLangsmithDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
