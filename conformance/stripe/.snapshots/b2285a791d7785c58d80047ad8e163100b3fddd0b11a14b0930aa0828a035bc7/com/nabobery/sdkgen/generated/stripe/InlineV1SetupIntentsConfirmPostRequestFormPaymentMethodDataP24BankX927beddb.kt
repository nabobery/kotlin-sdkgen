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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/p24/properties/bank.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/p24/properties/bank
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb.Serializer::class)
public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `alior_bank`.
   */
  public data object AliorBank : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "alior_bank"
  }

  /**
   * Documented value. Wire value: `bank_millennium`.
   */
  public data object BankMillennium : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "bank_millennium"
  }

  /**
   * Documented value. Wire value: `bank_nowy_bfg_sa`.
   */
  public data object BankNowyBfgSa : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "bank_nowy_bfg_sa"
  }

  /**
   * Documented value. Wire value: `bank_pekao_sa`.
   */
  public data object BankPekaoSa : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "bank_pekao_sa"
  }

  /**
   * Documented value. Wire value: `banki_spbdzielcze`.
   */
  public data object BankiSpbdzielcze : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "banki_spbdzielcze"
  }

  /**
   * Documented value. Wire value: `blik`.
   */
  public data object Blik : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "blik"
  }

  /**
   * Documented value. Wire value: `bnp_paribas`.
   */
  public data object BnpParibas : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "bnp_paribas"
  }

  /**
   * Documented value. Wire value: `boz`.
   */
  public data object Boz : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "boz"
  }

  /**
   * Documented value. Wire value: `citi_handlowy`.
   */
  public data object CitiHandlowy : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "citi_handlowy"
  }

  /**
   * Documented value. Wire value: `credit_agricole`.
   */
  public data object CreditAgricole : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "credit_agricole"
  }

  /**
   * Documented value. Wire value: `envelobank`.
   */
  public data object Envelobank : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "envelobank"
  }

  /**
   * Documented value. Wire value: `etransfer_pocztowy24`.
   */
  public data object EtransferPocztowy24 : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "etransfer_pocztowy24"
  }

  /**
   * Documented value. Wire value: `getin_bank`.
   */
  public data object GetinBank : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "getin_bank"
  }

  /**
   * Documented value. Wire value: `ideabank`.
   */
  public data object Ideabank : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "ideabank"
  }

  /**
   * Documented value. Wire value: `ing`.
   */
  public data object Ing : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "ing"
  }

  /**
   * Documented value. Wire value: `inteligo`.
   */
  public data object Inteligo : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "inteligo"
  }

  /**
   * Documented value. Wire value: `mbank_mtransfer`.
   */
  public data object MbankMtransfer : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "mbank_mtransfer"
  }

  /**
   * Documented value. Wire value: `nest_przelew`.
   */
  public data object NestPrzelew : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "nest_przelew"
  }

  /**
   * Documented value. Wire value: `noble_pay`.
   */
  public data object NoblePay : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "noble_pay"
  }

  /**
   * Documented value. Wire value: `pbac_z_ipko`.
   */
  public data object PbacZIpko : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "pbac_z_ipko"
  }

  /**
   * Documented value. Wire value: `plus_bank`.
   */
  public data object PlusBank : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "plus_bank"
  }

  /**
   * Documented value. Wire value: `santander_przelew24`.
   */
  public data object SantanderPrzelew24 : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "santander_przelew24"
  }

  /**
   * Documented value. Wire value: `tmobile_usbugi_bankowe`.
   */
  public data object TmobileUsbugiBankowe : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "tmobile_usbugi_bankowe"
  }

  /**
   * Documented value. Wire value: `toyota_bank`.
   */
  public data object ToyotaBank : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "toyota_bank"
  }

  /**
   * Documented value. Wire value: `velobank`.
   */
  public data object Velobank : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "velobank"
  }

  /**
   * Documented value. Wire value: `volkswagen_bank`.
   */
  public data object VolkswagenBank : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb() {
    public override val `value`: String = "volkswagen_bank"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb = when (value) {
      AliorBank.value -> AliorBank
      BankMillennium.value -> BankMillennium
      BankNowyBfgSa.value -> BankNowyBfgSa
      BankPekaoSa.value -> BankPekaoSa
      BankiSpbdzielcze.value -> BankiSpbdzielcze
      Blik.value -> Blik
      BnpParibas.value -> BnpParibas
      Boz.value -> Boz
      CitiHandlowy.value -> CitiHandlowy
      CreditAgricole.value -> CreditAgricole
      Envelobank.value -> Envelobank
      EtransferPocztowy24.value -> EtransferPocztowy24
      GetinBank.value -> GetinBank
      Ideabank.value -> Ideabank
      Ing.value -> Ing
      Inteligo.value -> Inteligo
      MbankMtransfer.value -> MbankMtransfer
      NestPrzelew.value -> NestPrzelew
      NoblePay.value -> NoblePay
      PbacZIpko.value -> PbacZIpko
      PlusBank.value -> PlusBank
      SantanderPrzelew24.value -> SantanderPrzelew24
      TmobileUsbugiBankowe.value -> TmobileUsbugiBankowe
      ToyotaBank.value -> ToyotaBank
      Velobank.value -> Velobank
      VolkswagenBank.value -> VolkswagenBank
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataP24BankX927beddb) {
      encoder.encodeString(value.value)
    }
  }
}
