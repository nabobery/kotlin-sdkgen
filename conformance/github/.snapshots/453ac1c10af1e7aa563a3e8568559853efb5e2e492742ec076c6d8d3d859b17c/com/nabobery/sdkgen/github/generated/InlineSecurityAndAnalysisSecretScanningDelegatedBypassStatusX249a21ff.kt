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
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_bypass/pr
 * operties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_bypass/pr
 * operties/status
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningDelegatedBypassStatusX249a21ff.Serializer::class)
public sealed class InlineSecurityAndAnalysisSecretScanningDelegatedBypassStatusX249a21ff {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineSecurityAndAnalysisSecretScanningDelegatedBypassStatusX249a21ff() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineSecurityAndAnalysisSecretScanningDelegatedBypassStatusX249a21ff() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecurityAndAnalysisSecretScanningDelegatedBypassStatusX249a21ff()

  public companion object {
    public fun fromValue(`value`: String): InlineSecurityAndAnalysisSecretScanningDelegatedBypassStatusX249a21ff = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningDelegatedBypassStatusX249a21ff> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecurityAndAnalysisSecretScanningDelegatedBypassStatusX249a21ff", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningDelegatedBypassStatusX249a21ff = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningDelegatedBypassStatusX249a21ff) {
      encoder.encodeString(value.value)
    }
  }
}
