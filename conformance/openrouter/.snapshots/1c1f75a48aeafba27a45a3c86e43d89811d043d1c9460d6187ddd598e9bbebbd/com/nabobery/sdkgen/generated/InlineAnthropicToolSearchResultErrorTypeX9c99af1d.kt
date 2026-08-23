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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolSearchResultError/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolSearchResultError/properties/type
 */
@Serializable(with = InlineAnthropicToolSearchResultErrorTypeX9c99af1d.Serializer::class)
public sealed class InlineAnthropicToolSearchResultErrorTypeX9c99af1d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_search_tool_result_error`.
   */
  public data object ToolSearchToolResultError : InlineAnthropicToolSearchResultErrorTypeX9c99af1d() {
    public override val `value`: String = "tool_search_tool_result_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicToolSearchResultErrorTypeX9c99af1d()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicToolSearchResultErrorTypeX9c99af1d = when (value) {
      ToolSearchToolResultError.value -> ToolSearchToolResultError
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicToolSearchResultErrorTypeX9c99af1d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicToolSearchResultErrorTypeX9c99af1d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicToolSearchResultErrorTypeX9c99af1d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicToolSearchResultErrorTypeX9c99af1d) {
      encoder.encodeString(value.value)
    }
  }
}
