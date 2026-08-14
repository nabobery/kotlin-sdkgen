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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionCallPanelCompletedEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionCallPanelCompletedEvent/properties/type
 */
@Serializable(with = InlineFusionCallPanelCompletedEventTypeXccd0e5e6.Serializer::class)
public sealed class InlineFusionCallPanelCompletedEventTypeXccd0e5e6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.panel.completed`.
   */
  public data object ResponseFusionCallPanelCompleted : InlineFusionCallPanelCompletedEventTypeXccd0e5e6() {
    public override val `value`: String = "response.fusion_call.panel.completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFusionCallPanelCompletedEventTypeXccd0e5e6()

  public companion object {
    public fun fromValue(`value`: String): InlineFusionCallPanelCompletedEventTypeXccd0e5e6 = when (value) {
      ResponseFusionCallPanelCompleted.value -> ResponseFusionCallPanelCompleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFusionCallPanelCompletedEventTypeXccd0e5e6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineFusionCallPanelCompletedEventTypeXccd0e5e6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFusionCallPanelCompletedEventTypeXccd0e5e6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFusionCallPanelCompletedEventTypeXccd0e5e6) {
      encoder.encodeString(value.value)
    }
  }
}
