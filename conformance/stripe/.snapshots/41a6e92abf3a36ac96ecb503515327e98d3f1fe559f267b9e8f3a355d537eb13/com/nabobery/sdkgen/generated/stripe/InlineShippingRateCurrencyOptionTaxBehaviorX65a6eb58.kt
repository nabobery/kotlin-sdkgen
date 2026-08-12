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
 * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of `inclusive`, `exclusive`,
 * or `unspecified`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping_rate_currency_option/properties/tax_behavior
 */
@Serializable(with = InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58.Serializer::class)
public sealed class InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58()

  public companion object {
    public fun fromValue(`value`: String): InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58 = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineShippingRateCurrencyOptionTaxBehaviorX65a6eb58) {
      encoder.encodeString(value.value)
    }
  }
}
