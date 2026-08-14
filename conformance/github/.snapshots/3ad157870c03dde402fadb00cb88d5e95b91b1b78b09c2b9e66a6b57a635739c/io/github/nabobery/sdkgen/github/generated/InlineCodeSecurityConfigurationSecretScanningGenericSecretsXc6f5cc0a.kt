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
 * The enablement status of Copilot secret scanning
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/secret_scanning_generic_secre
 * ts
 */
@Serializable(with = InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a.Serializer::class)
public sealed class InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a) {
      encoder.encodeString(value.value)
    }
  }
}
