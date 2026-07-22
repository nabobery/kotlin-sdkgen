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
public data class TransferDataView(
    public val amount: Int? = null,
    public val description: String? = null,
    public val destination: InlineTransferDataDestinationX26c08a9a,
    public val metadata: Map<String, String>? = null,
    @SerialName("payment_data")
    public val paymentData: PaymentData? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer_data
 */
@Serializable(with = TransferData.Serializer::class)
public class TransferData(
    /**
     * The account (if any) that the payment is attributed to for tax reporting, and where funds from the payment are
     * transferred to after payment success.
     */
    public val destination: InlineTransferDataDestinationX26c08a9a,
    /**
     * The amount transferred to the destination account. This transfer will occur automatically after the payment
     * succeeds. If no amount is specified, by default the entire payment amount is transferred to the destination
     * account.
     * The amount must be less than or equal to the
     * [amount](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-amount), and must be a positive
     * integer
     * representing how much to transfer in the smallest currency unit (e.g., 100 cents to charge $1.00).
     */
    public val amount: Int? = null,
    /**
     * An arbitrary string attached to the transfer. Often useful for displaying to users.
     */
    public val description: String? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>? = null,
    public val paymentData: PaymentData? = null,
) {
    public class Builder {
        private var destinationValue: InlineTransferDataDestinationX26c08a9a? = null

        public var destination: InlineTransferDataDestinationX26c08a9a
            get() = requireNotNull(destinationValue) { "destination is required" }
            set(`value`) {
                destinationValue = value
            }

        /**
         * The amount transferred to the destination account. This transfer will occur automatically after the payment
         * succeeds. If no amount is specified, by default the entire payment amount is transferred to the destination
         * account.
         * The amount must be less than or equal to the
         * [amount](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-amount), and must be a positive
         * integer
         * representing how much to transfer in the smallest currency unit (e.g., 100 cents to charge $1.00).
         */
        public var amount: Int? = null

        /**
         * An arbitrary string attached to the transfer. Often useful for displaying to users.
         */
        public var description: String? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format.
         */
        public var metadata: Map<String, String>? = null

        public var paymentData: PaymentData? = null

        public fun build(): TransferData {
            check(destinationValue != null) { "destination is required" }
            return TransferData(
                destination = destination,
                amount = amount,
                description = description,
                metadata = metadata,
                paymentData = paymentData,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TransferData = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TransferData> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TransferData {
            val jsonDecoder = decoder.requireJsonDecoder("TransferData")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("TransferData must be a JSON object")
            val destination = json.decodeRequired<InlineTransferDataDestinationX26c08a9a>(rawObject, "destination")
            return TransferData(
                destination = destination,
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                paymentData = rawObject["payment_data"]?.let { json.decodeFromJsonElement<PaymentData>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TransferData,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TransferData")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("destination", json.encodeToJsonElement(value.destination))
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", it) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.paymentData?.let { put("payment_data", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun transferData(block: TransferData.Builder.() -> Unit): TransferData = TransferData.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("TransferData is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
