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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicImageBlockParam/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicImageBlockParam/properties/type
 */
@Serializable(with = InlineAnthropicImageBlockParamTypeXf6b1b5ef.Serializer::class)
public sealed class InlineAnthropicImageBlockParamTypeXf6b1b5ef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineAnthropicImageBlockParamTypeXf6b1b5ef() {
    public override val `value`: String = "image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicImageBlockParamTypeXf6b1b5ef()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicImageBlockParamTypeXf6b1b5ef = when (value) {
      Image.value -> Image
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicImageBlockParamTypeXf6b1b5ef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicImageBlockParamTypeXf6b1b5ef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicImageBlockParamTypeXf6b1b5ef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicImageBlockParamTypeXf6b1b5ef) {
      encoder.encodeString(value.value)
    }
  }
}
