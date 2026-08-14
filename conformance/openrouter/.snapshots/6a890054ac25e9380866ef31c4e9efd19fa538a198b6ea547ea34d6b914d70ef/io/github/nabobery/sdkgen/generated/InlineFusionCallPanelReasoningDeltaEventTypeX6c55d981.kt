package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionCallPanelReasoningDeltaEvent/properties/type
 */
@Serializable(with = InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981.Serializer::class)
public sealed class InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.panel.reasoning.delta`.
   */
  public data object ResponseFusionCallPanelReasoningDelta : InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981() {
    public override val `value`: String = "response.fusion_call.panel.reasoning.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981()

  public companion object {
    public fun fromValue(`value`: String): InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981 = when (value) {
      ResponseFusionCallPanelReasoningDelta.value -> ResponseFusionCallPanelReasoningDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981) {
      encoder.encodeString(value.value)
    }
  }
}
