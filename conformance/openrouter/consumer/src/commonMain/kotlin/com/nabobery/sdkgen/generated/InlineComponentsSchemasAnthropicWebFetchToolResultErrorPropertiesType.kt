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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchToolResultError/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_fetch_tool_result_error`.
   */
  public data object WebFetchToolResultError : InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesType() {
    public override val `value`: String = "web_fetch_tool_result_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesType =
      when (value) {
      WebFetchToolResultError.value -> WebFetchToolResultError
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicWebFetchToolResultErrorPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
