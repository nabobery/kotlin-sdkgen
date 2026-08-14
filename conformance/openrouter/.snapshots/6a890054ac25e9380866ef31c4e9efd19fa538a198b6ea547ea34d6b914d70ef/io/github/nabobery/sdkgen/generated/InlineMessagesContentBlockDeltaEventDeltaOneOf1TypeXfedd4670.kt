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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/0/properties/t
 * ype.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/0/properties/t
 * ype
 */
@Serializable(with = InlineMessagesContentBlockDeltaEventDeltaOneOf1TypeXfedd4670.Serializer::class)
public sealed class InlineMessagesContentBlockDeltaEventDeltaOneOf1TypeXfedd4670 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text_delta`.
   */
  public data object TextDelta : InlineMessagesContentBlockDeltaEventDeltaOneOf1TypeXfedd4670() {
    public override val `value`: String = "text_delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesContentBlockDeltaEventDeltaOneOf1TypeXfedd4670()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesContentBlockDeltaEventDeltaOneOf1TypeXfedd4670 = when (value) {
      TextDelta.value -> TextDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockDeltaEventDeltaOneOf1TypeXfedd4670> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesContentBlockDeltaEventDeltaOneOf1TypeXfedd4670", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockDeltaEventDeltaOneOf1TypeXfedd4670 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockDeltaEventDeltaOneOf1TypeXfedd4670) {
      encoder.encodeString(value.value)
    }
  }
}
