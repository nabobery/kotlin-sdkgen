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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ImageInputModality.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageInputModality
 */
@Serializable(with = ImageInputModality.Serializer::class)
public sealed class ImageInputModality {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : ImageInputModality() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : ImageInputModality() {
    public override val `value`: String = "image"
  }

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : ImageInputModality() {
    public override val `value`: String = "file"
  }

  /**
   * Documented value. Wire value: `audio`.
   */
  public data object Audio : ImageInputModality() {
    public override val `value`: String = "audio"
  }

  /**
   * Documented value. Wire value: `video`.
   */
  public data object Video : ImageInputModality() {
    public override val `value`: String = "video"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ImageInputModality()

  public companion object {
    public fun fromValue(`value`: String): ImageInputModality = when (value) {
      Text.value -> Text
      Image.value -> Image
      File.value -> File
      Audio.value -> Audio
      Video.value -> Video
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ImageInputModality> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ImageInputModality", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ImageInputModality = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ImageInputModality) {
      encoder.encodeString(value.value)
    }
  }
}
