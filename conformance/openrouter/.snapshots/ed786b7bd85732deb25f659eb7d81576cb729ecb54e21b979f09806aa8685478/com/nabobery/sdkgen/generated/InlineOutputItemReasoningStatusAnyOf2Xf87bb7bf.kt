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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/status/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/status/anyOf/1
 */
@Serializable(with = InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf.Serializer::class)
public sealed class InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `incomplete`.
   */
  public data object Incomplete : InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf() {
    public override val `value`: String = "incomplete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf = when (value) {
      Incomplete.value -> Incomplete
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemReasoningStatusAnyOf2Xf87bb7bf) {
      encoder.encodeString(value.value)
    }
  }
}
