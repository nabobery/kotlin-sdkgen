package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

@Serializable
public data class IssuingAuthorizationView(
    public val amount: Int,
    @SerialName("amount_details")
    public val amountDetails: InlineIssuingAuthorizationAmountDetailsX5b709ff0? = null,
    public val approved: Boolean,
    @SerialName("authorization_method")
    public val authorizationMethod: InlineIssuingAuthorizationAuthorizationMethodXac0c6140,
    @SerialName("balance_transactions")
    public val balanceTransactions: List<BalanceTransaction>,
    public val card: IssuingCard,
    @SerialName("card_presence")
    public val cardPresence: InlineIssuingAuthorizationCardPresenceX536d5448? = null,
    public val cardholder: InlineIssuingAuthorizationCardholderXf1408f02? = null,
    public val created: Int,
    public val currency: String,
    public val fleet: InlineIssuingAuthorizationFleetXd66cb701? = null,
    @SerialName("fraud_challenges")
    public val fraudChallenges: List<IssuingAuthorizationFraudChallenge>? = null,
    public val fuel: InlineIssuingAuthorizationFuelX28f8e146? = null,
    public val id: String,
    public val livemode: Boolean,
    @SerialName("merchant_amount")
    public val merchantAmount: Int,
    @SerialName("merchant_currency")
    public val merchantCurrency: String,
    @SerialName("merchant_data")
    public val merchantData: IssuingAuthorizationMerchantData,
    public val metadata: Map<String, String>,
    @SerialName("network_data")
    public val networkData: InlineIssuingAuthorizationNetworkDataX1c44162b? = null,
    @SerialName("object")
    public val objectValue: InlineIssuingAuthorizationObjectValueX65b3194f,
    @SerialName("pending_request")
    public val pendingRequest: InlineIssuingAuthorizationPendingRequestXbed94e8a? = null,
    @SerialName("request_history")
    public val requestHistory: List<IssuingAuthorizationRequest>,
    public val status: InlineIssuingAuthorizationStatusX4fcc79da,
    public val token: InlineIssuingAuthorizationTokenXc4287492? = null,
    public val transactions: List<IssuingTransaction>,
    public val treasury: InlineIssuingAuthorizationTreasuryX86b379b3? = null,
    @SerialName("verification_data")
    public val verificationData: IssuingAuthorizationVerificationData,
    @SerialName("verified_by_fraud_challenge")
    public val verifiedByFraudChallenge: Boolean? = null,
    public val wallet: String? = null,
)

/**
 * When an [issued card](https://docs.stripe.com/issuing) is used to make a purchase, an Issuing `Authorization`
 * object is created. [Authorizations](https://docs.stripe.com/issuing/purchases/authorizations) must be approved for
 * the
 * purchase to be completed successfully.
 *
 * Related guide: [Issued card authorizations](https://docs.stripe.com/issuing/purchases/authorizations)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.authorization
 */
