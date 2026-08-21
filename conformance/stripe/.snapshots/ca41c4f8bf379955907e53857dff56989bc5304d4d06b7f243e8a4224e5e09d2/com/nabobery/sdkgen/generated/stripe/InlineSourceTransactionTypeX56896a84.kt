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
 * The type of source this transaction is attached to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_transaction/properties/type
 */
@Serializable(with = InlineSourceTransactionTypeX56896a84.Serializer::class)
public sealed class InlineSourceTransactionTypeX56896a84 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ach_credit_transfer`.
   */
  public data object AchCreditTransfer : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "ach_credit_transfer"
  }

  /**
   * Documented value. Wire value: `ach_debit`.
   */
  public data object AchDebit : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "ach_debit"
  }

  /**
   * Documented value. Wire value: `alipay`.
   */
  public data object Alipay : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "alipay"
  }

  /**
   * Documented value. Wire value: `bancontact`.
   */
  public data object Bancontact : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "bancontact"
  }

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "card"
  }

  /**
   * Documented value. Wire value: `card_present`.
   */
  public data object CardPresent : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "card_present"
  }

  /**
   * Documented value. Wire value: `eps`.
   */
  public data object Eps : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "eps"
  }

  /**
   * Documented value. Wire value: `giropay`.
   */
  public data object Giropay : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "giropay"
  }

  /**
   * Documented value. Wire value: `ideal`.
   */
  public data object Ideal : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "ideal"
  }

  /**
   * Documented value. Wire value: `klarna`.
   */
  public data object Klarna : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "klarna"
  }

  /**
   * Documented value. Wire value: `multibanco`.
   */
  public data object Multibanco : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "multibanco"
  }

  /**
   * Documented value. Wire value: `p24`.
   */
  public data object P24 : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "p24"
  }

  /**
   * Documented value. Wire value: `sepa_debit`.
   */
  public data object SepaDebit : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "sepa_debit"
  }

  /**
   * Documented value. Wire value: `sofort`.
   */
  public data object Sofort : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "sofort"
  }

  /**
   * Documented value. Wire value: `three_d_secure`.
   */
  public data object ThreeDSecure : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "three_d_secure"
  }

  /**
   * Documented value. Wire value: `wechat`.
   */
  public data object Wechat : InlineSourceTransactionTypeX56896a84() {
    public override val `value`: String = "wechat"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSourceTransactionTypeX56896a84()

  public companion object {
    public fun fromValue(`value`: String): InlineSourceTransactionTypeX56896a84 = when (value) {
      AchCreditTransfer.value -> AchCreditTransfer
      AchDebit.value -> AchDebit
      Alipay.value -> Alipay
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

  internal object Serializer : KSerializer<InlineSourceTransactionTypeX56896a84> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSourceTransactionTypeX56896a84", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSourceTransactionTypeX56896a84 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSourceTransactionTypeX56896a84) {
      encoder.encodeString(value.value)
    }
  }
}
