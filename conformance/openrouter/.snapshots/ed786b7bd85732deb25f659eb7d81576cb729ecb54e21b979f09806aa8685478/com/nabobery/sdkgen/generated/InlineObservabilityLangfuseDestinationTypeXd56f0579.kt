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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityLangfuseDestination/properties/type
 */
@Serializable(with = InlineObservabilityLangfuseDestinationTypeXd56f0579.Serializer::class)
public sealed class InlineObservabilityLangfuseDestinationTypeXd56f0579 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `langfuse`.
   */
  public data object Langfuse : InlineObservabilityLangfuseDestinationTypeXd56f0579() {
    public override val `value`: String = "langfuse"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityLangfuseDestinationTypeXd56f0579()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityLangfuseDestinationTypeXd56f0579 = when (value) {
      Langfuse.value -> Langfuse
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityLangfuseDestinationTypeXd56f0579> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineObservabilityLangfuseDestinationTypeXd56f0579", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityLangfuseDestinationTypeXd56f0579 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityLangfuseDestinationTypeXd56f0579) {
      encoder.encodeString(value.value)
    }
  }
}
