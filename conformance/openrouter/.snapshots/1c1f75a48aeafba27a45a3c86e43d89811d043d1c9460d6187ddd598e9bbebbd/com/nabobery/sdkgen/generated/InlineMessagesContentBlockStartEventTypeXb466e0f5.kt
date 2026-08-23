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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockStartEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockStartEvent/properties/type
 */
@Serializable(with = InlineMessagesContentBlockStartEventTypeXb466e0f5.Serializer::class)
public sealed class InlineMessagesContentBlockStartEventTypeXb466e0f5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `content_block_start`.
   */
  public data object ContentBlockStart : InlineMessagesContentBlockStartEventTypeXb466e0f5() {
    public override val `value`: String = "content_block_start"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesContentBlockStartEventTypeXb466e0f5()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesContentBlockStartEventTypeXb466e0f5 = when (value) {
      ContentBlockStart.value -> ContentBlockStart
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockStartEventTypeXb466e0f5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesContentBlockStartEventTypeXb466e0f5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockStartEventTypeXb466e0f5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockStartEventTypeXb466e0f5) {
      encoder.encodeString(value.value)
    }
  }
}
