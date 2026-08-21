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
 * Encoding of the returned image bytes. Most models produce raster formats (png, jpeg, webp). SVG is supported by
 * vectorization models (e.g. Quiver) — the SVG markup is UTF-8 base64-encoded in `b64_json`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationRequest/properties/output_format
 */
@Serializable(with = InlineImageGenerationRequestOutputFormatXb36c99ed.Serializer::class)
public sealed class InlineImageGenerationRequestOutputFormatXb36c99ed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `png`.
   */
  public data object Png : InlineImageGenerationRequestOutputFormatXb36c99ed() {
    public override val `value`: String = "png"
  }

  /**
   * Documented value. Wire value: `jpeg`.
   */
  public data object Jpeg : InlineImageGenerationRequestOutputFormatXb36c99ed() {
    public override val `value`: String = "jpeg"
  }

  /**
   * Documented value. Wire value: `webp`.
   */
  public data object Webp : InlineImageGenerationRequestOutputFormatXb36c99ed() {
    public override val `value`: String = "webp"
  }

  /**
   * Documented value. Wire value: `svg`.
   */
  public data object Svg : InlineImageGenerationRequestOutputFormatXb36c99ed() {
    public override val `value`: String = "svg"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenerationRequestOutputFormatXb36c99ed()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenerationRequestOutputFormatXb36c99ed = when (value) {
      Png.value -> Png
      Jpeg.value -> Jpeg
      Webp.value -> Webp
      Svg.value -> Svg
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationRequestOutputFormatXb36c99ed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineImageGenerationRequestOutputFormatXb36c99ed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenerationRequestOutputFormatXb36c99ed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationRequestOutputFormatXb36c99ed) {
      encoder.encodeString(value.value)
    }
  }
}
