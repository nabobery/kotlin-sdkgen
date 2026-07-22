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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations~1{authorization}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations~1{authorization}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5.Serializer::class)
public class InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5(
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc? = null,
) {
    public class Builder {
        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc? = null

        public fun build(): InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5 =
            InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5(
                expand = expand,
                metadata = metadata,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5 must be a JSON object",
                    )
            return InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1IssuingAuthorizationsPostRequestFormMetadataX8f0ef1cc>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingAuthorizationsPostRequestFormXe9d990a5(
    block: InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5.Builder.() -> Unit,
): InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5 =
    InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5.build(block)
