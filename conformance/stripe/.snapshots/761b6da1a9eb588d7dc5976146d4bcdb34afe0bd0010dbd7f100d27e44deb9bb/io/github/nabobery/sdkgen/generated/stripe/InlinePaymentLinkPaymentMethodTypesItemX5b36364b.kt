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
 * sdkgen://source/openapi.json#/components/schemas/payment_link/properties/payment_method_types/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/payment_method_types/items
 */
@Serializable(with = InlinePaymentLinkPaymentMethodTypesItemX5b36364b.Serializer::class)
public sealed class InlinePaymentLinkPaymentMethodTypesItemX5b36364b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `affirm`.
   */
  public data object Affirm : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "affirm"
  }

  /**
   * Documented value. Wire value: `afterpay_clearpay`.
   */
  public data object AfterpayClearpay : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "afterpay_clearpay"
  }

  /**
   * Documented value. Wire value: `alipay`.
   */
  public data object Alipay : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "alipay"
  }

  /**
   * Documented value. Wire value: `alma`.
   */
  public data object Alma : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "alma"
  }

  /**
   * Documented value. Wire value: `au_becs_debit`.
   */
  public data object AuBecsDebit : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "au_becs_debit"
  }

  /**
   * Documented value. Wire value: `bacs_debit`.
   */
  public data object BacsDebit : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "bacs_debit"
  }

  /**
   * Documented value. Wire value: `bancontact`.
   */
  public data object Bancontact : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "bancontact"
  }

  /**
   * Documented value. Wire value: `billie`.
   */
  public data object Billie : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "billie"
  }

  /**
   * Documented value. Wire value: `bizum`.
   */
  public data object Bizum : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "bizum"
  }

  /**
   * Documented value. Wire value: `blik`.
   */
  public data object Blik : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "blik"
  }

  /**
   * Documented value. Wire value: `boleto`.
   */
  public data object Boleto : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "boleto"
  }

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `cashapp`.
   */
  public data object Cashapp : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "cashapp"
  }

  /**
   * Documented value. Wire value: `eps`.
   */
  public data object Eps : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "eps"
  }

  /**
   * Documented value. Wire value: `fpx`.
   */
  public data object Fpx : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "fpx"
  }

  /**
   * Documented value. Wire value: `giropay`.
   */
  public data object Giropay : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "giropay"
  }

  /**
   * Documented value. Wire value: `grabpay`.
   */
  public data object Grabpay : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "grabpay"
  }

  /**
   * Documented value. Wire value: `ideal`.
   */
  public data object Ideal : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "ideal"
  }

  /**
   * Documented value. Wire value: `klarna`.
   */
  public data object Klarna : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "klarna"
  }

  /**
   * Documented value. Wire value: `konbini`.
   */
  public data object Konbini : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "konbini"
  }

  /**
   * Documented value. Wire value: `link`.
   */
  public data object Link : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "link"
  }

  /**
   * Documented value. Wire value: `mb_way`.
   */
  public data object MbWay : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "mb_way"
  }

  /**
   * Documented value. Wire value: `mobilepay`.
   */
  public data object Mobilepay : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "mobilepay"
  }

  /**
   * Documented value. Wire value: `multibanco`.
   */
  public data object Multibanco : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "multibanco"
  }

  /**
   * Documented value. Wire value: `oxxo`.
   */
  public data object Oxxo : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "oxxo"
  }

  /**
   * Documented value. Wire value: `p24`.
   */
  public data object P24 : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "p24"
  }

  /**
   * Documented value. Wire value: `pay_by_bank`.
   */
  public data object PayByBank : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "pay_by_bank"
  }

  /**
   * Documented value. Wire value: `paynow`.
   */
  public data object Paynow : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "paynow"
  }

  /**
   * Documented value. Wire value: `paypal`.
   */
  public data object Paypal : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "paypal"
  }

  /**
   * Documented value. Wire value: `payto`.
   */
  public data object Payto : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "payto"
  }

  /**
   * Documented value. Wire value: `pix`.
   */
  public data object Pix : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "pix"
  }

  /**
   * Documented value. Wire value: `promptpay`.
   */
  public data object Promptpay : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "promptpay"
  }

  /**
   * Documented value. Wire value: `satispay`.
   */
  public data object Satispay : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "satispay"
  }

  /**
   * Documented value. Wire value: `sepa_debit`.
   */
  public data object SepaDebit : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "sepa_debit"
  }

  /**
   * Documented value. Wire value: `sofort`.
   */
  public data object Sofort : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "sofort"
  }

  /**
   * Documented value. Wire value: `sunbit`.
   */
  public data object Sunbit : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "sunbit"
  }

  /**
   * Documented value. Wire value: `swish`.
   */
  public data object Swish : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "swish"
  }

  /**
   * Documented value. Wire value: `twint`.
   */
  public data object Twint : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "twint"
  }

  /**
   * Documented value. Wire value: `upi`.
   */
  public data object Upi : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "upi"
  }

  /**
   * Documented value. Wire value: `us_bank_account`.
   */
  public data object UsBankAccount : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "us_bank_account"
  }

  /**
   * Documented value. Wire value: `wechat_pay`.
   */
  public data object WechatPay : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "wechat_pay"
  }

  /**
   * Documented value. Wire value: `zip`.
   */
  public data object Zip : InlinePaymentLinkPaymentMethodTypesItemX5b36364b() {
    public override val `value`: String = "zip"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentLinkPaymentMethodTypesItemX5b36364b()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentLinkPaymentMethodTypesItemX5b36364b = when (value) {
      Affirm.value -> Affirm
      AfterpayClearpay.value -> AfterpayClearpay
      Alipay.value -> Alipay
      Alma.value -> Alma
      AuBecsDebit.value -> AuBecsDebit
      BacsDebit.value -> BacsDebit
      Bancontact.value -> Bancontact
      Billie.value -> Billie
      Bizum.value -> Bizum
      Blik.value -> Blik
      Boleto.value -> Boleto
      Card.value -> Card
      Cashapp.value -> Cashapp
      Eps.value -> Eps
      Fpx.value -> Fpx
      Giropay.value -> Giropay
      Grabpay.value -> Grabpay
      Ideal.value -> Ideal
      Klarna.value -> Klarna
      Konbini.value -> Konbini
      Link.value -> Link
      MbWay.value -> MbWay
      Mobilepay.value -> Mobilepay
      Multibanco.value -> Multibanco
      Oxxo.value -> Oxxo
      P24.value -> P24
      PayByBank.value -> PayByBank
      Paynow.value -> Paynow
      Paypal.value -> Paypal
      Payto.value -> Payto
      Pix.value -> Pix
      Promptpay.value -> Promptpay
      Satispay.value -> Satispay
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

  internal object Serializer : KSerializer<InlinePaymentLinkPaymentMethodTypesItemX5b36364b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentLinkPaymentMethodTypesItemX5b36364b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentLinkPaymentMethodTypesItemX5b36364b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkPaymentMethodTypesItemX5b36364b) {
      encoder.encodeString(value.value)
    }
  }
}
