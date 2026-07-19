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
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesImageGenCallInProgressPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesImageGenCallInProgressPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.image_generation_call.in_progress`.
   */
  public data object ResponseImageGenerationCallInProgress : InlineComponentsSchemasOpenAiResponsesImageGenCallInProgressPropertiesType() {
    public override val `value`: String = "response.image_generation_call.in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesImageGenCallInProgressPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesImageGenCallInProgressPropertiesType =
      when (value) {
      ResponseImageGenerationCallInProgress.value -> ResponseImageGenerationCallInProgress
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesImageGenCallInProgressPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesImageGenCallInProgressPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesImageGenCallInProgressPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesImageGenCallInProgressPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
