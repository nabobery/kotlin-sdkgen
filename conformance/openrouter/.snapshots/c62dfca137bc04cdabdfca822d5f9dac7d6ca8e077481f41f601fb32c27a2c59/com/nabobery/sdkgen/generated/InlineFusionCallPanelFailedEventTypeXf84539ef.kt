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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionCallPanelFailedEvent/properties/type
 */
@Serializable(with = InlineFusionCallPanelFailedEventTypeXf84539ef.Serializer::class)
public sealed class InlineFusionCallPanelFailedEventTypeXf84539ef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.panel.failed`.
   */
  public data object ResponseFusionCallPanelFailed : InlineFusionCallPanelFailedEventTypeXf84539ef() {
    public override val `value`: String = "response.fusion_call.panel.failed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFusionCallPanelFailedEventTypeXf84539ef()

  public companion object {
    public fun fromValue(`value`: String): InlineFusionCallPanelFailedEventTypeXf84539ef = when (value) {
      ResponseFusionCallPanelFailed.value -> ResponseFusionCallPanelFailed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFusionCallPanelFailedEventTypeXf84539ef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFusionCallPanelFailedEventTypeXf84539ef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFusionCallPanelFailedEventTypeXf84539ef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFusionCallPanelFailedEventTypeXf84539ef) {
      encoder.encodeString(value.value)
    }
  }
}
