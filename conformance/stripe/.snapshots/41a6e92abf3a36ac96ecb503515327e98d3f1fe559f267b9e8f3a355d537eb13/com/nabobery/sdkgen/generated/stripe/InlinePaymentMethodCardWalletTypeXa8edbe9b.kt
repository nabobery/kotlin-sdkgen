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
 * The type of the card wallet, one of `amex_express_checkout`, `apple_pay`, `google_pay`, `masterpass`, `samsung_pay`,
 * `visa_checkout`, or `link`. An additional hash is included on the Wallet subhash with a name matching this value. It
 * contains additional information specific to the card wallet type.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card_wallet/properties/type
 */
@Serializable(with = InlinePaymentMethodCardWalletTypeXa8edbe9b.Serializer::class)
public sealed class InlinePaymentMethodCardWalletTypeXa8edbe9b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `amex_express_checkout`.
   */
  public data object AmexExpressCheckout : InlinePaymentMethodCardWalletTypeXa8edbe9b() {
    public override val `value`: String = "amex_express_checkout"
  }

  /**
   * Documented value. Wire value: `apple_pay`.
   */
  public data object ApplePay : InlinePaymentMethodCardWalletTypeXa8edbe9b() {
    public override val `value`: String = "apple_pay"
  }

  /**
   * Documented value. Wire value: `google_pay`.
   */
  public data object GooglePay : InlinePaymentMethodCardWalletTypeXa8edbe9b() {
    public override val `value`: String = "google_pay"
  }

  /**
   * Documented value. Wire value: `link`.
   */
  public data object Link : InlinePaymentMethodCardWalletTypeXa8edbe9b() {
    public override val `value`: String = "link"
  }

  /**
   * Documented value. Wire value: `masterpass`.
   */
  public data object Masterpass : InlinePaymentMethodCardWalletTypeXa8edbe9b() {
    public override val `value`: String = "masterpass"
  }

  /**
   * Documented value. Wire value: `samsung_pay`.
   */
  public data object SamsungPay : InlinePaymentMethodCardWalletTypeXa8edbe9b() {
    public override val `value`: String = "samsung_pay"
  }

  /**
   * Documented value. Wire value: `visa_checkout`.
   */
  public data object VisaCheckout : InlinePaymentMethodCardWalletTypeXa8edbe9b() {
    public override val `value`: String = "visa_checkout"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodCardWalletTypeXa8edbe9b()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodCardWalletTypeXa8edbe9b = when (value) {
      AmexExpressCheckout.value -> AmexExpressCheckout
      ApplePay.value -> ApplePay
      GooglePay.value -> GooglePay
      Link.value -> Link
      Masterpass.value -> Masterpass
      SamsungPay.value -> SamsungPay
      VisaCheckout.value -> VisaCheckout
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodCardWalletTypeXa8edbe9b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodCardWalletTypeXa8edbe9b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodCardWalletTypeXa8edbe9b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodCardWalletTypeXa8edbe9b) {
      encoder.encodeString(value.value)
    }
  }
}
