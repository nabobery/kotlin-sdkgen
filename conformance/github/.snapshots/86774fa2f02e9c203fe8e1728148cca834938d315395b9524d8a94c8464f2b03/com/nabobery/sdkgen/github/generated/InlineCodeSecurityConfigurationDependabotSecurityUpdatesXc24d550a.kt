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
 * The enablement status of Dependabot security updates
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/dependabot_security_updates
 */
@Serializable(with = InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a.Serializer::class)
public sealed class InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a) {
      encoder.encodeString(value.value)
    }
  }
}
