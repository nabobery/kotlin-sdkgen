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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolUsesTrigger/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolUsesTrigger/properties/type
 */
@Serializable(with = InlineAnthropicToolUsesTriggerTypeXfde43d31.Serializer::class)
public sealed class InlineAnthropicToolUsesTriggerTypeXfde43d31 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_uses`.
   */
  public data object ToolUses : InlineAnthropicToolUsesTriggerTypeXfde43d31() {
    public override val `value`: String = "tool_uses"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicToolUsesTriggerTypeXfde43d31()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicToolUsesTriggerTypeXfde43d31 = when (value) {
      ToolUses.value -> ToolUses
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicToolUsesTriggerTypeXfde43d31> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicToolUsesTriggerTypeXfde43d31", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicToolUsesTriggerTypeXfde43d31 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicToolUsesTriggerTypeXfde43d31) {
      encoder.encodeString(value.value)
    }
  }
}
