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
 * sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis/properties/status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis/properties/status
 */
@Serializable(with = InlineCodeScanningVariantAnalysisStatusX6c63f8f8.Serializer::class)
public sealed class InlineCodeScanningVariantAnalysisStatusX6c63f8f8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineCodeScanningVariantAnalysisStatusX6c63f8f8() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineCodeScanningVariantAnalysisStatusX6c63f8f8() {
    public override val `value`: String = "succeeded"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineCodeScanningVariantAnalysisStatusX6c63f8f8() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineCodeScanningVariantAnalysisStatusX6c63f8f8() {
    public override val `value`: String = "cancelled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningVariantAnalysisStatusX6c63f8f8()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningVariantAnalysisStatusX6c63f8f8 = when (value) {
      InProgress.value -> InProgress
      Succeeded.value -> Succeeded
      Failed.value -> Failed
      Cancelled.value -> Cancelled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeScanningVariantAnalysisStatusX6c63f8f8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningVariantAnalysisStatusX6c63f8f8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningVariantAnalysisStatusX6c63f8f8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningVariantAnalysisStatusX6c63f8f8) {
      encoder.encodeString(value.value)
    }
  }
}
