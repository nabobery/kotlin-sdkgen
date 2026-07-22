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
 * A list of refunds that have been applied to the charge.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/refunds
 */
@Serializable(with = InlineChargeRefundsX8d7dd526.Serializer::class)
public class InlineChargeRefundsX8d7dd526(
    `data`: List<Refund>,
    /**
     * True if this list has another page of items after this one that can be fetched.
     */
    public val hasMore: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
     */
    public val objectValue: InlineChargeRefundsObjectValueX81dde311,
    /**
     * The URL where this list can be accessed.
     */
    public val url: String,
) {
    /**
     * Details about each object.
     */
    public val `data`: List<Refund> = data.toList()

    public class Builder {
        private var dataValue: List<Refund>? = null

        public var `data`: List<Refund>
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

        private var objectValueValue: InlineChargeRefundsObjectValueX81dde311? = null

        public var objectValue: InlineChargeRefundsObjectValueX81dde311
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

        public fun build(): InlineChargeRefundsX8d7dd526 {
            check(dataValue != null) { "data is required" }
            check(hasMoreValue != null) { "hasMore is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(urlValue != null) { "url is required" }
            return InlineChargeRefundsX8d7dd526(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineChargeRefundsX8d7dd526 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineChargeRefundsX8d7dd526> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineChargeRefundsX8d7dd526 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineChargeRefundsX8d7dd526")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InlineChargeRefundsX8d7dd526 must be a JSON object")
            val data = json.decodeRequired<List<Refund>>(rawObject, "data")
            val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
            val objectValue = json.decodeRequired<InlineChargeRefundsObjectValueX81dde311>(rawObject, "object")
            val url = json.decodeRequired<String>(rawObject, "url")
            return InlineChargeRefundsX8d7dd526(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineChargeRefundsX8d7dd526,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineChargeRefundsX8d7dd526")
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

public fun inlineChargeRefundsX8d7dd526(
    block: InlineChargeRefundsX8d7dd526.Builder.() -> Unit,
): InlineChargeRefundsX8d7dd526 = InlineChargeRefundsX8d7dd526.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("InlineChargeRefundsX8d7dd526 is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
