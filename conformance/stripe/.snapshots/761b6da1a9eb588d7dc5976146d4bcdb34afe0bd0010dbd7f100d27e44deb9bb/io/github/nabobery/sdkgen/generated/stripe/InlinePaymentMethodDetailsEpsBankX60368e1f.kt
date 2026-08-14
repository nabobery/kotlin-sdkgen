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
 * The customer's bank. Should be one of `arzte_und_apotheker_bank`, `austrian_anadi_bank_ag`, `bank_austria`,
 * `bankhaus_carl_spangler`, `bankhaus_schelhammer_und_schattera_ag`, `bawag_psk_ag`, `bks_bank_ag`,
 * `brull_kallmus_bank_ag`, `btv_vier_lander_bank`, `capital_bank_grawe_gruppe_ag`, `deutsche_bank_ag`, `dolomitenbank`,
 * `easybank_ag`, `erste_bank_und_sparkassen`, `hypo_alpeadriabank_international_ag`,
 * `hypo_noe_lb_fur_niederosterreich_u_wien`, `hypo_oberosterreich_salzburg_steiermark`, `hypo_tirol_bank_ag`,
 * `hypo_vorarlberg_bank_ag`, `hypo_bank_burgenland_aktiengesellschaft`, `marchfelder_bank`, `oberbank_ag`,
 * `raiffeisen_bankengruppe_osterreich`, `schoellerbank_ag`, `sparda_bank_wien`, `volksbank_gruppe`,
 * `volkskreditbank_ag`, or `vr_bank_braunau`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_eps/properties/bank
 */
@Serializable(with = InlinePaymentMethodDetailsEpsBankX60368e1f.Serializer::class)
public sealed class InlinePaymentMethodDetailsEpsBankX60368e1f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `arzte_und_apotheker_bank`.
   */
  public data object ArzteUndApothekerBank : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "arzte_und_apotheker_bank"
  }

  /**
   * Documented value. Wire value: `austrian_anadi_bank_ag`.
   */
  public data object AustrianAnadiBankAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "austrian_anadi_bank_ag"
  }

  /**
   * Documented value. Wire value: `bank_austria`.
   */
  public data object BankAustria : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "bank_austria"
  }

  /**
   * Documented value. Wire value: `bankhaus_carl_spangler`.
   */
  public data object BankhausCarlSpangler : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "bankhaus_carl_spangler"
  }

  /**
   * Documented value. Wire value: `bankhaus_schelhammer_und_schattera_ag`.
   */
  public data object BankhausSchelhammerUndSchatteraAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "bankhaus_schelhammer_und_schattera_ag"
  }

  /**
   * Documented value. Wire value: `bawag_psk_ag`.
   */
  public data object BawagPskAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "bawag_psk_ag"
  }

  /**
   * Documented value. Wire value: `bks_bank_ag`.
   */
  public data object BksBankAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "bks_bank_ag"
  }

  /**
   * Documented value. Wire value: `brull_kallmus_bank_ag`.
   */
  public data object BrullKallmusBankAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "brull_kallmus_bank_ag"
  }

  /**
   * Documented value. Wire value: `btv_vier_lander_bank`.
   */
  public data object BtvVierLanderBank : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "btv_vier_lander_bank"
  }

  /**
   * Documented value. Wire value: `capital_bank_grawe_gruppe_ag`.
   */
  public data object CapitalBankGraweGruppeAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "capital_bank_grawe_gruppe_ag"
  }

  /**
   * Documented value. Wire value: `deutsche_bank_ag`.
   */
  public data object DeutscheBankAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "deutsche_bank_ag"
  }

  /**
   * Documented value. Wire value: `dolomitenbank`.
   */
  public data object Dolomitenbank : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "dolomitenbank"
  }

  /**
   * Documented value. Wire value: `easybank_ag`.
   */
  public data object EasybankAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "easybank_ag"
  }

  /**
   * Documented value. Wire value: `erste_bank_und_sparkassen`.
   */
  public data object ErsteBankUndSparkassen : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "erste_bank_und_sparkassen"
  }

  /**
   * Documented value. Wire value: `hypo_alpeadriabank_international_ag`.
   */
  public data object HypoAlpeadriabankInternationalAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "hypo_alpeadriabank_international_ag"
  }

  /**
   * Documented value. Wire value: `hypo_bank_burgenland_aktiengesellschaft`.
   */
  public data object HypoBankBurgenlandAktiengesellschaft : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "hypo_bank_burgenland_aktiengesellschaft"
  }

  /**
   * Documented value. Wire value: `hypo_noe_lb_fur_niederosterreich_u_wien`.
   */
  public data object HypoNoeLbFurNiederosterreichUWien : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "hypo_noe_lb_fur_niederosterreich_u_wien"
  }

  /**
   * Documented value. Wire value: `hypo_oberosterreich_salzburg_steiermark`.
   */
  public data object HypoOberosterreichSalzburgSteiermark : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "hypo_oberosterreich_salzburg_steiermark"
  }

  /**
   * Documented value. Wire value: `hypo_tirol_bank_ag`.
   */
  public data object HypoTirolBankAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "hypo_tirol_bank_ag"
  }

  /**
   * Documented value. Wire value: `hypo_vorarlberg_bank_ag`.
   */
  public data object HypoVorarlbergBankAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "hypo_vorarlberg_bank_ag"
  }

  /**
   * Documented value. Wire value: `marchfelder_bank`.
   */
  public data object MarchfelderBank : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "marchfelder_bank"
  }

  /**
   * Documented value. Wire value: `oberbank_ag`.
   */
  public data object OberbankAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "oberbank_ag"
  }

  /**
   * Documented value. Wire value: `raiffeisen_bankengruppe_osterreich`.
   */
  public data object RaiffeisenBankengruppeOsterreich : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "raiffeisen_bankengruppe_osterreich"
  }

  /**
   * Documented value. Wire value: `schoellerbank_ag`.
   */
  public data object SchoellerbankAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "schoellerbank_ag"
  }

  /**
   * Documented value. Wire value: `sparda_bank_wien`.
   */
  public data object SpardaBankWien : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "sparda_bank_wien"
  }

  /**
   * Documented value. Wire value: `volksbank_gruppe`.
   */
  public data object VolksbankGruppe : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "volksbank_gruppe"
  }

  /**
   * Documented value. Wire value: `volkskreditbank_ag`.
   */
  public data object VolkskreditbankAg : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "volkskreditbank_ag"
  }

  /**
   * Documented value. Wire value: `vr_bank_braunau`.
   */
  public data object VrBankBraunau : InlinePaymentMethodDetailsEpsBankX60368e1f() {
    public override val `value`: String = "vr_bank_braunau"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsEpsBankX60368e1f()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsEpsBankX60368e1f = when (value) {
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

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsEpsBankX60368e1f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsEpsBankX60368e1f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsEpsBankX60368e1f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsEpsBankX60368e1f) {
      encoder.encodeString(value.value)
    }
  }
}
