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
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49.Serializer::class)
public class InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49(
    supportedCurrencies: List<String>,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Encodes whether a FinancialAccount has access to a particular feature. Stripe or the platform can control features
     * via the requested field.
     */
    public val features: InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * The nickname for the FinancialAccount.
     */
    public val nickname: InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f? = null,
    /**
     * The set of functionalities that the platform can restrict on the FinancialAccount.
     */
    public val platformRestrictions:
        InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad? = null,
) {
    /**
     * The currencies the FinancialAccount can hold a balance in.
     */
    public val supportedCurrencies: List<String> = supportedCurrencies.toList()

    public class Builder {
        private var supportedCurrenciesValue: List<String>? = null

        public var supportedCurrencies: List<String>
            get() = requireNotNull(supportedCurrenciesValue) { "supportedCurrencies is required" }
            set(`value`) {
                supportedCurrenciesValue = value
            }

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Encodes whether a FinancialAccount has access to a particular feature. Stripe or the platform can control
         * features via the requested field.
         */
        public var features: InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: Map<String, String>? = null

        /**
         * The nickname for the FinancialAccount.
         */
        public var nickname: InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f? = null

        /**
         * The set of functionalities that the platform can restrict on the FinancialAccount.
         */
        public var platformRestrictions:
            InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad? = null

        public fun build(): InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49 {
            check(supportedCurrenciesValue != null) { "supportedCurrencies is required" }
            return InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49(
                supportedCurrencies = supportedCurrencies,
                expand = expand,
                features = features,
                metadata = metadata,
                nickname = nickname,
                platformRestrictions = platformRestrictions,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49 must be a JSON object",
                    )
            val supportedCurrencies = json.decodeRequired<List<String>>(rawObject, "supported_currencies")
            return InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49(
                supportedCurrencies = supportedCurrencies,
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                features =
                    rawObject["features"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef>(
                            it,
                        )
                    },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                nickname =
                    rawObject["nickname"]?.let {
                        json.decodeFromJsonElement<InlineV1TreasuryFinancialAccountsPostRequestFormNicknameX39fe439f>(
                            it,
                        )
                    },
                platformRestrictions =
                    rawObject["platform_restrictions"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TreasuryFinancialAccountsPostRequestFormPlatformRestrictionsX4dcbd1ad>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("supported_currencies", json.encodeToJsonElement(value.supportedCurrencies))
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.features?.let { put("features", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.nickname?.let { put("nickname", json.encodeToJsonElement(it)) }
                    value.platformRestrictions?.let { put("platform_restrictions", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49(
    block: InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49.Builder.() -> Unit,
): InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49 =
    InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TreasuryFinancialAccountsPostRequestFormX1f246a49 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
