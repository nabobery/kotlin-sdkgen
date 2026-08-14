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
 * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a name matching this value.
 * It contains additional information specific to the PaymentMethod type.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/confirmation_tokens_resource_payment_method_preview/properties/type
 */
@Serializable(with = InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be.Serializer::class)
public sealed class InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `acss_debit`.
   */
  public data object AcssDebit : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "acss_debit"
  }

  /**
   * Documented value. Wire value: `affirm`.
   */
  public data object Affirm : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "affirm"
  }

  /**
   * Documented value. Wire value: `afterpay_clearpay`.
   */
  public data object AfterpayClearpay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "afterpay_clearpay"
  }

  /**
   * Documented value. Wire value: `alipay`.
   */
  public data object Alipay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "alipay"
  }

  /**
   * Documented value. Wire value: `alma`.
   */
  public data object Alma : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "alma"
  }

  /**
   * Documented value. Wire value: `amazon_pay`.
   */
  public data object AmazonPay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "amazon_pay"
  }

  /**
   * Documented value. Wire value: `au_becs_debit`.
   */
  public data object AuBecsDebit : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "au_becs_debit"
  }

  /**
   * Documented value. Wire value: `bacs_debit`.
   */
  public data object BacsDebit : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "bacs_debit"
  }

  /**
   * Documented value. Wire value: `bancontact`.
   */
  public data object Bancontact : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "bancontact"
  }

  /**
   * Documented value. Wire value: `billie`.
   */
  public data object Billie : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "billie"
  }

  /**
   * Documented value. Wire value: `bizum`.
   */
  public data object Bizum : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "bizum"
  }

  /**
   * Documented value. Wire value: `blik`.
   */
  public data object Blik : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "blik"
  }

  /**
   * Documented value. Wire value: `boleto`.
   */
  public data object Boleto : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "boleto"
  }

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `card_present`.
   */
  public data object CardPresent : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "card_present"
  }

  /**
   * Documented value. Wire value: `cashapp`.
   */
  public data object Cashapp : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "cashapp"
  }

  /**
   * Documented value. Wire value: `crypto`.
   */
  public data object Crypto : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "crypto"
  }

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "custom"
  }

  /**
   * Documented value. Wire value: `customer_balance`.
   */
  public data object CustomerBalance : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "customer_balance"
  }

  /**
   * Documented value. Wire value: `eps`.
   */
  public data object Eps : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "eps"
  }

  /**
   * Documented value. Wire value: `fpx`.
   */
  public data object Fpx : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "fpx"
  }

  /**
   * Documented value. Wire value: `giropay`.
   */
  public data object Giropay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "giropay"
  }

  /**
   * Documented value. Wire value: `grabpay`.
   */
  public data object Grabpay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "grabpay"
  }

  /**
   * Documented value. Wire value: `ideal`.
   */
  public data object Ideal : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "ideal"
  }

  /**
   * Documented value. Wire value: `interac_present`.
   */
  public data object InteracPresent : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "interac_present"
  }

  /**
   * Documented value. Wire value: `kakao_pay`.
   */
  public data object KakaoPay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "kakao_pay"
  }

  /**
   * Documented value. Wire value: `klarna`.
   */
  public data object Klarna : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "klarna"
  }

  /**
   * Documented value. Wire value: `konbini`.
   */
  public data object Konbini : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "konbini"
  }

  /**
   * Documented value. Wire value: `kr_card`.
   */
  public data object KrCard : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "kr_card"
  }

  /**
   * Documented value. Wire value: `link`.
   */
  public data object Link : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "link"
  }

  /**
   * Documented value. Wire value: `mb_way`.
   */
  public data object MbWay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "mb_way"
  }

  /**
   * Documented value. Wire value: `mobilepay`.
   */
  public data object Mobilepay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "mobilepay"
  }

  /**
   * Documented value. Wire value: `multibanco`.
   */
  public data object Multibanco : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "multibanco"
  }

  /**
   * Documented value. Wire value: `naver_pay`.
   */
  public data object NaverPay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "naver_pay"
  }

  /**
   * Documented value. Wire value: `nz_bank_account`.
   */
  public data object NzBankAccount : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "nz_bank_account"
  }

  /**
   * Documented value. Wire value: `oxxo`.
   */
  public data object Oxxo : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "oxxo"
  }

  /**
   * Documented value. Wire value: `p24`.
   */
  public data object P24 : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "p24"
  }

  /**
   * Documented value. Wire value: `pay_by_bank`.
   */
  public data object PayByBank : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "pay_by_bank"
  }

  /**
   * Documented value. Wire value: `payco`.
   */
  public data object Payco : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "payco"
  }

  /**
   * Documented value. Wire value: `paynow`.
   */
  public data object Paynow : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "paynow"
  }

  /**
   * Documented value. Wire value: `paypal`.
   */
  public data object Paypal : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "paypal"
  }

  /**
   * Documented value. Wire value: `payto`.
   */
  public data object Payto : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "payto"
  }

  /**
   * Documented value. Wire value: `pix`.
   */
  public data object Pix : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "pix"
  }

  /**
   * Documented value. Wire value: `promptpay`.
   */
  public data object Promptpay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "promptpay"
  }

  /**
   * Documented value. Wire value: `revolut_pay`.
   */
  public data object RevolutPay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "revolut_pay"
  }

  /**
   * Documented value. Wire value: `samsung_pay`.
   */
  public data object SamsungPay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "samsung_pay"
  }

  /**
   * Documented value. Wire value: `satispay`.
   */
  public data object Satispay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "satispay"
  }

  /**
   * Documented value. Wire value: `scalapay`.
   */
  public data object Scalapay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "scalapay"
  }

  /**
   * Documented value. Wire value: `sepa_debit`.
   */
  public data object SepaDebit : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "sepa_debit"
  }

  /**
   * Documented value. Wire value: `sofort`.
   */
  public data object Sofort : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "sofort"
  }

  /**
   * Documented value. Wire value: `sunbit`.
   */
  public data object Sunbit : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "sunbit"
  }

  /**
   * Documented value. Wire value: `swish`.
   */
  public data object Swish : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "swish"
  }

  /**
   * Documented value. Wire value: `twint`.
   */
  public data object Twint : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "twint"
  }

  /**
   * Documented value. Wire value: `upi`.
   */
  public data object Upi : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "upi"
  }

  /**
   * Documented value. Wire value: `us_bank_account`.
   */
  public data object UsBankAccount : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "us_bank_account"
  }

  /**
   * Documented value. Wire value: `wechat_pay`.
   */
  public data object WechatPay : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "wechat_pay"
  }

  /**
   * Documented value. Wire value: `zip`.
   */
  public data object Zip : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be() {
    public override val `value`: String = "zip"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be()

  public companion object {
    public fun fromValue(`value`: String): InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be = when (value) {
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
      CardPresent.value -> CardPresent
      Cashapp.value -> Cashapp
      Crypto.value -> Crypto
      Custom.value -> Custom
      CustomerBalance.value -> CustomerBalance
      Eps.value -> Eps
      Fpx.value -> Fpx
      Giropay.value -> Giropay
      Grabpay.value -> Grabpay
      Ideal.value -> Ideal
      InteracPresent.value -> InteracPresent
      KakaoPay.value -> KakaoPay
      Klarna.value -> Klarna
      Konbini.value -> Konbini
      KrCard.value -> KrCard
      Link.value -> Link
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

  internal object Serializer : KSerializer<InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineConfirmationTokensResourcePaymentMethodPreviewTypeX936820be) {
      encoder.encodeString(value.value)
    }
  }
}
