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
 * The enablement status of GitHub Advanced Security features. `enabled` will enable both Code Security and Secret
 * Protection features.
 *
 * > [!WARNING]
 * > `code_security` and `secret_protection` are deprecated values for this field. Prefer the individual `code_security`
 * and `secret_protection` fields to set the status of these features.
 *
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations/post/requestBody/conte
 * nt/application~1json/schema/properties/advanced_security
 */
@Serializable(with = InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295.Serializer::class)
public sealed class InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `code_security`.
   */
  public data object CodeSecurity : InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295() {
    public override val `value`: String = "code_security"
  }

  /**
   * Documented value. Wire value: `secret_protection`.
   */
  public data object SecretProtection : InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295() {
    public override val `value`: String = "secret_protection"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      CodeSecurity.value -> CodeSecurity
      SecretProtection.value -> SecretProtection
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295) {
      encoder.encodeString(value.value)
    }
  }
}
