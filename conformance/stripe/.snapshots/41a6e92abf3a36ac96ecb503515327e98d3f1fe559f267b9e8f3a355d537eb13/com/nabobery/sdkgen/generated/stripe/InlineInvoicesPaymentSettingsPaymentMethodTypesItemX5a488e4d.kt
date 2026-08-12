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
 * sdkgen://source/openapi.json#/components/schemas/invoices_payment_settings/properties/payment_method_types/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoices_payment_settings/properties/payment_method_types/items
 */
@Serializable(with = InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d.Serializer::class)
public sealed class InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach_credit_transfer`.
   */
  public data object AchCreditTransfer : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "ach_credit_transfer"
  }

  /**
   * Documented value. Wire value: `ach_debit`.
   */
  public data object AchDebit : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "ach_debit"
  }

  /**
   * Documented value. Wire value: `acss_debit`.
   */
  public data object AcssDebit : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "acss_debit"
  }

  /**
   * Documented value. Wire value: `affirm`.
   */
  public data object Affirm : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "affirm"
  }

  /**
   * Documented value. Wire value: `amazon_pay`.
   */
  public data object AmazonPay : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "amazon_pay"
  }

  /**
   * Documented value. Wire value: `au_becs_debit`.
   */
  public data object AuBecsDebit : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "au_becs_debit"
  }

  /**
   * Documented value. Wire value: `bacs_debit`.
   */
  public data object BacsDebit : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "bacs_debit"
  }

  /**
   * Documented value. Wire value: `bancontact`.
   */
  public data object Bancontact : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "bancontact"
  }

  /**
   * Documented value. Wire value: `boleto`.
   */
  public data object Boleto : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "boleto"
  }

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `cashapp`.
   */
  public data object Cashapp : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "cashapp"
  }

  /**
   * Documented value. Wire value: `crypto`.
   */
  public data object Crypto : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "crypto"
  }

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "custom"
  }

  /**
   * Documented value. Wire value: `customer_balance`.
   */
  public data object CustomerBalance : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "customer_balance"
  }

  /**
   * Documented value. Wire value: `eps`.
   */
  public data object Eps : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "eps"
  }

  /**
   * Documented value. Wire value: `fpx`.
   */
  public data object Fpx : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "fpx"
  }

  /**
   * Documented value. Wire value: `giropay`.
   */
  public data object Giropay : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "giropay"
  }

  /**
   * Documented value. Wire value: `grabpay`.
   */
  public data object Grabpay : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "grabpay"
  }

  /**
   * Documented value. Wire value: `ideal`.
   */
  public data object Ideal : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "ideal"
  }

  /**
   * Documented value. Wire value: `jp_credit_transfer`.
   */
  public data object JpCreditTransfer : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "jp_credit_transfer"
  }

  /**
   * Documented value. Wire value: `kakao_pay`.
   */
  public data object KakaoPay : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "kakao_pay"
  }

  /**
   * Documented value. Wire value: `klarna`.
   */
  public data object Klarna : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "klarna"
  }

  /**
   * Documented value. Wire value: `konbini`.
   */
  public data object Konbini : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "konbini"
  }

  /**
   * Documented value. Wire value: `kr_card`.
   */
  public data object KrCard : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "kr_card"
  }

  /**
   * Documented value. Wire value: `link`.
   */
  public data object Link : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "link"
  }

  /**
   * Documented value. Wire value: `multibanco`.
   */
  public data object Multibanco : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "multibanco"
  }

  /**
   * Documented value. Wire value: `naver_pay`.
   */
  public data object NaverPay : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "naver_pay"
  }

  /**
   * Documented value. Wire value: `nz_bank_account`.
   */
  public data object NzBankAccount : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "nz_bank_account"
  }

  /**
   * Documented value. Wire value: `p24`.
   */
  public data object P24 : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "p24"
  }

  /**
   * Documented value. Wire value: `pay_by_bank`.
   */
  public data object PayByBank : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "pay_by_bank"
  }

  /**
   * Documented value. Wire value: `payco`.
   */
  public data object Payco : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "payco"
  }

  /**
   * Documented value. Wire value: `paynow`.
   */
  public data object Paynow : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "paynow"
  }

  /**
   * Documented value. Wire value: `paypal`.
   */
  public data object Paypal : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "paypal"
  }

  /**
   * Documented value. Wire value: `payto`.
   */
  public data object Payto : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "payto"
  }

  /**
   * Documented value. Wire value: `pix`.
   */
  public data object Pix : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "pix"
  }

  /**
   * Documented value. Wire value: `promptpay`.
   */
  public data object Promptpay : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "promptpay"
  }

  /**
   * Documented value. Wire value: `revolut_pay`.
   */
  public data object RevolutPay : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "revolut_pay"
  }

  /**
   * Documented value. Wire value: `satispay`.
   */
  public data object Satispay : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "satispay"
  }

  /**
   * Documented value. Wire value: `sepa_credit_transfer`.
   */
  public data object SepaCreditTransfer : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "sepa_credit_transfer"
  }

  /**
   * Documented value. Wire value: `sepa_debit`.
   */
  public data object SepaDebit : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "sepa_debit"
  }

  /**
   * Documented value. Wire value: `sofort`.
   */
  public data object Sofort : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "sofort"
  }

  /**
   * Documented value. Wire value: `swish`.
   */
  public data object Swish : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "swish"
  }

  /**
   * Documented value. Wire value: `twint`.
   */
  public data object Twint : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "twint"
  }

  /**
   * Documented value. Wire value: `upi`.
   */
  public data object Upi : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "upi"
  }

  /**
   * Documented value. Wire value: `us_bank_account`.
   */
  public data object UsBankAccount : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "us_bank_account"
  }

  /**
   * Documented value. Wire value: `wechat_pay`.
   */
  public data object WechatPay : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d() {
    public override val `value`: String = "wechat_pay"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d = when (value) {
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

  internal object Serializer : KSerializer<InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesPaymentSettingsPaymentMethodTypesItemX5a488e4d) {
      encoder.encodeString(value.value)
    }
  }
}
