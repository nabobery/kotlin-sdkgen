package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund_destination_details_us_bank_transfer
 */
@Serializable(with = RefundDestinationDetailsUsBankTransfer.Serializer::class)
public class RefundDestinationDetailsUsBankTransfer(
    /**
     * The reference assigned to the refund.
     */
    public val reference: String? = null,
    /**
     * Status of the reference on the refund. This can be `pending`, `available` or `unavailable`.
     */
    public val referenceStatus: String? = null,
) {
    public class Builder {
        /**
         * The reference assigned to the refund.
         */
        public var reference: String? = null

        /**
         * Status of the reference on the refund. This can be `pending`, `available` or `unavailable`.
         */
        public var referenceStatus: String? = null

        public fun build(): RefundDestinationDetailsUsBankTransfer =
            RefundDestinationDetailsUsBankTransfer(
                reference = reference,
                referenceStatus = referenceStatus,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): RefundDestinationDetailsUsBankTransfer =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<RefundDestinationDetailsUsBankTransfer> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): RefundDestinationDetailsUsBankTransfer {
            val jsonDecoder = decoder.requireJsonDecoder("RefundDestinationDetailsUsBankTransfer")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("RefundDestinationDetailsUsBankTransfer must be a JSON object")
            return RefundDestinationDetailsUsBankTransfer(
                reference =
                    rawObject["reference"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                referenceStatus =
                    rawObject["reference_status"]?.let { element ->
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
            `value`: RefundDestinationDetailsUsBankTransfer,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("RefundDestinationDetailsUsBankTransfer")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.reference?.let { put("reference", it) }
                    value.referenceStatus?.let { put("reference_status", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun refundDestinationDetailsUsBankTransfer(
    block: RefundDestinationDetailsUsBankTransfer.Builder.() -> Unit,
): RefundDestinationDetailsUsBankTransfer = RefundDestinationDetailsUsBankTransfer.build(block)
