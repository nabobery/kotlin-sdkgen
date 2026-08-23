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
 * The enablement status of GitHub Code Security features.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}/patch/requestBod
 * y/content/application~1json/schema/properties/code_security
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc.Serializer::class)
public sealed class InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc) {
      encoder.encodeString(value.value)
    }
  }
}
