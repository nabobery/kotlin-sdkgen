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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolSearchResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicToolSearchResultPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicToolSearchResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_search_tool_search_result`.
   */
  public data object ToolSearchToolSearchResult : InlineComponentsSchemasAnthropicToolSearchResultPropertiesType() {
    public override val `value`: String = "tool_search_tool_search_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicToolSearchResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicToolSearchResultPropertiesType =
      when (value) {
      ToolSearchToolSearchResult.value -> ToolSearchToolSearchResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicToolSearchResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicToolSearchResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicToolSearchResultPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicToolSearchResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
