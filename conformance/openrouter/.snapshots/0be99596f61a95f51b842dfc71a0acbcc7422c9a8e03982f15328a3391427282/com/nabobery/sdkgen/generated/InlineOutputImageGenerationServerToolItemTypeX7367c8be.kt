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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputImageGenerationServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputImageGenerationServerToolItem/properties/type
 */
@Serializable(with = InlineOutputImageGenerationServerToolItemTypeX7367c8be.Serializer::class)
public sealed class InlineOutputImageGenerationServerToolItemTypeX7367c8be {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:image_generation`.
   */
  public data object OpenrouterImageGeneration : InlineOutputImageGenerationServerToolItemTypeX7367c8be() {
    public override val `value`: String = "openrouter:image_generation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputImageGenerationServerToolItemTypeX7367c8be()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputImageGenerationServerToolItemTypeX7367c8be = when (value) {
      OpenrouterImageGeneration.value -> OpenrouterImageGeneration
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputImageGenerationServerToolItemTypeX7367c8be> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputImageGenerationServerToolItemTypeX7367c8be", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputImageGenerationServerToolItemTypeX7367c8be = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputImageGenerationServerToolItemTypeX7367c8be) {
      encoder.encodeString(value.value)
    }
  }
}
