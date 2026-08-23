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
 * sdkgen://source/openapi.yaml#/components/schemas/FusionCallCompletedEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionCallCompletedEvent/properties/type
 */
@Serializable(with = InlineFusionCallCompletedEventTypeX098a1518.Serializer::class)
public sealed class InlineFusionCallCompletedEventTypeX098a1518 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.completed`.
   */
  public data object ResponseFusionCallCompleted : InlineFusionCallCompletedEventTypeX098a1518() {
    public override val `value`: String = "response.fusion_call.completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFusionCallCompletedEventTypeX098a1518()

  public companion object {
    public fun fromValue(`value`: String): InlineFusionCallCompletedEventTypeX098a1518 = when (value) {
      ResponseFusionCallCompleted.value -> ResponseFusionCallCompleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFusionCallCompletedEventTypeX098a1518> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFusionCallCompletedEventTypeX098a1518", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFusionCallCompletedEventTypeX098a1518 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFusionCallCompletedEventTypeX098a1518) {
      encoder.encodeString(value.value)
    }
  }
}
