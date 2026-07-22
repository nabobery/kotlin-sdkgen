package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class IssuingTransactionNetworkDataView(
    @SerialName("authorization_code")
    public val authorizationCode: String? = null,
    @SerialName("processing_date")
    public val processingDate: String? = null,
    @SerialName("transaction_id")
    public val transactionId: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_network_data
 */
@Serializable(with = IssuingTransactionNetworkData.Serializer::class)
public class IssuingTransactionNetworkData(
    /**
     * A code created by Stripe which is shared with the merchant to validate the authorization. This field will be
     * populated if the authorization message was approved. The code typically starts with the letter "S", followed by a
     * six-digit number. For example, "S498162". Please note that the code is not guaranteed to be unique across
     * authorizations.
     */
    public val authorizationCode: String? = null,
    /**
     * The date the transaction was processed by the card network. This can be different from the date the seller recorded
     * the transaction depending on when the acquirer submits the transaction to the network.
     */
    public val processingDate: String? = null,
    /**
     * Unique identifier for the authorization assigned by the card network used to match subsequent messages, disputes,
     * and transactions.
     */
    public val transactionId: String? = null,
) {
    public class Builder {
        /**
         * A code created by Stripe which is shared with the merchant to validate the authorization. This field will be
         * populated if the authorization message was approved. The code typically starts with the letter "S", followed by a
         * six-digit number. For example, "S498162". Please note that the code is not guaranteed to be unique across
         * authorizations.
         */
        public var authorizationCode: String? = null

        /**
         * The date the transaction was processed by the card network. This can be different from the date the seller
         * recorded the transaction depending on when the acquirer submits the transaction to the network.
         */
        public var processingDate: String? = null

        /**
         * Unique identifier for the authorization assigned by the card network used to match subsequent messages, disputes,
         * and transactions.
         */
        public var transactionId: String? = null

        public fun build(): IssuingTransactionNetworkData =
            IssuingTransactionNetworkData(
                authorizationCode = authorizationCode,
                processingDate = processingDate,
                transactionId = transactionId,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingTransactionNetworkData = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingTransactionNetworkData> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingTransactionNetworkData {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingTransactionNetworkData")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingTransactionNetworkData must be a JSON object")
            return IssuingTransactionNetworkData(
                authorizationCode =
                    rawObject["authorization_code"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                processingDate =
                    rawObject["processing_date"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                transactionId =
                    rawObject["transaction_id"]?.let { element ->
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
            `value`: IssuingTransactionNetworkData,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingTransactionNetworkData")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.authorizationCode?.let { put("authorization_code", it) }
                    value.processingDate?.let { put("processing_date", it) }
                    value.transactionId?.let { put("transaction_id", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingTransactionNetworkData(
    block: IssuingTransactionNetworkData.Builder.() -> Unit,
): IssuingTransactionNetworkData = IssuingTransactionNetworkData.build(block)
