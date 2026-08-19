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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicPlainTextSource/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicPlainTextSource/properties/type
 */
@Serializable(with = InlineAnthropicPlainTextSourceTypeX95eafc8e.Serializer::class)
public sealed class InlineAnthropicPlainTextSourceTypeX95eafc8e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineAnthropicPlainTextSourceTypeX95eafc8e() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicPlainTextSourceTypeX95eafc8e()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicPlainTextSourceTypeX95eafc8e = when (value) {
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicPlainTextSourceTypeX95eafc8e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicPlainTextSourceTypeX95eafc8e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicPlainTextSourceTypeX95eafc8e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicPlainTextSourceTypeX95eafc8e) {
      encoder.encodeString(value.value)
    }
  }
}
