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
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_alert_dis
 * missal/properties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_alert_dis
 * missal/properties/status
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalStatusX814333d7.Serializer::class)
public sealed class InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalStatusX814333d7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalStatusX814333d7() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalStatusX814333d7() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalStatusX814333d7()

  public companion object {
    public fun fromValue(`value`: String): InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalStatusX814333d7 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalStatusX814333d7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalStatusX814333d7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalStatusX814333d7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalStatusX814333d7) {
      encoder.encodeString(value.value)
    }
  }
}
