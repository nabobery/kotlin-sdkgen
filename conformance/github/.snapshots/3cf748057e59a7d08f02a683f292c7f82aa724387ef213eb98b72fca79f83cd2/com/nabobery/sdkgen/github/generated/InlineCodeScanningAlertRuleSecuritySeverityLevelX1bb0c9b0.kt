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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-rule/properties/security_severity_level
 */
@Serializable(with = InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0.Serializer::class)
public sealed class InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `critical`.
   */
  public data object Critical : InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0() {
    public override val `value`: String = "critical"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0 = when (value) {
      Low.value -> Low
      Medium.value -> Medium
      High.value -> High
      Critical.value -> Critical
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningAlertRuleSecuritySeverityLevelX1bb0c9b0) {
      encoder.encodeString(value.value)
    }
  }
}
