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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fuel.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fuel
 */
@Serializable(with = InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e.Serializer::class)
public class InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e(
    public val industryProductCode: String? = null,
    public val quantityDecimal: String? = null,
    public val type: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelTypeXff1c7c81? = null,
    public val unit: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051? = null,
    public val unitCostDecimal: String? = null,
) {
    public class Builder {
        public var industryProductCode: String? = null

        public var quantityDecimal: String? = null

        public var type: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelTypeXff1c7c81? =
            null

        public var unit: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051? =
            null

        public var unitCostDecimal: String? = null

        public fun build(): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e =
            InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e(
                industryProductCode = industryProductCode,
                quantityDecimal = quantityDecimal,
                type = type,
                unit = unit,
                unitCostDecimal = unitCostDecimal,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e must be a JSON object",
                    )
            return InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e(
                industryProductCode =
                    rawObject["industry_product_code"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
                    },
                quantityDecimal = rawObject["quantity_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
                type =
                    rawObject["type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelTypeXff1c7c81>(
                                it,
                            )
                    },
                unit =
                    rawObject["unit"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelUnitXab436051>(
                                it,
                            )
                    },
                unitCostDecimal =
                    rawObject["unit_cost_decimal"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.industryProductCode?.let { put("industry_product_code", it) }
                    value.quantityDecimal?.let { put("quantity_decimal", it) }
                    value.type?.let { put("type", json.encodeToJsonElement(it)) }
                    value.unit?.let { put("unit", json.encodeToJsonElement(it)) }
                    value.unitCostDecimal?.let { put("unit_cost_decimal", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e(
    block: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e.Builder.() -> Unit,
): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e =
    InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e.build(block)
