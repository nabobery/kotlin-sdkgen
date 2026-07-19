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
 * Type of API used for the generation
 */
@Serializable(with = InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType.Serializer::class)
public sealed class InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completions`.
   */
  public data object Completions : InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType() {
    public override val `value`: String = "completions"
  }

  /**
   * Documented value. Wire value: `embeddings`.
   */
  public data object Embeddings : InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType() {
    public override val `value`: String = "embeddings"
  }

  /**
   * Documented value. Wire value: `rerank`.
   */
  public data object Rerank : InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType() {
    public override val `value`: String = "rerank"
  }

  /**
   * Documented value. Wire value: `tts`.
   */
  public data object Tts : InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType() {
    public override val `value`: String = "tts"
  }

  /**
   * Documented value. Wire value: `stt`.
   */
  public data object Stt : InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType() {
    public override val `value`: String = "stt"
  }

  /**
   * Documented value. Wire value: `video`.
   */
  public data object Video : InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType() {
    public override val `value`: String = "video"
  }

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType() {
    public override val `value`: String = "image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType =
      when (value) {
      Completions.value -> Completions
      Embeddings.value -> Embeddings
      Rerank.value -> Rerank
      Tts.value -> Tts
      Stt.value -> Stt
      Video.value -> Video
      Image.value -> Image
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasGenerationResponsePropertiesDataPropertiesApiType) {
      encoder.encodeString(value.value)
    }
  }
}
