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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/phase/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/phase/anyOf/1
 */
@Serializable(with = InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd.Serializer::class)
public sealed class InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `final_answer`.
   */
  public data object FinalAnswer : InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd() {
    public override val `value`: String = "final_answer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd = when (value) {
      FinalAnswer.value -> FinalAnswer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd) {
      encoder.encodeString(value.value)
    }
  }
}
