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
 * Source: sdkgen://source/openapi.json#/components/schemas/refund_destination_details_p24
 */
@Serializable(with = RefundDestinationDetailsP24.Serializer::class)
public class RefundDestinationDetailsP24(
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

        public fun build(): RefundDestinationDetailsP24 =
            RefundDestinationDetailsP24(
                reference = reference,
                referenceStatus = referenceStatus,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): RefundDestinationDetailsP24 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<RefundDestinationDetailsP24> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): RefundDestinationDetailsP24 {
            val jsonDecoder = decoder.requireJsonDecoder("RefundDestinationDetailsP24")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("RefundDestinationDetailsP24 must be a JSON object")
            return RefundDestinationDetailsP24(
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
            `value`: RefundDestinationDetailsP24,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("RefundDestinationDetailsP24")
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

public fun refundDestinationDetailsP24(
    block: RefundDestinationDetailsP24.Builder.() -> Unit,
): RefundDestinationDetailsP24 = RefundDestinationDetailsP24.build(block)
