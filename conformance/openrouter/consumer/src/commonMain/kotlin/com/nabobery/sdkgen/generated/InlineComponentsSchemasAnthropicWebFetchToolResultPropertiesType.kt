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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchToolResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicWebFetchToolResultPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicWebFetchToolResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_fetch_tool_result`.
   */
  public data object WebFetchToolResult : InlineComponentsSchemasAnthropicWebFetchToolResultPropertiesType() {
    public override val `value`: String = "web_fetch_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicWebFetchToolResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicWebFetchToolResultPropertiesType =
      when (value) {
      WebFetchToolResult.value -> WebFetchToolResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicWebFetchToolResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicWebFetchToolResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicWebFetchToolResultPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicWebFetchToolResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
