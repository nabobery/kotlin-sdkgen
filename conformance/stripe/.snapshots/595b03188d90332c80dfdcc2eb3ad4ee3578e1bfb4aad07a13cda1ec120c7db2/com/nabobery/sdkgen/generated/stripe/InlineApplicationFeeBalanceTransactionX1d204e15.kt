package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineApplicationFeeBalanceTransactionX1d204e15Branch {
    Branch1,
    BalanceTransaction,
}

public sealed class InlineApplicationFeeBalanceTransactionX1d204e15DecodingException(
    message: String,
) : SerializationException(message)

public class InlineApplicationFeeBalanceTransactionX1d204e15NoMatchException(
    message: String,
) : InlineApplicationFeeBalanceTransactionX1d204e15DecodingException(message)

internal data class InlineApplicationFeeBalanceTransactionX1d204e15Inspection(
    public val matchesBranch1: Boolean,
    public val matchesBalanceTransaction: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesBalanceTransaction).count { it }
}

/**
 * Balance transaction that describes the impact of this collected application fee on your account balance (not
 * including refunds).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/application_fee/properties/balance_transaction
 */
@Serializable(with = InlineApplicationFeeBalanceTransactionX1d204e15.Serializer::class)
public class InlineApplicationFeeBalanceTransactionX1d204e15 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineApplicationFeeBalanceTransactionX1d204e15Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val balanceTransaction: BalanceTransaction? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null
        }

    public val matchedBranches: Set<InlineApplicationFeeBalanceTransactionX1d204e15Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineApplicationFeeBalanceTransactionX1d204e15Branch.Branch1)
                if (inspection.matchesBalanceTransaction) {
                    add(
                        InlineApplicationFeeBalanceTransactionX1d204e15Branch.BalanceTransaction,
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
        ): InlineApplicationFeeBalanceTransactionX1d204e15 {
            val inspection = inspectInlineApplicationFeeBalanceTransactionX1d204e15(raw)
            if (inspection.matchCount == 0) {
                throw InlineApplicationFeeBalanceTransactionX1d204e15NoMatchException(
                    "InlineApplicationFeeBalanceTransactionX1d204e15 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineApplicationFeeBalanceTransactionX1d204e15(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineApplicationFeeBalanceTransactionX1d204e15> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineApplicationFeeBalanceTransactionX1d204e15 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineApplicationFeeBalanceTransactionX1d204e15")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineApplicationFeeBalanceTransactionX1d204e15,
        ) {
            encoder.requireJsonEncoder("InlineApplicationFeeBalanceTransactionX1d204e15").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineApplicationFeeBalanceTransactionX1d204e15(
    element: JsonElement,
): InlineApplicationFeeBalanceTransactionX1d204e15Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
    return InlineApplicationFeeBalanceTransactionX1d204e15Inspection(
        matchesBranch1 = matchesBranch1,
        matchesBalanceTransaction = matchesBalanceTransaction,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesBalanceTransaction) add("BalanceTransaction: value does not match BalanceTransaction")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
