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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/SubmitGenerationFeedbackRequest/properties/category
 */
@Serializable(with = InlineSubmitGenerationFeedbackRequestCategoryX243a33a3.Serializer::class)
public sealed class InlineSubmitGenerationFeedbackRequestCategoryX243a33a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `latency`.
   */
  public data object Latency : InlineSubmitGenerationFeedbackRequestCategoryX243a33a3() {
    public override val `value`: String = "latency"
  }

  /**
   * Documented value. Wire value: `incoherence`.
   */
  public data object Incoherence : InlineSubmitGenerationFeedbackRequestCategoryX243a33a3() {
    public override val `value`: String = "incoherence"
  }

  /**
   * Documented value. Wire value: `incorrect_response`.
   */
  public data object IncorrectResponse : InlineSubmitGenerationFeedbackRequestCategoryX243a33a3() {
    public override val `value`: String = "incorrect_response"
  }

  /**
   * Documented value. Wire value: `formatting`.
   */
  public data object Formatting : InlineSubmitGenerationFeedbackRequestCategoryX243a33a3() {
    public override val `value`: String = "formatting"
  }

  /**
   * Documented value. Wire value: `billing`.
   */
  public data object Billing : InlineSubmitGenerationFeedbackRequestCategoryX243a33a3() {
    public override val `value`: String = "billing"
  }

  /**
   * Documented value. Wire value: `api_error`.
   */
  public data object ApiError : InlineSubmitGenerationFeedbackRequestCategoryX243a33a3() {
    public override val `value`: String = "api_error"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineSubmitGenerationFeedbackRequestCategoryX243a33a3() {
    public override val `value`: String = "other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubmitGenerationFeedbackRequestCategoryX243a33a3()

  public companion object {
    public fun fromValue(`value`: String): InlineSubmitGenerationFeedbackRequestCategoryX243a33a3 = when (value) {
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

  internal object Serializer : KSerializer<InlineSubmitGenerationFeedbackRequestCategoryX243a33a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineSubmitGenerationFeedbackRequestCategoryX243a33a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubmitGenerationFeedbackRequestCategoryX243a33a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubmitGenerationFeedbackRequestCategoryX243a33a3) {
      encoder.encodeString(value.value)
    }
  }
}
