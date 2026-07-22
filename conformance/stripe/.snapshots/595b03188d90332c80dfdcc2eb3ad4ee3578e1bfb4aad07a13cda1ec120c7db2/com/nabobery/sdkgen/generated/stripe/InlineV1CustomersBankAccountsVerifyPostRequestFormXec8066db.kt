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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts~1{id}~1verify/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts~1{id}~1verify/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db.Serializer::class)
public class InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db(
    /**
     * Two positive integers, in *cents*, equal to the values of the microdeposits sent to the bank account.
     */
    public val amounts: List<Int>? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
) {
    public class Builder {
        /**
         * Two positive integers, in *cents*, equal to the values of the microdeposits sent to the bank account.
         */
        public var amounts: List<Int>? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        public fun build(): InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db =
            InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db(
                amounts = amounts,
                expand = expand,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db must be a JSON object",
                    )
            return InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db(
                amounts = rawObject["amounts"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amounts?.let { put("amounts", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db(
    block: InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db.Builder.() -> Unit,
): InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db =
    InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db.build(block)
