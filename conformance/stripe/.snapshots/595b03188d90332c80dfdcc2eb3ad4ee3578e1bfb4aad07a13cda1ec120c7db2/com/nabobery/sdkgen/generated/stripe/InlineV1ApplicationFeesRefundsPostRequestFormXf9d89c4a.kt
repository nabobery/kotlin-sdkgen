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
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1application_fees~1{id}~1refunds/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1application_fees~1{id}~1refunds/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema
 */
@Serializable(with = InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a.Serializer::class)
public class InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a(
    /**
     * A positive integer, in _cents (or local equivalent)_, representing how much of this fee to refund. Can refund only
     * up to the remaining unrefunded amount of the fee.
     */
    public val amount: Int? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: Map<String, String>? = null,
) {
    public class Builder {
        /**
         * A positive integer, in _cents (or local equivalent)_, representing how much of this fee to refund. Can refund
         * only up to the remaining unrefunded amount of the fee.
         */
        public var amount: Int? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: Map<String, String>? = null

        public fun build(): InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a =
            InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a(
                amount = amount,
                expand = expand,
                metadata = metadata,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a must be a JSON object",
                    )
            return InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a(
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a(
    block: InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a.Builder.() -> Unit,
): InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a =
    InlineV1ApplicationFeesRefundsPostRequestFormXf9d89c4a.build(block)
