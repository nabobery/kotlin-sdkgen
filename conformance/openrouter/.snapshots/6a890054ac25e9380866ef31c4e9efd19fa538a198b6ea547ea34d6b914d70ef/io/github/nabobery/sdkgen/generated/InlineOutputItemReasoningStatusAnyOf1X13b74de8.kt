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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/status/anyOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/status/anyOf/0
 */
@Serializable(with = InlineOutputItemReasoningStatusAnyOf1X13b74de8.Serializer::class)
public sealed class InlineOutputItemReasoningStatusAnyOf1X13b74de8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineOutputItemReasoningStatusAnyOf1X13b74de8() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemReasoningStatusAnyOf1X13b74de8()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemReasoningStatusAnyOf1X13b74de8 = when (value) {
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemReasoningStatusAnyOf1X13b74de8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputItemReasoningStatusAnyOf1X13b74de8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemReasoningStatusAnyOf1X13b74de8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemReasoningStatusAnyOf1X13b74de8) {
      encoder.encodeString(value.value)
    }
  }
}
