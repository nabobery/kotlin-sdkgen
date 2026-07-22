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
 * Source: sdkgen://source/openapi.json#/components/schemas/refund_destination_details_paypal
 */
@Serializable(with = RefundDestinationDetailsPaypal.Serializer::class)
public class RefundDestinationDetailsPaypal(
    /**
     * For refunds declined by the network, a decline code provided by the network which indicates the reason the refund
     * failed.
     */
    public val networkDeclineCode: String? = null,
) {
    public class Builder {
        /**
         * For refunds declined by the network, a decline code provided by the network which indicates the reason the refund
         * failed.
         */
        public var networkDeclineCode: String? = null

        public fun build(): RefundDestinationDetailsPaypal =
            RefundDestinationDetailsPaypal(
                networkDeclineCode = networkDeclineCode,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): RefundDestinationDetailsPaypal = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<RefundDestinationDetailsPaypal> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): RefundDestinationDetailsPaypal {
            val jsonDecoder = decoder.requireJsonDecoder("RefundDestinationDetailsPaypal")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("RefundDestinationDetailsPaypal must be a JSON object")
            return RefundDestinationDetailsPaypal(
                networkDeclineCode =
                    rawObject["network_decline_code"]?.let { element ->
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
            `value`: RefundDestinationDetailsPaypal,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("RefundDestinationDetailsPaypal")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.networkDeclineCode?.let { put("network_decline_code", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun refundDestinationDetailsPaypal(
    block: RefundDestinationDetailsPaypal.Builder.() -> Unit,
): RefundDestinationDetailsPaypal = RefundDestinationDetailsPaypal.build(block)
