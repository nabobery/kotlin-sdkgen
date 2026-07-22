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
import kotlin.Int
import kotlin.String
import kotlin.Unit

@Serializable
public data class ReserveTransactionView(
    public val amount: Int,
    public val currency: String,
    public val description: String? = null,
    public val id: String,
    @SerialName("object")
    public val objectValue: InlineReserveTransactionObjectValueX1fdbd76d,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/reserve_transaction
 */
@Serializable(with = ReserveTransaction.Serializer::class)
public class ReserveTransaction(
    public val amount: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineReserveTransactionObjectValueX1fdbd76d,
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public val description: String? = null,
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

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var objectValueValue: InlineReserveTransactionObjectValueX1fdbd76d? = null

        public var objectValue: InlineReserveTransactionObjectValueX1fdbd76d
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        /**
         * An arbitrary string attached to the object. Often useful for displaying to users.
         */
        public var description: String? = null

        public fun build(): ReserveTransaction {
            check(amountValue != null) { "amount is required" }
            check(currencyValue != null) { "currency is required" }
            check(idValue != null) { "id is required" }
            check(objectValueValue != null) { "objectValue is required" }
            return ReserveTransaction(
                amount = amount,
                currency = currency,
                id = id,
                objectValue = objectValue,
                description = description,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): ReserveTransaction = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<ReserveTransaction> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ReserveTransaction {
            val jsonDecoder = decoder.requireJsonDecoder("ReserveTransaction")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("ReserveTransaction must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val id = json.decodeRequired<String>(rawObject, "id")
            val objectValue = json.decodeRequired<InlineReserveTransactionObjectValueX1fdbd76d>(rawObject, "object")
            return ReserveTransaction(
                amount = amount,
                currency = currency,
                id = id,
                objectValue = objectValue,
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
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ReserveTransaction,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("ReserveTransaction")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("currency", value.currency)
                    put("id", value.id)
                    put("object", json.encodeToJsonElement(value.objectValue))
                    value.description?.let { put("description", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun reserveTransaction(block: ReserveTransaction.Builder.() -> Unit): ReserveTransaction =
    ReserveTransaction.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("ReserveTransaction is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
