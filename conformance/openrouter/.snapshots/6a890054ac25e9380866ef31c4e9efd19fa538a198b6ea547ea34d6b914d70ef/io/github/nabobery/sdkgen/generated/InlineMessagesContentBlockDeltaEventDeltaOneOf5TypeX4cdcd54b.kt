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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/4/properties/t
 * ype.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta/oneOf/4/properties/t
 * ype
 */
@Serializable(with = InlineMessagesContentBlockDeltaEventDeltaOneOf5TypeX4cdcd54b.Serializer::class)
public sealed class InlineMessagesContentBlockDeltaEventDeltaOneOf5TypeX4cdcd54b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `citations_delta`.
   */
  public data object CitationsDelta : InlineMessagesContentBlockDeltaEventDeltaOneOf5TypeX4cdcd54b() {
    public override val `value`: String = "citations_delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesContentBlockDeltaEventDeltaOneOf5TypeX4cdcd54b()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesContentBlockDeltaEventDeltaOneOf5TypeX4cdcd54b = when (value) {
      CitationsDelta.value -> CitationsDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesContentBlockDeltaEventDeltaOneOf5TypeX4cdcd54b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineMessagesContentBlockDeltaEventDeltaOneOf5TypeX4cdcd54b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesContentBlockDeltaEventDeltaOneOf5TypeX4cdcd54b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesContentBlockDeltaEventDeltaOneOf5TypeX4cdcd54b) {
      encoder.encodeString(value.value)
    }
  }
}
