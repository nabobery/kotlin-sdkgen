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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ResponsesErrorField/properties/code.
 */
@Serializable(with = InlineComponentsSchemasResponsesErrorFieldPropertiesCode.Serializer::class)
public sealed class InlineComponentsSchemasResponsesErrorFieldPropertiesCode {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `server_error`.
   */
  public data object ServerError : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "server_error"
  }

  /**
   * Documented value. Wire value: `rate_limit_exceeded`.
   */
  public data object RateLimitExceeded : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "rate_limit_exceeded"
  }

  /**
   * Documented value. Wire value: `invalid_prompt`.
   */
  public data object InvalidPrompt : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "invalid_prompt"
  }

  /**
   * Documented value. Wire value: `vector_store_timeout`.
   */
  public data object VectorStoreTimeout : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "vector_store_timeout"
  }

  /**
   * Documented value. Wire value: `invalid_image`.
   */
  public data object InvalidImage : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "invalid_image"
  }

  /**
   * Documented value. Wire value: `invalid_image_format`.
   */
  public data object InvalidImageFormat : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "invalid_image_format"
  }

  /**
   * Documented value. Wire value: `invalid_base64_image`.
   */
  public data object InvalidBase64Image : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "invalid_base64_image"
  }

  /**
   * Documented value. Wire value: `invalid_image_url`.
   */
  public data object InvalidImageUrl : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "invalid_image_url"
  }

  /**
   * Documented value. Wire value: `image_too_large`.
   */
  public data object ImageTooLarge : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "image_too_large"
  }

  /**
   * Documented value. Wire value: `image_too_small`.
   */
  public data object ImageTooSmall : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "image_too_small"
  }

  /**
   * Documented value. Wire value: `image_parse_error`.
   */
  public data object ImageParseError : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "image_parse_error"
  }

  /**
   * Documented value. Wire value: `image_content_policy_violation`.
   */
  public data object ImageContentPolicyViolation : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "image_content_policy_violation"
  }

  /**
   * Documented value. Wire value: `invalid_image_mode`.
   */
  public data object InvalidImageMode : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "invalid_image_mode"
  }

  /**
   * Documented value. Wire value: `image_file_too_large`.
   */
  public data object ImageFileTooLarge : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "image_file_too_large"
  }

  /**
   * Documented value. Wire value: `unsupported_image_media_type`.
   */
  public data object UnsupportedImageMediaType : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "unsupported_image_media_type"
  }

  /**
   * Documented value. Wire value: `empty_image_file`.
   */
  public data object EmptyImageFile : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "empty_image_file"
  }

  /**
   * Documented value. Wire value: `failed_to_download_image`.
   */
  public data object FailedToDownloadImage : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "failed_to_download_image"
  }

  /**
   * Documented value. Wire value: `image_file_not_found`.
   */
  public data object ImageFileNotFound : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "image_file_not_found"
  }

  /**
   * Documented value. Wire value: `bio_policy`.
   */
  public data object BioPolicy : InlineComponentsSchemasResponsesErrorFieldPropertiesCode() {
    public override val `value`: String = "bio_policy"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasResponsesErrorFieldPropertiesCode()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasResponsesErrorFieldPropertiesCode = when (value) {
      ServerError.value -> ServerError
      RateLimitExceeded.value -> RateLimitExceeded
      InvalidPrompt.value -> InvalidPrompt
      VectorStoreTimeout.value -> VectorStoreTimeout
      InvalidImage.value -> InvalidImage
      InvalidImageFormat.value -> InvalidImageFormat
      InvalidBase64Image.value -> InvalidBase64Image
      InvalidImageUrl.value -> InvalidImageUrl
      ImageTooLarge.value -> ImageTooLarge
      ImageTooSmall.value -> ImageTooSmall
      ImageParseError.value -> ImageParseError
      ImageContentPolicyViolation.value -> ImageContentPolicyViolation
      InvalidImageMode.value -> InvalidImageMode
      ImageFileTooLarge.value -> ImageFileTooLarge
      UnsupportedImageMediaType.value -> UnsupportedImageMediaType
      EmptyImageFile.value -> EmptyImageFile
      FailedToDownloadImage.value -> FailedToDownloadImage
      ImageFileNotFound.value -> ImageFileNotFound
      BioPolicy.value -> BioPolicy
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasResponsesErrorFieldPropertiesCode> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasResponsesErrorFieldPropertiesCode", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasResponsesErrorFieldPropertiesCode =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasResponsesErrorFieldPropertiesCode) {
      encoder.encodeString(value.value)
    }
  }
}
