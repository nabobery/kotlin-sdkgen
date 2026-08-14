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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/secret_scanning_generic_secrets
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d.Serializer::class)
public sealed class InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d) {
      encoder.encodeString(value.value)
    }
  }
}
