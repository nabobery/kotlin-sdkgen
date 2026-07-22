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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet
 */
@Serializable(with = InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667.Serializer::class)
public class InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667(
    public val cardholderPromptData: InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b? = null,
    public val purchaseType: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseTypeX2d300548? = null,
    public val reportedBreakdown: InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77? = null,
    public val serviceType: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee? = null,
) {
    public class Builder {
        public var cardholderPromptData:
            InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b? = null

        public var purchaseType: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseTypeX2d300548? =
            null

        public var reportedBreakdown:
            InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77? = null

        public var serviceType:
            InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee? = null

        public fun build(): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667 =
            InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667(
                cardholderPromptData = cardholderPromptData,
                purchaseType = purchaseType,
                reportedBreakdown = reportedBreakdown,
                serviceType = serviceType,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667 must be a JSON object",
                    )
            return InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667(
                cardholderPromptData =
                    rawObject["cardholder_prompt_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b>(
                                it,
                            )
                    },
                purchaseType =
                    rawObject["purchase_type"]?.let {
                        json.decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseTypeX2d300548>(
                            it,
                        )
                    },
                reportedBreakdown =
                    rawObject["reported_breakdown"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormReportedBreakdownX398fff77>(
                                it,
                            )
                    },
                serviceType =
                    rawObject["service_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsServiceTypeX65ce70ee>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.cardholderPromptData?.let { put("cardholder_prompt_data", json.encodeToJsonElement(it)) }
                    value.purchaseType?.let { put("purchase_type", json.encodeToJsonElement(it)) }
                    value.reportedBreakdown?.let { put("reported_breakdown", json.encodeToJsonElement(it)) }
                    value.serviceType?.let { put("service_type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667(
    block: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667.Builder.() -> Unit,
): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667 =
    InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667.build(block)
