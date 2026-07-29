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
 * The type of calculation to use on the shipping rate.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping_rate/properties/type
 */
@Serializable(with = InlineShippingRateTypeXbe49c0e0.Serializer::class)
public sealed class InlineShippingRateTypeXbe49c0e0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed_amount`.
   */
  public data object FixedAmount : InlineShippingRateTypeXbe49c0e0() {
    public override val `value`: String = "fixed_amount"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineShippingRateTypeXbe49c0e0()

  public companion object {
    public fun fromValue(`value`: String): InlineShippingRateTypeXbe49c0e0 = when (value) {
      FixedAmount.value -> FixedAmount
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineShippingRateTypeXbe49c0e0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineShippingRateTypeXbe49c0e0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineShippingRateTypeXbe49c0e0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineShippingRateTypeXbe49c0e0) {
      encoder.encodeString(value.value)
    }
  }
}
