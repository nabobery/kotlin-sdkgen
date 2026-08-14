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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/secret_scanning_validity_checks
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6.Serializer::class)
public sealed class InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6) {
      encoder.encodeString(value.value)
    }
  }
}
