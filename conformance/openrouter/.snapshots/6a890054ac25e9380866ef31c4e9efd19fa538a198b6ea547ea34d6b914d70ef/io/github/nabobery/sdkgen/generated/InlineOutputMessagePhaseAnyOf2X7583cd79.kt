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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/phase/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/phase/anyOf/1
 */
@Serializable(with = InlineOutputMessagePhaseAnyOf2X7583cd79.Serializer::class)
public sealed class InlineOutputMessagePhaseAnyOf2X7583cd79 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `final_answer`.
   */
  public data object FinalAnswer : InlineOutputMessagePhaseAnyOf2X7583cd79() {
    public override val `value`: String = "final_answer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputMessagePhaseAnyOf2X7583cd79()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputMessagePhaseAnyOf2X7583cd79 = when (value) {
      FinalAnswer.value -> FinalAnswer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputMessagePhaseAnyOf2X7583cd79> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputMessagePhaseAnyOf2X7583cd79", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputMessagePhaseAnyOf2X7583cd79 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputMessagePhaseAnyOf2X7583cd79) {
      encoder.encodeString(value.value)
    }
  }
}
