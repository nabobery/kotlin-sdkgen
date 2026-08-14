package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GenerationResponse/properties/data/properties/api_type
 */
@Serializable(with = InlineGenerationResponseDataApiTypeX6ac55b17.Serializer::class)
public sealed class InlineGenerationResponseDataApiTypeX6ac55b17 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completions`.
   */
  public data object Completions : InlineGenerationResponseDataApiTypeX6ac55b17() {
    public override val `value`: String = "completions"
  }

  /**
   * Documented value. Wire value: `embeddings`.
   */
  public data object Embeddings : InlineGenerationResponseDataApiTypeX6ac55b17() {
    public override val `value`: String = "embeddings"
  }

  /**
   * Documented value. Wire value: `rerank`.
   */
  public data object Rerank : InlineGenerationResponseDataApiTypeX6ac55b17() {
    public override val `value`: String = "rerank"
  }

  /**
   * Documented value. Wire value: `tts`.
   */
  public data object Tts : InlineGenerationResponseDataApiTypeX6ac55b17() {
    public override val `value`: String = "tts"
  }

  /**
   * Documented value. Wire value: `stt`.
   */
  public data object Stt : InlineGenerationResponseDataApiTypeX6ac55b17() {
    public override val `value`: String = "stt"
  }

  /**
   * Documented value. Wire value: `video`.
   */
  public data object Video : InlineGenerationResponseDataApiTypeX6ac55b17() {
    public override val `value`: String = "video"
  }

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineGenerationResponseDataApiTypeX6ac55b17() {
    public override val `value`: String = "image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGenerationResponseDataApiTypeX6ac55b17()

  public companion object {
    public fun fromValue(`value`: String): InlineGenerationResponseDataApiTypeX6ac55b17 = when (value) {
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

  internal object Serializer : KSerializer<InlineGenerationResponseDataApiTypeX6ac55b17> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineGenerationResponseDataApiTypeX6ac55b17", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGenerationResponseDataApiTypeX6ac55b17 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGenerationResponseDataApiTypeX6ac55b17) {
      encoder.encodeString(value.value)
    }
  }
}
