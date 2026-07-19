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
 * The category of feedback being reported
 */
@Serializable(with = InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory.Serializer::class)
public sealed class InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `latency`.
   */
  public data object Latency : InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory() {
    public override val `value`: String = "latency"
  }

  /**
   * Documented value. Wire value: `incoherence`.
   */
  public data object Incoherence : InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory() {
    public override val `value`: String = "incoherence"
  }

  /**
   * Documented value. Wire value: `incorrect_response`.
   */
  public data object IncorrectResponse : InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory() {
    public override val `value`: String = "incorrect_response"
  }

  /**
   * Documented value. Wire value: `formatting`.
   */
  public data object Formatting : InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory() {
    public override val `value`: String = "formatting"
  }

  /**
   * Documented value. Wire value: `billing`.
   */
  public data object Billing : InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory() {
    public override val `value`: String = "billing"
  }

  /**
   * Documented value. Wire value: `api_error`.
   */
  public data object ApiError : InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory() {
    public override val `value`: String = "api_error"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory() {
    public override val `value`: String = "other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory =
      when (value) {
      Latency.value -> Latency
      Incoherence.value -> Incoherence
      IncorrectResponse.value -> IncorrectResponse
      Formatting.value -> Formatting
      Billing.value -> Billing
      ApiError.value -> ApiError
      Other.value -> Other
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory) {
      encoder.encodeString(value.value)
    }
  }
}
