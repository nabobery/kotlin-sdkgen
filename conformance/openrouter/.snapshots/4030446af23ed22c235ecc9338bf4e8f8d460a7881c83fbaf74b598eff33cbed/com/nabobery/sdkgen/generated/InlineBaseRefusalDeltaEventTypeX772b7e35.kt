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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseRefusalDeltaEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseRefusalDeltaEvent/properties/type
 */
@Serializable(with = InlineBaseRefusalDeltaEventTypeX772b7e35.Serializer::class)
public sealed class InlineBaseRefusalDeltaEventTypeX772b7e35 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.refusal.delta`.
   */
  public data object ResponseRefusalDelta : InlineBaseRefusalDeltaEventTypeX772b7e35() {
    public override val `value`: String = "response.refusal.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseRefusalDeltaEventTypeX772b7e35()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseRefusalDeltaEventTypeX772b7e35 = when (value) {
      ResponseRefusalDelta.value -> ResponseRefusalDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseRefusalDeltaEventTypeX772b7e35> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseRefusalDeltaEventTypeX772b7e35", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseRefusalDeltaEventTypeX772b7e35 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseRefusalDeltaEventTypeX772b7e35) {
      encoder.encodeString(value.value)
    }
  }
}
