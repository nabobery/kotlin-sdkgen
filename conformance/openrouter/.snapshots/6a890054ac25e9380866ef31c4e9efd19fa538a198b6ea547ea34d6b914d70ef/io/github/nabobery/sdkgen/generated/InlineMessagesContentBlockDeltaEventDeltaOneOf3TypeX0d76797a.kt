package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/2/properties/t
 * ype.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/2/properties/t
 * ype
 */
@Serializable(with = InlineMessagesContentBlockDeltaEventDeltaOneOf3TypeX0d76797a.Serializer::class)
public sealed class InlineMessagesContentBlockDeltaEventDeltaOneOf3TypeX0d76797a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `thinking_delta`.
   */
  public data object ThinkingDelta : InlineMessagesContentBlockDeltaEventDeltaOneOf3TypeX0d76797a() {
    public override val `value`: String = "thinking_delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesContentBlockDeltaEventDeltaOneOf3TypeX0d76797a()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesContentBlockDeltaEventDeltaOneOf3TypeX0d76797a = when (value) {
      ThinkingDelta.value -> ThinkingDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockDeltaEventDeltaOneOf3TypeX0d76797a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesContentBlockDeltaEventDeltaOneOf3TypeX0d76797a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockDeltaEventDeltaOneOf3TypeX0d76797a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockDeltaEventDeltaOneOf3TypeX0d76797a) {
      encoder.encodeString(value.value)
    }
  }
}
