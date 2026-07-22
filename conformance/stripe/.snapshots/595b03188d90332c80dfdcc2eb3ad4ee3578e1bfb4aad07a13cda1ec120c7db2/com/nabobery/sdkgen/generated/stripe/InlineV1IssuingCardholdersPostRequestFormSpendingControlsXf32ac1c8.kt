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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/spending_controls
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8(
    public val allowedCardPresences: List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemXf3080f34>? = null,
    public val allowedCategories: List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX891b1138>? = null,
    public val allowedMerchantCountries: List<String>? = null,
    public val blockedCardPresences: List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX6da81281>? = null,
    public val blockedCategories: List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX90e65dea>? = null,
    public val blockedMerchantCountries: List<String>? = null,
    public val spendingLimits: List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemXb1ef49d2>? = null,
    public val spendingLimitsCurrency: String? = null,
) {
    public class Builder {
        public var allowedCardPresences:
            List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemXf3080f34>? = null

        public var allowedCategories:
            List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX891b1138>? = null

        public var allowedMerchantCountries: List<String>? = null

        public var blockedCardPresences:
            List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX6da81281>? = null

        public var blockedCategories:
            List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX90e65dea>? = null

        public var blockedMerchantCountries: List<String>? = null

        public var spendingLimits:
            List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemXb1ef49d2>? = null

        public var spendingLimitsCurrency: String? = null

        public fun build(): InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8 =
            InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8(
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
        ): InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8 must be a JSON object",
                    )
            return InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8(
                allowedCardPresences =
                    rawObject["allowed_card_presences"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemXf3080f34>>(
                                it,
                            )
                    },
                allowedCategories =
                    rawObject["allowed_categories"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX891b1138>>(
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
                            .decodeFromJsonElement<List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX6da81281>>(
                                it,
                            )
                    },
                blockedCategories =
                    rawObject["blocked_categories"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemX90e65dea>>(
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
                            .decodeFromJsonElement<List<InlineV1IssuingCardholdersPostRequestFormSpendingControlsItemXb1ef49d2>>(
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
            `value`: InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8",
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

public fun inlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8(
    block: InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8.Builder.() -> Unit,
): InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8 =
    InlineV1IssuingCardholdersPostRequestFormSpendingControlsXf32ac1c8.build(block)
