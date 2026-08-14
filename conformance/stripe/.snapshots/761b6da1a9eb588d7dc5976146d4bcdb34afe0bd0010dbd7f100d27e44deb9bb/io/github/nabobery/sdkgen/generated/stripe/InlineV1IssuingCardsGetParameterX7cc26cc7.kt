package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/get/parameters/11/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/get/parameters/11/schema
 */
@Serializable(with = InlineV1IssuingCardsGetParameterX7cc26cc7.Serializer::class)
public sealed class InlineV1IssuingCardsGetParameterX7cc26cc7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `physical`.
   */
  public data object Physical : InlineV1IssuingCardsGetParameterX7cc26cc7() {
    public override val `value`: String = "physical"
  }

  /**
   * Documented value. Wire value: `virtual`.
   */
  public data object Virtual : InlineV1IssuingCardsGetParameterX7cc26cc7() {
    public override val `value`: String = "virtual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardsGetParameterX7cc26cc7()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardsGetParameterX7cc26cc7 = when (value) {
      Physical.value -> Physical
      Virtual.value -> Virtual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsGetParameterX7cc26cc7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsGetParameterX7cc26cc7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsGetParameterX7cc26cc7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsGetParameterX7cc26cc7) {
      encoder.encodeString(value.value)
    }
  }
}
