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
 * Only required if a [default tax
 * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(rec
 * ommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive of taxes
 * or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either `inclusive` or
 * `exclusive`, it cannot be changed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/price/properties/tax_behavior
 */
@Serializable(with = InlinePriceTaxBehaviorX0141c91e.Serializer::class)
public sealed class InlinePriceTaxBehaviorX0141c91e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlinePriceTaxBehaviorX0141c91e() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlinePriceTaxBehaviorX0141c91e() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlinePriceTaxBehaviorX0141c91e() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePriceTaxBehaviorX0141c91e()

  public companion object {
    public fun fromValue(`value`: String): InlinePriceTaxBehaviorX0141c91e = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePriceTaxBehaviorX0141c91e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePriceTaxBehaviorX0141c91e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePriceTaxBehaviorX0141c91e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePriceTaxBehaviorX0141c91e) {
      encoder.encodeString(value.value)
    }
  }
}
