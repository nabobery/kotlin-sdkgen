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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_meter_resource_aggregation_settings
 */
@Serializable(with = BillingMeterResourceAggregationSettings.Serializer::class)
public class BillingMeterResourceAggregationSettings(
    /**
     * Specifies how events are aggregated.
     */
    public val formula: InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6,
) {
    public class Builder {
        private var formulaValue: InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6? = null

        public var formula: InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6
            get() = requireNotNull(formulaValue) { "formula is required" }
            set(`value`) {
                formulaValue = value
            }

        public fun build(): BillingMeterResourceAggregationSettings {
            check(formulaValue != null) { "formula is required" }
            return BillingMeterResourceAggregationSettings(
                formula = formula,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingMeterResourceAggregationSettings =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingMeterResourceAggregationSettings> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingMeterResourceAggregationSettings {
            val jsonDecoder = decoder.requireJsonDecoder("BillingMeterResourceAggregationSettings")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BillingMeterResourceAggregationSettings must be a JSON object")
            val formula =
                json.decodeRequired<InlineBillingMeterResourceAggregationSettingsFormulaX28d0a7c6>(
                    rawObject,
                    "formula",
                )
            return BillingMeterResourceAggregationSettings(
                formula = formula,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingMeterResourceAggregationSettings,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingMeterResourceAggregationSettings")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("formula", json.encodeToJsonElement(value.formula))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingMeterResourceAggregationSettings(
    block: BillingMeterResourceAggregationSettings.Builder.() -> Unit,
): BillingMeterResourceAggregationSettings = BillingMeterResourceAggregationSettings.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "BillingMeterResourceAggregationSettings is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
