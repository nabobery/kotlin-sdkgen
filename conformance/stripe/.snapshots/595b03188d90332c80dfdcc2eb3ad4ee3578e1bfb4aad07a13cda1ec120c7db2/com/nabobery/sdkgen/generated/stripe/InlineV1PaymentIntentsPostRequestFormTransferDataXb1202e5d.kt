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
 * The parameters that you can use to automatically create a Transfer.
 * Learn more about the [use case for connected accounts](https://docs.stripe.com/payments/connected-accounts).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/transfer_data
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d(
    public val destination: String,
    public val amount: Int? = null,
    public val description: String? = null,
    public val metadata: InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca? = null,
    public val paymentData: InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX69b4db7a? = null,
) {
    public class Builder {
        private var destinationValue: String? = null

        public var destination: String
            get() = requireNotNull(destinationValue) { "destination is required" }
            set(`value`) {
                destinationValue = value
            }

        public var amount: Int? = null

        public var description: String? = null

        public var metadata: InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca? = null

        public var paymentData: InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX69b4db7a? =
            null

        public fun build(): InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d {
            check(destinationValue != null) { "destination is required" }
            return InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d(
                destination = destination,
                amount = amount,
                description = description,
                metadata = metadata,
                paymentData = paymentData,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d must be a JSON object",
                    )
            val destination = json.decodeRequired<String>(rawObject, "destination")
            return InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d(
                destination = destination,
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca>(
                            it,
                        )
                    },
                paymentData =
                    rawObject["payment_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataX69b4db7a>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("destination", value.destination)
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", it) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.paymentData?.let { put("payment_data", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d(
    block: InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d =
    InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentIntentsPostRequestFormTransferDataXb1202e5d is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
