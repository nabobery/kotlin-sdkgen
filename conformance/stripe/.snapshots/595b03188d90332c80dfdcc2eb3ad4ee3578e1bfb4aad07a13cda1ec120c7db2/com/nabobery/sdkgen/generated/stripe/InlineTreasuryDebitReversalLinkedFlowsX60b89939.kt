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

public enum class InlineTreasuryDebitReversalLinkedFlowsX60b89939Branch {
    TreasuryReceivedDebitsResourceDebitReversalLinkedFlows,
}

public sealed class InlineTreasuryDebitReversalLinkedFlowsX60b89939DecodingException(
    message: String,
) : SerializationException(message)

public class InlineTreasuryDebitReversalLinkedFlowsX60b89939NoMatchException(
    message: String,
) : InlineTreasuryDebitReversalLinkedFlowsX60b89939DecodingException(message)

internal data class InlineTreasuryDebitReversalLinkedFlowsX60b89939Inspection(
    public val matchesTreasuryReceivedDebitsResourceDebitReversalLinkedFlows: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesTreasuryReceivedDebitsResourceDebitReversalLinkedFlows).count { it }
}

/**
 * Other flows linked to a DebitReversal.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.debit_reversal/properties/linked_flows
 */
@Serializable(with = InlineTreasuryDebitReversalLinkedFlowsX60b89939.Serializer::class)
public class InlineTreasuryDebitReversalLinkedFlowsX60b89939 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTreasuryDebitReversalLinkedFlowsX60b89939Inspection,
) {
    public val treasuryReceivedDebitsResourceDebitReversalLinkedFlows:
        TreasuryReceivedDebitsResourceDebitReversalLinkedFlowsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTreasuryReceivedDebitsResourceDebitReversalLinkedFlows) {
                json
                    .decodeFromJsonElement<TreasuryReceivedDebitsResourceDebitReversalLinkedFlowsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineTreasuryDebitReversalLinkedFlowsX60b89939Branch>
        get() =
            buildSet {
                if (inspection.matchesTreasuryReceivedDebitsResourceDebitReversalLinkedFlows) {
                    add(
                        InlineTreasuryDebitReversalLinkedFlowsX60b89939Branch.TreasuryReceivedDebitsResourceDebitReversalLinkedFlows,
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
        ): InlineTreasuryDebitReversalLinkedFlowsX60b89939 {
            val inspection = inspectInlineTreasuryDebitReversalLinkedFlowsX60b89939(raw)
            if (inspection.matchCount == 0) {
                throw InlineTreasuryDebitReversalLinkedFlowsX60b89939NoMatchException(
                    "InlineTreasuryDebitReversalLinkedFlowsX60b89939 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTreasuryDebitReversalLinkedFlowsX60b89939(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTreasuryDebitReversalLinkedFlowsX60b89939> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTreasuryDebitReversalLinkedFlowsX60b89939 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryDebitReversalLinkedFlowsX60b89939")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryDebitReversalLinkedFlowsX60b89939,
        ) {
            encoder.requireJsonEncoder("InlineTreasuryDebitReversalLinkedFlowsX60b89939").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTreasuryDebitReversalLinkedFlowsX60b89939(
    element: JsonElement,
): InlineTreasuryDebitReversalLinkedFlowsX60b89939Inspection {
    val raw =
        element as? JsonObject ?: return InlineTreasuryDebitReversalLinkedFlowsX60b89939Inspection(
            matchesTreasuryReceivedDebitsResourceDebitReversalLinkedFlows = false,
            failures = listOf("TreasuryReceivedDebitsResourceDebitReversalLinkedFlows: expected JSON object"),
        )
    val matchesTreasuryReceivedDebitsResourceDebitReversalLinkedFlows = true
    return InlineTreasuryDebitReversalLinkedFlowsX60b89939Inspection(
        matchesTreasuryReceivedDebitsResourceDebitReversalLinkedFlows = matchesTreasuryReceivedDebitsResourceDebitReversalLinkedFlows,
        failures =
            buildList {
                if (!matchesTreasuryReceivedDebitsResourceDebitReversalLinkedFlows) {
                    add(
                        "TreasuryReceivedDebitsResourceDebitReversalLinkedFlows: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
