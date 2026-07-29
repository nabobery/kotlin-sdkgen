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
 * The severity level at which code scanning results that raise alerts block a reference update. For more information on
 * alert severity levels, see "[About code scanning
 * alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alerts#
 * about-alert-severity-and-security-severity-levels)."
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-params-code-scanning-tool/properties/alerts_threshol
 * d
 */
@Serializable(with = InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d.Serializer::class)
public sealed class InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `errors`.
   */
  public data object Errors : InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d() {
    public override val `value`: String = "errors"
  }

  /**
   * Documented value. Wire value: `errors_and_warnings`.
   */
  public data object ErrorsAndWarnings : InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d() {
    public override val `value`: String = "errors_and_warnings"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d = when (value) {
      None.value -> None
      Errors.value -> Errors
      ErrorsAndWarnings.value -> ErrorsAndWarnings
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleParamsCodeScanningToolAlertsThresholdXbbb1081d) {
      encoder.encodeString(value.value)
    }
  }
}
