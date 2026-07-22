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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources~1{id}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/owner.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1sources~1{id}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/owner
 */
@Serializable(with = InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8.Serializer::class)
public class InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8(
    public val address: InlineV1CustomersSourcesPostRequestFormOwnerAddressXcc4f7fc8? = null,
    public val email: String? = null,
    public val name: String? = null,
    public val phone: String? = null,
) {
    public class Builder {
        public var address: InlineV1CustomersSourcesPostRequestFormOwnerAddressXcc4f7fc8? = null

        public var email: String? = null

        public var name: String? = null

        public var phone: String? = null

        public fun build(): InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8 =
            InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8(
                address = address,
                email = email,
                name = name,
                phone = phone,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8 must be a JSON object",
                    )
            return InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8(
                address =
                    rawObject["address"]?.let {
                        json.decodeFromJsonElement<InlineV1CustomersSourcesPostRequestFormOwnerAddressXcc4f7fc8>(it)
                    },
                email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
                name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
                phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.address?.let { put("address", json.encodeToJsonElement(it)) }
                    value.email?.let { put("email", it) }
                    value.name?.let { put("name", it) }
                    value.phone?.let { put("phone", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8(
    block: InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8.Builder.() -> Unit,
): InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8 =
    InlineV1CustomersSourcesPostRequestFormOwnerX0cd7fbf8.build(block)
