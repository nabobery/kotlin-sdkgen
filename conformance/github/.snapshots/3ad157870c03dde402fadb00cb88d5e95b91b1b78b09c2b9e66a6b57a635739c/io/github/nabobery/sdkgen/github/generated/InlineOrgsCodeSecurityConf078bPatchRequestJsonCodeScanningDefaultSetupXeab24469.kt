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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}/patch/requestBod
 * y/content/application~1json/schema/properties/code_scanning_default_setup
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469.Serializer::class)
public sealed class InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469) {
      encoder.encodeString(value.value)
    }
  }
}
