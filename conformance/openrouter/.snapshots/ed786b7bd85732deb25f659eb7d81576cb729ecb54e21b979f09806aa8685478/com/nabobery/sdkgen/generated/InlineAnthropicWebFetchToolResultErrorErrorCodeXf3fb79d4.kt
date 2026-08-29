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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchToolResultError/properties/error_code.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchToolResultError/properties/error_code
 */
@Serializable(with = InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4.Serializer::class)
public sealed class InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invalid_tool_input`.
   */
  public data object InvalidToolInput : InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4() {
    public override val `value`: String = "invalid_tool_input"
  }

  /**
   * Documented value. Wire value: `url_too_long`.
   */
  public data object UrlTooLong : InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4() {
    public override val `value`: String = "url_too_long"
  }

  /**
   * Documented value. Wire value: `url_not_allowed`.
   */
  public data object UrlNotAllowed : InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4() {
    public override val `value`: String = "url_not_allowed"
  }

  /**
   * Documented value. Wire value: `url_not_accessible`.
   */
  public data object UrlNotAccessible : InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4() {
    public override val `value`: String = "url_not_accessible"
  }

  /**
   * Documented value. Wire value: `unsupported_content_type`.
   */
  public data object UnsupportedContentType : InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4() {
    public override val `value`: String = "unsupported_content_type"
  }

  /**
   * Documented value. Wire value: `too_many_requests`.
   */
  public data object TooManyRequests : InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4() {
    public override val `value`: String = "too_many_requests"
  }

  /**
   * Documented value. Wire value: `max_uses_exceeded`.
   */
  public data object MaxUsesExceeded : InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4() {
    public override val `value`: String = "max_uses_exceeded"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4() {
    public override val `value`: String = "unavailable"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4 = when (value) {
      InvalidToolInput.value -> InvalidToolInput
      UrlTooLong.value -> UrlTooLong
      UrlNotAllowed.value -> UrlNotAllowed
      UrlNotAccessible.value -> UrlNotAccessible
      UnsupportedContentType.value -> UnsupportedContentType
      TooManyRequests.value -> TooManyRequests
      MaxUsesExceeded.value -> MaxUsesExceeded
      Unavailable.value -> Unavailable
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4) {
      encoder.encodeString(value.value)
    }
  }
}
