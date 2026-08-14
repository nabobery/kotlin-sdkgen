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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool/properties/type
 */
@Serializable(with = InlineImageGenerationServerToolTypeX17e7461f.Serializer::class)
public sealed class InlineImageGenerationServerToolTypeX17e7461f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_generation`.
   */
  public data object ImageGeneration : InlineImageGenerationServerToolTypeX17e7461f() {
    public override val `value`: String = "image_generation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenerationServerToolTypeX17e7461f()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenerationServerToolTypeX17e7461f = when (value) {
      ImageGeneration.value -> ImageGeneration
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationServerToolTypeX17e7461f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineImageGenerationServerToolTypeX17e7461f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenerationServerToolTypeX17e7461f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationServerToolTypeX17e7461f) {
      encoder.encodeString(value.value)
    }
  }
}
