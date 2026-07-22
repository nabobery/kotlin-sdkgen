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
 * The new status of the CodeQL variant analysis repository task.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis-status
 */
@Serializable(with = CodeScanningVariantAnalysisStatus.Serializer::class)
public sealed class CodeScanningVariantAnalysisStatus {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : CodeScanningVariantAnalysisStatus() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : CodeScanningVariantAnalysisStatus() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : CodeScanningVariantAnalysisStatus() {
    public override val `value`: String = "succeeded"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : CodeScanningVariantAnalysisStatus() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : CodeScanningVariantAnalysisStatus() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `timed_out`.
   */
  public data object TimedOut : CodeScanningVariantAnalysisStatus() {
    public override val `value`: String = "timed_out"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : CodeScanningVariantAnalysisStatus()

  public companion object {
    public fun fromValue(`value`: String): CodeScanningVariantAnalysisStatus = when (value) {
      Pending.value -> Pending
      InProgress.value -> InProgress
      Succeeded.value -> Succeeded
      Failed.value -> Failed
      Canceled.value -> Canceled
      TimedOut.value -> TimedOut
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<CodeScanningVariantAnalysisStatus> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.CodeScanningVariantAnalysisStatus", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): CodeScanningVariantAnalysisStatus = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: CodeScanningVariantAnalysisStatus) {
      encoder.encodeString(value.value)
    }
  }
}
