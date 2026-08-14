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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/enforcement
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsPostRequestJsonEnforcementX300a40b4.Serializer::class)
public sealed class InlineOrgsCodeSecurityConfigurationsPostRequestJsonEnforcementX300a40b4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enforced`.
   */
  public data object Enforced : InlineOrgsCodeSecurityConfigurationsPostRequestJsonEnforcementX300a40b4() {
    public override val `value`: String = "enforced"
  }

  /**
   * Documented value. Wire value: `unenforced`.
   */
  public data object Unenforced : InlineOrgsCodeSecurityConfigurationsPostRequestJsonEnforcementX300a40b4() {
    public override val `value`: String = "unenforced"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeSecurityConfigurationsPostRequestJsonEnforcementX300a40b4()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeSecurityConfigurationsPostRequestJsonEnforcementX300a40b4 = when (value) {
      Enforced.value -> Enforced
      Unenforced.value -> Unenforced
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsPostRequestJsonEnforcementX300a40b4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeSecurityConfigurationsPostRequestJsonEnforcementX300a40b4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsPostRequestJsonEnforcementX300a40b4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsPostRequestJsonEnforcementX300a40b4) {
      encoder.encodeString(value.value)
    }
  }
}
