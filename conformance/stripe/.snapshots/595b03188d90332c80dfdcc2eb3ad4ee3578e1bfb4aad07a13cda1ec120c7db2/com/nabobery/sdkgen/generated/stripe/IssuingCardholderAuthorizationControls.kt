package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

@Serializable
public data class IssuingCardholderAuthorizationControlsView(
    @SerialName("allowed_card_presences")
    public val allowedCardPresences:
        List<InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62>? = null,
    @SerialName("allowed_categories")
    public val allowedCategories:
        List<InlineIssuingCardholderAuthorizationControlsAllowedCategoriesItemX2029800d>? = null,
    @SerialName("allowed_merchant_countries")
    public val allowedMerchantCountries: List<String>? = null,
    @SerialName("blocked_card_presences")
    public val blockedCardPresences:
        List<InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929>? = null,
    @SerialName("blocked_categories")
    public val blockedCategories:
        List<InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466>? = null,
    @SerialName("blocked_merchant_countries")
    public val blockedMerchantCountries: List<String>? = null,
    @SerialName("spending_limits")
    public val spendingLimits: List<IssuingCardholderSpendingLimit>? = null,
    @SerialName("spending_limits_currency")
    public val spendingLimitsCurrency: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_authorization_controls
 */
@Serializable(with = IssuingCardholderAuthorizationControls.Serializer::class)
public class IssuingCardholderAuthorizationControls(
    /**
     * Array of card presence statuses from which authorizations will be allowed. Possible options are `present`,
     * `not_present`. All other statuses will be blocked. Cannot be set with `blocked_card_presences`. Provide an empty
     * value to unset this control.
     */
    public val allowedCardPresences:
        List<InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62>? = null,
    /**
     * Array of strings containing
     * [categories](https://docs.stripe.com/api#issuing_authorization_object-merchant_data-category) of authorizations to
     * allow. All other categories will be blocked. Cannot be set with `blocked_categories`.
     */
    public val allowedCategories:
        List<InlineIssuingCardholderAuthorizationControlsAllowedCategoriesItemX2029800d>? = null,
    /**
     * Array of strings containing representing countries from which authorizations will be allowed. Authorizations from
     * merchants in all other countries will be declined. Country codes should be ISO 3166 alpha-2 country codes (e.g.
     * `US`). Cannot be set with `blocked_merchant_countries`. Provide an empty value to unset this control.
     */
    public val allowedMerchantCountries: List<String>? = null,
    /**
     * Array of card presence statuses from which authorizations will be declined. Possible options are `present`,
     * `not_present`. Cannot be set with `allowed_card_presences`. Provide an empty value to unset this control.
     */
    public val blockedCardPresences:
        List<InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929>? = null,
    /**
     * Array of strings containing
     * [categories](https://docs.stripe.com/api#issuing_authorization_object-merchant_data-category) of authorizations to
     * decline. All other categories will be allowed. Cannot be set with `allowed_categories`.
     */
    public val blockedCategories:
        List<InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466>? = null,
    /**
     * Array of strings containing representing countries from which authorizations will be declined. Country codes should
     * be ISO 3166 alpha-2 country codes (e.g. `US`). Cannot be set with `allowed_merchant_countries`. Provide an empty
     * value to unset this control.
     */
    public val blockedMerchantCountries: List<String>? = null,
    /**
     * Limit spending with amount-based rules that apply across this cardholder's cards.
     */
    public val spendingLimits: List<IssuingCardholderSpendingLimit>? = null,
    /**
     * Currency of the amounts within `spending_limits`.
     */
    public val spendingLimitsCurrency: String? = null,
) {
    public class Builder {
        /**
         * Array of card presence statuses from which authorizations will be allowed. Possible options are `present`,
         * `not_present`. All other statuses will be blocked. Cannot be set with `blocked_card_presences`. Provide an empty
         * value to unset this control.
         */
        public var allowedCardPresences:
            List<InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62>? = null

        /**
         * Array of strings containing
         * [categories](https://docs.stripe.com/api#issuing_authorization_object-merchant_data-category) of authorizations
         * to allow. All other categories will be blocked. Cannot be set with `blocked_categories`.
         */
        public var allowedCategories:
            List<InlineIssuingCardholderAuthorizationControlsAllowedCategoriesItemX2029800d>? = null

        /**
         * Array of strings containing representing countries from which authorizations will be allowed. Authorizations from
         * merchants in all other countries will be declined. Country codes should be ISO 3166 alpha-2 country codes (e.g.
         * `US`). Cannot be set with `blocked_merchant_countries`. Provide an empty value to unset this control.
         */
        public var allowedMerchantCountries: List<String>? = null

        /**
         * Array of card presence statuses from which authorizations will be declined. Possible options are `present`,
         * `not_present`. Cannot be set with `allowed_card_presences`. Provide an empty value to unset this control.
         */
        public var blockedCardPresences:
            List<InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929>? = null

        /**
         * Array of strings containing
         * [categories](https://docs.stripe.com/api#issuing_authorization_object-merchant_data-category) of authorizations
         * to decline. All other categories will be allowed. Cannot be set with `allowed_categories`.
         */
        public var blockedCategories:
            List<InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466>? = null

        /**
         * Array of strings containing representing countries from which authorizations will be declined. Country codes
         * should be ISO 3166 alpha-2 country codes (e.g. `US`). Cannot be set with `allowed_merchant_countries`. Provide an
         * empty value to unset this control.
         */
        public var blockedMerchantCountries: List<String>? = null

        /**
         * Limit spending with amount-based rules that apply across this cardholder's cards.
         */
        public var spendingLimits: List<IssuingCardholderSpendingLimit>? = null

        /**
         * Currency of the amounts within `spending_limits`.
         */
        public var spendingLimitsCurrency: String? = null

        public fun build(): IssuingCardholderAuthorizationControls =
            IssuingCardholderAuthorizationControls(
                allowedCardPresences = allowedCardPresences,
                allowedCategories = allowedCategories,
                allowedMerchantCountries = allowedMerchantCountries,
                blockedCardPresences = blockedCardPresences,
                blockedCategories = blockedCategories,
                blockedMerchantCountries = blockedMerchantCountries,
                spendingLimits = spendingLimits,
                spendingLimitsCurrency = spendingLimitsCurrency,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingCardholderAuthorizationControls =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingCardholderAuthorizationControls> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingCardholderAuthorizationControls {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingCardholderAuthorizationControls")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingCardholderAuthorizationControls must be a JSON object")
            return IssuingCardholderAuthorizationControls(
                allowedCardPresences =
                    rawObject["allowed_card_presences"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<List<InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62>?>(
                                    element,
                                )
                        }
                    },
                allowedCategories =
                    rawObject["allowed_categories"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<List<InlineIssuingCardholderAuthorizationControlsAllowedCategoriesItemX2029800d>?>(
                                    element,
                                )
                        }
                    },
                allowedMerchantCountries =
                    rawObject["allowed_merchant_countries"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<String>?>(element)
                        }
                    },
                blockedCardPresences =
                    rawObject["blocked_card_presences"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<List<InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929>?>(
                                    element,
                                )
                        }
                    },
                blockedCategories =
                    rawObject["blocked_categories"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<List<InlineIssuingCardholderAuthorizationControlsBlockedCategoriesItemX90c50466>?>(
                                    element,
                                )
                        }
                    },
                blockedMerchantCountries =
                    rawObject["blocked_merchant_countries"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<String>?>(element)
                        }
                    },
                spendingLimits =
                    rawObject["spending_limits"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<IssuingCardholderSpendingLimit>?>(element)
                        }
                    },
                spendingLimitsCurrency =
                    rawObject["spending_limits_currency"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingCardholderAuthorizationControls,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingCardholderAuthorizationControls")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.allowedCardPresences?.let { put("allowed_card_presences", json.encodeToJsonElement(it)) }
                    value.allowedCategories?.let { put("allowed_categories", json.encodeToJsonElement(it)) }
                    value.allowedMerchantCountries?.let {
                        put(
                            "allowed_merchant_countries",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.blockedCardPresences?.let { put("blocked_card_presences", json.encodeToJsonElement(it)) }
                    value.blockedCategories?.let { put("blocked_categories", json.encodeToJsonElement(it)) }
                    value.blockedMerchantCountries?.let {
                        put(
                            "blocked_merchant_countries",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.spendingLimits?.let { put("spending_limits", json.encodeToJsonElement(it)) }
                    value.spendingLimitsCurrency?.let { put("spending_limits_currency", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingCardholderAuthorizationControls(
    block: IssuingCardholderAuthorizationControls.Builder.() -> Unit,
): IssuingCardholderAuthorizationControls = IssuingCardholderAuthorizationControls.build(block)
