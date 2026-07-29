package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The security severity of the alert.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-rule-summary/properties/security_severity_level
 */
@Serializable(with = InlineCodeScanningAlertRuleSummarySecuritySeverityLevelX938b0730.Serializer::class)
public sealed class InlineCodeScanningAlertRuleSummarySecuritySeverityLevelX938b0730 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineCodeScanningAlertRuleSummarySecuritySeverityLevelX938b0730() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineCodeScanningAlertRuleSummarySecuritySeverityLevelX938b0730() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineCodeScanningAlertRuleSummarySecuritySeverityLevelX938b0730() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `critical`.
   */
  public data object Critical : InlineCodeScanningAlertRuleSummarySecuritySeverityLevelX938b0730() {
    public override val `value`: String = "critical"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningAlertRuleSummarySecuritySeverityLevelX938b0730()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningAlertRuleSummarySecuritySeverityLevelX938b0730 = when (value) {
      Low.value -> Low
      Medium.value -> Medium
      High.value -> High
      Critical.value -> Critical
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeScanningAlertRuleSummarySecuritySeverityLevelX938b0730> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningAlertRuleSummarySecuritySeverityLevelX938b0730", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningAlertRuleSummarySecuritySeverityLevelX938b0730 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningAlertRuleSummarySecuritySeverityLevelX938b0730) {
      encoder.encodeString(value.value)
    }
  }
}
