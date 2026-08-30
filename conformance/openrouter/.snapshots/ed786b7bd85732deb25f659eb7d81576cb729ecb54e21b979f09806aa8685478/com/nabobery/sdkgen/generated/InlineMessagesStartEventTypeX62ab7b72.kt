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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/MessagesStartEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesStartEvent/properties/type
 */
@Serializable(with = InlineMessagesStartEventTypeX62ab7b72.Serializer::class)
public sealed class InlineMessagesStartEventTypeX62ab7b72 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message_start`.
   */
  public data object MessageStart : InlineMessagesStartEventTypeX62ab7b72() {
    public override val `value`: String = "message_start"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesStartEventTypeX62ab7b72()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesStartEventTypeX62ab7b72 = when (value) {
      MessageStart.value -> MessageStart
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesStartEventTypeX62ab7b72> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesStartEventTypeX62ab7b72", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesStartEventTypeX62ab7b72 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesStartEventTypeX62ab7b72) {
      encoder.encodeString(value.value)
    }
  }
}
