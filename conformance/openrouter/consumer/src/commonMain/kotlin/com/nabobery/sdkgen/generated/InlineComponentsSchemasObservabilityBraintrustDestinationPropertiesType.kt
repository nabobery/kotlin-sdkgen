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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityBraintrustDestination/properties/type.
 */
@Serializable(with = InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `braintrust`.
   */
  public data object Braintrust : InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesType() {
    public override val `value`: String = "braintrust"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesType =
      when (value) {
      Braintrust.value -> Braintrust
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityBraintrustDestinationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
