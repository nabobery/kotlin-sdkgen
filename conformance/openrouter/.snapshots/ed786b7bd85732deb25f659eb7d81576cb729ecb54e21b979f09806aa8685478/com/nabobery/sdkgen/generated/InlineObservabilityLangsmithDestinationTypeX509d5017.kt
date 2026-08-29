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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityLangsmithDestination/properties/type
 */
@Serializable(with = InlineObservabilityLangsmithDestinationTypeX509d5017.Serializer::class)
public sealed class InlineObservabilityLangsmithDestinationTypeX509d5017 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `langsmith`.
   */
  public data object Langsmith : InlineObservabilityLangsmithDestinationTypeX509d5017() {
    public override val `value`: String = "langsmith"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityLangsmithDestinationTypeX509d5017()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityLangsmithDestinationTypeX509d5017 = when (value) {
      Langsmith.value -> Langsmith
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityLangsmithDestinationTypeX509d5017> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineObservabilityLangsmithDestinationTypeX509d5017", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityLangsmithDestinationTypeX509d5017 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityLangsmithDestinationTypeX509d5017) {
      encoder.encodeString(value.value)
    }
  }
}
