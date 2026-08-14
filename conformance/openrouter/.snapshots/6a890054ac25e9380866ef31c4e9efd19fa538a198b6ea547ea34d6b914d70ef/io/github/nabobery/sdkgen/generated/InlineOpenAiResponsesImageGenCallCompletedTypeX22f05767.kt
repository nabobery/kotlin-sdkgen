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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesImageGenCallCompleted/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesImageGenCallCompleted/properties/type
 */
@Serializable(with = InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767.Serializer::class)
public sealed class InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.image_generation_call.completed`.
   */
  public data object ResponseImageGenerationCallCompleted : InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767() {
    public override val `value`: String = "response.image_generation_call.completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767 = when (value) {
      ResponseImageGenerationCallCompleted.value -> ResponseImageGenerationCallCompleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesImageGenCallCompletedTypeX22f05767) {
      encoder.encodeString(value.value)
    }
  }
}
