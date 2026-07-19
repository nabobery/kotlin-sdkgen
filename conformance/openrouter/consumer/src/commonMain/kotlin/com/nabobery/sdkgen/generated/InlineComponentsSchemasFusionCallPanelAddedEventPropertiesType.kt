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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionCallPanelAddedEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFusionCallPanelAddedEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFusionCallPanelAddedEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.panel.added`.
   */
  public data object ResponseFusionCallPanelAdded : InlineComponentsSchemasFusionCallPanelAddedEventPropertiesType() {
    public override val `value`: String = "response.fusion_call.panel.added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFusionCallPanelAddedEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFusionCallPanelAddedEventPropertiesType =
      when (value) {
      ResponseFusionCallPanelAdded.value -> ResponseFusionCallPanelAdded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionCallPanelAddedEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFusionCallPanelAddedEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionCallPanelAddedEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFusionCallPanelAddedEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
