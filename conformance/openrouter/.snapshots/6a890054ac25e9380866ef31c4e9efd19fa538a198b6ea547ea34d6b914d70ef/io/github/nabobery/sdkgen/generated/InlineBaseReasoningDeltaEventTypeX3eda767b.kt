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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningDeltaEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningDeltaEvent/properties/type
 */
@Serializable(with = InlineBaseReasoningDeltaEventTypeX3eda767b.Serializer::class)
public sealed class InlineBaseReasoningDeltaEventTypeX3eda767b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.reasoning_text.delta`.
   */
  public data object ResponseReasoningTextDelta : InlineBaseReasoningDeltaEventTypeX3eda767b() {
    public override val `value`: String = "response.reasoning_text.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseReasoningDeltaEventTypeX3eda767b()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseReasoningDeltaEventTypeX3eda767b = when (value) {
      ResponseReasoningTextDelta.value -> ResponseReasoningTextDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseReasoningDeltaEventTypeX3eda767b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBaseReasoningDeltaEventTypeX3eda767b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseReasoningDeltaEventTypeX3eda767b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseReasoningDeltaEventTypeX3eda767b) {
      encoder.encodeString(value.value)
    }
  }
}
