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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations/post/requestBody/conte
 * nt/application~1json/schema/properties/code_scanning_delegated_alert_dismissal
 */
@Serializable(with = InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8.Serializer::class)
public sealed class InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8) {
      encoder.encodeString(value.value)
    }
  }
}
