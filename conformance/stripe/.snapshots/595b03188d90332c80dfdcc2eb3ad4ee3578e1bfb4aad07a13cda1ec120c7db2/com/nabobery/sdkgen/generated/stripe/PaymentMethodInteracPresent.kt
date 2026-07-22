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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_interac_present
 */
@Serializable(with = PaymentMethodInteracPresent.Serializer::class)
public class PaymentMethodInteracPresent(
    /**
     * Two-digit number representing the card's expiration month.
     */
    public val expMonth: Int,
    /**
     * Four-digit number representing the card's expiration year.
     */
    public val expYear: Int,
    /**
     * Card brand. Can be `interac`, `mastercard` or `visa`.
     */
    public val brand: String? = null,
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
     * The name of the card's issuing bank.
     */
    public val issuer: String? = null,
    /**
     * The last four digits of the card.
     */
    public val last4: String? = null,
    /**
     * Contains information about card networks that can be used to process the payment.
     */
    public val networks: InlinePaymentMethodInteracPresentNetworksX55abbf8b? = null,
    /**
     * The languages that the issuing bank recommends using for localizing any customer-facing text, as read from the
     * card. Referenced from EMV tag 5F2D, data encoded on the card's chip.
     */
    public val preferredLocales: List<String>? = null,
    /**
     * How card details were read in this transaction.
     */
    public val readMethod: InlinePaymentMethodInteracPresentReadMethodXb4618b29? = null,
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
         * Card brand. Can be `interac`, `mastercard` or `visa`.
         */
        public var brand: String? = null

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
         * The name of the card's issuing bank.
         */
        public var issuer: String? = null

        /**
         * The last four digits of the card.
         */
        public var last4: String? = null

        /**
         * Contains information about card networks that can be used to process the payment.
         */
        public var networks: InlinePaymentMethodInteracPresentNetworksX55abbf8b? = null

        /**
         * The languages that the issuing bank recommends using for localizing any customer-facing text, as read from the
         * card. Referenced from EMV tag 5F2D, data encoded on the card's chip.
         */
        public var preferredLocales: List<String>? = null

        /**
         * How card details were read in this transaction.
         */
        public var readMethod: InlinePaymentMethodInteracPresentReadMethodXb4618b29? = null

        public fun build(): PaymentMethodInteracPresent {
            check(expMonthValue != null) { "expMonth is required" }
            check(expYearValue != null) { "expYear is required" }
            return PaymentMethodInteracPresent(
                expMonth = expMonth,
                expYear = expYear,
                brand = brand,
                cardholderName = cardholderName,
                country = country,
                description = description,
                fingerprint = fingerprint,
                funding = funding,
                issuer = issuer,
                last4 = last4,
                networks = networks,
                preferredLocales = preferredLocales,
                readMethod = readMethod,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodInteracPresent = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodInteracPresent> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodInteracPresent {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodInteracPresent")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodInteracPresent must be a JSON object")
            val expMonth = json.decodeRequired<Int>(rawObject, "exp_month")
            val expYear = json.decodeRequired<Int>(rawObject, "exp_year")
            return PaymentMethodInteracPresent(
                expMonth = expMonth,
                expYear = expYear,
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
                networks =
                    rawObject["networks"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentMethodInteracPresentNetworksX55abbf8b?>(element)
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
                            json.decodeFromJsonElement<InlinePaymentMethodInteracPresentReadMethodXb4618b29?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodInteracPresent,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodInteracPresent")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("exp_month", json.encodeToJsonElement(value.expMonth))
                    put("exp_year", json.encodeToJsonElement(value.expYear))
                    value.brand?.let { put("brand", it) }
                    value.cardholderName?.let { put("cardholder_name", it) }
                    value.country?.let { put("country", it) }
                    value.description?.let { put("description", it) }
                    value.fingerprint?.let { put("fingerprint", it) }
                    value.funding?.let { put("funding", it) }
                    value.issuer?.let { put("issuer", it) }
                    value.last4?.let { put("last4", it) }
                    value.networks?.let { put("networks", json.encodeToJsonElement(it)) }
                    value.preferredLocales?.let { put("preferred_locales", json.encodeToJsonElement(it)) }
                    value.readMethod?.let { put("read_method", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodInteracPresent(
    block: PaymentMethodInteracPresent.Builder.() -> Unit,
): PaymentMethodInteracPresent = PaymentMethodInteracPresent.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("PaymentMethodInteracPresent is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
