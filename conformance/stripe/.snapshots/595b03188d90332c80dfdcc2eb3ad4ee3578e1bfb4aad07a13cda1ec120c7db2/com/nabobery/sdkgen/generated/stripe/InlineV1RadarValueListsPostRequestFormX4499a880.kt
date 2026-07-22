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
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1value_lists~1{value_list}/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1value_lists~1{value_list}/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema
 */
@Serializable(with = InlineV1RadarValueListsPostRequestFormX4499a880.Serializer::class)
public class InlineV1RadarValueListsPostRequestFormX4499a880(
    /**
     * The name of the value list for use in rules.
     */
    public val alias: String? = null,
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
    /**
     * The human-readable name of the value list.
     */
    public val name: String? = null,
) {
    public class Builder {
        /**
         * The name of the value list for use in rules.
         */
        public var alias: String? = null

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

        /**
         * The human-readable name of the value list.
         */
        public var name: String? = null

        public fun build(): InlineV1RadarValueListsPostRequestFormX4499a880 =
            InlineV1RadarValueListsPostRequestFormX4499a880(
                alias = alias,
                expand = expand,
                metadata = metadata,
                name = name,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1RadarValueListsPostRequestFormX4499a880 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1RadarValueListsPostRequestFormX4499a880> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1RadarValueListsPostRequestFormX4499a880 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1RadarValueListsPostRequestFormX4499a880")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1RadarValueListsPostRequestFormX4499a880 must be a JSON object",
                    )
            return InlineV1RadarValueListsPostRequestFormX4499a880(
                alias = rawObject["alias"]?.let { json.decodeFromJsonElement<String>(it) },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1RadarValueListsPostRequestFormX4499a880,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1RadarValueListsPostRequestFormX4499a880")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.alias?.let { put("alias", it) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.name?.let { put("name", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1RadarValueListsPostRequestFormX4499a880(
    block: InlineV1RadarValueListsPostRequestFormX4499a880.Builder.() -> Unit,
): InlineV1RadarValueListsPostRequestFormX4499a880 = InlineV1RadarValueListsPostRequestFormX4499a880.build(block)
