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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchToolResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_tool_result`.
   */
  public data object WebSearchToolResult : InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesType() {
    public override val `value`: String = "web_search_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesType =
      when (value) {
      WebSearchToolResult.value -> WebSearchToolResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicWebSearchToolResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
