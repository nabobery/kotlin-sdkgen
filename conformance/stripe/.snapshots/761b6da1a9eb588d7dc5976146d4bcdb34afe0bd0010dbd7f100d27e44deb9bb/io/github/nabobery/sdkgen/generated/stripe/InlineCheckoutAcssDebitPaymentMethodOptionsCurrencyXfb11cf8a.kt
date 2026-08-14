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
 * Currency supported by the bank account. Returned when the Session is in `setup` mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_acss_debit_payment_method_options/properties/currency
 */
@Serializable(with = InlineCheckoutAcssDebitPaymentMethodOptionsCurrencyXfb11cf8a.Serializer::class)
public sealed class InlineCheckoutAcssDebitPaymentMethodOptionsCurrencyXfb11cf8a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cad`.
   */
  public data object Cad : InlineCheckoutAcssDebitPaymentMethodOptionsCurrencyXfb11cf8a() {
    public override val `value`: String = "cad"
  }

  /**
   * Documented value. Wire value: `usd`.
   */
  public data object Usd : InlineCheckoutAcssDebitPaymentMethodOptionsCurrencyXfb11cf8a() {
    public override val `value`: String = "usd"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutAcssDebitPaymentMethodOptionsCurrencyXfb11cf8a()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutAcssDebitPaymentMethodOptionsCurrencyXfb11cf8a = when (value) {
      Cad.value -> Cad
      Usd.value -> Usd
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutAcssDebitPaymentMethodOptionsCurrencyXfb11cf8a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutAcssDebitPaymentMethodOptionsCurrencyXfb11cf8a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutAcssDebitPaymentMethodOptionsCurrencyXfb11cf8a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutAcssDebitPaymentMethodOptionsCurrencyXfb11cf8a) {
      encoder.encodeString(value.value)
    }
  }
}
