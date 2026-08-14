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
 * The enablement status of secret scanning push protection
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/secret_scanning_push_protecti
 * on
 */
@Serializable(with = InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f.Serializer::class)
public sealed class InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f) {
      encoder.encodeString(value.value)
    }
  }
}
