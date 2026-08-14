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
 * Resolution of the generated video
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/VideoGenerationRequest/properties/resolution
 */
@Serializable(with = InlineVideoGenerationRequestResolutionXf070699f.Serializer::class)
public sealed class InlineVideoGenerationRequestResolutionXf070699f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `480p`.
   */
  public data object _480p : InlineVideoGenerationRequestResolutionXf070699f() {
    public override val `value`: String = "480p"
  }

  /**
   * Documented value. Wire value: `720p`.
   */
  public data object _720p : InlineVideoGenerationRequestResolutionXf070699f() {
    public override val `value`: String = "720p"
  }

  /**
   * Documented value. Wire value: `1080p`.
   */
  public data object _1080p : InlineVideoGenerationRequestResolutionXf070699f() {
    public override val `value`: String = "1080p"
  }

  /**
   * Documented value. Wire value: `1K`.
   */
  public data object _1K : InlineVideoGenerationRequestResolutionXf070699f() {
    public override val `value`: String = "1K"
  }

  /**
   * Documented value. Wire value: `2K`.
   */
  public data object _2K : InlineVideoGenerationRequestResolutionXf070699f() {
    public override val `value`: String = "2K"
  }

  /**
   * Documented value. Wire value: `4K`.
   */
  public data object _4K : InlineVideoGenerationRequestResolutionXf070699f() {
    public override val `value`: String = "4K"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineVideoGenerationRequestResolutionXf070699f()

  public companion object {
    public fun fromValue(`value`: String): InlineVideoGenerationRequestResolutionXf070699f = when (value) {
      _480p.value -> _480p
      _720p.value -> _720p
      _1080p.value -> _1080p
      _1K.value -> _1K
      _2K.value -> _2K
      _4K.value -> _4K
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineVideoGenerationRequestResolutionXf070699f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineVideoGenerationRequestResolutionXf070699f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineVideoGenerationRequestResolutionXf070699f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineVideoGenerationRequestResolutionXf070699f) {
      encoder.encodeString(value.value)
    }
  }
}
