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
 * Risk level of this signal, based on the score.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/insights_resources_payment_evaluation_signal_v2/properties/risk_leve
 * l
 */
@Serializable(with = InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb.Serializer::class)
public sealed class InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `elevated`.
   */
  public data object Elevated : InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb() {
    public override val `value`: String = "elevated"
  }

  /**
   * Documented value. Wire value: `highest`.
   */
  public data object Highest : InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb() {
    public override val `value`: String = "highest"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `normal`.
   */
  public data object Normal : InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb() {
    public override val `value`: String = "normal"
  }

  /**
   * Documented value. Wire value: `not_assessed`.
   */
  public data object NotAssessed : InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb() {
    public override val `value`: String = "not_assessed"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb()

  public companion object {
    public fun fromValue(`value`: String): InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb = when (value) {
      Elevated.value -> Elevated
      Highest.value -> Highest
      Low.value -> Low
      Normal.value -> Normal
      NotAssessed.value -> NotAssessed
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInsightsResourcesPaymentEvaluationSignalV2RiskLevelX40fd06bb) {
      encoder.encodeString(value.value)
    }
  }
}
