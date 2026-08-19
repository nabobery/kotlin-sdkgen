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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/output_format.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/output_format
 */
@Serializable(with = InlineImageGenerationServerToolOutputFormatX1680d174.Serializer::class)
public sealed class InlineImageGenerationServerToolOutputFormatX1680d174 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `png`.
   */
  public data object Png : InlineImageGenerationServerToolOutputFormatX1680d174() {
    public override val `value`: String = "png"
  }

  /**
   * Documented value. Wire value: `webp`.
   */
  public data object Webp : InlineImageGenerationServerToolOutputFormatX1680d174() {
    public override val `value`: String = "webp"
  }

  /**
   * Documented value. Wire value: `jpeg`.
   */
  public data object Jpeg : InlineImageGenerationServerToolOutputFormatX1680d174() {
    public override val `value`: String = "jpeg"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenerationServerToolOutputFormatX1680d174()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenerationServerToolOutputFormatX1680d174 = when (value) {
      Png.value -> Png
      Webp.value -> Webp
      Jpeg.value -> Jpeg
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationServerToolOutputFormatX1680d174> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineImageGenerationServerToolOutputFormatX1680d174", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenerationServerToolOutputFormatX1680d174 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationServerToolOutputFormatX1680d174) {
      encoder.encodeString(value.value)
    }
  }
}
