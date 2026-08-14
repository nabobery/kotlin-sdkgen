package io.github.nabobery.sdkgen.github.generated

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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/dependabot_alerts
 */
@Serializable(with = InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb.Serializer::class)
public sealed class InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb) {
      encoder.encodeString(value.value)
    }
  }
}
