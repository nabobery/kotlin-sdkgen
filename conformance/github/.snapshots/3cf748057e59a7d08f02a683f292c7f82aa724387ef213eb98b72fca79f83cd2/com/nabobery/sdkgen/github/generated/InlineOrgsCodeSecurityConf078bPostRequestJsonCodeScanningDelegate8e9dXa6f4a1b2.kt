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
 * The enablement status of code scanning delegated alert dismissal
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/code_scanning_delegated_alert_dismissal
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2.Serializer::class)
public sealed class InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2) {
      encoder.encodeString(value.value)
    }
  }
}
