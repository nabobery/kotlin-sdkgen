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
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/advanced_security/properties/status
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/advanced_security/properties/status
 */
@Serializable(with = InlineSecurityAndAnalysisAdvancedSecurityStatusX30d610a5.Serializer::class)
public sealed class InlineSecurityAndAnalysisAdvancedSecurityStatusX30d610a5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineSecurityAndAnalysisAdvancedSecurityStatusX30d610a5() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineSecurityAndAnalysisAdvancedSecurityStatusX30d610a5() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecurityAndAnalysisAdvancedSecurityStatusX30d610a5()

  public companion object {
    public fun fromValue(`value`: String): InlineSecurityAndAnalysisAdvancedSecurityStatusX30d610a5 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecurityAndAnalysisAdvancedSecurityStatusX30d610a5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecurityAndAnalysisAdvancedSecurityStatusX30d610a5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisAdvancedSecurityStatusX30d610a5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisAdvancedSecurityStatusX30d610a5) {
      encoder.encodeString(value.value)
    }
  }
}
