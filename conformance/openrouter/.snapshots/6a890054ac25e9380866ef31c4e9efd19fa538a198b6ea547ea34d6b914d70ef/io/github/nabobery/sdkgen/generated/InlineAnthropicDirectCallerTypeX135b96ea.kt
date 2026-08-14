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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicDirectCaller/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicDirectCaller/properties/type
 */
@Serializable(with = InlineAnthropicDirectCallerTypeX135b96ea.Serializer::class)
public sealed class InlineAnthropicDirectCallerTypeX135b96ea {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : InlineAnthropicDirectCallerTypeX135b96ea() {
    public override val `value`: String = "direct"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicDirectCallerTypeX135b96ea()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicDirectCallerTypeX135b96ea = when (value) {
      Direct.value -> Direct
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicDirectCallerTypeX135b96ea> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicDirectCallerTypeX135b96ea", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicDirectCallerTypeX135b96ea = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicDirectCallerTypeX135b96ea) {
      encoder.encodeString(value.value)
    }
  }
}
