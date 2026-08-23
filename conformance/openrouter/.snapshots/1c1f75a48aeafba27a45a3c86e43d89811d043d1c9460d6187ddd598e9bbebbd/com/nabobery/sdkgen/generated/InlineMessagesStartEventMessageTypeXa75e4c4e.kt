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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesStartEvent/properties/message/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesStartEvent/properties/message/properties/type
 */
@Serializable(with = InlineMessagesStartEventMessageTypeXa75e4c4e.Serializer::class)
public sealed class InlineMessagesStartEventMessageTypeXa75e4c4e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message`.
   */
  public data object Message : InlineMessagesStartEventMessageTypeXa75e4c4e() {
    public override val `value`: String = "message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesStartEventMessageTypeXa75e4c4e()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesStartEventMessageTypeXa75e4c4e = when (value) {
      Message.value -> Message
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesStartEventMessageTypeXa75e4c4e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesStartEventMessageTypeXa75e4c4e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesStartEventMessageTypeXa75e4c4e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesStartEventMessageTypeXa75e4c4e) {
      encoder.encodeString(value.value)
    }
  }
}
