package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1prices/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineV1PricesGetResponse200JsonX04f7a5eb.Serializer::class)
public class InlineV1PricesGetResponse200JsonX04f7a5eb(
    `data`: List<Price>,
    /**
     * True if this list has another page of items after this one that can be fetched.
     */
    public val hasMore: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
     */
    public val objectValue: InlineV1PricesGetResponse200JsonObjectValueXb3e7e89f,
    /**
     * The URL where this list can be accessed.
     */
    public val url: String,
) {
    /**
     * Details about each object.
     */
    public val `data`: List<Price> = data.toList()

    public class Builder {
        private var dataValue: List<Price>? = null

        public var `data`: List<Price>
            get() = requireNotNull(dataValue) { "data is required" }
            set(`value`) {
                dataValue = value
            }

        private var hasMoreValue: Boolean? = null

        public var hasMore: Boolean
            get() = requireNotNull(hasMoreValue) { "hasMore is required" }
            set(`value`) {
                hasMoreValue = value
            }

        private var objectValueValue: InlineV1PricesGetResponse200JsonObjectValueXb3e7e89f? = null

        public var objectValue: InlineV1PricesGetResponse200JsonObjectValueXb3e7e89f
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var urlValue: String? = null

        public var url: String
            get() = requireNotNull(urlValue) { "url is required" }
            set(`value`) {
                urlValue = value
            }

        public fun build(): InlineV1PricesGetResponse200JsonX04f7a5eb {
            check(dataValue != null) { "data is required" }
            check(hasMoreValue != null) { "hasMore is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(urlValue != null) { "url is required" }
            return InlineV1PricesGetResponse200JsonX04f7a5eb(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PricesGetResponse200JsonX04f7a5eb =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PricesGetResponse200JsonX04f7a5eb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PricesGetResponse200JsonX04f7a5eb {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesGetResponse200JsonX04f7a5eb")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InlineV1PricesGetResponse200JsonX04f7a5eb must be a JSON object")
            val data = json.decodeRequired<List<Price>>(rawObject, "data")
            val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
            val objectValue =
                json.decodeRequired<InlineV1PricesGetResponse200JsonObjectValueXb3e7e89f>(
                    rawObject,
                    "object",
                )
            val url = json.decodeRequired<String>(rawObject, "url")
            return InlineV1PricesGetResponse200JsonX04f7a5eb(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PricesGetResponse200JsonX04f7a5eb,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PricesGetResponse200JsonX04f7a5eb")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("data", json.encodeToJsonElement(value.data))
                    put("has_more", json.encodeToJsonElement(value.hasMore))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("url", value.url)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PricesGetResponse200JsonX04f7a5eb(
    block: InlineV1PricesGetResponse200JsonX04f7a5eb.Builder.() -> Unit,
): InlineV1PricesGetResponse200JsonX04f7a5eb = InlineV1PricesGetResponse200JsonX04f7a5eb.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PricesGetResponse200JsonX04f7a5eb is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
