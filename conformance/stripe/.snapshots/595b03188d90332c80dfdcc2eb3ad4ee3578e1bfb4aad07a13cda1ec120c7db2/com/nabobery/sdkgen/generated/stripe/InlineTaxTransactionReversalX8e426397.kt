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

public enum class InlineTaxTransactionReversalX8e426397Branch {
    TaxProductResourceTaxTransactionResourceReversal,
}

public sealed class InlineTaxTransactionReversalX8e426397DecodingException(
    message: String,
) : SerializationException(message)

public class InlineTaxTransactionReversalX8e426397NoMatchException(
    message: String,
) : InlineTaxTransactionReversalX8e426397DecodingException(message)

internal data class InlineTaxTransactionReversalX8e426397Inspection(
    public val matchesTaxProductResourceTaxTransactionResourceReversal: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesTaxProductResourceTaxTransactionResourceReversal).count { it }
}

/**
 * If `type=reversal`, contains information about what was reversed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.transaction/properties/reversal
 */
@Serializable(with = InlineTaxTransactionReversalX8e426397.Serializer::class)
public class InlineTaxTransactionReversalX8e426397 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTaxTransactionReversalX8e426397Inspection,
) {
    public val taxProductResourceTaxTransactionResourceReversal:
        TaxProductResourceTaxTransactionResourceReversalView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTaxProductResourceTaxTransactionResourceReversal) {
                json
                    .decodeFromJsonElement<TaxProductResourceTaxTransactionResourceReversalView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineTaxTransactionReversalX8e426397Branch>
        get() =
            buildSet {
                if (inspection.matchesTaxProductResourceTaxTransactionResourceReversal) {
                    add(
                        InlineTaxTransactionReversalX8e426397Branch.TaxProductResourceTaxTransactionResourceReversal,
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
        ): InlineTaxTransactionReversalX8e426397 {
            val inspection = inspectInlineTaxTransactionReversalX8e426397(raw)
            if (inspection.matchCount == 0) {
                throw InlineTaxTransactionReversalX8e426397NoMatchException(
                    "InlineTaxTransactionReversalX8e426397 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTaxTransactionReversalX8e426397(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTaxTransactionReversalX8e426397> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTaxTransactionReversalX8e426397 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTaxTransactionReversalX8e426397")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxTransactionReversalX8e426397,
        ) {
            encoder.requireJsonEncoder("InlineTaxTransactionReversalX8e426397").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTaxTransactionReversalX8e426397(
    element: JsonElement,
): InlineTaxTransactionReversalX8e426397Inspection {
    val raw =
        element as? JsonObject ?: return InlineTaxTransactionReversalX8e426397Inspection(
            matchesTaxProductResourceTaxTransactionResourceReversal = false,
            failures = listOf("TaxProductResourceTaxTransactionResourceReversal: expected JSON object"),
        )
    val matchesTaxProductResourceTaxTransactionResourceReversal = true
    return InlineTaxTransactionReversalX8e426397Inspection(
        matchesTaxProductResourceTaxTransactionResourceReversal = matchesTaxProductResourceTaxTransactionResourceReversal,
        failures =
            buildList {
                if (!matchesTaxProductResourceTaxTransactionResourceReversal) {
                    add(
                        "TaxProductResourceTaxTransactionResourceReversal: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
