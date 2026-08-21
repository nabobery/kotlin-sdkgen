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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/ideal/properties/bank.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/ideal/properties/bank
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30.Serializer::class)
public sealed class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `abn_amro`.
   */
  public data object AbnAmro : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "abn_amro"
  }

  /**
   * Documented value. Wire value: `adyen`.
   */
  public data object Adyen : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "adyen"
  }

  /**
   * Documented value. Wire value: `asn_bank`.
   */
  public data object AsnBank : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "asn_bank"
  }

  /**
   * Documented value. Wire value: `bunq`.
   */
  public data object Bunq : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "bunq"
  }

  /**
   * Documented value. Wire value: `buut`.
   */
  public data object Buut : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "buut"
  }

  /**
   * Documented value. Wire value: `finom`.
   */
  public data object Finom : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "finom"
  }

  /**
   * Documented value. Wire value: `handelsbanken`.
   */
  public data object Handelsbanken : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "handelsbanken"
  }

  /**
   * Documented value. Wire value: `ing`.
   */
  public data object Ing : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "ing"
  }

  /**
   * Documented value. Wire value: `knab`.
   */
  public data object Knab : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "knab"
  }

  /**
   * Documented value. Wire value: `mollie`.
   */
  public data object Mollie : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "mollie"
  }

  /**
   * Documented value. Wire value: `moneyou`.
   */
  public data object Moneyou : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "moneyou"
  }

  /**
   * Documented value. Wire value: `n26`.
   */
  public data object N26 : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "n26"
  }

  /**
   * Documented value. Wire value: `nn`.
   */
  public data object Nn : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "nn"
  }

  /**
   * Documented value. Wire value: `rabobank`.
   */
  public data object Rabobank : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "rabobank"
  }

  /**
   * Documented value. Wire value: `regiobank`.
   */
  public data object Regiobank : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "regiobank"
  }

  /**
   * Documented value. Wire value: `revolut`.
   */
  public data object Revolut : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "revolut"
  }

  /**
   * Documented value. Wire value: `sns_bank`.
   */
  public data object SnsBank : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "sns_bank"
  }

  /**
   * Documented value. Wire value: `triodos_bank`.
   */
  public data object TriodosBank : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "triodos_bank"
  }

  /**
   * Documented value. Wire value: `van_lanschot`.
   */
  public data object VanLanschot : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "van_lanschot"
  }

  /**
   * Documented value. Wire value: `yoursafe`.
   */
  public data object Yoursafe : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30() {
    public override val `value`: String = "yoursafe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30 = when (value) {
      AbnAmro.value -> AbnAmro
      Adyen.value -> Adyen
      AsnBank.value -> AsnBank
      Bunq.value -> Bunq
      Buut.value -> Buut
      Finom.value -> Finom
      Handelsbanken.value -> Handelsbanken
      Ing.value -> Ing
      Knab.value -> Knab
      Mollie.value -> Mollie
      Moneyou.value -> Moneyou
      N26.value -> N26
      Nn.value -> Nn
      Rabobank.value -> Rabobank
      Regiobank.value -> Regiobank
      Revolut.value -> Revolut
      SnsBank.value -> SnsBank
      TriodosBank.value -> TriodosBank
      VanLanschot.value -> VanLanschot
      Yoursafe.value -> Yoursafe
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataIdealBankX28b74b30) {
      encoder.encodeString(value.value)
    }
  }
}
