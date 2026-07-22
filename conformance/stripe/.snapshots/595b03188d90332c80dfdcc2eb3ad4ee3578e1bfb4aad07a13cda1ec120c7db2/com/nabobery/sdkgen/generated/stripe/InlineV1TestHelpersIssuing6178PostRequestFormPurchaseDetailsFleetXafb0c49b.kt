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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet
 */
@Serializable(with = InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b.Serializer::class)
public class InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b(
    public val cardholderPromptData: InlineV1TestHelpersIssuing6178PostRequestFormCardholderPromptDataXe110be90? = null,
    public val purchaseType: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc? = null,
    public val reportedBreakdown: InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77? = null,
    public val serviceType: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a? = null,
) {
    public class Builder {
        public var cardholderPromptData:
            InlineV1TestHelpersIssuing6178PostRequestFormCardholderPromptDataXe110be90? = null

        public var purchaseType: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc? =
            null

        public var reportedBreakdown:
            InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77? = null

        public var serviceType:
            InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a? = null

        public fun build(): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b =
            InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b(
                cardholderPromptData = cardholderPromptData,
                purchaseType = purchaseType,
                reportedBreakdown = reportedBreakdown,
                serviceType = serviceType,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b must be a JSON object",
                    )
            return InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b(
                cardholderPromptData =
                    rawObject["cardholder_prompt_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormCardholderPromptDataXe110be90>(
                                it,
                            )
                    },
                purchaseType =
                    rawObject["purchase_type"]?.let {
                        json.decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseTypeXb859ccbc>(
                            it,
                        )
                    },
                reportedBreakdown =
                    rawObject["reported_breakdown"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormReportedBreakdownX45a6be77>(
                                it,
                            )
                    },
                serviceType =
                    rawObject["service_type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsServiceTypeX49f1414a>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b",
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

public fun inlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b(
    block: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b.Builder.() -> Unit,
): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b =
    InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b.build(block)
