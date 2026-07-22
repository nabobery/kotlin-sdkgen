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
import kotlin.collections.Map

@Serializable
public data class FeeRefundView(
    public val amount: Int,
    @SerialName("balance_transaction")
    public val balanceTransaction: InlineFeeRefundBalanceTransactionX75308484? = null,
    public val created: Int,
    public val currency: String,
    public val fee: InlineFeeRefundFeeX229a86d0,
    public val id: String,
    public val metadata: Map<String, String>? = null,
    @SerialName("object")
    public val objectValue: InlineFeeRefundObjectValueX4e9deb45,
)

/**
 * `Application Fee Refund` objects allow you to refund an application fee that
 * has previously been created but not yet refunded. Funds will be refunded to
 * the Stripe account from which the fee was originally collected.
 *
 * Related guide: [Refunding application fees](https://docs.stripe.com/connect/destination-charges#refunding-app-fee)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/fee_refund
 */
@Serializable(with = FeeRefund.Serializer::class)
public class FeeRefund(
    /**
     * Amount, in cents (or local equivalent).
     */
    public val amount: Int,
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * ID of the application fee that was refunded.
     */
    public val fee: InlineFeeRefundFeeX229a86d0,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineFeeRefundObjectValueX4e9deb45,
    /**
     * Balance transaction that describes the impact on your account balance.
     */
    public val balanceTransaction: InlineFeeRefundBalanceTransactionX75308484? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
            }

        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        private var feeValue: InlineFeeRefundFeeX229a86d0? = null

        public var fee: InlineFeeRefundFeeX229a86d0
            get() = requireNotNull(feeValue) { "fee is required" }
            set(`value`) {
                feeValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var objectValueValue: InlineFeeRefundObjectValueX4e9deb45? = null

        public var objectValue: InlineFeeRefundObjectValueX4e9deb45
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        /**
         * Balance transaction that describes the impact on your account balance.
         */
        public var balanceTransaction: InlineFeeRefundBalanceTransactionX75308484? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format.
         */
        public var metadata: Map<String, String>? = null

        public fun build(): FeeRefund {
            check(amountValue != null) { "amount is required" }
            check(createdValue != null) { "created is required" }
            check(currencyValue != null) { "currency is required" }
            check(feeValue != null) { "fee is required" }
            check(idValue != null) { "id is required" }
            check(objectValueValue != null) { "objectValue is required" }
            return FeeRefund(
                amount = amount,
                created = created,
                currency = currency,
                fee = fee,
                id = id,
                objectValue = objectValue,
                balanceTransaction = balanceTransaction,
                metadata = metadata,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): FeeRefund = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<FeeRefund> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): FeeRefund {
            val jsonDecoder = decoder.requireJsonDecoder("FeeRefund")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("FeeRefund must be a JSON object")
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val fee = json.decodeRequired<InlineFeeRefundFeeX229a86d0>(rawObject, "fee")
            val id = json.decodeRequired<String>(rawObject, "id")
            val objectValue = json.decodeRequired<InlineFeeRefundObjectValueX4e9deb45>(rawObject, "object")
            return FeeRefund(
                amount = amount,
                created = created,
                currency = currency,
                fee = fee,
                id = id,
                objectValue = objectValue,
                balanceTransaction =
                    rawObject["balance_transaction"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineFeeRefundBalanceTransactionX75308484?>(element)
                        }
                    },
                metadata =
                    rawObject["metadata"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Map<String, String>?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: FeeRefund,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("FeeRefund")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("created", json.encodeToJsonElement(value.created))
                    put("currency", value.currency)
                    put("fee", json.encodeToJsonElement(value.fee))
                    put("id", value.id)
                    put("object", json.encodeToJsonElement(value.objectValue))
                    value.balanceTransaction?.let { put("balance_transaction", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun feeRefund(block: FeeRefund.Builder.() -> Unit): FeeRefund = FeeRefund.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("FeeRefund is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
