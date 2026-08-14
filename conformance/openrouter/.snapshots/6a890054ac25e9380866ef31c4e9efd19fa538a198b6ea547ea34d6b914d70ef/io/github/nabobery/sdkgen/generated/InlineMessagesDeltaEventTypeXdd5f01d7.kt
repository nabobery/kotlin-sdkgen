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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/MessagesDeltaEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesDeltaEvent/properties/type
 */
@Serializable(with = InlineMessagesDeltaEventTypeXdd5f01d7.Serializer::class)
public sealed class InlineMessagesDeltaEventTypeXdd5f01d7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message_delta`.
   */
  public data object MessageDelta : InlineMessagesDeltaEventTypeXdd5f01d7() {
    public override val `value`: String = "message_delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesDeltaEventTypeXdd5f01d7()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesDeltaEventTypeXdd5f01d7 = when (value) {
      MessageDelta.value -> MessageDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesDeltaEventTypeXdd5f01d7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesDeltaEventTypeXdd5f01d7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesDeltaEventTypeXdd5f01d7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesDeltaEventTypeXdd5f01d7) {
      encoder.encodeString(value.value)
    }
  }
}
