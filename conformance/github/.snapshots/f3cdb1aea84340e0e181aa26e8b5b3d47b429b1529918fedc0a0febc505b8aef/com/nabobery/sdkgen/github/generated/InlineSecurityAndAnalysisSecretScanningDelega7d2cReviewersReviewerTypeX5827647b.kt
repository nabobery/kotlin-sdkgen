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
 * The type of the bypass reviewer
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_bypass_op
 * tions/properties/reviewers/items/properties/reviewer_type
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b.Serializer::class)
public sealed class InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `TEAM`.
   */
  public data object Team : InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b() {
    public override val `value`: String = "TEAM"
  }

  /**
   * Documented value. Wire value: `ROLE`.
   */
  public data object Role : InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b() {
    public override val `value`: String = "ROLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b()

  public companion object {
    public fun fromValue(`value`: String): InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b = when (value) {
      Team.value -> Team
      Role.value -> Role
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersReviewerTypeX5827647b) {
      encoder.encodeString(value.value)
    }
  }
}
