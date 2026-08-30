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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/eps/properties/bank.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/eps/properties/bank
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `arzte_und_apotheker_bank`.
   */
  public data object ArzteUndApothekerBank : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "arzte_und_apotheker_bank"
  }

  /**
   * Documented value. Wire value: `austrian_anadi_bank_ag`.
   */
  public data object AustrianAnadiBankAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "austrian_anadi_bank_ag"
  }

  /**
   * Documented value. Wire value: `bank_austria`.
   */
  public data object BankAustria : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "bank_austria"
  }

  /**
   * Documented value. Wire value: `bankhaus_carl_spangler`.
   */
  public data object BankhausCarlSpangler : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "bankhaus_carl_spangler"
  }

  /**
   * Documented value. Wire value: `bankhaus_schelhammer_und_schattera_ag`.
   */
  public data object BankhausSchelhammerUndSchatteraAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "bankhaus_schelhammer_und_schattera_ag"
  }

  /**
   * Documented value. Wire value: `bawag_psk_ag`.
   */
  public data object BawagPskAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "bawag_psk_ag"
  }

  /**
   * Documented value. Wire value: `bks_bank_ag`.
   */
  public data object BksBankAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "bks_bank_ag"
  }

  /**
   * Documented value. Wire value: `brull_kallmus_bank_ag`.
   */
  public data object BrullKallmusBankAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "brull_kallmus_bank_ag"
  }

  /**
   * Documented value. Wire value: `btv_vier_lander_bank`.
   */
  public data object BtvVierLanderBank : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "btv_vier_lander_bank"
  }

  /**
   * Documented value. Wire value: `capital_bank_grawe_gruppe_ag`.
   */
  public data object CapitalBankGraweGruppeAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "capital_bank_grawe_gruppe_ag"
  }

  /**
   * Documented value. Wire value: `deutsche_bank_ag`.
   */
  public data object DeutscheBankAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "deutsche_bank_ag"
  }

  /**
   * Documented value. Wire value: `dolomitenbank`.
   */
  public data object Dolomitenbank : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "dolomitenbank"
  }

  /**
   * Documented value. Wire value: `easybank_ag`.
   */
  public data object EasybankAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "easybank_ag"
  }

  /**
   * Documented value. Wire value: `erste_bank_und_sparkassen`.
   */
  public data object ErsteBankUndSparkassen : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "erste_bank_und_sparkassen"
  }

  /**
   * Documented value. Wire value: `hypo_alpeadriabank_international_ag`.
   */
  public data object HypoAlpeadriabankInternationalAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "hypo_alpeadriabank_international_ag"
  }

  /**
   * Documented value. Wire value: `hypo_bank_burgenland_aktiengesellschaft`.
   */
  public data object HypoBankBurgenlandAktiengesellschaft : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "hypo_bank_burgenland_aktiengesellschaft"
  }

  /**
   * Documented value. Wire value: `hypo_noe_lb_fur_niederosterreich_u_wien`.
   */
  public data object HypoNoeLbFurNiederosterreichUWien : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "hypo_noe_lb_fur_niederosterreich_u_wien"
  }

  /**
   * Documented value. Wire value: `hypo_oberosterreich_salzburg_steiermark`.
   */
  public data object HypoOberosterreichSalzburgSteiermark : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "hypo_oberosterreich_salzburg_steiermark"
  }

  /**
   * Documented value. Wire value: `hypo_tirol_bank_ag`.
   */
  public data object HypoTirolBankAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "hypo_tirol_bank_ag"
  }

  /**
   * Documented value. Wire value: `hypo_vorarlberg_bank_ag`.
   */
  public data object HypoVorarlbergBankAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "hypo_vorarlberg_bank_ag"
  }

  /**
   * Documented value. Wire value: `marchfelder_bank`.
   */
  public data object MarchfelderBank : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "marchfelder_bank"
  }

  /**
   * Documented value. Wire value: `oberbank_ag`.
   */
  public data object OberbankAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "oberbank_ag"
  }

  /**
   * Documented value. Wire value: `raiffeisen_bankengruppe_osterreich`.
   */
  public data object RaiffeisenBankengruppeOsterreich : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "raiffeisen_bankengruppe_osterreich"
  }

  /**
   * Documented value. Wire value: `schoellerbank_ag`.
   */
  public data object SchoellerbankAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "schoellerbank_ag"
  }

  /**
   * Documented value. Wire value: `sparda_bank_wien`.
   */
  public data object SpardaBankWien : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "sparda_bank_wien"
  }

  /**
   * Documented value. Wire value: `volksbank_gruppe`.
   */
  public data object VolksbankGruppe : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "volksbank_gruppe"
  }

  /**
   * Documented value. Wire value: `volkskreditbank_ag`.
   */
  public data object VolkskreditbankAg : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "volkskreditbank_ag"
  }

  /**
   * Documented value. Wire value: `vr_bank_braunau`.
   */
  public data object VrBankBraunau : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350() {
    public override val `value`: String = "vr_bank_braunau"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350 = when (value) {
      ArzteUndApothekerBank.value -> ArzteUndApothekerBank
      AustrianAnadiBankAg.value -> AustrianAnadiBankAg
      BankAustria.value -> BankAustria
      BankhausCarlSpangler.value -> BankhausCarlSpangler
      BankhausSchelhammerUndSchatteraAg.value -> BankhausSchelhammerUndSchatteraAg
      BawagPskAg.value -> BawagPskAg
      BksBankAg.value -> BksBankAg
      BrullKallmusBankAg.value -> BrullKallmusBankAg
      BtvVierLanderBank.value -> BtvVierLanderBank
      CapitalBankGraweGruppeAg.value -> CapitalBankGraweGruppeAg
      DeutscheBankAg.value -> DeutscheBankAg
      Dolomitenbank.value -> Dolomitenbank
      EasybankAg.value -> EasybankAg
      ErsteBankUndSparkassen.value -> ErsteBankUndSparkassen
      HypoAlpeadriabankInternationalAg.value -> HypoAlpeadriabankInternationalAg
      HypoBankBurgenlandAktiengesellschaft.value -> HypoBankBurgenlandAktiengesellschaft
      HypoNoeLbFurNiederosterreichUWien.value -> HypoNoeLbFurNiederosterreichUWien
      HypoOberosterreichSalzburgSteiermark.value -> HypoOberosterreichSalzburgSteiermark
      HypoTirolBankAg.value -> HypoTirolBankAg
      HypoVorarlbergBankAg.value -> HypoVorarlbergBankAg
      MarchfelderBank.value -> MarchfelderBank
      OberbankAg.value -> OberbankAg
      RaiffeisenBankengruppeOsterreich.value -> RaiffeisenBankengruppeOsterreich
      SchoellerbankAg.value -> SchoellerbankAg
      SpardaBankWien.value -> SpardaBankWien
      VolksbankGruppe.value -> VolksbankGruppe
      VolkskreditbankAg.value -> VolkskreditbankAg
      VrBankBraunau.value -> VrBankBraunau
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsBankX7c22d350) {
      encoder.encodeString(value.value)
    }
  }
}
