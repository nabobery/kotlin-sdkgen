package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionCallAnalysisInProgressEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionCallAnalysisInProgressEvent/properties/type
 */
@Serializable(with = InlineFusionCallAnalysisInProgressEventTypeX56870346.Serializer::class)
public sealed class InlineFusionCallAnalysisInProgressEventTypeX56870346 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.analysis.in_progress`.
   */
  public data object ResponseFusionCallAnalysisInProgress : InlineFusionCallAnalysisInProgressEventTypeX56870346() {
    public override val `value`: String = "response.fusion_call.analysis.in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFusionCallAnalysisInProgressEventTypeX56870346()

  public companion object {
    public fun fromValue(`value`: String): InlineFusionCallAnalysisInProgressEventTypeX56870346 = when (value) {
      ResponseFusionCallAnalysisInProgress.value -> ResponseFusionCallAnalysisInProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFusionCallAnalysisInProgressEventTypeX56870346> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFusionCallAnalysisInProgressEventTypeX56870346", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFusionCallAnalysisInProgressEventTypeX56870346 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFusionCallAnalysisInProgressEventTypeX56870346) {
      encoder.encodeString(value.value)
    }
  }
}
