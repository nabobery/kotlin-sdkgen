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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchToolResultError/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_tool_result_error`.
   */
  public data object WebSearchToolResultError : InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType() {
    public override val `value`: String = "web_search_tool_result_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType =
      when (value) {
      WebSearchToolResultError.value -> WebSearchToolResultError
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
