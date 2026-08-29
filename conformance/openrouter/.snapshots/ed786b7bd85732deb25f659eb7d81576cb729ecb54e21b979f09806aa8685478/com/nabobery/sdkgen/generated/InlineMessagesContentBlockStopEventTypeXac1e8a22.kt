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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockStopEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockStopEvent/properties/type
 */
@Serializable(with = InlineMessagesContentBlockStopEventTypeXac1e8a22.Serializer::class)
public sealed class InlineMessagesContentBlockStopEventTypeXac1e8a22 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `content_block_stop`.
   */
  public data object ContentBlockStop : InlineMessagesContentBlockStopEventTypeXac1e8a22() {
    public override val `value`: String = "content_block_stop"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesContentBlockStopEventTypeXac1e8a22()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesContentBlockStopEventTypeXac1e8a22 = when (value) {
      ContentBlockStop.value -> ContentBlockStop
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockStopEventTypeXac1e8a22> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesContentBlockStopEventTypeXac1e8a22", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockStopEventTypeXac1e8a22 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockStopEventTypeXac1e8a22) {
      encoder.encodeString(value.value)
    }
  }
}
