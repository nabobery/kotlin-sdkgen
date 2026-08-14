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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolSearchToolResult/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolSearchToolResult/properties/type
 */
@Serializable(with = InlineAnthropicToolSearchToolResultTypeXa6009ee6.Serializer::class)
public sealed class InlineAnthropicToolSearchToolResultTypeXa6009ee6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_search_tool_result`.
   */
  public data object ToolSearchToolResult : InlineAnthropicToolSearchToolResultTypeXa6009ee6() {
    public override val `value`: String = "tool_search_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicToolSearchToolResultTypeXa6009ee6()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicToolSearchToolResultTypeXa6009ee6 = when (value) {
      ToolSearchToolResult.value -> ToolSearchToolResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicToolSearchToolResultTypeXa6009ee6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicToolSearchToolResultTypeXa6009ee6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicToolSearchToolResultTypeXa6009ee6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicToolSearchToolResultTypeXa6009ee6) {
      encoder.encodeString(value.value)
    }
  }
}
