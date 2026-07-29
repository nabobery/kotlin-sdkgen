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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/get/parameters/1/schema
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsGetParameterX53924fbc.Serializer::class)
public sealed class InlineOrgsCodeSecurityConfigurationsGetParameterX53924fbc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `global`.
   */
  public data object Global : InlineOrgsCodeSecurityConfigurationsGetParameterX53924fbc() {
    public override val `value`: String = "global"
  }

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : InlineOrgsCodeSecurityConfigurationsGetParameterX53924fbc() {
    public override val `value`: String = "all"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConfigurationsGetParameterX53924fbc()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConfigurationsGetParameterX53924fbc = when (value) {
      Global.value -> Global
      All.value -> All
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsGetParameterX53924fbc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsGetParameterX53924fbc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsGetParameterX53924fbc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsGetParameterX53924fbc) {
      encoder.encodeString(value.value)
    }
  }
}
