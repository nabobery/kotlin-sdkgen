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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityBraintrustDestination/properties/type
 */
@Serializable(with = InlineObservabilityBraintrustDestinationTypeXdc9ebcbd.Serializer::class)
public sealed class InlineObservabilityBraintrustDestinationTypeXdc9ebcbd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `braintrust`.
   */
  public data object Braintrust : InlineObservabilityBraintrustDestinationTypeXdc9ebcbd() {
    public override val `value`: String = "braintrust"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityBraintrustDestinationTypeXdc9ebcbd()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityBraintrustDestinationTypeXdc9ebcbd = when (value) {
      Braintrust.value -> Braintrust
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityBraintrustDestinationTypeXdc9ebcbd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineObservabilityBraintrustDestinationTypeXdc9ebcbd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityBraintrustDestinationTypeXdc9ebcbd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityBraintrustDestinationTypeXdc9ebcbd) {
      encoder.encodeString(value.value)
    }
  }
}
