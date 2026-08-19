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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseTextDeltaEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseTextDeltaEvent/properties/type
 */
@Serializable(with = InlineBaseTextDeltaEventTypeX34a64077.Serializer::class)
public sealed class InlineBaseTextDeltaEventTypeX34a64077 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.output_text.delta`.
   */
  public data object ResponseOutputTextDelta : InlineBaseTextDeltaEventTypeX34a64077() {
    public override val `value`: String = "response.output_text.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseTextDeltaEventTypeX34a64077()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseTextDeltaEventTypeX34a64077 = when (value) {
      ResponseOutputTextDelta.value -> ResponseOutputTextDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseTextDeltaEventTypeX34a64077> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseTextDeltaEventTypeX34a64077", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseTextDeltaEventTypeX34a64077 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseTextDeltaEventTypeX34a64077) {
      encoder.encodeString(value.value)
    }
  }
}
