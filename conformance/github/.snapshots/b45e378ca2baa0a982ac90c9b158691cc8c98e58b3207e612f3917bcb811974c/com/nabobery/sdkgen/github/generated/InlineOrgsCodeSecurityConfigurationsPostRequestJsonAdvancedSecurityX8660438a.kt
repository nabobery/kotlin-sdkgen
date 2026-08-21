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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/advanced_security
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a.Serializer::class)
public sealed class InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `code_security`.
   */
  public data object CodeSecurity : InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a() {
    public override val `value`: String = "code_security"
  }

  /**
   * Documented value. Wire value: `secret_protection`.
   */
  public data object SecretProtection : InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a() {
    public override val `value`: String = "secret_protection"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      CodeSecurity.value -> CodeSecurity
      SecretProtection.value -> SecretProtection
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a) {
      encoder.encodeString(value.value)
    }
  }
}