@Serializable(with = IssuingAuthorization.Serializer::class)
public class IssuingAuthorization(
    /**
     * The total amount that was authorized or rejected. This amount is in `currency` and in the [smallest currency
     * unit](https://stripe.com/docs/currencies#zero-decimal). `amount` should be the same as `merchant_amount`, unless
     * `currency` and `merchant_currency` are different.
     */
    public val amount: Int,
    /**
     * Whether the authorization has been approved.
     */
    public val approved: Boolean,
    /**
     * How the card details were provided.
     */
    public val authorizationMethod: InlineIssuingAuthorizationAuthorizationMethodXac0c6140,
    balanceTransactions: List<BalanceTransaction>,
    public val card: IssuingCard,
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * The currency of the cardholder. This currency can be different from the currency presented at authorization and the
     * `merchant_currency` field on this authorization. Three-letter [ISO currency
     * code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported
     * currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * The total amount that was authorized or rejected. This amount is in the `merchant_currency` and in the [smallest
     * currency unit](https://stripe.com/docs/currencies#zero-decimal). `merchant_amount` should be the same as `amount`,
     * unless `merchant_currency` and `currency` are different.
     */
    public val merchantAmount: Int,
    /**
     * The local currency that was presented to the cardholder for the authorization. This currency can be different from
     * the cardholder currency and the `currency` field on this authorization. Three-letter [ISO currency
     * code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported
     * currency](https://stripe.com/docs/currencies).
     */
    public val merchantCurrency: String,
    public val merchantData: IssuingAuthorizationMerchantData,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineIssuingAuthorizationObjectValueX65b3194f,
    requestHistory: List<IssuingAuthorizationRequest>,
    /**
     * The current status of the authorization in its lifecycle.
     */
    public val status: InlineIssuingAuthorizationStatusX4fcc79da,
    transactions: List<IssuingTransaction>,
    public val verificationData: IssuingAuthorizationVerificationData,
    /**
     * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest currency
     * unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public val amountDetails: InlineIssuingAuthorizationAmountDetailsX5b709ff0? = null,
    /**
     * Whether the card was present at the point of sale for the authorization.
     */
    public val cardPresence: InlineIssuingAuthorizationCardPresenceX536d5448? = null,
    /**
     * The cardholder to whom this authorization belongs.
     */
    public val cardholder: InlineIssuingAuthorizationCardholderXf1408f02? = null,
    /**
     * Fleet-specific information for authorizations using Fleet cards.
     */
    public val fleet: InlineIssuingAuthorizationFleetXd66cb701? = null,
    /**
     * Fraud challenges sent to the cardholder, if this authorization was declined for fraud risk reasons.
     */
    public val fraudChallenges: List<IssuingAuthorizationFraudChallenge>? = null,
    /**
     * Information about fuel that was purchased with this transaction. Typically this information is received from the
     * merchant after the authorization has been approved and the fuel dispensed.
     */
    public val fuel: InlineIssuingAuthorizationFuelX28f8e146? = null,
    /**
     * Details about the authorization, such as identifiers, set by the card network.
     */
    public val networkData: InlineIssuingAuthorizationNetworkDataX1c44162b? = null,
    /**
     * The pending authorization request. This field will only be non-null during an `issuing_authorization.request`
     * webhook.
     */
    public val pendingRequest: InlineIssuingAuthorizationPendingRequestXbed94e8a? = null,
    /**
     * [Token](https://docs.stripe.com/api/issuing/tokens/object) object used for this authorization. If a network token
     * was not used for this authorization, this field will be null.
     */
    public val token: InlineIssuingAuthorizationTokenXc4287492? = null,
    /**
     * [Treasury](https://docs.stripe.com/api/treasury) details related to this authorization if it was created on a
     * [FinancialAccount](https://docs.stripe.com/api/treasury/financial_accounts).
     */
    public val treasury: InlineIssuingAuthorizationTreasuryX86b379b3? = null,
    /**
     * Whether the authorization bypassed fraud risk checks because the cardholder has previously completed a fraud
     * challenge on a similar high-risk authorization from the same merchant.
     */
    public val verifiedByFraudChallenge: Boolean? = null,
    /**
     * The digital wallet used for this transaction. One of `apple_pay`, `google_pay`, or `samsung_pay`. Will populate as
     * `null` when no digital wallet was utilized.
     */
    public val wallet: String? = null,
) {
    /**
     * List of balance transactions associated with this authorization.
     */
    public val balanceTransactions: List<BalanceTransaction> = balanceTransactions.toList()

    /**
     * History of every time a `pending_request` authorization was approved/declined, either by you directly or by Stripe
     * (e.g. based on your spending_controls). If the merchant changes the authorization by performing an incremental
     * authorization, you can look at this field to see the previous requests for the authorization. This field can be
     * helpful in determining why a given authorization was approved/declined.
     */
    public val requestHistory: List<IssuingAuthorizationRequest> = requestHistory.toList()

    /**
     * List of [transactions](https://docs.stripe.com/api/issuing/transactions) associated with this authorization.
     */
    public val transactions: List<IssuingTransaction> = transactions.toList()

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

        private var authorizationMethodValue: InlineIssuingAuthorizationAuthorizationMethodXac0c6140? =
            null

        public var authorizationMethod: InlineIssuingAuthorizationAuthorizationMethodXac0c6140
            get() = requireNotNull(authorizationMethodValue) { "authorizationMethod is required" }
            set(`value`) {
                authorizationMethodValue = value
            }

        private var balanceTransactionsValue: List<BalanceTransaction>? = null

        public var balanceTransactions: List<BalanceTransaction>
            get() = requireNotNull(balanceTransactionsValue) { "balanceTransactions is required" }
            set(`value`) {
                balanceTransactionsValue = value
            }

        private var cardValue: IssuingCard? = null

        public var card: IssuingCard
            get() = requireNotNull(cardValue) { "card is required" }
            set(`value`) {
                cardValue = value
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

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
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

        private var merchantDataValue: IssuingAuthorizationMerchantData? = null

        public var merchantData: IssuingAuthorizationMerchantData
            get() = requireNotNull(merchantDataValue) { "merchantData is required" }
            set(`value`) {
                merchantDataValue = value
            }

        private var metadataValue: Map<String, String>? = null

        public var metadata: Map<String, String>
            get() = requireNotNull(metadataValue) { "metadata is required" }
            set(`value`) {
                metadataValue = value
            }

        private var objectValueValue: InlineIssuingAuthorizationObjectValueX65b3194f? = null

        public var objectValue: InlineIssuingAuthorizationObjectValueX65b3194f
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var requestHistoryValue: List<IssuingAuthorizationRequest>? = null

        public var requestHistory: List<IssuingAuthorizationRequest>
            get() = requireNotNull(requestHistoryValue) { "requestHistory is required" }
            set(`value`) {
                requestHistoryValue = value
            }

        private var statusValue: InlineIssuingAuthorizationStatusX4fcc79da? = null

        public var status: InlineIssuingAuthorizationStatusX4fcc79da
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        private var transactionsValue: List<IssuingTransaction>? = null

        public var transactions: List<IssuingTransaction>
            get() = requireNotNull(transactionsValue) { "transactions is required" }
            set(`value`) {
                transactionsValue = value
            }

        private var verificationDataValue: IssuingAuthorizationVerificationData? = null

        public var verificationData: IssuingAuthorizationVerificationData
            get() = requireNotNull(verificationDataValue) { "verificationData is required" }
            set(`value`) {
                verificationDataValue = value
            }

        /**
         * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest
         * currency unit](https://docs.stripe.com/currencies#zero-decimal).
         */
        public var amountDetails: InlineIssuingAuthorizationAmountDetailsX5b709ff0? = null

        /**
         * Whether the card was present at the point of sale for the authorization.
         */
        public var cardPresence: InlineIssuingAuthorizationCardPresenceX536d5448? = null

        /**
         * The cardholder to whom this authorization belongs.
         */
        public var cardholder: InlineIssuingAuthorizationCardholderXf1408f02? = null

        /**
         * Fleet-specific information for authorizations using Fleet cards.
         */
        public var fleet: InlineIssuingAuthorizationFleetXd66cb701? = null

        /**
         * Fraud challenges sent to the cardholder, if this authorization was declined for fraud risk reasons.
         */
        public var fraudChallenges: List<IssuingAuthorizationFraudChallenge>? = null

        /**
         * Information about fuel that was purchased with this transaction. Typically this information is received from the
         * merchant after the authorization has been approved and the fuel dispensed.
         */
        public var fuel: InlineIssuingAuthorizationFuelX28f8e146? = null

        /**
         * Details about the authorization, such as identifiers, set by the card network.
         */
        public var networkData: InlineIssuingAuthorizationNetworkDataX1c44162b? = null

        /**
         * The pending authorization request. This field will only be non-null during an `issuing_authorization.request`
         * webhook.
         */
        public var pendingRequest: InlineIssuingAuthorizationPendingRequestXbed94e8a? = null

        /**
         * [Token](https://docs.stripe.com/api/issuing/tokens/object) object used for this authorization. If a network token
         * was not used for this authorization, this field will be null.
         */
        public var token: InlineIssuingAuthorizationTokenXc4287492? = null

        /**
         * [Treasury](https://docs.stripe.com/api/treasury) details related to this authorization if it was created on a
         * [FinancialAccount](https://docs.stripe.com/api/treasury/financial_accounts).
         */
        public var treasury: InlineIssuingAuthorizationTreasuryX86b379b3? = null

        /**
         * Whether the authorization bypassed fraud risk checks because the cardholder has previously completed a fraud
         * challenge on a similar high-risk authorization from the same merchant.
         */
        public var verifiedByFraudChallenge: Boolean? = null

        /**
         * The digital wallet used for this transaction. One of `apple_pay`, `google_pay`, or `samsung_pay`. Will populate
         * as `null` when no digital wallet was utilized.
         */
        public var wallet: String? = null

        public fun build(): IssuingAuthorization {
            check(amountValue != null) { "amount is required" }
            check(approvedValue != null) { "approved is required" }
            check(authorizationMethodValue != null) { "authorizationMethod is required" }
            check(balanceTransactionsValue != null) { "balanceTransactions is required" }
            check(cardValue != null) { "card is required" }
            check(createdValue != null) { "created is required" }
            check(currencyValue != null) { "currency is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(merchantAmountValue != null) { "merchantAmount is required" }
            check(merchantCurrencyValue != null) { "merchantCurrency is required" }
            check(merchantDataValue != null) { "merchantData is required" }
            check(metadataValue != null) { "metadata is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(requestHistoryValue != null) { "requestHistory is required" }
            check(statusValue != null) { "status is required" }
            check(transactionsValue != null) { "transactions is required" }
            check(verificationDataValue != null) { "verificationData is required" }
            return IssuingAuthorization(
                amount = amount,
                approved = approved,
                authorizationMethod = authorizationMethod,
                balanceTransactions = balanceTransactions,
                card = card,
                created = created,
                currency = currency,
                id = id,
                livemode = livemode,
                merchantAmount = merchantAmount,
                merchantCurrency = merchantCurrency,
                merchantData = merchantData,
                metadata = metadata,
                objectValue = objectValue,
                requestHistory = requestHistory,
                status = status,
                transactions = transactions,
                verificationData = verificationData,
                amountDetails = amountDetails,
                cardPresence = cardPresence,
                cardholder = cardholder,
                fleet = fleet,
                fraudChallenges = fraudChallenges,
                fuel = fuel,
                networkData = networkData,
                pendingRequest = pendingRequest,
                token = token,
                treasury = treasury,
                verifiedByFraudChallenge = verifiedByFraudChallenge,
                wallet = wallet,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingAuthorization = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingAuthorization> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingAuthorization {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingAuthorization")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingAuthorization must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val approved = json.decodeRequired<Boolean>(rawObject, "approved")
            val authorizationMethod =
                json.decodeRequired<InlineIssuingAuthorizationAuthorizationMethodXac0c6140>(
                    rawObject,
                    "authorization_method",
                )
            val balanceTransactions = json.decodeRequired<List<BalanceTransaction>>(rawObject, "balance_transactions")
            val card = json.decodeRequired<IssuingCard>(rawObject, "card")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val merchantAmount = json.decodeRequired<Int>(rawObject, "merchant_amount")
            val merchantCurrency = json.decodeRequired<String>(rawObject, "merchant_currency")
            val merchantData = json.decodeRequired<IssuingAuthorizationMerchantData>(rawObject, "merchant_data")
            val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
            val objectValue = json.decodeRequired<InlineIssuingAuthorizationObjectValueX65b3194f>(rawObject, "object")
            val requestHistory = json.decodeRequired<List<IssuingAuthorizationRequest>>(rawObject, "request_history")
            val status = json.decodeRequired<InlineIssuingAuthorizationStatusX4fcc79da>(rawObject, "status")
            val transactions = json.decodeRequired<List<IssuingTransaction>>(rawObject, "transactions")
            val verificationData =
                json.decodeRequired<IssuingAuthorizationVerificationData>(
                    rawObject,
                    "verification_data",
                )
            return IssuingAuthorization(
                amount = amount,
                approved = approved,
                authorizationMethod = authorizationMethod,
                balanceTransactions = balanceTransactions,
                card = card,
                created = created,
                currency = currency,
                id = id,
                livemode = livemode,
                merchantAmount = merchantAmount,
                merchantCurrency = merchantCurrency,
                merchantData = merchantData,
                metadata = metadata,
                objectValue = objectValue,
                requestHistory = requestHistory,
                status = status,
                transactions = transactions,
                verificationData = verificationData,
                amountDetails =
                    rawObject["amount_details"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingAuthorizationAmountDetailsX5b709ff0?>(element)
                        }
                    },
                cardPresence =
                    rawObject["card_presence"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingAuthorizationCardPresenceX536d5448?>(element)
                        }
                    },
                cardholder =
                    rawObject["cardholder"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingAuthorizationCardholderXf1408f02?>(element)
                        }
                    },
                fleet =
                    rawObject["fleet"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingAuthorizationFleetXd66cb701?>(element)
                        }
                    },
                fraudChallenges =
                    rawObject["fraud_challenges"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<IssuingAuthorizationFraudChallenge>?>(element)
                        }
                    },
                fuel =
                    rawObject["fuel"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingAuthorizationFuelX28f8e146?>(element)
                        }
                    },
                networkData =
                    rawObject["network_data"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingAuthorizationNetworkDataX1c44162b?>(element)
                        }
                    },
                pendingRequest =
                    rawObject["pending_request"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingAuthorizationPendingRequestXbed94e8a?>(element)
                        }
                    },
                token =
                    rawObject["token"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingAuthorizationTokenXc4287492?>(element)
                        }
                    },
                treasury =
                    rawObject["treasury"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineIssuingAuthorizationTreasuryX86b379b3?>(element)
                        }
                    },
                verifiedByFraudChallenge =
                    rawObject["verified_by_fraud_challenge"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Boolean?>(element)
                        }
                    },
                wallet =
                    rawObject["wallet"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingAuthorization,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingAuthorization")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("approved", json.encodeToJsonElement(value.approved))
                    put("authorization_method", json.encodeToJsonElement(value.authorizationMethod))
                    put("balance_transactions", json.encodeToJsonElement(value.balanceTransactions))
                    put("card", json.encodeToJsonElement(value.card))
                    put("created", json.encodeToJsonElement(value.created))
                    put("currency", value.currency)
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("merchant_amount", json.encodeToJsonElement(value.merchantAmount))
                    put("merchant_currency", value.merchantCurrency)
                    put("merchant_data", json.encodeToJsonElement(value.merchantData))
                    put("metadata", json.encodeToJsonElement(value.metadata))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("request_history", json.encodeToJsonElement(value.requestHistory))
                    put("status", json.encodeToJsonElement(value.status))
                    put("transactions", json.encodeToJsonElement(value.transactions))
                    put("verification_data", json.encodeToJsonElement(value.verificationData))
                    value.amountDetails?.let { put("amount_details", json.encodeToJsonElement(it)) }
                    value.cardPresence?.let { put("card_presence", json.encodeToJsonElement(it)) }
                    value.cardholder?.let { put("cardholder", json.encodeToJsonElement(it)) }
                    value.fleet?.let { put("fleet", json.encodeToJsonElement(it)) }
                    value.fraudChallenges?.let { put("fraud_challenges", json.encodeToJsonElement(it)) }
                    value.fuel?.let { put("fuel", json.encodeToJsonElement(it)) }
                    value.networkData?.let { put("network_data", json.encodeToJsonElement(it)) }
                    value.pendingRequest?.let { put("pending_request", json.encodeToJsonElement(it)) }
                    value.token?.let { put("token", json.encodeToJsonElement(it)) }
                    value.treasury?.let { put("treasury", json.encodeToJsonElement(it)) }
                    value.verifiedByFraudChallenge?.let {
                        put(
                            "verified_by_fraud_challenge",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.wallet?.let { put("wallet", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingAuthorization(block: IssuingAuthorization.Builder.() -> Unit): IssuingAuthorization =
    IssuingAuthorization.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("IssuingAuthorization is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
