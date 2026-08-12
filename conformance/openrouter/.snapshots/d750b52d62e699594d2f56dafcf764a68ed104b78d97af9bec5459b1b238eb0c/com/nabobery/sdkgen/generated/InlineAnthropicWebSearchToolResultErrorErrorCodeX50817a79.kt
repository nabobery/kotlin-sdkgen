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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchToolResultError/properties/error_code.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchToolResultError/properties/error_code
 */
@Serializable(with = InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79.Serializer::class)
public sealed class InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invalid_tool_input`.
   */
  public data object InvalidToolInput : InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79() {
    public override val `value`: String = "invalid_tool_input"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79() {
    public override val `value`: String = "unavailable"
  }

  /**
   * Documented value. Wire value: `max_uses_exceeded`.
   */
  public data object MaxUsesExceeded : InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79() {
    public override val `value`: String = "max_uses_exceeded"
  }

  /**
   * Documented value. Wire value: `too_many_requests`.
   */
  public data object TooManyRequests : InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79() {
    public override val `value`: String = "too_many_requests"
  }

  /**
   * Documented value. Wire value: `query_too_long`.
   */
  public data object QueryTooLong : InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79() {
    public override val `value`: String = "query_too_long"
  }

  /**
   * Documented value. Wire value: `request_too_large`.
   */
  public data object RequestTooLarge : InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79() {
    public override val `value`: String = "request_too_large"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79 = when (value) {
      InvalidToolInput.value -> InvalidToolInput
      Unavailable.value -> Unavailable
      MaxUsesExceeded.value -> MaxUsesExceeded
      TooManyRequests.value -> TooManyRequests
      QueryTooLong.value -> QueryTooLong
      RequestTooLarge.value -> RequestTooLarge
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicWebSearchToolResultErrorErrorCodeX50817a79) {
      encoder.encodeString(value.value)
    }
  }
}
