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
 * The enablement status of GitHub Advanced Security
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/advanced_security
 */
@Serializable(with = InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c.Serializer::class)
public sealed class InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `code_security`.
   */
  public data object CodeSecurity : InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c() {
    public override val `value`: String = "code_security"
  }

  /**
   * Documented value. Wire value: `secret_protection`.
   */
  public data object SecretProtection : InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c() {
    public override val `value`: String = "secret_protection"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      CodeSecurity.value -> CodeSecurity
      SecretProtection.value -> SecretProtection
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c) {
      encoder.encodeString(value.value)
    }
  }
}
