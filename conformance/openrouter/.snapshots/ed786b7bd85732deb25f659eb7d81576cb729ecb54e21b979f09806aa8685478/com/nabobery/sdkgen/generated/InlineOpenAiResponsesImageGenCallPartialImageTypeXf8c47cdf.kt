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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesImageGenCallPartialImage/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesImageGenCallPartialImage/properties/type
 */
@Serializable(with = InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf.Serializer::class)
public sealed class InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.image_generation_call.partial_image`.
   */
  public data object ResponseImageGenerationCallPartialImage : InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf() {
    public override val `value`: String = "response.image_generation_call.partial_image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf = when (value) {
      ResponseImageGenerationCallPartialImage.value -> ResponseImageGenerationCallPartialImage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesImageGenCallPartialImageTypeXf8c47cdf) {
      encoder.encodeString(value.value)
    }
  }
}
