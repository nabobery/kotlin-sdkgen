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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicPlainTextSource/properties/media_type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicPlainTextSource/properties/media_type
 */
@Serializable(with = InlineAnthropicPlainTextSourceMediaTypeXdcddf07d.Serializer::class)
public sealed class InlineAnthropicPlainTextSourceMediaTypeXdcddf07d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text/plain`.
   */
  public data object TextPlain : InlineAnthropicPlainTextSourceMediaTypeXdcddf07d() {
    public override val `value`: String = "text/plain"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicPlainTextSourceMediaTypeXdcddf07d()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicPlainTextSourceMediaTypeXdcddf07d = when (value) {
      TextPlain.value -> TextPlain
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicPlainTextSourceMediaTypeXdcddf07d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicPlainTextSourceMediaTypeXdcddf07d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicPlainTextSourceMediaTypeXdcddf07d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicPlainTextSourceMediaTypeXdcddf07d) {
      encoder.encodeString(value.value)
    }
  }
}
