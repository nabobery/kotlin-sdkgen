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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ImageOutputModality.
 */
@Serializable(with = ImageOutputModality.Serializer::class)
public sealed class ImageOutputModality {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : ImageOutputModality() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : ImageOutputModality() {
    public override val `value`: String = "image"
  }

  /**
   * Documented value. Wire value: `embeddings`.
   */
  public data object Embeddings : ImageOutputModality() {
    public override val `value`: String = "embeddings"
  }

  /**
   * Documented value. Wire value: `audio`.
   */
  public data object Audio : ImageOutputModality() {
    public override val `value`: String = "audio"
  }

  /**
   * Documented value. Wire value: `video`.
   */
  public data object Video : ImageOutputModality() {
    public override val `value`: String = "video"
  }

  /**
   * Documented value. Wire value: `rerank`.
   */
  public data object Rerank : ImageOutputModality() {
    public override val `value`: String = "rerank"
  }

  /**
   * Documented value. Wire value: `speech`.
   */
  public data object Speech : ImageOutputModality() {
    public override val `value`: String = "speech"
  }

  /**
   * Documented value. Wire value: `transcription`.
   */
  public data object Transcription : ImageOutputModality() {
    public override val `value`: String = "transcription"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ImageOutputModality()

  public companion object {
    public fun fromValue(`value`: String): ImageOutputModality = when (value) {
      Text.value -> Text
      Image.value -> Image
      Embeddings.value -> Embeddings
      Audio.value -> Audio
      Video.value -> Video
      Rerank.value -> Rerank
      Speech.value -> Speech
      Transcription.value -> Transcription
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<ImageOutputModality> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ImageOutputModality", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ImageOutputModality = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ImageOutputModality) {
      encoder.encodeString(value.value)
    }
  }
}
