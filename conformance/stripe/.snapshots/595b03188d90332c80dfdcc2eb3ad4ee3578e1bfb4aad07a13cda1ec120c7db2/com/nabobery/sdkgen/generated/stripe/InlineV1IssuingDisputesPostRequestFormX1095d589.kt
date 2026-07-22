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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes~1{dispute}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormX1095d589.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormX1095d589(
    /**
     * The dispute amount in the card's currency and in the [smallest currency
     * unit](https://docs.stripe.com/currencies#zero-decimal).
     */
    public val amount: Int? = null,
    /**
     * Evidence provided for the dispute.
     */
    public val evidence: InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1IssuingDisputesPostRequestFormMetadataXc035432e? = null,
) {
    public class Builder {
        /**
         * The dispute amount in the card's currency and in the [smallest currency
         * unit](https://docs.stripe.com/currencies#zero-decimal).
         */
        public var amount: Int? = null

        /**
         * Evidence provided for the dispute.
         */
        public var evidence: InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1IssuingDisputesPostRequestFormMetadataXc035432e? = null

        public fun build(): InlineV1IssuingDisputesPostRequestFormX1095d589 =
            InlineV1IssuingDisputesPostRequestFormX1095d589(
                amount = amount,
                evidence = evidence,
                expand = expand,
                metadata = metadata,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormX1095d589 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormX1095d589> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormX1095d589 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormX1095d589")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingDisputesPostRequestFormX1095d589 must be a JSON object",
                    )
            return InlineV1IssuingDisputesPostRequestFormX1095d589(
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                evidence =
                    rawObject["evidence"]?.let {
                        json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormEvidenceXefbf92fc>(it)
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1IssuingDisputesPostRequestFormMetadataXc035432e>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesPostRequestFormX1095d589,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormX1095d589")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.evidence?.let { put("evidence", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingDisputesPostRequestFormX1095d589(
    block: InlineV1IssuingDisputesPostRequestFormX1095d589.Builder.() -> Unit,
): InlineV1IssuingDisputesPostRequestFormX1095d589 = InlineV1IssuingDisputesPostRequestFormX1095d589.build(block)
