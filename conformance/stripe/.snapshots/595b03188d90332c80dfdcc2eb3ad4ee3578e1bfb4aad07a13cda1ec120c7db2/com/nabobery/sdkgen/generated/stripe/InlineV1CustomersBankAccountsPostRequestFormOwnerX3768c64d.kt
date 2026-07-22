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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts~1{id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/owner.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts~1{id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/owner
 */
@Serializable(with = InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d.Serializer::class)
public class InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d(
    public val address: InlineV1CustomersBankAccountsPostRequestFormOwnerAddressXabd159b3? = null,
    public val email: String? = null,
    public val name: String? = null,
    public val phone: String? = null,
) {
    public class Builder {
        public var address: InlineV1CustomersBankAccountsPostRequestFormOwnerAddressXabd159b3? = null

        public var email: String? = null

        public var name: String? = null

        public var phone: String? = null

        public fun build(): InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d =
            InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d(
                address = address,
                email = email,
                name = name,
                phone = phone,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d must be a JSON object",
                    )
            return InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d(
                address =
                    rawObject["address"]?.let {
                        json.decodeFromJsonElement<InlineV1CustomersBankAccountsPostRequestFormOwnerAddressXabd159b3>(
                            it,
                        )
                    },
                email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
                name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
                phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d")
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

public fun inlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d(
    block: InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d.Builder.() -> Unit,
): InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d =
    InlineV1CustomersBankAccountsPostRequestFormOwnerX3768c64d.build(block)
