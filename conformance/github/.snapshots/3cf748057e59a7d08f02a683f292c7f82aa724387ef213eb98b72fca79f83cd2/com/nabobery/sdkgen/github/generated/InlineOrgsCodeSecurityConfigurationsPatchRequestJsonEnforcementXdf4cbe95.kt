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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}/patch/requestBod
 * y/content/application~1json/schema/properties/enforcement
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95.Serializer::class)
public sealed class InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enforced`.
   */
  public data object Enforced : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95() {
    public override val `value`: String = "enforced"
  }

  /**
   * Documented value. Wire value: `unenforced`.
   */
  public data object Unenforced : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95() {
    public override val `value`: String = "unenforced"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95 = when (value) {
      Enforced.value -> Enforced
      Unenforced.value -> Unenforced
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95) {
      encoder.encodeString(value.value)
    }
  }
}
