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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/ideal/properties/bank.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/ideal/properties/bank
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc.Serializer::class)
public sealed class InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `abn_amro`.
   */
  public data object AbnAmro : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "abn_amro"
  }

  /**
   * Documented value. Wire value: `adyen`.
   */
  public data object Adyen : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "adyen"
  }

  /**
   * Documented value. Wire value: `asn_bank`.
   */
  public data object AsnBank : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "asn_bank"
  }

  /**
   * Documented value. Wire value: `bunq`.
   */
  public data object Bunq : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "bunq"
  }

  /**
   * Documented value. Wire value: `buut`.
   */
  public data object Buut : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "buut"
  }

  /**
   * Documented value. Wire value: `finom`.
   */
  public data object Finom : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "finom"
  }

  /**
   * Documented value. Wire value: `handelsbanken`.
   */
  public data object Handelsbanken : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "handelsbanken"
  }

  /**
   * Documented value. Wire value: `ing`.
   */
  public data object Ing : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "ing"
  }

  /**
   * Documented value. Wire value: `knab`.
   */
  public data object Knab : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "knab"
  }

  /**
   * Documented value. Wire value: `mollie`.
   */
  public data object Mollie : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "mollie"
  }

  /**
   * Documented value. Wire value: `moneyou`.
   */
  public data object Moneyou : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "moneyou"
  }

  /**
   * Documented value. Wire value: `n26`.
   */
  public data object N26 : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "n26"
  }

  /**
   * Documented value. Wire value: `nn`.
   */
  public data object Nn : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "nn"
  }

  /**
   * Documented value. Wire value: `rabobank`.
   */
  public data object Rabobank : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "rabobank"
  }

  /**
   * Documented value. Wire value: `regiobank`.
   */
  public data object Regiobank : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "regiobank"
  }

  /**
   * Documented value. Wire value: `revolut`.
   */
  public data object Revolut : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "revolut"
  }

  /**
   * Documented value. Wire value: `sns_bank`.
   */
  public data object SnsBank : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "sns_bank"
  }

  /**
   * Documented value. Wire value: `triodos_bank`.
   */
  public data object TriodosBank : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "triodos_bank"
  }

  /**
   * Documented value. Wire value: `van_lanschot`.
   */
  public data object VanLanschot : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "van_lanschot"
  }

  /**
   * Documented value. Wire value: `yoursafe`.
   */
  public data object Yoursafe : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc() {
    public override val `value`: String = "yoursafe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc = when (value) {
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

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormIdealBankX21bc80dc) {
      encoder.encodeString(value.value)
    }
  }
}
