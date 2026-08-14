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
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations/post/requestBody/conte
 * nt/application~1json/schema/properties/enforcement
 */
@Serializable(with = InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonEnforcementX75dcd0b7.Serializer::class)
public sealed class InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonEnforcementX75dcd0b7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enforced`.
   */
  public data object Enforced : InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonEnforcementX75dcd0b7() {
    public override val `value`: String = "enforced"
  }

  /**
   * Documented value. Wire value: `unenforced`.
   */
  public data object Unenforced : InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonEnforcementX75dcd0b7() {
    public override val `value`: String = "unenforced"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonEnforcementX75dcd0b7()

  public companion object {
    public fun fromValue(`value`: String): InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonEnforcementX75dcd0b7 = when (value) {
      Enforced.value -> Enforced
      Unenforced.value -> Unenforced
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonEnforcementX75dcd0b7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonEnforcementX75dcd0b7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonEnforcementX75dcd0b7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonEnforcementX75dcd0b7) {
      encoder.encodeString(value.value)
    }
  }
}
