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
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/plan_tier
 */
@Serializable(with = PlanTier.Serializer::class)
public class PlanTier(
    /**
     * Price for the entire tier.
     */
    public val flatAmount: Int? = null,
    /**
     * Same as `flat_amount`, but contains a decimal value with at most 12 decimal places.
     */
    public val flatAmountDecimal: String? = null,
    /**
     * Per unit price for units relevant to the tier.
     */
    public val unitAmount: Int? = null,
    /**
     * Same as `unit_amount`, but contains a decimal value with at most 12 decimal places.
     */
    public val unitAmountDecimal: String? = null,
    /**
     * Up to and including to this quantity will be contained in the tier.
     */
    public val upTo: Int? = null,
) {
    public class Builder {
        /**
         * Price for the entire tier.
         */
        public var flatAmount: Int? = null

        /**
         * Same as `flat_amount`, but contains a decimal value with at most 12 decimal places.
         */
        public var flatAmountDecimal: String? = null

        /**
         * Per unit price for units relevant to the tier.
         */
        public var unitAmount: Int? = null

        /**
         * Same as `unit_amount`, but contains a decimal value with at most 12 decimal places.
         */
        public var unitAmountDecimal: String? = null

        /**
         * Up to and including to this quantity will be contained in the tier.
         */
        public var upTo: Int? = null

        public fun build(): PlanTier =
            PlanTier(
                flatAmount = flatAmount,
                flatAmountDecimal = flatAmountDecimal,
                unitAmount = unitAmount,
                unitAmountDecimal = unitAmountDecimal,
                upTo = upTo,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PlanTier = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PlanTier> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PlanTier {
            val jsonDecoder = decoder.requireJsonDecoder("PlanTier")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PlanTier must be a JSON object")
            return PlanTier(
                flatAmount =
                    rawObject["flat_amount"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                flatAmountDecimal =
                    rawObject["flat_amount_decimal"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                unitAmount =
                    rawObject["unit_amount"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                unitAmountDecimal =
                    rawObject["unit_amount_decimal"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                upTo =
                    rawObject["up_to"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PlanTier,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PlanTier")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.flatAmount?.let { put("flat_amount", json.encodeToJsonElement(it)) }
                    value.flatAmountDecimal?.let { put("flat_amount_decimal", it) }
                    value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
                    value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
                    value.upTo?.let { put("up_to", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun planTier(block: PlanTier.Builder.() -> Unit): PlanTier = PlanTier.build(block)
