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
 * The enablement status of code scanning default setup
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/code_scanning_default_setup
 */
@Serializable(with = InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0.Serializer::class)
public sealed class InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0) {
      encoder.encodeString(value.value)
    }
  }
}
