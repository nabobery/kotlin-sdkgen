package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt_payment_method_details_card
 */
@Serializable(with = SetupAttemptPaymentMethodDetailsCard.Serializer::class)
public class SetupAttemptPaymentMethodDetailsCard(
    /**
     * Card brand. Can be `amex`, `cartes_bancaires`, `diners`, `discover`, `eftpos_au`, `jcb`, `link`, `mastercard`,
     * `unionpay`, `visa` or `unknown`.
     */
    public val brand: String? = null,
    /**
     * Check results by Card networks on Card address and CVC at the time of authorization
     */
    public val checks: InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b? = null,
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
    public val funding: String? = null,
    /**
     * The last four digits of the card.
     */
    public val last4: String? = null,
    /**
     * Identifies which network this charge was processed on. Can be `amex`, `cartes_bancaires`, `diners`, `discover`,
     * `eftpos_au`, `interac`, `jcb`, `link`, `mastercard`, `unionpay`, `visa`, or `unknown`.
     */
    public val network: String? = null,
    /**
     * Populated if this authorization used 3D Secure authentication.
     */
    public val threeDSecure: InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5? = null,
    /**
     * If this Card is part of a card wallet, this contains the details of the card wallet.
     */
    public val wallet: InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209? = null,
) {
    public class Builder {
        /**
         * Card brand. Can be `amex`, `cartes_bancaires`, `diners`, `discover`, `eftpos_au`, `jcb`, `link`, `mastercard`,
         * `unionpay`, `visa` or `unknown`.
         */
        public var brand: String? = null

        /**
         * Check results by Card networks on Card address and CVC at the time of authorization
         */
        public var checks: InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b? = null

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
        public var funding: String? = null

        /**
         * The last four digits of the card.
         */
        public var last4: String? = null

        /**
         * Identifies which network this charge was processed on. Can be `amex`, `cartes_bancaires`, `diners`, `discover`,
         * `eftpos_au`, `interac`, `jcb`, `link`, `mastercard`, `unionpay`, `visa`, or `unknown`.
         */
        public var network: String? = null

        /**
         * Populated if this authorization used 3D Secure authentication.
         */
        public var threeDSecure: InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5? = null

        /**
         * If this Card is part of a card wallet, this contains the details of the card wallet.
         */
        public var wallet: InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209? = null

        public fun build(): SetupAttemptPaymentMethodDetailsCard =
            SetupAttemptPaymentMethodDetailsCard(
                brand = brand,
                checks = checks,
                country = country,
                expMonth = expMonth,
                expYear = expYear,
                fingerprint = fingerprint,
                funding = funding,
                last4 = last4,
                network = network,
                threeDSecure = threeDSecure,
                wallet = wallet,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SetupAttemptPaymentMethodDetailsCard =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SetupAttemptPaymentMethodDetailsCard> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SetupAttemptPaymentMethodDetailsCard {
            val jsonDecoder = decoder.requireJsonDecoder("SetupAttemptPaymentMethodDetailsCard")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SetupAttemptPaymentMethodDetailsCard must be a JSON object")
            return SetupAttemptPaymentMethodDetailsCard(
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
                checks =
                    rawObject["checks"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b?>(
                                element,
                            )
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
                expMonth =
                    rawObject["exp_month"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                expYear =
                    rawObject["exp_year"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
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
                threeDSecure =
                    rawObject["three_d_secure"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineSetupAttemptPaymentMethodDetailsCardThreeDSecureX18bf40a5?>(
                                    element,
                                )
                        }
                    },
                wallet =
                    rawObject["wallet"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineSetupAttemptPaymentMethodDetailsCardWalletX9b59b209?>(
                                element,
                            )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SetupAttemptPaymentMethodDetailsCard,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SetupAttemptPaymentMethodDetailsCard")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.brand?.let { put("brand", it) }
                    value.checks?.let { put("checks", json.encodeToJsonElement(it)) }
                    value.country?.let { put("country", it) }
                    value.expMonth?.let { put("exp_month", json.encodeToJsonElement(it)) }
                    value.expYear?.let { put("exp_year", json.encodeToJsonElement(it)) }
                    value.fingerprint?.let { put("fingerprint", it) }
                    value.funding?.let { put("funding", it) }
                    value.last4?.let { put("last4", it) }
                    value.network?.let { put("network", it) }
                    value.threeDSecure?.let { put("three_d_secure", json.encodeToJsonElement(it)) }
                    value.wallet?.let { put("wallet", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun setupAttemptPaymentMethodDetailsCard(
    block: SetupAttemptPaymentMethodDetailsCard.Builder.() -> Unit,
): SetupAttemptPaymentMethodDetailsCard = SetupAttemptPaymentMethodDetailsCard.build(block)
