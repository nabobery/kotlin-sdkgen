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

public enum class InlineBillingCreditBalanceTransactionCreditXc0e9748bBranch {
    BillingCreditGrantsResourceBalanceCredit,
}

public sealed class InlineBillingCreditBalanceTransactionCreditXc0e9748bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineBillingCreditBalanceTransactionCreditXc0e9748bNoMatchException(
    message: String,
) : InlineBillingCreditBalanceTransactionCreditXc0e9748bDecodingException(message)

internal data class InlineBillingCreditBalanceTransactionCreditXc0e9748bInspection(
    public val matchesBillingCreditGrantsResourceBalanceCredit: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBillingCreditGrantsResourceBalanceCredit).count { it }
}

/**
 * Credit details for this credit balance transaction. Only present if type is `credit`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_balance_transaction/properties/credit
 */
@Serializable(with = InlineBillingCreditBalanceTransactionCreditXc0e9748b.Serializer::class)
public class InlineBillingCreditBalanceTransactionCreditXc0e9748b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineBillingCreditBalanceTransactionCreditXc0e9748bInspection,
) {
    public val billingCreditGrantsResourceBalanceCredit: BillingCreditGrantsResourceBalanceCreditView?
        by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBillingCreditGrantsResourceBalanceCredit) {
                json
                    .decodeFromJsonElement<BillingCreditGrantsResourceBalanceCreditView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineBillingCreditBalanceTransactionCreditXc0e9748bBranch>
        get() =
            buildSet {
                if (inspection.matchesBillingCreditGrantsResourceBalanceCredit) {
                    add(
                        InlineBillingCreditBalanceTransactionCreditXc0e9748bBranch.BillingCreditGrantsResourceBalanceCredit,
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
        ): InlineBillingCreditBalanceTransactionCreditXc0e9748b {
            val inspection = inspectInlineBillingCreditBalanceTransactionCreditXc0e9748b(raw)
            if (inspection.matchCount == 0) {
                throw InlineBillingCreditBalanceTransactionCreditXc0e9748bNoMatchException(
                    "InlineBillingCreditBalanceTransactionCreditXc0e9748b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineBillingCreditBalanceTransactionCreditXc0e9748b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineBillingCreditBalanceTransactionCreditXc0e9748b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineBillingCreditBalanceTransactionCreditXc0e9748b {
            val jsonDecoder = decoder.requireJsonDecoder("InlineBillingCreditBalanceTransactionCreditXc0e9748b")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingCreditBalanceTransactionCreditXc0e9748b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineBillingCreditBalanceTransactionCreditXc0e9748b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineBillingCreditBalanceTransactionCreditXc0e9748b(
    element: JsonElement,
): InlineBillingCreditBalanceTransactionCreditXc0e9748bInspection {
    val raw =
        element as? JsonObject ?: return InlineBillingCreditBalanceTransactionCreditXc0e9748bInspection(
            matchesBillingCreditGrantsResourceBalanceCredit = false,
            failures = listOf("BillingCreditGrantsResourceBalanceCredit: expected JSON object"),
        )
    val matchesBillingCreditGrantsResourceBalanceCredit = raw["amount"] != null && raw["type"] != null
    return InlineBillingCreditBalanceTransactionCreditXc0e9748bInspection(
        matchesBillingCreditGrantsResourceBalanceCredit = matchesBillingCreditGrantsResourceBalanceCredit,
        failures =
            buildList {
                if (!matchesBillingCreditGrantsResourceBalanceCredit) {
                    add(
                        "BillingCreditGrantsResourceBalanceCredit: required properties 'amount', 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
