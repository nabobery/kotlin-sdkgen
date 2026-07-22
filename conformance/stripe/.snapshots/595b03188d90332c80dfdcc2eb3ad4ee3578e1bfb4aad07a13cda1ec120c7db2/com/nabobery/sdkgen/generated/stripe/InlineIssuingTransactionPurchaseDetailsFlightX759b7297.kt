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

public enum class InlineIssuingTransactionPurchaseDetailsFlightX759b7297Branch {
    IssuingTransactionFlightData,
}

public sealed class InlineIssuingTransactionPurchaseDetailsFlightX759b7297DecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingTransactionPurchaseDetailsFlightX759b7297NoMatchException(
    message: String,
) : InlineIssuingTransactionPurchaseDetailsFlightX759b7297DecodingException(message)

internal data class InlineIssuingTransactionPurchaseDetailsFlightX759b7297Inspection(
    public val matchesIssuingTransactionFlightData: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesIssuingTransactionFlightData).count { it }
}

/**
 * Information about the flight that was purchased with this transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_purchase_details/properties/flight
 */
@Serializable(with = InlineIssuingTransactionPurchaseDetailsFlightX759b7297.Serializer::class)
public class InlineIssuingTransactionPurchaseDetailsFlightX759b7297 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingTransactionPurchaseDetailsFlightX759b7297Inspection,
) {
    public val issuingTransactionFlightData: IssuingTransactionFlightDataView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingTransactionFlightData) {
                json
                    .decodeFromJsonElement<IssuingTransactionFlightDataView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineIssuingTransactionPurchaseDetailsFlightX759b7297Branch>
        get() =
            buildSet {
                if (inspection.matchesIssuingTransactionFlightData) {
                    add(
                        InlineIssuingTransactionPurchaseDetailsFlightX759b7297Branch.IssuingTransactionFlightData,
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
        ): InlineIssuingTransactionPurchaseDetailsFlightX759b7297 {
            val inspection = inspectInlineIssuingTransactionPurchaseDetailsFlightX759b7297(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingTransactionPurchaseDetailsFlightX759b7297NoMatchException(
                    "InlineIssuingTransactionPurchaseDetailsFlightX759b7297 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingTransactionPurchaseDetailsFlightX759b7297(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingTransactionPurchaseDetailsFlightX759b7297> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingTransactionPurchaseDetailsFlightX759b7297 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionPurchaseDetailsFlightX759b7297")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingTransactionPurchaseDetailsFlightX759b7297,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineIssuingTransactionPurchaseDetailsFlightX759b7297",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingTransactionPurchaseDetailsFlightX759b7297(
    element: JsonElement,
): InlineIssuingTransactionPurchaseDetailsFlightX759b7297Inspection {
    val raw =
        element as? JsonObject ?: return InlineIssuingTransactionPurchaseDetailsFlightX759b7297Inspection(
            matchesIssuingTransactionFlightData = false,
            failures = listOf("IssuingTransactionFlightData: expected JSON object"),
        )
    val matchesIssuingTransactionFlightData = true
    return InlineIssuingTransactionPurchaseDetailsFlightX759b7297Inspection(
        matchesIssuingTransactionFlightData = matchesIssuingTransactionFlightData,
        failures =
            buildList {
                if (!matchesIssuingTransactionFlightData) {
                    add(
                        "IssuingTransactionFlightData: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
