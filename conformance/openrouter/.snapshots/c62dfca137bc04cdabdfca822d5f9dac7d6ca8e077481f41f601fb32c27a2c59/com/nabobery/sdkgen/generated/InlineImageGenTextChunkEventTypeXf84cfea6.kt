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
 * The event type
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenTextChunkEvent/properties/type
 */
@Serializable(with = InlineImageGenTextChunkEventTypeXf84cfea6.Serializer::class)
public sealed class InlineImageGenTextChunkEventTypeXf84cfea6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_generation.text_chunk`.
   */
  public data object ImageGenerationTextChunk : InlineImageGenTextChunkEventTypeXf84cfea6() {
    public override val `value`: String = "image_generation.text_chunk"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenTextChunkEventTypeXf84cfea6()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenTextChunkEventTypeXf84cfea6 = when (value) {
      ImageGenerationTextChunk.value -> ImageGenerationTextChunk
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenTextChunkEventTypeXf84cfea6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineImageGenTextChunkEventTypeXf84cfea6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenTextChunkEventTypeXf84cfea6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenTextChunkEventTypeXf84cfea6) {
      encoder.encodeString(value.value)
    }
  }
}
