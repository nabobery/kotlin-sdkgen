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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputModality.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputModality
 */
@Serializable(with = OutputModality.Serializer::class)
public sealed class OutputModality {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : OutputModality() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : OutputModality() {
    public override val `value`: String = "image"
  }

  /**
   * Documented value. Wire value: `embeddings`.
   */
  public data object Embeddings : OutputModality() {
    public override val `value`: String = "embeddings"
  }

  /**
   * Documented value. Wire value: `audio`.
   */
  public data object Audio : OutputModality() {
    public override val `value`: String = "audio"
  }

  /**
   * Documented value. Wire value: `video`.
   */
  public data object Video : OutputModality() {
    public override val `value`: String = "video"
  }

  /**
   * Documented value. Wire value: `rerank`.
   */
  public data object Rerank : OutputModality() {
    public override val `value`: String = "rerank"
  }

  /**
   * Documented value. Wire value: `speech`.
   */
  public data object Speech : OutputModality() {
    public override val `value`: String = "speech"
  }

  /**
   * Documented value. Wire value: `transcription`.
   */
  public data object Transcription : OutputModality() {
    public override val `value`: String = "transcription"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : OutputModality()

  public companion object {
    public fun fromValue(`value`: String): OutputModality = when (value) {
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

  internal object Serializer : KSerializer<OutputModality> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.OutputModality", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): OutputModality = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: OutputModality) {
      encoder.encodeString(value.value)
    }
  }
}
