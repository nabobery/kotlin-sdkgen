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
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_amount
 */
@Serializable(with = BalanceAmount.Serializer::class)
public class BalanceAmount(
    /**
     * Balance amount.
     */
    public val amount: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    public val sourceTypes: BalanceAmountBySourceType? = null,
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

        public var sourceTypes: BalanceAmountBySourceType? = null

        public fun build(): BalanceAmount {
            check(amountValue != null) { "amount is required" }
            check(currencyValue != null) { "currency is required" }
            return BalanceAmount(
                amount = amount,
                currency = currency,
                sourceTypes = sourceTypes,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BalanceAmount = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BalanceAmount> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BalanceAmount {
            val jsonDecoder = decoder.requireJsonDecoder("BalanceAmount")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BalanceAmount must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            return BalanceAmount(
                amount = amount,
                currency = currency,
                sourceTypes =
                    rawObject["source_types"]?.let {
                        json.decodeFromJsonElement<BalanceAmountBySourceType>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BalanceAmount,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BalanceAmount")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("currency", value.currency)
                    value.sourceTypes?.let { put("source_types", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun balanceAmount(block: BalanceAmount.Builder.() -> Unit): BalanceAmount = BalanceAmount.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("BalanceAmount is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
