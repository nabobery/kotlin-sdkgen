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
 * Result of the intervention if it has been completed.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_user_intervention_resolved/pro
 * perties/outcome
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `abandoned`.
   */
  public data object Abandoned : InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab() {
    public override val `value`: String = "abandoned"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `passed`.
   */
  public data object Passed : InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab() {
    public override val `value`: String = "passed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab = when (value) {
      Abandoned.value -> Abandoned
      Failed.value -> Failed
      Passed.value -> Passed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPaymentEvaluationUserInterventionResolvedOutcomeX213724ab) {
      encoder.encodeString(value.value)
    }
  }
}
