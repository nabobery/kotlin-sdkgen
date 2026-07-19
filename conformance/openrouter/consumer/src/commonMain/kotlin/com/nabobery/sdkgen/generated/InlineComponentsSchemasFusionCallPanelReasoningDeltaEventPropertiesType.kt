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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionCallPanelReasoningDeltaEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFusionCallPanelReasoningDeltaEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFusionCallPanelReasoningDeltaEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.panel.reasoning.delta`.
   */
  public data object ResponseFusionCallPanelReasoningDelta : InlineComponentsSchemasFusionCallPanelReasoningDeltaEventPropertiesType() {
    public override val `value`: String = "response.fusion_call.panel.reasoning.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFusionCallPanelReasoningDeltaEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFusionCallPanelReasoningDeltaEventPropertiesType =
      when (value) {
      ResponseFusionCallPanelReasoningDelta.value -> ResponseFusionCallPanelReasoningDelta
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionCallPanelReasoningDeltaEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFusionCallPanelReasoningDeltaEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionCallPanelReasoningDeltaEventPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFusionCallPanelReasoningDeltaEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
