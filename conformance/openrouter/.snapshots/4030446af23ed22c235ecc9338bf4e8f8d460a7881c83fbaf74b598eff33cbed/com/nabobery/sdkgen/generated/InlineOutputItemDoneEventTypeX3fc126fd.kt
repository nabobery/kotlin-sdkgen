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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputItemDoneEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemDoneEvent/properties/type
 */
@Serializable(with = InlineOutputItemDoneEventTypeX3fc126fd.Serializer::class)
public sealed class InlineOutputItemDoneEventTypeX3fc126fd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.output_item.done`.
   */
  public data object ResponseOutputItemDone : InlineOutputItemDoneEventTypeX3fc126fd() {
    public override val `value`: String = "response.output_item.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemDoneEventTypeX3fc126fd()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemDoneEventTypeX3fc126fd = when (value) {
      ResponseOutputItemDone.value -> ResponseOutputItemDone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemDoneEventTypeX3fc126fd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputItemDoneEventTypeX3fc126fd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemDoneEventTypeX3fc126fd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemDoneEventTypeX3fc126fd) {
      encoder.encodeString(value.value)
    }
  }
}
