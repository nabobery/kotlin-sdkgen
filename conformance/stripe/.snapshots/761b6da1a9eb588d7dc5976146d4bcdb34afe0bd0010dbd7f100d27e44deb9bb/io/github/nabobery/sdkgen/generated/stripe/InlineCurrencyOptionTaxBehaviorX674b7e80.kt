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
 * Only required if a [default tax
 * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(rec
 * ommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive of taxes
 * or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either `inclusive` or
 * `exclusive`, it cannot be changed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/currency_option/properties/tax_behavior
 */
@Serializable(with = InlineCurrencyOptionTaxBehaviorX674b7e80.Serializer::class)
public sealed class InlineCurrencyOptionTaxBehaviorX674b7e80 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exclusive`.
   */
  public data object Exclusive : InlineCurrencyOptionTaxBehaviorX674b7e80() {
    public override val `value`: String = "exclusive"
  }

  /**
   * Documented value. Wire value: `inclusive`.
   */
  public data object Inclusive : InlineCurrencyOptionTaxBehaviorX674b7e80() {
    public override val `value`: String = "inclusive"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineCurrencyOptionTaxBehaviorX674b7e80() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCurrencyOptionTaxBehaviorX674b7e80()

  public companion object {
    public fun fromValue(`value`: String): InlineCurrencyOptionTaxBehaviorX674b7e80 = when (value) {
      Exclusive.value -> Exclusive
      Inclusive.value -> Inclusive
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCurrencyOptionTaxBehaviorX674b7e80> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCurrencyOptionTaxBehaviorX674b7e80", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCurrencyOptionTaxBehaviorX674b7e80 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCurrencyOptionTaxBehaviorX674b7e80) {
      encoder.encodeString(value.value)
    }
  }
}
