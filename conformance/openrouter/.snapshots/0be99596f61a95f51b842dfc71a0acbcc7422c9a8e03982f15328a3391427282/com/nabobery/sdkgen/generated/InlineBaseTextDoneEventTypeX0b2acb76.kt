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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseTextDoneEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseTextDoneEvent/properties/type
 */
@Serializable(with = InlineBaseTextDoneEventTypeX0b2acb76.Serializer::class)
public sealed class InlineBaseTextDoneEventTypeX0b2acb76 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.output_text.done`.
   */
  public data object ResponseOutputTextDone : InlineBaseTextDoneEventTypeX0b2acb76() {
    public override val `value`: String = "response.output_text.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseTextDoneEventTypeX0b2acb76()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseTextDoneEventTypeX0b2acb76 = when (value) {
      ResponseOutputTextDone.value -> ResponseOutputTextDone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseTextDoneEventTypeX0b2acb76> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseTextDoneEventTypeX0b2acb76", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseTextDoneEventTypeX0b2acb76 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseTextDoneEventTypeX0b2acb76) {
      encoder.encodeString(value.value)
    }
  }
}
