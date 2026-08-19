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
 * sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/phase/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/phase/anyOf/1
 */
@Serializable(with = InlineEasyInputMessagePhaseAnyOf2X75a4cfa3.Serializer::class)
public sealed class InlineEasyInputMessagePhaseAnyOf2X75a4cfa3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `final_answer`.
   */
  public data object FinalAnswer : InlineEasyInputMessagePhaseAnyOf2X75a4cfa3() {
    public override val `value`: String = "final_answer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEasyInputMessagePhaseAnyOf2X75a4cfa3()

  public companion object {
    public fun fromValue(`value`: String): InlineEasyInputMessagePhaseAnyOf2X75a4cfa3 = when (value) {
      FinalAnswer.value -> FinalAnswer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEasyInputMessagePhaseAnyOf2X75a4cfa3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineEasyInputMessagePhaseAnyOf2X75a4cfa3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEasyInputMessagePhaseAnyOf2X75a4cfa3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEasyInputMessagePhaseAnyOf2X75a4cfa3) {
      encoder.encodeString(value.value)
    }
  }
}
