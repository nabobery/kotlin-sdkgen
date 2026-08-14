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
 * The enablement status of GitHub Code Security features.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations~1{configuration_id}/pa
 * tch/requestBody/content/application~1json/schema/properties/code_security
 */
@Serializable(with = InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111.Serializer::class)
public sealed class InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111) {
      encoder.encodeString(value.value)
    }
  }
}
