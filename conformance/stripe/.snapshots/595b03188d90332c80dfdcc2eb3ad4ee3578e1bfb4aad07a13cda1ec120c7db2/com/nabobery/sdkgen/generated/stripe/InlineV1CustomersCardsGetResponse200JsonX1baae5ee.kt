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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards/get/responses/200/content/application~1json/sc
 * hema
 */
@Serializable(with = InlineV1CustomersCardsGetResponse200JsonX1baae5ee.Serializer::class)
public class InlineV1CustomersCardsGetResponse200JsonX1baae5ee(
    `data`: List<Card>,
    /**
     * True if this list has another page of items after this one that can be fetched.
     */
    public val hasMore: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
     */
    public val objectValue: InlineV1CustomersCardsGetResponse200JsonObjectValueX7b6454fa,
    /**
     * The URL where this list can be accessed.
     */
    public val url: String,
) {
    public val `data`: List<Card> = data.toList()

    public class Builder {
        private var dataValue: List<Card>? = null

        public var `data`: List<Card>
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

        private var objectValueValue: InlineV1CustomersCardsGetResponse200JsonObjectValueX7b6454fa? =
            null

        public var objectValue: InlineV1CustomersCardsGetResponse200JsonObjectValueX7b6454fa
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

        public fun build(): InlineV1CustomersCardsGetResponse200JsonX1baae5ee {
            check(dataValue != null) { "data is required" }
            check(hasMoreValue != null) { "hasMore is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(urlValue != null) { "url is required" }
            return InlineV1CustomersCardsGetResponse200JsonX1baae5ee(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CustomersCardsGetResponse200JsonX1baae5ee =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersCardsGetResponse200JsonX1baae5ee> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersCardsGetResponse200JsonX1baae5ee {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersCardsGetResponse200JsonX1baae5ee")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersCardsGetResponse200JsonX1baae5ee must be a JSON object",
                    )
            val data = json.decodeRequired<List<Card>>(rawObject, "data")
            val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
            val objectValue =
                json.decodeRequired<InlineV1CustomersCardsGetResponse200JsonObjectValueX7b6454fa>(
                    rawObject,
                    "object",
                )
            val url = json.decodeRequired<String>(rawObject, "url")
            return InlineV1CustomersCardsGetResponse200JsonX1baae5ee(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersCardsGetResponse200JsonX1baae5ee,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersCardsGetResponse200JsonX1baae5ee")
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

public fun inlineV1CustomersCardsGetResponse200JsonX1baae5ee(
    block: InlineV1CustomersCardsGetResponse200JsonX1baae5ee.Builder.() -> Unit,
): InlineV1CustomersCardsGetResponse200JsonX1baae5ee = InlineV1CustomersCardsGetResponse200JsonX1baae5ee.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1CustomersCardsGetResponse200JsonX1baae5ee is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
