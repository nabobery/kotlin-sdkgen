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

public enum class InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614Branch {
    IssuingTransactionFleetFuelPriceData,
}

public sealed class InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614DecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614NoMatchException(
    message: String,
) : InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614DecodingException(message)

internal data class InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614Inspection(
    public val matchesIssuingTransactionFleetFuelPriceData: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesIssuingTransactionFleetFuelPriceData).count { it }
}

/**
 * Breakdown of fuel portion of the purchase.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_fleet_reported_breakdown/properties/fuel
 */
@Serializable(with = InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614.Serializer::class)
public class InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614Inspection,
) {
    public val issuingTransactionFleetFuelPriceData: IssuingTransactionFleetFuelPriceDataView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingTransactionFleetFuelPriceData) {
                json
                    .decodeFromJsonElement<IssuingTransactionFleetFuelPriceDataView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614Branch>
        get() =
            buildSet {
                if (inspection.matchesIssuingTransactionFleetFuelPriceData) {
                    add(
                        InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614Branch.IssuingTransactionFleetFuelPriceData,
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
        ): InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614 {
            val inspection = inspectInlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614NoMatchException(
                    "InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614(
    element: JsonElement,
): InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614Inspection {
    val raw =
        element as? JsonObject ?: return InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614Inspection(
            matchesIssuingTransactionFleetFuelPriceData = false,
            failures = listOf("IssuingTransactionFleetFuelPriceData: expected JSON object"),
        )
    val matchesIssuingTransactionFleetFuelPriceData = true
    return InlineIssuingTransactionFleetReportedBreakdownFuelXa1eac614Inspection(
        matchesIssuingTransactionFleetFuelPriceData = matchesIssuingTransactionFleetFuelPriceData,
        failures =
            buildList {
                if (!matchesIssuingTransactionFleetFuelPriceData) {
                    add(
                        "IssuingTransactionFleetFuelPriceData: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
