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
 * Documents that may be submitted to satisfy various informational requests.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts~1{id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/documents
 */
@Serializable(with = InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37.Serializer::class)
public class InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37(
    public val bankAccountOwnershipVerification:
        InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095? = null,
) {
    public class Builder {
        public var bankAccountOwnershipVerification:
            InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095? = null

        public fun build(): InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37 =
            InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37(
                bankAccountOwnershipVerification = bankAccountOwnershipVerification,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37 must be a JSON object",
                    )
            return InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37(
                bankAccountOwnershipVerification =
                    rawObject["bank_account_ownership_verification"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsBankAccountsPostRequestFormBankAccountOwnership2a7eXa836c095>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37",
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

public fun inlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37(
    block: InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37.Builder.() -> Unit,
): InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37 =
    InlineV1AccountsBankAccountsPostRequestFormDocumentsX39fc0d37.build(block)
