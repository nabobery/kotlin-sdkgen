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
 * The severity level at which code scanning results that raise security alerts block a reference update. For more
 * information on security severity levels, see "[About code scanning
 * alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alerts#
 * about-alert-severity-and-security-severity-levels)."
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-params-code-scanning-tool/properties/security_alerts
 * _threshold
 */
@Serializable(with = InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7.Serializer::class)
public sealed class InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `critical`.
   */
  public data object Critical : InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7() {
    public override val `value`: String = "critical"
  }

  /**
   * Documented value. Wire value: `high_or_higher`.
   */
  public data object HighOrHigher : InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7() {
    public override val `value`: String = "high_or_higher"
  }

  /**
   * Documented value. Wire value: `medium_or_higher`.
   */
  public data object MediumOrHigher : InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7() {
    public override val `value`: String = "medium_or_higher"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7 = when (value) {
      None.value -> None
      Critical.value -> Critical
      HighOrHigher.value -> HighOrHigher
      MediumOrHigher.value -> MediumOrHigher
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleParamsCodeScanningToolSecurityAlertsThresholdX554035f7) {
      encoder.encodeString(value.value)
    }
  }
}
