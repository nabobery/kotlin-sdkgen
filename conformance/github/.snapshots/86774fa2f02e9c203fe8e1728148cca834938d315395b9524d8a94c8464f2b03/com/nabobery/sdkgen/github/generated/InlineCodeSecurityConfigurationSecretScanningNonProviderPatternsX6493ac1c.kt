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
 * The enablement status of secret scanning non-provider patterns
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/secret_scanning_non_provider_
 * patterns
 */
@Serializable(with = InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c.Serializer::class)
public sealed class InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c) {
      encoder.encodeString(value.value)
    }
  }
}
