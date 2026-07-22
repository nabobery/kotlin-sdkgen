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
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/bank_account/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/bank_account/anyOf/0
 */
@Serializable(with = InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4.Serializer::class)
public class InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4(
    public val accountNumber: String,
    public val country: String,
    public val accountHolderName: String? = null,
    public val accountHolderType: InlineV1AccountsExternalAcd662PostRequestFormAccountHolderTypeX9e679f8e? = null,
    public val accountType: InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078? = null,
    public val currency: String? = null,
    public val documents: InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0? = null,
    public val objectValue: InlineV1AccountsExternalAcd662PostRequestFormBankAccountObjectValueX37d1545b? = null,
    public val routingNumber: String? = null,
) {
    public class Builder {
        private var accountNumberValue: String? = null

        public var accountNumber: String
            get() = requireNotNull(accountNumberValue) { "accountNumber is required" }
            set(`value`) {
                accountNumberValue = value
            }

        private var countryValue: String? = null

        public var country: String
            get() = requireNotNull(countryValue) { "country is required" }
            set(`value`) {
                countryValue = value
            }

        public var accountHolderName: String? = null

        public var accountHolderType:
            InlineV1AccountsExternalAcd662PostRequestFormAccountHolderTypeX9e679f8e? = null

        public var accountType:
            InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078? = null

        public var currency: String? = null

        public var documents:
            InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0? = null

        public var objectValue:
            InlineV1AccountsExternalAcd662PostRequestFormBankAccountObjectValueX37d1545b? = null

        public var routingNumber: String? = null

        public fun build(): InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4 {
            check(accountNumberValue != null) { "accountNumber is required" }
            check(countryValue != null) { "country is required" }
            return InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4(
                accountNumber = accountNumber,
                country = country,
                accountHolderName = accountHolderName,
                accountHolderType = accountHolderType,
                accountType = accountType,
                currency = currency,
                documents = documents,
                objectValue = objectValue,
                routingNumber = routingNumber,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4 must be a JSON object",
                    )
            val accountNumber = json.decodeRequired<String>(rawObject, "account_number")
            val country = json.decodeRequired<String>(rawObject, "country")
            return InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4(
                accountNumber = accountNumber,
                country = country,
                accountHolderName = rawObject["account_holder_name"]?.let { json.decodeFromJsonElement<String>(it) },
                accountHolderType =
                    rawObject["account_holder_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsExternalAcd662PostRequestFormAccountHolderTypeX9e679f8e>(
                                it,
                            )
                    },
                accountType =
                    rawObject["account_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078>(
                                it,
                            )
                    },
                currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
                documents =
                    rawObject["documents"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsExternalAcd662PostRequestFormBankAccountAnyOf1DocumentsX83c94ab0>(
                                it,
                            )
                    },
                objectValue =
                    rawObject["object"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsExternalAcd662PostRequestFormBankAccountObjectValueX37d1545b>(
                                it,
                            )
                    },
                routingNumber = rawObject["routing_number"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("account_number", value.accountNumber)
                    put("country", value.country)
                    value.accountHolderName?.let { put("account_holder_name", it) }
                    value.accountHolderType?.let { put("account_holder_type", json.encodeToJsonElement(it)) }
                    value.accountType?.let { put("account_type", json.encodeToJsonElement(it)) }
                    value.currency?.let { put("currency", it) }
                    value.documents?.let { put("documents", json.encodeToJsonElement(it)) }
                    value.objectValue?.let { put("object", json.encodeToJsonElement(it)) }
                    value.routingNumber?.let { put("routing_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4(
    block: InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4.Builder.() -> Unit,
): InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4 =
    InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
