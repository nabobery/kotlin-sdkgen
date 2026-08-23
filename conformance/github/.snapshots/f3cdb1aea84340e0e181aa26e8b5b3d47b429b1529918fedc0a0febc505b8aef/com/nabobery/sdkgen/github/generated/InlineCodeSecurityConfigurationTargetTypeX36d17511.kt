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
 * The type of the code security configuration.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/target_type
 */
@Serializable(with = InlineCodeSecurityConfigurationTargetTypeX36d17511.Serializer::class)
public sealed class InlineCodeSecurityConfigurationTargetTypeX36d17511 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `global`.
   */
  public data object Global : InlineCodeSecurityConfigurationTargetTypeX36d17511() {
    public override val `value`: String = "global"
  }

  /**
   * Documented value. Wire value: `organization`.
   */
  public data object Organization : InlineCodeSecurityConfigurationTargetTypeX36d17511() {
    public override val `value`: String = "organization"
  }

  /**
   * Documented value. Wire value: `enterprise`.
   */
  public data object Enterprise : InlineCodeSecurityConfigurationTargetTypeX36d17511() {
    public override val `value`: String = "enterprise"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationTargetTypeX36d17511()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationTargetTypeX36d17511 = when (value) {
      Global.value -> Global
      Organization.value -> Organization
      Enterprise.value -> Enterprise
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationTargetTypeX36d17511> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationTargetTypeX36d17511", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationTargetTypeX36d17511 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationTargetTypeX36d17511) {
      encoder.encodeString(value.value)
    }
  }
}
