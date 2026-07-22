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
import kotlin.collections.List

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_amount_net
 */
@Serializable(with = BalanceAmountNet.Serializer::class)
public class BalanceAmountNet(
    /**
     * Balance amount.
     */
    public val amount: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * Breakdown of balance by destination.
     */
    public val netAvailable: List<BalanceNetAvailable>? = null,
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

        /**
         * Breakdown of balance by destination.
         */
        public var netAvailable: List<BalanceNetAvailable>? = null

        public var sourceTypes: BalanceAmountBySourceType? = null

        public fun build(): BalanceAmountNet {
            check(amountValue != null) { "amount is required" }
            check(currencyValue != null) { "currency is required" }
            return BalanceAmountNet(
                amount = amount,
                currency = currency,
                netAvailable = netAvailable,
                sourceTypes = sourceTypes,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BalanceAmountNet = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BalanceAmountNet> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BalanceAmountNet {
            val jsonDecoder = decoder.requireJsonDecoder("BalanceAmountNet")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BalanceAmountNet must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            return BalanceAmountNet(
                amount = amount,
                currency = currency,
                netAvailable =
                    rawObject["net_available"]?.let {
                        json.decodeFromJsonElement<List<BalanceNetAvailable>>(
                            it,
                        )
                    },
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
            `value`: BalanceAmountNet,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BalanceAmountNet")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("currency", value.currency)
                    value.netAvailable?.let { put("net_available", json.encodeToJsonElement(it)) }
                    value.sourceTypes?.let { put("source_types", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun balanceAmountNet(block: BalanceAmountNet.Builder.() -> Unit): BalanceAmountNet =
    BalanceAmountNet.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("BalanceAmountNet is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
