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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchToolResultError/properties/type
 */
@Serializable(with = InlineAnthropicWebFetchToolResultErrorTypeXa3d3754b.Serializer::class)
public sealed class InlineAnthropicWebFetchToolResultErrorTypeXa3d3754b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_fetch_tool_result_error`.
   */
  public data object WebFetchToolResultError : InlineAnthropicWebFetchToolResultErrorTypeXa3d3754b() {
    public override val `value`: String = "web_fetch_tool_result_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicWebFetchToolResultErrorTypeXa3d3754b()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicWebFetchToolResultErrorTypeXa3d3754b = when (value) {
      WebFetchToolResultError.value -> WebFetchToolResultError
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicWebFetchToolResultErrorTypeXa3d3754b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicWebFetchToolResultErrorTypeXa3d3754b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicWebFetchToolResultErrorTypeXa3d3754b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicWebFetchToolResultErrorTypeXa3d3754b) {
      encoder.encodeString(value.value)
    }
  }
}
