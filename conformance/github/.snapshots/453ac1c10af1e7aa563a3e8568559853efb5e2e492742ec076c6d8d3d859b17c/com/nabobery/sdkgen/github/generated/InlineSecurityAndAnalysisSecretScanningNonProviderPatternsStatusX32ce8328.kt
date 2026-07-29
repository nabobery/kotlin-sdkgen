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
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_non_provider_patter
 * ns/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_non_provider_patter
 * ns/properties/status
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningNonProviderPatternsStatusX32ce8328.Serializer::class)
public sealed class InlineSecurityAndAnalysisSecretScanningNonProviderPatternsStatusX32ce8328 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineSecurityAndAnalysisSecretScanningNonProviderPatternsStatusX32ce8328() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineSecurityAndAnalysisSecretScanningNonProviderPatternsStatusX32ce8328() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecurityAndAnalysisSecretScanningNonProviderPatternsStatusX32ce8328()

  public companion object {
    public fun fromValue(`value`: String): InlineSecurityAndAnalysisSecretScanningNonProviderPatternsStatusX32ce8328 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningNonProviderPatternsStatusX32ce8328> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecurityAndAnalysisSecretScanningNonProviderPatternsStatusX32ce8328", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningNonProviderPatternsStatusX32ce8328 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningNonProviderPatternsStatusX32ce8328) {
      encoder.encodeString(value.value)
    }
  }
}
