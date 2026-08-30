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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/type
 */
@Serializable(with = InlineMessagesContentBlockDeltaEventTypeXceafe8ab.Serializer::class)
public sealed class InlineMessagesContentBlockDeltaEventTypeXceafe8ab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `content_block_delta`.
   */
  public data object ContentBlockDelta : InlineMessagesContentBlockDeltaEventTypeXceafe8ab() {
    public override val `value`: String = "content_block_delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesContentBlockDeltaEventTypeXceafe8ab()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesContentBlockDeltaEventTypeXceafe8ab = when (value) {
      ContentBlockDelta.value -> ContentBlockDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockDeltaEventTypeXceafe8ab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesContentBlockDeltaEventTypeXceafe8ab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockDeltaEventTypeXceafe8ab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockDeltaEventTypeXceafe8ab) {
      encoder.encodeString(value.value)
    }
  }
}
