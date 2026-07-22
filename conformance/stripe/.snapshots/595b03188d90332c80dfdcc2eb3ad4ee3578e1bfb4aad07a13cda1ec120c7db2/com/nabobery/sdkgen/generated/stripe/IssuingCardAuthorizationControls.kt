package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_authorization_controls
 */
@Serializable(with = IssuingCardAuthorizationControls.Serializer::class)
public class IssuingCardAuthorizationControls(
    /**
     * Array of card presence statuses from which authorizations will be allowed. Possible options are `present`,
     * `not_present`. All other statuses will be blocked. Cannot be set with `blocked_card_presences`. Provide an empty
     * value to unset this control.
     */
    public val allowedCardPresences:
        List<InlineIssuingCardAuthorizationControlsAllowedCardPresencesItemXf5ad0622>? = null,
    /**
     * Array of strings containing
     * [categories](https://docs.stripe.com/api#issuing_authorization_object-merchant_data-category) of authorizations to
     * allow. All other categories will be blocked. Cannot be set with `blocked_categories`.
     */
    public val allowedCategories: List<InlineIssuingCardAuthorizationControlsAllowedCategoriesItemXed8ab301>? = null,
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
        List<InlineIssuingCardAuthorizationControlsBlockedCardPresencesItemXc2827cc1>? = null,
    /**
     * Array of strings containing
     * [categories](https://docs.stripe.com/api#issuing_authorization_object-merchant_data-category) of authorizations to
     * decline. All other categories will be allowed. Cannot be set with `allowed_categories`.
     */
    public val blockedCategories: List<InlineIssuingCardAuthorizationControlsBlockedCategoriesItemXfba51e9b>? = null,
    /**
     * Array of strings containing representing countries from which authorizations will be declined. Country codes should
     * be ISO 3166 alpha-2 country codes (e.g. `US`). Cannot be set with `allowed_merchant_countries`. Provide an empty
     * value to unset this control.
     */
    public val blockedMerchantCountries: List<String>? = null,
    /**
     * Limit spending with amount-based rules that apply across any cards this card replaced (i.e., its `replacement_for`
     * card and _that_ card's `replacement_for` card, up the chain).
     */
    public val spendingLimits: List<IssuingCardSpendingLimit>? = null,
    /**
     * Currency of the amounts within `spending_limits`. Always the same as the currency of the card.
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
            List<InlineIssuingCardAuthorizationControlsAllowedCardPresencesItemXf5ad0622>? = null

        /**
         * Array of strings containing
         * [categories](https://docs.stripe.com/api#issuing_authorization_object-merchant_data-category) of authorizations
         * to allow. All other categories will be blocked. Cannot be set with `blocked_categories`.
         */
        public var allowedCategories:
            List<InlineIssuingCardAuthorizationControlsAllowedCategoriesItemXed8ab301>? = null

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
            List<InlineIssuingCardAuthorizationControlsBlockedCardPresencesItemXc2827cc1>? = null

        /**
         * Array of strings containing
         * [categories](https://docs.stripe.com/api#issuing_authorization_object-merchant_data-category) of authorizations
         * to decline. All other categories will be allowed. Cannot be set with `allowed_categories`.
         */
        public var blockedCategories:
            List<InlineIssuingCardAuthorizationControlsBlockedCategoriesItemXfba51e9b>? = null

        /**
         * Array of strings containing representing countries from which authorizations will be declined. Country codes
         * should be ISO 3166 alpha-2 country codes (e.g. `US`). Cannot be set with `allowed_merchant_countries`. Provide an
         * empty value to unset this control.
         */
        public var blockedMerchantCountries: List<String>? = null

        /**
         * Limit spending with amount-based rules that apply across any cards this card replaced (i.e., its
         * `replacement_for` card and _that_ card's `replacement_for` card, up the chain).
         */
        public var spendingLimits: List<IssuingCardSpendingLimit>? = null

        /**
         * Currency of the amounts within `spending_limits`. Always the same as the currency of the card.
         */
        public var spendingLimitsCurrency: String? = null

        public fun build(): IssuingCardAuthorizationControls =
            IssuingCardAuthorizationControls(
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
        public fun build(block: Builder.() -> Unit): IssuingCardAuthorizationControls = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingCardAuthorizationControls> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingCardAuthorizationControls {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingCardAuthorizationControls")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingCardAuthorizationControls must be a JSON object")
            return IssuingCardAuthorizationControls(
                allowedCardPresences =
                    rawObject["allowed_card_presences"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<List<InlineIssuingCardAuthorizationControlsAllowedCardPresencesItemXf5ad0622>?>(
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
                                .decodeFromJsonElement<List<InlineIssuingCardAuthorizationControlsAllowedCategoriesItemXed8ab301>?>(
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
                                .decodeFromJsonElement<List<InlineIssuingCardAuthorizationControlsBlockedCardPresencesItemXc2827cc1>?>(
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
                                .decodeFromJsonElement<List<InlineIssuingCardAuthorizationControlsBlockedCategoriesItemXfba51e9b>?>(
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
                            json.decodeFromJsonElement<List<IssuingCardSpendingLimit>?>(element)
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
            `value`: IssuingCardAuthorizationControls,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingCardAuthorizationControls")
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

public fun issuingCardAuthorizationControls(
    block: IssuingCardAuthorizationControls.Builder.() -> Unit,
): IssuingCardAuthorizationControls = IssuingCardAuthorizationControls.build(block)
