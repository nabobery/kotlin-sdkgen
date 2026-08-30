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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/security_and_analysis/properties/secret_scanning_delegated_bypass_options/properties/reviewers/items/properties
 * /reviewer_type
 */
@Serializable(with = InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554.Serializer::class)
public sealed class InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `TEAM`.
   */
  public data object Team : InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554() {
    public override val `value`: String = "TEAM"
  }

  /**
   * Documented value. Wire value: `ROLE`.
   */
  public data object Role : InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554() {
    public override val `value`: String = "ROLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554 = when (value) {
      Team.value -> Team
      Role.value -> Role
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonSecurityAndAnalysisReviewerTypeX962c9554) {
      encoder.encodeString(value.value)
    }
  }
}
