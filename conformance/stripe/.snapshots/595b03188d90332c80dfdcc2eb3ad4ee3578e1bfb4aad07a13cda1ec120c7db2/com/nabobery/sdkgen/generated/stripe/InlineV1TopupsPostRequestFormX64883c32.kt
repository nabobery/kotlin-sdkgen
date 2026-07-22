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
 * sdkgen://source/openapi.json#/paths/~1v1~1topups~1{topup}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1topups~1{topup}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema
 */
@Serializable(with = InlineV1TopupsPostRequestFormX64883c32.Serializer::class)
public class InlineV1TopupsPostRequestFormX64883c32(
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public val description: String? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1TopupsPostRequestFormMetadataX4992b674? = null,
) {
    public class Builder {
        /**
         * An arbitrary string attached to the object. Often useful for displaying to users.
         */
        public var description: String? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1TopupsPostRequestFormMetadataX4992b674? = null

        public fun build(): InlineV1TopupsPostRequestFormX64883c32 =
            InlineV1TopupsPostRequestFormX64883c32(
                description = description,
                expand = expand,
                metadata = metadata,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TopupsPostRequestFormX64883c32 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TopupsPostRequestFormX64883c32> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TopupsPostRequestFormX64883c32 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TopupsPostRequestFormX64883c32")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InlineV1TopupsPostRequestFormX64883c32 must be a JSON object")
            return InlineV1TopupsPostRequestFormX64883c32(
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1TopupsPostRequestFormMetadataX4992b674>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TopupsPostRequestFormX64883c32,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1TopupsPostRequestFormX64883c32")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.description?.let { put("description", it) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TopupsPostRequestFormX64883c32(
    block: InlineV1TopupsPostRequestFormX64883c32.Builder.() -> Unit,
): InlineV1TopupsPostRequestFormX64883c32 = InlineV1TopupsPostRequestFormX64883c32.build(block)
