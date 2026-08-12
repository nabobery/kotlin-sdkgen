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
 * sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool_OpenRouter/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageGenerationServerTool_OpenRouter/properties/type
 */
@Serializable(with = InlineImageGenerationServerToolOpenRouterTypeX37e47550.Serializer::class)
public sealed class InlineImageGenerationServerToolOpenRouterTypeX37e47550 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:image_generation`.
   */
  public data object OpenrouterImageGeneration : InlineImageGenerationServerToolOpenRouterTypeX37e47550() {
    public override val `value`: String = "openrouter:image_generation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineImageGenerationServerToolOpenRouterTypeX37e47550()

  public companion object {
    public fun fromValue(`value`: String): InlineImageGenerationServerToolOpenRouterTypeX37e47550 = when (value) {
      OpenrouterImageGeneration.value -> OpenrouterImageGeneration
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineImageGenerationServerToolOpenRouterTypeX37e47550> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineImageGenerationServerToolOpenRouterTypeX37e47550", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineImageGenerationServerToolOpenRouterTypeX37e47550 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineImageGenerationServerToolOpenRouterTypeX37e47550) {
      encoder.encodeString(value.value)
    }
  }
}
