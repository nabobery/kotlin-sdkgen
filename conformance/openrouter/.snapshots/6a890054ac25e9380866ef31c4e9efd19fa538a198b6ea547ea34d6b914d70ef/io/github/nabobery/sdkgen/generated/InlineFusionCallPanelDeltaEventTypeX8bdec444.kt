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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionCallPanelDeltaEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionCallPanelDeltaEvent/properties/type
 */
@Serializable(with = InlineFusionCallPanelDeltaEventTypeX8bdec444.Serializer::class)
public sealed class InlineFusionCallPanelDeltaEventTypeX8bdec444 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.panel.delta`.
   */
  public data object ResponseFusionCallPanelDelta : InlineFusionCallPanelDeltaEventTypeX8bdec444() {
    public override val `value`: String = "response.fusion_call.panel.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFusionCallPanelDeltaEventTypeX8bdec444()

  public companion object {
    public fun fromValue(`value`: String): InlineFusionCallPanelDeltaEventTypeX8bdec444 = when (value) {
      ResponseFusionCallPanelDelta.value -> ResponseFusionCallPanelDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFusionCallPanelDeltaEventTypeX8bdec444> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineFusionCallPanelDeltaEventTypeX8bdec444", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFusionCallPanelDeltaEventTypeX8bdec444 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFusionCallPanelDeltaEventTypeX8bdec444) {
      encoder.encodeString(value.value)
    }
  }
}
