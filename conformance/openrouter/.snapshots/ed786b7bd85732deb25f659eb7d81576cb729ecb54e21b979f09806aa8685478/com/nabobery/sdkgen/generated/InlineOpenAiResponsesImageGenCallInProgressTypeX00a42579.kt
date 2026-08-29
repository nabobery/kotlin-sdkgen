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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesImageGenCallInProgress/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesImageGenCallInProgress/properties/type
 */
@Serializable(with = InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579.Serializer::class)
public sealed class InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.image_generation_call.in_progress`.
   */
  public data object ResponseImageGenerationCallInProgress : InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579() {
    public override val `value`: String = "response.image_generation_call.in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579 = when (value) {
      ResponseImageGenerationCallInProgress.value -> ResponseImageGenerationCallInProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponsesImageGenCallInProgressTypeX00a42579) {
      encoder.encodeString(value.value)
    }
  }
}
