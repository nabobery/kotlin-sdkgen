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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Details of the card used for this payment attempt.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails(
  /**
   * The authorization code of the payment.
   */
  public val authorizationCode: String? = null,
  /**
   * Card brand. Can be `amex`, `cartes_bancaires`, `diners`, `discover`, `eftpos_au`, `jcb`, `link`, `mastercard`,
   * `unionpay`, `visa` or `unknown`.
   */
  public val brand: InlinePaymentsPrimitivesPa0ad7BrandX2897e15d? = null,
  /**
   * When using manual capture, a future timestamp at which the charge will be automatically refunded if uncaptured.
   */
  public val captureBefore: Int? = null,
  /**
   * Check results by Card networks on Card address and CVC at time of payment.
   */
  public val checks: InlinePaymentsPrimitivesPa0ad7ChecksX56edce12? = null,
  /**
   * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of the
   * international breakdown of cards you've collected.
   */
  public val country: String? = null,
  /**
   * Two-digit number representing the card's expiration month.
   */
  public val expMonth: Int? = null,
  /**
   * Four-digit number representing the card's expiration year.
   */
  public val expYear: Int? = null,
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
  public val funding: InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805? = null,
  /**
   * Installment details for this payment.
   */
  public val installments: InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c? = null,
  /**
   * The last four digits of the card.
   */
  public val last4: String? = null,
  /**
   * Identifies which network this charge was processed on. Can be `amex`, `cartes_bancaires`, `diners`, `discover`,
   * `eftpos_au`, `interac`, `jcb`, `link`, `mastercard`, `unionpay`, `visa`, or `unknown`.
   */
  public val network: InlinePaymentsPrimitivesPa0ad7NetworkX4ca57c84? = null,
  /**
   * Advice code from the card network for the failed payment.
   */
  public val networkAdviceCode: String? = null,
  /**
   * Decline code from the card network for the failed payment.
   */
  public val networkDeclineCode: String? = null,
  /**
   * If this card has network token credentials, this contains the details of the network token credentials.
   */
  public val networkToken: InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb? = null,
  /**
   * This is used by the financial networks to identify a transaction. Visa calls this the Transaction ID, Mastercard
   * calls this the Trace ID, and American Express calls this the Acquirer Reference Data. This value will be present if
   * it is returned by the financial network in the authorization response, and null otherwise.
   */
  public val networkTransactionId: String? = null,
  /**
   * Populated if this transaction used 3D Secure authentication.
   */
  public val threeDSecure: InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399? = null,
  /**
   * If this Card is part of a card wallet, this contains the details of the card wallet.
   */
  public val wallet: InlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba? = null,
) {
  public class Builder {
    /**
     * The authorization code of the payment.
     */
    public var authorizationCode: String? = null

    /**
     * Card brand. Can be `amex`, `cartes_bancaires`, `diners`, `discover`, `eftpos_au`, `jcb`, `link`, `mastercard`,
     * `unionpay`, `visa` or `unknown`.
     */
    public var brand: InlinePaymentsPrimitivesPa0ad7BrandX2897e15d? = null

    /**
     * When using manual capture, a future timestamp at which the charge will be automatically refunded if uncaptured.
     */
    public var captureBefore: Int? = null

    /**
     * Check results by Card networks on Card address and CVC at time of payment.
     */
    public var checks: InlinePaymentsPrimitivesPa0ad7ChecksX56edce12? = null

    /**
     * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of the
     * international breakdown of cards you've collected.
     */
    public var country: String? = null

    /**
     * Two-digit number representing the card's expiration month.
     */
    public var expMonth: Int? = null

    /**
     * Four-digit number representing the card's expiration year.
     */
    public var expYear: Int? = null

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
    public var funding: InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805? = null

    /**
     * Installment details for this payment.
     */
    public var installments: InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c? = null

    /**
     * The last four digits of the card.
     */
    public var last4: String? = null

    /**
     * Identifies which network this charge was processed on. Can be `amex`, `cartes_bancaires`, `diners`, `discover`,
     * `eftpos_au`, `interac`, `jcb`, `link`, `mastercard`, `unionpay`, `visa`, or `unknown`.
     */
    public var network: InlinePaymentsPrimitivesPa0ad7NetworkX4ca57c84? = null

    /**
     * Advice code from the card network for the failed payment.
     */
    public var networkAdviceCode: String? = null

    /**
     * Decline code from the card network for the failed payment.
     */
    public var networkDeclineCode: String? = null

    /**
     * If this card has network token credentials, this contains the details of the network token credentials.
     */
    public var networkToken: InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb? = null

    /**
     * This is used by the financial networks to identify a transaction. Visa calls this the Transaction ID, Mastercard
     * calls this the Trace ID, and American Express calls this the Acquirer Reference Data. This value will be present
     * if it is returned by the financial network in the authorization response, and null otherwise.
     */
    public var networkTransactionId: String? = null

    /**
     * Populated if this transaction used 3D Secure authentication.
     */
    public var threeDSecure: InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399? = null

    /**
     * If this Card is part of a card wallet, this contains the details of the card wallet.
     */
    public var wallet: InlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails(
      authorizationCode = authorizationCode,
      brand = brand,
      captureBefore = captureBefore,
      checks = checks,
      country = country,
      expMonth = expMonth,
      expYear = expYear,
      fingerprint = fingerprint,
      funding = funding,
      installments = installments,
      last4 = last4,
      network = network,
      networkAdviceCode = networkAdviceCode,
      networkDeclineCode = networkDeclineCode,
      networkToken = networkToken,
      networkTransactionId = networkTransactionId,
      threeDSecure = threeDSecure,
      wallet = wallet,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails must be a JSON object")
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails(
        authorizationCode = rawObject["authorization_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        brand = rawObject["brand"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPa0ad7BrandX2897e15d?>(element) },
        captureBefore = rawObject["capture_before"]?.let { json.decodeFromJsonElement<Int>(it) },
        checks = rawObject["checks"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPa0ad7ChecksX56edce12?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        expMonth = rawObject["exp_month"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        expYear = rawObject["exp_year"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        funding = rawObject["funding"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPa0ad7FundingX5fc3e805?>(element) },
        installments = rawObject["installments"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPa0ad7InstallmentsXb8cfad2c?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        network = rawObject["network"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPa0ad7NetworkX4ca57c84?>(element) },
        networkAdviceCode = rawObject["network_advice_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        networkDeclineCode = rawObject["network_decline_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        networkToken = rawObject["network_token"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPa0ad7NetworkTokenXf89594bb?>(element) },
        networkTransactionId = rawObject["network_transaction_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        threeDSecure = rawObject["three_d_secure"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPa0ad7ThreeDSecureX99a92399?>(element) },
        wallet = rawObject["wallet"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.authorizationCode?.let { put("authorization_code", it) }
        value.brand?.let { put("brand", json.encodeToJsonElement(it)) }
        value.captureBefore?.let { put("capture_before", json.encodeToJsonElement(it)) }
        value.checks?.let { put("checks", json.encodeToJsonElement(it)) }
        value.country?.let { put("country", it) }
        value.expMonth?.let { put("exp_month", json.encodeToJsonElement(it)) }
        value.expYear?.let { put("exp_year", json.encodeToJsonElement(it)) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.funding?.let { put("funding", json.encodeToJsonElement(it)) }
        value.installments?.let { put("installments", json.encodeToJsonElement(it)) }
        value.last4?.let { put("last4", it) }
        value.network?.let { put("network", json.encodeToJsonElement(it)) }
        value.networkAdviceCode?.let { put("network_advice_code", it) }
        value.networkDeclineCode?.let { put("network_decline_code", it) }
        value.networkToken?.let { put("network_token", json.encodeToJsonElement(it)) }
        value.networkTransactionId?.let { put("network_transaction_id", it) }
        value.threeDSecure?.let { put("three_d_secure", json.encodeToJsonElement(it)) }
        value.wallet?.let { put("wallet", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails(block: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails.build(block)
