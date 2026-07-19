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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityLangfuseDestination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `langfuse`.
   */
  public data object Langfuse : InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesType() {
    public override val `value`: String = "langfuse"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesType =
      when (value) {
      Langfuse.value -> Langfuse
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityLangfuseDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
