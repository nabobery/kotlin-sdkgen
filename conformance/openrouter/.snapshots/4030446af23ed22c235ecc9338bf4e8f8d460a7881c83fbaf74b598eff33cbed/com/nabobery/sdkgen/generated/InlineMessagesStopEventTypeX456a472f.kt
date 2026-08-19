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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/MessagesStopEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesStopEvent/properties/type
 */
@Serializable(with = InlineMessagesStopEventTypeX456a472f.Serializer::class)
public sealed class InlineMessagesStopEventTypeX456a472f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message_stop`.
   */
  public data object MessageStop : InlineMessagesStopEventTypeX456a472f() {
    public override val `value`: String = "message_stop"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesStopEventTypeX456a472f()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesStopEventTypeX456a472f = when (value) {
      MessageStop.value -> MessageStop
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesStopEventTypeX456a472f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesStopEventTypeX456a472f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesStopEventTypeX456a472f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesStopEventTypeX456a472f) {
      encoder.encodeString(value.value)
    }
  }
}
