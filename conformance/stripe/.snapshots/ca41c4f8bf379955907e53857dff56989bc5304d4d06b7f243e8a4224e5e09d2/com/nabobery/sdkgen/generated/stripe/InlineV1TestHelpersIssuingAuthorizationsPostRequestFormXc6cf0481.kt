package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481.Serializer::class)
public class InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481(
  /**
   * Card associated with this authorization.
   */
  public val card: String,
  /**
   * The total amount to attempt to authorize. This amount is in the provided currency, or defaults to the card's
   * currency, and in the [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val amount: Int? = null,
  /**
   * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val amountDetails:
      InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05? = null,
  /**
   * How the card details were provided. Defaults to online.
   */
  public val authorizationMethod:
      InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a? = null,
  /**
   * The currency of the authorization. If not provided, defaults to the currency of the card. Three-letter [ISO
   * currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported
   * currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  expand: List<String>? = null,
  /**
   * Fleet-specific information for authorizations using Fleet cards.
   */
  public val fleet: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e? = null,
  /**
   * Probability that this transaction can be disputed in the event of fraud. Assessed by comparing the characteristics
   * of the authorization to card network rules.
   */
  public val fraudDisputabilityLikelihood:
      InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a? = null,
  /**
   * Information about fuel that was purchased with this transaction.
   */
  public val fuel: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelX766df20a? = null,
  /**
   * If set `true`, you may provide
   * [amount](https://docs.stripe.com/api/issuing/authorizations/approve#approve_issuing_authorization-amount) to
   * control how much to hold for the authorization.
   */
  public val isAmountControllable: Boolean? = null,
  /**
   * The total amount to attempt to authorize. This amount is in the provided merchant currency, and in the [smallest
   * currency unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val merchantAmount: Int? = null,
  /**
   * The currency of the authorization. If not provided, defaults to the currency of the card. Three-letter [ISO
   * currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported
   * currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val merchantCurrency: String? = null,
  /**
   * Details about the seller (grocery store, e-commerce website, etc.) where the card authorization happened.
   */
  public val merchantData:
      InlineV1TestHelpersIssuingAuthorizationsPostRequestFormMerchantDataX6d8b8b89? = null,
  /**
   * Details about the authorization, such as identifiers, set by the card network.
   */
  public val networkData:
      InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458? = null,
  /**
   * Stripe’s assessment of the fraud risk for this authorization.
   */
  public val riskAssessment:
      InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598? = null,
  /**
   * Verifications that Stripe performed on information that the cardholder provided to the merchant.
   */
  public val verificationData:
      InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5? = null,
  /**
   * The digital wallet used for this transaction. One of `apple_pay`, `google_pay`, or `samsung_pay`. Will populate as
   * `null` when no digital wallet was utilized.
   */
  public val wallet: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var cardValue: String? = null

    public var card: String
      get() = requireNotNull(cardValue) { "card is required" }
      set(`value`) {
        cardValue = value
      }

    /**
     * The total amount to attempt to authorize. This amount is in the provided currency, or defaults to the card's
     * currency, and in the [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public var amount: Int? = null

    /**
     * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest
     * currency unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public var amountDetails:
        InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05? = null

    /**
     * How the card details were provided. Defaults to online.
     */
    public var authorizationMethod:
        InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a? = null

    /**
     * The currency of the authorization. If not provided, defaults to the currency of the card. Three-letter [ISO
     * currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported
     * currency](https://stripe.com/docs/currencies).
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Fleet-specific information for authorizations using Fleet cards.
     */
    public var fleet: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e? = null

    /**
     * Probability that this transaction can be disputed in the event of fraud. Assessed by comparing the
     * characteristics of the authorization to card network rules.
     */
    public var fraudDisputabilityLikelihood:
        InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a? = null

    /**
     * Information about fuel that was purchased with this transaction.
     */
    public var fuel: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelX766df20a? = null

    /**
     * If set `true`, you may provide
     * [amount](https://docs.stripe.com/api/issuing/authorizations/approve#approve_issuing_authorization-amount) to
     * control how much to hold for the authorization.
     */
    public var isAmountControllable: Boolean? = null

    /**
     * The total amount to attempt to authorize. This amount is in the provided merchant currency, and in the [smallest
     * currency unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public var merchantAmount: Int? = null

    /**
     * The currency of the authorization. If not provided, defaults to the currency of the card. Three-letter [ISO
     * currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported
     * currency](https://stripe.com/docs/currencies).
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var merchantCurrency: String? = null

    /**
     * Details about the seller (grocery store, e-commerce website, etc.) where the card authorization happened.
     */
    public var merchantData:
        InlineV1TestHelpersIssuingAuthorizationsPostRequestFormMerchantDataX6d8b8b89? = null

    /**
     * Details about the authorization, such as identifiers, set by the card network.
     */
    public var networkData:
        InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458? = null

    /**
     * Stripe’s assessment of the fraud risk for this authorization.
     */
    public var riskAssessment:
        InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598? = null

    /**
     * Verifications that Stripe performed on information that the cardholder provided to the merchant.
     */
    public var verificationData:
        InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5? = null

    /**
     * The digital wallet used for this transaction. One of `apple_pay`, `google_pay`, or `samsung_pay`. Will populate
     * as `null` when no digital wallet was utilized.
     */
    public var wallet: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495? =
        null

    public fun build(): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481 {
      check(cardValue != null) { "card is required" }
      return InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481(
        card = card,
        amount = amount,
        amountDetails = amountDetails,
        authorizationMethod = authorizationMethod,
        currency = currency,
        expand = expand,
        fleet = fleet,
        fraudDisputabilityLikelihood = fraudDisputabilityLikelihood,
        fuel = fuel,
        isAmountControllable = isAmountControllable,
        merchantAmount = merchantAmount,
        merchantCurrency = merchantCurrency,
        merchantData = merchantData,
        networkData = networkData,
        riskAssessment = riskAssessment,
        verificationData = verificationData,
        wallet = wallet,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481 must be a JSON object")
      val card = json.decodeRequired<String>(rawObject, "card")
      return InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481(
        card = card,
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        amountDetails = rawObject["amount_details"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormAmountDetailsX2414de05>(it) },
        authorizationMethod = rawObject["authorization_method"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormAuthorizationMethodX2692193a>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        fleet = rawObject["fleet"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFleetXd434de5e>(it) },
        fraudDisputabilityLikelihood = rawObject["fraud_disputability_likelihood"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing214aPostRequestFormFraudDisputabilityLif498X30ca872a>(it) },
        fuel = rawObject["fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelX766df20a>(it) },
        isAmountControllable = rawObject["is_amount_controllable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        merchantAmount = rawObject["merchant_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        merchantCurrency = rawObject["merchant_currency"]?.let { json.decodeFromJsonElement<String>(it) },
        merchantData = rawObject["merchant_data"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormMerchantDataX6d8b8b89>(it) },
        networkData = rawObject["network_data"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormNetworkDataX2f17c458>(it) },
        riskAssessment = rawObject["risk_assessment"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormRiskAssessmentX0e063598>(it) },
        verificationData = rawObject["verification_data"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormVerificationDataX9cb5dbd5>(it) },
        wallet = rawObject["wallet"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("card", value.card)
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.amountDetails?.let { put("amount_details", json.encodeToJsonElement(it)) }
        value.authorizationMethod?.let { put("authorization_method", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.fleet?.let { put("fleet", json.encodeToJsonElement(it)) }
        value.fraudDisputabilityLikelihood?.let { put("fraud_disputability_likelihood", json.encodeToJsonElement(it)) }
        value.fuel?.let { put("fuel", json.encodeToJsonElement(it)) }
        value.isAmountControllable?.let { put("is_amount_controllable", json.encodeToJsonElement(it)) }
        value.merchantAmount?.let { put("merchant_amount", json.encodeToJsonElement(it)) }
        value.merchantCurrency?.let { put("merchant_currency", it) }
        value.merchantData?.let { put("merchant_data", json.encodeToJsonElement(it)) }
        value.networkData?.let { put("network_data", json.encodeToJsonElement(it)) }
        value.riskAssessment?.let { put("risk_assessment", json.encodeToJsonElement(it)) }
        value.verificationData?.let { put("verification_data", json.encodeToJsonElement(it)) }
        value.wallet?.let { put("wallet", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481(block: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481.Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481 = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
