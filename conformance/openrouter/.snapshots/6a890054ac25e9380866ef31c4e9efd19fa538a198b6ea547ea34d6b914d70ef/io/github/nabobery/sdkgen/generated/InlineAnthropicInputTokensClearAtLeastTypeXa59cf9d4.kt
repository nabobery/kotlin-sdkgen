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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicInputTokensClearAtLeast/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicInputTokensClearAtLeast/properties/type
 */
@Serializable(with = InlineAnthropicInputTokensClearAtLeastTypeXa59cf9d4.Serializer::class)
public sealed class InlineAnthropicInputTokensClearAtLeastTypeXa59cf9d4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_tokens`.
   */
  public data object InputTokens : InlineAnthropicInputTokensClearAtLeastTypeXa59cf9d4() {
    public override val `value`: String = "input_tokens"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicInputTokensClearAtLeastTypeXa59cf9d4()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicInputTokensClearAtLeastTypeXa59cf9d4 = when (value) {
      InputTokens.value -> InputTokens
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicInputTokensClearAtLeastTypeXa59cf9d4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicInputTokensClearAtLeastTypeXa59cf9d4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicInputTokensClearAtLeastTypeXa59cf9d4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicInputTokensClearAtLeastTypeXa59cf9d4) {
      encoder.encodeString(value.value)
    }
  }
}
