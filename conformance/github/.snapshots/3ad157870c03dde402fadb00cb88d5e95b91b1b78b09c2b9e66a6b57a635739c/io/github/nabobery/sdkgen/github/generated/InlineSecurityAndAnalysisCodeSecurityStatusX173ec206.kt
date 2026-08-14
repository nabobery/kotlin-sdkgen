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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/code_security/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/code_security/properties/status
 */
@Serializable(with = InlineSecurityAndAnalysisCodeSecurityStatusX173ec206.Serializer::class)
public sealed class InlineSecurityAndAnalysisCodeSecurityStatusX173ec206 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineSecurityAndAnalysisCodeSecurityStatusX173ec206() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineSecurityAndAnalysisCodeSecurityStatusX173ec206() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecurityAndAnalysisCodeSecurityStatusX173ec206()

  public companion object {
    public fun fromValue(`value`: String): InlineSecurityAndAnalysisCodeSecurityStatusX173ec206 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecurityAndAnalysisCodeSecurityStatusX173ec206> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSecurityAndAnalysisCodeSecurityStatusX173ec206", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisCodeSecurityStatusX173ec206 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisCodeSecurityStatusX173ec206) {
      encoder.encodeString(value.value)
    }
  }
}
