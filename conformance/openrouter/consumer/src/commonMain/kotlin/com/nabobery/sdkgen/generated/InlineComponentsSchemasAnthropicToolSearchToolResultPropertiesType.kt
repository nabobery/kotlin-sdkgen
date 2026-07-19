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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolSearchToolResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicToolSearchToolResultPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicToolSearchToolResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_search_tool_result`.
   */
  public data object ToolSearchToolResult : InlineComponentsSchemasAnthropicToolSearchToolResultPropertiesType() {
    public override val `value`: String = "tool_search_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicToolSearchToolResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicToolSearchToolResultPropertiesType =
      when (value) {
      ToolSearchToolResult.value -> ToolSearchToolResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicToolSearchToolResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicToolSearchToolResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicToolSearchToolResultPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicToolSearchToolResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
