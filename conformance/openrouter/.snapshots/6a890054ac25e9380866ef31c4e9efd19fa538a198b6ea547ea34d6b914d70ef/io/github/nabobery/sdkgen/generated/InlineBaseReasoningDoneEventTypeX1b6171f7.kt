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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningDoneEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningDoneEvent/properties/type
 */
@Serializable(with = InlineBaseReasoningDoneEventTypeX1b6171f7.Serializer::class)
public sealed class InlineBaseReasoningDoneEventTypeX1b6171f7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.reasoning_text.done`.
   */
  public data object ResponseReasoningTextDone : InlineBaseReasoningDoneEventTypeX1b6171f7() {
    public override val `value`: String = "response.reasoning_text.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseReasoningDoneEventTypeX1b6171f7()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseReasoningDoneEventTypeX1b6171f7 = when (value) {
      ResponseReasoningTextDone.value -> ResponseReasoningTextDone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseReasoningDoneEventTypeX1b6171f7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBaseReasoningDoneEventTypeX1b6171f7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseReasoningDoneEventTypeX1b6171f7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseReasoningDoneEventTypeX1b6171f7) {
      encoder.encodeString(value.value)
    }
  }
}
