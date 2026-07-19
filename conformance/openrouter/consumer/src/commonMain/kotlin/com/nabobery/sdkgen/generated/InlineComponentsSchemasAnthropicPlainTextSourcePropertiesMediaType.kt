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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicPlainTextSource/properties/media_type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicPlainTextSourcePropertiesMediaType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicPlainTextSourcePropertiesMediaType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text/plain`.
   */
  public data object TextPlain : InlineComponentsSchemasAnthropicPlainTextSourcePropertiesMediaType() {
    public override val `value`: String = "text/plain"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicPlainTextSourcePropertiesMediaType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicPlainTextSourcePropertiesMediaType =
      when (value) {
      TextPlain.value -> TextPlain
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicPlainTextSourcePropertiesMediaType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicPlainTextSourcePropertiesMediaType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicPlainTextSourcePropertiesMediaType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicPlainTextSourcePropertiesMediaType) {
      encoder.encodeString(value.value)
    }
  }
}
