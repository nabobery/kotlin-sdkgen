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

public enum class InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9ddBranch {
    IssuingTransactionFleetReportedBreakdown,
}

public sealed class InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9ddDecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9ddNoMatchException(
    message: String,
) : InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9ddDecodingException(message)

internal data class InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9ddInspection(
    public val matchesIssuingTransactionFleetReportedBreakdown: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesIssuingTransactionFleetReportedBreakdown).count { it }
}

/**
 * More information about the total amount. This information is not guaranteed to be accurate as some merchants may
 * provide unreliable data.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_fleet_data/properties/reported_breakdown
 */
@Serializable(with = InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd.Serializer::class)
public class InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9ddInspection,
) {
    public val issuingTransactionFleetReportedBreakdown: IssuingTransactionFleetReportedBreakdownView?
        by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingTransactionFleetReportedBreakdown) {
                json
                    .decodeFromJsonElement<IssuingTransactionFleetReportedBreakdownView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9ddBranch>
        get() =
            buildSet {
                if (inspection.matchesIssuingTransactionFleetReportedBreakdown) {
                    add(
                        InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9ddBranch.IssuingTransactionFleetReportedBreakdown,
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
        ): InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd {
            val inspection = inspectInlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9ddNoMatchException(
                    "InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd(
    element: JsonElement,
): InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9ddInspection {
    val raw =
        element as? JsonObject ?: return InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9ddInspection(
            matchesIssuingTransactionFleetReportedBreakdown = false,
            failures = listOf("IssuingTransactionFleetReportedBreakdown: expected JSON object"),
        )
    val matchesIssuingTransactionFleetReportedBreakdown = true
    return InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9ddInspection(
        matchesIssuingTransactionFleetReportedBreakdown = matchesIssuingTransactionFleetReportedBreakdown,
        failures =
            buildList {
                if (!matchesIssuingTransactionFleetReportedBreakdown) {
                    add(
                        "IssuingTransactionFleetReportedBreakdown: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
