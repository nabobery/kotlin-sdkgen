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
 * Result of the address line 1 check.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_rejected_card/properties/addre
 * ss_line1_check
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fail`.
   */
  public data object Fail : InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275() {
    public override val `value`: String = "fail"
  }

  /**
   * Documented value. Wire value: `pass`.
   */
  public data object Pass : InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275() {
    public override val `value`: String = "pass"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275() {
    public override val `value`: String = "unavailable"
  }

  /**
   * Documented value. Wire value: `unchecked`.
   */
  public data object Unchecked : InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275() {
    public override val `value`: String = "unchecked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275 = when (value) {
      Fail.value -> Fail
      Pass.value -> Pass
      Unavailable.value -> Unavailable
      Unchecked.value -> Unchecked
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPaymentEvaluationRejectedCardAddressLine1CheckXf806d275) {
      encoder.encodeString(value.value)
    }
  }
}
