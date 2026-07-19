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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponsesImageGenCallCompleted/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesImageGenCallCompletedPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesImageGenCallCompletedPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.image_generation_call.completed`.
   */
  public data object ResponseImageGenerationCallCompleted : InlineComponentsSchemasOpenAiResponsesImageGenCallCompletedPropertiesType() {
    public override val `value`: String = "response.image_generation_call.completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesImageGenCallCompletedPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesImageGenCallCompletedPropertiesType =
      when (value) {
      ResponseImageGenerationCallCompleted.value -> ResponseImageGenerationCallCompleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesImageGenCallCompletedPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesImageGenCallCompletedPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesImageGenCallCompletedPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesImageGenCallCompletedPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
