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
 * List of subscription items, each with an attached price.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/items
 */
@Serializable(with = InlineSubscriptionItemsX9b172b6f.Serializer::class)
public class InlineSubscriptionItemsX9b172b6f(
    `data`: List<SubscriptionItem>,
    /**
     * True if this list has another page of items after this one that can be fetched.
     */
    public val hasMore: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
     */
    public val objectValue: InlineSubscriptionItemsObjectValueXccea23cf,
    /**
     * The URL where this list can be accessed.
     */
    public val url: String,
) {
    /**
     * Details about each object.
     */
    public val `data`: List<SubscriptionItem> = data.toList()

    public class Builder {
        private var dataValue: List<SubscriptionItem>? = null

        public var `data`: List<SubscriptionItem>
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

        private var objectValueValue: InlineSubscriptionItemsObjectValueXccea23cf? = null

        public var objectValue: InlineSubscriptionItemsObjectValueXccea23cf
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

        public fun build(): InlineSubscriptionItemsX9b172b6f {
            check(dataValue != null) { "data is required" }
            check(hasMoreValue != null) { "hasMore is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(urlValue != null) { "url is required" }
            return InlineSubscriptionItemsX9b172b6f(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineSubscriptionItemsX9b172b6f = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineSubscriptionItemsX9b172b6f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionItemsX9b172b6f {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionItemsX9b172b6f")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InlineSubscriptionItemsX9b172b6f must be a JSON object")
            val data = json.decodeRequired<List<SubscriptionItem>>(rawObject, "data")
            val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
            val objectValue = json.decodeRequired<InlineSubscriptionItemsObjectValueXccea23cf>(rawObject, "object")
            val url = json.decodeRequired<String>(rawObject, "url")
            return InlineSubscriptionItemsX9b172b6f(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionItemsX9b172b6f,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineSubscriptionItemsX9b172b6f")
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

public fun inlineSubscriptionItemsX9b172b6f(
    block: InlineSubscriptionItemsX9b172b6f.Builder.() -> Unit,
): InlineSubscriptionItemsX9b172b6f = InlineSubscriptionItemsX9b172b6f.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineSubscriptionItemsX9b172b6f is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
