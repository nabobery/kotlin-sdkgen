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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/type
 */
@Serializable(with = InlineOutputItemReasoningTypeX9f535a4f.Serializer::class)
public sealed class InlineOutputItemReasoningTypeX9f535a4f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reasoning`.
   */
  public data object Reasoning : InlineOutputItemReasoningTypeX9f535a4f() {
    public override val `value`: String = "reasoning"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemReasoningTypeX9f535a4f()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemReasoningTypeX9f535a4f = when (value) {
      Reasoning.value -> Reasoning
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemReasoningTypeX9f535a4f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputItemReasoningTypeX9f535a4f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemReasoningTypeX9f535a4f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemReasoningTypeX9f535a4f) {
      encoder.encodeString(value.value)
    }
  }
}
