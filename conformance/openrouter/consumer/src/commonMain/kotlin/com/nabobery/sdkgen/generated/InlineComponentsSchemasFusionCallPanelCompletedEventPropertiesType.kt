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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionCallPanelCompletedEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFusionCallPanelCompletedEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFusionCallPanelCompletedEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.panel.completed`.
   */
  public data object ResponseFusionCallPanelCompleted : InlineComponentsSchemasFusionCallPanelCompletedEventPropertiesType() {
    public override val `value`: String = "response.fusion_call.panel.completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFusionCallPanelCompletedEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFusionCallPanelCompletedEventPropertiesType =
      when (value) {
      ResponseFusionCallPanelCompleted.value -> ResponseFusionCallPanelCompleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionCallPanelCompletedEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFusionCallPanelCompletedEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionCallPanelCompletedEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFusionCallPanelCompletedEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
