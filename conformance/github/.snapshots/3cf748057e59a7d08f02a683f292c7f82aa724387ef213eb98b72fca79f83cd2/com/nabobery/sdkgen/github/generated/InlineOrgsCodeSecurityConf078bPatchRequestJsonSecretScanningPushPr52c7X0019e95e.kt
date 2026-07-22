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
 * The enablement status of secret scanning push protection
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}/patch/requestBod
 * y/content/application~1json/schema/properties/secret_scanning_push_protection
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e.Serializer::class)
public sealed class InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e) {
      encoder.encodeString(value.value)
    }
  }
}
