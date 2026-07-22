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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/get/responses/200/content/applicatio
 * n~1json/schema
 */
@Serializable(with = InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b.Serializer::class)
public class InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b(
    `data`: List<InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb>,
    /**
     * True if this list has another page of items after this one that can be fetched.
     */
    public val hasMore: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
     */
    public val objectValue: InlineV1AccountsExternalAccountsGetResponse200JsonObjectValueXcf4fbe93,
    /**
     * The URL where this list can be accessed.
     */
    public val url: String,
) {
    /**
     * The list contains all external accounts that have been attached to the Stripe account. These may be bank accounts
     * or cards.
     */
    public val `data`: List<InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb> =
        data.toList()

    public class Builder {
        private var dataValue:
            List<InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb>? = null

        public var `data`: List<InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb>
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

        private var objectValueValue:
            InlineV1AccountsExternalAccountsGetResponse200JsonObjectValueXcf4fbe93? = null

        public var objectValue: InlineV1AccountsExternalAccountsGetResponse200JsonObjectValueXcf4fbe93
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

        public fun build(): InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b {
            check(dataValue != null) { "data is required" }
            check(hasMoreValue != null) { "hasMore is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(urlValue != null) { "url is required" }
            return InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b must be a JSON object",
                    )
            val data =
                json.decodeRequired<List<InlineV1AccountsExternalAccountsGetResponse200JsonDataItemX40ebe1cb>>(
                    rawObject,
                    "data",
                )
            val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
            val objectValue =
                json.decodeRequired<InlineV1AccountsExternalAccountsGetResponse200JsonObjectValueXcf4fbe93>(
                    rawObject,
                    "object",
                )
            val url = json.decodeRequired<String>(rawObject, "url")
            return InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b(
                data = data,
                hasMore = hasMore,
                objectValue = objectValue,
                url = url,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b")
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

public fun inlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b(
    block: InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b.Builder.() -> Unit,
): InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b =
    InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
