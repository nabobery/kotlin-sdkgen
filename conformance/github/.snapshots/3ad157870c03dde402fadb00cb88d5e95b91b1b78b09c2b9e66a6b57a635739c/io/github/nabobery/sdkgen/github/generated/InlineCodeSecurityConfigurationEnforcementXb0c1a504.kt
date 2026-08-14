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
 * The enforcement status for a security configuration
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/enforcement
 */
@Serializable(with = InlineCodeSecurityConfigurationEnforcementXb0c1a504.Serializer::class)
public sealed class InlineCodeSecurityConfigurationEnforcementXb0c1a504 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enforced`.
   */
  public data object Enforced : InlineCodeSecurityConfigurationEnforcementXb0c1a504() {
    public override val `value`: String = "enforced"
  }

  /**
   * Documented value. Wire value: `unenforced`.
   */
  public data object Unenforced : InlineCodeSecurityConfigurationEnforcementXb0c1a504() {
    public override val `value`: String = "unenforced"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigurationEnforcementXb0c1a504()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigurationEnforcementXb0c1a504 = when (value) {
      Enforced.value -> Enforced
      Unenforced.value -> Unenforced
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationEnforcementXb0c1a504> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigurationEnforcementXb0c1a504", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationEnforcementXb0c1a504 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationEnforcementXb0c1a504) {
      encoder.encodeString(value.value)
    }
  }
}
