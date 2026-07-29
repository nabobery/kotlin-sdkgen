package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class ChargeOutcomeView(
  @SerialName("advice_code")
  public val adviceCode: InlineChargeOutcomeAdviceCodeX46e228bf? = null,
  @SerialName("network_advice_code")
  public val networkAdviceCode: String? = null,
  @SerialName("network_decline_code")
  public val networkDeclineCode: String? = null,
  @SerialName("network_status")
  public val networkStatus: String? = null,
  public val reason: String? = null,
  @SerialName("risk_level")
  public val riskLevel: String? = null,
  @SerialName("risk_score")
  public val riskScore: Int? = null,
  public val rule: InlineChargeOutcomeRuleXe4c798b7? = null,
  @SerialName("seller_message")
  public val sellerMessage: String? = null,
  public val type: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge_outcome
 */
@Serializable(with = ChargeOutcome.Serializer::class)
public class ChargeOutcome(
  /**
   * Possible values are `authorized`, `manual_review`, `issuer_declined`, `blocked`, and `invalid`. See [understanding
   * declines](https://docs.stripe.com/declines) and [Radar reviews](https://docs.stripe.com/radar/reviews) for details.
   */
  public val type: String,
  /**
   * An enumerated value providing a more detailed explanation on [how to proceed with an
   * error](https://docs.stripe.com/declines#retrying-issuer-declines).
   */
  public val adviceCode: InlineChargeOutcomeAdviceCodeX46e228bf? = null,
  /**
   * For charges declined by the network, a 2 digit code which indicates the advice returned by the network on how to
   * proceed with an error.
   */
  public val networkAdviceCode: String? = null,
  /**
   * For charges declined by the network, an alphanumeric code which indicates the reason the charge failed.
   */
  public val networkDeclineCode: String? = null,
  /**
   * Possible values are `approved_by_network`, `declined_by_network`, `not_sent_to_network`, and
   * `reversed_after_approval`. The value `reversed_after_approval` indicates the payment was [blocked by
   * Stripe](https://docs.stripe.com/declines#blocked-payments) after bank authorization, and may temporarily appear as
   * "pending" on a cardholder's statement.
   */
  public val networkStatus: String? = null,
  /**
   * An enumerated value providing a more detailed explanation of the outcome's `type`. Charges blocked by Radar's
   * default block rule have the value `highest_risk_level`. Charges placed in review by Radar's default review rule
   * have the value `elevated_risk_level`. Charges blocked because the payment is unlikely to be authorized have the
   * value `low_probability_of_authorization`. Charges authorized, blocked, or placed in review by custom rules have the
   * value `rule`. See [understanding declines](https://docs.stripe.com/declines) for more details.
   */
  public val reason: String? = null,
  /**
   * Stripe Radar's evaluation of the riskiness of the payment. Possible values for evaluated payments are `normal`,
   * `elevated`, `highest`. For non-card payments, and card-based payments predating the public assignment of risk
   * levels, this field will have the value `not_assessed`. In the event of an error in the evaluation, this field will
   * have the value `unknown`. This field is only available with Radar.
   */
  public val riskLevel: String? = null,
  /**
   * Stripe Radar's evaluation of the riskiness of the payment. Possible values for evaluated payments are between 0 and
   * 100. For non-card payments, card-based payments predating the public assignment of risk scores, or in the event of
   * an error during evaluation, this field will not be present. This field is only available with Radar for Fraud
   * Teams.
   */
  public val riskScore: Int? = null,
  /**
   * The ID of the Radar rule that matched the payment, if applicable.
   */
  public val rule: InlineChargeOutcomeRuleXe4c798b7? = null,
  /**
   * A human-readable description of the outcome type and reason, designed for you (the recipient of the payment), not
   * your customer.
   */
  public val sellerMessage: String? = null,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * An enumerated value providing a more detailed explanation on [how to proceed with an
     * error](https://docs.stripe.com/declines#retrying-issuer-declines).
     */
    public var adviceCode: InlineChargeOutcomeAdviceCodeX46e228bf? = null

    /**
     * For charges declined by the network, a 2 digit code which indicates the advice returned by the network on how to
     * proceed with an error.
     */
    public var networkAdviceCode: String? = null

    /**
     * For charges declined by the network, an alphanumeric code which indicates the reason the charge failed.
     */
    public var networkDeclineCode: String? = null

    /**
     * Possible values are `approved_by_network`, `declined_by_network`, `not_sent_to_network`, and
     * `reversed_after_approval`. The value `reversed_after_approval` indicates the payment was [blocked by
     * Stripe](https://docs.stripe.com/declines#blocked-payments) after bank authorization, and may temporarily appear
     * as "pending" on a cardholder's statement.
     */
    public var networkStatus: String? = null

    /**
     * An enumerated value providing a more detailed explanation of the outcome's `type`. Charges blocked by Radar's
     * default block rule have the value `highest_risk_level`. Charges placed in review by Radar's default review rule
     * have the value `elevated_risk_level`. Charges blocked because the payment is unlikely to be authorized have the
     * value `low_probability_of_authorization`. Charges authorized, blocked, or placed in review by custom rules have
     * the value `rule`. See [understanding declines](https://docs.stripe.com/declines) for more details.
     */
    public var reason: String? = null

    /**
     * Stripe Radar's evaluation of the riskiness of the payment. Possible values for evaluated payments are `normal`,
     * `elevated`, `highest`. For non-card payments, and card-based payments predating the public assignment of risk
     * levels, this field will have the value `not_assessed`. In the event of an error in the evaluation, this field
     * will have the value `unknown`. This field is only available with Radar.
     */
    public var riskLevel: String? = null

    /**
     * Stripe Radar's evaluation of the riskiness of the payment. Possible values for evaluated payments are between 0
     * and 100. For non-card payments, card-based payments predating the public assignment of risk scores, or in the
     * event of an error during evaluation, this field will not be present. This field is only available with Radar for
     * Fraud Teams.
     */
    public var riskScore: Int? = null

    /**
     * The ID of the Radar rule that matched the payment, if applicable.
     */
    public var rule: InlineChargeOutcomeRuleXe4c798b7? = null

    /**
     * A human-readable description of the outcome type and reason, designed for you (the recipient of the payment), not
     * your customer.
     */
    public var sellerMessage: String? = null

    public fun build(): ChargeOutcome {
      check(typeValue != null) { "type is required" }
      return ChargeOutcome(
        type = type,
        adviceCode = adviceCode,
        networkAdviceCode = networkAdviceCode,
        networkDeclineCode = networkDeclineCode,
        networkStatus = networkStatus,
        reason = reason,
        riskLevel = riskLevel,
        riskScore = riskScore,
        rule = rule,
        sellerMessage = sellerMessage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChargeOutcome = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChargeOutcome> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChargeOutcome {
      val jsonDecoder = decoder.requireJsonDecoder("ChargeOutcome")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChargeOutcome must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return ChargeOutcome(
        type = type,
        adviceCode = rawObject["advice_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChargeOutcomeAdviceCodeX46e228bf?>(element) },
        networkAdviceCode = rawObject["network_advice_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        networkDeclineCode = rawObject["network_decline_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        networkStatus = rawObject["network_status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reason = rawObject["reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        riskLevel = rawObject["risk_level"]?.let { json.decodeFromJsonElement<String>(it) },
        riskScore = rawObject["risk_score"]?.let { json.decodeFromJsonElement<Int>(it) },
        rule = rawObject["rule"]?.let { json.decodeFromJsonElement<InlineChargeOutcomeRuleXe4c798b7>(it) },
        sellerMessage = rawObject["seller_message"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChargeOutcome) {
      val jsonEncoder = encoder.requireJsonEncoder("ChargeOutcome")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.adviceCode?.let { put("advice_code", json.encodeToJsonElement(it)) }
        value.networkAdviceCode?.let { put("network_advice_code", it) }
        value.networkDeclineCode?.let { put("network_decline_code", it) }
        value.networkStatus?.let { put("network_status", it) }
        value.reason?.let { put("reason", it) }
        value.riskLevel?.let { put("risk_level", it) }
        value.riskScore?.let { put("risk_score", json.encodeToJsonElement(it)) }
        value.rule?.let { put("rule", json.encodeToJsonElement(it)) }
        value.sellerMessage?.let { put("seller_message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chargeOutcome(block: ChargeOutcome.Builder.() -> Unit): ChargeOutcome = ChargeOutcome.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChargeOutcome is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
