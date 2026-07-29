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
 * The enablement status of code scanning delegated alert dismissal
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/code_scanning_delegated_alert
 * _dismissal
 */
@Serializable(with = InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5.Serializer::class)
public sealed class InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5) {
      encoder.encodeString(value.value)
    }
  }
}
