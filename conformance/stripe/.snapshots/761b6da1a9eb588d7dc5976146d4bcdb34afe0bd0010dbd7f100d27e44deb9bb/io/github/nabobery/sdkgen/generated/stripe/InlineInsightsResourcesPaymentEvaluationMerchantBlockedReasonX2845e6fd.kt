package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The reason the payment was blocked by the merchant.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_merchant_blocked/properties/re
 * ason
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `authentication_required`.
   */
  public data object AuthenticationRequired : InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd() {
    public override val `value`: String = "authentication_required"
  }

  /**
   * Documented value. Wire value: `blocked_for_fraud`.
   */
  public data object BlockedForFraud : InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd() {
    public override val `value`: String = "blocked_for_fraud"
  }

  /**
   * Documented value. Wire value: `invalid_payment`.
   */
  public data object InvalidPayment : InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd() {
    public override val `value`: String = "invalid_payment"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd() {
    public override val `value`: String = "other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd = when (value) {
      AuthenticationRequired.value -> AuthenticationRequired
      BlockedForFraud.value -> BlockedForFraud
      InvalidPayment.value -> InvalidPayment
      Other.value -> Other
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPaymentEvaluationMerchantBlockedReasonX2845e6fd) {
      encoder.encodeString(value.value)
    }
  }
}
