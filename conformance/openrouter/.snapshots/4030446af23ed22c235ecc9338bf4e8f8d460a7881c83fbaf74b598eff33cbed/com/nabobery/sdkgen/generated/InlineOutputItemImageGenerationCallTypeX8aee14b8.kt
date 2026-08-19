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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemImageGenerationCall/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemImageGenerationCall/properties/type
 */
@Serializable(with = InlineOutputItemImageGenerationCallTypeX8aee14b8.Serializer::class)
public sealed class InlineOutputItemImageGenerationCallTypeX8aee14b8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_generation_call`.
   */
  public data object ImageGenerationCall : InlineOutputItemImageGenerationCallTypeX8aee14b8() {
    public override val `value`: String = "image_generation_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemImageGenerationCallTypeX8aee14b8()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemImageGenerationCallTypeX8aee14b8 = when (value) {
      ImageGenerationCall.value -> ImageGenerationCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemImageGenerationCallTypeX8aee14b8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputItemImageGenerationCallTypeX8aee14b8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemImageGenerationCallTypeX8aee14b8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemImageGenerationCallTypeX8aee14b8) {
      encoder.encodeString(value.value)
    }
  }
}
