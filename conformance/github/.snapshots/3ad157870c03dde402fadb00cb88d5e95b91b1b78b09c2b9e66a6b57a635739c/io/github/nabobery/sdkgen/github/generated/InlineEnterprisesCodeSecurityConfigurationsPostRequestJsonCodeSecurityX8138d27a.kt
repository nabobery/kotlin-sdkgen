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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations/post/requestBody/conte
 * nt/application~1json/schema/properties/code_security
 */
@Serializable(with = InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a.Serializer::class)
public sealed class InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a) {
      encoder.encodeString(value.value)
    }
  }
}
