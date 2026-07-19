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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolUsesTrigger/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_uses`.
   */
  public data object ToolUses : InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType() {
    public override val `value`: String = "tool_uses"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType =
      when (value) {
      ToolUses.value -> ToolUses
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
