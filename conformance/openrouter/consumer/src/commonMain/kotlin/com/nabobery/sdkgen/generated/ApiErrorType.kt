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
 * Canonical OpenRouter error type, stable across all API formats
 */
@Serializable(with = ApiErrorType.Serializer::class)
public sealed class ApiErrorType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `context_length_exceeded`.
   */
  public data object ContextLengthExceeded : ApiErrorType() {
    public override val `value`: String = "context_length_exceeded"
  }

  /**
   * Documented value. Wire value: `max_tokens_exceeded`.
   */
  public data object MaxTokensExceeded : ApiErrorType() {
    public override val `value`: String = "max_tokens_exceeded"
  }

  /**
   * Documented value. Wire value: `token_limit_exceeded`.
   */
  public data object TokenLimitExceeded : ApiErrorType() {
    public override val `value`: String = "token_limit_exceeded"
  }

  /**
   * Documented value. Wire value: `string_too_long`.
   */
  public data object StringTooLong : ApiErrorType() {
    public override val `value`: String = "string_too_long"
  }

  /**
   * Documented value. Wire value: `authentication`.
   */
  public data object Authentication : ApiErrorType() {
    public override val `value`: String = "authentication"
  }

  /**
   * Documented value. Wire value: `permission_denied`.
   */
  public data object PermissionDenied : ApiErrorType() {
    public override val `value`: String = "permission_denied"
  }

  /**
   * Documented value. Wire value: `payment_required`.
   */
  public data object PaymentRequired : ApiErrorType() {
    public override val `value`: String = "payment_required"
  }

  /**
   * Documented value. Wire value: `rate_limit_exceeded`.
   */
  public data object RateLimitExceeded : ApiErrorType() {
    public override val `value`: String = "rate_limit_exceeded"
  }

  /**
   * Documented value. Wire value: `provider_overloaded`.
   */
  public data object ProviderOverloaded : ApiErrorType() {
    public override val `value`: String = "provider_overloaded"
  }

  /**
   * Documented value. Wire value: `provider_unavailable`.
   */
  public data object ProviderUnavailable : ApiErrorType() {
    public override val `value`: String = "provider_unavailable"
  }

  /**
   * Documented value. Wire value: `invalid_request`.
   */
  public data object InvalidRequest : ApiErrorType() {
    public override val `value`: String = "invalid_request"
  }

  /**
   * Documented value. Wire value: `invalid_prompt`.
   */
  public data object InvalidPrompt : ApiErrorType() {
    public override val `value`: String = "invalid_prompt"
  }

  /**
   * Documented value. Wire value: `not_found`.
   */
  public data object NotFound : ApiErrorType() {
    public override val `value`: String = "not_found"
  }

  /**
   * Documented value. Wire value: `precondition_failed`.
   */
  public data object PreconditionFailed : ApiErrorType() {
    public override val `value`: String = "precondition_failed"
  }

  /**
   * Documented value. Wire value: `payload_too_large`.
   */
  public data object PayloadTooLarge : ApiErrorType() {
    public override val `value`: String = "payload_too_large"
  }

  /**
   * Documented value. Wire value: `unprocessable`.
   */
  public data object Unprocessable : ApiErrorType() {
    public override val `value`: String = "unprocessable"
  }

  /**
   * Documented value. Wire value: `content_policy_violation`.
   */
  public data object ContentPolicyViolation : ApiErrorType() {
    public override val `value`: String = "content_policy_violation"
  }

  /**
   * Documented value. Wire value: `refusal`.
   */
  public data object Refusal : ApiErrorType() {
    public override val `value`: String = "refusal"
  }

  /**
   * Documented value. Wire value: `invalid_image`.
   */
  public data object InvalidImage : ApiErrorType() {
    public override val `value`: String = "invalid_image"
  }

  /**
   * Documented value. Wire value: `image_too_large`.
   */
  public data object ImageTooLarge : ApiErrorType() {
    public override val `value`: String = "image_too_large"
  }

  /**
   * Documented value. Wire value: `image_too_small`.
   */
  public data object ImageTooSmall : ApiErrorType() {
    public override val `value`: String = "image_too_small"
  }

  /**
   * Documented value. Wire value: `unsupported_image_format`.
   */
  public data object UnsupportedImageFormat : ApiErrorType() {
    public override val `value`: String = "unsupported_image_format"
  }

  /**
   * Documented value. Wire value: `image_not_found`.
   */
  public data object ImageNotFound : ApiErrorType() {
    public override val `value`: String = "image_not_found"
  }

  /**
   * Documented value. Wire value: `image_download_failed`.
   */
  public data object ImageDownloadFailed : ApiErrorType() {
    public override val `value`: String = "image_download_failed"
  }

  /**
   * Documented value. Wire value: `server`.
   */
  public data object Server : ApiErrorType() {
    public override val `value`: String = "server"
  }

  /**
   * Documented value. Wire value: `timeout`.
   */
  public data object Timeout : ApiErrorType() {
    public override val `value`: String = "timeout"
  }

  /**
   * Documented value. Wire value: `unmapped`.
   */
  public data object Unmapped : ApiErrorType() {
    public override val `value`: String = "unmapped"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ApiErrorType()

  public companion object {
    public fun fromValue(`value`: String): ApiErrorType = when (value) {
      ContextLengthExceeded.value -> ContextLengthExceeded
      MaxTokensExceeded.value -> MaxTokensExceeded
      TokenLimitExceeded.value -> TokenLimitExceeded
      StringTooLong.value -> StringTooLong
      Authentication.value -> Authentication
      PermissionDenied.value -> PermissionDenied
      PaymentRequired.value -> PaymentRequired
      RateLimitExceeded.value -> RateLimitExceeded
      ProviderOverloaded.value -> ProviderOverloaded
      ProviderUnavailable.value -> ProviderUnavailable
      InvalidRequest.value -> InvalidRequest
      InvalidPrompt.value -> InvalidPrompt
      NotFound.value -> NotFound
      PreconditionFailed.value -> PreconditionFailed
      PayloadTooLarge.value -> PayloadTooLarge
      Unprocessable.value -> Unprocessable
      ContentPolicyViolation.value -> ContentPolicyViolation
      Refusal.value -> Refusal
      InvalidImage.value -> InvalidImage
      ImageTooLarge.value -> ImageTooLarge
      ImageTooSmall.value -> ImageTooSmall
      UnsupportedImageFormat.value -> UnsupportedImageFormat
      ImageNotFound.value -> ImageNotFound
      ImageDownloadFailed.value -> ImageDownloadFailed
      Server.value -> Server
      Timeout.value -> Timeout
      Unmapped.value -> Unmapped
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<ApiErrorType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ApiErrorType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ApiErrorType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ApiErrorType) {
      encoder.encodeString(value.value)
    }
  }
}
