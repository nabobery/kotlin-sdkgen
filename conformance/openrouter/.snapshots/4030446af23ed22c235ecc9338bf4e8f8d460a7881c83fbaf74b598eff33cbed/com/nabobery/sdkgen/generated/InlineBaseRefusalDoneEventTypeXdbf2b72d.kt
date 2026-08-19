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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseRefusalDoneEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseRefusalDoneEvent/properties/type
 */
@Serializable(with = InlineBaseRefusalDoneEventTypeXdbf2b72d.Serializer::class)
public sealed class InlineBaseRefusalDoneEventTypeXdbf2b72d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.refusal.done`.
   */
  public data object ResponseRefusalDone : InlineBaseRefusalDoneEventTypeXdbf2b72d() {
    public override val `value`: String = "response.refusal.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseRefusalDoneEventTypeXdbf2b72d()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseRefusalDoneEventTypeXdbf2b72d = when (value) {
      ResponseRefusalDone.value -> ResponseRefusalDone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseRefusalDoneEventTypeXdbf2b72d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseRefusalDoneEventTypeXdbf2b72d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseRefusalDoneEventTypeXdbf2b72d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseRefusalDoneEventTypeXdbf2b72d) {
      encoder.encodeString(value.value)
    }
  }
}
