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
 */
@Serializable(with = InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat.Serializer::class)
public sealed class InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `png`.
   */
  public data object Png : InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat() {
    public override val `value`: String = "png"
  }

  /**
   * Documented value. Wire value: `webp`.
   */
  public data object Webp : InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat() {
    public override val `value`: String = "webp"
  }

  /**
   * Documented value. Wire value: `jpeg`.
   */
  public data object Jpeg : InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat() {
    public override val `value`: String = "jpeg"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat =
      when (value) {
      Png.value -> Png
      Webp.value -> Webp
      Jpeg.value -> Jpeg
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasImageGenerationServerToolPropertiesOutputFormat) {
      encoder.encodeString(value.value)
    }
  }
}
