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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_passthrough_card
 */
@Serializable(with = PaymentMethodDetailsPassthroughCard.Serializer::class)
public class PaymentMethodDetailsPassthroughCard(
    /**
     * Card brand. Can be `amex`, `cartes_bancaires`, `diners`, `discover`, `eftpos_au`, `jcb`, `link`, `mastercard`,
     * `unionpay`, `visa` or `unknown`.
     */
    public val brand: String? = null,
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
     * Card funding type. Can be `credit`, `debit`, `prepaid`, or `unknown`.
     */
    public val funding: String? = null,
    /**
     * The last four digits of the card.
     */
    public val last4: String? = null,
) {
    public class Builder {
        /**
         * Card brand. Can be `amex`, `cartes_bancaires`, `diners`, `discover`, `eftpos_au`, `jcb`, `link`, `mastercard`,
         * `unionpay`, `visa` or `unknown`.
         */
        public var brand: String? = null

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
         * Card funding type. Can be `credit`, `debit`, `prepaid`, or `unknown`.
         */
        public var funding: String? = null

        /**
         * The last four digits of the card.
         */
        public var last4: String? = null

        public fun build(): PaymentMethodDetailsPassthroughCard =
            PaymentMethodDetailsPassthroughCard(
                brand = brand,
                country = country,
                expMonth = expMonth,
                expYear = expYear,
                funding = funding,
                last4 = last4,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPassthroughCard =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsPassthroughCard> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsPassthroughCard {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPassthroughCard")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsPassthroughCard must be a JSON object")
            return PaymentMethodDetailsPassthroughCard(
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
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodDetailsPassthroughCard,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPassthroughCard")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.brand?.let { put("brand", it) }
                    value.country?.let { put("country", it) }
                    value.expMonth?.let { put("exp_month", json.encodeToJsonElement(it)) }
                    value.expYear?.let { put("exp_year", json.encodeToJsonElement(it)) }
                    value.funding?.let { put("funding", it) }
                    value.last4?.let { put("last4", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsPassthroughCard(
    block: PaymentMethodDetailsPassthroughCard.Builder.() -> Unit,
): PaymentMethodDetailsPassthroughCard = PaymentMethodDetailsPassthroughCard.build(block)
