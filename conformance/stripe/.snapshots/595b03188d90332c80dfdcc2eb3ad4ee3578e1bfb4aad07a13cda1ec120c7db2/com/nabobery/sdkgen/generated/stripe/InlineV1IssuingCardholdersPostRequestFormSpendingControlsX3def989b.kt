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

/**
 * Rules that control spending across this cardholder's cards. Refer to our
 * [documentation](https://docs.stripe.com/issuing/controls/spending-controls) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/spending_controls
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b(
    public val allowedCardPresences: List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX8e25ccfe>? = null,
    public val allowedCategories: List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX81a84066>? = null,
    public val allowedMerchantCountries: List<String>? = null,
    public val blockedCardPresences: List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX03b4a47e>? = null,
    public val blockedCategories: List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX7468233d>? = null,
    public val blockedMerchantCountries: List<String>? = null,
    public val spendingLimits: List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f>? = null,
    public val spendingLimitsCurrency: String? = null,
) {
    public class Builder {
        public var allowedCardPresences:
            List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX8e25ccfe>? = null

        public var allowedCategories:
            List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX81a84066>? = null

        public var allowedMerchantCountries: List<String>? = null

        public var blockedCardPresences:
            List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX03b4a47e>? = null

        public var blockedCategories:
            List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX7468233d>? = null

        public var blockedMerchantCountries: List<String>? = null

        public var spendingLimits:
            List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f>? = null

        public var spendingLimitsCurrency: String? = null

        public fun build(): InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b =
            InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b(
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
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b must be a JSON object",
                    )
            return InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b(
                allowedCardPresences =
                    rawObject["allowed_card_presences"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX8e25ccfe>>(
                                it,
                            )
                    },
                allowedCategories =
                    rawObject["allowed_categories"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX81a84066>>(
                                it,
                            )
                    },
                allowedMerchantCountries =
                    rawObject["allowed_merchant_countries"]?.let {
                        json.decodeFromJsonElement<List<String>>(it)
                    },
                blockedCardPresences =
                    rawObject["blocked_card_presences"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX03b4a47e>>(
                                it,
                            )
                    },
                blockedCategories =
                    rawObject["blocked_categories"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX7468233d>>(
                                it,
                            )
                    },
                blockedMerchantCountries =
                    rawObject["blocked_merchant_countries"]?.let {
                        json.decodeFromJsonElement<List<String>>(it)
                    },
                spendingLimits =
                    rawObject["spending_limits"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX2b591b3f>>(
                                it,
                            )
                    },
                spendingLimitsCurrency =
                    rawObject["spending_limits_currency"]?.let {
                        json
                            .decodeFromJsonElement<String>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b",
                )
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

public fun inlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b(
    block: InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b.Builder.() -> Unit,
): InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b =
    InlineV1IssuingCardholdersPostRequestFormSpendingControlsX3def989b.build(block)
