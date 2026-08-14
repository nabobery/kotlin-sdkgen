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
 * The enablement status of secret scanning validity checks
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/secret_scanning_validity_chec
 * ks
 */
@Serializable(with = InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b.Serializer::class)
public sealed class InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b) {
      encoder.encodeString(value.value)
    }
  }
}
