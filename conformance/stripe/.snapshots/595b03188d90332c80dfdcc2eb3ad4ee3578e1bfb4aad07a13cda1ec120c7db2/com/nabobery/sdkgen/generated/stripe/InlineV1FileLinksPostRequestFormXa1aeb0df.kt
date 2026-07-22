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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1file_links~1{link}/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1file_links~1{link}/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema
 */
@Serializable(with = InlineV1FileLinksPostRequestFormXa1aeb0df.Serializer::class)
public class InlineV1FileLinksPostRequestFormXa1aeb0df(
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * A future timestamp after which the link will no longer be usable, or `now` to expire the link immediately.
     */
    public val expiresAt: InlineV1FileLinksPostRequestFormExpiresAtX095ad1cc? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1FileLinksPostRequestFormMetadataX293f2b96? = null,
) {
    public class Builder {
        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * A future timestamp after which the link will no longer be usable, or `now` to expire the link immediately.
         */
        public var expiresAt: InlineV1FileLinksPostRequestFormExpiresAtX095ad1cc? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1FileLinksPostRequestFormMetadataX293f2b96? = null

        public fun build(): InlineV1FileLinksPostRequestFormXa1aeb0df =
            InlineV1FileLinksPostRequestFormXa1aeb0df(
                expand = expand,
                expiresAt = expiresAt,
                metadata = metadata,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1FileLinksPostRequestFormXa1aeb0df =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1FileLinksPostRequestFormXa1aeb0df> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1FileLinksPostRequestFormXa1aeb0df {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1FileLinksPostRequestFormXa1aeb0df")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InlineV1FileLinksPostRequestFormXa1aeb0df must be a JSON object")
            return InlineV1FileLinksPostRequestFormXa1aeb0df(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                expiresAt =
                    rawObject["expires_at"]?.let {
                        json.decodeFromJsonElement<InlineV1FileLinksPostRequestFormExpiresAtX095ad1cc>(it)
                    },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1FileLinksPostRequestFormMetadataX293f2b96>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1FileLinksPostRequestFormXa1aeb0df,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1FileLinksPostRequestFormXa1aeb0df")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1FileLinksPostRequestFormXa1aeb0df(
    block: InlineV1FileLinksPostRequestFormXa1aeb0df.Builder.() -> Unit,
): InlineV1FileLinksPostRequestFormXa1aeb0df = InlineV1FileLinksPostRequestFormXa1aeb0df.build(block)
