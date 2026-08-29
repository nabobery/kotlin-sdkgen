package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Indicates the outcome of the payment evaluation.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_outcome/properties/type
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `merchant_blocked`.
   */
  public data object MerchantBlocked : InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113() {
    public override val `value`: String = "merchant_blocked"
  }

  /**
   * Documented value. Wire value: `rejected`.
   */
  public data object Rejected : InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113() {
    public override val `value`: String = "rejected"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113 = when (value) {
      Failed.value -> Failed
      MerchantBlocked.value -> MerchantBlocked
      Rejected.value -> Rejected
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPaymentEvaluationOutcomeTypeXdeb70113) {
      encoder.encodeString(value.value)
    }
  }
}
