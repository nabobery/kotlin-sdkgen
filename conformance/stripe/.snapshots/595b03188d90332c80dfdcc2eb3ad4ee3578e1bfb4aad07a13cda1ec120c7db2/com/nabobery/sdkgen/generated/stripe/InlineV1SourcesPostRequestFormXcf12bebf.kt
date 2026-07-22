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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema
 */
@Serializable(with = InlineV1SourcesPostRequestFormXcf12bebf.Serializer::class)
public class InlineV1SourcesPostRequestFormXcf12bebf(
    /**
     * Amount associated with the source.
     */
    public val amount: Int? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Information about a mandate possibility attached to a source object (generally for bank debits) as well as its
     * acceptance status.
     */
    public val mandate: InlineV1SourcesPostRequestFormMandateX9367a038? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1SourcesPostRequestFormMetadataX67c71bb8? = null,
    /**
     * Information about the owner of the payment instrument that may be used or required by particular source types.
     */
    public val owner: InlineV1SourcesPostRequestFormOwnerX482307eb? = null,
    /**
     * Information about the items and shipping associated with the source. Required for transactional credit (for example
     * Klarna) sources before you can charge it.
     */
    public val sourceOrder: InlineV1SourcesPostRequestFormSourceOrderX4330303b? = null,
) {
    public class Builder {
        /**
         * Amount associated with the source.
         */
        public var amount: Int? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Information about a mandate possibility attached to a source object (generally for bank debits) as well as its
         * acceptance status.
         */
        public var mandate: InlineV1SourcesPostRequestFormMandateX9367a038? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1SourcesPostRequestFormMetadataX67c71bb8? = null

        /**
         * Information about the owner of the payment instrument that may be used or required by particular source types.
         */
        public var owner: InlineV1SourcesPostRequestFormOwnerX482307eb? = null

        /**
         * Information about the items and shipping associated with the source. Required for transactional credit (for
         * example Klarna) sources before you can charge it.
         */
        public var sourceOrder: InlineV1SourcesPostRequestFormSourceOrderX4330303b? = null

        public fun build(): InlineV1SourcesPostRequestFormXcf12bebf =
            InlineV1SourcesPostRequestFormXcf12bebf(
                amount = amount,
                expand = expand,
                mandate = mandate,
                metadata = metadata,
                owner = owner,
                sourceOrder = sourceOrder,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormXcf12bebf =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SourcesPostRequestFormXcf12bebf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormXcf12bebf {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormXcf12bebf")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InlineV1SourcesPostRequestFormXcf12bebf must be a JSON object")
            return InlineV1SourcesPostRequestFormXcf12bebf(
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                mandate =
                    rawObject["mandate"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SourcesPostRequestFormMandateX9367a038>(
                                it,
                            )
                    },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1SourcesPostRequestFormMetadataX67c71bb8>(it)
                    },
                owner =
                    rawObject["owner"]?.let {
                        json.decodeFromJsonElement<InlineV1SourcesPostRequestFormOwnerX482307eb>(
                            it,
                        )
                    },
                sourceOrder =
                    rawObject["source_order"]?.let {
                        json.decodeFromJsonElement<InlineV1SourcesPostRequestFormSourceOrderX4330303b>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SourcesPostRequestFormXcf12bebf,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormXcf12bebf")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.mandate?.let { put("mandate", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
                    value.sourceOrder?.let { put("source_order", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SourcesPostRequestFormXcf12bebf(
    block: InlineV1SourcesPostRequestFormXcf12bebf.Builder.() -> Unit,
): InlineV1SourcesPostRequestFormXcf12bebf = InlineV1SourcesPostRequestFormXcf12bebf.build(block)
