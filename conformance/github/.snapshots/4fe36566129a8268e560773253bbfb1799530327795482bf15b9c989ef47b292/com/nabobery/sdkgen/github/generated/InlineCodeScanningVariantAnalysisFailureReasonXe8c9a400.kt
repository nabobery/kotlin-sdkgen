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
 * The reason for a failure of the variant analysis. This is only available if the variant analysis has failed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis/properties/failure_reason
 */
@Serializable(with = InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400.Serializer::class)
public sealed class InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `no_repos_queried`.
   */
  public data object NoReposQueried : InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400() {
    public override val `value`: String = "no_repos_queried"
  }

  /**
   * Documented value. Wire value: `actions_workflow_run_failed`.
   */
  public data object ActionsWorkflowRunFailed : InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400() {
    public override val `value`: String = "actions_workflow_run_failed"
  }

  /**
   * Documented value. Wire value: `internal_error`.
   */
  public data object InternalError : InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400() {
    public override val `value`: String = "internal_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400 = when (value) {
      NoReposQueried.value -> NoReposQueried
      ActionsWorkflowRunFailed.value -> ActionsWorkflowRunFailed
      InternalError.value -> InternalError
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400) {
      encoder.encodeString(value.value)
    }
  }
}
