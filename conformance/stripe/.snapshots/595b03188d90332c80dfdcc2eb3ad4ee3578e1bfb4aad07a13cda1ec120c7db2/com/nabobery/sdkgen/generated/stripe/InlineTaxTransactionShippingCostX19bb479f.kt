package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineTaxTransactionShippingCostX19bb479fBranch {
    TaxProductResourceTaxTransactionShippingCost,
}

public sealed class InlineTaxTransactionShippingCostX19bb479fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineTaxTransactionShippingCostX19bb479fNoMatchException(
    message: String,
) : InlineTaxTransactionShippingCostX19bb479fDecodingException(message)

internal data class InlineTaxTransactionShippingCostX19bb479fInspection(
    public val matchesTaxProductResourceTaxTransactionShippingCost: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesTaxProductResourceTaxTransactionShippingCost).count { it }
}

/**
 * The shipping cost details for the transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.transaction/properties/shipping_cost
 */
@Serializable(with = InlineTaxTransactionShippingCostX19bb479f.Serializer::class)
public class InlineTaxTransactionShippingCostX19bb479f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTaxTransactionShippingCostX19bb479fInspection,
) {
    public val taxProductResourceTaxTransactionShippingCost:
        TaxProductResourceTaxTransactionShippingCostView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTaxProductResourceTaxTransactionShippingCost) {
                json
                    .decodeFromJsonElement<TaxProductResourceTaxTransactionShippingCostView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineTaxTransactionShippingCostX19bb479fBranch>
        get() =
            buildSet {
                if (inspection.matchesTaxProductResourceTaxTransactionShippingCost) {
                    add(
                        InlineTaxTransactionShippingCostX19bb479fBranch.TaxProductResourceTaxTransactionShippingCost,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineTaxTransactionShippingCostX19bb479f {
            val inspection = inspectInlineTaxTransactionShippingCostX19bb479f(raw)
            if (inspection.matchCount == 0) {
                throw InlineTaxTransactionShippingCostX19bb479fNoMatchException(
                    "InlineTaxTransactionShippingCostX19bb479f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTaxTransactionShippingCostX19bb479f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTaxTransactionShippingCostX19bb479f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTaxTransactionShippingCostX19bb479f {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTaxTransactionShippingCostX19bb479f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxTransactionShippingCostX19bb479f,
        ) {
            encoder.requireJsonEncoder("InlineTaxTransactionShippingCostX19bb479f").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTaxTransactionShippingCostX19bb479f(
    element: JsonElement,
): InlineTaxTransactionShippingCostX19bb479fInspection {
    val raw =
        element as? JsonObject ?: return InlineTaxTransactionShippingCostX19bb479fInspection(
            matchesTaxProductResourceTaxTransactionShippingCost = false,
            failures = listOf("TaxProductResourceTaxTransactionShippingCost: expected JSON object"),
        )
    val matchesTaxProductResourceTaxTransactionShippingCost =
        raw["amount"] != null && raw["amount_tax"] != null && raw["tax_behavior"] != null && raw["tax_code"].isString()
    return InlineTaxTransactionShippingCostX19bb479fInspection(
        matchesTaxProductResourceTaxTransactionShippingCost = matchesTaxProductResourceTaxTransactionShippingCost,
        failures =
            buildList {
                if (!matchesTaxProductResourceTaxTransactionShippingCost) {
                    add(
                        "TaxProductResourceTaxTransactionShippingCost: required properties 'amount', 'amount_tax', 'tax_behavior', 'tax_code' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
