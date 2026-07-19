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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolUseBlock/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicToolUseBlockPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicToolUseBlockPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_use`.
   */
  public data object ToolUse : InlineComponentsSchemasAnthropicToolUseBlockPropertiesType() {
    public override val `value`: String = "tool_use"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicToolUseBlockPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicToolUseBlockPropertiesType = when (value) {
      ToolUse.value -> ToolUse
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicToolUseBlockPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicToolUseBlockPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicToolUseBlockPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicToolUseBlockPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
