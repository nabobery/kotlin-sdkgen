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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/billing_mode/properties/flexible.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/billing_mode/properties/flexible
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06.Serializer::class)
public class InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06(
    public val prorationDiscounts: InlineV1QuotesPostRequestFormSubscriptionDataProrationDiscountsX701c6851? = null,
) {
    public class Builder {
        public var prorationDiscounts:
            InlineV1QuotesPostRequestFormSubscriptionDataProrationDiscountsX701c6851? = null

        public fun build(): InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06 =
            InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06(
                prorationDiscounts = prorationDiscounts,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06 must be a JSON object",
                    )
            return InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06(
                prorationDiscounts =
                    rawObject["proration_discounts"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataProrationDiscountsX701c6851>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.prorationDiscounts?.let { put("proration_discounts", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06(
    block: InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06.Builder.() -> Unit,
): InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06 =
    InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06.build(block)
