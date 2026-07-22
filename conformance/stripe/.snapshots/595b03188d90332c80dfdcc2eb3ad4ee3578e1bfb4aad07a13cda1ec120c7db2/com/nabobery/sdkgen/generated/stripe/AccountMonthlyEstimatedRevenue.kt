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
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_monthly_estimated_revenue
 */
@Serializable(with = AccountMonthlyEstimatedRevenue.Serializer::class)
public class AccountMonthlyEstimatedRevenue(
    /**
     * A non-negative integer representing how much to charge in the [smallest currency unit](/currencies#zero-decimal).
     */
    public val amount: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
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

        public fun build(): AccountMonthlyEstimatedRevenue {
            check(amountValue != null) { "amount is required" }
            check(currencyValue != null) { "currency is required" }
            return AccountMonthlyEstimatedRevenue(
                amount = amount,
                currency = currency,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): AccountMonthlyEstimatedRevenue = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<AccountMonthlyEstimatedRevenue> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): AccountMonthlyEstimatedRevenue {
            val jsonDecoder = decoder.requireJsonDecoder("AccountMonthlyEstimatedRevenue")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("AccountMonthlyEstimatedRevenue must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            return AccountMonthlyEstimatedRevenue(
                amount = amount,
                currency = currency,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: AccountMonthlyEstimatedRevenue,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("AccountMonthlyEstimatedRevenue")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("currency", value.currency)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun accountMonthlyEstimatedRevenue(
    block: AccountMonthlyEstimatedRevenue.Builder.() -> Unit,
): AccountMonthlyEstimatedRevenue = AccountMonthlyEstimatedRevenue.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "AccountMonthlyEstimatedRevenue is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
