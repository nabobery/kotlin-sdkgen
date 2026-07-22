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
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_net_available
 */
@Serializable(with = BalanceNetAvailable.Serializer::class)
public class BalanceNetAvailable(
    /**
     * Net balance amount, subtracting fees from platform-set pricing.
     */
    public val amount: Int,
    /**
     * ID of the external account for this net balance (not expandable).
     */
    public val destination: String,
    public val sourceTypes: BalanceAmountBySourceType? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var destinationValue: String? = null

        public var destination: String
            get() = requireNotNull(destinationValue) { "destination is required" }
            set(`value`) {
                destinationValue = value
            }

        public var sourceTypes: BalanceAmountBySourceType? = null

        public fun build(): BalanceNetAvailable {
            check(amountValue != null) { "amount is required" }
            check(destinationValue != null) { "destination is required" }
            return BalanceNetAvailable(
                amount = amount,
                destination = destination,
                sourceTypes = sourceTypes,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BalanceNetAvailable = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BalanceNetAvailable> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BalanceNetAvailable {
            val jsonDecoder = decoder.requireJsonDecoder("BalanceNetAvailable")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BalanceNetAvailable must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val destination = json.decodeRequired<String>(rawObject, "destination")
            return BalanceNetAvailable(
                amount = amount,
                destination = destination,
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
            `value`: BalanceNetAvailable,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BalanceNetAvailable")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("destination", value.destination)
                    value.sourceTypes?.let { put("source_types", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun balanceNetAvailable(block: BalanceNetAvailable.Builder.() -> Unit): BalanceNetAvailable =
    BalanceNetAvailable.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("BalanceNetAvailable is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
