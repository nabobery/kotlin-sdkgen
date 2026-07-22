package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * [Deprecated] The `ExchangeRate` APIs are deprecated. Please use the [FX Quotes
 * API](https://docs.stripe.com/payments/currencies/localize-prices/fx-quotes-api) instead.
 *
 * `ExchangeRate` objects allow you to determine the rates that Stripe is currently
 * using to convert from one currency to another. Since this number is variable
 * throughout the day, there are various reasons why you might want to know the current
 * rate (for example, to dynamically price an item for a user with a default
 * payment in a foreign currency).
 *
 * Please refer to our [Exchange Rates API](https://docs.stripe.com/fx-rates) guide for more details.
 *
 * *[Note: this integration path is supported but no longer recommended]* Additionally,
 * you can guarantee that a charge is made with an exchange rate that you expect is
 * current. To do so, you must pass in the exchange_rate to charges endpoints. If the
 * value is no longer up to date, the charge won't go through. Please refer to our
 * [Using with charges](https://docs.stripe.com/exchange-rates) guide for more details.
 *
 * -----
 *
 * &nbsp;
 *
 * *This Exchange Rates API is a Beta Service and is subject to Stripe's terms of service. You may use the API solely
 * for the purpose of transacting on Stripe. For example, the API may be queried in order to:*
 *
 * - *localize prices for processing payments on Stripe*
 * - *reconcile Stripe transactions*
 * - *determine how much money to send to a connected account*
 * - *determine app fees to charge a connected account*
 *
 * *Using this Exchange Rates API beta for any purpose other than to transact on Stripe is strictly prohibited and
 * constitutes a violation of Stripe's terms of service.*
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/exchange_rate
 */
@Serializable(with = ExchangeRate.Serializer::class)
public class ExchangeRate(
    /**
     * Unique identifier for the object. Represented as the three-letter [ISO currency
     * code](https://www.iso.org/iso-4217-currency-codes.html) in lowercase.
     */
    public val id: String,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineExchangeRateObjectValueX019430be,
    /**
     * Hash where the keys are supported currencies and the values are the exchange rate at which the base id currency
     * converts to the key currency.
     */
    public val rates: Map<String, Double>,
) {
    public class Builder {
        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var objectValueValue: InlineExchangeRateObjectValueX019430be? = null

        public var objectValue: InlineExchangeRateObjectValueX019430be
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var ratesValue: Map<String, Double>? = null

        public var rates: Map<String, Double>
            get() = requireNotNull(ratesValue) { "rates is required" }
            set(`value`) {
                ratesValue = value
            }

        public fun build(): ExchangeRate {
            check(idValue != null) { "id is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(ratesValue != null) { "rates is required" }
            return ExchangeRate(
                id = id,
                objectValue = objectValue,
                rates = rates,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ExchangeRate = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ExchangeRate> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ExchangeRate {
            val jsonDecoder = decoder.requireJsonDecoder("ExchangeRate")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ExchangeRate must be a JSON object")
            val id = json.decodeRequired<String>(rawObject, "id")
            val objectValue = json.decodeRequired<InlineExchangeRateObjectValueX019430be>(rawObject, "object")
            val rates = json.decodeRequired<Map<String, Double>>(rawObject, "rates")
            return ExchangeRate(
                id = id,
                objectValue = objectValue,
                rates = rates,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ExchangeRate,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ExchangeRate")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("id", value.id)
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("rates", json.encodeToJsonElement(value.rates))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun exchangeRate(block: ExchangeRate.Builder.() -> Unit): ExchangeRate = ExchangeRate.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("ExchangeRate is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
