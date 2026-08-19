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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionCallPanelAddedEvent/properties/type
 */
@Serializable(with = InlineFusionCallPanelAddedEventTypeXa7e7b6c6.Serializer::class)
public sealed class InlineFusionCallPanelAddedEventTypeXa7e7b6c6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.panel.added`.
   */
  public data object ResponseFusionCallPanelAdded : InlineFusionCallPanelAddedEventTypeXa7e7b6c6() {
    public override val `value`: String = "response.fusion_call.panel.added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFusionCallPanelAddedEventTypeXa7e7b6c6()

  public companion object {
    public fun fromValue(`value`: String): InlineFusionCallPanelAddedEventTypeXa7e7b6c6 = when (value) {
      ResponseFusionCallPanelAdded.value -> ResponseFusionCallPanelAdded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFusionCallPanelAddedEventTypeXa7e7b6c6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFusionCallPanelAddedEventTypeXa7e7b6c6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFusionCallPanelAddedEventTypeXa7e7b6c6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFusionCallPanelAddedEventTypeXa7e7b6c6) {
      encoder.encodeString(value.value)
    }
  }
}
