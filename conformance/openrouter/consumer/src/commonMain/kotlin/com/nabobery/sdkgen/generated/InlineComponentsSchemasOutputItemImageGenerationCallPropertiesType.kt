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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemImageGenerationCall/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputItemImageGenerationCallPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputItemImageGenerationCallPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_generation_call`.
   */
  public data object ImageGenerationCall : InlineComponentsSchemasOutputItemImageGenerationCallPropertiesType() {
    public override val `value`: String = "image_generation_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemImageGenerationCallPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemImageGenerationCallPropertiesType =
      when (value) {
      ImageGenerationCall.value -> ImageGenerationCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemImageGenerationCallPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemImageGenerationCallPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemImageGenerationCallPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputItemImageGenerationCallPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
