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
 * Source: sdkgen://source/openapi.json#/components/schemas/refund_destination_details_crypto
 */
@Serializable(with = RefundDestinationDetailsCrypto.Serializer::class)
public class RefundDestinationDetailsCrypto(
    /**
     * The transaction hash of the refund.
     */
    public val reference: String? = null,
) {
    public class Builder {
        /**
         * The transaction hash of the refund.
         */
        public var reference: String? = null

        public fun build(): RefundDestinationDetailsCrypto =
            RefundDestinationDetailsCrypto(
                reference = reference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): RefundDestinationDetailsCrypto = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<RefundDestinationDetailsCrypto> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): RefundDestinationDetailsCrypto {
            val jsonDecoder = decoder.requireJsonDecoder("RefundDestinationDetailsCrypto")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("RefundDestinationDetailsCrypto must be a JSON object")
            return RefundDestinationDetailsCrypto(
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
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: RefundDestinationDetailsCrypto,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("RefundDestinationDetailsCrypto")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.reference?.let { put("reference", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun refundDestinationDetailsCrypto(
    block: RefundDestinationDetailsCrypto.Builder.() -> Unit,
): RefundDestinationDetailsCrypto = RefundDestinationDetailsCrypto.build(block)
