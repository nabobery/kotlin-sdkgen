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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBase64ImageSource/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicBase64ImageSource/properties/type
 */
@Serializable(with = InlineAnthropicBase64ImageSourceTypeXe4e16cd8.Serializer::class)
public sealed class InlineAnthropicBase64ImageSourceTypeXe4e16cd8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `base64`.
   */
  public data object Base64 : InlineAnthropicBase64ImageSourceTypeXe4e16cd8() {
    public override val `value`: String = "base64"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicBase64ImageSourceTypeXe4e16cd8()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicBase64ImageSourceTypeXe4e16cd8 = when (value) {
      Base64.value -> Base64
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicBase64ImageSourceTypeXe4e16cd8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicBase64ImageSourceTypeXe4e16cd8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicBase64ImageSourceTypeXe4e16cd8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicBase64ImageSourceTypeXe4e16cd8) {
      encoder.encodeString(value.value)
    }
  }
}
