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
 * The enablement status of secret scanning
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/secret_scanning
 */
@Serializable(with = InlineCodeSecurityConfigurationSecretScanningX276838a0.Serializer::class)
public sealed class InlineCodeSecurityConfigurationSecretScanningX276838a0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCodeSecurityConfigurationSecretScanningX276838a0() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCodeSecurityConfigurationSecretScanningX276838a0() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineCodeSecurityConfigurationSecretScanningX276838a0() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationSecretScanningX276838a0()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationSecretScanningX276838a0 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationSecretScanningX276838a0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationSecretScanningX276838a0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationSecretScanningX276838a0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationSecretScanningX276838a0) {
      encoder.encodeString(value.value)
    }
  }
}
