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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolUsesKeep/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolUsesKeep/properties/type
 */
@Serializable(with = InlineAnthropicToolUsesKeepTypeXdcd2cc92.Serializer::class)
public sealed class InlineAnthropicToolUsesKeepTypeXdcd2cc92 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_uses`.
   */
  public data object ToolUses : InlineAnthropicToolUsesKeepTypeXdcd2cc92() {
    public override val `value`: String = "tool_uses"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicToolUsesKeepTypeXdcd2cc92()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicToolUsesKeepTypeXdcd2cc92 = when (value) {
      ToolUses.value -> ToolUses
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicToolUsesKeepTypeXdcd2cc92> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicToolUsesKeepTypeXdcd2cc92", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicToolUsesKeepTypeXdcd2cc92 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicToolUsesKeepTypeXdcd2cc92) {
      encoder.encodeString(value.value)
    }
  }
}
