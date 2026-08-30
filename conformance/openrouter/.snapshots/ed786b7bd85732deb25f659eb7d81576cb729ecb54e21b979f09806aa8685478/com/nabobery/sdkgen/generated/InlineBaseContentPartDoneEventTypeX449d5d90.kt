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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseContentPartDoneEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseContentPartDoneEvent/properties/type
 */
@Serializable(with = InlineBaseContentPartDoneEventTypeX449d5d90.Serializer::class)
public sealed class InlineBaseContentPartDoneEventTypeX449d5d90 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.content_part.done`.
   */
  public data object ResponseContentPartDone : InlineBaseContentPartDoneEventTypeX449d5d90() {
    public override val `value`: String = "response.content_part.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseContentPartDoneEventTypeX449d5d90()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseContentPartDoneEventTypeX449d5d90 = when (value) {
      ResponseContentPartDone.value -> ResponseContentPartDone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseContentPartDoneEventTypeX449d5d90> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseContentPartDoneEventTypeX449d5d90", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseContentPartDoneEventTypeX449d5d90 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseContentPartDoneEventTypeX449d5d90) {
      encoder.encodeString(value.value)
    }
  }
}
