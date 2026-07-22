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
 * The individual line items that make up the invoice. `lines` is sorted as follows: (1) pending invoice items
 * (including prorations) in reverse chronological order, (2) subscription items in reverse chronological order, and (3)
 * invoice items added after invoice creation in chronological order.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/lines
 */
@Serializable(with = InlineInvoiceLinesXd6c4ba46.Serializer::class)
public class InlineInvoiceLinesXd6c4ba46(
    `data`: List<LineItem>,
    /**
     * True if this list has another page of items after this one that can be fetched.
     */
    public val hasMore: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
     */
    public val objectValue: InlineInvoiceLinesObjectValueXeca00fb0,
    /**
     * The URL where this list can be accessed.
     */
    public val url: String,
) {
    /**
     * Details about each object.
     */
    public val `data`: List<LineItem> = data.toList()

    public class Builder {
        private var dataValue: List<LineItem>? = null

        public var `data`: List<LineItem>
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

        private var objectValueValue: InlineInvoiceLinesObjectValueXeca00fb0? = null

        public var objectValue: InlineInvoiceLinesObjectValueXeca00fb0
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

        public fun build(): InlineInvoiceLinesXd6c4ba46 {
            check(dataValue != null) { "data is required" }
            check(hasMoreValue != null) { "hasMore is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(urlValue != null) { "url is required" }
            return InlineInvoiceLinesXd6c4ba46(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineInvoiceLinesXd6c4ba46 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineInvoiceLinesXd6c4ba46> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInvoiceLinesXd6c4ba46 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceLinesXd6c4ba46")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InlineInvoiceLinesXd6c4ba46 must be a JSON object")
            val data = json.decodeRequired<List<LineItem>>(rawObject, "data")
            val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
            val objectValue = json.decodeRequired<InlineInvoiceLinesObjectValueXeca00fb0>(rawObject, "object")
            val url = json.decodeRequired<String>(rawObject, "url")
            return InlineInvoiceLinesXd6c4ba46(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoiceLinesXd6c4ba46,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineInvoiceLinesXd6c4ba46")
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

public fun inlineInvoiceLinesXd6c4ba46(
    block: InlineInvoiceLinesXd6c4ba46.Builder.() -> Unit,
): InlineInvoiceLinesXd6c4ba46 = InlineInvoiceLinesXd6c4ba46.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("InlineInvoiceLinesXd6c4ba46 is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
