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
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_ai_detection/proper
 * ties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_ai_detection/proper
 * ties/status
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningAiDetectionStatusX08004b6e.Serializer::class)
public sealed class InlineSecurityAndAnalysisSecretScanningAiDetectionStatusX08004b6e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineSecurityAndAnalysisSecretScanningAiDetectionStatusX08004b6e() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineSecurityAndAnalysisSecretScanningAiDetectionStatusX08004b6e() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecurityAndAnalysisSecretScanningAiDetectionStatusX08004b6e()

  public companion object {
    public fun fromValue(`value`: String): InlineSecurityAndAnalysisSecretScanningAiDetectionStatusX08004b6e = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningAiDetectionStatusX08004b6e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecurityAndAnalysisSecretScanningAiDetectionStatusX08004b6e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningAiDetectionStatusX08004b6e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningAiDetectionStatusX08004b6e) {
      encoder.encodeString(value.value)
    }
  }
}
