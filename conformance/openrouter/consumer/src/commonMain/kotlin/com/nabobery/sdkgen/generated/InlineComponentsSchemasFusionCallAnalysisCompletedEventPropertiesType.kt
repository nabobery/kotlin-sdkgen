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
 */
@Serializable(with = InlineComponentsSchemasFusionCallAnalysisCompletedEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFusionCallAnalysisCompletedEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.analysis.completed`.
   */
  public data object ResponseFusionCallAnalysisCompleted : InlineComponentsSchemasFusionCallAnalysisCompletedEventPropertiesType() {
    public override val `value`: String = "response.fusion_call.analysis.completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFusionCallAnalysisCompletedEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFusionCallAnalysisCompletedEventPropertiesType =
      when (value) {
      ResponseFusionCallAnalysisCompleted.value -> ResponseFusionCallAnalysisCompleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionCallAnalysisCompletedEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFusionCallAnalysisCompletedEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionCallAnalysisCompletedEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFusionCallAnalysisCompletedEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
