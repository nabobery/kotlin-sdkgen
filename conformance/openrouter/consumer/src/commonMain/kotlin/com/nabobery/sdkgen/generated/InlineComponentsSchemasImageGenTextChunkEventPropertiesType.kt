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
 */
@Serializable(with = InlineComponentsSchemasImageGenTextChunkEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasImageGenTextChunkEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_generation.text_chunk`.
   */
  public data object ImageGenerationTextChunk : InlineComponentsSchemasImageGenTextChunkEventPropertiesType() {
    public override val `value`: String = "image_generation.text_chunk"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImageGenTextChunkEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImageGenTextChunkEventPropertiesType = when (value) {
      ImageGenerationTextChunk.value -> ImageGenerationTextChunk
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenTextChunkEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImageGenTextChunkEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenTextChunkEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasImageGenTextChunkEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
