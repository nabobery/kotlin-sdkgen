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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolSearchResult/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolSearchResult/properties/type
 */
@Serializable(with = InlineAnthropicToolSearchResultTypeX9de5669c.Serializer::class)
public sealed class InlineAnthropicToolSearchResultTypeX9de5669c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_search_tool_search_result`.
   */
  public data object ToolSearchToolSearchResult : InlineAnthropicToolSearchResultTypeX9de5669c() {
    public override val `value`: String = "tool_search_tool_search_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicToolSearchResultTypeX9de5669c()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicToolSearchResultTypeX9de5669c = when (value) {
      ToolSearchToolSearchResult.value -> ToolSearchToolSearchResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicToolSearchResultTypeX9de5669c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicToolSearchResultTypeX9de5669c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicToolSearchResultTypeX9de5669c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicToolSearchResultTypeX9de5669c) {
      encoder.encodeString(value.value)
    }
  }
}
