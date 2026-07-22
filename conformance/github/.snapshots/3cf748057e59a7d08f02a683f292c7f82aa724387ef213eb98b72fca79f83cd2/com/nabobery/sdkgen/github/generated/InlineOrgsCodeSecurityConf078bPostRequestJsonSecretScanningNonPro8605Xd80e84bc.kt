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
 * The enablement status of secret scanning non provider patterns
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/secret_scanning_non_provider_patterns
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc.Serializer::class)
public sealed class InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc) {
      encoder.encodeString(value.value)
    }
  }
}
