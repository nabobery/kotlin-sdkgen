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
 * The enablement status of Dependabot alerts
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}/patch/requestBod
 * y/content/application~1json/schema/properties/dependabot_alerts
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9.Serializer::class)
public sealed class InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9) {
      encoder.encodeString(value.value)
    }
  }
}
