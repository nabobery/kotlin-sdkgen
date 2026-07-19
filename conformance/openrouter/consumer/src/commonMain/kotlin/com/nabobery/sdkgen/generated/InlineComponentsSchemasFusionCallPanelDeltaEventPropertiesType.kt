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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionCallPanelDeltaEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFusionCallPanelDeltaEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFusionCallPanelDeltaEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.panel.delta`.
   */
  public data object ResponseFusionCallPanelDelta : InlineComponentsSchemasFusionCallPanelDeltaEventPropertiesType() {
    public override val `value`: String = "response.fusion_call.panel.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFusionCallPanelDeltaEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFusionCallPanelDeltaEventPropertiesType =
      when (value) {
      ResponseFusionCallPanelDelta.value -> ResponseFusionCallPanelDelta
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionCallPanelDeltaEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFusionCallPanelDeltaEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionCallPanelDeltaEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFusionCallPanelDeltaEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
