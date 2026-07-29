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
 * The bypass mode for the reviewer
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_bypass_op
 * tions/properties/reviewers/items/properties/mode
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemModeX447e95c5.Serializer::class)
public sealed class InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemModeX447e95c5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ALWAYS`.
   */
  public data object Always : InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemModeX447e95c5() {
    public override val `value`: String = "ALWAYS"
  }

  /**
   * Documented value. Wire value: `EXEMPT`.
   */
  public data object Exempt : InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemModeX447e95c5() {
    public override val `value`: String = "EXEMPT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemModeX447e95c5()

  public companion object {
    public fun fromValue(`value`: String): InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemModeX447e95c5 = when (value) {
      Always.value -> Always
      Exempt.value -> Exempt
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemModeX447e95c5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemModeX447e95c5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemModeX447e95c5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemModeX447e95c5) {
      encoder.encodeString(value.value)
    }
  }
}
