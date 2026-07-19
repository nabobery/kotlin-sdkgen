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
@Serializable(with = InlineComponentsSchemasImageGenPartialImageEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasImageGenPartialImageEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_generation.partial_image`.
   */
  public data object ImageGenerationPartialImage : InlineComponentsSchemasImageGenPartialImageEventPropertiesType() {
    public override val `value`: String = "image_generation.partial_image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImageGenPartialImageEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImageGenPartialImageEventPropertiesType =
      when (value) {
      ImageGenerationPartialImage.value -> ImageGenerationPartialImage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenPartialImageEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImageGenPartialImageEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenPartialImageEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasImageGenPartialImageEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
