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
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponsesImageGenCallPartialImagePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponsesImageGenCallPartialImagePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.image_generation_call.partial_image`.
   */
  public data object ResponseImageGenerationCallPartialImage : InlineComponentsSchemasOpenAiResponsesImageGenCallPartialImagePropertiesType() {
    public override val `value`: String = "response.image_generation_call.partial_image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponsesImageGenCallPartialImagePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponsesImageGenCallPartialImagePropertiesType = when (value) {
      ResponseImageGenerationCallPartialImage.value -> ResponseImageGenerationCallPartialImage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponsesImageGenCallPartialImagePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponsesImageGenCallPartialImagePropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponsesImageGenCallPartialImagePropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponsesImageGenCallPartialImagePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
