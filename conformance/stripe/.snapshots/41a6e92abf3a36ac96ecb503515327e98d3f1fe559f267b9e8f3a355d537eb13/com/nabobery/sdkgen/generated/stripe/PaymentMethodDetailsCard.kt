package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card
 */
@Serializable(with = PaymentMethodDetailsCard.Serializer::class)
public class PaymentMethodDetailsCard(
  /**
   * Two-digit number representing the card's expiration month.
   */
  public val expMonth: Int,
  /**
   * Four-digit number representing the card's expiration year.
   */
  public val expYear: Int,
  /**
   * The authorized amount.
   */
  public val amountAuthorized: Int? = null,
  /**
   * Authorization code on the charge.
   */
  public val authorizationCode: String? = null,
  /**
   * Card brand. Can be `amex`, `cartes_bancaires`, `diners`, `discover`, `eftpos_au`, `jcb`, `link`, `mastercard`,
   * `unionpay`, `visa` or `unknown`.
   */
  public val brand: String? = null,
  /**
   * When using manual capture, a future timestamp at which the charge will be automatically refunded if uncaptured.
   */
  public val captureBefore: Int? = null,
  /**
   * Check results by Card networks on Card address and CVC at time of payment.
   */
  public val checks: InlinePaymentMethodDetailsCardChecksX10867324? = null,
  /**
   * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of the
   * international breakdown of cards you've collected.
   */
  public val country: String? = null,
  public val extendedAuthorization:
      PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesExtendedAuthorizationExtendedAuthorization? = null,
  /**
   * Uniquely identifies this particular card number. You can use this attribute to check whether two customers who’ve
   * signed up with you are using the same card number, for example. For payment methods that tokenize card information
   * (Apple Pay, Google Pay), the tokenized number might be provided instead of the underlying card number.
   *
   * *As of May 1, 2021, card fingerprint in India for Connect changed to allow two fingerprints for the same card---one
   * for India and one for the rest of the world.*
   */
  public val fingerprint: String? = null,
  /**
   * Card funding type. Can be `credit`, `debit`, `prepaid`, or `unknown`.
   */
  public val funding: String? = null,
  public val incrementalAuthorization:
      PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesIncrementalAuthorizationIncrementalAuthorization? = null,
  /**
   * Installment details for this payment.
   *
   * For more information, see the [installments integration guide](https://docs.stripe.com/payments/installments).
   */
  public val installments: InlinePaymentMethodDetailsCardInstallmentsXac717376? = null,
  /**
   * The last four digits of the card.
   */
  public val last4: String? = null,
  /**
   * ID of the mandate used to make this payment or created by it.
   */
  public val mandate: String? = null,
  public val multicapture:
      PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture? = null,
  /**
   * Identifies which network this charge was processed on. Can be `amex`, `cartes_bancaires`, `diners`, `discover`,
   * `eftpos_au`, `interac`, `jcb`, `link`, `mastercard`, `unionpay`, `visa`, or `unknown`.
   */
  public val network: String? = null,
  /**
   * If this card has network token credentials, this contains the details of the network token credentials.
   */
  public val networkToken: InlinePaymentMethodDetailsCardNetworkTokenX290e6729? = null,
  /**
   * This is used by the financial networks to identify a transaction. Visa calls this the Transaction ID, Mastercard
   * calls this the Trace ID, and American Express calls this the Acquirer Reference Data. This value will be present if
   * it is returned by the financial network in the authorization response, and null otherwise.
   */
  public val networkTransactionId: String? = null,
  public val overcapture:
      PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture? = null,
  /**
   * Status of a card based on the card issuer.
   */
  public val regulatedStatus: InlinePaymentMethodDetailsCardRegulatedStatusX00da7a55? = null,
  /**
   * Populated if this transaction used 3D Secure authentication.
   */
  public val threeDSecure: InlinePaymentMethodDetailsCardThreeDSecureX57531d65? = null,
  /**
   * Transaction Link ID (TLID) is a unique identifier for a transaction. This is used by some card networks, such as
   * Mastercard, for transaction linking, in addition to Network Transaction IDs. This value will be present if it is
   * returned by the financial network in the authorization response, and null otherwise.
   */
  public val transactionLinkId: String? = null,
  /**
   * If this Card is part of a card wallet, this contains the details of the card wallet.
   */
  public val wallet: InlinePaymentMethodDetailsCardWalletX3d6951c5? = null,
) {
  public class Builder {
    private var expMonthValue: Int? = null

    public var expMonth: Int
      get() = requireNotNull(expMonthValue) { "expMonth is required" }
      set(`value`) {
        expMonthValue = value
      }

    private var expYearValue: Int? = null

    public var expYear: Int
      get() = requireNotNull(expYearValue) { "expYear is required" }
      set(`value`) {
        expYearValue = value
      }

    /**
     * The authorized amount.
     */
    public var amountAuthorized: Int? = null

    /**
     * Authorization code on the charge.
     */
    public var authorizationCode: String? = null

    /**
     * Card brand. Can be `amex`, `cartes_bancaires`, `diners`, `discover`, `eftpos_au`, `jcb`, `link`, `mastercard`,
     * `unionpay`, `visa` or `unknown`.
     */
    public var brand: String? = null

    /**
     * When using manual capture, a future timestamp at which the charge will be automatically refunded if uncaptured.
     */
    public var captureBefore: Int? = null

    /**
     * Check results by Card networks on Card address and CVC at time of payment.
     */
    public var checks: InlinePaymentMethodDetailsCardChecksX10867324? = null

    /**
     * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of the
     * international breakdown of cards you've collected.
     */
    public var country: String? = null

    public var extendedAuthorization:
        PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesExtendedAuthorizationExtendedAuthorization?
        = null

    /**
     * Uniquely identifies this particular card number. You can use this attribute to check whether two customers who’ve
     * signed up with you are using the same card number, for example. For payment methods that tokenize card
     * information (Apple Pay, Google Pay), the tokenized number might be provided instead of the underlying card
     * number.
     *
     * *As of May 1, 2021, card fingerprint in India for Connect changed to allow two fingerprints for the same
     * card---one for India and one for the rest of the world.*
     */
    public var fingerprint: String? = null

    /**
     * Card funding type. Can be `credit`, `debit`, `prepaid`, or `unknown`.
     */
    public var funding: String? = null

    public var incrementalAuthorization:
        PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesIncrementalAuthorizationIncrementalAuthorization?
        = null

    /**
     * Installment details for this payment.
     *
     * For more information, see the [installments integration guide](https://docs.stripe.com/payments/installments).
     */
    public var installments: InlinePaymentMethodDetailsCardInstallmentsXac717376? = null

    /**
     * The last four digits of the card.
     */
    public var last4: String? = null

    /**
     * ID of the mandate used to make this payment or created by it.
     */
    public var mandate: String? = null

    public var multicapture: PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture? =
        null

    /**
     * Identifies which network this charge was processed on. Can be `amex`, `cartes_bancaires`, `diners`, `discover`,
     * `eftpos_au`, `interac`, `jcb`, `link`, `mastercard`, `unionpay`, `visa`, or `unknown`.
     */
    public var network: String? = null

    /**
     * If this card has network token credentials, this contains the details of the network token credentials.
     */
    public var networkToken: InlinePaymentMethodDetailsCardNetworkTokenX290e6729? = null

    /**
     * This is used by the financial networks to identify a transaction. Visa calls this the Transaction ID, Mastercard
     * calls this the Trace ID, and American Express calls this the Acquirer Reference Data. This value will be present
     * if it is returned by the financial network in the authorization response, and null otherwise.
     */
    public var networkTransactionId: String? = null

    public var overcapture:
        PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture?
        = null

    /**
     * Status of a card based on the card issuer.
     */
    public var regulatedStatus: InlinePaymentMethodDetailsCardRegulatedStatusX00da7a55? = null

    /**
     * Populated if this transaction used 3D Secure authentication.
     */
    public var threeDSecure: InlinePaymentMethodDetailsCardThreeDSecureX57531d65? = null

    /**
     * Transaction Link ID (TLID) is a unique identifier for a transaction. This is used by some card networks, such as
     * Mastercard, for transaction linking, in addition to Network Transaction IDs. This value will be present if it is
     * returned by the financial network in the authorization response, and null otherwise.
     */
    public var transactionLinkId: String? = null

    /**
     * If this Card is part of a card wallet, this contains the details of the card wallet.
     */
    public var wallet: InlinePaymentMethodDetailsCardWalletX3d6951c5? = null

    public fun build(): PaymentMethodDetailsCard {
      check(expMonthValue != null) { "expMonth is required" }
      check(expYearValue != null) { "expYear is required" }
      return PaymentMethodDetailsCard(
        expMonth = expMonth,
        expYear = expYear,
        amountAuthorized = amountAuthorized,
        authorizationCode = authorizationCode,
        brand = brand,
        captureBefore = captureBefore,
        checks = checks,
        country = country,
        extendedAuthorization = extendedAuthorization,
        fingerprint = fingerprint,
        funding = funding,
        incrementalAuthorization = incrementalAuthorization,
        installments = installments,
        last4 = last4,
        mandate = mandate,
        multicapture = multicapture,
        network = network,
        networkToken = networkToken,
        networkTransactionId = networkTransactionId,
        overcapture = overcapture,
        regulatedStatus = regulatedStatus,
        threeDSecure = threeDSecure,
        transactionLinkId = transactionLinkId,
        wallet = wallet,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsCard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsCard {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsCard must be a JSON object")
      val expMonth = json.decodeRequired<Int>(rawObject, "exp_month")
      val expYear = json.decodeRequired<Int>(rawObject, "exp_year")
      return PaymentMethodDetailsCard(
        expMonth = expMonth,
        expYear = expYear,
        amountAuthorized = rawObject["amount_authorized"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        authorizationCode = rawObject["authorization_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        brand = rawObject["brand"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        captureBefore = rawObject["capture_before"]?.let { json.decodeFromJsonElement<Int>(it) },
        checks = rawObject["checks"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsCardChecksX10867324?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        extendedAuthorization = rawObject["extended_authorization"]?.let { json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesExtendedAuthorizationExtendedAuthorization>(it) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        funding = rawObject["funding"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        incrementalAuthorization = rawObject["incremental_authorization"]?.let { json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesIncrementalAuthorizationIncrementalAuthorization>(it) },
        installments = rawObject["installments"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsCardInstallmentsXac717376?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        mandate = rawObject["mandate"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        multicapture = rawObject["multicapture"]?.let { json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceMulticapture>(it) },
        network = rawObject["network"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        networkToken = rawObject["network_token"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsCardNetworkTokenX290e6729?>(element) },
        networkTransactionId = rawObject["network_transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        overcapture = rawObject["overcapture"]?.let { json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsCardDetailsApiResourceEnterpriseFeaturesOvercaptureOvercapture>(it) },
        regulatedStatus = rawObject["regulated_status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsCardRegulatedStatusX00da7a55?>(element) },
        threeDSecure = rawObject["three_d_secure"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsCardThreeDSecureX57531d65?>(element) },
        transactionLinkId = rawObject["transaction_link_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        wallet = rawObject["wallet"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsCardWalletX3d6951c5?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsCard) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("exp_month", json.encodeToJsonElement(value.expMonth))
        put("exp_year", json.encodeToJsonElement(value.expYear))
        value.amountAuthorized?.let { put("amount_authorized", json.encodeToJsonElement(it)) }
        value.authorizationCode?.let { put("authorization_code", it) }
        value.brand?.let { put("brand", it) }
        value.captureBefore?.let { put("capture_before", json.encodeToJsonElement(it)) }
        value.checks?.let { put("checks", json.encodeToJsonElement(it)) }
        value.country?.let { put("country", it) }
        value.extendedAuthorization?.let { put("extended_authorization", json.encodeToJsonElement(it)) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.funding?.let { put("funding", it) }
        value.incrementalAuthorization?.let { put("incremental_authorization", json.encodeToJsonElement(it)) }
        value.installments?.let { put("installments", json.encodeToJsonElement(it)) }
        value.last4?.let { put("last4", it) }
        value.mandate?.let { put("mandate", it) }
        value.multicapture?.let { put("multicapture", json.encodeToJsonElement(it)) }
        value.network?.let { put("network", it) }
        value.networkToken?.let { put("network_token", json.encodeToJsonElement(it)) }
        value.networkTransactionId?.let { put("network_transaction_id", it) }
        value.overcapture?.let { put("overcapture", json.encodeToJsonElement(it)) }
        value.regulatedStatus?.let { put("regulated_status", json.encodeToJsonElement(it)) }
        value.threeDSecure?.let { put("three_d_secure", json.encodeToJsonElement(it)) }
        value.transactionLinkId?.let { put("transaction_link_id", it) }
        value.wallet?.let { put("wallet", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsCard(block: PaymentMethodDetailsCard.Builder.() -> Unit): PaymentMethodDetailsCard = PaymentMethodDetailsCard.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodDetailsCard is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
