package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_present
 */
@Serializable(with = PaymentMethodDetailsCardPresent.Serializer::class)
public class PaymentMethodDetailsCardPresent(
    /**
     * Two-digit number representing the card's expiration month.
     */
    public val expMonth: Int,
    /**
     * Four-digit number representing the card's expiration year.
     */
    public val expYear: Int,
    /**
     * Whether this [PaymentIntent](https://docs.stripe.com/api/payment_intents) is eligible for incremental
     * authorizations. Request support using
     * [request_incremental_authorization_support](https://docs.stripe.com/api/payment_intents/create#create_payment_inten
     * t-payment_method_options-card_present-request_incremental_authorization_support).
     */
    public val incrementalAuthorizationSupported: Boolean,
    /**
     * Defines whether the authorized amount can be over-captured or not
     */
    public val overcaptureSupported: Boolean,
    /**
     * The authorized amount
     */
    public val amountAuthorized: Int? = null,
    /**
     * Card brand. Can be `amex`, `cartes_bancaires`, `diners`, `discover`, `eftpos_au`, `jcb`, `link`, `mastercard`,
     * `unionpay`, `visa` or `unknown`.
     */
    public val brand: String? = null,
    /**
     * The [product code](https://stripe.com/docs/card-product-codes) that identifies the specific program or product
     * associated with a card.
     */
    public val brandProduct: String? = null,
    /**
     * When using manual capture, a future timestamp after which the charge will be automatically refunded if uncaptured.
     */
    public val captureBefore: Int? = null,
    /**
     * The cardholder name as read from the card, in [ISO 7813](https://en.wikipedia.org/wiki/ISO/IEC_7813) format. May
     * include alphanumeric characters, special characters and first/last name separator (`/`). In some cases, the
     * cardholder name may not be available depending on how the issuer has configured the card. Cardholder name is
     * typically not available on swipe or contactless payments, such as those made with Apple Pay and Google Pay.
     */
    public val cardholderName: String? = null,
    /**
     * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of the
     * international breakdown of cards you've collected.
     */
    public val country: String? = null,
    /**
     * A high-level description of the type of cards issued in this range.
     */
    public val description: String? = null,
    /**
     * Authorization response cryptogram.
     */
    public val emvAuthData: String? = null,
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
    /**
     * ID of a card PaymentMethod generated from the card_present PaymentMethod that may be attached to a Customer for
     * future transactions. Only present if it was possible to generate a card PaymentMethod.
     */
    public val generatedCard: String? = null,
    /**
     * The name of the card's issuing bank.
     */
    public val issuer: String? = null,
    /**
     * The last four digits of the card.
     */
    public val last4: String? = null,
    /**
     * ID of the [location](https://docs.stripe.com/api/terminal/locations) that this transaction's reader is assigned to.
     */
    public val location: String? = null,
    /**
     * Identifies which network this charge was processed on. Can be `amex`, `cartes_bancaires`, `diners`, `discover`,
     * `eftpos_au`, `interac`, `jcb`, `link`, `mastercard`, `unionpay`, `visa`, or `unknown`.
     */
    public val network: String? = null,
    /**
     * This is used by the financial networks to identify a transaction. Visa calls this the Transaction ID, Mastercard
     * calls this the Trace ID, and American Express calls this the Acquirer Reference Data. This value will be present if
     * it is returned by the financial network in the authorization response, and null otherwise.
     */
    public val networkTransactionId: String? = null,
    /**
     * Details about payments collected offline.
     */
    public val offline: InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2? = null,
    /**
     * The languages that the issuing bank recommends using for localizing any customer-facing text, as read from the
     * card. Referenced from EMV tag 5F2D, data encoded on the card's chip.
     */
    public val preferredLocales: List<String>? = null,
    /**
     * How card details were read in this transaction.
     */
    public val readMethod: InlinePaymentMethodDetailsCardPresentReadMethodX713d2924? = null,
    /**
     * ID of the [reader](https://docs.stripe.com/api/terminal/readers) this transaction was made on.
     */
    public val reader: String? = null,
    /**
     * A collection of fields required to be displayed on receipts. Only required for EMV transactions.
     */
    public val receipt: InlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea? = null,
    public val wallet: PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet? = null,
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

        private var incrementalAuthorizationSupportedValue: Boolean? = null

        public var incrementalAuthorizationSupported: Boolean
            get() =
                requireNotNull(
                    incrementalAuthorizationSupportedValue,
                ) { "incrementalAuthorizationSupported is required" }
            set(`value`) {
                incrementalAuthorizationSupportedValue = value
            }

        private var overcaptureSupportedValue: Boolean? = null

        public var overcaptureSupported: Boolean
            get() = requireNotNull(overcaptureSupportedValue) { "overcaptureSupported is required" }
            set(`value`) {
                overcaptureSupportedValue = value
            }

        /**
         * The authorized amount
         */
        public var amountAuthorized: Int? = null

        /**
         * Card brand. Can be `amex`, `cartes_bancaires`, `diners`, `discover`, `eftpos_au`, `jcb`, `link`, `mastercard`,
         * `unionpay`, `visa` or `unknown`.
         */
        public var brand: String? = null

        /**
         * The [product code](https://stripe.com/docs/card-product-codes) that identifies the specific program or product
         * associated with a card.
         */
        public var brandProduct: String? = null

        /**
         * When using manual capture, a future timestamp after which the charge will be automatically refunded if
         * uncaptured.
         */
        public var captureBefore: Int? = null

        /**
         * The cardholder name as read from the card, in [ISO 7813](https://en.wikipedia.org/wiki/ISO/IEC_7813) format. May
         * include alphanumeric characters, special characters and first/last name separator (`/`). In some cases, the
         * cardholder name may not be available depending on how the issuer has configured the card. Cardholder name is
         * typically not available on swipe or contactless payments, such as those made with Apple Pay and Google Pay.
         */
        public var cardholderName: String? = null

        /**
         * Two-letter ISO code representing the country of the card. You could use this attribute to get a sense of the
         * international breakdown of cards you've collected.
         */
        public var country: String? = null

        /**
         * A high-level description of the type of cards issued in this range.
         */
        public var description: String? = null

        /**
         * Authorization response cryptogram.
         */
        public var emvAuthData: String? = null

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

        /**
         * ID of a card PaymentMethod generated from the card_present PaymentMethod that may be attached to a Customer for
         * future transactions. Only present if it was possible to generate a card PaymentMethod.
         */
        public var generatedCard: String? = null

        /**
         * The name of the card's issuing bank.
         */
        public var issuer: String? = null

        /**
         * The last four digits of the card.
         */
        public var last4: String? = null

        /**
         * ID of the [location](https://docs.stripe.com/api/terminal/locations) that this transaction's reader is assigned
         * to.
         */
        public var location: String? = null

        /**
         * Identifies which network this charge was processed on. Can be `amex`, `cartes_bancaires`, `diners`, `discover`,
         * `eftpos_au`, `interac`, `jcb`, `link`, `mastercard`, `unionpay`, `visa`, or `unknown`.
         */
        public var network: String? = null

        /**
         * This is used by the financial networks to identify a transaction. Visa calls this the Transaction ID, Mastercard
         * calls this the Trace ID, and American Express calls this the Acquirer Reference Data. This value will be present
         * if it is returned by the financial network in the authorization response, and null otherwise.
         */
        public var networkTransactionId: String? = null

        /**
         * Details about payments collected offline.
         */
        public var offline: InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2? = null

        /**
         * The languages that the issuing bank recommends using for localizing any customer-facing text, as read from the
         * card. Referenced from EMV tag 5F2D, data encoded on the card's chip.
         */
        public var preferredLocales: List<String>? = null

        /**
         * How card details were read in this transaction.
         */
        public var readMethod: InlinePaymentMethodDetailsCardPresentReadMethodX713d2924? = null

        /**
         * ID of the [reader](https://docs.stripe.com/api/terminal/readers) this transaction was made on.
         */
        public var reader: String? = null

        /**
         * A collection of fields required to be displayed on receipts. Only required for EMV transactions.
         */
        public var receipt: InlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea? = null

        public var wallet: PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet? = null

        public fun build(): PaymentMethodDetailsCardPresent {
            check(expMonthValue != null) { "expMonth is required" }
            check(expYearValue != null) { "expYear is required" }
            check(incrementalAuthorizationSupportedValue != null) { "incrementalAuthorizationSupported is required" }
            check(overcaptureSupportedValue != null) { "overcaptureSupported is required" }
            return PaymentMethodDetailsCardPresent(
                expMonth = expMonth,
                expYear = expYear,
                incrementalAuthorizationSupported = incrementalAuthorizationSupported,
                overcaptureSupported = overcaptureSupported,
                amountAuthorized = amountAuthorized,
                brand = brand,
                brandProduct = brandProduct,
                captureBefore = captureBefore,
                cardholderName = cardholderName,
                country = country,
                description = description,
                emvAuthData = emvAuthData,
                fingerprint = fingerprint,
                funding = funding,
                generatedCard = generatedCard,
                issuer = issuer,
                last4 = last4,
                location = location,
                network = network,
                networkTransactionId = networkTransactionId,
                offline = offline,
                preferredLocales = preferredLocales,
                readMethod = readMethod,
                reader = reader,
                receipt = receipt,
                wallet = wallet,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsCardPresent = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsCardPresent> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsCardPresent {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsCardPresent")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsCardPresent must be a JSON object")
            val expMonth = json.decodeRequired<Int>(rawObject, "exp_month")
            val expYear = json.decodeRequired<Int>(rawObject, "exp_year")
            val incrementalAuthorizationSupported =
                json.decodeRequired<Boolean>(
                    rawObject,
                    "incremental_authorization_supported",
                )
            val overcaptureSupported = json.decodeRequired<Boolean>(rawObject, "overcapture_supported")
            return PaymentMethodDetailsCardPresent(
                expMonth = expMonth,
                expYear = expYear,
                incrementalAuthorizationSupported = incrementalAuthorizationSupported,
                overcaptureSupported = overcaptureSupported,
                amountAuthorized =
                    rawObject["amount_authorized"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                brand =
                    rawObject["brand"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                brandProduct =
                    rawObject["brand_product"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                captureBefore = rawObject["capture_before"]?.let { json.decodeFromJsonElement<Int>(it) },
                cardholderName =
                    rawObject["cardholder_name"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                country =
                    rawObject["country"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                description =
                    rawObject["description"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                emvAuthData =
                    rawObject["emv_auth_data"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                fingerprint =
                    rawObject["fingerprint"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                funding =
                    rawObject["funding"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                generatedCard =
                    rawObject["generated_card"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                issuer =
                    rawObject["issuer"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                last4 =
                    rawObject["last4"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                location =
                    rawObject["location"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
                    },
                network =
                    rawObject["network"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                networkTransactionId =
                    rawObject["network_transaction_id"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                offline =
                    rawObject["offline"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentMethodDetailsCardPresentOfflineX2bc680b2?>(element)
                        }
                    },
                preferredLocales =
                    rawObject["preferred_locales"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<String>?>(element)
                        }
                    },
                readMethod =
                    rawObject["read_method"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentMethodDetailsCardPresentReadMethodX713d2924?>(
                                element,
                            )
                        }
                    },
                reader = rawObject["reader"]?.let { json.decodeFromJsonElement<String>(it) },
                receipt =
                    rawObject["receipt"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentMethodDetailsCardPresentReceiptXa62bb6ea?>(element)
                        }
                    },
                wallet =
                    rawObject["wallet"]?.let {
                        json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsCardPresentCommonWallet>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodDetailsCardPresent,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsCardPresent")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("exp_month", json.encodeToJsonElement(value.expMonth))
                    put("exp_year", json.encodeToJsonElement(value.expYear))
                    put(
                        "incremental_authorization_supported",
                        json.encodeToJsonElement(value.incrementalAuthorizationSupported),
                    )
                    put("overcapture_supported", json.encodeToJsonElement(value.overcaptureSupported))
                    value.amountAuthorized?.let { put("amount_authorized", json.encodeToJsonElement(it)) }
                    value.brand?.let { put("brand", it) }
                    value.brandProduct?.let { put("brand_product", it) }
                    value.captureBefore?.let { put("capture_before", json.encodeToJsonElement(it)) }
                    value.cardholderName?.let { put("cardholder_name", it) }
                    value.country?.let { put("country", it) }
                    value.description?.let { put("description", it) }
                    value.emvAuthData?.let { put("emv_auth_data", it) }
                    value.fingerprint?.let { put("fingerprint", it) }
                    value.funding?.let { put("funding", it) }
                    value.generatedCard?.let { put("generated_card", it) }
                    value.issuer?.let { put("issuer", it) }
                    value.last4?.let { put("last4", it) }
                    value.location?.let { put("location", it) }
                    value.network?.let { put("network", it) }
                    value.networkTransactionId?.let { put("network_transaction_id", it) }
                    value.offline?.let { put("offline", json.encodeToJsonElement(it)) }
                    value.preferredLocales?.let { put("preferred_locales", json.encodeToJsonElement(it)) }
                    value.readMethod?.let { put("read_method", json.encodeToJsonElement(it)) }
                    value.reader?.let { put("reader", it) }
                    value.receipt?.let { put("receipt", json.encodeToJsonElement(it)) }
                    value.wallet?.let { put("wallet", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsCardPresent(
    block: PaymentMethodDetailsCardPresent.Builder.() -> Unit,
): PaymentMethodDetailsCardPresent = PaymentMethodDetailsCardPresent.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentMethodDetailsCardPresent is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
