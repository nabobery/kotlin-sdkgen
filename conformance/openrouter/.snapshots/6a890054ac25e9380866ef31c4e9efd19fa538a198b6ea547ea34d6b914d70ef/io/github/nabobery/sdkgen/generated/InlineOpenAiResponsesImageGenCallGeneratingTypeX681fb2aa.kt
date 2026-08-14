package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesImageGenCallGenerating/properties/type
 */
@Serializable(with = InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa.Serializer::class)
public sealed class InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.image_generation_call.generating`.
   */
  public data object ResponseImageGenerationCallGenerating : InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa() {
    public override val `value`: String = "response.image_generation_call.generating"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa = when (value) {
      ResponseImageGenerationCallGenerating.value -> ResponseImageGenerationCallGenerating
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesImageGenCallGeneratingTypeX681fb2aa) {
      encoder.encodeString(value.value)
    }
  }
}
