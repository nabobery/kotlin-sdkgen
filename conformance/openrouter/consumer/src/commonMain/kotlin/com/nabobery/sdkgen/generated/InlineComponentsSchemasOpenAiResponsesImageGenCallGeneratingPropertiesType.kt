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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesImageGenCallGenerating/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesImageGenCallGeneratingPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesImageGenCallGeneratingPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.image_generation_call.generating`.
   */
  public data object ResponseImageGenerationCallGenerating : InlineComponentsSchemasOpenAiResponsesImageGenCallGeneratingPropertiesType() {
    public override val `value`: String = "response.image_generation_call.generating"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesImageGenCallGeneratingPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesImageGenCallGeneratingPropertiesType =
      when (value) {
      ResponseImageGenerationCallGenerating.value -> ResponseImageGenerationCallGenerating
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesImageGenCallGeneratingPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesImageGenCallGeneratingPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesImageGenCallGeneratingPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesImageGenCallGeneratingPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
