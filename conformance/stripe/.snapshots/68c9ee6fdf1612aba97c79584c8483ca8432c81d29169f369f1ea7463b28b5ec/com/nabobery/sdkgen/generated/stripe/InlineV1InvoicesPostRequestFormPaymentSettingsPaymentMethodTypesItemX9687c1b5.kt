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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_types/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/payment_method_types/anyOf/0/items
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach_credit_transfer`.
   */
  public data object AchCreditTransfer : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "ach_credit_transfer"
  }

  /**
   * Documented value. Wire value: `ach_debit`.
   */
  public data object AchDebit : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "ach_debit"
  }

  /**
   * Documented value. Wire value: `acss_debit`.
   */
  public data object AcssDebit : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "acss_debit"
  }

  /**
   * Documented value. Wire value: `affirm`.
   */
  public data object Affirm : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "affirm"
  }

  /**
   * Documented value. Wire value: `amazon_pay`.
   */
  public data object AmazonPay : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "amazon_pay"
  }

  /**
   * Documented value. Wire value: `au_becs_debit`.
   */
  public data object AuBecsDebit : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "au_becs_debit"
  }

  /**
   * Documented value. Wire value: `bacs_debit`.
   */
  public data object BacsDebit : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "bacs_debit"
  }

  /**
   * Documented value. Wire value: `bancontact`.
   */
  public data object Bancontact : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "bancontact"
  }

  /**
   * Documented value. Wire value: `boleto`.
   */
  public data object Boleto : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "boleto"
  }

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `cashapp`.
   */
  public data object Cashapp : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "cashapp"
  }

  /**
   * Documented value. Wire value: `crypto`.
   */
  public data object Crypto : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "crypto"
  }

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "custom"
  }

  /**
   * Documented value. Wire value: `customer_balance`.
   */
  public data object CustomerBalance : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "customer_balance"
  }

  /**
   * Documented value. Wire value: `eps`.
   */
  public data object Eps : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "eps"
  }

  /**
   * Documented value. Wire value: `fpx`.
   */
  public data object Fpx : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "fpx"
  }

  /**
   * Documented value. Wire value: `giropay`.
   */
  public data object Giropay : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "giropay"
  }

  /**
   * Documented value. Wire value: `grabpay`.
   */
  public data object Grabpay : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "grabpay"
  }

  /**
   * Documented value. Wire value: `ideal`.
   */
  public data object Ideal : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "ideal"
  }

  /**
   * Documented value. Wire value: `jp_credit_transfer`.
   */
  public data object JpCreditTransfer : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "jp_credit_transfer"
  }

  /**
   * Documented value. Wire value: `kakao_pay`.
   */
  public data object KakaoPay : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "kakao_pay"
  }

  /**
   * Documented value. Wire value: `klarna`.
   */
  public data object Klarna : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "klarna"
  }

  /**
   * Documented value. Wire value: `konbini`.
   */
  public data object Konbini : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "konbini"
  }

  /**
   * Documented value. Wire value: `kr_card`.
   */
  public data object KrCard : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "kr_card"
  }

  /**
   * Documented value. Wire value: `link`.
   */
  public data object Link : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "link"
  }

  /**
   * Documented value. Wire value: `multibanco`.
   */
  public data object Multibanco : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "multibanco"
  }

  /**
   * Documented value. Wire value: `naver_pay`.
   */
  public data object NaverPay : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "naver_pay"
  }

  /**
   * Documented value. Wire value: `nz_bank_account`.
   */
  public data object NzBankAccount : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "nz_bank_account"
  }

  /**
   * Documented value. Wire value: `p24`.
   */
  public data object P24 : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "p24"
  }

  /**
   * Documented value. Wire value: `pay_by_bank`.
   */
  public data object PayByBank : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "pay_by_bank"
  }

  /**
   * Documented value. Wire value: `payco`.
   */
  public data object Payco : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "payco"
  }

  /**
   * Documented value. Wire value: `paynow`.
   */
  public data object Paynow : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "paynow"
  }

  /**
   * Documented value. Wire value: `paypal`.
   */
  public data object Paypal : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "paypal"
  }

  /**
   * Documented value. Wire value: `payto`.
   */
  public data object Payto : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "payto"
  }

  /**
   * Documented value. Wire value: `pix`.
   */
  public data object Pix : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "pix"
  }

  /**
   * Documented value. Wire value: `promptpay`.
   */
  public data object Promptpay : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "promptpay"
  }

  /**
   * Documented value. Wire value: `revolut_pay`.
   */
  public data object RevolutPay : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "revolut_pay"
  }

  /**
   * Documented value. Wire value: `satispay`.
   */
  public data object Satispay : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "satispay"
  }

  /**
   * Documented value. Wire value: `sepa_credit_transfer`.
   */
  public data object SepaCreditTransfer : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "sepa_credit_transfer"
  }

  /**
   * Documented value. Wire value: `sepa_debit`.
   */
  public data object SepaDebit : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "sepa_debit"
  }

  /**
   * Documented value. Wire value: `sofort`.
   */
  public data object Sofort : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "sofort"
  }

  /**
   * Documented value. Wire value: `swish`.
   */
  public data object Swish : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "swish"
  }

  /**
   * Documented value. Wire value: `twint`.
   */
  public data object Twint : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "twint"
  }

  /**
   * Documented value. Wire value: `upi`.
   */
  public data object Upi : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "upi"
  }

  /**
   * Documented value. Wire value: `us_bank_account`.
   */
  public data object UsBankAccount : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "us_bank_account"
  }

  /**
   * Documented value. Wire value: `wechat_pay`.
   */
  public data object WechatPay : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5() {
    public override val `value`: String = "wechat_pay"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5 = when (value) {
      AchCreditTransfer.value -> AchCreditTransfer
      AchDebit.value -> AchDebit
      AcssDebit.value -> AcssDebit
      Affirm.value -> Affirm
      AmazonPay.value -> AmazonPay
      AuBecsDebit.value -> AuBecsDebit
      BacsDebit.value -> BacsDebit
      Bancontact.value -> Bancontact
      Boleto.value -> Boleto
      Card.value -> Card
      Cashapp.value -> Cashapp
      Crypto.value -> Crypto
      Custom.value -> Custom
      CustomerBalance.value -> CustomerBalance
      Eps.value -> Eps
      Fpx.value -> Fpx
      Giropay.value -> Giropay
      Grabpay.value -> Grabpay
      Ideal.value -> Ideal
      JpCreditTransfer.value -> JpCreditTransfer
      KakaoPay.value -> KakaoPay
      Klarna.value -> Klarna
      Konbini.value -> Konbini
      KrCard.value -> KrCard
      Link.value -> Link
      Multibanco.value -> Multibanco
      NaverPay.value -> NaverPay
      NzBankAccount.value -> NzBankAccount
      P24.value -> P24
      PayByBank.value -> PayByBank
      Payco.value -> Payco
      Paynow.value -> Paynow
      Paypal.value -> Paypal
      Payto.value -> Payto
      Pix.value -> Pix
      Promptpay.value -> Promptpay
      RevolutPay.value -> RevolutPay
      Satispay.value -> Satispay
      SepaCreditTransfer.value -> SepaCreditTransfer
      SepaDebit.value -> SepaDebit
      Sofort.value -> Sofort
      Swish.value -> Swish
      Twint.value -> Twint
      Upi.value -> Upi
      UsBankAccount.value -> UsBankAccount
      WechatPay.value -> WechatPay
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodTypesItemX9687c1b5) {
      encoder.encodeString(value.value)
    }
  }
}
