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
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_balance_summary/get/parameters/3/schema/properties/applicab
 * ility_scope.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_balance_summary/get/parameters/3/schema/properties/applicab
 * ility_scope
 */
@Serializable(with = InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030.Serializer::class)
public class InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030(
    public val priceType: InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePriceTypeXef0327a7? = null,
    public val prices: List<InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePricesItemX5c8efca1>? = null,
) {
    public class Builder {
        public var priceType:
            InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePriceTypeXef0327a7? = null

        public var prices:
            List<InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePricesItemX5c8efca1>? =
            null

        public fun build(): InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030 =
            InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030(
                priceType = priceType,
                prices = prices,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030 must be a JSON object",
                    )
            return InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030(
                priceType =
                    rawObject["price_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePriceTypeXef0327a7>(
                                it,
                            )
                    },
                prices =
                    rawObject["prices"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1BillingCreditBalan4d63GetParameterApplicabilityScopePricesItemX5c8efca1>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.priceType?.let { put("price_type", json.encodeToJsonElement(it)) }
                    value.prices?.let { put("prices", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030(
    block: InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030.Builder.() -> Unit,
): InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030 =
    InlineV1BillingCreditBalanceSummaryGetParameterApplicabilityScopeXb4505030.build(block)
