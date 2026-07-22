package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_transaction_chf_credit_transfer_data
 */
@Serializable(with = SourceTransactionChfCreditTransferData.Serializer::class)
public class SourceTransactionChfCreditTransferData(
    /**
     * Reference associated with the transfer.
     */
    public val reference: String? = null,
    /**
     * Sender's country address.
     */
    public val senderAddressCountry: String? = null,
    /**
     * Sender's line 1 address.
     */
    public val senderAddressLine1: String? = null,
    /**
     * Sender's bank account IBAN.
     */
    public val senderIban: String? = null,
    /**
     * Sender's name.
     */
    public val senderName: String? = null,
) {
    public class Builder {
        /**
         * Reference associated with the transfer.
         */
        public var reference: String? = null

        /**
         * Sender's country address.
         */
        public var senderAddressCountry: String? = null

        /**
         * Sender's line 1 address.
         */
        public var senderAddressLine1: String? = null

        /**
         * Sender's bank account IBAN.
         */
        public var senderIban: String? = null

        /**
         * Sender's name.
         */
        public var senderName: String? = null

        public fun build(): SourceTransactionChfCreditTransferData =
            SourceTransactionChfCreditTransferData(
                reference = reference,
                senderAddressCountry = senderAddressCountry,
                senderAddressLine1 = senderAddressLine1,
                senderIban = senderIban,
                senderName = senderName,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SourceTransactionChfCreditTransferData =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SourceTransactionChfCreditTransferData> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SourceTransactionChfCreditTransferData {
            val jsonDecoder = decoder.requireJsonDecoder("SourceTransactionChfCreditTransferData")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SourceTransactionChfCreditTransferData must be a JSON object")
            return SourceTransactionChfCreditTransferData(
                reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
                senderAddressCountry =
                    rawObject["sender_address_country"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
                    },
                senderAddressLine1 = rawObject["sender_address_line1"]?.let {
                    json.decodeFromJsonElement<String>(
                        it,
                    )
                },
                senderIban = rawObject["sender_iban"]?.let { json.decodeFromJsonElement<String>(it) },
                senderName = rawObject["sender_name"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SourceTransactionChfCreditTransferData,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SourceTransactionChfCreditTransferData")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.reference?.let { put("reference", it) }
                    value.senderAddressCountry?.let { put("sender_address_country", it) }
                    value.senderAddressLine1?.let { put("sender_address_line1", it) }
                    value.senderIban?.let { put("sender_iban", it) }
                    value.senderName?.let { put("sender_name", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun sourceTransactionChfCreditTransferData(
    block: SourceTransactionChfCreditTransferData.Builder.() -> Unit,
): SourceTransactionChfCreditTransferData = SourceTransactionChfCreditTransferData.build(block)
