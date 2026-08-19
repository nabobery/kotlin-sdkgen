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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCacheControlDirective/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCacheControlDirective/properties/type
 */
@Serializable(with = InlineAnthropicCacheControlDirectiveTypeX1079002e.Serializer::class)
public sealed class InlineAnthropicCacheControlDirectiveTypeX1079002e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ephemeral`.
   */
  public data object Ephemeral : InlineAnthropicCacheControlDirectiveTypeX1079002e() {
    public override val `value`: String = "ephemeral"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCacheControlDirectiveTypeX1079002e()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCacheControlDirectiveTypeX1079002e = when (value) {
      Ephemeral.value -> Ephemeral
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCacheControlDirectiveTypeX1079002e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicCacheControlDirectiveTypeX1079002e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCacheControlDirectiveTypeX1079002e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCacheControlDirectiveTypeX1079002e) {
      encoder.encodeString(value.value)
    }
  }
}
