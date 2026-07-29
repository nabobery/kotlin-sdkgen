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
 * Result of the CVC check.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_rejected_card/properties/cvc_c
 * heck
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fail`.
   */
  public data object Fail : InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422() {
    public override val `value`: String = "fail"
  }

  /**
   * Documented value. Wire value: `pass`.
   */
  public data object Pass : InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422() {
    public override val `value`: String = "pass"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422() {
    public override val `value`: String = "unavailable"
  }

  /**
   * Documented value. Wire value: `unchecked`.
   */
  public data object Unchecked : InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422() {
    public override val `value`: String = "unchecked"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422 = when (value) {
      Fail.value -> Fail
      Pass.value -> Pass
      Unavailable.value -> Unavailable
      Unchecked.value -> Unchecked
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPaymentEvaluationRejectedCardCvcCheckX24884422) {
      encoder.encodeString(value.value)
    }
  }
}
