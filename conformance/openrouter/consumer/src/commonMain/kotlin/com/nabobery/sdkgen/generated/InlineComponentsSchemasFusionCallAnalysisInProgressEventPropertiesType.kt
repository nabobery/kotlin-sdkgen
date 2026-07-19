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
 */
@Serializable(with = InlineComponentsSchemasFusionCallAnalysisInProgressEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFusionCallAnalysisInProgressEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.analysis.in_progress`.
   */
  public data object ResponseFusionCallAnalysisInProgress : InlineComponentsSchemasFusionCallAnalysisInProgressEventPropertiesType() {
    public override val `value`: String = "response.fusion_call.analysis.in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFusionCallAnalysisInProgressEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFusionCallAnalysisInProgressEventPropertiesType =
      when (value) {
      ResponseFusionCallAnalysisInProgress.value -> ResponseFusionCallAnalysisInProgress
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionCallAnalysisInProgressEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFusionCallAnalysisInProgressEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionCallAnalysisInProgressEventPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFusionCallAnalysisInProgressEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
