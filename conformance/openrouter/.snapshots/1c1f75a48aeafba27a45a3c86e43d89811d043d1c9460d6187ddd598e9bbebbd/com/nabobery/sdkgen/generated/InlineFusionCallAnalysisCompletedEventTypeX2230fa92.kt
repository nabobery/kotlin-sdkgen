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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionCallAnalysisCompletedEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionCallAnalysisCompletedEvent/properties/type
 */
@Serializable(with = InlineFusionCallAnalysisCompletedEventTypeX2230fa92.Serializer::class)
public sealed class InlineFusionCallAnalysisCompletedEventTypeX2230fa92 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.analysis.completed`.
   */
  public data object ResponseFusionCallAnalysisCompleted : InlineFusionCallAnalysisCompletedEventTypeX2230fa92() {
    public override val `value`: String = "response.fusion_call.analysis.completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFusionCallAnalysisCompletedEventTypeX2230fa92()

  public companion object {
    public fun fromValue(`value`: String): InlineFusionCallAnalysisCompletedEventTypeX2230fa92 = when (value) {
      ResponseFusionCallAnalysisCompleted.value -> ResponseFusionCallAnalysisCompleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFusionCallAnalysisCompletedEventTypeX2230fa92> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFusionCallAnalysisCompletedEventTypeX2230fa92", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFusionCallAnalysisCompletedEventTypeX2230fa92 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFusionCallAnalysisCompletedEventTypeX2230fa92) {
      encoder.encodeString(value.value)
    }
  }
}
