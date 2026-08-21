package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_eps
 */
@Serializable(with = PaymentMethodEps.Serializer::class)
public class PaymentMethodEps(
  /**
   * The customer's bank. Should be one of `arzte_und_apotheker_bank`, `austrian_anadi_bank_ag`, `bank_austria`,
   * `bankhaus_carl_spangler`, `bankhaus_schelhammer_und_schattera_ag`, `bawag_psk_ag`, `bks_bank_ag`,
   * `brull_kallmus_bank_ag`, `btv_vier_lander_bank`, `capital_bank_grawe_gruppe_ag`, `deutsche_bank_ag`,
   * `dolomitenbank`, `easybank_ag`, `erste_bank_und_sparkassen`, `hypo_alpeadriabank_international_ag`,
   * `hypo_noe_lb_fur_niederosterreich_u_wien`, `hypo_oberosterreich_salzburg_steiermark`, `hypo_tirol_bank_ag`,
   * `hypo_vorarlberg_bank_ag`, `hypo_bank_burgenland_aktiengesellschaft`, `marchfelder_bank`, `oberbank_ag`,
   * `raiffeisen_bankengruppe_osterreich`, `schoellerbank_ag`, `sparda_bank_wien`, `volksbank_gruppe`,
   * `volkskreditbank_ag`, or `vr_bank_braunau`.
   */
  public val bank: InlinePaymentMethodEpsBankX43bfcb33? = null,
) {
  public class Builder {
    /**
     * The customer's bank. Should be one of `arzte_und_apotheker_bank`, `austrian_anadi_bank_ag`, `bank_austria`,
     * `bankhaus_carl_spangler`, `bankhaus_schelhammer_und_schattera_ag`, `bawag_psk_ag`, `bks_bank_ag`,
     * `brull_kallmus_bank_ag`, `btv_vier_lander_bank`, `capital_bank_grawe_gruppe_ag`, `deutsche_bank_ag`,
     * `dolomitenbank`, `easybank_ag`, `erste_bank_und_sparkassen`, `hypo_alpeadriabank_international_ag`,
     * `hypo_noe_lb_fur_niederosterreich_u_wien`, `hypo_oberosterreich_salzburg_steiermark`, `hypo_tirol_bank_ag`,
     * `hypo_vorarlberg_bank_ag`, `hypo_bank_burgenland_aktiengesellschaft`, `marchfelder_bank`, `oberbank_ag`,
     * `raiffeisen_bankengruppe_osterreich`, `schoellerbank_ag`, `sparda_bank_wien`, `volksbank_gruppe`,
     * `volkskreditbank_ag`, or `vr_bank_braunau`.
     */
    public var bank: InlinePaymentMethodEpsBankX43bfcb33? = null

    public fun build(): PaymentMethodEps = PaymentMethodEps(
      bank = bank,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodEps = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodEps> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodEps {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodEps")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodEps must be a JSON object")
      return PaymentMethodEps(
        bank = rawObject["bank"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodEpsBankX43bfcb33?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodEps) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodEps")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bank?.let { put("bank", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodEps(block: PaymentMethodEps.Builder.() -> Unit): PaymentMethodEps = PaymentMethodEps.build(block)
