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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema
 */
@Serializable(with = InlineV1AccountsBankAccountsPostRequestFormX8a64f5af.Serializer::class)
public class InlineV1AccountsBankAccountsPostRequestFormX8a64f5af(
    /**
     * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
     * user's bank account details.
     */
    public val bankAccount: InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f? = null,
    /**
     * When set to true, or if this is the first external account added in this currency, this account becomes the default
     * external account for its currency.
     */
    public val defaultForCurrency: Boolean? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * A token, like the ones returned by [Stripe.js](https://docs.stripe.com/js) or a dictionary containing a user's
     * external account details (with the options shown below). Please refer to full
     * [documentation](https://stripe.com/docs/api/external_accounts) instead.
     */
    public val externalAccount: String? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: Map<String, String>? = null,
) {
    public class Builder {
        /**
         * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
         * user's bank account details.
         */
        public var bankAccount: InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f? = null

        /**
         * When set to true, or if this is the first external account added in this currency, this account becomes the
         * default external account for its currency.
         */
        public var defaultForCurrency: Boolean? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * A token, like the ones returned by [Stripe.js](https://docs.stripe.com/js) or a dictionary containing a user's
         * external account details (with the options shown below). Please refer to full
         * [documentation](https://stripe.com/docs/api/external_accounts) instead.
         */
        public var externalAccount: String? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: Map<String, String>? = null

        public fun build(): InlineV1AccountsBankAccountsPostRequestFormX8a64f5af =
            InlineV1AccountsBankAccountsPostRequestFormX8a64f5af(
                bankAccount = bankAccount,
                defaultForCurrency = defaultForCurrency,
                expand = expand,
                externalAccount = externalAccount,
                metadata = metadata,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsBankAccountsPostRequestFormX8a64f5af =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsBankAccountsPostRequestFormX8a64f5af> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsBankAccountsPostRequestFormX8a64f5af {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsBankAccountsPostRequestFormX8a64f5af")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsBankAccountsPostRequestFormX8a64f5af must be a JSON object",
                    )
            return InlineV1AccountsBankAccountsPostRequestFormX8a64f5af(
                bankAccount =
                    rawObject["bank_account"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsBankAccountsPostRequestFormBankAccountX6b45297f>(it)
                    },
                defaultForCurrency =
                    rawObject["default_for_currency"]?.let {
                        json.decodeFromJsonElement<Boolean>(
                            it,
                        )
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                externalAccount = rawObject["external_account"]?.let { json.decodeFromJsonElement<String>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsBankAccountsPostRequestFormX8a64f5af,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsBankAccountsPostRequestFormX8a64f5af")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.bankAccount?.let { put("bank_account", json.encodeToJsonElement(it)) }
                    value.defaultForCurrency?.let { put("default_for_currency", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.externalAccount?.let { put("external_account", it) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsBankAccountsPostRequestFormX8a64f5af(
    block: InlineV1AccountsBankAccountsPostRequestFormX8a64f5af.Builder.() -> Unit,
): InlineV1AccountsBankAccountsPostRequestFormX8a64f5af =
    InlineV1AccountsBankAccountsPostRequestFormX8a64f5af.build(block)
