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
 * The enablement status of GitHub Secret Protection features.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/secret_protection
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4.Serializer::class)
public sealed class InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4) {
      encoder.encodeString(value.value)
    }
  }
}
