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
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources/get/responses/200/content/application~1json/
 * schema
 */
@Serializable(with = InlineV1CustomersSourcesGetResponse200JsonX5d75faf9.Serializer::class)
public class InlineV1CustomersSourcesGetResponse200JsonX5d75faf9(
    `data`: List<InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c>,
    /**
     * True if this list has another page of items after this one that can be fetched.
     */
    public val hasMore: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
     */
    public val objectValue: InlineV1CustomersSourcesGetResponse200JsonObjectValueX178c859a,
    /**
     * The URL where this list can be accessed.
     */
    public val url: String,
) {
    /**
     * Details about each object.
     */
    public val `data`: List<InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c> =
        data.toList()

    public class Builder {
        private var dataValue: List<InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c>? = null

        public var `data`: List<InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c>
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

        private var objectValueValue: InlineV1CustomersSourcesGetResponse200JsonObjectValueX178c859a? =
            null

        public var objectValue: InlineV1CustomersSourcesGetResponse200JsonObjectValueX178c859a
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

        public fun build(): InlineV1CustomersSourcesGetResponse200JsonX5d75faf9 {
            check(dataValue != null) { "data is required" }
            check(hasMoreValue != null) { "hasMore is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(urlValue != null) { "url is required" }
            return InlineV1CustomersSourcesGetResponse200JsonX5d75faf9(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CustomersSourcesGetResponse200JsonX5d75faf9 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSourcesGetResponse200JsonX5d75faf9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersSourcesGetResponse200JsonX5d75faf9 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSourcesGetResponse200JsonX5d75faf9")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSourcesGetResponse200JsonX5d75faf9 must be a JSON object",
                    )
            val data =
                json.decodeRequired<List<InlineV1CustomersSourcesGetResponse200JsonDataItemXcc70a76c>>(
                    rawObject,
                    "data",
                )
            val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
            val objectValue =
                json.decodeRequired<InlineV1CustomersSourcesGetResponse200JsonObjectValueX178c859a>(
                    rawObject,
                    "object",
                )
            val url = json.decodeRequired<String>(rawObject, "url")
            return InlineV1CustomersSourcesGetResponse200JsonX5d75faf9(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSourcesGetResponse200JsonX5d75faf9,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSourcesGetResponse200JsonX5d75faf9")
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

public fun inlineV1CustomersSourcesGetResponse200JsonX5d75faf9(
    block: InlineV1CustomersSourcesGetResponse200JsonX5d75faf9.Builder.() -> Unit,
): InlineV1CustomersSourcesGetResponse200JsonX5d75faf9 =
    InlineV1CustomersSourcesGetResponse200JsonX5d75faf9.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1CustomersSourcesGetResponse200JsonX5d75faf9 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
