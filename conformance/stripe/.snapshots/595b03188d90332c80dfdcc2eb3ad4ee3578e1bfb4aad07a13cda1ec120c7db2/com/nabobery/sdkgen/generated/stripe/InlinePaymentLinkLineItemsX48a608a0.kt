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
 * The line items representing what is being sold.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/line_items
 */
@Serializable(with = InlinePaymentLinkLineItemsX48a608a0.Serializer::class)
public class InlinePaymentLinkLineItemsX48a608a0(
    `data`: List<Item>,
    /**
     * True if this list has another page of items after this one that can be fetched.
     */
    public val hasMore: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
     */
    public val objectValue: InlinePaymentLinkLineItemsObjectValueX4a8f34e6,
    /**
     * The URL where this list can be accessed.
     */
    public val url: String,
) {
    /**
     * Details about each object.
     */
    public val `data`: List<Item> = data.toList()

    public class Builder {
        private var dataValue: List<Item>? = null

        public var `data`: List<Item>
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

        private var objectValueValue: InlinePaymentLinkLineItemsObjectValueX4a8f34e6? = null

        public var objectValue: InlinePaymentLinkLineItemsObjectValueX4a8f34e6
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

        public fun build(): InlinePaymentLinkLineItemsX48a608a0 {
            check(dataValue != null) { "data is required" }
            check(hasMoreValue != null) { "hasMore is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(urlValue != null) { "url is required" }
            return InlinePaymentLinkLineItemsX48a608a0(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlinePaymentLinkLineItemsX48a608a0 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlinePaymentLinkLineItemsX48a608a0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentLinkLineItemsX48a608a0 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinkLineItemsX48a608a0")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InlinePaymentLinkLineItemsX48a608a0 must be a JSON object")
            val data = json.decodeRequired<List<Item>>(rawObject, "data")
            val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
            val objectValue = json.decodeRequired<InlinePaymentLinkLineItemsObjectValueX4a8f34e6>(rawObject, "object")
            val url = json.decodeRequired<String>(rawObject, "url")
            return InlinePaymentLinkLineItemsX48a608a0(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentLinkLineItemsX48a608a0,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlinePaymentLinkLineItemsX48a608a0")
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

public fun inlinePaymentLinkLineItemsX48a608a0(
    block: InlinePaymentLinkLineItemsX48a608a0.Builder.() -> Unit,
): InlinePaymentLinkLineItemsX48a608a0 = InlinePaymentLinkLineItemsX48a608a0.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlinePaymentLinkLineItemsX48a608a0 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
