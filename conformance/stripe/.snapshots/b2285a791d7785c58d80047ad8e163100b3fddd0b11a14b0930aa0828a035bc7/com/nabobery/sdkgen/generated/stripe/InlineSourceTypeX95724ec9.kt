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
 * The `type` of the source. The `type` is a payment method, one of `ach_credit_transfer`, `ach_debit`, `alipay`,
 * `bancontact`, `card`, `card_present`, `eps`, `giropay`, `ideal`, `multibanco`, `klarna`, `p24`, `sepa_debit`,
 * `sofort`, `three_d_secure`, or `wechat`. An additional hash is included on the source with a name matching this
 * value. It contains additional information specific to the [payment method](https://docs.stripe.com/sources) used.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source/properties/type
 */
@Serializable(with = InlineSourceTypeX95724ec9.Serializer::class)
public sealed class InlineSourceTypeX95724ec9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach_credit_transfer`.
   */
  public data object AchCreditTransfer : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "ach_credit_transfer"
  }

  /**
   * Documented value. Wire value: `ach_debit`.
   */
  public data object AchDebit : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "ach_debit"
  }

  /**
   * Documented value. Wire value: `acss_debit`.
   */
  public data object AcssDebit : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "acss_debit"
  }

  /**
   * Documented value. Wire value: `alipay`.
   */
  public data object Alipay : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "alipay"
  }

  /**
   * Documented value. Wire value: `au_becs_debit`.
   */
  public data object AuBecsDebit : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "au_becs_debit"
  }

  /**
   * Documented value. Wire value: `bancontact`.
   */
  public data object Bancontact : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "bancontact"
  }

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `card_present`.
   */
  public data object CardPresent : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "card_present"
  }

  /**
   * Documented value. Wire value: `eps`.
   */
  public data object Eps : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "eps"
  }

  /**
   * Documented value. Wire value: `giropay`.
   */
  public data object Giropay : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "giropay"
  }

  /**
   * Documented value. Wire value: `ideal`.
   */
  public data object Ideal : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "ideal"
  }

  /**
   * Documented value. Wire value: `klarna`.
   */
  public data object Klarna : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "klarna"
  }

  /**
   * Documented value. Wire value: `multibanco`.
   */
  public data object Multibanco : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "multibanco"
  }

  /**
   * Documented value. Wire value: `p24`.
   */
  public data object P24 : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "p24"
  }

  /**
   * Documented value. Wire value: `sepa_debit`.
   */
  public data object SepaDebit : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "sepa_debit"
  }

  /**
   * Documented value. Wire value: `sofort`.
   */
  public data object Sofort : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "sofort"
  }

  /**
   * Documented value. Wire value: `three_d_secure`.
   */
  public data object ThreeDSecure : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "three_d_secure"
  }

  /**
   * Documented value. Wire value: `wechat`.
   */
  public data object Wechat : InlineSourceTypeX95724ec9() {
    public override val `value`: String = "wechat"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSourceTypeX95724ec9()

  public companion object {
    public fun fromValue(`value`: String): InlineSourceTypeX95724ec9 = when (value) {
      AchCreditTransfer.value -> AchCreditTransfer
      AchDebit.value -> AchDebit
      AcssDebit.value -> AcssDebit
      Alipay.value -> Alipay
      AuBecsDebit.value -> AuBecsDebit
      Bancontact.value -> Bancontact
      Card.value -> Card
      CardPresent.value -> CardPresent
      Eps.value -> Eps
      Giropay.value -> Giropay
      Ideal.value -> Ideal
      Klarna.value -> Klarna
      Multibanco.value -> Multibanco
      P24.value -> P24
      SepaDebit.value -> SepaDebit
      Sofort.value -> Sofort
      ThreeDSecure.value -> ThreeDSecure
      Wechat.value -> Wechat
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSourceTypeX95724ec9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSourceTypeX95724ec9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSourceTypeX95724ec9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSourceTypeX95724ec9) {
      encoder.encodeString(value.value)
    }
  }
}
