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
 * The customer's bank. Can be one of `abn_amro`, `adyen`, `asn_bank`, `bunq`, `buut`, `finom`, `handelsbanken`, `ing`,
 * `knab`, `mollie`, `moneyou`, `n26`, `nn`, `rabobank`, `regiobank`, `revolut`, `sns_bank`, `triodos_bank`,
 * `van_lanschot`, or `yoursafe`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_ideal/properties/bank
 */
@Serializable(with = InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28.Serializer::class)
public sealed class InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `abn_amro`.
   */
  public data object AbnAmro : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "abn_amro"
  }

  /**
   * Documented value. Wire value: `adyen`.
   */
  public data object Adyen : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "adyen"
  }

  /**
   * Documented value. Wire value: `asn_bank`.
   */
  public data object AsnBank : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "asn_bank"
  }

  /**
   * Documented value. Wire value: `bunq`.
   */
  public data object Bunq : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "bunq"
  }

  /**
   * Documented value. Wire value: `buut`.
   */
  public data object Buut : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "buut"
  }

  /**
   * Documented value. Wire value: `finom`.
   */
  public data object Finom : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "finom"
  }

  /**
   * Documented value. Wire value: `handelsbanken`.
   */
  public data object Handelsbanken : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "handelsbanken"
  }

  /**
   * Documented value. Wire value: `ing`.
   */
  public data object Ing : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "ing"
  }

  /**
   * Documented value. Wire value: `knab`.
   */
  public data object Knab : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "knab"
  }

  /**
   * Documented value. Wire value: `mollie`.
   */
  public data object Mollie : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "mollie"
  }

  /**
   * Documented value. Wire value: `moneyou`.
   */
  public data object Moneyou : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "moneyou"
  }

  /**
   * Documented value. Wire value: `n26`.
   */
  public data object N26 : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "n26"
  }

  /**
   * Documented value. Wire value: `nn`.
   */
  public data object Nn : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "nn"
  }

  /**
   * Documented value. Wire value: `rabobank`.
   */
  public data object Rabobank : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "rabobank"
  }

  /**
   * Documented value. Wire value: `regiobank`.
   */
  public data object Regiobank : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "regiobank"
  }

  /**
   * Documented value. Wire value: `revolut`.
   */
  public data object Revolut : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "revolut"
  }

  /**
   * Documented value. Wire value: `sns_bank`.
   */
  public data object SnsBank : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "sns_bank"
  }

  /**
   * Documented value. Wire value: `triodos_bank`.
   */
  public data object TriodosBank : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "triodos_bank"
  }

  /**
   * Documented value. Wire value: `van_lanschot`.
   */
  public data object VanLanschot : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "van_lanschot"
  }

  /**
   * Documented value. Wire value: `yoursafe`.
   */
  public data object Yoursafe : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28() {
    public override val `value`: String = "yoursafe"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28 = when (value) {
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

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsPaymentRecordIdealBankX2bbfbd28) {
      encoder.encodeString(value.value)
    }
  }
}
