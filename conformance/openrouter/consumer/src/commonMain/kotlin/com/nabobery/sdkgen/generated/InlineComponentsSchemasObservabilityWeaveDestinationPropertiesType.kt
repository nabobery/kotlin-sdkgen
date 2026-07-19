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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityWeaveDestination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityWeaveDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityWeaveDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `weave`.
   */
  public data object Weave : InlineComponentsSchemasObservabilityWeaveDestinationPropertiesType() {
    public override val `value`: String = "weave"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityWeaveDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityWeaveDestinationPropertiesType =
      when (value) {
      Weave.value -> Weave
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityWeaveDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityWeaveDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityWeaveDestinationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityWeaveDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
