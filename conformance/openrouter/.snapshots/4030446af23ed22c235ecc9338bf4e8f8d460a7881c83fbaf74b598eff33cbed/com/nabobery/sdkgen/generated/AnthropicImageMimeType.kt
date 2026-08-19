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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicImageMimeType.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicImageMimeType
 */
@Serializable(with = AnthropicImageMimeType.Serializer::class)
public sealed class AnthropicImageMimeType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image/jpeg`.
   */
  public data object ImageJpeg : AnthropicImageMimeType() {
    public override val `value`: String = "image/jpeg"
  }

  /**
   * Documented value. Wire value: `image/png`.
   */
  public data object ImagePng : AnthropicImageMimeType() {
    public override val `value`: String = "image/png"
  }

  /**
   * Documented value. Wire value: `image/gif`.
   */
  public data object ImageGif : AnthropicImageMimeType() {
    public override val `value`: String = "image/gif"
  }

  /**
   * Documented value. Wire value: `image/webp`.
   */
  public data object ImageWebp : AnthropicImageMimeType() {
    public override val `value`: String = "image/webp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : AnthropicImageMimeType()

  public companion object {
    public fun fromValue(`value`: String): AnthropicImageMimeType = when (value) {
      ImageJpeg.value -> ImageJpeg
      ImagePng.value -> ImagePng
      ImageGif.value -> ImageGif
      ImageWebp.value -> ImageWebp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<AnthropicImageMimeType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.AnthropicImageMimeType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): AnthropicImageMimeType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: AnthropicImageMimeType) {
      encoder.encodeString(value.value)
    }
  }
}
