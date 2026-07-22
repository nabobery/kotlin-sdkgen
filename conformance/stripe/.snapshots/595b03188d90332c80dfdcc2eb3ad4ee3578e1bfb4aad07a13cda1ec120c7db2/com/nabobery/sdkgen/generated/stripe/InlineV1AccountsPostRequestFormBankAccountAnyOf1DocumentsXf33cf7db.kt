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
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/bank_account/anyOf/0/properties/documents.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/bank_account/anyOf/0/properties/documents
 */
@Serializable(with = InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db.Serializer::class)
public class InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db(
    public val bankAccountOwnershipVerification:
        InlineV1AccountsPostRequestFormBankAccountBankAccountOwnership2a7eX67aabd56? = null,
) {
    public class Builder {
        public var bankAccountOwnershipVerification:
            InlineV1AccountsPostRequestFormBankAccountBankAccountOwnership2a7eX67aabd56? = null

        public fun build(): InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db =
            InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db(
                bankAccountOwnershipVerification = bankAccountOwnershipVerification,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db(
                bankAccountOwnershipVerification =
                    rawObject["bank_account_ownership_verification"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormBankAccountBankAccountOwnership2a7eX67aabd56>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.bankAccountOwnershipVerification?.let {
                        put(
                            "bank_account_ownership_verification",
                            json.encodeToJsonElement(it),
                        )
                    }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db(
    block: InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db =
    InlineV1AccountsPostRequestFormBankAccountAnyOf1DocumentsXf33cf7db.build(block)
