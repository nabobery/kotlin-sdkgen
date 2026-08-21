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
 * The enablement status of GitHub Advanced Security features. `enabled` will enable both Code Security and Secret
 * Protection features.
 *
 * > [!WARNING]
 * > `code_security` and `secret_protection` are deprecated values for this field. Prefer the individual `code_security`
 * and `secret_protection` fields to set the status of these features.
 *
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}/patch/requestBod
 * y/content/application~1json/schema/properties/advanced_security
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405.Serializer::class)
public sealed class InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `code_security`.
   */
  public data object CodeSecurity : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405() {
    public override val `value`: String = "code_security"
  }

  /**
   * Documented value. Wire value: `secret_protection`.
   */
  public data object SecretProtection : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405() {
    public override val `value`: String = "secret_protection"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      CodeSecurity.value -> CodeSecurity
      SecretProtection.value -> SecretProtection
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405) {
      encoder.encodeString(value.value)
    }
  }
}
