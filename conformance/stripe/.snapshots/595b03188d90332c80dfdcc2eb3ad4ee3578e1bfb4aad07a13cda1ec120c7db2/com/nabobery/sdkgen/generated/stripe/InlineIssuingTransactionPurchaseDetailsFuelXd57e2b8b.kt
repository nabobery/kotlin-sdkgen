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

public enum class InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8bBranch {
    IssuingTransactionFuelData,
}

public sealed class InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8bNoMatchException(
    message: String,
) : InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8bDecodingException(message)

internal data class InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8bInspection(
    public val matchesIssuingTransactionFuelData: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesIssuingTransactionFuelData).count { it }
}

/**
 * Information about fuel that was purchased with this transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_purchase_details/properties/fuel
 */
@Serializable(with = InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b.Serializer::class)
public class InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8bInspection,
) {
    public val issuingTransactionFuelData: IssuingTransactionFuelDataView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingTransactionFuelData) {
                json.decodeFromJsonElement<IssuingTransactionFuelDataView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8bBranch>
        get() =
            buildSet {
                if (inspection.matchesIssuingTransactionFuelData) {
                    add(
                        InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8bBranch.IssuingTransactionFuelData,
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
        ): InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b {
            val inspection = inspectInlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8bNoMatchException(
                    "InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingTransactionPurchaseDetailsFuelXd57e2b8b(
    element: JsonElement,
): InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8bInspection {
    val raw =
        element as? JsonObject ?: return InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8bInspection(
            matchesIssuingTransactionFuelData = false,
            failures = listOf("IssuingTransactionFuelData: expected JSON object"),
        )
    val matchesIssuingTransactionFuelData =
        raw["type"].isString() && raw["unit"].isString() && raw["unit_cost_decimal"].isString()
    return InlineIssuingTransactionPurchaseDetailsFuelXd57e2b8bInspection(
        matchesIssuingTransactionFuelData = matchesIssuingTransactionFuelData,
        failures =
            buildList {
                if (!matchesIssuingTransactionFuelData) {
                    add(
                        "IssuingTransactionFuelData: required properties 'type', 'unit', 'unit_cost_decimal' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
