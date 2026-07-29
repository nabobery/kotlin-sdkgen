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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/risk_assessment/properties/merchant_dispute_risk/properties/level.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/risk_assessment/properties/merchant_dispute_risk/properties/level
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321.Serializer::class)
public sealed class InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `elevated`.
   */
  public data object Elevated : InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321() {
    public override val `value`: String = "elevated"
  }

  /**
   * Documented value. Wire value: `highest`.
   */
  public data object Highest : InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321() {
    public override val `value`: String = "highest"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `normal`.
   */
  public data object Normal : InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321() {
    public override val `value`: String = "normal"
  }

  /**
   * Documented value. Wire value: `not_assessed`.
   */
  public data object NotAssessed : InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321() {
    public override val `value`: String = "not_assessed"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321 = when (value) {
      Elevated.value -> Elevated
      Highest.value -> Highest
      Low.value -> Low
      Normal.value -> Normal
      NotAssessed.value -> NotAssessed
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321) {
      encoder.encodeString(value.value)
    }
  }
}
