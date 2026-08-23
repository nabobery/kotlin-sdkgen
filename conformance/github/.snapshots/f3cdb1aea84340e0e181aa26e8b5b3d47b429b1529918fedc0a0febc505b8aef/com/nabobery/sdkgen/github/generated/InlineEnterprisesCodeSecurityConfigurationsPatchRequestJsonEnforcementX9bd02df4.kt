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
 * The enforcement status for a security configuration
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations~1{configuration_id}/pa
 * tch/requestBody/content/application~1json/schema/properties/enforcement
 */
@Serializable(with = InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4.Serializer::class)
public sealed class InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enforced`.
   */
  public data object Enforced : InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4() {
    public override val `value`: String = "enforced"
  }

  /**
   * Documented value. Wire value: `unenforced`.
   */
  public data object Unenforced : InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4() {
    public override val `value`: String = "unenforced"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4 = when (value) {
      Enforced.value -> Enforced
      Unenforced.value -> Unenforced
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4) {
      encoder.encodeString(value.value)
    }
  }
}
