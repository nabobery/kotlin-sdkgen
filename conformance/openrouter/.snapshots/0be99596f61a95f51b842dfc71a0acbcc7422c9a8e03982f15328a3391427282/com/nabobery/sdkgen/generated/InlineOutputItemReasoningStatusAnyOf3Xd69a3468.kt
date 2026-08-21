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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/status/anyOf/2.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/status/anyOf/2
 */
@Serializable(with = InlineOutputItemReasoningStatusAnyOf3Xd69a3468.Serializer::class)
public sealed class InlineOutputItemReasoningStatusAnyOf3Xd69a3468 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineOutputItemReasoningStatusAnyOf3Xd69a3468() {
    public override val `value`: String = "in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemReasoningStatusAnyOf3Xd69a3468()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemReasoningStatusAnyOf3Xd69a3468 = when (value) {
      InProgress.value -> InProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemReasoningStatusAnyOf3Xd69a3468> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputItemReasoningStatusAnyOf3Xd69a3468", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemReasoningStatusAnyOf3Xd69a3468 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemReasoningStatusAnyOf3Xd69a3468) {
      encoder.encodeString(value.value)
    }
  }
}
