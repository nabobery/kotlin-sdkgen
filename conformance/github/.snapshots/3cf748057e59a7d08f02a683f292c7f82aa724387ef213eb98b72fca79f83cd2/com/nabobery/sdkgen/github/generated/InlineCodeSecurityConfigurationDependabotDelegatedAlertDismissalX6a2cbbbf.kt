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
 * The enablement status of Dependabot delegated alert dismissal
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/dependabot_delegated_alert_di
 * smissal
 */
@Serializable(with = InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf.Serializer::class)
public sealed class InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf) {
      encoder.encodeString(value.value)
    }
  }
}
