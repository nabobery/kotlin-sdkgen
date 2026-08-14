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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/excluded_payment_method_types/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/excluded_payment_method_types/items
 */
@Serializable(with = InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf.Serializer::class)
public sealed class InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `acss_debit`.
   */
  public data object AcssDebit : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "acss_debit"
  }

  /**
   * Documented value. Wire value: `affirm`.
   */
  public data object Affirm : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "affirm"
  }

  /**
   * Documented value. Wire value: `afterpay_clearpay`.
   */
  public data object AfterpayClearpay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "afterpay_clearpay"
  }

  /**
   * Documented value. Wire value: `alipay`.
   */
  public data object Alipay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "alipay"
  }

  /**
   * Documented value. Wire value: `alma`.
   */
  public data object Alma : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "alma"
  }

  /**
   * Documented value. Wire value: `amazon_pay`.
   */
  public data object AmazonPay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "amazon_pay"
  }

  /**
   * Documented value. Wire value: `au_becs_debit`.
   */
  public data object AuBecsDebit : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "au_becs_debit"
  }

  /**
   * Documented value. Wire value: `bacs_debit`.
   */
  public data object BacsDebit : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "bacs_debit"
  }

  /**
   * Documented value. Wire value: `bancontact`.
   */
  public data object Bancontact : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "bancontact"
  }

  /**
   * Documented value. Wire value: `billie`.
   */
  public data object Billie : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "billie"
  }

  /**
   * Documented value. Wire value: `bizum`.
   */
  public data object Bizum : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "bizum"
  }

  /**
   * Documented value. Wire value: `blik`.
   */
  public data object Blik : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "blik"
  }

  /**
   * Documented value. Wire value: `boleto`.
   */
  public data object Boleto : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "boleto"
  }

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `cashapp`.
   */
  public data object Cashapp : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "cashapp"
  }

  /**
   * Documented value. Wire value: `crypto`.
   */
  public data object Crypto : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "crypto"
  }

  /**
   * Documented value. Wire value: `customer_balance`.
   */
  public data object CustomerBalance : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "customer_balance"
  }

  /**
   * Documented value. Wire value: `eps`.
   */
  public data object Eps : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "eps"
  }

  /**
   * Documented value. Wire value: `fpx`.
   */
  public data object Fpx : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "fpx"
  }

  /**
   * Documented value. Wire value: `giropay`.
   */
  public data object Giropay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "giropay"
  }

  /**
   * Documented value. Wire value: `grabpay`.
   */
  public data object Grabpay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "grabpay"
  }

  /**
   * Documented value. Wire value: `ideal`.
   */
  public data object Ideal : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "ideal"
  }

  /**
   * Documented value. Wire value: `kakao_pay`.
   */
  public data object KakaoPay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "kakao_pay"
  }

  /**
   * Documented value. Wire value: `klarna`.
   */
  public data object Klarna : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "klarna"
  }

  /**
   * Documented value. Wire value: `konbini`.
   */
  public data object Konbini : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "konbini"
  }

  /**
   * Documented value. Wire value: `kr_card`.
   */
  public data object KrCard : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "kr_card"
  }

  /**
   * Documented value. Wire value: `mb_way`.
   */
  public data object MbWay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "mb_way"
  }

  /**
   * Documented value. Wire value: `mobilepay`.
   */
  public data object Mobilepay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "mobilepay"
  }

  /**
   * Documented value. Wire value: `multibanco`.
   */
  public data object Multibanco : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "multibanco"
  }

  /**
   * Documented value. Wire value: `naver_pay`.
   */
  public data object NaverPay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "naver_pay"
  }

  /**
   * Documented value. Wire value: `nz_bank_account`.
   */
  public data object NzBankAccount : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "nz_bank_account"
  }

  /**
   * Documented value. Wire value: `oxxo`.
   */
  public data object Oxxo : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "oxxo"
  }

  /**
   * Documented value. Wire value: `p24`.
   */
  public data object P24 : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "p24"
  }

  /**
   * Documented value. Wire value: `pay_by_bank`.
   */
  public data object PayByBank : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "pay_by_bank"
  }

  /**
   * Documented value. Wire value: `payco`.
   */
  public data object Payco : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "payco"
  }

  /**
   * Documented value. Wire value: `paynow`.
   */
  public data object Paynow : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "paynow"
  }

  /**
   * Documented value. Wire value: `paypal`.
   */
  public data object Paypal : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "paypal"
  }

  /**
   * Documented value. Wire value: `payto`.
   */
  public data object Payto : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "payto"
  }

  /**
   * Documented value. Wire value: `pix`.
   */
  public data object Pix : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "pix"
  }

  /**
   * Documented value. Wire value: `promptpay`.
   */
  public data object Promptpay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "promptpay"
  }

  /**
   * Documented value. Wire value: `revolut_pay`.
   */
  public data object RevolutPay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "revolut_pay"
  }

  /**
   * Documented value. Wire value: `samsung_pay`.
   */
  public data object SamsungPay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "samsung_pay"
  }

  /**
   * Documented value. Wire value: `satispay`.
   */
  public data object Satispay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "satispay"
  }

  /**
   * Documented value. Wire value: `scalapay`.
   */
  public data object Scalapay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "scalapay"
  }

  /**
   * Documented value. Wire value: `sepa_debit`.
   */
  public data object SepaDebit : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "sepa_debit"
  }

  /**
   * Documented value. Wire value: `sofort`.
   */
  public data object Sofort : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "sofort"
  }

  /**
   * Documented value. Wire value: `sunbit`.
   */
  public data object Sunbit : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "sunbit"
  }

  /**
   * Documented value. Wire value: `swish`.
   */
  public data object Swish : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "swish"
  }

  /**
   * Documented value. Wire value: `twint`.
   */
  public data object Twint : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "twint"
  }

  /**
   * Documented value. Wire value: `upi`.
   */
  public data object Upi : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "upi"
  }

  /**
   * Documented value. Wire value: `us_bank_account`.
   */
  public data object UsBankAccount : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "us_bank_account"
  }

  /**
   * Documented value. Wire value: `wechat_pay`.
   */
  public data object WechatPay : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "wechat_pay"
  }

  /**
   * Documented value. Wire value: `zip`.
   */
  public data object Zip : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf() {
    public override val `value`: String = "zip"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf = when (value) {
      AcssDebit.value -> AcssDebit
      Affirm.value -> Affirm
      AfterpayClearpay.value -> AfterpayClearpay
      Alipay.value -> Alipay
      Alma.value -> Alma
      AmazonPay.value -> AmazonPay
      AuBecsDebit.value -> AuBecsDebit
      BacsDebit.value -> BacsDebit
      Bancontact.value -> Bancontact
      Billie.value -> Billie
      Bizum.value -> Bizum
      Blik.value -> Blik
      Boleto.value -> Boleto
      Card.value -> Card
      Cashapp.value -> Cashapp
      Crypto.value -> Crypto
      CustomerBalance.value -> CustomerBalance
      Eps.value -> Eps
      Fpx.value -> Fpx
      Giropay.value -> Giropay
      Grabpay.value -> Grabpay
      Ideal.value -> Ideal
      KakaoPay.value -> KakaoPay
      Klarna.value -> Klarna
      Konbini.value -> Konbini
      KrCard.value -> KrCard
      MbWay.value -> MbWay
      Mobilepay.value -> Mobilepay
      Multibanco.value -> Multibanco
      NaverPay.value -> NaverPay
      NzBankAccount.value -> NzBankAccount
      Oxxo.value -> Oxxo
      P24.value -> P24
      PayByBank.value -> PayByBank
      Payco.value -> Payco
      Paynow.value -> Paynow
      Paypal.value -> Paypal
      Payto.value -> Payto
      Pix.value -> Pix
      Promptpay.value -> Promptpay
      RevolutPay.value -> RevolutPay
      SamsungPay.value -> SamsungPay
      Satispay.value -> Satispay
      Scalapay.value -> Scalapay
      SepaDebit.value -> SepaDebit
      Sofort.value -> Sofort
      Sunbit.value -> Sunbit
      Swish.value -> Swish
      Twint.value -> Twint
      Upi.value -> Upi
      UsBankAccount.value -> UsBankAccount
      WechatPay.value -> WechatPay
      Zip.value -> Zip
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentExcludedPaymentMethodTypesItemXc2cbe4cf) {
      encoder.encodeString(value.value)
    }
  }
}
