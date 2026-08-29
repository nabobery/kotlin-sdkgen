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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchToolResult/properties/type
 */
@Serializable(with = InlineAnthropicWebSearchToolResultTypeX0fb13727.Serializer::class)
public sealed class InlineAnthropicWebSearchToolResultTypeX0fb13727 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_tool_result`.
   */
  public data object WebSearchToolResult : InlineAnthropicWebSearchToolResultTypeX0fb13727() {
    public override val `value`: String = "web_search_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicWebSearchToolResultTypeX0fb13727()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicWebSearchToolResultTypeX0fb13727 = when (value) {
      WebSearchToolResult.value -> WebSearchToolResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicWebSearchToolResultTypeX0fb13727> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicWebSearchToolResultTypeX0fb13727", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicWebSearchToolResultTypeX0fb13727 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicWebSearchToolResultTypeX0fb13727) {
      encoder.encodeString(value.value)
    }
  }
}
