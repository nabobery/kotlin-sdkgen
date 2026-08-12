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
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/secret_scanning
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353.Serializer::class)
public sealed class InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353) {
      encoder.encodeString(value.value)
    }
  }
}
