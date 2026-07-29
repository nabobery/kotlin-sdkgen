package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The type of the card.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.card/properties/type
 */
@Serializable(with = InlineIssuingCardTypeX17735f2c.Serializer::class)
public sealed class InlineIssuingCardTypeX17735f2c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `physical`.
   */
  public data object Physical : InlineIssuingCardTypeX17735f2c() {
    public override val `value`: String = "physical"
  }

  /**
   * Documented value. Wire value: `virtual`.
   */
  public data object Virtual : InlineIssuingCardTypeX17735f2c() {
    public override val `value`: String = "virtual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardTypeX17735f2c()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardTypeX17735f2c = when (value) {
      Physical.value -> Physical
      Virtual.value -> Virtual
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardTypeX17735f2c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingCardTypeX17735f2c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardTypeX17735f2c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardTypeX17735f2c) {
      encoder.encodeString(value.value)
    }
  }
}
