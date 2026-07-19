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
 */
@Serializable(with = InlineComponentsSchemasAnthropicToolUsesKeepPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicToolUsesKeepPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_uses`.
   */
  public data object ToolUses : InlineComponentsSchemasAnthropicToolUsesKeepPropertiesType() {
    public override val `value`: String = "tool_uses"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicToolUsesKeepPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicToolUsesKeepPropertiesType = when (value) {
      ToolUses.value -> ToolUses
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicToolUsesKeepPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicToolUsesKeepPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicToolUsesKeepPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicToolUsesKeepPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
