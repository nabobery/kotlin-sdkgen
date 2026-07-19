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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionCallPanelFailedEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFusionCallPanelFailedEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFusionCallPanelFailedEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.panel.failed`.
   */
  public data object ResponseFusionCallPanelFailed : InlineComponentsSchemasFusionCallPanelFailedEventPropertiesType() {
    public override val `value`: String = "response.fusion_call.panel.failed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFusionCallPanelFailedEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFusionCallPanelFailedEventPropertiesType =
      when (value) {
      ResponseFusionCallPanelFailed.value -> ResponseFusionCallPanelFailed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionCallPanelFailedEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFusionCallPanelFailedEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionCallPanelFailedEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFusionCallPanelFailedEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
