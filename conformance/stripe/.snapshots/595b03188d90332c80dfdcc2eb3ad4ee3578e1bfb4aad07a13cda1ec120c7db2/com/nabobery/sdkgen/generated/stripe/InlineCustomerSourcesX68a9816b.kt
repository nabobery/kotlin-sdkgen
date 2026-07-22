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
 * The customer's payment sources, if any.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/sources
 */
@Serializable(with = InlineCustomerSourcesX68a9816b.Serializer::class)
public class InlineCustomerSourcesX68a9816b(
    `data`: List<InlineCustomerSourcesDataItemXd8d0d900>,
    /**
     * True if this list has another page of items after this one that can be fetched.
     */
    public val hasMore: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
     */
    public val objectValue: InlineCustomerSourcesObjectValueX265e29dc,
    /**
     * The URL where this list can be accessed.
     */
    public val url: String,
) {
    /**
     * Details about each object.
     */
    public val `data`: List<InlineCustomerSourcesDataItemXd8d0d900> = data.toList()

    public class Builder {
        private var dataValue: List<InlineCustomerSourcesDataItemXd8d0d900>? = null

        public var `data`: List<InlineCustomerSourcesDataItemXd8d0d900>
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

        private var objectValueValue: InlineCustomerSourcesObjectValueX265e29dc? = null

        public var objectValue: InlineCustomerSourcesObjectValueX265e29dc
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

        public fun build(): InlineCustomerSourcesX68a9816b {
            check(dataValue != null) { "data is required" }
            check(hasMoreValue != null) { "hasMore is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(urlValue != null) { "url is required" }
            return InlineCustomerSourcesX68a9816b(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineCustomerSourcesX68a9816b = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineCustomerSourcesX68a9816b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineCustomerSourcesX68a9816b {
            val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerSourcesX68a9816b")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InlineCustomerSourcesX68a9816b must be a JSON object")
            val data = json.decodeRequired<List<InlineCustomerSourcesDataItemXd8d0d900>>(rawObject, "data")
            val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
            val objectValue = json.decodeRequired<InlineCustomerSourcesObjectValueX265e29dc>(rawObject, "object")
            val url = json.decodeRequired<String>(rawObject, "url")
            return InlineCustomerSourcesX68a9816b(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCustomerSourcesX68a9816b,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineCustomerSourcesX68a9816b")
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

public fun inlineCustomerSourcesX68a9816b(
    block: InlineCustomerSourcesX68a9816b.Builder.() -> Unit,
): InlineCustomerSourcesX68a9816b = InlineCustomerSourcesX68a9816b.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineCustomerSourcesX68a9816b is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
