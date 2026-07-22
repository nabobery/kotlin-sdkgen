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
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0.Serializer::class)
public class InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0(
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Encodes whether a FinancialAccount has access to a particular feature, with a status enum and associated
     * `status_details`. Stripe or the platform may control features via the requested field.
     */
    public val features: InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763? = null,
    /**
     * A different bank account where funds can be deposited/debited in order to get the closing FA's balance to $0
     */
    public val forwardingSettings: InlineV1TreasuryFinancialAccountsPostRequestFormForwardingSettingsX7c5f67f7? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * The nickname for the FinancialAccount.
     */
    public val nickname: InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77? = null,
    /**
     * The set of functionalities that the platform can restrict on the FinancialAccount.
     */
    public val platformRestrictions:
        InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c? = null,
) {
    public class Builder {
        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Encodes whether a FinancialAccount has access to a particular feature, with a status enum and associated
         * `status_details`. Stripe or the platform may control features via the requested field.
         */
        public var features: InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763? = null

        /**
         * A different bank account where funds can be deposited/debited in order to get the closing FA's balance to $0
         */
        public var forwardingSettings:
            InlineV1TreasuryFinancialAccountsPostRequestFormForwardingSettingsX7c5f67f7? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: Map<String, String>? = null

        /**
         * The nickname for the FinancialAccount.
         */
        public var nickname: InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77? = null

        /**
         * The set of functionalities that the platform can restrict on the FinancialAccount.
         */
        public var platformRestrictions:
            InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c? = null

        public fun build(): InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0 =
            InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0(
                expand = expand,
                features = features,
                forwardingSettings = forwardingSettings,
                metadata = metadata,
                nickname = nickname,
                platformRestrictions = platformRestrictions,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0 must be a JSON object",
                    )
            return InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0(
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                features =
                    rawObject["features"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763>(
                            it,
                        )
                    },
                forwardingSettings =
                    rawObject["forwarding_settings"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TreasuryFinancialAccountsPostRequestFormForwardingSettingsX7c5f67f7>(
                                it,
                            )
                    },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                nickname =
                    rawObject["nickname"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX3dbdbd77>(
                            it,
                        )
                    },
                platformRestrictions =
                    rawObject["platform_restrictions"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsXcaf2eb7c>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.features?.let { put("features", json.encodeToJsonElement(it)) }
                    value.forwardingSettings?.let { put("forwarding_settings", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.nickname?.let { put("nickname", json.encodeToJsonElement(it)) }
                    value.platformRestrictions?.let { put("platform_restrictions", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0(
    block: InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0.Builder.() -> Unit,
): InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0 =
    InlineV1TreasuryFinancialAccountsPostRequestFormXf7d5ffd0.build(block)
