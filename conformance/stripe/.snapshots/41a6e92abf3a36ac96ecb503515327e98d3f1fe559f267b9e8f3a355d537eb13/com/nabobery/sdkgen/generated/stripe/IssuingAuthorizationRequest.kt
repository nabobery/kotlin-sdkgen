package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_request
 */
@Serializable(with = IssuingAuthorizationRequest.Serializer::class)
public class IssuingAuthorizationRequest(
  /**
   * The `pending_request.amount` at the time of the request, presented in your card's currency and in the [smallest
   * currency unit](https://docs.stripe.com/currencies#zero-decimal). Stripe held this amount from your account to fund
   * the authorization if the request was approved.
   */
  public val amount: Int,
  /**
   * Whether this request was approved.
   */
  public val approved: Boolean,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   */
  public val currency: String,
  /**
   * The `pending_request.merchant_amount` at the time of the request, presented in the `merchant_currency` and in the
   * [smallest currency unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val merchantAmount: Int,
  /**
   * The currency that was collected by the merchant and presented to the cardholder for the authorization. Three-letter
   * [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported
   * currency](https://stripe.com/docs/currencies).
   */
  public val merchantCurrency: String,
  /**
   * When an authorization is approved or declined by you or by Stripe, this field provides additional detail on the
   * reason for the outcome.
   */
  public val reason: InlineIssuingAuthorizationRequestReasonXba35a429,
  /**
   * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val amountDetails: InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd? = null,
  /**
   * A code created by Stripe which is shared with the merchant to validate the authorization. This field will be
   * populated if the authorization message was approved. The code typically starts with the letter "S", followed by a
   * six-digit number. For example, "S498162". Please note that the code is not guaranteed to be unique across
   * authorizations.
   */
  public val authorizationCode: String? = null,
  /**
   * The card network's estimate of the likelihood that an authorization is fraudulent. Takes on values between 1 and
   * 99.
   */
  public val networkRiskScore: Int? = null,
  /**
   * If the `request_history.reason` is `webhook_error` because the direct webhook response is invalid (for example,
   * parsing errors or missing parameters), we surface a more detailed error message via this field.
   */
  public val reasonMessage: String? = null,
  /**
   * Time when the card network received an authorization request from the acquirer in UTC. Referred to by networks as
   * transmission time.
   */
  public val requestedAt: Int? = null,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var approvedValue: Boolean? = null

    public var approved: Boolean
      get() = requireNotNull(approvedValue) { "approved is required" }
      set(`value`) {
        approvedValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var merchantAmountValue: Int? = null

    public var merchantAmount: Int
      get() = requireNotNull(merchantAmountValue) { "merchantAmount is required" }
      set(`value`) {
        merchantAmountValue = value
      }

    private var merchantCurrencyValue: String? = null

    public var merchantCurrency: String
      get() = requireNotNull(merchantCurrencyValue) { "merchantCurrency is required" }
      set(`value`) {
        merchantCurrencyValue = value
      }

    private var reasonValue: InlineIssuingAuthorizationRequestReasonXba35a429? = null

    public var reason: InlineIssuingAuthorizationRequestReasonXba35a429
      get() = requireNotNull(reasonValue) { "reason is required" }
      set(`value`) {
        reasonValue = value
      }

    /**
     * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest
     * currency unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public var amountDetails: InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd? = null

    /**
     * A code created by Stripe which is shared with the merchant to validate the authorization. This field will be
     * populated if the authorization message was approved. The code typically starts with the letter "S", followed by a
     * six-digit number. For example, "S498162". Please note that the code is not guaranteed to be unique across
     * authorizations.
     */
    public var authorizationCode: String? = null

    /**
     * The card network's estimate of the likelihood that an authorization is fraudulent. Takes on values between 1 and
     * 99.
     */
    public var networkRiskScore: Int? = null

    /**
     * If the `request_history.reason` is `webhook_error` because the direct webhook response is invalid (for example,
     * parsing errors or missing parameters), we surface a more detailed error message via this field.
     */
    public var reasonMessage: String? = null

    /**
     * Time when the card network received an authorization request from the acquirer in UTC. Referred to by networks as
     * transmission time.
     */
    public var requestedAt: Int? = null

    public fun build(): IssuingAuthorizationRequest {
      check(amountValue != null) { "amount is required" }
      check(approvedValue != null) { "approved is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(merchantAmountValue != null) { "merchantAmount is required" }
      check(merchantCurrencyValue != null) { "merchantCurrency is required" }
      check(reasonValue != null) { "reason is required" }
      return IssuingAuthorizationRequest(
        amount = amount,
        approved = approved,
        created = created,
        currency = currency,
        merchantAmount = merchantAmount,
        merchantCurrency = merchantCurrency,
        reason = reason,
        amountDetails = amountDetails,
        authorizationCode = authorizationCode,
        networkRiskScore = networkRiskScore,
        reasonMessage = reasonMessage,
        requestedAt = requestedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingAuthorizationRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingAuthorizationRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingAuthorizationRequest {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingAuthorizationRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingAuthorizationRequest must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val approved = json.decodeRequired<Boolean>(rawObject, "approved")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val merchantAmount = json.decodeRequired<Int>(rawObject, "merchant_amount")
      val merchantCurrency = json.decodeRequired<String>(rawObject, "merchant_currency")
      val reason = json.decodeRequired<InlineIssuingAuthorizationRequestReasonXba35a429>(rawObject, "reason")
      return IssuingAuthorizationRequest(
        amount = amount,
        approved = approved,
        created = created,
        currency = currency,
        merchantAmount = merchantAmount,
        merchantCurrency = merchantCurrency,
        reason = reason,
        amountDetails = rawObject["amount_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingAuthorizationRequestAmountDetailsX5f1eb6cd?>(element) },
        authorizationCode = rawObject["authorization_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        networkRiskScore = rawObject["network_risk_score"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        reasonMessage = rawObject["reason_message"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        requestedAt = rawObject["requested_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingAuthorizationRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingAuthorizationRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("approved", json.encodeToJsonElement(value.approved))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("merchant_amount", json.encodeToJsonElement(value.merchantAmount))
        put("merchant_currency", value.merchantCurrency)
        put("reason", json.encodeToJsonElement(value.reason))
        value.amountDetails?.let { put("amount_details", json.encodeToJsonElement(it)) }
        value.authorizationCode?.let { put("authorization_code", it) }
        value.networkRiskScore?.let { put("network_risk_score", json.encodeToJsonElement(it)) }
        value.reasonMessage?.let { put("reason_message", it) }
        value.requestedAt?.let { put("requested_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingAuthorizationRequest(block: IssuingAuthorizationRequest.Builder.() -> Unit): IssuingAuthorizationRequest = IssuingAuthorizationRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingAuthorizationRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
