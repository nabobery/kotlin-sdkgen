package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
public data class IssuingAuthorizationPendingRequestView(
  public val amount: Int,
  @SerialName("amount_details")
  public val amountDetails: InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e? = null,
  public val currency: String,
  @SerialName("is_amount_controllable")
  public val isAmountControllable: Boolean,
  @SerialName("merchant_amount")
  public val merchantAmount: Int,
  @SerialName("merchant_currency")
  public val merchantCurrency: String,
  @SerialName("network_risk_score")
  public val networkRiskScore: Int? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_pending_request
 */
@Serializable(with = IssuingAuthorizationPendingRequest.Serializer::class)
public class IssuingAuthorizationPendingRequest(
  /**
   * The additional amount Stripe will hold if the authorization is approved, in the card's
   * [currency](https://docs.stripe.com/api#issuing_authorization_object-pending-request-currency) and in the [smallest
   * currency unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val amount: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * If set `true`, you may provide
   * [amount](https://docs.stripe.com/api/issuing/authorizations/approve#approve_issuing_authorization-amount) to
   * control how much to hold for the authorization.
   */
  public val isAmountControllable: Boolean,
  /**
   * The amount the merchant is requesting to be authorized in the `merchant_currency`. The amount is in the [smallest
   * currency unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val merchantAmount: Int,
  /**
   * The local currency the merchant is requesting to authorize.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val merchantCurrency: String,
  /**
   * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest currency
   * unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val amountDetails: InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e? = null,
  /**
   * The card network's estimate of the likelihood that an authorization is fraudulent. Takes on values between 1 and
   * 99.
   */
  public val networkRiskScore: Int? = null,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var isAmountControllableValue: Boolean? = null

    public var isAmountControllable: Boolean
      get() = requireNotNull(isAmountControllableValue) { "isAmountControllable is required" }
      set(`value`) {
        isAmountControllableValue = value
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

    /**
     * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest
     * currency unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public var amountDetails: InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e? = null

    /**
     * The card network's estimate of the likelihood that an authorization is fraudulent. Takes on values between 1 and
     * 99.
     */
    public var networkRiskScore: Int? = null

    public fun build(): IssuingAuthorizationPendingRequest {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      check(isAmountControllableValue != null) { "isAmountControllable is required" }
      check(merchantAmountValue != null) { "merchantAmount is required" }
      check(merchantCurrencyValue != null) { "merchantCurrency is required" }
      return IssuingAuthorizationPendingRequest(
        amount = amount,
        currency = currency,
        isAmountControllable = isAmountControllable,
        merchantAmount = merchantAmount,
        merchantCurrency = merchantCurrency,
        amountDetails = amountDetails,
        networkRiskScore = networkRiskScore,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingAuthorizationPendingRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingAuthorizationPendingRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingAuthorizationPendingRequest {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingAuthorizationPendingRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingAuthorizationPendingRequest must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val isAmountControllable = json.decodeRequired<Boolean>(rawObject, "is_amount_controllable")
      val merchantAmount = json.decodeRequired<Int>(rawObject, "merchant_amount")
      val merchantCurrency = json.decodeRequired<String>(rawObject, "merchant_currency")
      return IssuingAuthorizationPendingRequest(
        amount = amount,
        currency = currency,
        isAmountControllable = isAmountControllable,
        merchantAmount = merchantAmount,
        merchantCurrency = merchantCurrency,
        amountDetails = rawObject["amount_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingAuthorizationPendingRequestAmountDetailsX24b05e6e?>(element) },
        networkRiskScore = rawObject["network_risk_score"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingAuthorizationPendingRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingAuthorizationPendingRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        put("is_amount_controllable", json.encodeToJsonElement(value.isAmountControllable))
        put("merchant_amount", json.encodeToJsonElement(value.merchantAmount))
        put("merchant_currency", value.merchantCurrency)
        value.amountDetails?.let { put("amount_details", json.encodeToJsonElement(it)) }
        value.networkRiskScore?.let { put("network_risk_score", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingAuthorizationPendingRequest(block: IssuingAuthorizationPendingRequest.Builder.() -> Unit): IssuingAuthorizationPendingRequest = IssuingAuthorizationPendingRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingAuthorizationPendingRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
